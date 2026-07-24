---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::InsertGlyphs 方法"
linktitle: "InsertGlyphs"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::InsertGlyphs 方法。向页面在索引位置插入新的字形，使用 C++。"
type: docs
weight: 3000
url: /zh/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/insertglyphs/
---
## PageAPI::InsertGlyphs(int32_t, System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) method


在 *index* 位置向页面插入新的 Glyphs。

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::InsertGlyphs(int32_t index, System::SharedPtr<XpsModel::XpsFont> font, float fontSize, float originX, float originY, System::String unicodeString)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 索引 | int32_t | 应插入新字形的位置。 |
| font | System::SharedPtr\<XpsModel::XpsFont\> | [Font](../../../aspose.page.font/) 资源。 |
| fontSize | float | [Font](../../../aspose.page.font/) 大小。 |
| originX | 单精度浮点数 | 字形原点 X 坐标。 |
| originY | 单精度浮点数 | 字形原点 Y 坐标。 |
| unicodeString | System::String | 要打印的字符串。 |

### ReturnValue

已插入的字形。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [XpsFont](../../../aspose.page.xps.xpsmodel/xpsfont/)
* Class [String](../../../system/string/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
## PageAPI::InsertGlyphs(int32_t, System::String, float, System::Drawing::FontStyle, float, float, System::String) method


在 *index* 位置向页面插入新的 Glyphs。

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::InsertGlyphs(int32_t index, System::String fontFamily, float fontSize, System::Drawing::FontStyle fontStyle, float originX, float originY, System::String unicodeString)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 索引 | int32_t | 应插入新字形的位置。 |
| fontFamily | System::String | [Font](../../../aspose.page.font/) 字体族。 |
| fontSize | float | [Font](../../../aspose.page.font/) 大小。 |
| fontStyle | System::Drawing::FontStyle | [Font](../../../aspose.page.font/) 样式。 |
| originX | 单精度浮点数 | 字形原点 X 坐标。 |
| originY | 单精度浮点数 | 字形原点 Y 坐标。 |
| unicodeString | System::String | 要打印的字符串。 |

### ReturnValue

已插入的字形。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [String](../../../system/string/)
* Enum [FontStyle](../../../system.drawing/fontstyle/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
