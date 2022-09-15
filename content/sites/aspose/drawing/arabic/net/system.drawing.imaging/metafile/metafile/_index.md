---
title: Metafile
second_title: Aspose.Drawing لمرجع NET API
description: يقوم بتهيئة مثيل جديد لملفMetafilesystem.drawing.imaging/metafile فئة من المقبض المحدد.
type: docs
weight: 10
url: /ar/net/system.drawing.imaging/metafile/metafile/
---
## Metafile(IntPtr, bool) {#constructor}

يقوم بتهيئة مثيل جديد لملف[`Metafile`](../../metafile) فئة من المقبض المحدد.

```csharp
public Metafile(IntPtr henhmetafile, bool deleteEmf)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| henhmetafile | IntPtr | مقبض إلى ملف تعريف محسّن. |
| deleteEmf | Boolean | صحيح لحذف مؤشر ملف التعريف المحسن when theMetafile يتم حذف؛ خلاف ذلك ، خطأ. |

### أنظر أيضا

* class [Metafile](../../metafile)
* مساحة الاسم [System.Drawing.Imaging](../../metafile)
* المجسم [Aspose.Drawing](../../../)

---

## Metafile(IntPtr, EmfType) {#constructor_1}

يقوم بتهيئة مثيل جديد لملف[`Metafile`](../../metafile) فئة من المقبض المحدد إلى سياق الجهاز وEmfTypeالتعداد الذي يحدد تنسيقMetafile .

```csharp
public Metafile(IntPtr referenceHdc, EmfType emfType)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| referenceHdc | IntPtr | المؤشر إلى سياق الجهاز. |
| emfType | EmfType | انEmfType التي تحدد تنسيقMetafile. |

### أنظر أيضا

* enum [EmfType](../../emftype)
* class [Metafile](../../metafile)
* مساحة الاسم [System.Drawing.Imaging](../../metafile)
* المجسم [Aspose.Drawing](../../../)

---

## Metafile(string) {#constructor_6}

يقوم بتهيئة مثيل جديد لملف[`Metafile`](../../metafile) فئة من اسم الملف المحدد.

```csharp
public Metafile(string filename)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| filename | String | أString الذي يمثل اسم الملف الذي يتم إنشاء ملفMetafile. |

### أنظر أيضا

* class [Metafile](../../metafile)
* مساحة الاسم [System.Drawing.Imaging](../../metafile)
* المجسم [Aspose.Drawing](../../../)

---

## Metafile(string, IntPtr) {#constructor_7}

يقوم بتهيئة مثيل جديد لملف[`Metafile`](../../metafile) فئة من اسم الملف المحدد.

```csharp
public Metafile(string filename, IntPtr referenceHdc)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| filename | String | أString الذي يمثل اسم الملف الذي يتم إنشاء ملفMetafile. |
| referenceHdc | IntPtr | تعامل Windows مع سياق الجهاز. |

### أنظر أيضا

* class [Metafile](../../metafile)
* مساحة الاسم [System.Drawing.Imaging](../../metafile)
* المجسم [Aspose.Drawing](../../../)

---

## Metafile(Stream) {#constructor_2}

يقوم بتهيئة مثيل جديد لملف[`Metafile`](../../metafile) فئة من دفق البيانات المحدد.

```csharp
public Metafile(Stream stream)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| stream | Stream | الStream التي يتم من خلالها create الجديدMetafile. |

### أنظر أيضا

* class [Metafile](../../metafile)
* مساحة الاسم [System.Drawing.Imaging](../../metafile)
* المجسم [Aspose.Drawing](../../../)

---

## Metafile(Stream, IntPtr) {#constructor_3}

يقوم بتهيئة مثيل جديد لملف[`Metafile`](../../metafile) فئة من دفق البيانات المحدد ومقبض Windows إلى سياق الجهاز. /&gt;.

```csharp
public Metafile(Stream stream, IntPtr referenceHdc)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| stream | Stream | أStream الذي يحتوي على البيانات لـ thisMetafile. |
| referenceHdc | IntPtr | يتعامل Windows مع سياق جهاز لـMetafile هدف. |

### أنظر أيضا

* class [Metafile](../../metafile)
* مساحة الاسم [System.Drawing.Imaging](../../metafile)
* المجسم [Aspose.Drawing](../../../)

---

## Metafile(Stream, IntPtr, EmfType) {#constructor_4}

يقوم بتهيئة مثيل جديد لملف[`Metafile`](../../metafile) فئة من دفق البيانات المحدد ، مقبض Windows لسياق الجهاز ، وEmfType enumeration الذي يحدد تنسيق ملفMetafile .

```csharp
public Metafile(Stream stream, IntPtr referenceHdc, EmfType type)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| stream | Stream | أStream الذي يحتوي على البيانات لـ thisMetafile. |
| referenceHdc | IntPtr | تعامل Windows مع سياق الجهاز. |
| type | EmfType | انEmfType الذي يحدد format الخاص بـMetafile. |

### أنظر أيضا

* enum [EmfType](../../emftype)
* class [Metafile](../../metafile)
* مساحة الاسم [System.Drawing.Imaging](../../metafile)
* المجسم [Aspose.Drawing](../../../)

---

## Metafile(Stream, IntPtr, RectangleF, MetafileFrameUnit, EmfType) {#constructor_5}

يقوم بتهيئة مثيل جديد لملف[`Metafile`](../../metafile) فئة من دفق البيانات المحدد ، مقبض Windows لسياق الجهاز ، وEmfType enumeration الذي يحدد تنسيق ملفMetafile .

```csharp
public Metafile(Stream stream, IntPtr referenceHdc, RectangleF frameRect, 
    MetafileFrameUnit frameUnit, EmfType type)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| stream | Stream | أStream الذي يحتوي على البيانات لـ thisMetafile. |
| referenceHdc | IntPtr | تعامل Windows مع سياق الجهاز. |
| frameRect | RectangleF | أRectangle الذي يمثل المستطيل الذي يحد الجديدMetafile . |
| frameUnit | MetafileFrameUnit | أMetafileFrameUnit التي تحدد وحدة قياس frameRect. |
| type | EmfType | انEmfType الذي يحدد format الخاص بـMetafile. |

### أنظر أيضا

* struct [RectangleF](../../../system.drawing/rectanglef)
* enum [MetafileFrameUnit](../../metafileframeunit)
* enum [EmfType](../../emftype)
* class [Metafile](../../metafile)
* مساحة الاسم [System.Drawing.Imaging](../../metafile)
* المجسم [Aspose.Drawing](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
