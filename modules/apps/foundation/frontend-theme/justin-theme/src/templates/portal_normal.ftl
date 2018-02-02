<!DOCTYPE html>

<#include init />

<html class="${root_css_class}" dir="<@liferay.language key="lang.dir" />" lang="${w3c_language_id}">

<head>
  <title>${the_title} - ${company_name}</title>

  <meta content="initial-scale=1.0, width=device-width" name="viewport" />

  <@liferay_util["include"] page=top_head_include />
</head>

<body class="${css_class}">

<@liferay_ui["quick-access"] contentId="#main-content" />

<@liferay_util["include"] page=body_top_include />

<@liferay.control_menu />

<div class="container-fluid" id="wrapper">
  <div id="wrapper2">
  <header id="banner" role="banner">
  <div class="container-fluid" id="rowwrapper">
    <div class="row">
      <div id="heading" class="navbar-header">

          <#if show_site_name>
              <span class="site-name" title="<@liferay.language_format arguments="${site_name}" key="go-to-x" />">
                ${site_name} 
              </span>
               <p class="hidden-xs">Test Page for Liferay Theme by Justin Kim</p>
            </#if>

        <button class="navbar-toggle collapsed align-bottom" id="btnCollapse" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span>MENU</span>
        </button>
       
      </div>

        <#if !is_signed_in>
          <a data-redirect="${is_login_redirect_required?string}" href="${sign_in_url}" id="sign-in" rel="nofollow">${sign_in_text}</a>
        </#if>

        <#if has_navigation && is_setup_complete>
          <#include "${full_templates_path}/navigation.ftl" />
        </#if>
  </div>
</div>
      </header>

      <section id="content">
    <h1 class="hide-accessible">${the_title}</h1>


    <#if selectable>
      <@liferay_util["include"] page=content_include />
    <#else>
      ${portletDisplay.recycle()}

      ${portletDisplay.setTitle(the_title)}

      <@liferay_theme["wrap-portlet"] page="portlet.ftl">
        <@liferay_util["include"] page=content_include />
      </@>
    </#if>

    <figure>
      <img src="http://placekitten.com/420/420" alt="Image alt text">
      <img src="http://placekitten.com/420/420" alt="Image alt text">
      <img src="http://placekitten.com/420/420" alt="Image alt text">
      <img src="http://placekitten.com/420/420" alt="Image alt text">

      <figcaption>Here is a caption for this image.</figcaption>
    </figure>

  <footer id="footer" role="contentinfo">
    <p class="powered-by">
      <@liferay.language key="powered-by" /> <a href="http://www.liferay.com" rel="external">Liferay</a>
    </p>
  </footer>
</div>
</div>

<@liferay_util["include"] page=body_bottom_include />

<@liferay_util["include"] page=bottom_include />

<!-- inject:js -->
<!-- endinject -->

</body>

</html>
