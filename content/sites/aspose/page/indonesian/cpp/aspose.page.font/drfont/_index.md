---
title: "Aspose::Page::Font::DrFont kelas"
linktitle: "DrFont"
second_title: "Aspose.Page untuk C++"
description: "Aspose::Page::Font::DrFont kelas. Gunakan kelas ini alih-alih Font GDI+ dalam C++."
type: docs
weight: 100
url: /id/cpp/aspose.page.font/drfont/
---
## DrFont class


Gunakan kelas ini alih-alih GDI+ [Font](../).

```cpp
class DrFont : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Menentukan apakah [System::Object](../../system/object/) yang ditentukan, sama dengan instance ini. |
| [get_AscentLis](./get_ascentlis/)() | Ascent sel dari font ini (lis). Ini adalah jarak vertikal dari atas sel ke baseline sel. |
| [get_AscentPoints](./get_ascentpoints/)() | Mengembalikan ascent sel dalam poin. |
| [get_CellHeightLis](./get_cellheightlis/)() | Mengembalikan tinggi sel dari font ini (lis). Ini adalah jalan pintas untuk [AscentLis](../) + [DescentLis](../). |
| [get_CellHeightPoints](./get_cellheightpoints/)() | Jalan pintas untuk [AscentPoints](../) + [DescentPoints](../). |
| [get_DescentLis](./get_descentlis/)() | Descent sel dari font ini (lis). Ini adalah jarak vertikal dari dasar sel ke baseline sel. |
| [get_DescentPoints](./get_descentpoints/)() | Mengembalikan descent sel dalam poin. |
| [get_FamilyName](./get_familyname/)() | Mendapatkan nama font ini. |
| [get_IsBold](./get_isbold/)() | Mendapatkan nilai yang menunjukkan apakah instance ini tebal. |
| [get_IsItalic](./get_isitalic/)() | Mendapatkan nilai yang menunjukkan apakah instance ini miring. |
| [get_LeadingLis](./get_leadinglis/)() | Mengembalikan leading dari font ini (lis). Ini adalah jalan pintas untuk [LineSpacingLis](../) - [CellHeightLis](../). |
| [get_LeadingPoints](./get_leadingpoints/)() | Mengembalikan leading dari font ini (lis). Ini adalah jalan pintas untuk [LineSpacingLis](../) - [CellHeightLis](../). |
| [get_LineSpacingLis](./get_linespacinglis/)() | Mengembalikan spasi sel dari font ini (lis). Ini adalah jarak vertikal antara baseline dua glyph. |
| [get_LineSpacingPoints](./get_linespacingpoints/)() | Mengembalikan spasi sel dari font ini (poin). Ini adalah jarak vertikal antara baseline dua glyph. |
| [get_SizePoints](./get_sizepoints/)() | Mendapatkan ukuran font ini (poin). |
| [get_SmallCapsScaleFactor](./get_smallcapsscalefactor/)() | Mendapatkan kapital font. |
| [get_Style](./get_style/)() | Mendapatkan font TrueType. |
| [get_StyleEx](./get_styleex/)() | Properti ini berisi informasi tambahan tentang gaya font. |
| [GetCharWidthLis](./getcharwidthlis/)(char16_t) | Mendapatkan lebar karakter lis. |
| [GetCharWidthPoints](./getcharwidthpoints/)(char16_t) | Mengembalikan lebar karakter (poin). |
| [GetHashCode](./gethashcode/)() const override | Mengembalikan kode hash untuk instance ini. |
| [GetTextSizePoints](./gettextsizepoints/)(System::String) | Mengembalikan kotak teks pengukuran teks dalam poin. |
| [GetTextWidthLis](./gettextwidthlis/)(System::String) | Mendapatkan lebar teks lis. |
| [GetTextWidthPoints](./gettextwidthpoints/)(System::String) | Mendapatkan lebar teks dalam poin. |
| [GetTextWidthPoints](./gettextwidthpoints/)(System::String, int32_t, int32_t) | Mendapatkan lebar teks dalam poin. |
| static [IsPoorlyRenderedByGdiPlus](./ispoorlyrenderedbygdiplus/)(System::String) | Mengembalikan True untuk font "Microsoft Sans Serif". Font ini dirender dengan buruk oleh GDI+. Lihat Test286 dan Gemini-6959. |
| [Replace](./replace/)(System::SharedPtr\<DrFont\>) | Ganti konten font. |
| [set_SizePoints](./set_sizepoints/)(float) | Mendapatkan ukuran font ini (poin). |
| [set_StyleEx](./set_styleex/)(int16_t) | Properti ini berisi informasi tambahan tentang gaya font. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::Font](../)
* Library [Aspose.Page for C++](../../)
