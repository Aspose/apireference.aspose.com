---
title: TileMode enumeration
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 350
url: /python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/tilemode/
is_root: false
---

## TileMode enumeration

The tile mode.
Specifies how tiling is performed in the filled geometry.



The TileMode type exposes the following members:

### Fields
| Field | Description |
| :- | :- |
| NONE | The none.<br/>In this mode, only the single base tile is drawn.<br/>The remaining area is left transparent. |
| TILE | The tile.<br/>In this mode, the base tile is drawn and the remaining area<br/>is filled by repeating the base tile such that the right edge<br/>of each tile abuts the left edge of the next, and the bottom<br/>edge of each tile abuts the top edge of the next. |
| FLIP_X | The flip x.<br/>In this mode, the tile arrangement is similar to the Tile tile mode,<br/>but alternate columns of tiles are flipped horizontally.<br/>The base tile is positioned as specified by the viewport.<br/>Tiles in the columns to the left and right of this tile are flipped horizontally. |
| FLIP_Y | The flip y.<br/>In this mode, the tile arrangement is similar to the Tile tile mode,<br/>but alternate rows of tiles are flipped vertically.<br/>The base tile is positioned as specified by the viewport.<br/>Rows above and below are flipped vertically. |
| FLIP_XY | The flip xy.<br/>In this mode, the tile arrangement is similar to the Tile tile mode,<br/>but alternate columns of tiles are flipped horizontally and alternate<br/>rows of tiles are flipped vertically.<br/>The base tile is positioned as specified by the viewport. |



### See Also
* module [`aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto`](..)
