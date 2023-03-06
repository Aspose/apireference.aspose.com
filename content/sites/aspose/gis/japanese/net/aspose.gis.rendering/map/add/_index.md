---
title: Map.Add
second_title: Aspose.GIS for .NET API リファレンス
description: Map 方法. を作成しますVectorMapLayerデフォルトのシンボライザーを使用してマップに追加しますレイヤーは追加順にレンダリングされます.
type: docs
weight: 110
url: /ja/net/aspose.gis.rendering/map/add/
---
## Add(VectorLayer, bool) {#add_7}

を作成します[`VectorMapLayer`](../../vectormaplayer/)デフォルトのシンボライザーを使用してマップに追加します。レイヤーは追加順にレンダリングされます.

```csharp
public void Add(VectorLayer layer, bool keepOpen = false)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| layer | VectorLayer | 表現するベクターレイヤー[`VectorMapLayer`](../../vectormaplayer/). |
| keepOpen | Boolean | `true`の後にベクターレイヤーを開いたままにする[`Map`](../)オブジェクトは破棄されます; `false`レイヤーを破棄します. |

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | レイヤーは`null`. |

### 関連項目

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [Map](../)
* 名前空間 [Aspose.Gis.Rendering](../../map/)
* 組み立て [Aspose.GIS](../../../)

---

## Add(VectorLayer, VectorSymbolizer, bool) {#add_6}

を作成して追加します[`VectorMapLayer`](../../vectormaplayer/)マップへ。レイヤーは追加順にレンダリングされます.

```csharp
public void Add(VectorLayer layer, VectorSymbolizer symbolizer, bool keepOpen = false)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| layer | VectorLayer | 表現するベクターレイヤー[`VectorMapLayer`](../../vectormaplayer/). |
| symbolizer | VectorSymbolizer | レンダリングに使用するシンボライザー。もしも`null`、デフォルトのシンボライザーが使用されます。 |
| keepOpen | Boolean | `true`の後にベクターレイヤーを開いたままにする[`Map`](../)オブジェクトは破棄されます; `false`レイヤーを破棄します. |

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | レイヤーは`null`. |

### 関連項目

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Map](../)
* 名前空間 [Aspose.Gis.Rendering](../../map/)
* 組み立て [Aspose.GIS](../../../)

---

## Add(VectorLayer, VectorSymbolizer, Labeling, bool) {#add_5}

を作成して追加します[`VectorMapLayer`](../../vectormaplayer/)マップへ。レイヤーは追加順にレンダリングされます.

```csharp
public void Add(VectorLayer layer, VectorSymbolizer symbolizer, Labeling labeling, 
    bool keepOpen = false)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| layer | VectorLayer | 表現するベクターレイヤー[`VectorMapLayer`](../../vectormaplayer/). |
| symbolizer | VectorSymbolizer | レンダリングに使用するシンボライザー。もしも`null`、デフォルトのシンボライザーが使用されます。 |
| labeling | Labeling | レイヤー内のフィーチャにラベルを付けるために使用するラベリング。もしも`null`、 デフォルト[`NullLabeling`](../../../aspose.gis.rendering.labelings/nulllabeling/)使用されます. |
| keepOpen | Boolean | `true`レイヤーを開いたままにする[`Map`](../)オブジェクトが破棄されます。さもないと、`false` . |

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | レイヤーは`null`. |

### 関連項目

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Labeling](../../../aspose.gis.rendering.labelings/labeling/)
* class [Map](../)
* 名前空間 [Aspose.Gis.Rendering](../../map/)
* 組み立て [Aspose.GIS](../../../)

---

## Add(FeaturesSequence) {#add}

を作成して追加します[`VectorMapLayer`](../../vectormaplayer/)マップへ。レイヤーは追加順にレンダリングされます.

```csharp
public void Add(FeaturesSequence featuresSequence)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | で表す機能シーケンス[`VectorMapLayer`](../../vectormaplayer/). |

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | 機能シーケンスは`null`. |

