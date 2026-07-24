---
title: "Aspose::Page::XPS::XpsModel::XpsCanvas::AddGlyphs メソッド"
linktitle: "AddGlyphs"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::XpsModel::XpsCanvas::AddGlyphs メソッド。C++ でこのキャンバスの子リストに新しいグリフを追加します。"
type: docs
weight: 300
url: /ja/cpp/aspose.page.xps.xpsmodel/xpscanvas/addglyphs/
---
## XpsCanvas::AddGlyphs method


この Canvas の子リストに新しい Glyphs を追加します。

```cpp
System::SharedPtr<XpsGlyphs> Aspose::Page::XPS::XpsModel::XpsCanvas::AddGlyphs(System::String fontFamily, float fontSize, System::Drawing::FontStyle fontStyle, float originX, float originY, System::String unicodeString)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| fontFamily | System::String | [Font](../../../aspose.page.font/) ファミリ。 |
| fontSize | float | [Font](../../../aspose.page.font/) サイズ。 |
| fontStyle | System::Drawing::FontStyle | [Font](../../../aspose.page.font/) スタイル。 |
| originX | 単精度浮動小数点数 | グリフの原点 X 座標。 |
| originY | 単精度浮動小数点数 | グリフの原点 T 座標です。 |
| unicodeString | System::String | 印刷する文字列。 |

### ReturnValue

追加されたグリフ。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../xpsglyphs/)
* Class [String](../../../system/string/)
* Enum [FontStyle](../../../system.drawing/fontstyle/)
* Class [XpsCanvas](../)
* Namespace [Aspose::Page::XPS::XpsModel](../../)
* Library [Aspose.Page for C++](../../../)
