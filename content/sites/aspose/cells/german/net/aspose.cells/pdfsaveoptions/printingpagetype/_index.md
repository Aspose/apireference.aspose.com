---
title: PrintingPageType
second_title: Aspose.Cells für .NET-API-Referenz
description: Gibt an welche Seiten nicht gedruckt werden.
type: docs
weight: 280
url: /de/net/aspose.cells/pdfsaveoptions/printingpagetype/
---
## PdfSaveOptions.PrintingPageType property

Gibt an, welche Seiten nicht gedruckt werden.

```csharp
public PrintingPageType PrintingPageType { get; set; }
```

### Bemerkungen

Wenn der Inhalt des Blatts spärlich ist, sind einige Seiten in der PDF-Ausgabedatei vollständig leer. Wenn Sie diese leeren Seiten nicht möchten, können Sie sie mit dieser Option weglassen.

### Beispiele

Der folgende Code lässt leere Seiten oder Seiten aus, die nur Stilinhalte wie Zellenhintergrund oder Rahmen enthalten.

```csharp
Workbook wb = new Workbook("Book1.xlsx");

PdfSaveOptions pdfSaveOptions = new PdfSaveOptions();

//leere Seiten ignorieren
pdfSaveOptions.PrintingPageType = PrintingPageType.IgnoreBlank;

wb.Save("output_ignore_blank_page.pdf", pdfSaveOptions);


//leere Seiten ignorieren and pages which only contains some style content like cell background
pdfSaveOptions.PrintingPageType = PrintingPageType.IgnoreStyle;

wb.Save("output_ignore_blank_and_style_page.pdf", pdfSaveOptions);
```

### Siehe auch

* enum [PrintingPageType](../../printingpagetype)
* class [PdfSaveOptions](../../pdfsaveoptions)
* namensraum [Aspose.Cells](../../pdfsaveoptions)
* Montage [Aspose.Cells](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Cells.dll -->
