---
title: VectorLayer.NearestTo
second_title: Aspose.GIS for .NET API リファレンス
description: VectorLayer 方法. 指定された座標に最も近いフィーチャを取得します
type: docs
weight: 150
url: /ja/net/aspose.gis/vectorlayer/nearestto/
---
## NearestTo(double, double) {#nearestto_1}

指定された座標に最も近いフィーチャを取得します。

```csharp
public Feature NearestTo(double x, double y)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| x | Double | 座標の X。 |
| y | Double | 座標の Y。 |

### 戻り値

指定された座標に最も近いフィーチャ。

### 関連項目

* class [Feature](../../feature/)
* class [VectorLayer](../)
* 名前空間 [Aspose.Gis](../../vectorlayer/)
* 組み立て [Aspose.GIS](../../../)

---

## NearestTo(IPoint) {#nearestto}

指定されたポイントに最も近いフィーチャを取得します。

```csharp
public Feature NearestTo(IPoint point)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| point | IPoint | ポイント。 |

### 戻り値

指定されたポイントに最も近いフィーチャ。

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | ポイントは`null`. |
| ArgumentException | ポイントが空か無効です。 |

### 関連項目

* class [Feature](../../feature/)
* interface [IPoint](../../../aspose.gis.geometries/ipoint/)
* class [VectorLayer](../)
* 名前空間 [Aspose.Gis](../../vectorlayer/)
* 組み立て [Aspose.GIS](../../../)


