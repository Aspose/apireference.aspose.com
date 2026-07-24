---
title: "Aspose::Page::XPS::XpsModel::XpsTileMode 列挙型"
linktitle: "XpsTileMode"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::XpsModel::XpsTileMode 列挙型。C++ におけるタイルブラシの TileMode プロパティの有効な値です。"
type: docs
weight: 5500
url: /ja/cpp/aspose.page.xps.xpsmodel/xpstilemode/
---
## XpsTileMode enum


タイルブラシの TileMode プロパティの有効な値。

```cpp
enum class XpsTileMode
```

### 値

| 名前 | 値 | 説明 |
| --- | --- | --- |
| None | 0 | このモードでは、単一のベースタイルのみが描画され、残りの領域は透明のままになります。 |
| Tile | 1 | このモードでは、ベースタイルが描画され、残りの領域はベースタイルを繰り返し配置して埋められます。各タイルの右端が次のタイルの左端に接し、下端が次のタイルの上端に接するように配置されます。 |
| FlipX | 2 | タイル配置は Tile モードと似ていますが、タイルの交互の列が水平に反転します。ベースタイルはビューポートで指定された位置に配置されます。このタイルの左右の列のタイルは水平に反転します。 |
| FlipY | 3 | タイル配置は Tile モードと似っていますが、タイルの交互の行が垂直に反転します。ベースタイルはビューポートで指定された位置に配置されます。上下の行は垂直に反転します。 |
| FlipXY | 4 | タイルの配置は Tile タイルモードと似ていますが、交互の列のタイルは水平に反転され、交互の行のタイルは垂直に反転されます。ベースタイルはビューポートで指定された位置に配置されます。 |

## 参照

* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
