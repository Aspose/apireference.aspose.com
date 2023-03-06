---
title: Geometry.FromBinary
second_title: Aspose.GIS لمرجع .NET API
description: Geometry طريقة. ينشئ شكلًا هندسيًا من تمثيله الثنائي المعروف جيدًا.
type: docs
weight: 460
url: /ar/net/aspose.gis.geometries/geometry/frombinary/
---
## FromBinary(byte[]) {#frombinary}

ينشئ شكلًا هندسيًا من تمثيله الثنائي المعروف جيدًا.

```csharp
public static IGeometry FromBinary(byte[] wkb)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| wkb | Byte[] | تمثيل ثنائي معروف للهندسة. |

### قيمة الإرجاع

تمثل الحجة الهندسة.

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | الوسيطة باطلة. |
| NotSupportedException | تمثل الوسيطة شكلًا هندسيًا لنوع غير مدعوم. |
| FormatException | الوسيطة ليست ثنائية معروفة جيدًا. |

### أنظر أيضا

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* مساحة الاسم [Aspose.Gis.Geometries](../../geometry/)
* المجسم [Aspose.GIS](../../../)

---

## FromBinary(byte[], SpatialReferenceSystem) {#frombinary_1}

ينشئ شكلًا هندسيًا من تمثيله الثنائي المعروف جيدًا.

```csharp
public static IGeometry FromBinary(byte[] wkb, SpatialReferenceSystem spatialReferenceSystem)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| wkb | Byte[] | تمثيل ثنائي معروف للهندسة. |
| spatialReferenceSystem | SpatialReferenceSystem | نظام الإسناد المكاني المراد تخصيصه للهندسة. |

### قيمة الإرجاع

تمثل الحجة الهندسة.

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | الوسيطة باطلة. |
| NotSupportedException | تمثل الوسيطة شكلًا هندسيًا لنوع غير مدعوم. |
| FormatException | الوسيطة ليست ثنائية معروفة جيدًا. |

### ملاحظات

في حالة وجود وحدات بايت إضافية بعد الهندسة أFormatException تم طرح استثناء.

### أنظر أيضا

* interface [IGeometry](../../igeometry/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [Geometry](../)
* مساحة الاسم [Aspose.Gis.Geometries](../../geometry/)
* المجسم [Aspose.GIS](../../../)


