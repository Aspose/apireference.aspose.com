---
title: Class TemplateProcessor
second_title: Aspose.OMR untuk Referensi .NET API
description: Aspose.OMR.Api.TemplateProcessor kelas. Kelas untuk memproses template dan gambar.  Setiap instance dari kelas ini bekerja dengan satu template OMR. Mampu mengenali gambar template yang ditentukan dalam konstruktor.
type: docs
weight: 30
url: /id/net/aspose.omr.api/templateprocessor/
---
## TemplateProcessor class

Kelas untuk memproses template dan gambar.  Setiap instance dari kelas ini bekerja dengan satu template OMR. Mampu mengenali gambar template yang ditentukan dalam konstruktor.

```csharp
public class TemplateProcessor
```

## Metode

| Nama | Keterangan |
| --- | --- |
| [Recalculate](../../aspose.omr.api/templateprocessor/recalculate/)(RecognitionResult, int) | Memperbarui hasil pengenalan menggunakan parameter yang disesuaikan. |
| [RecognizeFolder](../../aspose.omr.api/templateprocessor/recognizefolder/)(string, int) | Mengenali gambar dari folder |
| [RecognizeImage](../../aspose.omr.api/templateprocessor/recognizeimage/#recognizeimage)(MemoryStream, int) | Mengenali gambar dari aliran memori |
| [RecognizeImage](../../aspose.omr.api/templateprocessor/recognizeimage/#recognizeimage_1)(string, int) | Mengenali gambar |
| [RecognizeMultiPageTemplate](../../aspose.omr.api/templateprocessor/recognizemultipagetemplate/)(string[], int) | Mengenali template multi-halaman |

### Contoh

```csharp
OmrEngine engine = new OmrEngine();
TemplateProcessor templateProcessor = engine.GetTemplateProcessor(templatePath);
RecognitionResult result = templateProcessor.RecognizeImage(imagePath);
string csvResult = result.GetCsv();
```

### Lihat juga

* ruang nama [Aspose.OMR.Api](../../aspose.omr.api/)
* perakitan [Aspose.OMR](../../)


