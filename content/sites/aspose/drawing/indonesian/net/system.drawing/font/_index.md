---
title: Class Font
second_title: Aspose.Drawing untuk Referensi .NET API
description: System.Drawing.Font kelas. Menentukan format tertentu untuk teks termasuk tampilan font ukuran dan atribut gaya. Kelas ini tidak dapat diwariskan.
type: docs
weight: 500
url: /id/net/system.drawing/font/
---
## Font class

Menentukan format tertentu untuk teks, termasuk tampilan font, ukuran, dan atribut gaya. Kelas ini tidak dapat diwariskan.

```csharp
public sealed class Font : IDisposable
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [Font](font/#constructor)(Font, FontStyle) | Menginisialisasi instance baru dari`Font` kelas menggunakan ditentukan adaFont DanFontStyle pencacahan.. |
| [Font](font/#constructor_1)(FontFamily, float) | Menginisialisasi instance baru dari`Font` kelas. |
| [Font](font/#constructor_7)(string, float) | Menginisialisasi instance baru dari`Font` kelas menggunakan ukuran tertentu. |
| [Font](font/#constructor_2)(FontFamily, float, FontStyle) | Menginisialisasi instance baru dari`Font` kelas menggunakan ukuran dan gaya tertentu.. |
| [Font](font/#constructor_6)(FontFamily, float, GraphicsUnit) | Menginisialisasi instance baru dari`Font` kelas menggunakan ukuran dan satuan tertentu. Mengatur gaya keRegular . |
| [Font](font/#constructor_8)(string, float, FontStyle) | Menginisialisasi instance baru dari`Font` kelas menggunakan ukuran dan gaya tertentu. |
| [Font](font/#constructor_12)(string, float, GraphicsUnit) | Menginisialisasi instance baru dari`Font` kelas menggunakan ukuran dan satuan tertentu. Gaya diatur keRegular . |
| [Font](font/#constructor_3)(FontFamily, float, FontStyle, GraphicsUnit) | Menginisialisasi instance baru dari`Font` kelas menggunakan ukuran, gaya, dan satuan tertentu. |
| [Font](font/#constructor_9)(string, float, FontStyle, GraphicsUnit) | Menginisialisasi instance baru dari`Font` kelas menggunakan ukuran, gaya, dan satuan tertentu. |
| [Font](font/#constructor_4)(FontFamily, float, FontStyle, GraphicsUnit, byte) | Menginisialisasi instance baru dari`Font` kelas menggunakan ukuran, gaya, unit, dan kumpulan karakter yang ditentukan.. |
| [Font](font/#constructor_10)(string, float, FontStyle, GraphicsUnit, byte) | Menginisialisasi instance baru dari`Font`kelas menggunakan ukuran, gaya, unit, dan kumpulan karakter yang ditentukan. |
| [Font](font/#constructor_5)(FontFamily, float, FontStyle, GraphicsUnit, byte, bool) | Menginisialisasi instance baru dari`Font` kelas menggunakan ukuran, gaya, unit, dan kumpulan karakter yang ditentukan.. |
| [Font](font/#constructor_11)(string, float, FontStyle, GraphicsUnit, byte, bool) | Menginisialisasi instance baru dari`Font` kelas menggunakan ukuran, gaya, unit, dan kumpulan karakter yang ditentukan. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [Bold](../../system.drawing/font/bold/) { get; } | Mendapat nilai yang menunjukkan apakah iniFont tebal. |
| [FontFamily](../../system.drawing/font/fontfamily/) { get; } | MendapatkanFontFamily terkait dengan iniFont . |
| [GdiCharSet](../../system.drawing/font/gdicharset/) { get; } | Mendapat nilai byte yang menentukan set karakter GDI untuk iniFont kegunaan. |
| [GdiVerticalFont](../../system.drawing/font/gdiverticalfont/) { get; } | Mendapat nilai yang menunjukkan apakah iniFont berasal dari font vertikal GDI.. |
| [Height](../../system.drawing/font/height/) { get; } | Mendapat spasi baris dari font ini. |
| [IsSystemFont](../../system.drawing/font/issystemfont/) { get; } | Mendapat nilai yang menunjukkan apakah font adalah anggotaSystemFonts . |
| [Italic](../../system.drawing/font/italic/) { get; } | Mendapat nilai yang menunjukkan apakah iniFont itu miring. |
| [Name](../../system.drawing/font/name/) { get; } | Mendapat nama wajah iniFont . |
| [OriginalFontName](../../system.drawing/font/originalfontname/) { get; } | Mendapat nama font yang awalnya ditentukan. |
| [Size](../../system.drawing/font/size/) { get; } | Mendapat ukuran em dari iniFont diukur dalam satuan yang ditentukan oleh the Unit properti. |
| [SizeInPoints](../../system.drawing/font/sizeinpoints/) { get; } | Mendapat ukuran em, dalam poin, dari iniFont . |
| [Strikeout](../../system.drawing/font/strikeout/) { get; } | Mendapat nilai yang menunjukkan apakah iniFont menentukan garis horizontal melalui font. |
| [Style](../../system.drawing/font/style/) { get; } | Mendapat informasi gaya untuk iniFont . |
| [SystemFontName](../../system.drawing/font/systemfontname/) { get; } | Mendapatkan nama font sistem jika properti IsSystemFont mengembalikan true. |
| [Underline](../../system.drawing/font/underline/) { get; } | Mendapat nilai yang menunjukkan apakah iniFont digarisbawahi. |
| [Unit](../../system.drawing/font/unit/) { get; } | Mendapat satuan ukuran untuk iniFont . |

## Metode

| Nama | Keterangan |
| --- | --- |
| [Clone](../../system.drawing/font/clone/)() | Membuat salinan persis dari iniFont . |
| [Dispose](../../system.drawing/font/dispose/)() | Merilis semua sumber daya yang digunakan oleh iniFont . |
| override [Equals](../../system.drawing/font/equals/)(object) | Menunjukkan apakah objek yang ditentukan adalah aFont dan memiliki hal yang samaFontFamily , GdiVerticalFont ,GdiCharSet ,Style ,Size , danUnit nilai properti seperti iniFont . |
| override [GetHashCode](../../system.drawing/font/gethashcode/)() | Mendapat kode hash untuk iniFont . |
| [GetHeight](../../system.drawing/font/getheight/#getheight)() | Mengembalikan spasi baris, dalam piksel, dari font ini. |
| [GetHeight](../../system.drawing/font/getheight/#getheight_1)(float) | Mengembalikan tinggi, dalam piksel, dari iniFontsaat ditarik ke perangkat dengan resolusi vertikal yang ditentukan. |
| [GetHeight](../../system.drawing/font/getheight/#getheight_2)(Graphics) | Mengembalikan spasi baris, dalam unit saat ini dari yang ditentukanGraphics , dari font ini. |
| override [ToString](../../system.drawing/font/tostring/)() | Mengembalikan representasi string yang dapat dibaca manusia dari iniFont . |

### Lihat juga

* ruang nama [System.Drawing](../../system.drawing/)
* perakitan [Aspose.Drawing](../../)


