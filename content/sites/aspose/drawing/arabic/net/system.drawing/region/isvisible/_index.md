---
title: IsVisible
second_title: Aspose.Drawing لمرجع NET API
description: يختبر ما إذا كانت النقطة المحددة متضمنة في هذاRegion .
type: docs
weight: 130
url: /ar/net/system.drawing/region/isvisible/
---
## IsVisible(float, float) {#isvisible_3}

يختبر ما إذا كانت النقطة المحددة متضمنة في هذاRegion .

```csharp
public bool IsVisible(float x, float y)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| x | Single | إحداثي x للنقطة المراد اختبارها. |
| y | Single | إحداثي ص للنقطة المراد اختبارها. |

### قيمة الإرجاع

صحيح عندما يتم احتواء النقطة المحددة داخل هذاRegion؛ خلاف ذلك ، خطأ.

### أنظر أيضا

* class [Region](../../region)
* مساحة الاسم [System.Drawing](../../region)
* المجسم [Aspose.Drawing](../../../)

---

## IsVisible(PointF) {#isvisible_9}

تختبر ما إذا كان الملف المحددPointF هيكل وارد في هذاRegion .

```csharp
public bool IsVisible(PointF point)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| point | PointF | الPointF هيكل للاختبار. |

### قيمة الإرجاع

عندما يكون صحيحا*point* وارد في هذاRegion؛ خلاف ذلك ، خطأ.

### أنظر أيضا

* struct [PointF](../../pointf)
* class [Region](../../region)
* مساحة الاسم [System.Drawing](../../region)
* المجسم [Aspose.Drawing](../../../)

---

## IsVisible(float, float, Graphics) {#isvisible_6}

يختبر ما إذا كانت النقطة المحددة متضمنة في هذاRegion عند رسمها باستخدام المحددGraphics.

```csharp
public bool IsVisible(float x, float y, Graphics g)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| x | Single | إحداثي x للنقطة المراد اختبارها. |
| y | Single | إحداثي ص للنقطة المراد اختبارها. |
| g | Graphics | أGraphics التي تمثل سياق رسومي. |

### قيمة الإرجاع

صحيح عندما يتم احتواء النقطة المحددة داخل هذاRegion؛ خلاف ذلك ، خطأ.

### أنظر أيضا

* class [Graphics](../../graphics)
* class [Region](../../region)
* مساحة الاسم [System.Drawing](../../region)
* المجسم [Aspose.Drawing](../../../)

---

## IsVisible(PointF, Graphics) {#isvisible_10}

تختبر ما إذا كان الملف المحددPointF هيكل وارد في هذاRegion عند الرسم باستخدام المحددGraphics .

```csharp
public bool IsVisible(PointF point, Graphics g)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| point | PointF | الPointF هيكل للاختبار. |
| g | Graphics | أGraphics التي تمثل سياق رسومي. |

### قيمة الإرجاع

عندما يكون صحيحا*point* وارد في هذاRegion؛ خلاف ذلك ، خطأ.

### أنظر أيضا

* struct [PointF](../../pointf)
* class [Graphics](../../graphics)
* class [Region](../../region)
* مساحة الاسم [System.Drawing](../../region)
* المجسم [Aspose.Drawing](../../../)

---

## IsVisible(float, float, float, float) {#isvisible_4}

يختبر ما إذا كان أي جزء من المستطيل المحدد متضمنًا في هذاRegion .

```csharp
public bool IsVisible(float x, float y, float width, float height)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| x | Single | إحداثي x للركن الأيسر العلوي للمستطيل المراد اختباره. |
| y | Single | إحداثي ص للركن الأيسر العلوي للمستطيل المراد اختباره. |
| width | Single | عرض المستطيل المراد اختباره. |
| height | Single | ارتفاع المستطيل المراد اختباره. |

### قيمة الإرجاع

صواب عندما يتم احتواء أي جزء من المستطيل المحدد في thisRegion هدف؛ خلاف ذلك ، خطأ.

### أنظر أيضا

* class [Region](../../region)
* مساحة الاسم [System.Drawing](../../region)
* المجسم [Aspose.Drawing](../../../)

---

## IsVisible(RectangleF) {#isvisible_13}

اختبارات ما إذا كان أي جزء من المحددRectangleF هيكل وارد within هذاRegion .

```csharp
public bool IsVisible(RectangleF rect)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| rect | RectangleF | الRectangleF هيكل للاختبار. |