### 関連項目

* class [FeaturesSequence](../../../aspose.gis/featuressequence/)
* class [Map](../)
* 名前空間 [Aspose.Gis.Rendering](../../map/)
* 組み立て [Aspose.GIS](../../../)

---

## Add(FeaturesSequence, VectorSymbolizer) {#add_1}

を作成して追加します[`VectorMapLayer`](../../vectormaplayer/)マップへ。レイヤーは追加順にレンダリングされます.

```csharp
public void Add(FeaturesSequence featuresSequence, VectorSymbolizer symbolizer)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | で表す機能シーケンス[`VectorMapLayer`](../../vectormaplayer/). |
| symbolizer | VectorSymbolizer | レンダリングに使用するシンボライザー。もしも`null`、デフォルトのシンボライザーが使用されます。 |

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | 機能シーケンスは`null`. |

### 関連項目

* class [FeaturesSequence](../../../aspose.gis/featuressequence/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Map](../)
* 名前空間 [Aspose.Gis.Rendering](../../map/)
* 組み立て [Aspose.GIS](../../../)

---

## Add(FeaturesSequence, VectorSymbolizer, Labeling) {#add_2}

を作成して追加します[`VectorMapLayer`](../../vectormaplayer/)マップへ。レイヤーは追加順にレンダリングされます.

```csharp
public void Add(FeaturesSequence featuresSequence, VectorSymbolizer symbolizer, Labeling labeling)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | で表す機能シーケンス[`VectorMapLayer`](../../vectormaplayer/). |
| symbolizer | VectorSymbolizer | レンダリングに使用するシンボライザー。 |
| labeling | Labeling | レイヤー内のフィーチャにラベルを付けるために使用するラベリング。もしも`null`、[`NullLabeling`](../../../aspose.gis.rendering.labelings/nulllabeling/)使用されます. |

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | 機能シーケンスは`null`. |

### 関連項目

* class [FeaturesSequence](../../../aspose.gis/featuressequence/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Labeling](../../../aspose.gis.rendering.labelings/labeling/)
* class [Map](../)
* 名前空間 [Aspose.Gis.Rendering](../../map/)
* 組み立て [Aspose.GIS](../../../)

---

## Add(MapLayer) {#add_4}

レイヤーをマップに追加します。レイヤーは追加順にレンダリングされます.

```csharp
public void Add(MapLayer mapLayer)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| mapLayer | MapLayer | 追加するレイヤー。 |

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | 引数は`null`. |

### 関連項目

* class [MapLayer](../../maplayer/)
* class [Map](../)
* 名前空間 [Aspose.Gis.Rendering](../../map/)
* 組み立て [Aspose.GIS](../../../)

---

## Add(RasterLayer, RasterColorizer, bool) {#add_3}

を作成します[`RasterMapLayer`](../../rastermaplayer/)デフォルトのカラーライザーでマップに追加します.

```csharp
public void Add(RasterLayer layer, RasterColorizer colorizer = null, bool keepOpen = false)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| layer | RasterLayer | 表現するベクターレイヤー[`RasterLayer`](../../../aspose.gis.raster/rasterlayer/). |
| colorizer | RasterColorizer | レンダリングに使用するカラライザー。もしも`null`、デフォルトのカラーライザーが使用されます。 |
| keepOpen | Boolean | `true`ラスタ レイヤを開いたままにします。[`Map`](../)オブジェクトは破棄されます; `false`レイヤーを破棄します. |

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | レイヤーは`null`. |

### 関連項目

* class [RasterLayer](../../../aspose.gis.raster/rasterlayer/)
* class [RasterColorizer](../../../aspose.gis.rendering.colorizers/rastercolorizer/)
* class [Map](../)
* 名前空間 [Aspose.Gis.Rendering](../../map/)
* 組み立て [Aspose.GIS](../../../)


