---
title: Class VectorLayer
second_title: Aspose.GIS for .NET API リファレンス
description: Aspose.Gis.VectorLayer クラス. ベクター レイヤーを表します ベクター レイヤーはファイルに保存された地理的特徴のコレクションです
type: docs
weight: 2320
url: /ja/net/aspose.gis/vectorlayer/
---
## VectorLayer class

ベクター レイヤーを表します。 ベクター レイヤーは、ファイルに保存された地理的特徴のコレクションです。

```csharp
public abstract class VectorLayer : FeaturesSequence, IDisposable
```

## プロパティ

| 名前 | 説明 |
| --- | --- |
| override [Attributes](../../aspose.gis/vectorlayer/attributes/) { get; } | この内のフィーチャのカスタム属性のコレクションを取得します`VectorLayer`. |
| virtual [Count](../../aspose.gis/vectorlayer/count/) { get; } | このレイヤー内のフィーチャの数を取得します. |
| abstract [Driver](../../aspose.gis/vectorlayer/driver/) { get; } | を取得します[`Driver`](./driver/)このレイヤーをインスタンス化した. |
| abstract [GeometryType](../../aspose.gis/vectorlayer/geometrytype/) { get; } | レイヤーのジオメトリのタイプを取得します. |
| virtual [Item](../../aspose.gis/vectorlayer/item/) { get; } | を取得します[`Feature`](../feature/)指定されたインデックスで. |
| abstract [SpatialReferenceSystem](../../aspose.gis/featuressequence/spatialreferencesystem/) { get; } | このフィーチャ シーケンスの空間参照系を取得します。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| static [Create](../../aspose.gis/vectorlayer/create/#create)(AbstractPath, FileDriver) | レイヤーを作成し、それを開いて新しいフィーチャを追加します。 |
| static [Create](../../aspose.gis/vectorlayer/create/#create_4)(string, FileDriver) | レイヤーを作成し、それを開いて新しいフィーチャを追加します。 |
| static [Create](../../aspose.gis/vectorlayer/create/#create_1)(AbstractPath, FileDriver, DriverOptions) | レイヤーを作成し、それを開いて新しいフィーチャを追加します。 |
| static [Create](../../aspose.gis/vectorlayer/create/#create_3)(AbstractPath, FileDriver, SpatialReferenceSystem) | レイヤーを作成し、追加用に開きます。 |
| static [Create](../../aspose.gis/vectorlayer/create/#create_5)(string, FileDriver, DriverOptions) | レイヤーを作成し、それを開いて新しいフィーチャを追加します。 |
| static [Create](../../aspose.gis/vectorlayer/create/#create_7)(string, FileDriver, SpatialReferenceSystem) | レイヤーを作成し、追加用に開きます。 |
| static [Create](../../aspose.gis/vectorlayer/create/#create_2)(AbstractPath, FileDriver, DriverOptions, SpatialReferenceSystem) | レイヤーを作成し、追加用に開きます。 |
| static [Create](../../aspose.gis/vectorlayer/create/#create_6)(string, FileDriver, DriverOptions, SpatialReferenceSystem) | レイヤーを作成し、追加用に開きます。 |
| static [Open](../../aspose.gis/vectorlayer/open/#open)(AbstractPath, FileDriver) | 読み取り用にレイヤーを開きます。 |
| static [Open](../../aspose.gis/vectorlayer/open/#open_2)(string, FileDriver) | 読み取り用にレイヤーを開きます。 |
| static [Open](../../aspose.gis/vectorlayer/open/#open_1)(AbstractPath, FileDriver, DriverOptions) | 読み取り用にレイヤーを開きます。 |
| static [Open](../../aspose.gis/vectorlayer/open/#open_3)(string, FileDriver, DriverOptions) | 読み取り用にレイヤーを開きます。 |
| [Add](../../aspose.gis/vectorlayer/add/#add)(Feature) | でサポートされている場合、レイヤーに新しいフィーチャを追加します。`VectorLayer`s[`Driver`](./driver/) . |
| virtual [Add](../../aspose.gis/vectorlayer/add/#add_1)(Feature, IFeatureStyle) | でサポートされている場合、指定されたスタイルの新しいフィーチャをレイヤーに追加します。`VectorLayer`s[`Driver`](./driver/) . |
| [AsInMemory](../../aspose.gis/vectorlayer/asinmemory/)() | InMemory 形式でレイヤーのクローンを作成します。 |
| [ConstructFeature](../../aspose.gis/vectorlayer/constructfeature/)() | このレイヤーの属性のコレクションと一致する属性を持つ新しいフィーチャを作成します (ただし、レイヤーには追加しません)。 フィーチャのデータの設定が完了したら、使用します。[`Add`](./add/)フィーチャをレイヤーに追加します. |
| [CopyAttributes](../../aspose.gis/vectorlayer/copyattributes/#copyattributes)(FeaturesSequence) | 他の属性をコピーします`VectorLayer`これに. |
| [CopyAttributes](../../aspose.gis/vectorlayer/copyattributes/#copyattributes_1)(FeaturesSequence, IAttributesConverter) | 他の属性をコピーします`VectorLayer`これに. |
| [Dispose](../../aspose.gis/vectorlayer/dispose/)() | によって使用されるリソースを解放します。`VectorLayer` . |
| override [Equals](../../aspose.gis/vectorlayer/equals/)(object) | 指定されたオブジェクトが現在のオブジェクトと等しいかどうかを判断します. |
| abstract [GetEnumerator](../../aspose.gis/featuressequence/getenumerator/)() | コレクションを反復処理する列挙子を返します。 |
| virtual [GetExtent](../../aspose.gis/featuressequence/getextent/)() | このレイヤーの空間範囲を取得します。 |
| [Join](../../aspose.gis/vectorlayer/join/)(VectorLayer, JoinOptions) | レイヤーを現在のレイヤーに結合します。 |
| [NearestTo](../../aspose.gis/vectorlayer/nearestto/#nearestto)(IPoint) | 指定されたポイントに最も近いフィーチャを取得します。 |
| [NearestTo](../../aspose.gis/vectorlayer/nearestto/#nearestto_1)(double, double) | 指定された座標に最も近いフィーチャを取得します。 |
| virtual [RemoveAt](../../aspose.gis/vectorlayer/removeat/)(int) | を削除します[`Feature`](../feature/)指定されたインデックスで. |
| virtual [ReplaceAt](../../aspose.gis/vectorlayer/replaceat/)(int, Feature) | を交換してください[`Feature`](../feature/)指定されたインデックスで. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/)(AbstractPath, FileDriver) | フィーチャ シーケンスをレイヤーに保存します。 |
| [SaveTo](../../aspose.gis/featuressequence/saveto/)(string, FileDriver) | フィーチャ シーケンスをレイヤーに保存します。 |
| [SaveTo](../../aspose.gis/featuressequence/saveto/)(AbstractPath, FileDriver, SavingOptions) | フィーチャ シーケンスをレイヤーに保存します。 |
| [SaveTo](../../aspose.gis/featuressequence/saveto/)(string, FileDriver, SavingOptions) | フィーチャ シーケンスをレイヤーに保存します。 |
| [SplitTo](../../aspose.gis/featuressequence/splitto/)() | フィーチャをジオメトリ タイプ別に分割します。 |
| virtual [UseAttributesIndex](../../aspose.gis/vectorlayer/useattributesindex/#useattributesindex)(AbstractPath, string, bool) | 属性インデックスをロードして、次のようなフィルタ メソッドで属性値によるフィルタリングを高速化します。[`WhereGreater`](../featuressequence/wheregreater/). インデックスが存在しない場合は、最初に作成します。使用*forceRebuild*インデックスの再作成を強制します. |
| [UseAttributesIndex](../../aspose.gis/vectorlayer/useattributesindex/#useattributesindex_1)(string, string, bool) | 属性インデックスをロードして、次のようなフィルタ メソッドで属性値によるフィルタリングを高速化します。[`WhereGreater`](../featuressequence/wheregreater/). インデックスが存在しない場合は、最初に作成します。使用*forceRebuild*インデックスの再作成を強制します. |
| virtual [UseSpatialIndex](../../aspose.gis/vectorlayer/usespatialindex/#usespatialindex)(AbstractPath, bool) | 空間インデックスをロードして、次のようなフィルタ メソッドで属性値によるフィルタリングを高速化します[`WhereIntersects`](../featuressequence/whereintersects/) と[`NearestTo`](./nearestto/). インデックスが存在しない場合は、最初に作成します。使用*forceRebuild*インデックスの再作成を強制します. |
| [UseSpatialIndex](../../aspose.gis/vectorlayer/usespatialindex/#usespatialindex_1)(string, bool) | 空間インデックスをロードして、次のようなフィルタ メソッドで属性値によるフィルタリングを高速化します[`WhereIntersects`](../featuressequence/whereintersects/) と[`NearestTo`](./nearestto/). インデックスが存在しない場合は、最初に作成します。使用*forceRebuild*インデックスの再作成を強制します. |
| virtual [WhereEqual&lt;T&gt;](../../aspose.gis/featuressequence/whereequal/)(string, T) | 指定された値と等しい属性値を持つフィーチャを選択します。 |
| virtual [WhereGreater&lt;T&gt;](../../aspose.gis/featuressequence/wheregreater/)(string, T) | 指定された値より大きい属性値を持つフィーチャを選択します。 |
| virtual [WhereGreaterOrEqual&lt;T&gt;](../../aspose.gis/featuressequence/wheregreaterorequal/)(string, T) | 指定された値以上の属性値を持つフィーチャを選択します。 |
| virtual [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/)(Extent) | 範囲に基づいてフィーチャをフィルタリングします。 |
| [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/)(FeaturesSequence) | 他のフィーチャ シーケンス内のすべてのジオメトリの結合に基づいてフィーチャをフィルタリングします。 |
| virtual [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/)(IGeometry) | 指定されたジオメトリに基づいてフィーチャをフィルタリングします。 |
| virtual [WhereNotEqual&lt;T&gt;](../../aspose.gis/featuressequence/wherenotequal/)(string, T) | 指定された値と等しくない属性値を持つフィーチャを選択します。 |
| virtual [WhereNotNull](../../aspose.gis/featuressequence/wherenotnull/)(string) | null 以外の属性を持つフィーチャを選択します。 |
| virtual [WhereNull](../../aspose.gis/featuressequence/wherenull/)(string) | null に等しい属性を持つフィーチャを選択します。 |
| virtual [WhereSet](../../aspose.gis/featuressequence/whereset/)(string) | 属性が設定された地物を選択します。 |
| virtual [WhereSmaller&lt;T&gt;](../../aspose.gis/featuressequence/wheresmaller/)(string, T) | 指定された値より小さい属性値を持つフィーチャを選択します。 |
| virtual [WhereSmallerOrEqual&lt;T&gt;](../../aspose.gis/featuressequence/wheresmallerorequal/)(string, T) | 指定された値以下の属性値を持つフィーチャを選択します。 |
| virtual [WhereUnset](../../aspose.gis/featuressequence/whereunset/)(string) | 指定した属性が設定されていない地物を選択します。 |
| static [Convert](../../aspose.gis/vectorlayer/convert/#convert)(AbstractPath, FileDriver, AbstractPath, FileDriver) | レイヤーを別の形式に変換します。 |
| static [Convert](../../aspose.gis/vectorlayer/convert/#convert_2)(string, FileDriver, string, FileDriver) | レイヤーを別の形式に変換します。 |
| static [Convert](../../aspose.gis/vectorlayer/convert/#convert_1)(AbstractPath, FileDriver, AbstractPath, FileDriver, ConversionOptions) | レイヤーを別の形式に変換します。 |
| static [Convert](../../aspose.gis/vectorlayer/convert/#convert_3)(string, FileDriver, string, FileDriver, ConversionOptions) | レイヤーを別の形式に変換します。 |

### 関連項目

* class [FeaturesSequence](../featuressequence/)
* 名前空間 [Aspose.Gis](../../aspose.gis/)
* 組み立て [Aspose.GIS](../../)


