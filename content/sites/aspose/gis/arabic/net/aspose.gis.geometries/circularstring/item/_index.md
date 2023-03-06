---
title: CircularString.Item
second_title: Aspose.GIS لمرجع .NET API
description: CircularString ملكية. يحصل أو يحدد ملفIPoint في الفهرس المحدد.
type: docs
weight: 90
url: /ar/net/aspose.gis.geometries/circularstring/item/
---
## CircularString indexer

يحصل أو يحدد ملف[`IPoint`](../../ipoint/) في الفهرس المحدد.

```csharp
public IPoint this[int index] { get; set; }
```

| معامل | وصف |
| --- | --- |
| index | مؤشر. |

### Property_Value

ملف[`IPoint`](../../ipoint/) .

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentOutOfRangeException | الفهرس خارج النطاق. |
| ArgumentNullException | القيمة`null`. |
| ArgumentException | النقطة فارغة. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) من هذه الهندسة و[`SpatialReferenceSystem`](../spatialreferencesystem/) من الحجة كلاهما لا`null` ولا تساوي بعضها البعض. |

### أنظر أيضا

* interface [IPoint](../../ipoint/)
* class [CircularString](../)
* مساحة الاسم [Aspose.Gis.Geometries](../../circularstring/)
* المجسم [Aspose.GIS](../../../)


