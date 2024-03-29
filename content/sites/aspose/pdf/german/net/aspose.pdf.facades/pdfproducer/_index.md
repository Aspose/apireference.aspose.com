---
title: PdfProducer
second_title: Aspose.PDF für .NET-API-Referenz
description: Stellt eine Klasse dar um PDF aus anderen Formaten zu erzeugen.  Dieses Beispiel zeigt wie eine PDF-Datei aus einer CGM-Datei erstellt wird.
type: docs
weight: 2620
url: /de/net/aspose.pdf.facades/pdfproducer/
---
## PdfProducer class

Stellt eine Klasse dar, um PDF aus anderen Formaten zu erzeugen.  Dieses Beispiel zeigt, wie eine PDF-Datei aus einer CGM-Datei erstellt wird.

```csharp
string inputFile = "myImage.cgm";
string outputFile = "myPdf.pdf";
try
{
    PdfProducer.Produce(inputFile, ImportFormat.Cgm, outputFile);
    // Erfolgreich produzierte PDF-Datei.
}
catch (InvalidCgmFileFormatException e)
{
    // Etwas tun...
}
```

```csharp
public abstract class PdfProducer
```

## Methoden

| Name | Beschreibung |
| --- | --- |
| static [Produce](../../aspose.pdf.facades/pdfproducer/produce#produce)(Stream, ImportFormat, Stream) | Erzeugt den PDF-Stream unter Verwendung des angegebenen Importformats.  Dieses Beispiel zeigt, wie ein PDF-Stream aus einem CGM-Stream erstellt wird. |
| static [Produce](../../aspose.pdf.facades/pdfproducer/produce#produce_1)(Stream, ImportFormat, string) | Erzeugt die PDF-Datei unter Verwendung des angegebenen Importformats.  Dieses Beispiel zeigt, wie eine PDF-Datei aus einem CGM-Stream erstellt wird. |
| static [Produce](../../aspose.pdf.facades/pdfproducer/produce#produce_2)(Stream, ImportOptions, Stream) | Produzieren Sie die PDF-Datei mit der angegebenen Importoption.  Dieses Beispiel zeigt, wie ein PDF-Stream aus einem CGM-Stream erstellt wird. |
| static [Produce](../../aspose.pdf.facades/pdfproducer/produce#produce_3)(Stream, ImportOptions, string) | Produzieren Sie die PDF-Datei mit der angegebenen Importoption.  Dieses Beispiel zeigt, wie eine PDF-Datei aus einem CGM-Stream erstellt wird. |
| static [Produce](../../aspose.pdf.facades/pdfproducer/produce#produce_4)(string, ImportFormat, Stream) | Erzeugt den PDF-Stream unter Verwendung des angegebenen Importformats.  Dieses Beispiel zeigt, wie ein PDF-Stream aus einer CGM-Datei erstellt wird. |
| static [Produce](../../aspose.pdf.facades/pdfproducer/produce#produce_5)(string, ImportFormat, string) | Erzeugt die PDF-Datei unter Verwendung des angegebenen Importformats.  Dieses Beispiel zeigt, wie eine PDF-Datei aus einer CGM-Datei erstellt wird. |
| static [Produce](../../aspose.pdf.facades/pdfproducer/produce#produce_6)(string, ImportOptions, Stream) | Produziert den PDF-Stream mit der angegebenen Importoption.  Dieses Beispiel zeigt, wie ein PDF-Stream aus einer CGM-Datei erstellt wird. |
| static [Produce](../../aspose.pdf.facades/pdfproducer/produce#produce_7)(string, ImportOptions, string) | Produzieren Sie die PDF-Datei mit der angegebenen Importoption.  Dieses Beispiel zeigt, wie eine PDF-Datei aus einer CGM-Datei erstellt wird. |

### Siehe auch

* namensraum [Aspose.Pdf.Facades](../../aspose.pdf.facades)
* Montage [Aspose.PDF](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.PDF.dll -->
