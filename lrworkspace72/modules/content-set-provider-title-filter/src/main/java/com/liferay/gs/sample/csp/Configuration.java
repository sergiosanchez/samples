package com.liferay.gs.sample.csp;

import com.liferay.portal.configuration.metatype.annotations.ExtendedObjectClassDefinition;
import aQute.bnd.annotation.metatype.Meta;


@ExtendedObjectClassDefinition(
	category = "custom"
)
@Meta.OCD(
	id = "com.liferay.gs.TitleInfoListConfig",
	localization = "content/Language", name = "configuration-header"
)
public interface Configuration {

	@Meta.AD(
        deflt = "Shared", required = false,
        name="configuration-asset-title", description="configuration-asset-description"
    )
    public String assetTitle();
}
