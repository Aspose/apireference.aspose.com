---
title: VectorLayer.UseSpatialIndex
second_title: Aspose.GIS for .NET API リファレンス
description: VectorLayer 方法. 空間インデックスをロードして次のようなフィルタ メソッドで属性値によるフィルタリングを高速化しますWhereIntersects とNearestTo. インデックスが存在しない場合は最初に作成します使用forceRebuildインデックスの再作成を強制します.
type: docs
weight: 190
url: /ja/net/aspose.gis/vectorlayer/usespatialindex/
---
## UseSpatialIndex(string, bool) {#usespatialindex_1}

空間インデックスをロードして、次のようなフィルタ メソッドで属性値によるフィルタリングを高速化します[`WhereIntersects`](../../featuressequence/whereintersects/) と[`NearestTo`](../nearestto/). インデックスが存在しない場合は、最初に作成します。使用*forceRebuild*インデックスの再作成を強制します.

```csharp
public void UseSpatialIndex(string indexPath, bool forceRebuild = false)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| indexPath | String | インデックス ファイルへのパス。 |
| forceRebuild | Boolean | インデックスが既に存在する場合でも再作成するかどうか。 |

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | パスは`null`. |
| IOException | I/O エラーが発生しました。 |
| InvalidOperationException | このレイヤーの空間インデックスは既に読み込まれています。 |
| [GisException](../../gisexception/) | ファイルは存在しますが、Aspose.GIS によって作成された空間インデックス ファイルではありません。 |

### 関連項目

* class [VectorLayer](../)
* 名前空間 [Aspose.Gis](../../vectorlayer/)
* 組み立て [Aspose.GIS](../../../)

---

## UseSpatialIndex(AbstractPath, bool) {#usespatialindex}

空間インデックスをロードして、次のようなフィルタ メソッドで属性値によるフィルタリングを高速化します[`WhereIntersects`](../../featuressequence/whereintersects/) と[`NearestTo`](../nearestto/). インデックスが存在しない場合は、最初に作成します。使用*forceRebuild*インデックスの再作成を強制します.

```csharp
public virtual void UseSpatialIndex(AbstractPath indexPath, bool forceRebuild = false)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| indexPath | AbstractPath | インデックス ファイルへのパス。 |
| forceRebuild | Boolean | インデックスが既に存在する場合でも再作成するかどうか。 |

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | パスは`null`. |
| IOException | I/O エラーが発生しました。 |
| InvalidOperationException | このレイヤーの空間インデックスは既に読み込まれています。 |
| [GisException](../../gisexception/) | ファイルは存在しますが、Aspose.GIS によって作成された空間インデックス ファイルではありません。 |

### 関連項目

* class [AbstractPath](../../abstractpath/)
* class [VectorLayer](../)
* 名前空間 [Aspose.Gis](../../vectorlayer/)
* 組み立て [Aspose.GIS](../../../)


