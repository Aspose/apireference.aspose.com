---
title: Geometry.Crosses
second_title: Aspose.GIS for .NET API リファレンス
description: Geometry 方法. このジオメトリと指定されたジオメトリが交差するかどうかを決定します.
type: docs
weight: 170
url: /ja/net/aspose.gis.geometries/geometry/crosses/
---
## Geometry.Crosses method

このジオメトリと指定されたジオメトリが交差するかどうかを決定します.

```csharp
public bool Crosses(IGeometry other)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| other | IGeometry | ジオメトリ。 |

### 戻り値

`true`このジオメトリが別のジオメトリと「空間的に交差」している場合。`false`そうでなければ.

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | 引数は`null`. |
| ArgumentException | ジオメトリの 1 つが無効であるため、操作を完了できません。 |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/)のジオメトリが同等ではありません. を使用できます[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/)ジオメトリを同じ spatial 参照系に変換するため. |

### 備考

このメソッドは、ジオメトリが DE-9IM 交差行列に関して交差しているかどうかをテストします。 2 つのジオメトリが、すべてではなく一部の内部点を共有し、 交差の次元が少なくとも 1 つの次元よりも小さい場合、互いに交差します。 geometries. つまり: 2[`LineString`](../../linestring/) 'X' 文字、LineString、および[`Polygon`](../../polygon/) LineString が Polygon の内部を通過する場合は交差します。

### 関連項目

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* 名前空間 [Aspose.Gis.Geometries](../../geometry/)
* 組み立て [Aspose.GIS](../../../)


