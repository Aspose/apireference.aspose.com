---
title: IGeometry.Difference
second_title: Aspose.GIS for .NET API リファレンス
description: IGeometry 方法. このジオメトリから指定されたジオメトリを減算します
type: docs
weight: 170
url: /ja/net/aspose.gis.geometries/igeometry/difference/
---
## IGeometry.Difference method

このジオメトリから指定されたジオメトリを減算します。

```csharp
public IGeometry Difference(IGeometry other)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| other | IGeometry | 差し引くジオメトリ。 |

### 戻り値

このジオメトリと引数の違いを表すジオメトリ。結果のジオメトリには、このジオメトリには存在するが引数には存在しない ポイント セットが含まれています.

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


