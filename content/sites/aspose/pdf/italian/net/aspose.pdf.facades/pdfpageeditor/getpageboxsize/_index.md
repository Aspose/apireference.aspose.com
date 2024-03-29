---
title: GetPageBoxSize
second_title: Aspose.PDF per .NET API Reference
description: Restituisce la dimensione della casella specificata nel documento.
type: docs
weight: 130
url: /it/net/aspose.pdf.facades/pdfpageeditor/getpageboxsize/
---
## PdfPageEditor.GetPageBoxSize method

Restituisce la dimensione della casella specificata nel documento.

```csharp
public Rectangle GetPageBoxSize(int page, string pageBoxName)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| page | Int32 | Indice delle pagine. Le pagine del documento sono numerate da 1. |
| pageBoxName | String | Nome del tipo di casella. I valori validi sono: "art", "bleed", "crop", "media", "trim". |

### Valore di ritorno

Rettangolo che contiene la casella richiesta.

### Esempi

L'esempio seguente mostra come ottenere il media box della prima pagina:

```csharp
PdfPageEditor editor = new PdfPageEditor();
editor.BindPdf("sample.pdf");
System.Drawing.Rectangle rect = editor.GetBoxSize(1, "media");
```

### Guarda anche

* class [PdfPageEditor](../../pdfpageeditor)
* spazio dei nomi [Aspose.Pdf.Facades](../../pdfpageeditor)
* assemblea [Aspose.PDF](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.PDF.dll -->
