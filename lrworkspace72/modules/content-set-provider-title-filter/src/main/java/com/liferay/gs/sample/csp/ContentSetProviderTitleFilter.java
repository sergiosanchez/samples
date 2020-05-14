package com.liferay.gs.sample.csp;

import com.liferay.asset.kernel.model.AssetEntry;
import com.liferay.info.pagination.Pagination;
import com.liferay.info.provider.InfoListProvider;
import com.liferay.info.provider.InfoListProviderContext;
import com.liferay.info.sort.Sort;

import java.util.List;
import java.util.Locale;

import org.osgi.service.component.annotations.Component;

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

	// TODO enter required service methods

}