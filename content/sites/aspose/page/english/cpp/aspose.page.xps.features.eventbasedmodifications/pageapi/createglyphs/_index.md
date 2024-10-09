---
title: Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateGlyphs method
linktitle: CreateGlyphs
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateGlyphs method. Creates new glyphs in C++.'
type: docs
weight: 900
url: /cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createglyphs/
---
## PageAPI::CreateGlyphs(System::SharedPtr\<Aspose::Page::XPS::XpsModel::XpsFont\>, float, float, float, System::String) method


Creates new glyphs.

```cpp
System::SharedPtr<Aspose::Page::XPS::XpsModel::XpsGlyphs> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateGlyphs(System::SharedPtr<Aspose::Page::XPS::XpsModel::XpsFont> font, float fontRenderingEmSize, float originX, float originY, System::String unicodeString)
```


| Parameter | Type | Description |
| --- | --- | --- |
| font | System::SharedPtr\<Aspose::Page::XPS::XpsModel::XpsFont\> | [Font](../../../aspose.page.font/) resource. |
| fontRenderingEmSize | float | [Font](../../../aspose.page.font/) size. |
| originX | float | Glyphs origin X coordinate. |
| originY | float | Glyphs origin Y coordinate. |
| unicodeString | System::String | String to be printed. |

### ReturnValue

New glyphs.

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [XpsFont](../../../aspose.page.xps.xpsmodel/xpsfont/)
* Class [String](../../../system/string/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
## PageAPI::CreateGlyphs(System::String, float, System::Drawing::FontStyle, float, float, System::String) method


Creates new glyphs.

```cpp
System::SharedPtr<Aspose::Page::XPS::XpsModel::XpsGlyphs> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateGlyphs(System::String fontFamily, float fontRenderingEmSize, System::Drawing::FontStyle fontStyle, float originX, float originY, System::String unicodeString)
```


| Parameter | Type | Description |
| --- | --- | --- |
| fontFamily | System::String | [Font](../../../aspose.page.font/) family. |
| fontRenderingEmSize | float | [Font](../../../aspose.page.font/) size. |
| fontStyle | System::Drawing::FontStyle | [Font](../../../aspose.page.font/) style. |
| originX | float | Glyphs origin X coordinate. |
| originY | float | Glyphs origin Y coordinate. |
| unicodeString | System::String | String to be printed. |

### ReturnValue

New glyphs.

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [String](../../../system/string/)
* Enum [FontStyle](../../../system.drawing/fontstyle/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
