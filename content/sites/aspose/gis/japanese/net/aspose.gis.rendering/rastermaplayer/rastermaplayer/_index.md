---
title: RasterMapLayer.RasterMapLayer
second_title: Aspose.GIS for .NET API リファレンス
description: RasterMapLayer コンストラクタ. 新しいインスタンスを作成します
type: docs
weight: 10
url: /ja/net/aspose.gis.rendering/rastermaplayer/rastermaplayer/
---
## RasterMapLayer constructor

新しいインスタンスを作成します。

```csharp
public RasterMapLayer(RasterLayer layer, RasterColorizer colorizer = null, bool keepOpen = false)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| layer | RasterLayer | ラスター レイヤー。 |
| colorizer | RasterColorizer | レイヤーのレンダリングに使用するシンボライザー。もしも`null`、デフォルトのカラーライザーが使用されます。 |
| keepOpen | Boolean | `true`レイヤーを開いたままにする[`VectorMapLayer`](../../vectormaplayer/)オブジェクトが破棄されます。さもないと、`false` . |

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | レイヤーは`null`. |

### 関連項目

* class [RasterLayer](../../../aspose.gis.raster/rasterlayer/)
* class [RasterColorizer](../../../aspose.gis.rendering.colorizers/rastercolorizer/)
* class [RasterMapLayer](../)
* 名前空間 [Aspose.Gis.Rendering](../../rastermaplayer/)
* 組み立て [Aspose.GIS](../../../)


