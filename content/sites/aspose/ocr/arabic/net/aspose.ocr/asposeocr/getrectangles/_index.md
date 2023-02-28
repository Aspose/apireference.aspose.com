---
title: AsposeOcr.GetRectangles
second_title: Aspose.OCR لمرجع .NET API
description: AsposeOcr طريقة. يكتشف مناطق النص في الصورة .  لا يتم تطبيق التصحيح التلقائي لانحراف الصورة. يدعم GIF و PNG و JPEG و BMP و TIFF و JFIF.
type: docs
weight: 70
url: /ar/net/aspose.ocr/asposeocr/getrectangles/
---
## GetRectangles(string, AreasType, bool) {#getrectangles_1}

يكتشف مناطق النص في الصورة .  لا يتم تطبيق التصحيح التلقائي لانحراف الصورة. يدعم GIF و PNG و JPEG و BMP و TIFF و JFIF.

```csharp
public List<Rectangle> GetRectangles(string fullPath, AreasType areasType = AreasType.PARAGRAPHS, 
    bool detectAreas = true)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| fullPath | String | مسار الصورة. |
| areasType | AreasType | يحدد المستطيلات التي تريد إرجاعها - سطر أو فقرات. |
| detectAreas | Boolean | تفعيل الكشف التلقائي عن مناطق النص. |

### قيمة الإرجاع

قائمة مناطق النص المكتشفة أو الخطوط.

### أنظر أيضا

* enum [AreasType](../../areastype/)
* class [AsposeOcr](../)
* مساحة الاسم [Aspose.OCR](../../asposeocr/)
* المجسم [Aspose.OCR](../../../)

---

## GetRectangles(MemoryStream, AreasType, bool) {#getrectangles}

يكتشف مناطق النص في الصورة .  لا يتم تطبيق التصحيح التلقائي لانحراف الصورة. يدعم GIF و PNG و JPEG و BMP و TIFF و JFIF.

```csharp
public List<Rectangle> GetRectangles(MemoryStream image, 
    AreasType areasType = AreasType.PARAGRAPHS, bool detectAreas = true)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| image | MemoryStream | تيار الذاكرة الذي يحتوي على الصورة. |
| areasType | AreasType | يحدد المستطيلات التي تريد إرجاعها - سطر أو فقرات. |
| detectAreas | Boolean | تفعيل الكشف التلقائي عن مناطق النص. |

### قيمة الإرجاع

قائمة مناطق النص المكتشفة أو الخطوط.

### أنظر أيضا

* enum [AreasType](../../areastype/)
* class [AsposeOcr](../)
* مساحة الاسم [Aspose.OCR](../../asposeocr/)
* المجسم [Aspose.OCR](../../../)


