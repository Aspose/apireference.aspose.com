---
title: ClipStrategy enumeration
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 230
url: /python-net/aspose.svg.rendering/clipstrategy/
is_root: false
---

## ClipStrategy enumeration

Specifies the strategy for clipping an SVG element.
This enum is used to determine how to apply clipping paths or masks to SVG elements during rendering.



The ClipStrategy type exposes the following members:

### Fields
| Field | Description |
| :- | :- |
| NONE | Indicates that no clipping will be applied to the SVG element.<br/>This strategy is used when there is no clip-path or mask associated with the SVG element. |
| MASK | This strategy applies a mask for clipping.<br/>This strategy is used when the SVG element has a mask element applied to it. <br/>Instead of clipping the canvas, a mask layer is used to determine the visibility of the SVG element.<br/>A mask is an image where the alpha value of each pixel is used <br/>to determine the visibility of the corresponding pixel in the SVG element. |
| PATH | This strategy uses a path for clipping.<br/>This strategy is used when the SVG element has a clipPath element applied to it. <br/>A clipPath is a region defined by a path; anything outside of this path is clipped out. |



### See Also
* module [`aspose.svg.rendering`](..)
