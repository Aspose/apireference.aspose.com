---
title: "System::Drawing::Graphics::MeasureCharacterRanges メソッド"
linktitle: "MeasureCharacterRanges"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::Graphics::MeasureCharacterRanges メソッド。指定された文字列内の文字位置を囲む各領域の配列を返します。C++ で。"
type: docs
weight: 6400
url: /ja/cpp/system.drawing/graphics/measurecharacterranges/
---
## Graphics::MeasureCharacterRanges method


指定された文字列の文字位置を囲む各領域の配列を返します。

```cpp
ArrayPtr<SharedPtr<Region>> System::Drawing::Graphics::MeasureCharacterRanges(const System::String &text, const SharedPtr<Font> &font, RectangleF layoutRect, const SharedPtr<StringFormat> &stringFormat)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| text | const System::String\& | 測定対象の文字列 |
| フォント | const SharedPtr\<Font\>\& | 文字列の測定時に使用されるフォント |
| layoutRect | RectangleF | 文字列の測定時に使用されるレイアウト矩形 |
| stringFormat | const SharedPtr\<StringFormat\>\& | 文字列書式で、測定する文字範囲を含みます |

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Region](../../region/)
* Class [String](../../../system/string/)
* Class [Font](../../font/)
* Class [RectangleF](../../rectanglef/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
