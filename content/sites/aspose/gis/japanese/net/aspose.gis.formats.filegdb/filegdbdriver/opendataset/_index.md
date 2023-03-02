---
title: FileGdbDriver.OpenDataset
second_title: Aspose.GIS for .NET API リファレンス
description: FileGdbDriver 方法. データセットを開きます
type: docs
weight: 70
url: /ja/net/aspose.gis.formats.filegdb/filegdbdriver/opendataset/
---
## OpenDataset(string, FileGdbOptions) {#opendataset_5}

データセットを開きます。

```csharp
public Dataset OpenDataset(string path, FileGdbOptions options)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| path | String | データセットへのパス。 |
| options | FileGdbOptions | ドライバー固有のオプション。 |

### 戻り値

のインスタンス[`Dataset`](../../../aspose.gis/dataset/).

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentException | オプション オブジェクトは、このドライバーに対して正しくない型を持っています。 |
| ArgumentNullException | パスは`null`. |
| [GisException](../../../aspose.gis/gisexception/) | データセットからのレイヤーの読み取り中にエラーが発生しました。 |
| IOException | I/O エラーが発生しました。 |
| NotSupportedException | ドライバーはデータセットを開くことができません (参照[`CanOpenDatasets`](../canopendatasets/)）。 |

### 関連項目

* class [Dataset](../../../aspose.gis/dataset/)
* class [FileGdbOptions](../../filegdboptions/)
* class [FileGdbDriver](../)
* 名前空間 [Aspose.Gis.Formats.FileGdb](../../filegdbdriver/)
* 組み立て [Aspose.GIS](../../../)

---

## OpenDataset(AbstractPath, DriverOptions) {#opendataset_1}

データセットを開きます。

```csharp
public override Dataset OpenDataset(AbstractPath path, DriverOptions options)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| path | AbstractPath | データセットへのパス。 |
| options | DriverOptions | ドライバー固有のオプション。 |

### 戻り値

のインスタンス[`Dataset`](../../../aspose.gis/dataset/).

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentException | オプション オブジェクトは、このドライバーに対して正しくない型を持っています。 |
| ArgumentNullException | パスは`null`. |
| [GisException](../../../aspose.gis/gisexception/) | データセットからのレイヤーの読み取り中にエラーが発生しました。 |
| IOException | I/O エラーが発生しました。 |
| NotSupportedException | ドライバーはデータセットを開くことができません (参照[`CanOpenDatasets`](../canopendatasets/)）。 |

### 関連項目

* class [Dataset](../../../aspose.gis/dataset/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [DriverOptions](../../../aspose.gis/driveroptions/)
* class [FileGdbDriver](../)
* 名前空間 [Aspose.Gis.Formats.FileGdb](../../filegdbdriver/)
* 組み立て [Aspose.GIS](../../../)

---

## OpenDataset(AbstractPath, FileGdbOptions) {#opendataset_2}

データセットを開きます。

```csharp
public Dataset OpenDataset(AbstractPath path, FileGdbOptions options)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| path | AbstractPath | データセットへのパス。 |
| options | FileGdbOptions | ドライバー固有のオプション。 |

### 戻り値

のインスタンス[`Dataset`](../../../aspose.gis/dataset/).

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentException | オプション オブジェクトは、このドライバーに対して正しくない型を持っています。 |
| ArgumentNullException | パスは`null`. |
| [GisException](../../../aspose.gis/gisexception/) | データセットからのレイヤーの読み取り中にエラーが発生しました。 |
| IOException | I/O エラーが発生しました。 |
| NotSupportedException | ドライバーはデータセットを開くことができません (参照[`CanOpenDatasets`](../canopendatasets/)）。 |

### 関連項目

* class [Dataset](../../../aspose.gis/dataset/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [FileGdbOptions](../../filegdboptions/)
* class [FileGdbDriver](../)
* 名前空間 [Aspose.Gis.Formats.FileGdb](../../filegdbdriver/)
* 組み立て [Aspose.GIS](../../../)


