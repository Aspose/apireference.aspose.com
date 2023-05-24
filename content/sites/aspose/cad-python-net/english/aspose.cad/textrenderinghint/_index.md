---
title: TextRenderingHint enumeration
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 830
url: /aspose.cad/textrenderinghint/
is_root: false
---

## TextRenderingHint enumeration

Specifies the quality of text rendering.



The TextRenderingHint type exposes the following members:

### Fields
| Field | Description |
| :- | :- |
| SYSTEM_DEFAULT | Each character is drawn using its glyph bitmap, with the system default rendering hint. The text will be drawn using whatever font-smoothing settings the user has selected for the system. |
| SINGLE_BIT_PER_PIXEL_GRID_FIT | Each character is drawn using its glyph bitmap. Hinting is used to improve character appearance on stems and curvature. |
| SINGLE_BIT_PER_PIXEL | Each character is drawn using its glyph bitmap. Hinting is not used. |
| ANTI_ALIAS_GRID_FIT | Each character is drawn using its antialiased glyph bitmap with hinting. Much better quality due to antialiasing, but at a higher performance cost. |
| ANTI_ALIAS | Each character is drawn using its antialiased glyph bitmap without hinting. Better quality due to antialiasing. Stem width differences may be noticeable because hinting is turned off. |
| CLEAR_TYPE_GRID_FIT | Each character is drawn using its glyph ClearType bitmap with hinting. The highest quality setting. Used to take advantage of ClearType font features. |



### See Also
* module [`aspose.cad`](..)
