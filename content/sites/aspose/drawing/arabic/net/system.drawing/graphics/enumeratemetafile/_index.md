---
title: EnumerateMetafile
second_title: Aspose.Drawing لمرجع NET API
description: يرسل السجلات في الملف المحددMetafilesystem.drawing.imaging/metafile  واحدًا تلو الآخر  إلى طريقة رد الاتصال للعرض عند نقطة محددة باستخدام سمات الصورة المحددة.
type: docs
weight: 460
url: /ar/net/system.drawing/graphics/enumeratemetafile/
---
## EnumerateMetafile(Metafile, PointF, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_8}

يرسل السجلات في الملف المحدد[`Metafile`](../../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض عند نقطة محددة باستخدام سمات الصورة المحددة.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, EnumerateMetafileProc callback, 
    IntPtr callbackData, ImageAttributes imageAttr)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) لتعداد. |
| destPoint | PointF | [`PointF`](../../pointf) البنية التي تحدد موقع الزاوية العلوية اليسرى من ملف التعريف المرسوم. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) المفوض الذي يحدد الطريقة التي يتم إرسال سجلات ملف التعريف إليها. |
| callbackData | IntPtr | مؤشر داخلي مطلوب ، لكن تم تجاهله. يمكنك تمريرZero لهذه المعلمة. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) يحدد معلومات سمة الصورة للصورة المرسومة. |

### أنظر أيضا

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* مساحة الاسم [System.Drawing](../../graphics)
* المجسم [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_7}

يرسل السجلات في الملف المحدد[`Metafile`](../../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض عند نقطة محددة.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, EnumerateMetafileProc callback, 
    IntPtr callbackData)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) لتعداد. |
| destPoint | PointF | [`PointF`](../../pointf) البنية التي تحدد موقع الزاوية العلوية اليسرى من ملف التعريف المرسوم. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) المفوض الذي يحدد الطريقة التي يتم إرسال سجلات ملف التعريف إليها. |
| callbackData | IntPtr | مؤشر داخلي مطلوب ، لكن تم تجاهله. يمكنك تمريرZero لهذه المعلمة. |

### أنظر أيضا

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* مساحة الاسم [System.Drawing](../../graphics)
* المجسم [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], EnumerateMetafileProc) {#enumeratemetafile_12}

يرسل السجلات في الملف المحدد[`Metafile`](../../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض في متوازي أضلاع محدد.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, 
    EnumerateMetafileProc callback)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) لتعداد. |
| destPoints | PointF[] | مجموعة من ثلاثة[`PointF`](../../pointf) الهياكل التي تحدد متوازي الأضلاع الذي يحدد حجم وموقع ملف التعريف المرسوم. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) المفوض الذي يحدد الطريقة التي يتم إرسال سجلات ملف التعريف إليها. |

### أنظر أيضا

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* مساحة الاسم [System.Drawing](../../graphics)
* المجسم [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, EnumerateMetafileProc) {#enumeratemetafile}

يرسل السجلات في الملف المحدد[`Metafile`](../../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض عند نقطة محددة.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, EnumerateMetafileProc callback)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) لتعداد. |
| destPoint | Point | [`Point`](../../point) البنية التي تحدد موقع الزاوية العلوية اليسرى من ملف التعريف المرسوم. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) المفوض الذي يحدد الطريقة التي يتم إرسال سجلات ملف التعريف إليها. |

### أنظر أيضا

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* مساحة الاسم [System.Drawing](../../graphics)
* المجسم [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_1}

يرسل السجلات في الملف المحدد[`Metafile`](../../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض عند نقطة محددة.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, EnumerateMetafileProc callback, 
    IntPtr callbackData)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) لتعداد. |
| destPoint | Point | [`Point`](../../point) البنية التي تحدد موقع الزاوية العلوية اليسرى من ملف التعريف المرسوم. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) المفوض الذي يحدد الطريقة التي يتم إرسال سجلات ملف التعريف إليها. |
| callbackData | IntPtr | مؤشر داخلي مطلوب ، لكن تم تجاهله. يمكنك تمريرZero لهذه المعلمة. |

### أنظر أيضا

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* مساحة الاسم [System.Drawing](../../graphics)
* المجسم [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_2}

