---
title: Geometry.SymDifference
second_title: Aspose.GIS for .NET API リファレンス
description: Geometry 方法. このジオメトリと指定されたジオメトリの間の対称差分を作成します
type: docs
weight: 380
url: /ja/net/aspose.gis.geometries/geometry/symdifference/
---
## Geometry.SymDifference method

このジオメトリと指定されたジオメトリの間の対称差分を作成します。

```csharp
public IGeometry SymDifference(IGeometry other)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| other | IGeometry | 対称差分を計算するジオメトリ。 |

### 戻り値

このジオメトリと引数の対称差を表すジオメトリ。結果のジオメトリには、ジオメトリの 1 つには存在するが両方には存在しない ポイント セットが含まれています。

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


