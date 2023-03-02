---
title: IGeometry.Intersects
second_title: Aspose.GIS for .NET API リファレンス
description: IGeometry 方法. このジオメトリが指定された範囲と交差するかどうかを決定します.
type: docs
weight: 270
url: /ja/net/aspose.gis.geometries/igeometry/intersects/
---
## Intersects(Extent) {#intersects}

このジオメトリが指定された範囲と交差するかどうかを決定します.

```csharp
public bool Intersects(Extent extent)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| extent | Extent | 程度。 |

### 戻り値

`true`このジオメトリが範囲と交差する場合。`false`そうでなければ.

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | 引数は`null`. |

### 関連項目

* method [Intersects](../../../aspose.gis/extent/intersects/)
* class [Extent](../../../aspose.gis/extent/)
* interface [IGeometry](../)
* 名前空間 [Aspose.Gis.Geometries](../../igeometry/)
* 組み立て [Aspose.GIS](../../../)

---

## Intersects(IGeometry) {#intersects_1}

このジオメトリと指定されたジオメトリが交差するかどうかを決定します。

```csharp
public bool Intersects(IGeometry other)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| other | IGeometry | ジオメトリ。 |

### 戻り値

`true`このジオメトリが別のジオメトリと「空間的に交差する」場合。`false`そうでなければ.

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | 引数は`null`. |
| ArgumentException | ジオメトリの 1 つが無効であるため、操作を完了できません。 |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/)のジオメトリが同等ではありません. を使用できます[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/)ジオメトリを同じ spatial 参照系に変換するため. |

### 備考

このメソッドは、 と同等です。 の否定です。[`Disjoint`](../disjoint/) .見る[`Disjoint`](../disjoint/)詳しくは.

```csharp
!this.Disjoint(other);
```

### 関連項目

* interface [IGeometry](../)
* 名前空間 [Aspose.Gis.Geometries](../../igeometry/)
* 組み立て [Aspose.GIS](../../../)


