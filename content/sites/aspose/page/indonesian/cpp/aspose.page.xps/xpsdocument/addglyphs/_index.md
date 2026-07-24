---
title: "Aspose::Page::XPS::XpsDocument::AddGlyphs metode"
linktitle: "AddGlyphs"
second_title: "Aspose.Page untuk C++"
description: "Aspose::Page::XPS::XpsDocument::AddGlyphs metode. Menambahkan glyph baru ke halaman aktif dalam C++."
type: docs
weight: 500
url: /id/cpp/aspose.page.xps/xpsdocument/addglyphs/
---
## XpsDocument::AddGlyphs(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) method


Menambahkan glyph baru ke halaman aktif.

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::XpsDocument::AddGlyphs(System::SharedPtr<XpsModel::XpsFont> font, float fontRenderingEmSize, float originX, float originY, System::String unicodeString)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| font | System::SharedPtr\<XpsModel::XpsFont\> | [Font](../../../aspose.page.font/) sumber daya. |
| fontRenderingEmSize | float | [Font](../../../aspose.page.font/) ukuran. |
| originX | float | Koordinat X asal glyph. |
| originY | float | Koordinat Y asal glyph. |
| unicodeString | System::String | String yang akan dicetak. |

### ReturnValue

Glyph yang ditambahkan.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [XpsFont](../../../aspose.page.xps.xpsmodel/xpsfont/)
* Class [String](../../../system/string/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::AddGlyphs(System::String, float, System::Drawing::FontStyle, float, float, System::String) method


Menambahkan glyph baru ke halaman aktif.

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::XpsDocument::AddGlyphs(System::String fontFamily, float fontRenderingEmSize, System::Drawing::FontStyle fontStyle, float originX, float originY, System::String unicodeString)
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

Glyph yang ditambahkan.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [String](../../../system/string/)
* Enum [FontStyle](../../../system.drawing/fontstyle/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
