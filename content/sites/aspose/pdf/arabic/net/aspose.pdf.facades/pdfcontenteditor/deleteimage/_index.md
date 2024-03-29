---
title: DeleteImage
second_title: Aspose.PDF لمرجع .NET API
description: حذف الصور المحددة في الصفحة المحددة.
type: docs
weight: 320
url: /ar/net/aspose.pdf.facades/pdfcontenteditor/deleteimage/
---
## DeleteImage(int, int[]) {#deleteimage_1}

حذف الصور المحددة في الصفحة المحددة.

```csharp
public void DeleteImage(int pageNumber, int[] index)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| pageNumber | Int32 | عدد الصفحات التي يجب حذف الصور عليها. |
| index | Int32[] | مصفوفة تمثل فهارس الصور. |

### أمثلة

```csharp
PdfContentEditor editor = new PdfContentEditor();
editor.BindPdf("example.pdf");
editor.DeleteImage(1, new int[] {1, 2});
editor.Save("example_out.pdf");
```

### أنظر أيضا

* class [PdfContentEditor](../../pdfcontenteditor)
* مساحة الاسم [Aspose.Pdf.Facades](../../pdfcontenteditor)
* المجسم [Aspose.PDF](../../../)

---

## DeleteImage() {#deleteimage}

حذف كافة الصور من مستند PDF .

```csharp
public void DeleteImage()
```

### أمثلة

```csharp
PdfContentEditor editor = new PdfContentEditor();
editor.BindPdf("example.pdf");
editor.DeleteImage();
editor.Save("example_out.pdf");
```

### أنظر أيضا

* class [PdfContentEditor](../../pdfcontenteditor)
* مساحة الاسم [Aspose.Pdf.Facades](../../pdfcontenteditor)
* المجسم [Aspose.PDF](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.PDF.dll -->