يرسل السجلات في الملف المحدد[`Metafile`](../../../system.drawing.imaging/metafile)، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض عند نقطة محددة باستخدام سمات الصورة المحددة.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, EnumerateMetafileProc callback, 
    IntPtr callbackData, ImageAttributes imageAttr)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) لتعداد. |
| destPoint | Point | [`Point`](../../point) البنية التي تحدد موقع الزاوية العلوية اليسرى من ملف التعريف المرسوم. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) المفوض الذي يحدد الطريقة التي يتم إرسال سجلات ملف التعريف إليها. |
| callbackData | IntPtr | مؤشر داخلي مطلوب ، لكن تم تجاهله. يمكنك تمريرZero لهذه المعلمة. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) يحدد معلومات سمة الصورة للصورة المرسومة. |

### أنظر أيضا

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* مساحة الاسم [System.Drawing](../../graphics)
* المجسم [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, EnumerateMetafileProc) {#enumeratemetafile_30}

يرسل سجلات[`Metafile`](../../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض في مستطيل محدد.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, 
    EnumerateMetafileProc callback)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) لتعداد. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef) البنية التي تحدد موقع وحجم ملف التعريف المرسوم. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) المفوض الذي يحدد الطريقة التي يتم إرسال سجلات ملف التعريف إليها. |

### أنظر أيضا

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [RectangleF](../../rectanglef)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* مساحة الاسم [System.Drawing](../../graphics)
* المجسم [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_31}

يرسل سجلات[`Metafile`](../../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض في مستطيل محدد.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, 
    EnumerateMetafileProc callback, IntPtr callbackData)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) لتعداد. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef) البنية التي تحدد موقع وحجم ملف التعريف المرسوم. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) المفوض الذي يحدد الطريقة التي يتم إرسال سجلات ملف التعريف إليها. |
| callbackData | IntPtr | مؤشر داخلي مطلوب ، لكن تم تجاهله. يمكنك تمريرZero لهذه المعلمة. |

### أنظر أيضا

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [RectangleF](../../rectanglef)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* مساحة الاسم [System.Drawing](../../graphics)
* المجسم [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_32}

يرسل سجلات[`Metafile`](../../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض في مستطيل محدد باستخدام سمات الصورة المحددة.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, 
    EnumerateMetafileProc callback, IntPtr callbackData, ImageAttributes imageAttr)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) لتعداد. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef) البنية التي تحدد موقع وحجم ملف التعريف المرسوم. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) المفوض الذي يحدد الطريقة التي يتم إرسال سجلات ملف التعريف إليها. |
| callbackData | IntPtr | مؤشر داخلي مطلوب ، لكن تم تجاهله. يمكنك تمريرZero لهذه المعلمة. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) يحدد معلومات سمة الصورة للصورة المرسومة. |

### أنظر أيضا

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [RectangleF](../../rectanglef)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* مساحة الاسم [System.Drawing](../../graphics)
* المجسم [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, EnumerateMetafileProc) {#enumeratemetafile_24}

يرسل سجلات[`Metafile`](../../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض في مستطيل محدد.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, EnumerateMetafileProc callback)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) لتعداد. |
| destRect | Rectangle | [`Rectangle`](../../rectangle) البنية التي تحدد موقع وحجم ملف التعريف المرسوم. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) المفوض الذي يحدد الطريقة التي يتم إرسال سجلات ملف التعريف إليها. |

### أنظر أيضا

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Rectangle](../../rectangle)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* مساحة الاسم [System.Drawing](../../graphics)
* المجسم [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, EnumerateMetafileProc) {#enumeratemetafile_6}

يرسل السجلات في الملف المحدد[`Metafile`](../../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض عند نقطة محددة.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, EnumerateMetafileProc callback)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) لتعداد. |
| destPoint | PointF | [`PointF`](../../pointf) البنية التي تحدد موقع الزاوية العلوية اليسرى من ملف التعريف المرسوم. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) المفوض الذي يحدد الطريقة التي يتم إرسال سجلات ملف التعريف إليها. |

### أنظر أيضا

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* مساحة الاسم [System.Drawing](../../graphics)
* المجسم [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], EnumerateMetafileProc, IntPtr) {#enumeratemetafile_13}

يرسل السجلات في الملف المحدد[`Metafile`](../../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض في متوازي أضلاع محدد.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, 
    EnumerateMetafileProc callback, IntPtr callbackData)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) لتعداد. |
