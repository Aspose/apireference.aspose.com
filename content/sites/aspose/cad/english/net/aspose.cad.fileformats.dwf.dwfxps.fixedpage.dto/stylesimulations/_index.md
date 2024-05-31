---
title: Enum StyleSimulations
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.Dwf.DwfXps.FixedPage.DTO.StyleSimulations enum. The style simulations. Synthetic style simulations can be applied to the shape of the glyphs by using the StyleSimulations attribute. Style simulations can be applied in addition to the designed style of a font. The default value for the StyleSimulations attribute is None in which case the shapes of glyphs are not modified from their original design
type: docs
weight: 9550
url: /net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/stylesimulations/
---
## StyleSimulations enumeration

The style simulations. Synthetic style simulations can be applied to the shape of the glyphs by using the StyleSimulations attribute. Style simulations can be applied in addition to the designed style of a font. The default value for the StyleSimulations attribute is None, in which case the shapes of glyphs are not modified from their original design.

```csharp
public enum StyleSimulations
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| None | `0` | The none. The shapes of glyphs are not modified from their original design. |
| ItalicSimulation | `1` | The italic simulation. Synthetic italicizing is applied to glyphs with an IsSideways value of false by skewing the top edge of the alignment box of the character by 20° to the right, relative to the baseline of the character. |
| BoldSimulation | `2` | The bold simulation. Synthetic emboldening is applied by geometrically widening the strokes of glyphs by 1% of the EM size for each of the two boundaries of the stroke, so that the centers of strokes remain at the same position relative to the character coordinate system. |
| BoldItalicSimulation | `3` | The bold italic simulation. Both BoldSimulation and ItalicSimulation are applied. |

### See Also

* namespace [Aspose.CAD.FileFormats.Dwf.DwfXps.FixedPage.DTO](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/)
* assembly [Aspose.CAD](../../)


