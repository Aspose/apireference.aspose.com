---
title: IGeometry.SpatiallyContains
second_title: Aspose.GIS for .NET API リファレンス
description: IGeometry 方法. このジオメトリが指定されたジオメトリを空間的に含むかどうかを決定します.
type: docs
weight: 310
url: /ja/net/aspose.gis.geometries/igeometry/spatiallycontains/
---
## IGeometry.SpatiallyContains method

このジオメトリが指定されたジオメトリを空間的に含むかどうかを決定します.

```csharp
public bool SpatiallyContains(IGeometry other)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| other | IGeometry | ジオメトリ。 |

### 戻り値

`true`このジオメトリが別のジオメトリを「空間的に含む」場合。`false`そうでなければ.

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | 引数は`null`. |
| ArgumentException | ジオメトリの 1 つが無効であるため、操作を完了できません。 |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/)のジオメトリが同等ではありません. を使用できます[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/)ジオメトリを同じ spatial 参照系に変換するため. |

### 備考

このメソッドは、DE-9IM 交差行列に関して、あるジオメトリに別のジオメトリが含まれているかどうかをテストします。 このメソッドは、 と同等です。

```csharp
other.Within(this);
```

### 関連項目

* method [Within](../within/)
* method [Covers](../covers/)
* interface [IGeometry](../)
* 名前空間 [Aspose.Gis.Geometries](../../igeometry/)
* 組み立て [Aspose.GIS](../../../)