### قيمة الإرجاع

صحيح عند أي جزء من*rect* وارد في هذاRegion؛ وإلا ، خطأ.

### أنظر أيضا

* struct [RectangleF](../../rectanglef)
* class [Region](../../region)
* مساحة الاسم [System.Drawing](../../region)
* المجسم [Aspose.Drawing](../../../)

---

## IsVisible(float, float, float, float, Graphics) {#isvisible_5}

يختبر ما إذا كان أي جزء من المستطيل المحدد متضمنًا في هذاRegion عند الرسم باستخدام المحددGraphics .

```csharp
public bool IsVisible(float x, float y, float width, float height, Graphics g)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| x | Single | إحداثي x للركن الأيسر العلوي للمستطيل المراد اختباره. |
| y | Single | إحداثي ص للركن الأيسر العلوي للمستطيل المراد اختباره. |
| width | Single | عرض المستطيل المراد اختباره. |
| height | Single | ارتفاع المستطيل المراد اختباره. |
| g | Graphics | أGraphics التي تمثل سياق رسومي. |

### قيمة الإرجاع

صواب عندما يتم احتواء أي جزء من المستطيل المحدد داخل هذاRegion؛ وإلا ، خطأ.

### أنظر أيضا

* class [Graphics](../../graphics)
* class [Region](../../region)
* مساحة الاسم [System.Drawing](../../region)
* المجسم [Aspose.Drawing](../../../)

---

## IsVisible(RectangleF, Graphics) {#isvisible_14}

اختبارات ما إذا كان أي جزء من المحددRectangleF هيكل وارد within هذاRegion عند رسمها باستخدام المحددGraphics .

```csharp
public bool IsVisible(RectangleF rect, Graphics g)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| rect | RectangleF | الRectangleF هيكل للاختبار. |
| g | Graphics | أGraphics التي تمثل سياق رسومي. |

### قيمة الإرجاع

عندما يكون صحيحا*rect* وارد في هذاRegion؛ وإلا ، خطأ.

### أنظر أيضا

* struct [RectangleF](../../rectanglef)
* class [Graphics](../../graphics)
* class [Region](../../region)
* مساحة الاسم [System.Drawing](../../region)
* المجسم [Aspose.Drawing](../../../)

---

## IsVisible(int, int, Graphics) {#isvisible_2}

يختبر ما إذا كانت النقطة المحددة متضمنة في هذاRegion الكائن عند رسمها باستخدام المحددGraphics الكائن .

```csharp
public bool IsVisible(int x, int y, Graphics g)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| x | Int32 | إحداثي x للنقطة المراد اختبارها. |
| y | Int32 | إحداثي ص للنقطة المراد اختبارها. |
| g | Graphics | أGraphics التي تمثل سياق رسومي. |

### قيمة الإرجاع

صحيح عندما يتم احتواء النقطة المحددة داخل هذاRegion؛ خلاف ذلك ، خطأ.

### أنظر أيضا

* class [Graphics](../../graphics)
* class [Region](../../region)
* مساحة الاسم [System.Drawing](../../region)
* المجسم [Aspose.Drawing](../../../)

---

## IsVisible(Point) {#isvisible_7}

تختبر ما إذا كان الملف المحددPoint هيكل وارد في هذاRegion .

```csharp
public bool IsVisible(Point point)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| point | Point | الPoint هيكل للاختبار. |

### قيمة الإرجاع

عندما يكون صحيحا*point* وارد في هذاRegion؛ خلاف ذلك ، خطأ.

### أنظر أيضا

* struct [Point](../../point)
* class [Region](../../region)
* مساحة الاسم [System.Drawing](../../region)
* المجسم [Aspose.Drawing](../../../)

---

## IsVisible(Point, Graphics) {#isvisible_8}

