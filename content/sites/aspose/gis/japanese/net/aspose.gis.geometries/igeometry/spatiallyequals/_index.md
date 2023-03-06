---
title: IGeometry.SpatiallyEquals
second_title: Aspose.GIS for .NET API リファレンス
description: IGeometry 方法. このジオメトリが指定されたジオメトリと空間的に等しいかどうかを決定します.
type: docs
weight: 320
url: /ja/net/aspose.gis.geometries/igeometry/spatiallyequals/
---
## IGeometry.SpatiallyEquals method

このジオメトリが指定されたジオメトリと空間的に等しいかどうかを決定します.

```csharp
public bool SpatiallyEquals(IGeometry other)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| other | IGeometry | ジオメトリ。 |

### 戻り値

`true`このジオメトリが指定されたジオメトリと「空間的に等しい」場合。`false`そうでなければ.

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | 引数は`null`. |
| ArgumentException | ジオメトリの 1 つが無効であるため、操作を完了できません。 |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/)のジオメトリが同等ではありません. を使用できます[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/)ジオメトリを同じ spatial 参照系に変換するため. |

### 備考

このメソッドは、DE-9IM 交差行列に関して同等性をテストします。コンポーネントの order (ポリゴンの内部リングの順序など)、Z および M 値には依存しません。基本的に、2 つのジオメトリが 2 次元空間に投影されたときに同じ「空間」を占有することをテストします 。 このメソッドは、 と同等です。 DE-9IM の詳細については、OpenGIS Simple Features Specification を参照してください。

```csharp
this.Relate(other, "T*F**FFF*");
```

### 関連項目

* interface [IGeometry](../)
* 名前空間 [Aspose.Gis.Geometries](../../igeometry/)
* 組み立て [Aspose.GIS](../../../)


