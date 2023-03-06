---
title: Class MapInfoTabDriver
second_title: Aspose.GIS for .NET API リファレンス
description: Aspose.Gis.Formats.MapInfoTab.MapInfoTabDriver クラス. MapInfo タブ形式のドライバー
type: docs
weight: 600
url: /ja/net/aspose.gis.formats.mapinfotab/mapinfotabdriver/
---
## MapInfoTabDriver class

MapInfo タブ形式のドライバー。

```csharp
public sealed class MapInfoTabDriver : FileDriver
```

## プロパティ

| 名前 | 説明 |
| --- | --- |
| override [CanCreateDatasets](../../aspose.gis.formats.mapinfotab/mapinfotabdriver/cancreatedatasets/) { get; } | このドライバーがデータセットを作成できるかどうかを示す値を取得します。 |
| override [CanCreateLayers](../../aspose.gis.formats.mapinfotab/mapinfotabdriver/cancreatelayers/) { get; } | このドライバーがベクターレイヤーを作成できるかどうかを示す値を取得します. |
| virtual [CanOpenDatasets](../../aspose.gis/filedriver/canopendatasets/) { get; } | このドライバーがデータセットを開くことができるかどうかを示す値を取得します。 |
| override [CanOpenLayers](../../aspose.gis.formats.mapinfotab/mapinfotabdriver/canopenlayers/) { get; } | このドライバーがベクターレイヤーを開くことができるかどうかを示す値を取得します. |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/)(AbstractPath) | データセットを作成します。 |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/)(string) | データセットを作成します。 |
| virtual [CreateDataset](../../aspose.gis/filedriver/createdataset/)(AbstractPath, DriverOptions) | データセットを作成します。 |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/)(string, DriverOptions) | データセットを作成します。 |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(AbstractPath) | レイヤーを作成し、追加用に開きます。 |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string) | レイヤーを作成し、追加用に開きます。 |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(AbstractPath, DriverOptions) | レイヤーを作成し、追加用に開きます。 |
| [CreateLayer](../../aspose.gis.formats.mapinfotab/mapinfotabdriver/createlayer/#createlayer_3)(AbstractPath, MapInfoTabOptions) | レイヤーを作成し、それを開いて新しいフィーチャを追加します。 |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(AbstractPath, SpatialReferenceSystem) | レイヤーを作成し、追加用に開きます。 |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, DriverOptions) | レイヤーを作成し、追加用に開きます。 |
| [CreateLayer](../../aspose.gis.formats.mapinfotab/mapinfotabdriver/createlayer/#createlayer_9)(string, MapInfoTabOptions) | レイヤーを作成し、それを開いて新しいフィーチャを追加します。 |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, SpatialReferenceSystem) | レイヤーを作成し、追加用に開きます。 |
| override [CreateLayer](../../aspose.gis.formats.mapinfotab/mapinfotabdriver/createlayer/#createlayer_2)(AbstractPath, DriverOptions, SpatialReferenceSystem) | レイヤーを作成し、それを開いて新しいフィーチャを追加します。 |
| [CreateLayer](../../aspose.gis.formats.mapinfotab/mapinfotabdriver/createlayer/#createlayer_4)(AbstractPath, MapInfoTabOptions, SpatialReferenceSystem) | レイヤーを作成し、それを開いて新しいフィーチャを追加します。 |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, DriverOptions, SpatialReferenceSystem) | レイヤーを作成し、追加用に開きます。 |
| virtual [EditLayer](../../aspose.gis/filedriver/editlayer/)(AbstractPath, DriverOptions) | レイヤーを編集用に開きます。 |
| [EditLayer](../../aspose.gis/filedriver/editlayer/)(string, DriverOptions) | レイヤーを編集用に開きます。 |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(AbstractPath) | データセットを開きます。 |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(string) | データセットを開きます。 |
| virtual [OpenDataset](../../aspose.gis/filedriver/opendataset/)(AbstractPath, DriverOptions) | データセットを開きます。 |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(string, DriverOptions) | データセットを開きます。 |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(AbstractPath) | 読み取り用にレイヤーを開きます。 |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(string) | 読み取り用にレイヤーを開きます。 |
| override [OpenLayer](../../aspose.gis.formats.mapinfotab/mapinfotabdriver/openlayer/#openlayer_1)(AbstractPath, DriverOptions) | 読み取り用にレイヤーを開きます。 |
| [OpenLayer](../../aspose.gis.formats.mapinfotab/mapinfotabdriver/openlayer/#openlayer_2)(AbstractPath, MapInfoTabOptions) | 読み取り用にレイヤーを開きます。 |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(string, DriverOptions) | 読み取り用にレイヤーを開きます。 |
| [OpenLayer](../../aspose.gis.formats.mapinfotab/mapinfotabdriver/openlayer/#openlayer_5)(string, MapInfoTabOptions) | 読み取り用にレイヤーを開きます。 |
| override [SupportsSpatialReferenceSystem](../../aspose.gis.formats.mapinfotab/mapinfotabdriver/supportsspatialreferencesystem/)(SpatialReferenceSystem) | 指定された空間参照系がドライバーでサポートされているかどうかを判断します。 |

### 関連項目

* class [FileDriver](../../aspose.gis/filedriver/)
* 名前空間 [Aspose.Gis.Formats.MapInfoTab](../../aspose.gis.formats.mapinfotab/)
* 組み立て [Aspose.GIS](../../)


