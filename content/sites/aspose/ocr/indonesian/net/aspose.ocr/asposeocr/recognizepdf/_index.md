---
title: AsposeOcr.RecognizePdf
second_title: Aspose.OCR untuk .NET API Referensi
description: AsposeOcr metode. Kenali teks dari pdf yang dipindai ekstrak gambar.  Mengenali file pdf dengan kemampuan untuk menentukanDocumentRecognitionSettings . Hanya mendukung PDF yang dipindai. Tidak mendukung PDF yang Dapat Ditelusuri.
type: docs
weight: 220
url: /id/net/aspose.ocr/asposeocr/recognizepdf/
---
## RecognizePdf(string, DocumentRecognitionSettings) {#recognizepdf_1}

Kenali teks dari pdf yang dipindai (ekstrak gambar).  Mengenali file pdf dengan kemampuan untuk menentukan[`DocumentRecognitionSettings`](../../documentrecognitionsettings/) . Hanya mendukung PDF yang dipindai. Tidak mendukung PDF yang Dapat Ditelusuri.

```csharp
public List<RecognitionResult> RecognizePdf(string fullPath, DocumentRecognitionSettings settings)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| fullPath | String | Jalur lengkap ke gambar. |
| settings | DocumentRecognitionSettings | Pengaturan pengenalan. |

### Nilai Pengembalian

Itu[`RecognitionResult`](../../recognitionresult/) objek dengan hasil pengenalan citra.

### Lihat juga

* class [RecognitionResult](../../recognitionresult/)
* class [DocumentRecognitionSettings](../../documentrecognitionsettings/)
* class [AsposeOcr](../)
* ruang nama [Aspose.OCR](../../asposeocr/)
* perakitan [Aspose.OCR](../../../)

---

## RecognizePdf(MemoryStream, DocumentRecognitionSettings) {#recognizepdf}

Kenali teks dari pdf yang dipindai (ekstrak gambar).  Mengenali file pdf dengan kemampuan untuk menentukan[`RecognitionSettings`](../../recognitionsettings/) . Hanya mendukung PDF yang dipindai. Tidak mendukung PDF yang Dapat Ditelusuri.

```csharp
public List<RecognitionResult> RecognizePdf(MemoryStream stream, 
    DocumentRecognitionSettings settings)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| stream | MemoryStream | Aliran memori dengan file pdf. |
| settings | DocumentRecognitionSettings | Pengaturan pengenalan. |

### Nilai Pengembalian

Itu[`RecognitionResult`](../../recognitionresult/) objek dengan hasil pengenalan citra.

### Lihat juga

* class [RecognitionResult](../../recognitionresult/)
* class [DocumentRecognitionSettings](../../documentrecognitionsettings/)
* class [AsposeOcr](../)
* ruang nama [Aspose.OCR](../../asposeocr/)
* perakitan [Aspose.OCR](../../../)


