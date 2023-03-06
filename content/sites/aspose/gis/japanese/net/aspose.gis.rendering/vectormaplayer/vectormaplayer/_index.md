---
title: VectorMapLayer.VectorMapLayer
second_title: Aspose.GIS for .NET API リファレンス
description: VectorMapLayer コンストラクタ. デフォルトのシンボライザーで新しいインスタンスを作成します
type: docs
weight: 10
url: /ja/net/aspose.gis.rendering/vectormaplayer/vectormaplayer/
---
## VectorMapLayer(FeaturesSequence) {#constructor}

デフォルトのシンボライザーで新しいインスタンスを作成します。

```csharp
public VectorMapLayer(FeaturesSequence featuresSequence)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | 機能シーケンス。 |

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | 引数は`null`. |

### 関連項目

* class [FeaturesSequence](../../../aspose.gis/featuressequence/)
* class [VectorMapLayer](../)
* 名前空間 [Aspose.Gis.Rendering](../../vectormaplayer/)
* 組み立て [Aspose.GIS](../../../)

---

## VectorMapLayer(FeaturesSequence, VectorSymbolizer) {#constructor_1}

デフォルトのシンボライザーで新しいインスタンスを作成します。

```csharp
public VectorMapLayer(FeaturesSequence featuresSequence, VectorSymbolizer symbolizer)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | 機能シーケンス。 |
| symbolizer | VectorSymbolizer | レイヤーのレンダリングに使用するシンボライザー。もしも`null`、デフォルトのシンボライザーが使用されます。 |

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | 引数は`null`. |

### 関連項目

* class [FeaturesSequence](../../../aspose.gis/featuressequence/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [VectorMapLayer](../)
* 名前空間 [Aspose.Gis.Rendering](../../vectormaplayer/)
* 組み立て [Aspose.GIS](../../../)

---

## VectorMapLayer(FeaturesSequence, VectorSymbolizer, Labeling) {#constructor_2}

デフォルトのシンボライザーで新しいインスタンスを作成します。

```csharp
public VectorMapLayer(FeaturesSequence featuresSequence, VectorSymbolizer symbolizer, 
    Labeling labeling)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | 機能シーケンス。 |
| symbolizer | VectorSymbolizer | レイヤーのレンダリングに使用するシンボライザー。もしも`null`、デフォルトのシンボライザーが使用されます。 |
| labeling | Labeling | レイヤー内のフィーチャにラベルを付けるために使用するラベリング。もしも`null`、 デフォルト[`NullLabeling`](../../../aspose.gis.rendering.labelings/nulllabeling/)使用されます. |

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | 引数は`null`. |

### 関連項目

* class [FeaturesSequence](../../../aspose.gis/featuressequence/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Labeling](../../../aspose.gis.rendering.labelings/labeling/)
* class [VectorMapLayer](../)
* 名前空間 [Aspose.Gis.Rendering](../../vectormaplayer/)
* 組み立て [Aspose.GIS](../../../)

---

## VectorMapLayer(VectorLayer, bool) {#constructor_5}

デフォルトのシンボライザーで新しいインスタンスを作成します。

```csharp
public VectorMapLayer(VectorLayer layer, bool keepOpen = true)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| layer | VectorLayer | ベクターレイヤー。 |
| keepOpen | Boolean | `true`レイヤーを開いたままにする[`VectorMapLayer`](../)オブジェクトが破棄されます。さもないと、`false` . |

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | レイヤーは`null`. |

### 関連項目

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [VectorMapLayer](../)
* 名前空間 [Aspose.Gis.Rendering](../../vectormaplayer/)
* 組み立て [Aspose.GIS](../../../)

---

## VectorMapLayer(VectorLayer, VectorSymbolizer, bool) {#constructor_4}

新しいインスタンスを作成します。

```csharp
public VectorMapLayer(VectorLayer layer, VectorSymbolizer symbolizer, bool keepOpen = true)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| layer | VectorLayer | ベクターレイヤー。 |
| symbolizer | VectorSymbolizer | レイヤーのレンダリングに使用するシンボライザー。もしも`null`、デフォルトのシンボライザーが使用されます。 |
| keepOpen | Boolean | `true`レイヤーを開いたままにする[`VectorMapLayer`](../)オブジェクトが破棄されます。さもないと、`false` . |

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | レイヤーは`null`. |

### 関連項目

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [VectorMapLayer](../)
* 名前空間 [Aspose.Gis.Rendering](../../vectormaplayer/)
* 組み立て [Aspose.GIS](../../../)

---

## VectorMapLayer(VectorLayer, VectorSymbolizer, Labeling, bool) {#constructor_3}

新しいインスタンスを作成します。

```csharp
public VectorMapLayer(VectorLayer layer, VectorSymbolizer symbolizer, Labeling labeling, 
    bool keepOpen = true)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| layer | VectorLayer | ベクターレイヤー。 |
| symbolizer | VectorSymbolizer | レイヤーのレンダリングに使用するシンボライザー。もしも`null`、デフォルトのシンボライザーが使用されます. |
| labeling | Labeling | レイヤー内のフィーチャにラベルを付けるために使用するラベリング。もしも`null`、 デフォルト[`NullLabeling`](../../../aspose.gis.rendering.labelings/nulllabeling/)使用されます. |
| keepOpen | Boolean | `true`レイヤーを開いたままにする[`VectorMapLayer`](../)オブジェクトが破棄されます。さもないと、`false` . |

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | レイヤーは`null`. |

### 関連項目

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Labeling](../../../aspose.gis.rendering.labelings/labeling/)
* class [VectorMapLayer](../)
* 名前空間 [Aspose.Gis.Rendering](../../vectormaplayer/)
* 組み立て [Aspose.GIS](../../../)


