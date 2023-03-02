---
title: Class FileDriver
second_title: Aspose.GIS for .NET API リファレンス
description: Aspose.Gis.FileDriver クラス. 特定のファイル ベースのフォーマット用のドライバー
type: docs
weight: 180
url: /ja/net/aspose.gis/filedriver/
---
## FileDriver class

特定のファイル ベースのフォーマット用のドライバー。

```csharp
public abstract class FileDriver : Driver
```

## プロパティ

| 名前 | 説明 |
| --- | --- |
| abstract [CanCreateDatasets](../../aspose.gis/filedriver/cancreatedatasets/) { get; } | このドライバーがデータセットを作成できるかどうかを示す値を取得します。 |
| abstract [CanCreateLayers](../../aspose.gis/filedriver/cancreatelayers/) { get; } | このドライバーがベクターレイヤーを作成できるかどうかを示す値を取得します. |
| virtual [CanOpenDatasets](../../aspose.gis/filedriver/canopendatasets/) { get; } | このドライバーがデータセットを開くことができるかどうかを示す値を取得します。 |
| abstract [CanOpenLayers](../../aspose.gis/filedriver/canopenlayers/) { get; } | このドライバーがベクターレイヤーを開くことができるかどうかを示す値を取得します. |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/#createdataset)(AbstractPath) | データセットを作成します。 |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/#createdataset_2)(string) | データセットを作成します。 |
| virtual [CreateDataset](../../aspose.gis/filedriver/createdataset/#createdataset_1)(AbstractPath, DriverOptions) | データセットを作成します。 |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/#createdataset_3)(string, DriverOptions) | データセットを作成します。 |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/#createlayer)(AbstractPath) | レイヤーを作成し、追加用に開きます。 |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/#createlayer_4)(string) | レイヤーを作成し、追加用に開きます。 |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/#createlayer_1)(AbstractPath, DriverOptions) | レイヤーを作成し、追加用に開きます。 |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/#createlayer_3)(AbstractPath, SpatialReferenceSystem) | レイヤーを作成し、追加用に開きます。 |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/#createlayer_5)(string, DriverOptions) | レイヤーを作成し、追加用に開きます。 |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/#createlayer_7)(string, SpatialReferenceSystem) | レイヤーを作成し、追加用に開きます。 |
| abstract [CreateLayer](../../aspose.gis/filedriver/createlayer/#createlayer_2)(AbstractPath, DriverOptions, SpatialReferenceSystem) | レイヤーを作成し、追加用に開きます。 |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/#createlayer_6)(string, DriverOptions, SpatialReferenceSystem) | レイヤーを作成し、追加用に開きます。 |
| virtual [EditLayer](../../aspose.gis/filedriver/editlayer/#editlayer)(AbstractPath, DriverOptions) | レイヤーを編集用に開きます。 |
| [EditLayer](../../aspose.gis/filedriver/editlayer/#editlayer_1)(string, DriverOptions) | レイヤーを編集用に開きます。 |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/#opendataset)(AbstractPath) | データセットを開きます。 |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/#opendataset_2)(string) | データセットを開きます。 |
| virtual [OpenDataset](../../aspose.gis/filedriver/opendataset/#opendataset_1)(AbstractPath, DriverOptions) | データセットを開きます。 |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/#opendataset_3)(string, DriverOptions) | データセットを開きます。 |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/#openlayer)(AbstractPath) | 読み取り用にレイヤーを開きます。 |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/#openlayer_2)(string) | 読み取り用にレイヤーを開きます。 |
| abstract [OpenLayer](../../aspose.gis/filedriver/openlayer/#openlayer_1)(AbstractPath, DriverOptions) | 読み取り用にレイヤーを開きます。 |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/#openlayer_3)(string, DriverOptions) | 読み取り用にレイヤーを開きます。 |
| abstract [SupportsSpatialReferenceSystem](../../aspose.gis/filedriver/supportsspatialreferencesystem/)(SpatialReferenceSystem) | 指定された空間参照系がドライバーでサポートされているかどうかを判断します。 |

### 関連項目

* class [Driver](../driver/)
* 名前空間 [Aspose.Gis](../../aspose.gis/)
* 組み立て [Aspose.GIS](../../)


