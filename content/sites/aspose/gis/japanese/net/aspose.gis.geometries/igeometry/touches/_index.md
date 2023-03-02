---
title: IGeometry.Touches
second_title: Aspose.GIS for .NET API リファレンス
description: IGeometry 方法. このジオメトリと指定されたジオメトリが接触するかどうかを決定します.
type: docs
weight: 360
url: /ja/net/aspose.gis.geometries/igeometry/touches/
---
## IGeometry.Touches method

このジオメトリと指定されたジオメトリが接触するかどうかを決定します.

```csharp
public bool Touches(IGeometry other)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| other | IGeometry | ジオメトリ。 |

### 戻り値

`true`このジオメトリが別のジオメトリに「空間的に接触」している場合。`false`そうでなければ.

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | 引数は`null`. |
| ArgumentException | ジオメトリの 1 つが無効であるため、操作を完了できません。 |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/)のジオメトリが同等ではありません. を使用できます[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/)ジオメトリを同じ spatial 参照系に変換するため. |

### 備考

このメソッドは、ジオメトリが DE-9IM 交差行列に関して互いに接触しているかどうかをテストします. 2 つのジオメトリが、少なくとも 1 つの共通の境界点を持ち、内部の点がない場合、互いに接触します. つまり: 2[`LineString`](../../linestring/)は端点を共有しているが、セグメントを共有していない場合、互いに接触しています。 2 つのポリゴンは、外側または内側のリングの一部を共有しているが、それらの内側が重なっていない場合、互いに接触しています。 このメソッドは、 と同等です。 DE-9IM と「空間タッチ」関係の詳細については、OpenGIS Simple Features Specification を参照してください。

```csharp
this.Relate(other, "FT*******") || this.Relate(other, "F**T*****") || this.Relate(other, "F***T****");
```

### 関連項目

* interface [IGeometry](../)
* 名前空間 [Aspose.Gis.Geometries](../../igeometry/)
* 組み立て [Aspose.GIS](../../../)


