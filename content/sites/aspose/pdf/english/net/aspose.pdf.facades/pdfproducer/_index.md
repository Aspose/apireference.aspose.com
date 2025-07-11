---
title: Class PdfProducer
second_title: Aspose.PDF for .NET API Reference
description: Aspose.Pdf.Facades.PdfProducer class. Represents a class to produce PDF from other formats. This sample shows how to produce Pdf file from CGM file
type: docs
weight: 4730
url: /net/aspose.pdf.facades/pdfproducer/
---
## PdfProducer class

Represents a class to produce PDF from other formats. This sample shows how to produce Pdf file from CGM file.

```csharp
string inputFile = "myImage.cgm";
string outputFile = "myPdf.pdf";
try
{
    PdfProducer.Produce(inputFile, ImportFormat.Cgm, outputFile);
    // Success produced pdf file.
}
catch (InvalidCgmFileFormatException e)
{
    //  Do something...
}
```

```csharp
public abstract class PdfProducer
```

## Methods

| Name | Description |
| --- | --- |
| static [Produce](../../aspose.pdf.facades/pdfproducer/produce/#produce)(Stream, ImportFormat, Stream) | Produce the PDF stream using specified import format. This sample shows how to produce Pdf stream from CGM stream. |
| static [Produce](../../aspose.pdf.facades/pdfproducer/produce/#produce_1)(Stream, ImportFormat, string) | Produce the PDF file using specified import format. This sample shows how to produce Pdf file from CGM stream. |
| static [Produce](../../aspose.pdf.facades/pdfproducer/produce/#produce_2)(Stream, ImportOptions, Stream) | Produce the PDF file using specified import option. This sample shows how to produce Pdf stream from CGM stream. |
| static [Produce](../../aspose.pdf.facades/pdfproducer/produce/#produce_3)(Stream, ImportOptions, string) | Produce the PDF file using specified import option. This sample shows how to produce Pdf file from CGM stream. |
| static [Produce](../../aspose.pdf.facades/pdfproducer/produce/#produce_4)(string, ImportFormat, Stream) | Produce the PDF stream using specified import format. This sample shows how to produce Pdf stream from CGM file. |
| static [Produce](../../aspose.pdf.facades/pdfproducer/produce/#produce_5)(string, ImportFormat, string) | Produce the PDF file using specified import format. This sample shows how to produce Pdf file from CGM file. |
| static [Produce](../../aspose.pdf.facades/pdfproducer/produce/#produce_6)(string, ImportOptions, Stream) | Produce the PDF stream using specified import option. This sample shows how to produce Pdf stream from CGM file. |
| static [Produce](../../aspose.pdf.facades/pdfproducer/produce/#produce_7)(string, ImportOptions, string) | Produce the PDF file using specified import option. This sample shows how to produce Pdf file from CGM file. |

### See Also

* namespace [Aspose.Pdf.Facades](../../aspose.pdf.facades/)
* assembly [Aspose.PDF](../../)


