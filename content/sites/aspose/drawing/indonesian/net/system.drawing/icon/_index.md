---
title: Class Icon
second_title: Aspose.Drawing untuk Referensi .NET API
description: System.Drawing.Icon kelas. Mewakili ikon Windows yaitu gambar bitmap kecil yang digunakan untuk merepresentasikan objek. Ikon dapat dianggap sebagai bitmap transparan meskipun ukurannya ditentukan oleh sistem.
type: docs
weight: 570
url: /id/net/system.drawing/icon/
---
## Icon class

Mewakili ikon Windows, yaitu gambar bitmap kecil yang digunakan untuk merepresentasikan objek. Ikon dapat dianggap sebagai bitmap transparan, meskipun ukurannya ditentukan oleh sistem.

```csharp
public sealed class Icon : ICloneable, IDisposable, ISerializable
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [Icon](icon/#constructor_2)(Stream) | Menginisialisasi instance baru dari`Icon` kelas dari aliran data yang ditentukan. |
| [Icon](icon/#constructor_5)(string) | Menginisialisasi instance baru dari`Icon` kelas dari nama file yang ditentukan. |
| [Icon](icon/#constructor_1)(Icon, Size) | Menginisialisasi instance baru dari`Icon` kelas dan berupaya menemukan versi ikon yang cocok dengan ukuran yang diminta. |
| [Icon](icon/#constructor_4)(Stream, Size) | Menginisialisasi instance baru dari`Icon` kelas ukuran yang ditentukan dari aliran yang ditentukan. |
| [Icon](icon/#constructor_7)(string, Size) | Menginisialisasi instance baru dari`Icon` kelas ukuran yang ditentukan dari file yang ditentukan. |
| [Icon](icon/#constructor_8)(Type, string) | Menginisialisasi instance baru dari`Icon` kelas dari sumber daya di rakitan yang ditentukan. |
| [Icon](icon/#constructor)(Icon, int, int) | Menginisialisasi instance baru dari`Icon` kelas dan berupaya menemukan versi ikon yang cocok dengan ukuran yang diminta.. |
| [Icon](icon/#constructor_3)(Stream, int, int) | Menginisialisasi instance baru dari`Icon` kelas dari aliran data yang ditentukan dan dengan lebar dan tinggi yang ditentukan. |
| [Icon](icon/#constructor_6)(string, int, int) | Menginisialisasi instance baru dari`Icon` kelas dengan lebar dan tinggi yang ditentukan dari file yang ditentukan. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [Handle](../../system.drawing/icon/handle/) { get; } | Dapatkan pegangan untuk iniIcon . Ini bukan salinan pegangannya; jangan di lepas. |
| [Height](../../system.drawing/icon/height/) { get; } | Mendapat ketinggian iniIcon . |
| [Size](../../system.drawing/icon/size/) { get; } | Mendapat ukuran iniIcon . |
| [Width](../../system.drawing/icon/width/) { get; } | Mendapat lebar iniIcon . |

## Metode

| Nama | Keterangan |
| --- | --- |
| static [ExtractAssociatedIcon](../../system.drawing/icon/extractassociatedicon/)(string) | Mengembalikan representasi ikon dari gambar yang terkandung dalam file yang ditentukan. |
| static [FromHandle](../../system.drawing/icon/fromhandle/)(IntPtr) | Membuat GDI+Icon dari pegangan Windows yang ditentukan ke ikon (HICON). |
| [Clone](../../system.drawing/icon/clone/)() | MenggandakanIcon , membuat gambar duplikat. |
| [Dispose](../../system.drawing/icon/dispose/)() | Melakukan tugas yang ditentukan aplikasi terkait dengan membebaskan, melepaskan, atau menyetel ulang sumber daya yang tidak dikelola. |
| [Save](../../system.drawing/icon/save/)(Stream) | Simpan iniIcon ke keluaran yang ditentukanStream . |
| [ToBitmap](../../system.drawing/icon/tobitmap/)() | Mengubah iniIcon ke GDI+Bitmap . |
| override [ToString](../../system.drawing/icon/tostring/)() | Mendapat string yang dapat dibaca manusia yang menjelaskanIcon . |

### Lihat juga

* ruang nama [System.Drawing](../../system.drawing/)
* perakitan [Aspose.Drawing](../../)


