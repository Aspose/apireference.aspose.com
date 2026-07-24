---
title: "Aspose::Page::XPS::XpsDocument::AddGlyphs method"
linktitle: "AddGlyphs"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::XPS::XpsDocument::AddGlyphs method. C++'ta aktif sayfaya yeni glifler ekler."
type: docs
weight: 500
url: /tr/cpp/aspose.page.xps/xpsdocument/addglyphs/
---
## XpsDocument::AddGlyphs(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) method


Etkin sayfaya yeni glifler ekler.

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::XpsDocument::AddGlyphs(System::SharedPtr<XpsModel::XpsFont> font, float fontRenderingEmSize, float originX, float originY, System::String unicodeString)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| font | System::SharedPtr\<XpsModel::XpsFont\> | [Font](../../../aspose.page.font/) kaynağı. |
| fontRenderingEmSize | float | [Font](../../../aspose.page.font/) boyutu. |
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
## XpsDocument::AddGlyphs(System::String, float, System::Drawing::FontStyle, float, float, System::String) method


Etkin sayfaya yeni glifler ekler.

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::XpsDocument::AddGlyphs(System::String fontFamily, float fontRenderingEmSize, System::Drawing::FontStyle fontStyle, float originX, float originY, System::String unicodeString)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| fontFamily | System::String | [Font](../../../aspose.page.font/) ailesi. |
| fontRenderingEmSize | float | [Font](../../../aspose.page.font/) boyutu. |
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
