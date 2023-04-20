---
title: Interface IDevice
second_title: Aspose.SVG untuk Referensi .NET API
description: Aspose.Svg.Rendering.IDevice antarmuka. Mendefinisikan metode dan properti yang mendukung rendering kustom elemen grafis seperti jalur teks dan gambar.
type: docs
weight: 2810
url: /id/net/aspose.svg.rendering/idevice/
---
## IDevice interface

Mendefinisikan metode dan properti yang mendukung rendering kustom elemen grafis seperti jalur, teks, dan gambar.

```csharp
public interface IDevice : IDisposable
```

## Properti

| Nama | Keterangan |
| --- | --- |
| [GraphicContext](../../aspose.svg.rendering/idevice/graphiccontext/) { get; } | Mendapatkan konteks grafik. |
| [Options](../../aspose.svg.rendering/idevice/options/) { get; } | Mendapat opsi rendering. |

## Metode

| Nama | Keterangan |
| --- | --- |
| [AddRect](../../aspose.svg.rendering/idevice/addrect/)(RectangleF) | Menambahkan persegi panjang ke jalur saat ini sebagai subjalur lengkap. |
| [BeginDocument](../../aspose.svg.rendering/idevice/begindocument/)(Document) | Memulai rendering dokumen. |
| [BeginElement](../../aspose.svg.rendering/idevice/beginelement/)(Element, RectangleF) | Memulai rendering elemen. |
| [BeginPage](../../aspose.svg.rendering/idevice/beginpage/)(SizeF) | Memulai rendering halaman baru. |
| [Clip](../../aspose.svg.rendering/idevice/clip/)(FillMode) | Memodifikasi jalur kliping saat ini dengan memotongnya dengan jalur saat ini, menggunakan aturan FillMode untuk menentukan wilayah yang akan diisi. Metode ini menghentikan jalur saat ini. |
| [ClosePath](../../aspose.svg.rendering/idevice/closepath/)() | Menutup subjalur saat ini dengan menambahkan segmen garis lurus dari titik saat ini ke titik awal subjalur. Jika subjalur saat ini sudah ditutup, "ClosePath" tidak melakukan apa pun. Operator ini menghentikan subjalur saat ini. Menambahkan segmen lain ke jalur saat ini memulai subjalur baru, bahkan jika segmen baru dimulai pada titik akhir yang dijangkau oleh metode "ClosePath". |
| [CubicBezierTo](../../aspose.svg.rendering/idevice/cubicbezierto/)(PointF, PointF, PointF) | Menambahkan kurva Bézier kubik ke jalur saat ini. Kurva memanjang dari titik saat ini ke titik pt3, menggunakan pt1 dan pt2 sebagai titik kontrol Bézier. Titik baru saat ini adalah pt3. |
| [DrawImage](../../aspose.svg.rendering/idevice/drawimage/)(byte[], ImageType, RectangleF) | Menggambar gambar yang ditentukan. |
| [EndDocument](../../aspose.svg.rendering/idevice/enddocument/)() | Mengakhiri rendering dokumen. |
| [EndElement](../../aspose.svg.rendering/idevice/endelement/)(Element) | Mengakhiri rendering elemen. |
| [EndPage](../../aspose.svg.rendering/idevice/endpage/)() | Mengakhiri rendering halaman saat ini. |
| [Fill](../../aspose.svg.rendering/idevice/fill/)(FillMode) | Mengisi seluruh wilayah yang dilingkupi oleh jalur saat ini. Jika jalur terdiri dari beberapa subjalur yang terputus, jalur tersebut mengisi bagian dalam semua subjalur, dipertimbangkan bersama. Metode ini menghentikan jalur saat ini. |
| [FillText](../../aspose.svg.rendering/idevice/filltext/)(string, PointF) | Mengisi string teks yang ditentukan di lokasi yang ditentukan. |
| [Flush](../../aspose.svg.rendering/idevice/flush/)() | Membuang semua data ke aliran keluaran. |
| [LineTo](../../aspose.svg.rendering/idevice/lineto/)(PointF) | Menambahkan segmen garis lurus dari titik saat ini ke titik (pt). Titik baru saat ini adalah pt. |
| [MoveTo](../../aspose.svg.rendering/idevice/moveto/)(PointF) | Memulai subjalur baru dengan memindahkan titik saat ini ke koordinat parameter pt, menghilangkan segmen garis penghubung apa pun. Jika metode pembuatan jalur sebelumnya di jalur saat ini juga "MoveTo", "MoveTo" baru akan menimpanya; tidak ada sisa dari operasi "MoveTo" sebelumnya yang tersisa di jalur. |
| [RestoreGraphicContext](../../aspose.svg.rendering/idevice/restoregraphiccontext/)() | Mengembalikan seluruh konteks grafik ke nilai sebelumnya dengan mengeluarkannya dari tumpukan. |
| [SaveGraphicContext](../../aspose.svg.rendering/idevice/savegraphiccontext/)() | Mendorong salinan seluruh konteks grafik ke tumpukan. |
| [Stroke](../../aspose.svg.rendering/idevice/stroke/)() | Memotong garis di sepanjang jalur saat ini. Garis yang digores mengikuti setiap segmen lurus atau melengkung di jalur, berpusat pada segmen dengan sisi sejajar dengannya. Setiap subjalur jalur diperlakukan secara terpisah. Metode ini menghentikan jalur saat ini. |
| [StrokeAndFill](../../aspose.svg.rendering/idevice/strokeandfill/)(FillMode) | Goresan dan isi jalur saat ini. Metode ini mengakhiri jalur saat ini. |
| [StrokeText](../../aspose.svg.rendering/idevice/stroketext/)(string, PointF) | Memotong string teks yang ditentukan di lokasi yang ditentukan. |

### Lihat juga

* ruang nama [Aspose.Svg.Rendering](../../aspose.svg.rendering/)
* perakitan [Aspose.SVG](../../)