تختبر ما إذا كان الملف المحددPoint هيكل وارد في هذاRegion عند الرسم باستخدام المحددGraphics .

```csharp
public bool IsVisible(Point point, Graphics g)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| point | Point | الPoint هيكل للاختبار. |
| g | Graphics | أGraphics التي تمثل سياق رسومي. |

### قيمة الإرجاع

عندما يكون صحيحا*point* وارد في هذاRegion؛ خلاف ذلك ، خطأ.

### أنظر أيضا

* struct [Point](../../point)
* class [Graphics](../../graphics)
* class [Region](../../region)
* مساحة الاسم [System.Drawing](../../region)
* المجسم [Aspose.Drawing](../../../)

---

## IsVisible(int, int, int, int) {#isvisible}

يختبر ما إذا كان أي جزء من المستطيل المحدد متضمنًا في هذاRegion .

```csharp
public bool IsVisible(int x, int y, int width, int height)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| x | Int32 | إحداثي x للركن الأيسر العلوي للمستطيل المراد اختباره. |
| y | Int32 | إحداثي ص للركن الأيسر العلوي للمستطيل المراد اختباره. |
| width | Int32 | عرض المستطيل المراد اختباره. |
| height | Int32 | ارتفاع المستطيل المراد اختباره. |

### قيمة الإرجاع

صواب عندما يتم احتواء أي جزء من المستطيل المحدد داخل هذاRegion؛ وإلا ، خطأ.

### أنظر أيضا

* class [Region](../../region)
* مساحة الاسم [System.Drawing](../../region)
* المجسم [Aspose.Drawing](../../../)

---

## IsVisible(Rectangle) {#isvisible_11}

اختبارات ما إذا كان أي جزء من المحددRectangle هيكل موجود في this Region .

```csharp
public bool IsVisible(Rectangle rect)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| rect | Rectangle | الRectangle هيكل للاختبار. |

### قيمة الإرجاع

هذا الأسلوب يعود صحيحا عند أي جزء من*rect* يرد في هذاRegion؛ خلاف ذلك ، خطأ.

### أنظر أيضا

* struct [Rectangle](../../rectangle)
* class [Region](../../region)
* مساحة الاسم [System.Drawing](../../region)
* المجسم [Aspose.Drawing](../../../)

---

## IsVisible(int, int, int, int, Graphics) {#isvisible_1}

يختبر ما إذا كان أي جزء من المستطيل المحدد متضمنًا في هذاRegion عند draw باستخدام المحددGraphics .

```csharp
public bool IsVisible(int x, int y, int width, int height, Graphics g)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| x | Int32 | إحداثي x للركن الأيسر العلوي للمستطيل المراد اختباره. |
| y | Int32 | إحداثي ص للركن الأيسر العلوي للمستطيل المراد اختباره. |
| width | Int32 | عرض المستطيل المراد اختباره. |
| height | Int32 | ارتفاع المستطيل المراد اختباره. |
| g | Graphics | أGraphics التي تمثل سياق رسومي. |

### قيمة الإرجاع

صواب عندما يتم احتواء أي جزء من المستطيل المحدد داخل هذاRegion؛ وإلا ، خطأ.

### أنظر أيضا

* class [Graphics](../../graphics)
* class [Region](../../region)
* مساحة الاسم [System.Drawing](../../region)
* المجسم [Aspose.Drawing](../../../)

---

## IsVisible(Rectangle, Graphics) {#isvisible_12}

اختبارات ما إذا كان أي جزء من المحددRectangle هيكل وارد within هذاRegion عند رسمها باستخدام المحددGraphics .

```csharp
public bool IsVisible(Rectangle rect, Graphics g)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| rect | Rectangle | الRectangle هيكل للاختبار. |
| g | Graphics | أGraphics التي تمثل سياق رسومي. |

### قيمة الإرجاع

صحيح عند أي جزء من*rect* يرد في هذاRegion؛ خلاف ذلك ، خطأ.

### أنظر أيضا

* struct [Rectangle](../../rectangle)
* class [Graphics](../../graphics)
* class [Region](../../region)
* مساحة الاسم [System.Drawing](../../region)
* المجسم [Aspose.Drawing](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