| destPoints | PointF[] | مجموعة من ثلاثة[`PointF`](../../pointf) الهياكل التي تحدد متوازي الأضلاع الذي يحدد حجم وموقع ملف التعريف المرسوم. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) المفوض الذي يحدد الطريقة التي يتم إرسال سجلات ملف التعريف إليها. |
| callbackData | IntPtr | مؤشر داخلي مطلوب ، لكن تم تجاهله. يمكنك تمريرZero لهذه المعلمة. |

### أنظر أيضا

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* مساحة الاسم [System.Drawing](../../graphics)
* المجسم [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], EnumerateMetafileProc, IntPtr) {#enumeratemetafile_19}

يرسل السجلات في الملف المحدد[`Metafile`](../../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض في متوازي أضلاع محدد.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, 
    EnumerateMetafileProc callback, IntPtr callbackData)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) لتعداد. |
| destPoints | Point[] | مجموعة من ثلاثة[`Point`](../../point) الهياكل التي تحدد متوازي الأضلاع الذي يحدد حجم وموقع ملف التعريف المرسوم. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) المفوض الذي يحدد الطريقة التي يتم إرسال سجلات ملف التعريف إليها. |
| callbackData | IntPtr | مؤشر داخلي مطلوب ، لكن تم تجاهله. يمكنك تمريرZero لهذه المعلمة. |

### أنظر أيضا

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* مساحة الاسم [System.Drawing](../../graphics)
* المجسم [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], EnumerateMetafileProc) {#enumeratemetafile_18}

يرسل السجلات في الملف المحدد[`Metafile`](../../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض في متوازي أضلاع محدد.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, EnumerateMetafileProc callback)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) لتعداد. |
| destPoints | Point[] | مجموعة من ثلاثة[`Point`](../../point) الهياكل التي تحدد متوازي الأضلاع الذي يحدد حجم وموقع ملف التعريف المرسوم. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) المفوض الذي يحدد الطريقة التي يتم إرسال سجلات ملف التعريف إليها. |

### أنظر أيضا

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* مساحة الاسم [System.Drawing](../../graphics)
* المجسم [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_23}

يرسل السجلات في مستطيل محدد من ملف[`Metafile`](../../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض في متوازي أضلاع محدد باستخدام سمات الصورة المحددة.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, Rectangle srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) لتعداد. |
| destPoints | Point[] | مجموعة من ثلاثة[`Point`](../../point) الهياكل التي تحدد متوازي الأضلاع الذي يحدد حجم وموقع ملف التعريف المرسوم. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) البنية التي تحدد جزء ملف التعريف ، بالنسبة إلى الزاوية العلوية اليسرى ، للرسم. |
| unit | GraphicsUnit | عضو في[`GraphicsUnit`](../../graphicsunit) التعداد الذي يحدد وحدة القياس المستخدمة لتحديد جزء ملف التعريف الذي يحدده المستطيل*srcRect* تحتوي المعلمة. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) المفوض الذي يحدد الطريقة التي يتم إرسال سجلات ملف التعريف إليها. |
| callbackData | IntPtr | مؤشر داخلي مطلوب ، لكن تم تجاهله. يمكنك تمريرZero لهذه المعلمة. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) يحدد معلومات سمة الصورة للصورة المرسومة. |

### أنظر أيضا

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* مساحة الاسم [System.Drawing](../../graphics)
* المجسم [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_22}

يرسل السجلات في مستطيل محدد من ملف[`Metafile`](../../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض في متوازي أضلاع محدد.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) لتعداد. |
| destPoints | Point[] | مجموعة من ثلاثة[`Point`](../../point) الهياكل التي تحدد متوازي الأضلاع الذي يحدد حجم وموقع ملف التعريف المرسوم. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) البنية التي تحدد جزء ملف التعريف ، بالنسبة إلى الزاوية العلوية اليسرى ، للرسم. |
| srcUnit | GraphicsUnit | عضو في[`GraphicsUnit`](../../graphicsunit) التعداد الذي يحدد وحدة القياس المستخدمة لتحديد جزء ملف التعريف الذي يحدده المستطيل*srcRect* تحتوي المعلمة. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) المفوض الذي يحدد الطريقة التي يتم إرسال سجلات ملف التعريف إليها. |
| callbackData | IntPtr | مؤشر داخلي مطلوب ، لكن تم تجاهله. يمكنك تمريرZero لهذه المعلمة. |

