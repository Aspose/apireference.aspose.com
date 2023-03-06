---
title: Geometry.AsText
second_title: Aspose.GIS لمرجع .NET API
description: Geometry طريقة. تترجم هذه الهندسة إلى تمثيلها النصي المعروف جيدًا.
type: docs
weight: 130
url: /ar/net/aspose.gis.geometries/geometry/astext/
---
## AsText() {#astext}

تترجم هذه الهندسة إلى تمثيلها النصي المعروف جيدًا.

```csharp
public string AsText()
```

### قيمة الإرجاع

تمثيل نصي معروف لهذه الهندسة.

### ملاحظات

إخراج هذه الطريقة بتنسيقIso متغير WKT. التنسيق الرقمي الافتراضي هو[`General`](../../../aspose.gis/numericformat/general/) (بدقة "0") .

### أنظر أيضا

* class [Geometry](../)
* مساحة الاسم [Aspose.Gis.Geometries](../../geometry/)
* المجسم [Aspose.GIS](../../../)

---

## AsText(WktVariant) {#astext_1}

تترجم هذه الهندسة إلى تمثيلها النصي المعروف جيدًا.

```csharp
public string AsText(WktVariant variant)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| variant | WktVariant | متغير نص معروف للاستخدام. |

### قيمة الإرجاع

تمثيل نصي معروف لهذه الهندسة.

### استثناءات

| استثناء | حالة |
| --- | --- |
| NotSupportedException | لا يمكن تمثيل الهندسة في متغير WKT المطلوب. يحدث هذا حاليًا عندما[`HasCurveGeometry`](../hascurvegeometry/) من الهندسة`true` ومتغير WKT هو SimpleFeatureAccessOutdated . |
| ArgumentOutOfRangeException | *variant* ليس صحيحا[`WktVariant`](../../wktvariant/). |

### ملاحظات

التنسيق الرقمي الافتراضي هو[`General`](../../../aspose.gis/numericformat/general/) (بدقة "0") .

### أنظر أيضا

* enum [WktVariant](../../wktvariant/)
* class [Geometry](../)
* مساحة الاسم [Aspose.Gis.Geometries](../../geometry/)
* المجسم [Aspose.GIS](../../../)

---

## AsText(WktVariant, NumericFormat) {#astext_2}

تترجم هذه الهندسة إلى تمثيلها النصي المعروف جيدًا.

```csharp
public string AsText(WktVariant variant, NumericFormat format)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| variant | WktVariant | متغير نص معروف للاستخدام. |
| format | NumericFormat | تنسيق التنسيق للتحويل إلى سلسلة. انظر[`NumericFormat`](../../../aspose.gis/numericformat/) للحصول عليه. |

### قيمة الإرجاع

تمثيل نصي معروف لهذه الهندسة.

### استثناءات

| استثناء | حالة |
| --- | --- |
| NotSupportedException | لا يمكن تمثيل الهندسة في متغير WKT المطلوب. يحدث هذا حاليًا عندما[`HasCurveGeometry`](../hascurvegeometry/) من الهندسة`true` ومتغير WKT هو SimpleFeatureAccessOutdated . |
| ArgumentOutOfRangeException | *variant* ليس صحيحا[`WktVariant`](../../wktvariant/). |

### أنظر أيضا

* enum [WktVariant](../../wktvariant/)
* class [NumericFormat](../../../aspose.gis/numericformat/)
* class [Geometry](../)
* مساحة الاسم [Aspose.Gis.Geometries](../../geometry/)
* المجسم [Aspose.GIS](../../../)


