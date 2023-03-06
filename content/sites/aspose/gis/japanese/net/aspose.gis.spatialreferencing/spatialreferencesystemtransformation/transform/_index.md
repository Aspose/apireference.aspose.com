---
title: SpatialReferenceSystemTransformation.Transform
second_title: Aspose.GIS for .NET API リファレンス
description: SpatialReferenceSystemTransformation 方法. ジオメトリをソース空間参照系からターゲット空間参照系に変換します
type: docs
weight: 40
url: /ja/net/aspose.gis.spatialreferencing/spatialreferencesystemtransformation/transform/
---
## SpatialReferenceSystemTransformation.Transform method

ジオメトリをソース空間参照系からターゲット空間参照系に変換します。

```csharp
public Geometry Transform(IGeometry geometry)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| geometry | IGeometry | 変換するジオメトリ。 |

### 戻り値

ターゲット空間参照系の新しいジオメトリ。

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | ジオメトリは`null`. |
| ArgumentException | ジオメトリ[`SpatialReferenceSystem`](../../../aspose.gis.geometries/igeometry/spatialreferencesystem/)ではありません`null` と同等ではありません[`Source`](../source/) |
| [TransformationException](../../transformationexception/) | 変換に失敗しました。 |

### 関連項目

* class [Geometry](../../../aspose.gis.geometries/geometry/)
* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [SpatialReferenceSystemTransformation](../)
* 名前空間 [Aspose.Gis.SpatialReferencing](../../spatialreferencesystemtransformation/)
* 組み立て [Aspose.GIS](../../../)


