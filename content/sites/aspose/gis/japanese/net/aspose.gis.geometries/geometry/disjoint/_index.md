---
title: Geometry.Disjoint
second_title: Aspose.GIS for .NET API リファレンス
description: Geometry 方法. このジオメトリが指定されたジオメトリから切り離されているかどうかを判断します.
type: docs
weight: 190
url: /ja/net/aspose.gis.geometries/geometry/disjoint/
---
## Geometry.Disjoint method

このジオメトリが指定されたジオメトリから切り離されているかどうかを判断します.

```csharp
public bool Disjoint(IGeometry other)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| other | IGeometry | ジオメトリ。 |

### 戻り値

`true`このジオメトリが別のジオメトリから「空間的に分離」している場合。`false`そうでなければ.

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | 引数は`null`. |
| ArgumentException | ジオメトリの 1 つが無効であるため、操作を完了できません。 |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/)のジオメトリが同等ではありません. を使用できます[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/)ジオメトリを同じ spatial 参照系に変換するため. |

### 備考

このメソッドは、ジオメトリが DE-9IM 交差行列に関してばらばらであるかどうかをテストします。 基本的に、2 つのジオメトリに共通点がないことをテストします。 このメソッドは、 と同等です。 DE-9IM の詳細については、OpenGIS Simple Features Specification を参照してください。

```csharp
this.Relate(other, "FF*FF****");
```

### 関連項目

* method [Intersects](../../igeometry/intersects/)
* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* 名前空間 [Aspose.Gis.Geometries](../../geometry/)
* 組み立て [Aspose.GIS](../../../)


