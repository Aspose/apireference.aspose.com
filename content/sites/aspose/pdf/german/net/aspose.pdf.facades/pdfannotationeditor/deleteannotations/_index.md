---
title: DeleteAnnotations
second_title: Aspose.PDF für .NET-API-Referenz
description: Löscht alle Anmerkungen im Dokument.
type: docs
weight: 30
url: /de/net/aspose.pdf.facades/pdfannotationeditor/deleteannotations/
---
## DeleteAnnotations() {#deleteannotations}

Löscht alle Anmerkungen im Dokument.

```csharp
public void DeleteAnnotations()
```

### Beispiele

```csharp
PdfAnnotationEditor editor = new PdfAnnotationEditor();
editor.BindPdf("example.pdf");
editor.DeleteAnnotations();
editor.Save("example_out.pdf");
```

### Siehe auch

* class [PdfAnnotationEditor](../../pdfannotationeditor)
* namensraum [Aspose.Pdf.Facades](../../pdfannotationeditor)
* Montage [Aspose.PDF](../../../)

---

## DeleteAnnotations(string) {#deleteannotations_1}

Löscht alle Anmerkungen des angegebenen Typs im Dokument.

```csharp
public void DeleteAnnotations(string annotType)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| annotType | String | Der Anmerkungstyp wird gelöscht. |

### Beispiele

```csharp
PdfAnnotationEditor editor = new PdfAnnotationEditor();
editor.BindPdf("example.pdf");
editor.DeleteAnnotations("Text");
editor.Save("example_out.pdf");
```

### Siehe auch

* class [PdfAnnotationEditor](../../pdfannotationeditor)
* namensraum [Aspose.Pdf.Facades](../../pdfannotationeditor)
* Montage [Aspose.PDF](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.PDF.dll -->
