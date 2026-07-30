---
title: "System::Drawing::Graphics::MeasureCharacterRanges 方法"
linktitle: "MeasureCharacterRanges"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::Graphics::MeasureCharacterRanges 方法。返回一个区域数组，每个区域限定指定字符串中字符的位置，适用于 C++。"
type: docs
weight: 6400
url: /zh/cpp/system.drawing/graphics/measurecharacterranges/
---
## Graphics::MeasureCharacterRanges method


返回一个区域数组，每个区域限定指定字符串中的字符位置。

```cpp
ArrayPtr<SharedPtr<Region>> System::Drawing::Graphics::MeasureCharacterRanges(const System::String &text, const SharedPtr<Font> &font, RectangleF layoutRect, const SharedPtr<StringFormat> &stringFormat)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 文本 | const System::String\& | 要测量的字符串 |
| 字体 | const SharedPtr\<Font\>\& | 测量字符串时使用的字体 |
| layoutRect | RectangleF | 测量字符串时使用的布局矩形 |
| stringFormat | const SharedPtr\<StringFormat\>\& | 字符串格式，包含要测量的字符范围 |

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Region](../../region/)
* Class [String](../../../system/string/)
* Class [Font](../../font/)
* Class [RectangleF](../../rectanglef/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
