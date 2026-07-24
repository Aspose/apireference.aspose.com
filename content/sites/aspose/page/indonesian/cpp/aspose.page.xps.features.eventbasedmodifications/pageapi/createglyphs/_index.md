---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateGlyphs metode"
linktitle: "CreateGlyphs"
second_title: "Aspose.Page untuk C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateGlyphs method. Membuat glyph baru dalam C++."
type: docs
weight: 900
url: /id/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createglyphs/
---
## PageAPI::CreateGlyphs(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) method


Membuat glyphs baru.

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateGlyphs(System::SharedPtr<XpsModel::XpsFont> font, float fontRenderingEmSize, float originX, float originY, System::String unicodeString)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| font | System::SharedPtr\<XpsModel::XpsFont\> | [Font](../../../aspose.page.font/) sumber daya. |
| fontRenderingEmSize | float | [Font](../../../aspose.page.font/) ukuran. |
| originX | float | Koordinat X asal glyph. |
| originY | float | Koordinat Y asal glyph. |
| unicodeString | System::String | String yang akan dicetak. |

### ReturnValue

Glyph baru.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [XpsFont](../../../aspose.page.xps.xpsmodel/xpsfont/)
* Class [String](../../../system/string/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
## PageAPI::CreateGlyphs(System::String, float, System::Drawing::FontStyle, float, float, System::String) method


Membuat glyphs baru.

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateGlyphs(System::String fontFamily, float fontRenderingEmSize, System::Drawing::FontStyle fontStyle, float originX, float originY, System::String unicodeString)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| fontFamily | System::String | [Font](../../../aspose.page.font/) keluarga. |
| fontRenderingEmSize | float | [Font](../../../aspose.page.font/) ukuran. |
| fontStyle | System::Drawing::FontStyle | [Font](../../../aspose.page.font/) gaya. |
| originX | float | Koordinat X asal glyph. |
| originY | float | Koordinat Y asal glyph. |
| unicodeString | System::String | String yang akan dicetak. |

### ReturnValue

Glyph baru.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [String](../../../system/string/)
* Enum [FontStyle](../../../system.drawing/fontstyle/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
