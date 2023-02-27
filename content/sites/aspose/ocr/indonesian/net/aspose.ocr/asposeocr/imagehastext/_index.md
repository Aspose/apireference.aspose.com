---
title: AsposeOcr.ImageHasText
second_title: Aspose.OCR untuk .NET API Referensi
description: AsposeOcr metode. Periksa apakah gambar berisi fragmen teks yang disediakan.
type: docs
weight: 80
url: /id/net/aspose.ocr/asposeocr/imagehastext/
---
## ImageHasText(string, string, RecognitionSettings, bool) {#imagehastext}

Periksa apakah gambar berisi fragmen teks yang disediakan.

```csharp
public bool ImageHasText(string fullPath, string text, RecognitionSettings settings = null, 
    bool ignoreCase = true)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| fullPath | String | Jalan ke gambar. |
| text | String | Fragmen teks untuk mencari pada gambar. |
| settings | RecognitionSettings | Pengaturan pengenalan. |
| ignoreCase | Boolean | Benar - artinya pencarian yang tidak peka huruf besar-kecil. |

### Nilai Pengembalian

Benar jika gambar berisi fragmen teks. Salah - gambar tidak berisi fragmen teks.

### Perkataan

Mengenali gambar dengan kemampuan untuk menentukan[`RecognitionSettings`](../../recognitionsettings/) . Mendukung GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Lihat juga

* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* ruang nama [Aspose.OCR](../../asposeocr/)
* perakitan [Aspose.OCR](../../../)

---

## ImageHasText(string, Regex, RecognitionSettings) {#imagehastext_1}

Periksa apakah teks gambar cocok dengan ekspresi reguler yang diberikan.

```csharp
public bool ImageHasText(string fullPath, Regex regex, RecognitionSettings settings = null)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| fullPath | String | Jalan ke gambar. |
| regex | Regex | System.Text.RegularExpressions dengan pola dan opsi yang disediakan. |
| settings | RecognitionSettings | Pengaturan pengenalan. |

### Nilai Pengembalian

Benar jika teks gambar cocok dengan ekspresi reguler yang diberikan.

### Perkataan

Mengenali gambar dengan kemampuan untuk menentukan[`RecognitionSettings`](../../recognitionsettings/) . Mendukung GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Lihat juga

* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* ruang nama [Aspose.OCR](../../asposeocr/)
* perakitan [Aspose.OCR](../../../)


