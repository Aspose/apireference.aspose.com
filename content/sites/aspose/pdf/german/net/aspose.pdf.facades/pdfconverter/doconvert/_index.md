---
title: PdfConverter.DoConvert
second_title: Aspose.PDF for .NET API Reference
description: PdfConverter-Methode. Führen Sie einige erste Arbeiten zur Konvertierung eines PDF-Dokuments in Bilder durch
type: docs
weight: 130
url: /de/net/aspose.pdf.facades/pdfconverter/doconvert/
---
## PdfConverter.DoConvert-Methode

Führen Sie einige erste Arbeiten zur Konvertierung eines PDF-Dokuments in Bilder durch.

```csharp
public void DoConvert()
```

## Beispiele

```csharp
[C#]
PdfConverter converter = new PdfConverter();
converter.BindPdf(@"D:\Test\test.pdf");
converter.DoConvert();
String prefix = @"D:\Test\";
String suffix = ".jpg";
int imageCount = 1;
while (converter.HasNextImage())
{
	converter.GetNextImage(prefix + imageCount + suffix);
	imageCount++;
}

[Visual Basic]
Dim converter As PdfConverter =  New PdfConverter() 
converter.BindPdf("D:\Test\test.pdf")
converter.DoConvert()
Dim prefix As String =  "D:\Test\" 
Dim suffix As String =  ".jpg" 
Dim imageCount As Integer =  1 
While converter.HasNextImage()
	converter.GetNextImage(prefix + imageCount + suffix)
	imageCount = imageCount + 1
End While
```

### Siehe auch

* Klasse [PdfConverter](../)
* Namespace [Aspose.Pdf.Facades](../../../aspose.pdf.facades/)
* Assembly [Aspose.PDF](../../../)