### أنظر أيضا

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* مساحة الاسم [System.Drawing](../../graphics)
* المجسم [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_21}

يرسل السجلات في مستطيل محدد من ملف[`Metafile`](../../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض في متوازي أضلاع محدد.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) لتعداد. |
| destPoints | Point[] | مجموعة من ثلاثة[`Point`](../../point) الهياكل التي تحدد متوازي الأضلاع الذي يحدد حجم وموقع ملف التعريف المرسوم. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) البنية التي تحدد جزء ملف التعريف ، بالنسبة إلى الزاوية العلوية اليسرى ، للرسم. |
| srcUnit | GraphicsUnit | عضو في[`GraphicsUnit`](../../graphicsunit) التعداد الذي يحدد وحدة القياس المستخدمة لتحديد جزء ملف التعريف الذي يحدده المستطيل*srcRect* تحتوي المعلمة. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) المفوض الذي يحدد الطريقة التي يتم إرسال سجلات ملف التعريف إليها. |

### أنظر أيضا

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* مساحة الاسم [System.Drawing](../../graphics)
* المجسم [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_17}

يرسل السجلات في مستطيل محدد من ملف[`Metafile`](../../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض في متوازي أضلاع محدد باستخدام سمات الصورة المحددة.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, RectangleF srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) لتعداد. |
| destPoints | PointF[] | مجموعة من ثلاثة[`PointF`](../../pointf) الهياكل التي تحدد متوازي الأضلاع الذي يحدد حجم وموقع ملف التعريف المرسوم. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef) البنية التي تحدد جزء ملف التعريف ، بالنسبة إلى الزاوية العلوية اليسرى ، للرسم. |
| unit | GraphicsUnit | عضو في[`GraphicsUnit`](../../graphicsunit) التعداد الذي يحدد وحدة القياس المستخدمة لتحديد جزء ملف التعريف الذي يحدده المستطيل*srcRect* تحتوي المعلمة. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) المفوض الذي يحدد الطريقة التي يتم إرسال سجلات ملف التعريف إليها. |
| callbackData | IntPtr | مؤشر داخلي مطلوب ، لكن تم تجاهله. يمكنك تمريرZero لهذه المعلمة. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) يحدد معلومات سمة الصورة للصورة المرسومة. |

### أنظر أيضا

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* مساحة الاسم [System.Drawing](../../graphics)
* المجسم [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_16}

يرسل السجلات في مستطيل محدد من ملف[`Metafile`](../../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض في متوازي أضلاع محدد.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) لتعداد. |
| destPoints | PointF[] | مجموعة من ثلاثة[`PointF`](../../pointf) الهياكل التي تحدد متوازي الأضلاع الذي يحدد حجم وموقع ملف التعريف المرسوم. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef) البنية التي تحدد جزء ملف التعريف ، بالنسبة إلى الزاوية العلوية اليسرى ، للرسم. |
| srcUnit | GraphicsUnit | عضو في[`GraphicsUnit`](../../graphicsunit) التعداد الذي يحدد وحدة القياس المستخدمة لتحديد جزء ملف التعريف الذي يحدده المستطيل*srcRect* تحتوي المعلمة. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) المفوض الذي يحدد الطريقة التي يتم إرسال سجلات ملف التعريف إليها. |
| callbackData | IntPtr | مؤشر داخلي مطلوب ، لكن تم تجاهله. يمكنك تمريرZero لهذه المعلمة. |

### أنظر أيضا

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* مساحة الاسم [System.Drawing](../../graphics)
* المجسم [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_15}

