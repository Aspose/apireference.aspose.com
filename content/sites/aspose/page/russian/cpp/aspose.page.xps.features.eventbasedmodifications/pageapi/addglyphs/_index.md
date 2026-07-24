---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::AddGlyphs метод"
linktitle: "AddGlyphs"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::AddGlyphs method. Добавляет новые глифы на страницу в C++."
type: docs
weight: 300
url: /ru/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/addglyphs/
---
## PageAPI::AddGlyphs(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) method


Добавляет новые glyphs на страницу.

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::AddGlyphs(System::SharedPtr<XpsModel::XpsFont> font, float fontRenderingEmSize, float originX, float originY, System::String unicodeString)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| font | System::SharedPtr\<XpsModel::XpsFont\> | [Font](../../../aspose.page.font/) ресурс. |
| fontRenderingEmSize | float | [Font](../../../aspose.page.font/) размер. |
| originX | float | Координата X начала глифов. |
| originY | float | Координата Y начала глифов. |
| unicodeString | System::String | Строка для печати. |

### ReturnValue

Добавленные глифы.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [XpsFont](../../../aspose.page.xps.xpsmodel/xpsfont/)
* Class [String](../../../system/string/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
## PageAPI::AddGlyphs(System::String, float, System::Drawing::FontStyle, float, float, System::String) method


Добавляет новые glyphs на страницу.

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::AddGlyphs(System::String fontFamily, float fontRenderingEmSize, System::Drawing::FontStyle fontStyle, float originX, float originY, System::String unicodeString)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| fontFamily | System::String | [Font](../../../aspose.page.font/) семейство. |
| fontRenderingEmSize | float | [Font](../../../aspose.page.font/) размер. |
| fontStyle | System::Drawing::FontStyle | [Font](../../../aspose.page.font/) стиль. |
| originX | float | Координата X начала глифов. |
| originY | float | Координата Y начала глифов. |
| unicodeString | System::String | Строка для печати. |

### ReturnValue

Добавленные глифы.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [String](../../../system/string/)
* Enum [FontStyle](../../../system.drawing/fontstyle/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
