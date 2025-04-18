---
title: ISlide
second_title: Aspose.Sildes for Python via .NET API Reference
description: 
type: docs
weight: 2520
url: /python-net/aspose.slides/islide/
---

## ISlide class

Represents a slide in a presentation.

The ISlide type exposes the following members:
## Properties
| Name | Description |
| :- | :- |
|header_footer_manager|Returns HeaderFooter manager of the slide.<br/>            Read-only [ISlideHeaderFooterManager](/slides/python-net/aspose.slides/islideheaderfootermanager/).|
|slide_number|Returns a number of slide.<br/>            Index of slide in [slides](/slides/python-net/aspose.slides/ipresentation/) collection is always equal to SlideNumber - 1.<br/>            Read/write|
|hidden|Determines whether the specified slide is hidden during a slide show.<br/>            Read/write bool.|
|layout_slide|Returns or sets the layout slide for the current slide.<br/>            Read/write [ILayoutSlide](/slides/python-net/aspose.slides/ilayoutslide/).|
|notes_slide_manager|Allow to access notes slide, add and remove it.<br/>            Read-only [INotesSlideManager](/slides/python-net/aspose.slides/inotesslidemanager/).|
|as_i_base_slide|Allows to get base IBaseSlide interface.<br/>            Read-only [IBaseSlide](/slides/python-net/aspose.slides/ibaseslide/).|
|as_i_override_themeable|Returns IOverrideThemeable interface.<br/>            Read-only [IOverrideThemeable](/slides/python-net/aspose.slides.theme/ioverridethemeable/).|
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
|theme_manager|Returns override theme manager.<br/>            Read-only [IOverrideThemeManager](/slides/python-net/aspose.slides.theme/ioverridethememanager/).|
## Methods
| Name | Description |
| :- | :- |
|get_thumbnail(scale_x, scale_y)|Returns a Thumbnail Bitmap object with custom scaling.|
|get_thumbnail()|Returns a Thumbnail Bitmap object with custom scaling.|
|get_thumbnail(image_size)|Returns a Thumbnail Bitmap object with specified size.|
|get_thumbnail(options)|Returns a Thumbnail tiff bitmap object with specified parameters.|
|get_thumbnail(notes_comments_layouting)|Returns a Thumbnail Bitmap object.|
|get_thumbnail(notes_comments_layouting, scale_x, scale_y)|Returns a Thumbnail Bitmap object with custom scaling.|
|get_thumbnail(options, image_size)|Returns a Thumbnail Bitmap object with specified size.|
|get_thumbnail(options)|Returns a Thumbnail Bitmap object.|
|get_thumbnail(options, scale_x, scale_y)|Returns a Thumbnail Bitmap object with custom scaling.|
|get_thumbnail(options, image_size)|Returns a Thumbnail Bitmap object with specified size.|
|render_to_graphics(notes_comments_layouting, graphics, width, height)|Renders certain slide to a Graphics object.|
|render_to_graphics(notes_comments_layouting, graphics, scale)|Renders certain slide to a Graphics object.|
|render_to_graphics(notes_comments_layouting, graphics)|Renders certain slide to a Graphics object.|
|render_to_graphics(options, graphics)|Renders certain slide to a Graphics object.|
|render_to_graphics(options, graphics, scale_x, scale_y)|Renders certain slide to a Graphics object with custom scaling.|
|render_to_graphics(options, graphics, rendering_size)|Renders certain slide to a Graphics object using specified size.|
|write_as_svg(stream)|Saves content of slide as SVG file.|
|write_as_svg(stream, svg_options)|Saves content of slide as SVG file.|
|get_slide_comments(author)|Returns all slide comments added by specific author.|
|remove()|Removes slide from presentation.|
|reset()|Resets position, size and formatting of every shape that has a prototype on LayoutSlide.|
|find_shape_by_alt_text(alt_text)|Finds first occurrence of a shape with the specified alternative text.|
|join_portions_with_same_formatting()|Joins runs with same formatting in all paragraphs in all acceptable shapes.|
|equals(slide)|Determines whether the two IBaseSlide instances are equal.<br/>            Returning value is calculated based on slide's structure and static content.<br/>            Two slides are equal if all shapes, styles, texts, animation and other settings. etc. are equal. The comparison doesn't take into account unique identifier values, e.g. SlideId and dynamic content, e.g. current date value in Date Placeholder.|
|create_theme_effective()|Returns an effective theme for this themeable object.|

### See Also

* namespace [aspose.slides](/slides/python-net/aspose.slides/)
* assembly [Aspose.Slides](/slides/python-net/)

