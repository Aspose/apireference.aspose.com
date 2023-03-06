---
title: Geometry.Intersection
second_title: Aspose.GIS for .NET API リファレンス
description: Geometry 方法. このジオメトリと指定されたジオメトリの間の交差を構築します
type: docs
weight: 270
url: /ja/net/aspose.gis.geometries/geometry/intersection/
---
## Geometry.Intersection method

このジオメトリと指定されたジオメトリの間の交差を構築します。

```csharp
public IGeometry Intersection(IGeometry other)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| other | IGeometry | 交差を計算するジオメトリ。 |

### 戻り値

このジオメトリと引数の交差を表すジオメトリ。結果のジオメトリには、このジオメトリと引数の両方に存在する ポイント セットが含まれています.

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | *other*は`null`. |
| ArgumentException | ジオメトリの 1 つが無効であるため、操作を完了できません。 |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/)のジオメトリが同等ではありません. を使用できます[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/)ジオメトリを同じ spatial 参照系に変換するため. |

### 関連項目

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* 名前空間 [Aspose.Gis.Geometries](../../geometry/)
* 組み立て [Aspose.GIS](../../../)


