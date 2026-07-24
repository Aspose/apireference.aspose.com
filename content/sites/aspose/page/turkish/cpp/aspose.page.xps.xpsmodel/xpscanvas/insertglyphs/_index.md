---
title: "Aspose::Page::XPS::XpsModel::XpsCanvas::InsertGlyphs metodu"
linktitle: "InsertGlyphs"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::XPS::XpsModel::XpsCanvas::InsertGlyphs metodu. Yeni glifleri bu canvas''s çocuk listesine indeks konumunda C++'da ekler."
type: docs
weight: 900
url: /tr/cpp/aspose.page.xps.xpsmodel/xpscanvas/insertglyphs/
---
## XpsCanvas::InsertGlyphs method


Bu canvas'ın alt öğe listesine *index*  position. yeni glyph'ler ekler.

```cpp
System::SharedPtr<XpsGlyphs> Aspose::Page::XPS::XpsModel::XpsCanvas::InsertGlyphs(int32_t index, System::String fontFamily, float fontSize, System::Drawing::FontStyle fontStyle, float originX, float originY, System::String unicodeString)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| indeks | int32_t | Yeni gliflerin eklenmesi gereken konum. |
| fontFamily | System::String | [Font](../../../aspose.page.font/) ailesi. |
| fontSize | float | [Font](../../../aspose.page.font/) boyutu. |
| fontStyle | System::Drawing::FontStyle | [Font](../../../aspose.page.font/) stili. |
| originX | float | Gliflerin X koordinatı. |
| originY | float | Gliflerin başlangıç T koordinatı. |
| unicodeString | System::String | Yazdırılacak dize. |

### ReturnValue

Eklenen glifler.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../xpsglyphs/)
* Class [String](../../../system/string/)
* Enum [FontStyle](../../../system.drawing/fontstyle/)
* Class [XpsCanvas](../)
* Namespace [Aspose::Page::XPS::XpsModel](../../)
* Library [Aspose.Page for C++](../../../)
