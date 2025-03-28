---
title: IHtmlGenerator
second_title: Aspose.Sildes for Python via .NET API Reference
description: 
type: docs
weight: 160
url: /python-net/aspose.slides.export/ihtmlgenerator/
---

## IHtmlGenerator class

Html generator.

The IHtmlGenerator type exposes the following members:
## Properties
| Name | Description |
| :- | :- |
|slide_image_size|Returns slide image size.<br/>            Read-only aspose.pydrawing.SizeF.|
|slide_image_size_unit|Returns a unit in which slide image size is specified.<br/>            Read-only [SvgCoordinateUnit](/slides/python-net/aspose.slides.export/svgcoordinateunit/).|
|slide_image_size_unit_code|Returns a css code of unit in which slide image size is specified.<br/>            Read-only string.|
|previous_slide_index|Returns index of previously rendered slide or -1 if first slide is rendering.<br/>            Read-only|
|slide_index|Returns index of currently rendering slide.<br/>            Read-only|
|next_slide_index|Returns index of a slide, which will be rendered after the current slide or -1 if currently rendering last slide.<br/>            Read-only|
## Methods
| Name | Description |
| :- | :- |
|add_html(html)|Adds formatted HTML text.|
|add_html(html)|Adds formatted HTML text.|
|add_html(html, start_index, length)|Adds formatted HTML text.|
|add_text(text)|Adds plain text to the html files, replacing special characters with html entities.<br/>            Linebreaks and whitespaces aren't replaced.|
|add_text(text)|Adds plain text to the html files, replacing special characters with html entities.<br/>            Linebreaks and whitespaces aren't replaced.|
|add_text(text, start_index, length)|Adds plain text to the html files, replacing special characters with html entities.<br/>            Linebreaks and whitespaces aren't replaced.|
|add_attribute_value(value)|Quotes attribute value and adds it to the html file.|
|add_attribute_value(value)|Quotes attribute value and adds it to the html file.|
|add_attribute_value(value, start_index, length)|Quotes attribute value and adds it to the html file.|

### See Also

* namespace [aspose.slides.export](/slides/python-net/aspose.slides.export/)
* assembly [Aspose.Slides](/slides/python-net/)

