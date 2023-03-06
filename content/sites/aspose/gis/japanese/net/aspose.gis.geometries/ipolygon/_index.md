---
title: Interface IPolygon
second_title: Aspose.GIS for .NET API リファレンス
description: Aspose.Gis.Geometries.IPolygon インターフェース. AICurvePolygonその境界は線形リングによって定義されます.
type: docs
weight: 1100
url: /ja/net/aspose.gis.geometries/ipolygon/
---
## IPolygon interface

A[`ICurvePolygon`](../icurvepolygon/)その境界は線形リングによって定義されます.

```csharp
public interface IPolygon : ICurvePolygon, IEquatable<IPolygon>
```

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [ExteriorRing](../../aspose.gis.geometries/ipolygon/exteriorring/) { get; } | 外部リングを取得します。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [GetInteriorRing](../../aspose.gis.geometries/ipolygon/getinteriorring/)(int) | インデックスで内部リングを取得します。 |
| [ToEditable](../../aspose.gis.geometries/ipolygon/toeditable/)() | このジオメトリの編集可能なコピーを取得します. |

### 関連項目

* interface [ICurvePolygon](../icurvepolygon/)
* 名前空間 [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* 組み立て [Aspose.GIS](../../)


