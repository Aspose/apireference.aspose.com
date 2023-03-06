---
title: Interface IGeometryCollection
second_title: Aspose.GIS لمرجع .NET API
description: Aspose.Gis.Geometries.IGeometryCollection واجهه المستخدم. أIGeometryCollection هوIGeometry هذه مجموعة من شكل هندسي واحد أو أكثر.
type: docs
weight: 1010
url: /ar/net/aspose.gis.geometries/igeometrycollection/
---
## IGeometryCollection interface

أ`IGeometryCollection` هو[`IGeometry`](../igeometry/) هذه مجموعة من شكل هندسي واحد أو أكثر.

```csharp
public interface IGeometryCollection : IEnumerable<IGeometry>, IEquatable<IGeometryCollection>, 
    IGeometry
```

## الخصائص

| اسم | وصف |
| --- | --- |
| [Count](../../aspose.gis.geometries/igeometrycollection/count/) { get; } | الحصول على عدد الأشكال الهندسية في هذه المجموعة. |
| [Item](../../aspose.gis.geometries/igeometrycollection/item/) { get; } | يحصل على أ[`IGeometry`](../igeometry/) في الفهرس المحدد. |

## طُرق

| اسم | وصف |
| --- | --- |
| [GetPointOnSurface](../../aspose.gis.geometries/igeometrycollection/getpointonsurface/)() | البحث عن نقطة مضمونة أن تكون على أحد الأسطح في هذه المجموعة . |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/igeometrycollection/replacepolygonsbylines/)() | الحصول على المضلعات ممثلة كخطوط لهذه الهندسة . |
| [ToEditable](../../aspose.gis.geometries/igeometrycollection/toeditable/)() | الحصول على نسخة قابلة للتحرير من هذه الهندسة. |
| [ToLinearGeometry](../../aspose.gis.geometries/igeometrycollection/tolineargeometry/#tolineargeometry)() | الحصول على إصدار تقريبي أو مكافئ غير منحني من هذه الهندسة باستخدام الإعداد الافتراضي`تسامح` . |
| [ToLinearGeometry](../../aspose.gis.geometries/igeometrycollection/tolineargeometry/#tolineargeometry_1)(double) | الحصول على إصدار تقريبي أو مكافئ غير منحني من هذه الهندسة باستخدام المحدد`تسامح` . |

### أنظر أيضا

* interface [IGeometry](../igeometry/)
* مساحة الاسم [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* المجسم [Aspose.GIS](../../)


