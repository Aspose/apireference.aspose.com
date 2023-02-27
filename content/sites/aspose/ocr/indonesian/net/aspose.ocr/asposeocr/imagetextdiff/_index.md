---
title: AsposeOcr.ImageTextDiff
second_title: Aspose.OCR untuk .NET API Referensi
description: AsposeOcr metode. Bandingkan teks pada kedua gambar dan kembalikan angka yang menunjukkan seberapa mirip keduanya 0 hingga 1.
type: docs
weight: 90
url: /id/net/aspose.ocr/asposeocr/imagetextdiff/
---
## AsposeOcr.ImageTextDiff method

Bandingkan teks pada kedua gambar dan kembalikan angka yang menunjukkan seberapa mirip keduanya (0 hingga 1).

```csharp
public float ImageTextDiff(string fullPath1, string fullPath2, RecognitionSettings settings = null, 
    bool ignoreCase = true)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| fullPath1 | String | Jalan ke gambar pertama. |
| fullPath2 | String | Jalan ke gambar kedua. |
| settings | RecognitionSettings | Pengaturan pengenalan. |
| ignoreCase | Boolean | Benar - artinya pencarian yang tidak peka huruf besar-kecil. |

### Nilai Pengembalian

0 berarti teksnya sangat berbeda; 1 berarti teksnya identik.

### Lihat juga

* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* ruang nama [Aspose.OCR](../../asposeocr/)
* perakitan [Aspose.OCR](../../../)


