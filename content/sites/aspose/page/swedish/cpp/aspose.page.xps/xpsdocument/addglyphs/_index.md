---
title: "Aspose::Page::XPS::XpsDocument::AddGlyphs metod"
linktitle: "AddGlyphs"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::XPS::XpsDocument::AddGlyphs metod. Lägger till nya glyfer på den aktiva sidan i C++."
type: docs
weight: 500
url: /sv/cpp/aspose.page.xps/xpsdocument/addglyphs/
---
## XpsDocument::AddGlyphs(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) method


Lägger till nya glyfer på den aktiva sidan.

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::XpsDocument::AddGlyphs(System::SharedPtr<XpsModel::XpsFont> font, float fontRenderingEmSize, float originX, float originY, System::String unicodeString)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| font | System::SharedPtr\<XpsModel::XpsFont\> | [Font](../../../aspose.page.font/) resurs. |
| fontRenderingEmSize | float | [Font](../../../aspose.page.font/) storlek. |
| originX | float | Glyphs ursprung X-koordinat. |
| originY | float | Glyphs ursprung Y-koordinat. |
| unicodeString | System::String | Sträng som ska skrivas ut. |

### ReturnValue

Tillagda glyfer.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [XpsFont](../../../aspose.page.xps.xpsmodel/xpsfont/)
* Class [String](../../../system/string/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::AddGlyphs(System::String, float, System::Drawing::FontStyle, float, float, System::String) method


Lägger till nya glyfer på den aktiva sidan.

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::XpsDocument::AddGlyphs(System::String fontFamily, float fontRenderingEmSize, System::Drawing::FontStyle fontStyle, float originX, float originY, System::String unicodeString)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| fontFamily | System::String | [Font](../../../aspose.page.font/) familj. |
| fontRenderingEmSize | float | [Font](../../../aspose.page.font/) storlek. |
| fontStyle | System::Drawing::FontStyle | [Font](../../../aspose.page.font/) stil. |
| originX | float | Glyphs ursprung X-koordinat. |
| originY | float | Glyphs ursprung Y-koordinat. |
| unicodeString | System::String | Sträng som ska skrivas ut. |

### ReturnValue

Tillagda glyfer.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [String](../../../system/string/)
* Enum [FontStyle](../../../system.drawing/fontstyle/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
