---
title: Class FileGdbDriver
second_title: Aspose.GIS for .NET API リファレンス
description: Aspose.Gis.Formats.FileGdb.FileGdbDriver クラス. ESRI ファイル ジオデータベース形式のドライバー
type: docs
weight: 260
url: /ja/net/aspose.gis.formats.filegdb/filegdbdriver/
---
## FileGdbDriver class

ESRI ファイル ジオデータベース形式のドライバー。

```csharp
public sealed class FileGdbDriver : FileDriver
```

## プロパティ

| 名前 | 説明 |
| --- | --- |
| override [CanCreateDatasets](../../aspose.gis.formats.filegdb/filegdbdriver/cancreatedatasets/) { get; } | このドライバーがデータセットを作成できるかどうかを示す値を取得します。 |
| override [CanCreateLayers](../../aspose.gis.formats.filegdb/filegdbdriver/cancreatelayers/) { get; } | このドライバーがベクターレイヤーを作成できるかどうかを示す値を取得します. |
| override [CanOpenDatasets](../../aspose.gis.formats.filegdb/filegdbdriver/canopendatasets/) { get; } | このドライバーがデータセットを開くことができるかどうかを示す値を取得します。 |
| override [CanOpenLayers](../../aspose.gis.formats.filegdb/filegdbdriver/canopenlayers/) { get; } | このドライバーがベクターレイヤーを開くことができるかどうかを示す値を取得します. |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/)(AbstractPath) | データセットを作成します。 |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/)(string) | データセットを作成します。 |
| override [CreateDataset](../../aspose.gis.formats.filegdb/filegdbdriver/createdataset/#createdataset_1)(AbstractPath, DriverOptions) | データセットを作成します。 |
| [CreateDataset](../../aspose.gis.formats.filegdb/filegdbdriver/createdataset/#createdataset_2)(AbstractPath, FileGdbOptions) | データセットを作成します。 |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/)(string, DriverOptions) | データセットを作成します。 |
| [CreateDataset](../../aspose.gis.formats.filegdb/filegdbdriver/createdataset/#createdataset_5)(string, FileGdbOptions) | データセットを作成します。 |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(AbstractPath) | レイヤーを作成し、追加用に開きます。 |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string) | レイヤーを作成し、追加用に開きます。 |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(AbstractPath, DriverOptions) | レイヤーを作成し、追加用に開きます。 |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(AbstractPath, SpatialReferenceSystem) | レイヤーを作成し、追加用に開きます。 |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, DriverOptions) | レイヤーを作成し、追加用に開きます。 |
| [CreateLayer](../../aspose.gis.formats.filegdb/filegdbdriver/createlayer/#createlayer_8)(string, FileGdbOptions) | レイヤーを作成し、それを開いて新しいフィーチャを追加します。 |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, SpatialReferenceSystem) | レイヤーを作成し、追加用に開きます。 |
| override [CreateLayer](../../aspose.gis.formats.filegdb/filegdbdriver/createlayer/#createlayer_2)(AbstractPath, DriverOptions, SpatialReferenceSystem) | レイヤーを作成し、追加用に開きます。 |
| [CreateLayer](../../aspose.gis.formats.filegdb/filegdbdriver/createlayer/#createlayer_3)(AbstractPath, FileGdbOptions, SpatialReferenceSystem) | レイヤーを作成し、追加用に開きます。 |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, DriverOptions, SpatialReferenceSystem) | レイヤーを作成し、追加用に開きます。 |
| [CreateLayer](../../aspose.gis.formats.filegdb/filegdbdriver/createlayer/#createlayer_9)(string, FileGdbOptions, SpatialReferenceSystem) | レイヤーを作成し、追加用に開きます。 |
| virtual [EditLayer](../../aspose.gis/filedriver/editlayer/)(AbstractPath, DriverOptions) | レイヤーを編集用に開きます。 |
| [EditLayer](../../aspose.gis/filedriver/editlayer/)(string, DriverOptions) | レイヤーを編集用に開きます。 |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(AbstractPath) | データセットを開きます。 |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(string) | データセットを開きます。 |
| override [OpenDataset](../../aspose.gis.formats.filegdb/filegdbdriver/opendataset/#opendataset_1)(AbstractPath, DriverOptions) | データセットを開きます。 |
| [OpenDataset](../../aspose.gis.formats.filegdb/filegdbdriver/opendataset/#opendataset_2)(AbstractPath, FileGdbOptions) | データセットを開きます。 |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(string, DriverOptions) | データセットを開きます。 |
| [OpenDataset](../../aspose.gis.formats.filegdb/filegdbdriver/opendataset/#opendataset_5)(string, FileGdbOptions) | データセットを開きます。 |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(AbstractPath) | 読み取り用にレイヤーを開きます。 |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(string) | 読み取り用にレイヤーを開きます。 |
| override [OpenLayer](../../aspose.gis.formats.filegdb/filegdbdriver/openlayer/#openlayer_1)(AbstractPath, DriverOptions) | 読み取り用にレイヤーを開きます。 |
| [OpenLayer](../../aspose.gis.formats.filegdb/filegdbdriver/openlayer/#openlayer_2)(AbstractPath, FileGdbOptions) | 読み取り用にレイヤーを開きます。 |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(string, DriverOptions) | 読み取り用にレイヤーを開きます。 |
| [OpenLayer](../../aspose.gis.formats.filegdb/filegdbdriver/openlayer/#openlayer_5)(string, FileGdbOptions) | 読み取り用にレイヤーを開きます。 |
| override [SupportsSpatialReferenceSystem](../../aspose.gis.formats.filegdb/filegdbdriver/supportsspatialreferencesystem/)(SpatialReferenceSystem) | 指定された空間参照系がドライバーでサポートされているかどうかを判断します。 |

### 関連項目

* class [FileDriver](../../aspose.gis/filedriver/)
* 名前空間 [Aspose.Gis.Formats.FileGdb](../../aspose.gis.formats.filegdb/)
* 組み立て [Aspose.GIS](../../)


