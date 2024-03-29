---
title: DeleteAnnotations
second_title: Aspose.PDF för .NET API Referens
description: Tar bort alla kommentarer i dokumentet.
type: docs
weight: 30
url: /sv/net/aspose.pdf.facades/pdfannotationeditor/deleteannotations/
---
## DeleteAnnotations() {#deleteannotations}

Tar bort alla kommentarer i dokumentet.

```csharp
public void DeleteAnnotations()
```

### Exempel

```csharp
PdfAnnotationEditor editor = new PdfAnnotationEditor();
editor.BindPdf("example.pdf");
editor.DeleteAnnotations();
editor.Save("example_out.pdf");
```

### Se även

* class [PdfAnnotationEditor](../../pdfannotationeditor)
* namnutrymme [Aspose.Pdf.Facades](../../pdfannotationeditor)
* hopsättning [Aspose.PDF](../../../)

---

## DeleteAnnotations(string) {#deleteannotations_1}

Tar bort alla anteckningar av den angivna typen i dokumentet.

```csharp
public void DeleteAnnotations(string annotType)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| annotType | String | Typen av anteckning kommer att tas bort. |

### Exempel

```csharp
PdfAnnotationEditor editor = new PdfAnnotationEditor();
editor.BindPdf("example.pdf");
editor.DeleteAnnotations("Text");
editor.Save("example_out.pdf");
```

### Se även

* class [PdfAnnotationEditor](../../pdfannotationeditor)
* namnutrymme [Aspose.Pdf.Facades](../../pdfannotationeditor)
* hopsättning [Aspose.PDF](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.PDF.dll -->
