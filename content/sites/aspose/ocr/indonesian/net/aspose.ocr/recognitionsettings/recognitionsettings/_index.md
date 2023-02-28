---
title: RecognitionSettings.RecognitionSettings
second_title: Aspose.OCR untuk .NET API Referensi
description: RecognitionSettings konstruktor. Menginisialisasi instance baru dariRecognitionSettingskelas dengan set properti lengkap.
type: docs
weight: 10
url: /id/net/aspose.ocr/recognitionsettings/recognitionsettings/
---
## RecognitionSettings constructor

Menginisialisasi instance baru dari[`RecognitionSettings`](../)kelas dengan set properti lengkap.

```csharp
public RecognitionSettings(Language language = Language.None, 
    List<Rectangle> recognitionAreas = null, bool detectAreas = true, bool autoSkew = true, 
    float skewAngle = 0, bool recognizeSingleLine = false, int threshold = 0)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| language | Language | Bahasa yang digunakan untuk OCR. |
| recognitionAreas | List`1 | Atur area untuk dikenali secara manual. Null secara default - berarti seluruh gambar diproses. |
| detectAreas | Boolean | Aktifkan deteksi area teks otomatis. |
| autoSkew | Boolean | Aktifkan koreksi kemiringan gambar otomatis. |
| skewAngle | Single | Atur sudut untuk rotasi gambar. |
| recognizeSingleLine | Boolean | Untuk gambar garis tunggal |
| threshold | Int32 | Ambang binarisasi gambar khusus |

### Lihat juga

* enum [Language](../../language/)
* class [RecognitionSettings](../)
* ruang nama [Aspose.OCR](../../recognitionsettings/)
* perakitan [Aspose.OCR](../../../)


