---
title: Bitmap
second_title: Aspose.Drawing لمرجع NET API
description: يقوم بتهيئة مثيل جديد لملفBitmapsystem.drawing/bitmap فئة بالحجم المحدد.
type: docs
weight: 10
url: /ar/net/system.drawing/bitmap/bitmap/
---
## Bitmap(int, int) {#constructor}

يقوم بتهيئة مثيل جديد لملف[`Bitmap`](../../bitmap) فئة بالحجم المحدد.

```csharp
public Bitmap(int width, int height)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| width | Int32 | عرض الصورة النقطية الجديدة بالبكسل. |
| height | Int32 | ارتفاع الصورة النقطية الجديدة بالبكسل. |

### ملاحظات

تنسيق الصورة النقطية الداخلي الوحيد المدعوم حاليًا يعادل`تنسيق PixelFormat32bppPArgb` .

### أنظر أيضا

* class [Bitmap](../../bitmap)
* مساحة الاسم [System.Drawing](../../bitmap)
* المجسم [Aspose.Drawing](../../../)

---

## Bitmap(string) {#constructor_8}

يقوم بتهيئة مثيل جديد لملف[`Bitmap`](../../bitmap) فئة من الملف المحدد.

```csharp
public Bitmap(string filename)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| filename | String | اسم ملف الصورة النقطية. |

### أنظر أيضا

* class [Bitmap](../../bitmap)
* مساحة الاسم [System.Drawing](../../bitmap)
* المجسم [Aspose.Drawing](../../../)

---

## Bitmap(string, bool) {#constructor_9}

يقوم بتهيئة مثيل جديد لملف[`Bitmap`](../../bitmap) فئة من الملف المحدد.

```csharp
public Bitmap(string filename, bool useIcm)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| filename | String | اسم ملف الصورة النقطية. |
| useIcm | Boolean | صحيح أن استخدام تصحيح الألوان لهذا الغرضBitmap؛ خلاف ذلك ، خطأ. |

### أنظر أيضا

* class [Bitmap](../../bitmap)
* مساحة الاسم [System.Drawing](../../bitmap)
* المجسم [Aspose.Drawing](../../../)

---

## Bitmap(Stream) {#constructor_6}

يقوم بتهيئة مثيل جديد لملف[`Bitmap`](../../bitmap) فئة من دفق البيانات المحدد.

```csharp
public Bitmap(Stream stream)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| stream | Stream | دفق البيانات المستخدم لتحميل الصورة. |

### أنظر أيضا

* class [Bitmap](../../bitmap)
* مساحة الاسم [System.Drawing](../../bitmap)
* المجسم [Aspose.Drawing](../../../)

---

## Bitmap(Stream, bool) {#constructor_7}

يقوم بتهيئة مثيل جديد لملف[`Bitmap`](../../bitmap) فئة من دفق البيانات المحدد.

```csharp
public Bitmap(Stream stream, bool useIcm)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| stream | Stream | دفق البيانات المستخدم لتحميل الصورة. |
| useIcm | Boolean | `حقيقي` لاستخدام تصحيح الألوان لهذا الغرضBitmap ؛ خلاف ذلك،`خاطئة`. |

### أنظر أيضا

* class [Bitmap](../../bitmap)
* مساحة الاسم [System.Drawing](../../bitmap)
* المجسم [Aspose.Drawing](../../../)

---

## Bitmap(int, int, PixelFormat) {#constructor_2}

يقوم بتهيئة مثيل جديد لملف[`Bitmap`](../../bitmap) فئة بالحجم والتنسيق المحددين.

```csharp
public Bitmap(int width, int height, PixelFormat format)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| width | Int32 | العرض بالبكسل الجديدBitmap. |
| height | Int32 | الارتفاع بالبكسل الجديدBitmap. |
| format | PixelFormat | الPixelFormat تعداد جديدBitmap. |

### أنظر أيضا

* enum [PixelFormat](../../../system.drawing.imaging/pixelformat)
* class [Bitmap](../../bitmap)
* مساحة الاسم [System.Drawing](../../bitmap)
* المجسم [Aspose.Drawing](../../../)

---

## Bitmap(int, int, int, PixelFormat, int[]) {#constructor_1}

يقوم بتهيئة مثيل جديد لملف[`Bitmap`](../../bitmap) فئة بالحجم المحدد وبيانات البكسل.

```csharp
public Bitmap(int width, int height, int stride, PixelFormat format, int[] data)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| width | Int32 | العرض بالبكسل الجديدBitmap. |
| height | Int32 | الارتفاع بالبكسل الجديدBitmap. |
| stride | Int32 | يجب أن تكون إزاحة البايت بين بداية سطر مسح وما يليه من مضاعفات أربعة. |
| format | PixelFormat | الPixelFormat تعداد جديدBitmap. |
| data | Int32[] | بيانات البكسل. |

### أنظر أيضا

* enum [PixelFormat](../../../system.drawing.imaging/pixelformat)
* class [Bitmap](../../bitmap)
* مساحة الاسم [System.Drawing](../../bitmap)
* المجسم [Aspose.Drawing](../../../)

---

## Bitmap(Image) {#constructor_3}

يقوم بتهيئة مثيل جديد لملف[`Bitmap`](../../bitmap) فئة من الصورة الحالية المحددة.

```csharp
public Bitmap(Image original)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| original | Image | الImage التي يتم إنشاء الجديد منهاBitmap. |

### أنظر أيضا

* class [Image](../../image)
* class [Bitmap](../../bitmap)
* مساحة الاسم [System.Drawing](../../bitmap)
* المجسم [Aspose.Drawing](../../../)

---

## Bitmap(Image, Size) {#constructor_5}

يقوم بتهيئة مثيل جديد لملف[`Bitmap`](../../bitmap)فئة من الصورة الحالية المحددة ، مع تغيير حجمها إلى الحجم المحدد.

```csharp
public Bitmap(Image original, Size newSize)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| original | Image | الImage التي يتم إنشاء الجديد منهاBitmap |
| newSize | Size | الSize الهيكل الذي يمثل حجم الجديدBitmap. |

### أنظر أيضا

* class [Image](../../image)
* struct [Size](../../size)
* class [Bitmap](../../bitmap)
* مساحة الاسم [System.Drawing](../../bitmap)
* المجسم [Aspose.Drawing](../../../)

---

## Bitmap(Image, int, int) {#constructor_4}

يقوم بتهيئة مثيل جديد لملف[`Bitmap`](../../bitmap) فئة من الصورة الحالية المحددة ، تحجيمها إلى الحجم المحدد.

```csharp
public Bitmap(Image original, int width, int height)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| original | Image | الImage التي يتم إنشاء الجديد منهاBitmap. |
| width | Int32 | العرض بالبكسل الجديدBitmap. |
| height | Int32 | الارتفاع بالبكسل الجديدBitmap. |

### أنظر أيضا

* class [Image](../../image)
* class [Bitmap](../../bitmap)
* مساحة الاسم [System.Drawing](../../bitmap)
* المجسم [Aspose.Drawing](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
