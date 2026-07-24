---
title: "System::Drawing::CopyPixelOperation enum"
linktitle: "CopyPixelOperation"
second_title: "Aspose.Page untuk C++"
description: "System::Drawing::CopyPixelOperation enum. Menentukan bagaimana warna sumber dalam operasi penyalinan piksel digabungkan dengan warna tujuan untuk menghasilkan warna akhir dalam C++."
type: docs
weight: 3000
url: /id/cpp/system.drawing/copypixeloperation/
---
## CopyPixelOperation enum


Menentukan bagaimana warna sumber dalam operasi penyalinan piksel digabungkan dengan warna tujuan untuk menghasilkan warna akhir.

```cpp
enum class CopyPixelOperation
```

### Nilai

| Nama | Nilai | Deskripsi |
| --- | --- | --- |
| NoMirrorBitmap | n/a | Bitmap tidak dicerminkan. |
| Kegelapan | 66 | Wilayah tujuan diisi dengan menggunakan warna dengan indeks 0 dalam palet fisik. |
| NotSourceErase | 1114278 | Warna sumber dan tujuan di-OR-kan dan warna yang dihasilkan kemudian dibalik. |
| NotSourceCopy | 3342344 | Wilayah sumber dibalik dan kemudian disalin ke tujuan. |
| SourceErase | 4457256 | Warna terbalik dari wilayah tujuan di-AND-kan dengan warna wilayah sumber. |
| DestinationInvert | 5570569 | Wilayah tujuan dibalik. |
| PatInvert | 5898313 | Warna kuas yang saat ini dipilih dalam konteks perangkat tujuan di-XOR-kan dengan warna tujuan. |
| SourceInvert | 6684742 | Warna wilayah sumber dan tujuan di-XOR-kan. |
| SourceAnd | 8913094 | Warna wilayah sumber dan tujuan di-AND-kan. |
| MergePaint | 12255782 | Warna wilayah sumber yang terbalik di-OR-kan dengan warna wilayah tujuan. |
| MergeCopy | 12583114 | Warna wilayah sumber di-AND-kan dengan warna kuas yang dipilih dalam konteks perangkat tujuan. |
| SourceCopy | 13369376 | Wilayah sumber disalin langsung ke wilayah tujuan. |
| SourcePaint | 15597702 | Warna-warna wilayah sumber dan tujuan di-OR-kan. |
| PatCopy | 15728673 | Kuas yang saat ini dipilih dalam konteks perangkat tujuan disalin ke bitmap tujuan. |
| PatPaint | 16452105 | Warna-warna kuas yang saat ini dipilih dalam konteks perangkat tujuan di-OR-kan dengan warna-warna wilayah sumber yang terbalik. Hasil operasi ini di-OR-kan dengan warna-warna wilayah tujuan. |
| Whiteness | 16711778 | Wilayah tujuan diisi dengan menggunakan warna indeks 1 dalam palet fisik. |
| CaptureBlt | 1073741824 | [Windows](../../system.windows/) yang dilapisi di atas jendela aplikasi termasuk dalam gambar hasil. |

## Lihat Juga

* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
