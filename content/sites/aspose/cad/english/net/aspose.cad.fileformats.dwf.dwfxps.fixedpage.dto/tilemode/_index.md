---
title: Enum TileMode
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.Dwf.DwfXps.FixedPage.DTO.TileMode enum. The tile mode. Specifies how tiling is performed in the filled geometry
type: docs
weight: 9450
url: /net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/tilemode/
---
## TileMode enumeration

The tile mode. Specifies how tiling is performed in the filled geometry.

```csharp
public enum TileMode
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| None | `0` | The none. In this mode, only the single base tile is drawn. The remaining area is left transparent. |
| Tile | `1` | The tile. In this mode, the base tile is drawn and the remaining area is filled by repeating the base tile such that the right edge of each tile abuts the left edge of the next, and the bottom edge of each tile abuts the top edge of the next. |
| FlipX | `2` | The flip x. In this mode, the tile arrangement is similar to the Tile tile mode, but alternate columns of tiles are flipped horizontally. The base tile is positioned as specified by the viewport. Tiles in the columns to the left and right of this tile are flipped horizontally. |
| FlipY | `3` | The flip y. In this mode, the tile arrangement is similar to the Tile tile mode, but alternate rows of tiles are flipped vertically. The base tile is positioned as specified by the viewport. Rows above and below are flipped vertically. |
| FlipXY | `4` | The flip xy. In this mode, the tile arrangement is similar to the Tile tile mode, but alternate columns of tiles are flipped horizontally and alternate rows of tiles are flipped vertically. The base tile is positioned as specified by the viewport. |

### See Also

* namespace [Aspose.CAD.FileFormats.Dwf.DwfXps.FixedPage.DTO](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/)
* assembly [Aspose.CAD](../../)


