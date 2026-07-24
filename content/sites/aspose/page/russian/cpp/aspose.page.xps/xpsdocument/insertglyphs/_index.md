---
title: "Aspose::Page::XPS::XpsDocument::InsertGlyphs метод"
linktitle: "InsertGlyphs"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::XPS::XpsDocument::InsertGlyphs метод. Вставляет новые глифы на активную страницу в позиции index в C++."
type: docs
weight: 4400
url: /ru/cpp/aspose.page.xps/xpsdocument/insertglyphs/
---
## XpsDocument::InsertGlyphs(int32_t, System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) method


Вставляет новые glyphs на активную страницу в позицию *index* .

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::XpsDocument::InsertGlyphs(int32_t index, System::SharedPtr<XpsModel::XpsFont> font, float fontSize, float originX, float originY, System::String unicodeString)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| индекс | int32_t | Позиция, в которой следует вставить новые глифы. |
| font | System::SharedPtr\<XpsModel::XpsFont\> | [Font](../../../aspose.page.font/) ресурс. |
| fontSize | float | [Font](../../../aspose.page.font/) размер. |
| originX | float | Координата X начала глифов. |
| originY | float | Координата Y начала глифов. |
| unicodeString | System::String | Строка для печати. |

### ReturnValue

Вставленные глифы.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [XpsFont](../../../aspose.page.xps.xpsmodel/xpsfont/)
* Class [String](../../../system/string/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::InsertGlyphs(int32_t, System::String, float, System::Drawing::FontStyle, float, float, System::String) method


Вставляет новые glyphs на активную страницу в позицию *index* .

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::XpsDocument::InsertGlyphs(int32_t index, System::String fontFamily, float fontSize, System::Drawing::FontStyle fontStyle, float originX, float originY, System::String unicodeString)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| индекс | int32_t | Позиция, в которой следует вставить новые глифы. |
| fontFamily | System::String | [Font](../../../aspose.page.font/) семейство. |
| fontSize | float | [Font](../../../aspose.page.font/) размер. |
| fontStyle | System::Drawing::FontStyle | [Font](../../../aspose.page.font/) стиль. |
| originX | float | Координата X начала глифов. |
| originY | float | Координата Y начала глифов. |
| unicodeString | System::String | Строка для печати. |

### ReturnValue

Вставленные глифы.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [String](../../../system/string/)
* Enum [FontStyle](../../../system.drawing/fontstyle/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
