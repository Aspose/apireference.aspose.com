---
title: Geometry.Covers
second_title: Aspose.GIS for .NET API リファレンス
description: Geometry 方法. このジオメトリが指定されたジオメトリをカバーするかどうかを決定します.
type: docs
weight: 160
url: /ja/net/aspose.gis.geometries/geometry/covers/
---
## Geometry.Covers method

このジオメトリが指定されたジオメトリをカバーするかどうかを決定します.

```csharp
public bool Covers(IGeometry other)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| other | IGeometry | ジオメトリ。 |

### 戻り値

`true`このジオメトリが別のジオメトリを「空間的にカバー」している場合。`false`そうでなければ.

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | 引数は`null`. |
| ArgumentException | ジオメトリの 1 つが無効であるため、操作を完了できません。 |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/)のジオメトリが同等ではありません. を使用できます[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/)ジオメトリを同じ spatial 参照系に変換するため. |

### 備考

このメソッドは、DE-9IM 交差行列に関して、あるジオメトリが別のジオメトリをカバーしているかどうかをテストします。 ジオメトリに別のジオメトリのすべてのポイントが含まれている場合、1 つのジオメトリが別のジオメトリをカバーしています。[`SpatiallyContains`](../../igeometry/spatiallycontains/) 、しかし戻ります`true`多くの場合、 は内部ポイントと境界ポイントを区別しないためです。したがって、ジオメトリ A が ジオメトリ B の境界上にある場合、[`SpatiallyContains`](../../igeometry/spatiallycontains/)戻り値`false`, このメソッドが戻る間`true`. このメソッドは、 と同等です。

```csharp
this.Relate(other, "T*****FF*") || this.Relate(other, "*T****FF*") || this.Relate(other, "***T**FF*) || this.Relate(other, "***T*FF*");
```

### 関連項目

* method [SpatiallyContains](../../igeometry/spatiallycontains/)
* method [CoveredBy](../../igeometry/coveredby/)
* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* 名前空間 [Aspose.Gis.Geometries](../../geometry/)
* 組み立て [Aspose.GIS](../../../)


