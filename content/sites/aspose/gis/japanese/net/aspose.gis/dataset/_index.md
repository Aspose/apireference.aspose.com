---
title: Class Dataset
second_title: Aspose.GIS for .NET API リファレンス
description: Aspose.Gis.Dataset クラス. データセットはVectorLayerインスタンス.
type: docs
weight: 80
url: /ja/net/aspose.gis/dataset/
---
## Dataset class

データセットは、[`VectorLayer`](../vectorlayer/)インスタンス.

```csharp
public abstract class Dataset : IDisposable
```

## プロパティ

| 名前 | 説明 |
| --- | --- |
| virtual [CanCreateLayers](../../aspose.gis/dataset/cancreatelayers/) { get; } | このデータセットがベクター レイヤーを作成できるかどうかを示す値を取得します。 |
| virtual [CanRemoveLayers](../../aspose.gis/dataset/canremovelayers/) { get; } | このデータセットがベクター レイヤーを削除できるかどうかを示す値を取得します。 |
| abstract [Driver](../../aspose.gis/dataset/driver/) { get; } | を取得します[`Driver`](./driver/)このデータセットをインスタンス化したもの. |
| abstract [LayersCount](../../aspose.gis/dataset/layerscount/) { get; } | このデータセットのレイヤー数を取得します。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| static [Create](../../aspose.gis/dataset/create/#create)(AbstractPath, FileDriver) | データセットを作成します。 |
| static [Create](../../aspose.gis/dataset/create/#create_2)(string, FileDriver) | データセットを作成します。 |
| static [Create](../../aspose.gis/dataset/create/#create_1)(AbstractPath, FileDriver, DriverOptions) | データセットを作成します。 |
| static [Create](../../aspose.gis/dataset/create/#create_3)(string, FileDriver, DriverOptions) | データセットを作成します。 |
| static [Open](../../aspose.gis/dataset/open/#open)(AbstractPath, FileDriver) | データセットを開きます。 |
| static [Open](../../aspose.gis/dataset/open/#open_2)(IDbConnection, DatabaseDriver) | データセットを開きます。 |
| static [Open](../../aspose.gis/dataset/open/#open_3)(string, FileDriver) | データセットを開きます。 |
| static [Open](../../aspose.gis/dataset/open/#open_1)(AbstractPath, FileDriver, DriverOptions) | データセットを開きます。 |
| static [Open](../../aspose.gis/dataset/open/#open_4)(string, FileDriver, DriverOptions) | データセットを開きます。 |
| virtual [CreateLayer](../../aspose.gis/dataset/createlayer/#createlayer)() | 新しいベクター レイヤーを作成し、追加用に開きます。 |
| virtual [CreateLayer](../../aspose.gis/dataset/createlayer/#createlayer_2)(SpatialReferenceSystem) | 新しいベクター レイヤーを作成し、追加用に開きます。 |
| virtual [CreateLayer](../../aspose.gis/dataset/createlayer/#createlayer_1)(DriverOptions, SpatialReferenceSystem) | 新しいベクター レイヤーを作成し、追加用に開きます。 |
| virtual [CreateLayer](../../aspose.gis/dataset/createlayer/#createlayer_4)(string, SpatialReferenceSystem) | 指定した名前で新しいベクター レイヤーを作成し、追加用に開きます。 |
| virtual [CreateLayer](../../aspose.gis/dataset/createlayer/#createlayer_3)(string, DriverOptions, SpatialReferenceSystem) | 指定した名前で新しいベクター レイヤーを作成し、追加用に開きます。 |
| [Dispose](../../aspose.gis/dataset/dispose/)() | によって使用されるリソースを解放します。`Dataset` . |
| abstract [EditLayer](../../aspose.gis/dataset/editlayer/)(string, DriverOptions, SpatialReferenceSystem) | 指定した名前のレイヤーを編集用に開きます。 |
| abstract [GetLayerName](../../aspose.gis/dataset/getlayername/)(int) | 指定したインデックスにあるレイヤーの名前を取得します。 |
| abstract [OpenLayer](../../aspose.gis/dataset/openlayer/)(string, DriverOptions) | 指定した名前のレイヤーを読み取り用に開きます。 |
| abstract [OpenLayerAt](../../aspose.gis/dataset/openlayerat/)(int, DriverOptions) | 読み取り用に指定されたインデックスでレイヤーを開きます。 |
| virtual [RemoveLayer](../../aspose.gis/dataset/removelayer/)(string) | 指定した名前のベクター レイヤーを削除します。 |
| virtual [RemoveLayerAt](../../aspose.gis/dataset/removelayerat/)(int) | 指定されたインデックスのベクター レイヤーを削除します。 |

### 関連項目

* 名前空間 [Aspose.Gis](../../aspose.gis/)
* 組み立て [Aspose.GIS](../../)


