---
title: CreateLocalLink
second_title: Aspose.PDF för .NET API Referens
description: Skapar en lokal länk i PDF-dokument.
type: docs
weight: 190
url: /sv/net/aspose.pdf.facades/pdfcontenteditor/createlocallink/
---
## CreateLocalLink(Rectangle, int, int, Color, Enum[]) {#createlocallink_2}

Skapar en lokal länk i PDF-dokument.

```csharp
public void CreateLocalLink(Rectangle rect, int desPage, int originalPage, Color clr, 
    Enum[] actionName)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| rect | Rectangle | Rektangeln för aktivt klick. |
| desPage | Int32 | Målsidan. |
| originalPage | Int32 | Antalet originalsidor där rektangel bunden med lokal länk kommer att skapas. |
| clr | Color | Färgen på rektangeln för aktivt klick. |
| actionName | Enum[] | Den array av åtgärder (medlemmar i PredefinedAction enum) som motsvarar exekvering av menyalternativ i Acrobat Viewer. |

### Exempel

```csharp
PdfContentEditor editor = new PdfContentEditor();
editor.BindPdf("example.pdf");
editor.CreateLocalLink(new System.Drawing.Rectangle(0, 0, 100, 100),
    2, 1, System.Drawing.Color.Red,
    new Enum[] { PredefinedAction.FirstPage, PredefinedAction.PrintDialog });
editor.Save("example_out.pdf");
```

### Se även

* class [PdfContentEditor](../../pdfcontenteditor)
* namnutrymme [Aspose.Pdf.Facades](../../pdfcontenteditor)
* hopsättning [Aspose.PDF](../../../)

---

## CreateLocalLink(Rectangle, int, int, Color) {#createlocallink_1}

Skapar en lokal länk i PDF-dokument.

```csharp
public void CreateLocalLink(Rectangle rect, int desPage, int originalPage, Color clr)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| rect | Rectangle | Rektangeln för aktivt klick. |
| desPage | Int32 | Målsidan. |
| originalPage | Int32 | Antalet originalsidor där rektangel bunden med lokal länk kommer att skapas. |
| clr | Color | Färgen på rektangeln för aktivt klick. |

### Exempel

```csharp
PdfContentEditor editor = new PdfContentEditor();
editor.BindPdf("example.pdf");
editor.CreateLocalLink(new System.Drawing.Rectangle(0, 0, 100, 100),
    2, 1, System.Drawing.Color.Red });
editor.Save("example_out.pdf");
```

### Se även

* class [PdfContentEditor](../../pdfcontenteditor)
* namnutrymme [Aspose.Pdf.Facades](../../pdfcontenteditor)
* hopsättning [Aspose.PDF](../../../)

---

## CreateLocalLink(Rectangle, int, int) {#createlocallink}

Skapar en lokal länk i PDF-dokument.

```csharp
public void CreateLocalLink(Rectangle rect, int desPage, int originalPage)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| rect | Rectangle | Rektangeln för aktivt klick. |
| desPage | Int32 | Målsidan. |
| originalPage | Int32 | Antalet originalsidor där rektangel bunden med lokal länk kommer att skapas. |

### Exempel

```csharp
PdfContentEditor editor = new PdfContentEditor();
editor.BindPdf("example.pdf");
editor.CreateLocalLink(new System.Drawing.Rectangle(0, 0, 100, 100), 2, 1});
editor.Save("example_out.pdf");
```

### Se även

* class [PdfContentEditor](../../pdfcontenteditor)
* namnutrymme [Aspose.Pdf.Facades](../../pdfcontenteditor)
* hopsättning [Aspose.PDF](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.PDF.dll -->
