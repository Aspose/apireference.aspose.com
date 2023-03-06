---
title: IGeometry.Union
second_title: Aspose.GIS for .NET API リファレンス
description: IGeometry 方法. このジオメトリと指定されたジオメトリを結合します
type: docs
weight: 370
url: /ja/net/aspose.gis.geometries/igeometry/union/
---
## IGeometry.Union method

このジオメトリと指定されたジオメトリを結合します。

```csharp
public IGeometry Union(IGeometry other)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| other | IGeometry | 結合するジオメトリ。 |

### 戻り値

このジオメトリと引数の結合を表すジオメトリ。結果のジオメトリには、このジオメトリまたは引数に存在する ポイント セットが含まれます.

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | *other*は`null`. |
| ArgumentException | ジオメトリの 1 つが無効であるため、操作を完了できません。 |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/)のジオメトリが同等ではありません. を使用できます[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/)ジオメトリを同じ spatial 参照系に変換するため. |

### 関連項目

* interface [IGeometry](../)
* 名前空間 [Aspose.Gis.Geometries](../../igeometry/)
* 組み立て [Aspose.GIS](../../../)