يرسل السجلات في مستطيل محدد من S.[`Metafile`](../../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض في متوازي أضلاع محدد.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) لتعداد. |
| destPoints | PointF[] | مجموعة من ثلاثة[`PointF`](../../pointf) الهياكل التي تحدد متوازي الأضلاع الذي يحدد حجم وموقع ملف التعريف المرسوم. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef) البنية التي تحدد جزء ملف التعريف ، بالنسبة إلى الزاوية العلوية اليسرى ، للرسم. |
| srcUnit | GraphicsUnit | عضو في[`GraphicsUnit`](../../graphicsunit) التعداد الذي يحدد وحدة القياس المستخدمة لتحديد جزء ملف التعريف الذي يحدده المستطيل*srcRect* تحتوي المعلمة. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) المفوض الذي يحدد الطريقة التي يتم إرسال سجلات ملف التعريف إليها. |

### أنظر أيضا

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* مساحة الاسم [System.Drawing](../../graphics)
* المجسم [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_29}

يرسل سجلات المستطيل المحدد من ملف[`Metafile`](../../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض في مستطيل محدد باستخدام سمات الصورة المحددة.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, Rectangle srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) لتعداد. |
| destRect | Rectangle | [`Rectangle`](../../rectangle) البنية التي تحدد موقع وحجم ملف التعريف المرسوم. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) البنية التي تحدد جزء ملف التعريف ، بالنسبة إلى الزاوية العلوية اليسرى ، للرسم. |
| unit | GraphicsUnit | عضو في[`GraphicsUnit`](../../graphicsunit) التعداد الذي يحدد وحدة القياس المستخدمة لتحديد جزء ملف التعريف الذي يحدده المستطيل*srcRect* تحتوي المعلمة. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) المفوض الذي يحدد الطريقة التي يتم إرسال سجلات ملف التعريف إليها. |
| callbackData | IntPtr | مؤشر داخلي مطلوب ، لكن تم تجاهله. يمكنك تمريرZero لهذه المعلمة. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) يحدد معلومات سمة الصورة للصورة المرسومة. |

### أنظر أيضا

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* مساحة الاسم [System.Drawing](../../graphics)
* المجسم [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_28}

يرسل سجلات المستطيل المحدد من ملف[`Metafile`](../../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض في مستطيل محدد.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) لتعداد. |
| destRect | Rectangle | [`Rectangle`](../../rectangle) البنية التي تحدد موقع وحجم ملف التعريف المرسوم. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) البنية التي تحدد جزء ملف التعريف ، بالنسبة إلى الزاوية العلوية اليسرى ، للرسم. |
| srcUnit | GraphicsUnit | عضو في[`GraphicsUnit`](../../graphicsunit) التعداد الذي يحدد وحدة القياس المستخدمة لتحديد جزء ملف التعريف الذي يحدده المستطيل*srcRect* تحتوي المعلمة. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) المفوض الذي يحدد الطريقة التي يتم إرسال سجلات ملف التعريف إليها. |
| callbackData | IntPtr | مؤشر داخلي مطلوب ، لكن تم تجاهله. يمكنك تمريرZero لهذه المعلمة. |

### أنظر أيضا

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* مساحة الاسم [System.Drawing](../../graphics)
* المجسم [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_27}

يرسل سجلات المستطيل المحدد من ملف[`Metafile`](../../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض في مستطيل محدد.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) لتعداد. |
| destRect | Rectangle | [`Rectangle`](../../rectangle) البنية التي تحدد موقع وحجم ملف التعريف المرسوم. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) البنية التي تحدد جزء ملف التعريف ، بالنسبة إلى الزاوية العلوية اليسرى ، للرسم. |
| srcUnit | GraphicsUnit | عضو في[`GraphicsUnit`](../../graphicsunit) التعداد الذي يحدد وحدة القياس المستخدمة لتحديد جزء ملف التعريف الذي يحدده المستطيل*srcRect* تحتوي المعلمة. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) المفوض الذي يحدد الطريقة التي يتم إرسال سجلات ملف التعريف إليها. |

### أنظر أيضا

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* مساحة الاسم [System.Drawing](../../graphics)
* المجسم [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_14}

يرسل السجلات في الملف المحدد[`Metafile`](../../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض في متوازي أضلاع محدد باستخدام سمات الصورة المحددة.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, 
    EnumerateMetafileProc callback, IntPtr callbackData, ImageAttributes imageAttr)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) لتعداد. |
