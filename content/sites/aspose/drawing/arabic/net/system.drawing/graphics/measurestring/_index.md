---
title: MeasureString
second_title: Aspose.Drawing لمرجع NET API
description: يقيس السلسلة المحددة عند الرسم بالقيمة المحددةFont .
type: docs
weight: 620
url: /ar/net/system.drawing/graphics/measurestring/
---
## MeasureString(string, Font) {#measurestring}

يقيس السلسلة المحددة عند الرسم بالقيمة المحددةFont .

```csharp
public SizeF MeasureString(string text, Font font)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| text | String | سلسلة للقياس. |
| font | Font | Font التي تحدد تنسيق نص السلسلة. |

### قيمة الإرجاع

تقوم هذه الطريقة بإرجاع ملفSizeF الهيكل الذي يمثل الحجم ، في الوحدات المحددة بواسطةPageUnit الخاصية ، من السلسلة المحددة بواسطة*text* المعلمة كما تم رسمها مع*font* معامل.

### أنظر أيضا

* struct [SizeF](../../sizef)
* class [Font](../../font)
* class [Graphics](../../graphics)
* مساحة الاسم [System.Drawing](../../graphics)
* المجسم [Aspose.Drawing](../../../)

---

## MeasureString(string, Font, SizeF) {#measurestring_4}

يقيس السلسلة المحددة عند الرسم بالقيمة المحددةFont .

```csharp
public SizeF MeasureString(string text, Font font, SizeF layoutArea)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| text | String | سلسلة للقياس. |
| font | Font | Font التي تحدد تنسيق نص السلسلة. |
| layoutArea | SizeF | SizeF هيكل يحدد أقصى مساحة تخطيط للنص. |

### قيمة الإرجاع

تقوم هذه الطريقة بإرجاع ملفSizeF الهيكل الذي يمثل الحجم ، في الوحدات المحددة بواسطةPageUnit الخاصية ، من السلسلة المحددة بواسطة*text* المعلمة كما تم رسمها مع*font* معامل.

### أنظر أيضا

* struct [SizeF](../../sizef)
* class [Font](../../font)
* class [Graphics](../../graphics)
* مساحة الاسم [System.Drawing](../../graphics)
* المجسم [Aspose.Drawing](../../../)

---

## MeasureString(string, Font, int) {#measurestring_1}

يقيس السلسلة المحددة عند الرسم بالقيمة المحددةFont .

```csharp
public SizeF MeasureString(string text, Font font, int width)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| text | String | سلسلة للقياس. |
| font | Font | Font التي تحدد تنسيق نص السلسلة. |
| width | Int32 | أقصى عرض للسلسلة بالبكسل. |

### قيمة الإرجاع

تقوم هذه الطريقة بإرجاع ملفSizeF الهيكل الذي يمثل الحجم ، في الوحدات المحددة بواسطةPageUnit الخاصية ، من السلسلة المحددة بواسطة*text* المعلمة كما تم رسمها مع*font* معامل.

### أنظر أيضا

* struct [SizeF](../../sizef)
* class [Font](../../font)
* class [Graphics](../../graphics)
* مساحة الاسم [System.Drawing](../../graphics)
* المجسم [Aspose.Drawing](../../../)

---

## MeasureString(string, Font, PointF, StringFormat) {#measurestring_3}

يقيس السلسلة المحددة عند الرسم بالقيمة المحددةFont ومنسق بالملف المحددStringFormat .

```csharp
public SizeF MeasureString(string text, Font font, PointF origin, StringFormat stringFormat)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| text | String | سلسلة للقياس. |
| font | Font | Fontيحدد تنسيق نص السلسلة. |
| origin | PointF | PointF الهيكل الذي يمثل الزاوية العلوية اليسرى من السلسلة. |
| stringFormat | StringFormat | StringFormat التي تمثل معلومات التنسيق ، مثل تباعد الأسطر ، للسلسلة. |

### قيمة الإرجاع

تقوم هذه الطريقة بإرجاع ملفSizeF الهيكل الذي يمثل الحجم ، في الوحدات المحددة بواسطةPageUnit الخاصية ، من السلسلة المحددة بواسطة*text* المعلمة كما تم رسمها مع*font* المعلمة و*stringFormat* معامل.

### أنظر أيضا

