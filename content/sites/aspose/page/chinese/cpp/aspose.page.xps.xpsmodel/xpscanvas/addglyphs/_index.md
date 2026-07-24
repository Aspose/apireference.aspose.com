---
title: "Aspose::Page::XPS::XpsModel::XpsCanvas::AddGlyphs method"
linktitle: "AddGlyphs"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::XpsModel::XpsCanvas::AddGlyphs 方法。向此画布的子列表中添加新字形，在 C++ 中。"
type: docs
weight: 300
url: /zh/cpp/aspose.page.xps.xpsmodel/xpscanvas/addglyphs/
---
## XpsCanvas::AddGlyphs method


向此 canvas 的子列表添加新的 glyphs。

```cpp
System::SharedPtr<XpsGlyphs> Aspose::Page::XPS::XpsModel::XpsCanvas::AddGlyphs(System::String fontFamily, float fontSize, System::Drawing::FontStyle fontStyle, float originX, float originY, System::String unicodeString)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| fontFamily | System::String | [Font](../../../aspose.page.font/) 字体族。 |
| fontSize | float | [Font](../../../aspose.page.font/) 大小。 |
| fontStyle | System::Drawing::FontStyle | [Font](../../../aspose.page.font/) 样式。 |
| originX | 单精度浮点数 | 字形原点 X 坐标。 |
| originY | 单精度浮点数 | 字形原点 T 坐标。 |
| unicodeString | System::String | 要打印的字符串。 |

### ReturnValue

已添加的字形。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../xpsglyphs/)
* Class [String](../../../system/string/)
* Enum [FontStyle](../../../system.drawing/fontstyle/)
* Class [XpsCanvas](../)
* Namespace [Aspose::Page::XPS::XpsModel](../../)
* Library [Aspose.Page for C++](../../../)
