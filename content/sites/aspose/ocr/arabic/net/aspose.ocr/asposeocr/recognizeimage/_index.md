---
title: AsposeOcr.RecognizeImage
second_title: Aspose.OCR لمرجع .NET API
description: AsposeOcr طريقة. يتعرف على النص على الصورة.
type: docs
weight: 140
url: /ar/net/aspose.ocr/asposeocr/recognizeimage/
---
## RecognizeImage(string) {#recognizeimage_5}

يتعرف على النص على الصورة.

```csharp
public string RecognizeImage(string fullPath)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| fullPath | String | مسار الصورة. |

### قيمة الإرجاع

نص تم التعرف عليه.

### ملاحظات

يستخدم التصحيح التلقائي لانحراف الصورة واكتشاف مناطق النص. يدعم GIF و PNG و JPEG و BMP و TIFF و JFIF.

### أنظر أيضا

* class [AsposeOcr](../)
* مساحة الاسم [Aspose.OCR](../../asposeocr/)
* المجسم [Aspose.OCR](../../../)

---

## RecognizeImage(string, RecognitionSettings) {#recognizeimage_3}

يتعرف على النص على الصورة.

```csharp
public RecognitionResult RecognizeImage(string fullPath, RecognitionSettings settings)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| fullPath | String | مسار الصورة. |
| settings | RecognitionSettings | إعدادات التعرف. |

### قيمة الإرجاع

ال[`RecognitionResult`](../../recognitionresult/) مع نتائج التعرف على الصور.

### ملاحظات

يتعرف على الصورة مع إمكانية التحديد[`RecognitionSettings`](../../recognitionsettings/) . يدعم GIF و PNG و JPEG و BMP و TIFF و JFIF.

### أنظر أيضا

* class [RecognitionResult](../../recognitionresult/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* مساحة الاسم [Aspose.OCR](../../asposeocr/)
* المجسم [Aspose.OCR](../../../)

---

## RecognizeImage(MemoryStream) {#recognizeimage_4}

يتعرف على النص على الصورة.

```csharp
public string RecognizeImage(MemoryStream stream)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| stream | MemoryStream | تيار الذاكرة الذي يحتوي على الصورة. |

### قيمة الإرجاع

نص تم التعرف عليه.

### ملاحظات

يستخدم التصحيح التلقائي لانحراف الصورة واكتشاف مناطق النص. يدعم GIF و PNG و JPEG و BMP و TIFF و JFIF.

### أنظر أيضا

* class [AsposeOcr](../)
* مساحة الاسم [Aspose.OCR](../../asposeocr/)
* المجسم [Aspose.OCR](../../../)

---

## RecognizeImage(MemoryStream, RecognitionSettings) {#recognizeimage_2}

يتعرف على النص على الصورة.  يتعرف على الصورة مع إمكانية التحديد[`RecognitionSettings`](../../recognitionsettings/) . يدعم GIF و PNG و JPEG و BMP و TIFF و JFIF.

```csharp
public RecognitionResult RecognizeImage(MemoryStream stream, RecognitionSettings settings)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| stream | MemoryStream | تيار الذاكرة الذي يحتوي على الصورة. |
| settings | RecognitionSettings | إعدادات التعرف. |

### قيمة الإرجاع

ال[`RecognitionResult`](../../recognitionresult/) مع نتائج التعرف على الصور.

### أنظر أيضا

* class [RecognitionResult](../../recognitionresult/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* مساحة الاسم [Aspose.OCR](../../asposeocr/)
* المجسم [Aspose.OCR](../../../)

---

## RecognizeImage(byte[], int, int, PixelType, RecognitionSettings) {#recognizeimage_1}

يتعرف على النص على الصورة.

```csharp
public RecognitionResult RecognizeImage(byte[] imageData, int width, int height, 
    PixelType pixelFormat, RecognitionSettings settings = null)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| imageData | Byte[] | صورة مفككة في صفيف بايت. يستخدم تقنية الإضاءة RGB لـ bitsPerPixel&gt; 1. |
| width | Int32 | عرض الصورة. |
| height | Int32 | ارتفاع الصورة. |
| pixelFormat | PixelType | يدعم بايت ، rgb ، bgr ، rgba. |
| settings | RecognitionSettings | إعدادات التعرف. |

### قيمة الإرجاع

ال[`RecognitionResult`](../../recognitionresult/) مع نتائج التعرف على الصور.

### ملاحظات

يتعرف على الصورة مع إمكانية التحديد[`RecognitionSettings`](../../recognitionsettings/) . يدعم بيانات البايت التي تم فك ترميزها .

### أنظر أيضا

* class [RecognitionResult](../../recognitionresult/)
* enum [PixelType](../../pixeltype/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* مساحة الاسم [Aspose.OCR](../../asposeocr/)
* المجسم [Aspose.OCR](../../../)

---

## RecognizeImage(Color[], int, int, RecognitionSettings) {#recognizeimage}

يتعرف على النص على الصورة.

```csharp
public RecognitionResult RecognizeImage(Color[] imageData, int width, int height, 
    RecognitionSettings settings = null)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| imageData | Color[] | تم فك ترميز الصورة في مجموعة Aspose.Drawing.Color. |
| width | Int32 | عرض الصورة. |
| height | Int32 | ارتفاع الصورة. |
| settings | RecognitionSettings | إعدادات التعرف. |

### قيمة الإرجاع

ال[`RecognitionResult`](../../recognitionresult/) مع نتائج التعرف على الصور.

### ملاحظات

يتعرف على الصورة مع إمكانية التحديد[`RecognitionSettings`](../../recognitionsettings/) . يدعم بيانات البايت التي تم فك ترميزها .

### أنظر أيضا

* class [RecognitionResult](../../recognitionresult/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* مساحة الاسم [Aspose.OCR](../../asposeocr/)
* المجسم [Aspose.OCR](../../../)


