---
title: VectorLayer.UseAttributesIndex
second_title: Aspose.GIS for .NET API リファレンス
description: VectorLayer 方法. 属性インデックスをロードして次のようなフィルタ メソッドで属性値によるフィルタリングを高速化しますWhereGreater. インデックスが存在しない場合は最初に作成します使用forceRebuildインデックスの再作成を強制します.
type: docs
weight: 180
url: /ja/net/aspose.gis/vectorlayer/useattributesindex/
---
## UseAttributesIndex(string, string, bool) {#useattributesindex_1}

属性インデックスをロードして、次のようなフィルタ メソッドで属性値によるフィルタリングを高速化します。[`WhereGreater`](../../featuressequence/wheregreater/). インデックスが存在しない場合は、最初に作成します。使用*forceRebuild*インデックスの再作成を強制します.

```csharp
public void UseAttributesIndex(string indexPath, string attributeName, bool forceRebuild = false)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| indexPath | String | インデックス ファイルへのパス。 |
| attributeName | String | インデックスを作成する属性の名前。 |
| forceRebuild | Boolean | インデックスが既に存在する場合でも再作成するかどうか。 |

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | 引数は`null`. |
| ArgumentException | そのような名前の属性はレイヤーに存在しません。 |
| IOException | I/O エラーが発生しました。 |
| InvalidOperationException | このレイヤーにすでにロードされている、指定されたアトリビュートのインデックス。 |
| [GisException](../../gisexception/) | ファイルが存在しますが、Aspose.GIS によって作成された属性インデックス ファイルではありません。 |

### 関連項目

* class [VectorLayer](../)
* 名前空間 [Aspose.Gis](../../vectorlayer/)
* 組み立て [Aspose.GIS](../../../)

---

## UseAttributesIndex(AbstractPath, string, bool) {#useattributesindex}

属性インデックスをロードして、次のようなフィルタ メソッドで属性値によるフィルタリングを高速化します。[`WhereGreater`](../../featuressequence/wheregreater/). インデックスが存在しない場合は、最初に作成します。使用*forceRebuild*インデックスの再作成を強制します.

```csharp
public virtual void UseAttributesIndex(AbstractPath indexPath, string attributeName, 
    bool forceRebuild = false)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| indexPath | AbstractPath | インデックス ファイルへのパス。 |
| attributeName | String | インデックスを作成する属性の名前。 |
| forceRebuild | Boolean | インデックスが既に存在する場合でも再作成するかどうか。 |

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | 引数は`null`. |
| ArgumentException | そのような名前の属性はレイヤーに存在しません。 |
| IOException | I/O エラーが発生しました。 |
| InvalidOperationException | このレイヤーにすでにロードされている、指定されたアトリビュートのインデックス。 |
| [GisException](../../gisexception/) | ファイルが存在しますが、Aspose.GIS によって作成された属性インデックス ファイルではありません。 |

### 関連項目

* class [AbstractPath](../../abstractpath/)
* class [VectorLayer](../)
* 名前空間 [Aspose.Gis](../../vectorlayer/)
* 組み立て [Aspose.GIS](../../../)


