---
title: ITextFrameFormat
second_title: Aspose.Sildes for Python via .NET API Reference
description: 
type: docs
weight: 2760
url: /python-net/aspose.slides/itextframeformat/
---

## ITextFrameFormat class

Contains the TextFrame's formatting properties.

The ITextFrameFormat type exposes the following members:
## Properties
| Name | Description |
| :- | :- |
|text_style|Returns text's style.<br/>            Read-only [ITextStyle](/slides/python-net/aspose.slides/itextstyle/).|
|margin_left|Returns or sets the left margin (points) in a TextFrame.<br/>            Read/write float.|
|margin_right|Returns or sets the right margin (points) in a TextFrame.<br/>            Read/write float.|
|margin_top|Returns or sets the top margin (points) in a TextFrame.<br/>            Read/write float.|
|margin_bottom|Returns or sets the bottom margin (points) in a TextFrame.<br/>            Read/write float.|
|wrap_text|True if text is wrapped at TextFrame's margins.<br/>            Read/write [NullableBool](/slides/python-net/aspose.slides/nullablebool/).|
|anchoring_type|Returns or sets vertical anchor text in a TextFrame.<br/>            Read/write [TextAnchorType](/slides/python-net/aspose.slides/textanchortype/).|
|center_text|If NullableBool.True then text should be centered in box horizontally.<br/>            Read/write [NullableBool](/slides/python-net/aspose.slides/nullablebool/).|
|text_vertical_type|Determines text orientation.<br/>            The resulted value of visual text rotation summarized from this property and custom angle<br/>            in property RotationAngle.<br/>            Read/write [TextVerticalType](/slides/python-net/aspose.slides/textverticaltype/).|
|autofit_type|Returns or sets text's autofit mode.<br/>            Read/write [TextAutofitType](/slides/python-net/aspose.slides/textautofittype/).|
|column_count|Returns or sets number of columns in the text area.<br/>            This value must be a positive number. Otherwise, the value will be set to zero. <br/>            Value 0 means undefined value.<br/>            Read/write|
|column_spacing|Returns or sets the space between text columns in the text area (in points). This should only apply <br/>            when there is more than 1 column present.<br/>            This value must be a positive number. Otherwise, the value will be set to zero. <br/>            Read/write float.|
|three_d_format|Returns the ThreeDFormat object that represents 3d effect properties for a text.<br/>            Read-only [IThreeDFormat](/slides/python-net/aspose.slides/ithreedformat/).|
|keep_text_flat|Returns or set keeping text out of 3D scene entirely.<br/>            Read/write bool.|
|rotation_angle|Specifies the custom rotation that is being applied to the text within the bounding box. If it not<br/>            specified, the rotation of the accompanying shape is used. If it is specified, then this is<br/>            applied independently from the shape. That is the shape can have a rotation applied in<br/>            addition to the text itself having a rotation applied to it.<br/>            The resulted value of visual text rotation summarized from this property and predefined<br/>            vertical type in property TextVerticalType.<br/>            Read/write|
|transform|Gets or sets text wrapping shape.<br/>            Read/write [TextShapeType](/slides/python-net/aspose.slides/textshapetype/).|
## Methods
| Name | Description |
| :- | :- |
|get_effective()|Gets effective text frame formatting data with the inheritance applied.|

### See Also

* namespace [aspose.slides](/slides/python-net/aspose.slides/)
* assembly [Aspose.Slides](/slides/python-net/)