| destPoints | PointF[] | مجموعة من ثلاثة[`PointF`](../../pointf) الهياكل التي تحدد متوازي الأضلاع الذي يحدد حجم وموقع ملف التعريف المرسوم. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) المفوض الذي يحدد الطريقة التي يتم إرسال سجلات ملف التعريف إليها. |
| callbackData | IntPtr | مؤشر داخلي مطلوب ، لكن تم تجاهله. يمكنك تمريرZero لهذه المعلمة. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) يحدد معلومات سمة الصورة للصورة المرسومة. |

### أنظر أيضا

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* مساحة الاسم [System.Drawing](../../graphics)
* المجسم [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_35}

يرسل سجلات المستطيل المحدد من ملف[`Metafile`](../../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض في مستطيل محدد باستخدام سمات الصورة المحددة.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, RectangleF srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) لتعداد. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef) البنية التي تحدد موقع وحجم ملف التعريف المرسوم. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef) البنية التي تحدد جزء ملف التعريف ، بالنسبة إلى الزاوية العلوية اليسرى ، للرسم. |
| unit | GraphicsUnit | عضو في[`GraphicsUnit`](../../graphicsunit) التعداد الذي يحدد وحدة القياس المستخدمة لتحديد جزء ملف التعريف الذي يحدده المستطيل*srcRect* تحتوي المعلمة. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) المفوض الذي يحدد الطريقة التي يتم إرسال سجلات ملف التعريف إليها. |
| callbackData | IntPtr | مؤشر داخلي مطلوب ، لكن تم تجاهله. يمكنك تمريرZero لهذه المعلمة. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) يحدد معلومات سمة الصورة للصورة المرسومة. |

### أنظر أيضا

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* مساحة الاسم [System.Drawing](../../graphics)
* المجسم [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_33}

يرسل سجلات المستطيل المحدد من ملف[`Metafile`](../../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض في مستطيل محدد.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) لتعداد. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef) البنية التي تحدد موقع وحجم ملف التعريف المرسوم. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef) البنية التي تحدد جزء ملف التعريف ، بالنسبة إلى الزاوية العلوية اليسرى ، للرسم. |
| srcUnit | GraphicsUnit | عضو في[`GraphicsUnit`](../../graphicsunit) التعداد الذي يحدد وحدة القياس المستخدمة لتحديد جزء ملف التعريف الذي يحدده المستطيل*srcRect* تحتوي المعلمة. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) المفوض الذي يحدد الطريقة التي يتم إرسال سجلات ملف التعريف إليها. |

### أنظر أيضا

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* مساحة الاسم [System.Drawing](../../graphics)
* المجسم [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_5}

يرسل السجلات في مستطيل محدد من ملف[`Metafile`](../../../system.drawing.imaging/metafile)، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض عند نقطة محددة باستخدام سمات الصورة المحددة.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, Rectangle srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) لتعداد. |
| destPoint | Point | [`Point`](../../point) البنية التي تحدد موقع الزاوية العلوية اليسرى من ملف التعريف المرسوم. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) البنية التي تحدد جزء ملف التعريف ، بالنسبة إلى الزاوية العلوية اليسرى ، للرسم. |
| unit | GraphicsUnit | عضو في[`GraphicsUnit`](../../graphicsunit) التعداد الذي يحدد وحدة القياس المستخدمة لتحديد جزء ملف التعريف الذي يحدده المستطيل*srcRect* تحتوي المعلمة. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) المفوض الذي يحدد الطريقة التي يتم إرسال سجلات ملف التعريف إليها. |
| callbackData | IntPtr | مؤشر داخلي مطلوب ، لكن تم تجاهله. يمكنك تمريرZero لهذه المعلمة. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) يحدد معلومات سمة الصورة للصورة المرسومة. |

### أنظر أيضا

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* مساحة الاسم [System.Drawing](../../graphics)
* المجسم [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_4}

يرسل السجلات في مستطيل محدد من ملف[`Metafile`](../../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض عند نقطة محددة.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) لتعداد. |
| destPoint | Point | [`Point`](../../point) البنية التي تحدد موقع الزاوية العلوية اليسرى من ملف التعريف المرسوم. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) البنية التي تحدد جزء ملف التعريف ، بالنسبة إلى الزاوية العلوية اليسرى ، للرسم. |
| srcUnit | GraphicsUnit | عضو في[`GraphicsUnit`](../../graphicsunit) التعداد الذي يحدد وحدة القياس المستخدمة لتحديد جزء ملف التعريف الذي يحدده المستطيل*srcRect* تحتوي المعلمة. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) المفوض الذي يحدد الطريقة التي يتم إرسال سجلات ملف التعريف إليها. |
| callbackData | IntPtr | مؤشر داخلي مطلوب ، لكن تم تجاهله. يمكنك تمريرZero لهذه المعلمة. |

