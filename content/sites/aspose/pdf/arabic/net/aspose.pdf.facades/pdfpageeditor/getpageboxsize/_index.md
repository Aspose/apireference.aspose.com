---
title: GetPageBoxSize
second_title: Aspose.PDF لمرجع .NET API
description: إرجاع حجم المربع المحدد في المستند.
type: docs
weight: 130
url: /ar/net/aspose.pdf.facades/pdfpageeditor/getpageboxsize/
---
## PdfPageEditor.GetPageBoxSize method

إرجاع حجم المربع المحدد في المستند.

```csharp
public Rectangle GetPageBoxSize(int page, string pageBoxName)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| page | Int32 | فهرس الصفحة. صفحات الوثيقة مرقمة من 1. |
| pageBoxName | String | اسم نوع المربع. القيم الصالحة هي: "art"، "bleed"، "crop"، "media"، "trim". |

### قيمة الإرجاع

المستطيل الذي يحتوي على المربع المطلوب.

### أمثلة

يوضح المثال التالي كيفية الحصول على مربع الوسائط للصفحة الأولى:

```csharp
PdfPageEditor editor = new PdfPageEditor();
editor.BindPdf("sample.pdf");
System.Drawing.Rectangle rect = editor.GetBoxSize(1, "media");
```

### أنظر أيضا

* class [PdfPageEditor](../../pdfpageeditor)
* مساحة الاسم [Aspose.Pdf.Facades](../../pdfpageeditor)
* المجسم [Aspose.PDF](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.PDF.dll -->
