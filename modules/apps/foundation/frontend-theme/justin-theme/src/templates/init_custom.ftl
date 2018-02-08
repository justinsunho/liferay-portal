<#--
This file allows you to override and define new FreeMarker variables.
-->
<#assign nav_css_class = "navbar navbar-expand-lg" />

<#assign sub_heading = getterUtil.getString(theme_settings["sub-heading"]) />

<#assign facebook_link = getterUtil.getString(theme_settings["facebook-link"]) />
<#assign google_plus_link = getterUtil.getString(theme_settings["google-plus-link"]) />
<#assign linkedin_link = getterUtil.getString(theme_settings["linkedin-link"]) />
<#assign twitter_link = getterUtil.getString(theme_settings["twitter-link"]) />
<#assign youtube_link = getterUtil.getString(theme_settings["youtube-link"]) />