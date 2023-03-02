---
title: Interface IGeometryCollection
second_title: Aspose.GIS for .NET API Referansı
description: Aspose.Gis.Geometries.IGeometryCollection arayüz. birIGeometryCollection birIGeometry bu bir veya daha fazla geometriden oluşan bir koleksiyondur.
type: docs
weight: 1010
url: /tr/net/aspose.gis.geometries/igeometrycollection/
---
## IGeometryCollection interface

bir`IGeometryCollection` bir[`IGeometry`](../igeometry/) bu, bir veya daha fazla geometriden oluşan bir koleksiyondur.

```csharp
public interface IGeometryCollection : IEnumerable<IGeometry>, IEquatable<IGeometryCollection>, 
    IGeometry
```

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [Count](../../aspose.gis.geometries/igeometrycollection/count/) { get; } | Bu koleksiyondaki geometrilerin sayısını alır. |
| [Item](../../aspose.gis.geometries/igeometrycollection/item/) { get; } | Bir alır[`IGeometry`](../igeometry/) belirtilen dizinde. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [GetPointOnSurface](../../aspose.gis.geometries/igeometrycollection/getpointonsurface/)() | Bu koleksiyondaki yüzeylerden birinde olması garanti olan bir nokta bulur. |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/igeometrycollection/replacepolygonsbylines/)() | Bu geometrinin çizgileri olarak temsil edilen çokgenleri alır. |
| [ToEditable](../../aspose.gis.geometries/igeometrycollection/toeditable/)() | Bu geometrinin düzenlenebilir bir kopyasını alır. |
| [ToLinearGeometry](../../aspose.gis.geometries/igeometrycollection/tolineargeometry/#tolineargeometry)() | Varsayılanı kullanarak bu geometrinin yaklaşık veya eşdeğer eğri olmayan sürümünü alır`hata payı` . |
| [ToLinearGeometry](../../aspose.gis.geometries/igeometrycollection/tolineargeometry/#tolineargeometry_1)(double) | Belirtilen geometriyi kullanarak bu geometrinin yaklaşık veya eşdeğer eğri olmayan versiyonunu alır.`hata payı` . |

### Ayrıca bakınız

* interface [IGeometry](../igeometry/)
* ad alanı [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* toplantı [Aspose.GIS](../../)


