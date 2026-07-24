---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateGlyphs 方法"
linktitle: "CreateGlyphs"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateGlyphs 方法。在 C++ 中创建新的字形。"
type: docs
weight: 900
url: /zh/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createglyphs/
---
## PageAPI::CreateGlyphs(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) method


创建新的 glyphs。

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateGlyphs(System::SharedPtr<XpsModel::XpsFont> font, float fontRenderingEmSize, float originX, float originY, System::String unicodeString)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| font | System::SharedPtr\<XpsModel::XpsFont\> | [Font](../../../aspose.page.font/) 资源。 |
| fontRenderingEmSize | float | [Font](../../../aspose.page.font/) 大小。 |
| originX | 单精度浮点数 | 字形原点 X 坐标。 |
| originY | 单精度浮点数 | 字形原点 Y 坐标。 |
| unicodeString | System::String | 要打印的字符串。 |

### ReturnValue

新的字形。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [XpsFont](../../../aspose.page.xps.xpsmodel/xpsfont/)
* Class [String](../../../system/string/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
## PageAPI::CreateGlyphs(System::String, float, System::Drawing::FontStyle, float, float, System::String) method


创建新的 glyphs。

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateGlyphs(System::String fontFamily, float fontRenderingEmSize, System::Drawing::FontStyle fontStyle, float originX, float originY, System::String unicodeString)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| fontFamily | System::String | [Font](../../../aspose.page.font/) 字体族。 |
| fontRenderingEmSize | float | [Font](../../../aspose.page.font/) 大小。 |
| fontStyle | System::Drawing::FontStyle | [Font](../../../aspose.page.font/) 样式。 |
| originX | 单精度浮点数 | 字形原点 X 坐标。 |
| originY | 单精度浮点数 | 字形原点 Y 坐标。 |
| unicodeString | System::String | 要打印的字符串。 |

### ReturnValue

新的字形。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [String](../../../system/string/)
* Enum [FontStyle](../../../system.drawing/fontstyle/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