### أنظر أيضا

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* مساحة الاسم [System.Drawing](../../graphics)
* المجسم [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_3}

يرسل السجلات في مستطيل محدد من ملف[`Metafile`](../../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض عند نقطة محددة.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) لتعداد. |
| destPoint | Point | [`Point`](../../point) البنية التي تحدد موقع الزاوية العلوية اليسرى من ملف التعريف المرسوم. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) البنية التي تحدد جزء ملف التعريف ، بالنسبة إلى الزاوية العلوية اليسرى ، للرسم. |
| srcUnit | GraphicsUnit | عضو في[`GraphicsUnit`](../../graphicsunit) التعداد الذي يحدد وحدة القياس المستخدمة لتحديد جزء ملف التعريف الذي يحدده المستطيل*srcRect* تحتوي المعلمة. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) المفوض الذي يحدد الطريقة التي يتم إرسال سجلات ملف التعريف إليها. |

### أنظر أيضا

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* مساحة الاسم [System.Drawing](../../graphics)
* المجسم [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_25}

يرسل سجلات[`Metafile`](../../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض في مستطيل محدد.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, 
    EnumerateMetafileProc callback, IntPtr callbackData)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) لتعداد. |
| destRect | Rectangle | [`RectangleF`](../../rectanglef) البنية التي تحدد موقع وحجم ملف التعريف المرسوم. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) المفوض الذي يحدد الطريقة التي يتم إرسال سجلات ملف التعريف إليها. |
| callbackData | IntPtr | مؤشر داخلي مطلوب ، لكن تم تجاهله. يمكنك تمريرZero لهذه المعلمة. |

### أنظر أيضا

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Rectangle](../../rectangle)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* مساحة الاسم [System.Drawing](../../graphics)
* المجسم [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_11}

يرسل السجلات في مستطيل محدد من ملف[`Metafile`](../../../system.drawing.imaging/metafile)، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض عند نقطة محددة باستخدام سمات الصورة المحددة.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, RectangleF srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) لتعداد. |
| destPoint | PointF | [`PointF`](../../pointf) البنية التي تحدد موقع الزاوية العلوية اليسرى من ملف التعريف المرسوم. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef) البنية التي تحدد جزء ملف التعريف ، بالنسبة إلى الزاوية العلوية اليسرى ، للرسم. |
| unit | GraphicsUnit | عضو في[`GraphicsUnit`](../../graphicsunit) التعداد الذي يحدد وحدة القياس المستخدمة لتحديد جزء ملف التعريف الذي يحدده المستطيل*srcRect* تحتوي المعلمة. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) المفوض الذي يحدد الطريقة التي يتم إرسال سجلات ملف التعريف إليها. |
| callbackData | IntPtr | مؤشر داخلي مطلوب ، لكن تم تجاهله. يمكنك تمريرZero لهذه المعلمة. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) يحدد معلومات سمة الصورة للصورة المرسومة. |

### أنظر أيضا

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* مساحة الاسم [System.Drawing](../../graphics)
* المجسم [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_10}

يرسل السجلات في مستطيل محدد من ملف[`Metafile`](../../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض عند نقطة محددة.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) لتعداد. |
| destPoint | PointF | [`PointF`](../../pointf) البنية التي تحدد موقع الزاوية العلوية اليسرى من ملف التعريف المرسوم. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef) البنية التي تحدد جزء ملف التعريف ، بالنسبة إلى الزاوية العلوية اليسرى ، للرسم. |
| srcUnit | GraphicsUnit | عضو في[`GraphicsUnit`](../../graphicsunit) التعداد الذي يحدد وحدة القياس المستخدمة لتحديد جزء ملف التعريف الذي يحدده المستطيل*srcRect* تحتوي المعلمة. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) المفوض الذي يحدد الطريقة التي يتم إرسال سجلات ملف التعريف إليها. |
| callbackData | IntPtr | مؤشر داخلي مطلوب ، لكن تم تجاهله. يمكنك تمريرZero لهذه المعلمة. |

