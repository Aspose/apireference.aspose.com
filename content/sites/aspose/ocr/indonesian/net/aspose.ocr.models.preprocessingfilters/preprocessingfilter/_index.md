---
title: Class PreprocessingFilter
second_title: Aspose.OCR untuk .NET API Referensi
description: Aspose.OCR.Models.PreprocessingFilters.PreprocessingFilter kelas. Kelas dasar untuk perintah pemrosesan gambar.
type: docs
weight: 170
url: /id/net/aspose.ocr.models.preprocessingfilters/preprocessingfilter/
---
## PreprocessingFilter class

Kelas dasar untuk perintah pemrosesan gambar.

Kelas dasar untuk perintah pemrosesan gambar.

```csharp
public class PreprocessingFilter : IEnumerable
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [PreprocessingFilter](preprocessingfilter/)() | Konstruktor default. |

## Metode

| Nama | Keterangan |
| --- | --- |
| static [AutoDenoising](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autodenoising/#autodenoising)() | Memungkinkan penggunaan jaringan saraf tambahan untuk menyempurnakan gambar - mengurangi noise. Berguna untuk gambar dengan artefak pemindaian, distorsi, bintik, suar, gradien, elemen asing. |
| static [AutoDenoising](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autodenoising/#autodenoising_1)(Rectangle) | Mengaktifkan penggunaan jaringan saraf tambahan untuk meningkatkan bagian gambar - mengurangi noise. Berguna untuk gambar dengan artefak pemindaian, distorsi, bintik, suar, gradien, elemen asing. |
| static [AutoDewarping](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autodewarping/)() | Secara otomatis mengoreksi distorsi geometrik pada gambar. Sangat intensif sumber daya! |
| static [AutoSkew](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autoskew/#autoskew)() | Mengaktifkan koreksi kemiringan gambar otomatis. |
| static [AutoSkew](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autoskew/#autoskew_1)(Rectangle) | Mengaktifkan koreksi kemiringan bagian gambar otomatis. |
| static [Binarize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/binarize/#binarize)() | Mengonversi gambar menjadi gambar hitam-putih. Gambar biner adalah gambar yang pikselnya hanya memiliki dua kemungkinan nilai intensitas. Mereka biasanya ditampilkan dalam warna hitam dan putih. Secara numerik, kedua nilai tersebut seringkali adalah 0 untuk warna hitam, dan 255 untuk warna putih. Gambar biner dihasilkan dengan melakukan thresholding otomatis pada gambar. |
| static [Binarize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/binarize/#binarize_1)(Rectangle) | Mengubah sebagian gambar menjadi gambar hitam-putih. Gambar biner adalah gambar yang pikselnya hanya memiliki dua kemungkinan nilai intensitas. Mereka biasanya ditampilkan dalam warna hitam dan putih. Secara numerik, kedua nilai tersebut seringkali adalah 0 untuk warna hitam, dan 255 untuk warna putih. Gambar biner dihasilkan dengan melakukan thresholding otomatis pada gambar. |
| static [ContrastCorrectionFilter](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/contrastcorrectionfilter/#contrastcorrectionfilter)() | Filter koreksi kontras. |
| static [ContrastCorrectionFilter](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/contrastcorrectionfilter/#contrastcorrectionfilter_1)(Rectangle) | Filter koreksi kontras untuk bagian gambar. |
| static [Dilate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/dilate/#dilate)() | Dilatasi menambahkan piksel ke batas objek dalam gambar. |
| static [Dilate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/dilate/#dilate_1)(Rectangle) | Dilatasi menambahkan piksel ke batas objek di bagian gambar. |
| static [Invert](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/invert/#invert)() | Secara otomatis membalikkan warna pada gambar dokumen. |
| static [Invert](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/invert/#invert_1)(Rectangle) | Secara otomatis membalikkan warna di bagian gambar. |
| static [Median](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/median/#median)() | Filter median berjalan melalui setiap elemen gambar dan mengganti setiap piksel dengan median piksel tetangganya. |
| static [Median](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/median/#median_1)(Rectangle) | Filter median berjalan melalui setiap elemen bagian gambar dan mengganti setiap piksel dengan median piksel tetangganya. |
| static [Resize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/resize/#resize)(int, int) | Skala ulang gambar - Resolusi gambar skala atas atau bawah. InterpolationFilterType = Lanczos8 |
| static [Resize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/resize/#resize_1)(int, int, InterpolationFilterType) | Skala ulang gambar - Resolusi gambar naik atau turun. |
| static [Rotate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/rotate/#rotate)(float) | Putar gambar asli. |
| static [Rotate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/rotate/#rotate_1)(float, Rectangle) | Memutar sebagian gambar. |
| static [Scale](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/scale/#scale)(float) | Skala ulang gambar - Resolusi gambar skala atas atau bawah. InterpolationFilterType = Lanczos8 |
| static [Scale](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/scale/#scale_1)(float, InterpolationFilterType) | Skala ulang gambar - Resolusi gambar naik atau turun. |
| static [Threshold](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/threshold/#threshold)(int) | Membuat citra biner berdasarkan pengaturan nilai threshold pada intensitas piksel citra asli. |
| static [Threshold](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/threshold/#threshold_1)(int, Rectangle) | Membuat bagian biner dari gambar berdasarkan pengaturan nilai ambang pada intensitas piksel bagian gambar asli. |
| static [ToGrayscale](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/tograyscale/)() | Mengonversi gambar menjadi gambar skala abu-abu. Gambar skala abu-abu memiliki 256 tingkat cahaya dalam gambar (0 hingga 255). |
| [Add](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/add/)(PreprocessingFilter) | Tambahkan filter baru ke koleksi untuk menjalankan lebih lanjut semua operasi. Konsistensi dalam koleksi itu penting. |
| [GetEnumerator](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/getenumerator/)() | Untuk realisasi antarmuka IEnumarable. |

### Lihat juga

* ruang nama [Aspose.OCR.Models.PreprocessingFilters](../../aspose.ocr.models.preprocessingfilters/)
* perakitan [Aspose.OCR](../../)


