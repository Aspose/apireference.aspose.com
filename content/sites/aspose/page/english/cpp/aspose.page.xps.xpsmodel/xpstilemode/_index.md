---
title: Aspose::Page::XPS::XpsModel::XpsTileMode enum
linktitle: XpsTileMode
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::XpsModel::XpsTileMode enum. Valid values of tiling brushes'' TileMode property in C++.'
type: docs
weight: 5300
url: /cpp/aspose.page.xps.xpsmodel/xpstilemode/
---
## XpsTileMode enum


Valid values of tiling brushes' TileMode property.

```cpp
enum class XpsTileMode
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| None | 0 | In this mode, only the single base tile is drawn. The remaining area is left transparent. |
| Tile | 1 | In this mode, the base tile is drawn and the remaining area is filled by repeating the base tile such that the right edge of each tile abuts the left edge of the next, and the bottom edge of each tile abuts the top edge of the next. |
| FlipX | 2 | The tile arrangement is similar to the Tile tile mode, but alternate columns of tiles are flipped horizontally. The base tile is positioned as specified by the viewport. Tiles in the columns to the left and right of this tile are flipped horizontally. |
| FlipY | 3 | The tile arrangement is similar to the Tile tile mode, but alternate rows of tiles are flipped vertically. The base tile is positioned as specified by the viewport. Rows above and below are flipped vertically. |
| FlipXY | 4 | The tile arrangement is similar to the Tile tile mode, but alternate columns of tiles are flipped horizontally and alternate rows of tiles are flipped vertically. The base tile is positioned as specified by the viewport. |

## See Also

* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
