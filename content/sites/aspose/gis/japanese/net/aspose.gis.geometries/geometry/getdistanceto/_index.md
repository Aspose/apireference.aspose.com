---
title: Geometry.GetDistanceTo
second_title: Aspose.GIS for .NET API リファレンス
description: Geometry 方法. このジオメトリと指定されたジオメトリ間の最小距離を計算します.
type: docs
weight: 240
url: /ja/net/aspose.gis.geometries/geometry/getdistanceto/
---
## Geometry.GetDistanceTo method

このジオメトリと指定されたジオメトリ間の最小距離を計算します.

```csharp
public double GetDistanceTo(IGeometry other)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| other | IGeometry | 距離を求めるジオメトリ。 |

### 戻り値

両方のジオメトリがそうでない場合[`IsEmpty`](../isempty/) ジオメトリの最も近いポイント間の距離. 少なくとも 1 つのジオメトリが空の場合、-1 が返されます.

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | 引数は`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/)のジオメトリが同等ではありません. を使用できます[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/)ジオメトリを同じ spatial 参照系に変換するため. |

### 関連項目

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* 名前空間 [Aspose.Gis.Geometries](../../geometry/)
* 組み立て [Aspose.GIS](../../../)


