---
title: StyleSimulations enumeration
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 330
url: /python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/stylesimulations/
is_root: false
---

## StyleSimulations enumeration

The style simulations.
Synthetic style simulations can be applied to the shape of the glyphs
by using the StyleSimulations attribute.
Style simulations can be applied in addition to the designed style of a font.
The default value for the StyleSimulations attribute is None,
in which case the shapes of glyphs are not modified from their original design.



The StyleSimulations type exposes the following members:

### Fields
| Field | Description |
| :- | :- |
| NONE | The none.<br/>The shapes of glyphs are not modified from their original design. |
| ITALIC_SIMULATION | The italic simulation.<br/>Synthetic italicizing is applied to glyphs with an IsSideways value of false<br/>by skewing the top edge of the alignment box of the character by 20° to the right,<br/>relative to the baseline of the character. |
| BOLD_SIMULATION | The bold simulation.<br/>Synthetic emboldening is applied by geometrically widening the strokes of glyphs<br/>by 1% of the EM size for each of the two boundaries of the stroke,<br/>so that the centers of strokes remain at the same position relative to the character coordinate system. |
| BOLD_ITALIC_SIMULATION | The bold italic simulation.<br/>Both BoldSimulation and ItalicSimulation are applied. |



### See Also
* module [`aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto`](..)