### أنظر أيضا

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* مساحة الاسم [System.Drawing](../../graphics)
* المجسم [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_9}

يرسل السجلات في مستطيل محدد من ملف[`Metafile`](../../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض عند نقطة محددة.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) لتعداد. |
| destPoint | PointF | [`PointF`](../../pointf) البنية التي تحدد موقع الزاوية العلوية اليسرى من ملف التعريف المرسوم. |
| srcRect | RectangleF | بنية System.Drawing.RectangleF التي تحدد جزء ملف التعريف ، بالنسبة إلى الزاوية العلوية اليسرى ، للرسم. |
| srcUnit | GraphicsUnit | عضو في[`GraphicsUnit`](../../graphicsunit) التعداد الذي يحدد وحدة القياس المستخدمة لتحديد جزء ملف التعريف الذي يحدده المستطيل*srcRect* تحتوي المعلمة. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) المفوض الذي يحدد الطريقة التي يتم إرسال سجلات ملف التعريف إليها. |

### أنظر أيضا

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* مساحة الاسم [System.Drawing](../../graphics)
* المجسم [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_20}

يرسل السجلات في الملف المحدد[`Metafile`](../../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض في متوازي أضلاع محدد باستخدام سمات الصورة المحددة.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, 
    EnumerateMetafileProc callback, IntPtr callbackData, ImageAttributes imageAttr)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) لتعداد. |
| destPoints | Point[] | مجموعة من ثلاثة[`Point`](../../point) الهياكل التي تحدد متوازي الأضلاع الذي يحدد حجم وموقع ملف التعريف المرسوم. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) المفوض الذي يحدد الطريقة التي يتم إرسال سجلات ملف التعريف إليها. |
| callbackData | IntPtr | مؤشر داخلي مطلوب ، لكن تم تجاهله. يمكنك تمريرZero لهذه المعلمة. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) يحدد معلومات سمة الصورة للصورة المرسومة. |

### أنظر أيضا

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* مساحة الاسم [System.Drawing](../../graphics)
* المجسم [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_34}

يرسل سجلات المستطيل المحدد من ملف[`Metafile`](../../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض في مستطيل محدد.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) لتعداد. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef) البنية التي تحدد موقع وحجم ملف التعريف المرسوم. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef) البنية التي تحدد جزء ملف التعريف ، بالنسبة إلى الزاوية العلوية اليسرى ، للرسم. |
| srcUnit | GraphicsUnit | عضو في[`GraphicsUnit`](../../graphicsunit) التعداد الذي يحدد وحدة القياس المستخدمة لتحديد جزء ملف التعريف الذي يحدده المستطيل*srcRect* تحتوي المعلمة. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) المفوض الذي يحدد الطريقة التي يتم إرسال سجلات ملف التعريف إليها. |
| callbackData | IntPtr | مؤشر داخلي مطلوب ، لكن تم تجاهله. يمكنك تمريرZero لهذه المعلمة. |

### أنظر أيضا

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* مساحة الاسم [System.Drawing](../../graphics)
* المجسم [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_26}

يرسل سجلات[`Metafile`](../../../system.drawing.imaging/metafile) ، واحدًا تلو الآخر ، إلى طريقة رد الاتصال للعرض في مستطيل محدد باستخدام سمات الصورة المحددة.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, 
    EnumerateMetafileProc callback, IntPtr callbackData, ImageAttributes imageAttr)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) لتعداد. |
| destRect | Rectangle | [`Rectangle`](../../rectangle) البنية التي تحدد موقع وحجم ملف التعريف المرسوم. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) المفوض الذي يحدد الطريقة التي يتم إرسال سجلات ملف التعريف إليها. |
| callbackData | IntPtr | مؤشر داخلي مطلوب ، لكن تم تجاهله. يمكنك تمريرZero لهذه المعلمة. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) يحدد معلومات سمة الصورة للصورة المرسومة. |

### أنظر أيضا

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Rectangle](../../rectangle)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* مساحة الاسم [System.Drawing](../../graphics)
* المجسم [Aspose.Drawing](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
