---
title: GeometryCollection.Add
second_title: Aspose.GIS لمرجع .NET API
description: GeometryCollection طريقة. يضيف الشكل الهندسي المحدد إلى المجموعة.
type: docs
weight: 110
url: /ar/net/aspose.gis.geometries/geometrycollection/add/
---
## GeometryCollection.Add method

يضيف الشكل الهندسي المحدد إلى المجموعة.

```csharp
public void Add(IGeometry geometry)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| geometry | IGeometry | الهندسة المراد إضافتها. |

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | الحجة`null`. |
| ArgumentException | لا تقبل المجموعة الأشكال الهندسية من هذا النوع. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) من هذه الهندسة و[`SpatialReferenceSystem`](../spatialreferencesystem/) من الحجة كلاهما not `null` ولا تساوي بعضها البعض. |

### أنظر أيضا

* interface [IGeometry](../../igeometry/)
* class [GeometryCollection](../)
* مساحة الاسم [Aspose.Gis.Geometries](../../geometrycollection/)
* المجسم [Aspose.GIS](../../../)


