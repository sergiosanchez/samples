package com.liferay.gs.sample.csp;

import com.liferay.asset.kernel.model.AssetEntry;
import com.liferay.asset.kernel.service.AssetEntryLocalService;
import com.liferay.asset.util.AssetHelper;
import com.liferay.info.pagination.Pagination;
import com.liferay.info.provider.InfoListProvider;
import com.liferay.info.provider.InfoListProviderContext;
import com.liferay.info.sort.Sort;
import com.liferay.journal.service.JournalArticleLocalService;
import com.liferay.portal.configuration.metatype.bnd.util.ConfigurableUtil;

import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;

/**
 * @author sergios
 */
@Component(
	configurationPid = "com.liferay.gs.TitleInfoListConfig",
	immediate = true,
	service = InfoListProvider.class
)
public class ContentSetProviderTitleFilter implements InfoListProvider<AssetEntry> {

	@Override
	public List<AssetEntry> getInfoList(InfoListProviderContext infoListProviderContext) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AssetEntry> getInfoList(InfoListProviderContext infoListProviderContext, Pagination pagination,
			Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getInfoListCount(InfoListProviderContext infoListProviderContext) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getLabel(Locale locale) {
		// TODO Auto-generated method stub
		return null;
	}

	@Reference
	AssetEntryLocalService _assetEntryLocalService;
	
	@Reference
	AssetHelper _assetHelper;
	
	@Reference
	JournalArticleLocalService _journalArticleLocalService;
	
	@Activate
	@Modified
	protected void activate(Map<String, Object> properties) {
		_configuration = ConfigurableUtil.createConfigurable(
			Configuration.class, properties);
	}
	
	private volatile Configuration _configuration;
	
	private static final String CONTENT_SET_PROVIDER_NAME_KEY = "content-set-prodider-name";

}