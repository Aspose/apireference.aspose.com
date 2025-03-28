---
title: IMasterHandoutSlide
second_title: Aspose.Sildes for Python via .NET API Reference
description: 
type: docs
weight: 1850
url: /python-net/aspose.slides/imasterhandoutslide/
---

## IMasterHandoutSlide class

Represents master slide for handouts.

The IMasterHandoutSlide type exposes the following members:
## Properties
| Name | Description |
| :- | :- |
|header_footer_manager|Returns HeaderFooter manager of the master handout slide.<br/>            Read-only [IMasterHandoutSlideHeaderFooterManager](/slides/python-net/aspose.slides/imasterhandoutslideheaderfootermanager/).|
|as_i_base_slide|Allows to get base IBaseSlide interface.<br/>            Read-only [IBaseSlide](/slides/python-net/aspose.slides/ibaseslide/).|
|as_i_master_themeable|Returns IMasterThemeable interface.<br/>            Read-only [IMasterThemeable](/slides/python-net/aspose.slides.theme/imasterthemeable/).|
|shapes|Returns the shapes of a slide.<br/>            Read-only [IShapeCollection](/slides/python-net/aspose.slides/ishapecollection/).|
|controls|Returns the collection of ActiveX controls on a slide.<br/>            Read-only [IControlCollection](/slides/python-net/aspose.slides/icontrolcollection/).|
|name|Returns or sets the name of a slide.<br/>            Read/write string.|
|slide_id|Returns the ID of a slide.<br/>            Read-only int.|
|custom_data|Returns the slide's custom data.<br/>            Read-only [ICustomData](/slides/python-net/aspose.slides/icustomdata/).|
|timeline|Returns animation timeline object.<br/>            Read-only [IAnimationTimeLine](/slides/python-net/aspose.slides/ianimationtimeline/).|
|slide_show_transition|Returns the TransitionEx object which contains information about<br/>            how the specified slide advances during a slide show.<br/>            Read-only [ISlideShowTransition](/slides/python-net/aspose.slides/islideshowtransition/).|
|background|Returns slide's background.<br/>            Read-only [IBackground](/slides/python-net/aspose.slides/ibackground/).|
|hyperlink_queries|Provides easy access to contained hyperlinks.<br/>            Read-only [IHyperlinkQueries](/slides/python-net/aspose.slides/ihyperlinkqueries/).|
|show_master_shapes|Specifies if shapes on the master slide should be shown on slides or not.<br/>            For master slide itself this property always returns|
|as_i_slide_component|Returns ISlideComponent interface.<br/>            Read-only [ISlideComponent](/slides/python-net/aspose.slides/islidecomponent/).|
|slide|Returns the base slide.<br/>            Read-only [IBaseSlide](/slides/python-net/aspose.slides/ibaseslide/).|
|as_i_presentation_component|Allows to get base IPresentationComponent interface.<br/>            Read-only [IPresentationComponent](/slides/python-net/aspose.slides/ipresentationcomponent/).|
|presentation|Returns the presentation. <br/>            Read-only [IPresentation](/slides/python-net/aspose.slides/ipresentation/).|
|theme_manager|Returns master theme manager.<br/>            Read-only [IMasterThemeManager](/slides/python-net/aspose.slides.theme/imasterthememanager/).|
## Methods
| Name | Description |
| :- | :- |
|find_shape_by_alt_text(alt_text)|Finds first occurrence of a shape with the specified alternative text.|
|join_portions_with_same_formatting()|Joins runs with same formatting in all paragraphs in all acceptable shapes.|
|equals(slide)|Determines whether the two IBaseSlide instances are equal.<br/>            Returning value is calculated based on slide's structure and static content.<br/>            Two slides are equal if all shapes, styles, texts, animation and other settings. etc. are equal. The comparison doesn't take into account unique identifier values, e.g. SlideId and dynamic content, e.g. current date value in Date Placeholder.|
|create_theme_effective()|Returns an effective theme for this themeable object.|

### See Also

* namespace [aspose.slides](/slides/python-net/aspose.slides/)
* assembly [Aspose.Slides](/slides/python-net/)

