---
title: Geometry.AsBinary
second_title: Aspose.GIS لمرجع .NET API
description: Geometry طريقة. تترجم هذه الهندسة إلى تمثيلها الثنائي المعروف جيدًا.
type: docs
weight: 110
url: /ar/net/aspose.gis.geometries/geometry/asbinary/
---
## AsBinary() {#asbinary}

تترجم هذه الهندسة إلى تمثيلها الثنائي المعروف جيدًا.

```csharp
public byte[] AsBinary()
```

### قيمة الإرجاع

تمثيل ثنائي معروف جيدًا لهذه الهندسة.

### ملاحظات

ناتج هذه الطريقة فيIso متغير WKB.

### أنظر أيضا

* class [Geometry](../)
* مساحة الاسم [Aspose.Gis.Geometries](../../geometry/)
* المجسم [Aspose.GIS](../../../)

---

## AsBinary(WkbVariant) {#asbinary_1}

تترجم هذه الهندسة إلى تمثيلها الثنائي المعروف جيدًا.

```csharp
public byte[] AsBinary(WkbVariant variant)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| variant | WkbVariant | متغير ثنائي معروف للاستخدام. |

### قيمة الإرجاع

تمثيل ثنائي معروف جيدًا لهذه الهندسة.

### استثناءات

| استثناء | حالة |
| --- | --- |
| NotSupportedException | لا يمكن تمثيل الهندسة في متغير WKB المطلوب. يحدث هذا حاليًا عندما[`HasCurveGeometry`](../hascurvegeometry/) من الهندسة`true` ومتغير WKB هو SimpleFeatureAccessOutdated . |
| ArgumentOutOfRangeException | *variant* ليس صحيحا[`WkbVariant`](../../wkbvariant/). |

### أنظر أيضا

* enum [WkbVariant](../../wkbvariant/)
* class [Geometry](../)
* مساحة الاسم [Aspose.Gis.Geometries](../../geometry/)
* المجسم [Aspose.GIS](../../../)


