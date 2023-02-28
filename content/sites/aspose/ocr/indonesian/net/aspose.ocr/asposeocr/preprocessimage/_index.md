---
title: AsposeOcr.PreprocessImage
second_title: Aspose.OCR untuk .NET API Referensi
description: AsposeOcr metode. Gunakan preprocessing gambar untuk meningkatkan akurasi OCR. Buat daftar filter yang akan diterapkan ke gambar input dalam urutan yang Anda tentukan. contoh untuk membuat filter PreprocessingFilter filter  new PreprocessingFilter  PreprocessingFilter.Invert  PreprocessingFilter.Threshold150 PreprocessingFilter.Binarize PreprocessingFilter.Rotate180 PreprocessingFilter.Resize30003000 Aspose.OCR.Filters.InterpolationFilterType.Box ScaleFiltersetelah.  PreprocessingFilter.Dilate  Anda tidak membutuhkan semuanya. Tetapkan hanya yang Anda butuhkan.
type: docs
weight: 100
url: /id/net/aspose.ocr/asposeocr/preprocessimage/
---
## PreprocessImage(string, PreprocessingFilter) {#preprocessimage_1}

Gunakan preprocessing gambar untuk meningkatkan akurasi OCR. Buat daftar filter yang akan diterapkan ke gambar input dalam urutan yang Anda tentukan. contoh untuk membuat filter: PreprocessingFilter filter = new PreprocessingFilter { PreprocessingFilter.Invert() , PreprocessingFilter.Threshold(150), PreprocessingFilter.Binarize(), PreprocessingFilter.Rotate(180), PreprocessingFilter.Resize(3000,3000, Aspose.OCR.Filters.InterpolationFilterType.Box), ScaleFilter(setelah. ), PreprocessingFilter.Dilate() }; Anda tidak membutuhkan semuanya. Tetapkan hanya yang Anda butuhkan.

```csharp
public MemoryStream PreprocessImage(string fullPath, PreprocessingFilter filters)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| fullPath | String | Jalur lengkap ke gambar. |
| filters | PreprocessingFilter | Filter pengoptimalan gambar[`PreprocessingFilter`](../../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/). |

### Nilai Pengembalian

Streaming dengan gambar yang dimodifikasi sehingga Anda dapat menyimpan atau mengenalinya.

### Lihat juga

* class [PreprocessingFilter](../../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/)
* class [AsposeOcr](../)
* ruang nama [Aspose.OCR](../../asposeocr/)
* perakitan [Aspose.OCR](../../../)

---

## PreprocessImage(MemoryStream, PreprocessingFilter) {#preprocessimage}

Gunakan preprocessing gambar untuk meningkatkan akurasi OCR. Buat daftar filter yang akan diterapkan ke gambar input dalam urutan yang Anda tentukan. contoh untuk membuat filter: PreprocessingFilter filter = new PreprocessingFilter { PreprocessingFilter.Invert() , PreprocessingFilter.Threshold(150), PreprocessingFilter.Binarize(), PreprocessingFilter.Rotate(180), PreprocessingFilter.Resize(3000,3000, Aspose.OCR.Filters.InterpolationFilterType.Box), ScaleFilter(setelah. ), PreprocessingFilter.Dilate() }; Anda tidak membutuhkan semuanya. Tetapkan hanya yang Anda butuhkan.

```csharp
public MemoryStream PreprocessImage(MemoryStream stream, PreprocessingFilter filters)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| stream | MemoryStream | Aliran memori yang berisi gambar. |
| filters | PreprocessingFilter | Filter pengoptimalan gambar[`PreprocessingFilter`](../../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/). |

### Nilai Pengembalian

Streaming dengan gambar yang dimodifikasi sehingga Anda dapat menyimpan atau mengenalinya.

### Lihat juga

* class [PreprocessingFilter](../../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/)
* class [AsposeOcr](../)
* ruang nama [Aspose.OCR](../../asposeocr/)
* perakitan [Aspose.OCR](../../../)


