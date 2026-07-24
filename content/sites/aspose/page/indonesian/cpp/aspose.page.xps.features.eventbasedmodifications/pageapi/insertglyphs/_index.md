---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::InsertGlyphs metode"
linktitle: "InsertGlyphs"
second_title: "Aspose.Page untuk C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::InsertGlyphs metode. Menyisipkan glyph baru ke halaman pada posisi indeks dalam C++."
type: docs
weight: 3000
url: /id/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/insertglyphs/
---
## PageAPI::InsertGlyphs(int32_t, System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) method


Menyisipkan glyphs baru ke halaman pada posisi *index*.

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::InsertGlyphs(int32_t index, System::SharedPtr<XpsModel::XpsFont> font, float fontSize, float originX, float originY, System::String unicodeString)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| indeks | int32_t | Posisi di mana glyph baru harus disisipkan. |
| font | System::SharedPtr\<XpsModel::XpsFont\> | [Font](../../../aspose.page.font/) sumber daya. |
| fontSize | float | [Font](../../../aspose.page.font/) ukuran. |
| originX | float | Koordinat X asal glyph. |
| originY | float | Koordinat Y asal glyph. |
| unicodeString | System::String | String yang akan dicetak. |

### ReturnValue

Glyph yang disisipkan.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [XpsFont](../../../aspose.page.xps.xpsmodel/xpsfont/)
* Class [String](../../../system/string/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
## PageAPI::InsertGlyphs(int32_t, System::String, float, System::Drawing::FontStyle, float, float, System::String) method


Menyisipkan glyphs baru ke halaman pada posisi *index*.

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::InsertGlyphs(int32_t index, System::String fontFamily, float fontSize, System::Drawing::FontStyle fontStyle, float originX, float originY, System::String unicodeString)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| indeks | int32_t | Posisi di mana glyph baru harus disisipkan. |
| fontFamily | System::String | [Font](../../../aspose.page.font/) keluarga. |
| fontSize | float | [Font](../../../aspose.page.font/) ukuran. |
| fontStyle | System::Drawing::FontStyle | [Font](../../../aspose.page.font/) gaya. |
| originX | float | Koordinat X asal glyph. |
| originY | float | Koordinat Y asal glyph. |
| unicodeString | System::String | String yang akan dicetak. |

### ReturnValue

Glyph yang disisipkan.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [String](../../../system/string/)
* Enum [FontStyle](../../../system.drawing/fontstyle/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
