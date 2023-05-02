---
title: Class ImageCodecInfo
second_title: Aspose.Drawing untuk Referensi .NET API
description: System.Drawing.Imaging.ImageCodecInfo kelas. ItuImageCodecInfo kelas menyediakan anggota penyimpanan yang diperlukan dan metode untuk mengambil semua informasi terkait tentang encoder dan decoder gambar yang diinstal disebut codec. Tidak dapat diwariskan.
type: docs
weight: 750
url: /id/net/system.drawing.imaging/imagecodecinfo/
---
## ImageCodecInfo class

ItuImageCodecInfo kelas menyediakan anggota penyimpanan yang diperlukan dan metode untuk mengambil semua informasi terkait tentang encoder dan decoder gambar yang diinstal (disebut codec). Tidak dapat diwariskan.

```csharp
public sealed class ImageCodecInfo
```

## Properti

| Nama | Keterangan |
| --- | --- |
| [Clsid](../../system.drawing.imaging/imagecodecinfo/clsid/) { get; set; } | Mendapat atau menyetel aGuid struktur yang berisi GUID yang mengidentifikasi codec tertentu. |
| [CodecName](../../system.drawing.imaging/imagecodecinfo/codecname/) { get; set; } | Mendapat atau menetapkan string yang berisi nama codec. |
| [FilenameExtension](../../system.drawing.imaging/imagecodecinfo/filenameextension/) { get; set; } | Mendapat atau menetapkan string yang berisi ekstensi nama file yang digunakan dalam codec. Ekstensi dipisahkan oleh titik koma. |
| [FormatDescription](../../system.drawing.imaging/imagecodecinfo/formatdescription/) { get; set; } | Mendapat atau menetapkan string yang menjelaskan format file codec. |
| [FormatID](../../system.drawing.imaging/imagecodecinfo/formatid/) { get; set; } | Mendapat atau menyetel aGuid struktur yang berisi GUID yang mengidentifikasi format codec. |
| [MimeType](../../system.drawing.imaging/imagecodecinfo/mimetype/) { get; set; } | Mendapat atau menyetel string yang berisi jenis Ekstensi Surat Internet Multiguna (MIME) codec. |
| [SignatureMasks](../../system.drawing.imaging/imagecodecinfo/signaturemasks/) { get; set; } | Mendapat atau menetapkan array dua dimensi byte yang dapat digunakan sebagai filter. |
| [SignaturePatterns](../../system.drawing.imaging/imagecodecinfo/signaturepatterns/) { get; set; } | Mendapat atau menetapkan array dua dimensi byte yang mewakili tanda tangan codec. |
| [Version](../../system.drawing.imaging/imagecodecinfo/version/) { get; set; } | Mendapat atau menyetel nomor versi codec. |

## Metode

| Nama | Keterangan |
| --- | --- |
| static [GetImageDecoders](../../system.drawing.imaging/imagecodecinfo/getimagedecoders/)() | Mengembalikan arrayImageCodecInfo objek yang berisi informasi tentang dekoder gambar yang terpasang di GDI+. |
| static [GetImageEncoders](../../system.drawing.imaging/imagecodecinfo/getimageencoders/)() | Mengembalikan arrayImageCodecInfoobjek yang berisi informasi tentang pembuat enkode gambar yang terpasang di GDI+. |

### Lihat juga

* ruang nama [System.Drawing.Imaging](../../system.drawing.imaging/)
* perakitan [Aspose.Drawing](../../)