* struct [SizeF](../../sizef)
* class [Font](../../font)
* struct [PointF](../../pointf)
* class [StringFormat](../../stringformat)
* class [Graphics](../../graphics)
* مساحة الاسم [System.Drawing](../../graphics)
* المجسم [Aspose.Drawing](../../../)

---

## MeasureString(string, Font, int, StringFormat) {#measurestring_2}

يقيس السلسلة المحددة عند الرسم بالقيمة المحددةFont ومنسق بالملف المحددStringFormat .

```csharp
public SizeF MeasureString(string text, Font font, int width, StringFormat format)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| text | String | سلسلة للقياس. |
| font | Font | Font التي تحدد تنسيق نص السلسلة. |
| width | Int32 | أقصى عرض للسلسلة. |
| format | StringFormat | StringFormat التي تمثل معلومات التنسيق ، مثل تباعد الأسطر ، للسلسلة. |

### قيمة الإرجاع

تقوم هذه الطريقة بإرجاع ملفSizeF الهيكل الذي يمثل الحجم ، في الوحدات المحددة بواسطةPageUnit الخاصية ، من السلسلة المحددة في ملف*text* المعلمة كما تم رسمها مع*font* معلمة و*format* معامل.

### أنظر أيضا

* struct [SizeF](../../sizef)
* class [Font](../../font)
* class [StringFormat](../../stringformat)
* class [Graphics](../../graphics)
* مساحة الاسم [System.Drawing](../../graphics)
* المجسم [Aspose.Drawing](../../../)

---

## MeasureString(string, Font, SizeF, StringFormat) {#measurestring_5}

يقيس السلسلة المحددة عند الرسم بالقيمة المحددةFont ومنسق بالملف المحددStringFormat .

```csharp
public SizeF MeasureString(string text, Font font, SizeF layoutArea, StringFormat stringFormat)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| text | String | سلسلة للقياس. |
| font | Font | Fontيحدد تنسيق نص السلسلة. |
| layoutArea | SizeF | SizeF هيكل يحدد أقصى مساحة تخطيط للنص. |
| stringFormat | StringFormat | StringFormat التي تمثل معلومات التنسيق ، مثل تباعد الأسطر ، للسلسلة. |

### قيمة الإرجاع

تقوم هذه الطريقة بإرجاع ملفSizeF الهيكل الذي يمثل الحجم ، في الوحدات المحددة بواسطةPageUnit الخاصية ، من السلسلة المحددة في ملف*text* المعلمة كما تم رسمها مع*font* معلمة و*stringFormat* معامل.

### أنظر أيضا

* struct [SizeF](../../sizef)
* class [Font](../../font)
* class [StringFormat](../../stringformat)
* class [Graphics](../../graphics)
* مساحة الاسم [System.Drawing](../../graphics)
* المجسم [Aspose.Drawing](../../../)

---

## MeasureString(string, Font, SizeF, StringFormat, out int, out int) {#measurestring_6}

يقيس السلسلة المحددة عند الرسم بالقيمة المحددةFont ومنسق بالملف المحددStringFormat .

```csharp
public SizeF MeasureString(string text, Font font, SizeF layoutArea, StringFormat stringFormat, 
    out int charactersFitted, out int linesFilled)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| text | String | سلسلة للقياس. |
| font | Font | Fontيحدد تنسيق نص السلسلة. |
| layoutArea | SizeF | SizeF هيكل يحدد أقصى مساحة تخطيط للنص. |
| stringFormat | StringFormat | StringFormat التي تمثل معلومات التنسيق ، مثل تباعد الأسطر ، للسلسلة. |
| charactersFitted | Int32& | عدد الأحرف في السلسلة. |
| linesFilled | Int32& | عدد سطور النص في السلسلة. |

### قيمة الإرجاع

تقوم هذه الطريقة بإرجاع ملفSizeF الهيكل الذي يمثل الحجم ، في الوحدات المحددة بواسطةPageUnit الخاصية ، من السلسلة المحددة في ملف*text* المعلمة كما تم رسمها مع*font* معلمة و*stringFormat* معامل.

### أنظر أيضا

* struct [SizeF](../../sizef)
* class [Font](../../font)
* class [StringFormat](../../stringformat)
* class [Graphics](../../graphics)
* مساحة الاسم [System.Drawing](../../graphics)
* المجسم [Aspose.Drawing](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
