---
title: "Aspose::Page::XPS::XpsModel::XpsCanvas::InsertGlyphs метод"
linktitle: "InsertGlyphs"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::XPS::XpsModel::XpsCanvas::InsertGlyphs метод. Вставляет новые глифы в список дочерних элементов этого canvas''s на позиции index  position в C++."
type: docs
weight: 900
url: /ru/cpp/aspose.page.xps.xpsmodel/xpscanvas/insertglyphs/
---
## XpsCanvas::InsertGlyphs method


Вставляет новые glyphs в список дочерних элементов этого canvas на позицию *index*.

```cpp
System::SharedPtr<XpsGlyphs> Aspose::Page::XPS::XpsModel::XpsCanvas::InsertGlyphs(int32_t index, System::String fontFamily, float fontSize, System::Drawing::FontStyle fontStyle, float originX, float originY, System::String unicodeString)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| индекс | int32_t | Позиция, в которой следует вставить новые глифы. |
| fontFamily | System::String | [Font](../../../aspose.page.font/) семейство. |
| fontSize | float | [Font](../../../aspose.page.font/) размер. |
| fontStyle | System::Drawing::FontStyle | [Font](../../../aspose.page.font/) стиль. |
| originX | float | Координата X начала глифов. |
| originY | float | Координата T начала глифов. |
| unicodeString | System::String | Строка для печати. |

### ReturnValue

Добавленные глифы.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../xpsglyphs/)
* Class [String](../../../system/string/)
* Enum [FontStyle](../../../system.drawing/fontstyle/)
* Class [XpsCanvas](../)
* Namespace [Aspose::Page::XPS::XpsModel](../../)
* Library [Aspose.Page for C++](../../../)
