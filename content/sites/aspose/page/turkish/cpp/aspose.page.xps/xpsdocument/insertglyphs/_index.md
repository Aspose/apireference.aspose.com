---
title: "Aspose::Page::XPS::XpsDocument::InsertGlyphs metodu"
linktitle: "InsertGlyphs"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::XPS::XpsDocument::InsertGlyphs metodu. C++'ta aktif sayfaya indeks konumunda yeni glifler ekler."
type: docs
weight: 4400
url: /tr/cpp/aspose.page.xps/xpsdocument/insertglyphs/
---
## XpsDocument::InsertGlyphs(int32_t, System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) method


*index* konumunda aktif sayfaya yeni glyph'ler ekler.

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::XpsDocument::InsertGlyphs(int32_t index, System::SharedPtr<XpsModel::XpsFont> font, float fontSize, float originX, float originY, System::String unicodeString)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| indeks | int32_t | Yeni gliflerin eklenmesi gereken konum. |
| font | System::SharedPtr\<XpsModel::XpsFont\> | [Font](../../../aspose.page.font/) kaynağı. |
| fontSize | float | [Font](../../../aspose.page.font/) boyutu. |
| originX | float | Gliflerin X koordinatı. |
| originY | float | Gliflerin Y koordinatı. |
| unicodeString | System::String | Yazdırılacak dize. |

### ReturnValue

Eklenen glifler.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [XpsFont](../../../aspose.page.xps.xpsmodel/xpsfont/)
* Class [String](../../../system/string/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::InsertGlyphs(int32_t, System::String, float, System::Drawing::FontStyle, float, float, System::String) method


*index* konumunda aktif sayfaya yeni glyph'ler ekler.

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::XpsDocument::InsertGlyphs(int32_t index, System::String fontFamily, float fontSize, System::Drawing::FontStyle fontStyle, float originX, float originY, System::String unicodeString)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| indeks | int32_t | Yeni gliflerin eklenmesi gereken konum. |
| fontFamily | System::String | [Font](../../../aspose.page.font/) ailesi. |
| fontSize | float | [Font](../../../aspose.page.font/) boyutu. |
| fontStyle | System::Drawing::FontStyle | [Font](../../../aspose.page.font/) stili. |
| originX | float | Gliflerin X koordinatı. |
| originY | float | Gliflerin Y koordinatı. |
| unicodeString | System::String | Yazdırılacak dize. |

### ReturnValue

Eklenen glifler.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [String](../../../system/string/)
* Enum [FontStyle](../../../system.drawing/fontstyle/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
