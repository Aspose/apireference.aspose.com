---
title: Class Map
second_title: Aspose.GIS for .NET API リファレンス
description: Aspose.Gis.Rendering.Map クラス. マップはレイヤーのコレクションでありレイヤーを重ねてレンダリングできますRenderer .
type: docs
weight: 1720
url: /ja/net/aspose.gis.rendering/map/
---
## Map class

マップはレイヤーのコレクションであり、レイヤーを重ねてレンダリングできます。[`Renderer`](../renderer/) .

```csharp
public class Map : IDisposable, IReadOnlyList<MapLayer>
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [Map](map/)(Measurement, Measurement) | の新しいインスタンスを作成します`地図`class. |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [BackgroundColor](../../aspose.gis.rendering/map/backgroundcolor/) { get; set; } | マップの背景色。デフォルトはTransparent . |
| [Count](../../aspose.gis.rendering/map/count/) { get; } | マップ内のレイヤー数を取得します。 |
| [Extent](../../aspose.gis.rendering/map/extent/) { get; set; } | レンダリングするマップの境界を指定します。 に設定されている場合`null`、レンダリング中に範囲が計算され、すべてのレイヤーのすべてのジオメトリが含まれます. |
| [Height](../../aspose.gis.rendering/map/height/) { get; set; } | マップの視覚的な高さ。 |
| [Item](../../aspose.gis.rendering/map/item/) { get; } | 指定されたインデックスのレイヤーを取得します。 |
| [Padding](../../aspose.gis.rendering/map/padding/) { get; set; } | 範囲に追加するパディングを指定します。 |
| [Resolution](../../aspose.gis.rendering/map/resolution/) { get; set; } | このマップのレンダリングと変換に使用される解像度[`Measurement`](../measurement/).デフォルトは 96 です。 |
| [SpatialReferenceSystem](../../aspose.gis.rendering/map/spatialreferencesystem/) { get; set; } | [`SpatialReferenceSystem`](./spatialreferencesystem/)マップの。 |
| [Width](../../aspose.gis.rendering/map/width/) { get; set; } | マップの表示幅。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [Add](../../aspose.gis.rendering/map/add/#add)(FeaturesSequence) | を作成して追加します[`VectorMapLayer`](../vectormaplayer/)マップへ。レイヤーは追加順にレンダリングされます. |
| [Add](../../aspose.gis.rendering/map/add/#add_4)(MapLayer) | レイヤーをマップに追加します。レイヤーは追加順にレンダリングされます. |
| [Add](../../aspose.gis.rendering/map/add/#add_1)(FeaturesSequence, VectorSymbolizer) | を作成して追加します[`VectorMapLayer`](../vectormaplayer/)マップへ。レイヤーは追加順にレンダリングされます. |
| [Add](../../aspose.gis.rendering/map/add/#add_7)(VectorLayer, bool) | を作成します[`VectorMapLayer`](../vectormaplayer/)デフォルトのシンボライザーを使用してマップに追加します。レイヤーは追加順にレンダリングされます. |
| [Add](../../aspose.gis.rendering/map/add/#add_2)(FeaturesSequence, VectorSymbolizer, Labeling) | を作成して追加します[`VectorMapLayer`](../vectormaplayer/)マップへ。レイヤーは追加順にレンダリングされます. |
| [Add](../../aspose.gis.rendering/map/add/#add_3)(RasterLayer, RasterColorizer, bool) | を作成します[`RasterMapLayer`](../rastermaplayer/)デフォルトのカラーライザーでマップに追加します. |
| [Add](../../aspose.gis.rendering/map/add/#add_6)(VectorLayer, VectorSymbolizer, bool) | を作成して追加します[`VectorMapLayer`](../vectormaplayer/)マップへ。レイヤーは追加順にレンダリングされます. |
| [Add](../../aspose.gis.rendering/map/add/#add_5)(VectorLayer, VectorSymbolizer, Labeling, bool) | を作成して追加します[`VectorMapLayer`](../vectormaplayer/)マップへ。レイヤーは追加順にレンダリングされます. |
| [Dispose](../../aspose.gis.rendering/map/dispose/)() | リソースを破棄します。 |
| [GetEnumerator](../../aspose.gis.rendering/map/getenumerator/)() | マップ内のレイヤーを反復処理する列挙子を返します。 |
| [Render](../../aspose.gis.rendering/map/render/#render)(AbstractPath, Renderer) | マップをファイルにレンダリングします。 |
| [Render](../../aspose.gis.rendering/map/render/#render_1)(string, Renderer) | マップをファイルにレンダリングします。 |

### 関連項目

* class [MapLayer](../maplayer/)
* 名前空間 [Aspose.Gis.Rendering](../../aspose.gis.rendering/)
* 組み立て [Aspose.GIS](../../)


