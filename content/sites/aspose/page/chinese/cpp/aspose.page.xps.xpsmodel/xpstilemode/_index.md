---
title: "Aspose::Page::XPS::XpsModel::XpsTileMode 枚举"
linktitle: "XpsTileMode"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::XpsModel::XpsTileMode 枚举。C++ 中平铺画刷的 TileMode 属性的有效值。"
type: docs
weight: 5500
url: /zh/cpp/aspose.page.xps.xpsmodel/xpstilemode/
---
## XpsTileMode enum


平铺画刷的 TileMode 属性的有效值。

```cpp
enum class XpsTileMode
```

### 值

| 名称 | 值 | 描述 |
| --- | --- | --- |
| None | 0 | 在此模式下，仅绘制单个基础平铺。其余区域保持透明。 |
| Tile | 1 | 在此模式下，绘制基础平铺，并通过重复基础平铺来填充其余区域，使每个平铺的右边缘与下一个平铺的左边缘相接，底部边缘与下一个平铺的顶部相接。 |
| FlipX | 2 | 平铺排列类似于 Tile 模式，但交替的列平铺会水平翻转。基础平铺按照视口指定的位置放置。该平铺左右两侧列中的平铺会水平翻转。 |
| FlipY | 3 | 平铺排列类似于 Tile 模式，但交替的行平铺会垂直翻转。基础平铺按照视口指定的位置放置。上下行的平铺会垂直翻转。 |
| FlipXY | 4 | 瓦片排列类似于 Tile 瓦片模式，但交替的列水平翻转，交替的行垂直翻转。基础瓦片按照视口指定的位置放置。 |

## 另见

* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
