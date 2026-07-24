---
title: "Метод Aspose::Page::XPS::XpsDocument::CreateGlyphs"
linktitle: "CreateGlyphs"
second_title: "Aspose.Page для C++"
description: "Метод Aspose::Page::XPS::XpsDocument::CreateGlyphs. Создаёт новые глифы в C++."
type: docs
weight: 1400
url: /ru/cpp/aspose.page.xps/xpsdocument/createglyphs/
---
## XpsDocument::CreateGlyphs(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) method


Создаёт новые glyphs.

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::XpsDocument::CreateGlyphs(System::SharedPtr<XpsModel::XpsFont> font, float fontRenderingEmSize, float originX, float originY, System::String unicodeString)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| font | System::SharedPtr\<XpsModel::XpsFont\> | [Font](../../../aspose.page.font/) ресурс. |
| fontRenderingEmSize | float | [Font](../../../aspose.page.font/) размер. |
| originX | float | Координата X начала глифов. |
| originY | float | Координата Y начала глифов. |
| unicodeString | System::String | Строка для печати. |

### ReturnValue

Новые глифы.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [XpsFont](../../../aspose.page.xps.xpsmodel/xpsfont/)
* Class [String](../../../system/string/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateGlyphs(System::String, float, System::Drawing::FontStyle, float, float, System::String) method


Создаёт новые glyphs.

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::XpsDocument::CreateGlyphs(System::String fontFamily, float fontRenderingEmSize, System::Drawing::FontStyle fontStyle, float originX, float originY, System::String unicodeString)
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

Новые глифы.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [String](../../../system/string/)
* Enum [FontStyle](../../../system.drawing/fontstyle/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
