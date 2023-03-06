---
title: Geometry.CoveredBy
second_title: Aspose.GIS for .NET API リファレンス
description: Geometry 方法. このジオメトリが指定されたジオメトリによってカバーされているかどうかを判断します.
type: docs
weight: 150
url: /ja/net/aspose.gis.geometries/geometry/coveredby/
---
## Geometry.CoveredBy method

このジオメトリが指定されたジオメトリによってカバーされているかどうかを判断します.

```csharp
public bool CoveredBy(IGeometry other)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| other | IGeometry | ジオメトリ。 |

### 戻り値

`true`このジオメトリが別のジオメトリに「空間的に覆われている」場合。`false`そうでなければ.

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | 引数は`null`. |
| ArgumentException | ジオメトリの 1 つが無効であるため、操作を完了できません。 |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/)のジオメトリが同等ではありません. を使用できます[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/)ジオメトリを同じ spatial 参照系に変換するため. |

### 備考

このメソッドは、DE-9IM 交差行列に関して、あるジオメトリが別のジオメトリによってカバーされているかどうかをテストします。 このメソッドは、 と同等です。

```csharp
other.Covers(this);
```

### 関連項目

* method [SpatiallyContains](../../igeometry/spatiallycontains/)
* method [Covers](../../igeometry/covers/)
* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* 名前空間 [Aspose.Gis.Geometries](../../geometry/)
* 組み立て [Aspose.GIS](../../../)


