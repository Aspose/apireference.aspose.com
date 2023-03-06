---
title: Extent.Intersects
second_title: Aspose.GIS for .NET API リファレンス
description: Extent 方法. このエクステントが引数と交差するかどうかを決定します
type: docs
weight: 190
url: /ja/net/aspose.gis/extent/intersects/
---
## Intersects(Extent) {#intersects}

このエクステントが引数と交差するかどうかを決定します。

```csharp
public bool Intersects(Extent extent)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| extent | Extent | 別の程度。 |

### 戻り値

この範囲が引数と交差するかどうかを示す値。

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | 引数は`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/)この範囲と議論の両方ではない`null`互いに等しくない. |

### 関連項目

* class [Extent](../)
* 名前空間 [Aspose.Gis](../../extent/)
* 組み立て [Aspose.GIS](../../../)

---

## Intersects(IGeometry) {#intersects_1}

このエクステントが引数と交差するかどうかを決定します。

```csharp
public bool Intersects(IGeometry geometry)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| geometry | IGeometry | 交差をテストするジオメトリ |

### 戻り値

この範囲が引数と交差するかどうかを示す値。

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | 引数は`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/)この範囲と議論の両方ではない`null`互いに等しくない. |

### 関連項目

* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [Extent](../)
* 名前空間 [Aspose.Gis](../../extent/)
* 組み立て [Aspose.GIS](../../../)


