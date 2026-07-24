---
title: "Aspose::Page::XPS::Presentation::Pdf::PdfImageCompression enumerasi"
linktitle: "PdfImageCompression"
second_title: "Aspose.Page untuk C++"
description: "Aspose::Page::XPS::Presentation::Pdf::PdfImageCompression enumerasi. Menentukan jenis kompresi yang diterapkan pada gambar dalam file PDF dalam C++."
type: docs
weight: 700
url: /id/cpp/aspose.page.xps.presentation.pdf/pdfimagecompression/
---
## PdfImageCompression enum


Menentukan jenis kompresi yang diterapkan pada gambar dalam file PDF.

```cpp
enum class PdfImageCompression
```

### Nilai

| Nama | Nilai | Deskripsi |
| --- | --- | --- |
| Otomatis | 0 | Secara otomatis memilih kompresi paling tepat untuk setiap gambar. |
| None | 1 | Menyimpan byte gambar mentah yang menghasilkan ukuran file PDF lebih besar. |
| Rle | 2 | Kompresi Run Length. |
| Flate | 3 | Kompresi Flate. |
| LzwBaselinePredictor | 4 | Pemilihan predictor dibatasi pada predictor PNG Paeth untuk mempercepat proses. Dalam praktiknya bekerja sangat baik. Lebih baik daripada [LzwOptimizedPredictor](./). |
| LzwOptimizedPredictor | 5 | Pemilihan prediktor lebih rumit dan seharusnya menghasilkan ukuran gambar yang lebih kecil tetapi membutuhkan lebih banyak waktu. |
| Jpeg | 6 | Kompressi JPEG. Tidak mendukung transparansi. |

## Lihat Juga

* Namespace [Aspose::Page::XPS::Presentation::Pdf](../)
* Library [Aspose.Page for C++](../../)
