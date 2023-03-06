---
title: Geometry.Overlaps
second_title: Aspose.GIS for .NET API リファレンス
description: Geometry 方法. このジオメトリが指定されたジオメトリとオーバーラップするかどうかを決定します
type: docs
weight: 290
url: /ja/net/aspose.gis.geometries/geometry/overlaps/
---
## Geometry.Overlaps method

このジオメトリが指定されたジオメトリとオーバーラップするかどうかを決定します。

```csharp
public bool Overlaps(IGeometry other)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| other | IGeometry | ジオメトリ。 |

### 戻り値

`true`このジオメトリが別のジオメトリと「空間的にオーバーラップ」している場合。`false`そうでなければ.

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | 引数は`null`. |
| ArgumentException | ジオメトリの 1 つが無効であるため、操作を完了できません。 |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/)のジオメトリが同等ではありません. を使用できます[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/)ジオメトリを同じ spatial 参照系に変換するため. |

### 備考

このメソッドは、ジオメトリが DE-9IM 交差行列に関してオーバーラップしているかどうかをテストします。 2 つのジオメトリが、すべてではなく一部の共通の内部ポイントを持ち、geometries の交差がジオメトリ自体と同じ次元を持つ場合、オーバーラップします。 2 つの場合Pointジオメトリまたは 2 つSurfaceジオメトリ this メソッドは: と同等です 2 つの場合Lineこのメソッドが同等のジオメトリ: 等しくない 2 つのジオメトリの場合[`Dimension`](../../igeometry/dimension/)このメソッドは常に戻ります`false`. DE-9IM と「空間的オーバーラップ」関係の詳細については、OpenGIS Simple Features Specification を参照してください。

```csharp
this.Relate(other, "T*T***T**");
```

```csharp
this.Relate(other, "1*T***T**");
```

### 関連項目

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* 名前空間 [Aspose.Gis.Geometries](../../geometry/)
* 組み立て [Aspose.GIS](../../../)


