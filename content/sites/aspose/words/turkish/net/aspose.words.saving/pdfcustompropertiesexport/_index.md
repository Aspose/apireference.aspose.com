---
title: PdfCustomPropertiesExport Enum
linktitle: PdfCustomPropertiesExport
articleTitle: PdfCustomPropertiesExport
second_title: Aspose.Words for .NET
description: Aspose.Words.Saving.PdfCustomPropertiesExport Sıralama. Yolu belirtirCustomDocumentProperties PDF dosyasına aktarılır C#'da.
type: docs
weight: 5420
url: /tr/net/aspose.words.saving/pdfcustompropertiesexport/
---
## PdfCustomPropertiesExport enumeration

Yolu belirtir[`CustomDocumentProperties`](../../aspose.words/document/customdocumentproperties/) PDF dosyasına aktarılır.

```csharp
public enum PdfCustomPropertiesExport
```

### değerler

| İsim | Değer | Tanım |
| --- | --- | --- |
| None | `0` | Hiçbir özel özellik dışa aktarılmaz. |
| Standard | `1` | Özel özellikler /Info sözlüğünde girişler olarak dışa aktarılır. |
| Metadata | `2` | Özel özellikler Meta Verilerdir. |

## Örnekler

Bir belgeyi PDF'ye dönüştürürken özel özelliklerin nasıl dışa aktarılacağını gösterir.

```csharp
Document doc = new Document();

doc.CustomDocumentProperties.Add("Company", "My value");

// Belgenin "Save" yöntemine aktarabileceğimiz bir "PdfSaveOptions" nesnesi oluşturun
// bu yöntemin belgeyi .PDF'ye dönüştürme biçimini değiştirmek için.
PdfSaveOptions options = new PdfSaveOptions();

// Atmak için "CustomPropertiesExport" özelliğini "PdfCustomPropertiesExport.None" olarak ayarlayın
// belgeyi .PDF'ye kaydettiğimizde özel belge özellikleri.
// "CustomPropertiesExport" özelliğini "PdfCustomPropertiesExport.Standard" olarak ayarlayın
// çıktı PDF belgesindeki özel özellikleri korumak için.
// "CustomPropertiesExport" özelliğini "PdfCustomPropertiesExport.Metadata" olarak ayarlayın
// bir XMP paketindeki özel özellikleri korumak için.
options.CustomPropertiesExport = pdfCustomPropertiesExportMode;

doc.Save(ArtifactsDir + "PdfSaveOptions.CustomPropertiesExport.pdf", options);
```

### Ayrıca bakınız

* ad alanı [Aspose.Words.Saving](../../aspose.words.saving/)
* toplantı [Aspose.Words](../../)
