package com.liferay.gs.sample.csp;

import com.liferay.info.provider.InfoListProvider;

import org.osgi.service.component.annotations.Component;

/**
 * @author sergios
 */
@Component(
	immediate = true,
	property = {
		// TODO enter required service properties
	},
	service = InfoListProvider.class
)
public class ContentSetProviderTitleFilter implements InfoListProvider {

	// TODO enter required service methods

}