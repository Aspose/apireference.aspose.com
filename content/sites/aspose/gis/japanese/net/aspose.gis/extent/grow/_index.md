---
title: Extent.Grow
second_title: Aspose.GIS for .NET API リファレンス
description: Extent 方法. このエクステントを拡張して引数を含めます
type: docs
weight: 160
url: /ja/net/aspose.gis/extent/grow/
---
## Grow(Extent) {#grow}

このエクステントを拡張して、引数を含めます。

```csharp
public void Grow(Extent extent)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| extent | Extent | その他程度。 |

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | 引数は`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/)この範囲と議論の両方ではない`null`互いに等しくない. |

### 備考

の場合[`SpatialReferenceSystem`](../spatialreferencesystem/)このSRSの`null`その後、引数の SRS で更新されます。

### 関連項目

* class [Extent](../)
* 名前空間 [Aspose.Gis](../../extent/)
* 組み立て [Aspose.GIS](../../../)

---

## Grow(double, double) {#grow_1}

指定したポイントが含まれるように、この範囲を拡張します。

```csharp
public void Grow(double x, double y)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| x | Double | 含める X 座標。 |
| y | Double | 含める Y 座標。 |

### 関連項目

* class [Extent](../)
* 名前空間 [Aspose.Gis](../../extent/)
* 組み立て [Aspose.GIS](../../../)


