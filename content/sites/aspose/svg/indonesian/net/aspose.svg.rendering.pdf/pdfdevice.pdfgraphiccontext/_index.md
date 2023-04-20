---
title: Class PdfDevice.PdfGraphicContext
second_title: Aspose.SVG untuk Referensi .NET API
description: Aspose.Svg.Rendering.Pdf.PdfDevicePdfGraphicContext kelas. Menyimpan parameter kontrol grafis saat ini untuk PdfDevice. Parameter ini menentukan kerangka kerja global tempat operator grafis mengeksekusi.
type: docs
weight: 2960
url: /id/net/aspose.svg.rendering.pdf/pdfdevice.pdfgraphiccontext/
---
## PdfDevice.PdfGraphicContext class

Menyimpan parameter kontrol grafis saat ini untuk PdfDevice. Parameter ini menentukan kerangka kerja global tempat operator grafis mengeksekusi.

```csharp
public class PdfGraphicContext : GraphicContext
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [PdfGraphicContext](pdfgraphiccontext/)() | Konstruktor default. |

## Properti

| Nama | Keterangan |
| --- | --- |
| virtual [CharacterSpacing](../../aspose.svg.rendering/graphiccontext/characterspacing/) { get; set; } | Mengatur atau mendapatkan spasi karakter. |
| override [FillBrush](../../aspose.svg.rendering.pdf/pdfgraphiccontext/fillbrush/) { get; set; } | Menyetel atau mendapatkan objek kuas yang digunakan untuk mengisi interior jalur. |
| virtual [Font](../../aspose.svg.rendering/graphiccontext/font/) { get; set; } | Menyetel atau mendapatkan objek font tipe sebenarnya yang digunakan untuk merender teks. |
| virtual [FontSize](../../aspose.svg.rendering/graphiccontext/fontsize/) { get; set; } | Mengatur atau mendapatkan ukuran font teks. |
| virtual [FontStyle](../../aspose.svg.rendering/graphiccontext/fontstyle/) { get; set; } | Mengatur atau mendapatkan gaya font teks. |
| override [LineCap](../../aspose.svg.rendering.pdf/pdfgraphiccontext/linecap/) { get; set; } | Menyetel atau mendapatkan kode yang menentukan bentuk titik akhir untuk setiap jalur terbuka yang digores. |
| virtual [LineDashOffset](../../aspose.svg.rendering/graphiccontext/linedashoffset/) { get; set; } | Mengatur atau mendapatkan offset fase dari pola garis putus-putus saat ini. |
| virtual [LineDashPattern](../../aspose.svg.rendering/graphiccontext/linedashpattern/) { get; set; } | Menyetel atau mendapatkan deskripsi pola tanda hubung yang akan digunakan saat jalur digores. |
| virtual [LineDashStyle](../../aspose.svg.rendering/graphiccontext/linedashstyle/) { get; set; } | Kumpulan mendapatkan gaya garis putus-putus dari jalur yang digores. |
| override [LineJoin](../../aspose.svg.rendering.pdf/pdfgraphiccontext/linejoin/) { get; set; } | Mengatur atau mendapatkan kode yang menentukan bentuk sambungan antara segmen yang terhubung dari jalur yang digores. |
| override [LineWidth](../../aspose.svg.rendering.pdf/pdfgraphiccontext/linewidth/) { get; set; } | Mengatur atau mendapatkan ketebalan jalur yang akan digores. |
| override [MiterLimit](../../aspose.svg.rendering.pdf/pdfgraphiccontext/miterlimit/) { get; set; } | Menyetel atau mendapatkan panjang maksimum gabungan garis yang digabungkan untuk jalur yang digores. Parameter ini membatasi panjang "paku" yang dihasilkan saat segmen garis bergabung pada sudut tajam. |
| override [StrokeBrush](../../aspose.svg.rendering.pdf/pdfgraphiccontext/strokebrush/) { get; set; } | Menyetel atau mendapatkan objek kuas yang digunakan untuk jalur yang digores. |
| virtual [TextInfo](../../aspose.svg.rendering/graphiccontext/textinfo/) { get; } | Mendapat a[`TextInfo`](../../aspose.svg.rendering/textinfo/) objek yang berisi informasi tentang teks yang dirender. |
| override [TransformationMatrix](../../aspose.svg.rendering.pdf/pdfgraphiccontext/transformationmatrix/) { get; set; } | Mengatur atau mendapatkan matriks transformasi. |

## Metode

| Nama | Keterangan |
| --- | --- |
| override [Clone](../../aspose.svg.rendering.pdf/pdfgraphiccontext/clone/)() | Membuat instance baru dari kelas dengan nilai properti yang sama dengan instance yang ada. |
| override [Transform](../../aspose.svg.rendering.pdf/pdfgraphiccontext/transform/)(Matrix) | Ubah matriks transformasi saat ini dengan mengalikan matriks yang ditentukan. |

### Lihat juga

* class [GraphicContext](../../aspose.svg.rendering/graphiccontext/)
* class [PdfDevice](../pdfdevice/)
* ruang nama [Aspose.Svg.Rendering.Pdf](../../aspose.svg.rendering.pdf/)
* perakitan [Aspose.SVG](../../)


