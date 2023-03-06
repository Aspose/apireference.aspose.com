---
title: Extent.Contains
second_title: Aspose.GIS for .NET API リファレンス
description: Extent 方法. この範囲に引数で定義された座標が含まれているかどうかを判断します
type: docs
weight: 120
url: /ja/net/aspose.gis/extent/contains/
---
## Contains(double, double) {#contains_2}

この範囲に、引数で定義された座標が含まれているかどうかを判断します。

```csharp
public bool Contains(double x, double y)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| x | Double | 座標の X。 |
| y | Double | 座標の Y。 |

### 戻り値

座標が境界ボックス内にあるかどうかを示す値。

### 備考

この境界上にある座標[`Extent`](../)are はこれに含まれていると見なされます[`Extent`](../) .

### 関連項目

* class [Extent](../)
* 名前空間 [Aspose.Gis](../../extent/)
* 組み立て [Aspose.GIS](../../../)

---

## Contains(Extent) {#contains}

このエクステントに引数が含まれているかどうかを判断します。

```csharp
public bool Contains(Extent extent)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| extent | Extent | 別の程度。 |

### 戻り値

この範囲に引数が含まれているかどうかを示す値。

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | 引数は`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/)この範囲と議論の両方ではない`null`互いに等しくない. |

### 備考

この境界上にある座標[`Extent`](../)are はこれに含まれていると見なされます[`Extent`](../) .このため、等しいエクステントは が互いに含まれていると見なされます.

### 関連項目

* class [Extent](../)
* 名前空間 [Aspose.Gis](../../extent/)
* 組み立て [Aspose.GIS](../../../)

---

## Contains(IGeometry) {#contains_1}

このエクステントに引数が含まれているかどうかを判断します。

```csharp
public bool Contains(IGeometry geometry)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| geometry | IGeometry | 封じ込めをテストするジオメトリ。 |

### 戻り値

この範囲に引数が含まれているかどうかを示す値。

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | 引数は`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/)この範囲と議論の両方ではない`null`互いに等しくない. |

### 備考

この境界上にある座標[`Extent`](../)are はこれに含まれていると見なされます[`Extent`](../) .

### 関連項目

* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [Extent](../)
* 名前空間 [Aspose.Gis](../../extent/)
* 組み立て [Aspose.GIS](../../../)


