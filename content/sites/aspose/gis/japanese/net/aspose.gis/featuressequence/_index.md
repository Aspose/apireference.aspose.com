---
title: Class FeaturesSequence
second_title: Aspose.GIS for .NET API リファレンス
description: Aspose.Gis.FeaturesSequence クラス. FeaturesSequenceベクトル機能のセットを表します.
type: docs
weight: 170
url: /ja/net/aspose.gis/featuressequence/
---
## FeaturesSequence class

`FeaturesSequence`ベクトル機能のセットを表します.

```csharp
public abstract class FeaturesSequence : IEnumerable<Feature>
```

## プロパティ

| 名前 | 説明 |
| --- | --- |
| abstract [Attributes](../../aspose.gis/featuressequence/attributes/) { get; } | この内のフィーチャのカスタム属性のコレクションを取得します[`VectorLayer`](../vectorlayer/). |
| abstract [SpatialReferenceSystem](../../aspose.gis/featuressequence/spatialreferencesystem/) { get; } | このフィーチャ シーケンスの空間参照系を取得します。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| abstract [GetEnumerator](../../aspose.gis/featuressequence/getenumerator/)() | コレクションを反復処理する列挙子を返します。 |
| virtual [GetExtent](../../aspose.gis/featuressequence/getextent/)() | このレイヤーの空間範囲を取得します。 |
| [SaveTo](../../aspose.gis/featuressequence/saveto/#saveto)(AbstractPath, FileDriver) | フィーチャ シーケンスをレイヤーに保存します。 |
| [SaveTo](../../aspose.gis/featuressequence/saveto/#saveto_2)(string, FileDriver) | フィーチャ シーケンスをレイヤーに保存します。 |
| [SaveTo](../../aspose.gis/featuressequence/saveto/#saveto_1)(AbstractPath, FileDriver, SavingOptions) | フィーチャ シーケンスをレイヤーに保存します。 |
| [SaveTo](../../aspose.gis/featuressequence/saveto/#saveto_3)(string, FileDriver, SavingOptions) | フィーチャ シーケンスをレイヤーに保存します。 |
| [SplitTo](../../aspose.gis/featuressequence/splitto/)() | フィーチャをジオメトリ タイプ別に分割します。 |
| virtual [WhereEqual&lt;T&gt;](../../aspose.gis/featuressequence/whereequal/)(string, T) | 指定された値と等しい属性値を持つフィーチャを選択します。 |
| virtual [WhereGreater&lt;T&gt;](../../aspose.gis/featuressequence/wheregreater/)(string, T) | 指定された値より大きい属性値を持つフィーチャを選択します。 |
| virtual [WhereGreaterOrEqual&lt;T&gt;](../../aspose.gis/featuressequence/wheregreaterorequal/)(string, T) | 指定された値以上の属性値を持つフィーチャを選択します。 |
| virtual [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/#whereintersects)(Extent) | 範囲に基づいてフィーチャをフィルタリングします。 |
| [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/#whereintersects_1)(FeaturesSequence) | 他のフィーチャ シーケンス内のすべてのジオメトリの結合に基づいてフィーチャをフィルタリングします。 |
| virtual [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/#whereintersects_2)(IGeometry) | 指定されたジオメトリに基づいてフィーチャをフィルタリングします。 |
| virtual [WhereNotEqual&lt;T&gt;](../../aspose.gis/featuressequence/wherenotequal/)(string, T) | 指定された値と等しくない属性値を持つフィーチャを選択します。 |
| virtual [WhereNotNull](../../aspose.gis/featuressequence/wherenotnull/)(string) | null 以外の属性を持つフィーチャを選択します。 |
| virtual [WhereNull](../../aspose.gis/featuressequence/wherenull/)(string) | null に等しい属性を持つフィーチャを選択します。 |
| virtual [WhereSet](../../aspose.gis/featuressequence/whereset/)(string) | 属性が設定された地物を選択します。 |
| virtual [WhereSmaller&lt;T&gt;](../../aspose.gis/featuressequence/wheresmaller/)(string, T) | 指定された値より小さい属性値を持つフィーチャを選択します。 |
| virtual [WhereSmallerOrEqual&lt;T&gt;](../../aspose.gis/featuressequence/wheresmallerorequal/)(string, T) | 指定された値以下の属性値を持つフィーチャを選択します。 |
| virtual [WhereUnset](../../aspose.gis/featuressequence/whereunset/)(string) | 指定した属性が設定されていない地物を選択します。 |

### 関連項目

* class [Feature](../feature/)
* 名前空間 [Aspose.Gis](../../aspose.gis/)
* 組み立て [Aspose.GIS](../../)


