---
title: "Aspose::Page::XPS::XpsModel::XpsCanvas::InsertGlyphs 方法"
linktitle: "InsertGlyphs"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::XpsModel::XpsCanvas::InsertGlyphs 方法。在指定索引位置向此画布的子列表中插入新的字形（C++）。"
type: docs
weight: 900
url: /zh/cpp/aspose.page.xps.xpsmodel/xpscanvas/insertglyphs/
---
## XpsCanvas::InsertGlyphs method


在 *index*  position 向此 canvas 的子列表插入新的 glyphs。

```cpp
System::SharedPtr<XpsGlyphs> Aspose::Page::XPS::XpsModel::XpsCanvas::InsertGlyphs(int32_t index, System::String fontFamily, float fontSize, System::Drawing::FontStyle fontStyle, float originX, float originY, System::String unicodeString)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 索引 | int32_t | 应插入新字形的位置。 |
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
