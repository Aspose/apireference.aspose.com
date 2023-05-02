---
title: Enum CopyPixelOperation
second_title: Aspose.Drawing untuk Referensi .NET API
description: System.Drawing.CopyPixelOperation enum. Menentukan bagaimana warna sumber dalam operasi piksel penyalinan digabungkan dengan warna tujuan untuk menghasilkan warna akhir.
type: docs
weight: 120
url: /id/net/system.drawing/copypixeloperation/
---
## CopyPixelOperation enumeration

Menentukan bagaimana warna sumber dalam operasi piksel penyalinan digabungkan dengan warna tujuan untuk menghasilkan warna akhir.

```csharp
public enum CopyPixelOperation
```

### Nilai

| Nama | Nilai | Keterangan |
| --- | --- | --- |
| NoMirrorBitmap | `-2147483648` | Bitmap tidak dicerminkan. |
| Blackness | `66` | Area tujuan diisi dengan menggunakan warna yang terkait dengan indeks 0 di palet fisik. (Warna ini hitam untuk palet fisik default.) |
| NotSourceErase | `1114278` | Warna sumber dan tujuan digabungkan menggunakan Boolean`ATAU` operator, lalu warna yang dihasilkan dibalik. |
| NotSourceCopy | `3342344` | Area sumber terbalik disalin ke tujuan. |
| SourceErase | `4457256` | Warna terbalik dari area tujuan digabungkan dengan warna area sumber menggunakan Boolean`DAN` operator. |
| DestinationInvert | `5570569` | Area tujuan dibalik. |
| PatInvert | `5898313` | Warna kuas yang saat ini dipilih dalam konteks perangkat tujuan digabungkan dengan warna tujuan menggunakan Boolean`XOR` operator. |
| SourceInvert | `6684742` | Warna area sumber dan tujuan digabungkan menggunakan Boolean`XOR` operator. |
| SourceAnd | `8913094` | Warna area sumber dan tujuan digabungkan menggunakan Boolean`DAN` operator. |
| MergePaint | `12255782` | Warna area sumber terbalik digabungkan dengan warna area tujuan menggunakan Boolean`ATAU` operator. |
| MergeCopy | `12583114` | Warna area sumber digabungkan dengan warna kuas yang dipilih dari konteks perangkat tujuan menggunakan Boolean`DAN` operator. |
| SourceCopy | `13369376` | Area sumber disalin langsung ke area tujuan. |
| SourcePaint | `15597702` | Warna area sumber dan tujuan digabungkan menggunakan Boolean`ATAU` operator. |
| PatCopy | `15728673` | Kuas yang saat ini dipilih dalam konteks perangkat tujuan disalin ke bitmap tujuan. |
| PatPaint | `16452105` | Warna kuas yang saat ini dipilih dalam konteks perangkat tujuan digabungkan dengan warna area sumber terbalik menggunakan Boolean`ATAU` operator. Hasil operasi ini digabungkan dengan warna area tujuan menggunakan Boolean`ATAU` operator. |
| Whiteness | `16711778` | Area tujuan diisi dengan menggunakan warna yang terkait dengan indeks 1 di palet fisik. (Warna ini putih untuk palet fisik default.) |
| CaptureBlt | `1073741824` | Jendela yang berlapis di atas jendela Anda disertakan dalam gambar yang dihasilkan. Secara default, gambar hanya berisi jendela Anda. Perhatikan bahwa ini umumnya tidak dapat digunakan untuk mencetak konteks perangkat. |

### Lihat juga

* ruang nama [System.Drawing](../../system.drawing/)
* perakitan [Aspose.Drawing](../../)


