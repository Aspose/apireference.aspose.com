---
title: Extent.Grow
second_title: Aspose.GIS لمرجع .NET API
description: Extent طريقة. ينمو هذا النطاق بحيث يتضمن الوسيطة.
type: docs
weight: 160
url: /ar/net/aspose.gis/extent/grow/
---
## Grow(Extent) {#grow}

ينمو هذا النطاق بحيث يتضمن الوسيطة.

```csharp
public void Grow(Extent extent)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| extent | Extent | مدى آخر. |

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | الحجة`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) من هذا المدى والحجة كلاهما ليس كذلك`null` ولا تساوي بعضها البعض. |

### ملاحظات

إذا[`SpatialReferenceSystem`](../spatialreferencesystem/) من هذا SRS`null` ثم يتم تحديثه باستخدام SRS للوسيطة.

### أنظر أيضا

* class [Extent](../)
* مساحة الاسم [Aspose.Gis](../../extent/)
* المجسم [Aspose.GIS](../../../)

---

## Grow(double, double) {#grow_1}

ينمو هذا المدى بحيث يشمل النقطة المحددة.

```csharp
public void Grow(double x, double y)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| x | Double | تنسيق X لتضمينه. |
| y | Double | تنسيق Y لتشمل. |

### أنظر أيضا

* class [Extent](../)
* مساحة الاسم [Aspose.Gis](../../extent/)
* المجسم [Aspose.GIS](../../../)


