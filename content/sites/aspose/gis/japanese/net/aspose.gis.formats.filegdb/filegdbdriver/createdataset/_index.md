---
title: FileGdbDriver.CreateDataset
second_title: Aspose.GIS for .NET API リファレンス
description: FileGdbDriver 方法. データセットを作成します
type: docs
weight: 50
url: /ja/net/aspose.gis.formats.filegdb/filegdbdriver/createdataset/
---
## CreateDataset(string, FileGdbOptions) {#createdataset_5}

データセットを作成します。

```csharp
public Dataset CreateDataset(string path, FileGdbOptions options)
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
| [GisException](../../../aspose.gis/gisexception/) | データセットの読み取りエラー。 |
| IOException | I/O エラーが発生しました。 |
| NotSupportedException | ドライバーはデータセットを開くことができません (参照[`CanOpenDatasets`](../../../aspose.gis/filedriver/canopendatasets/)）。 |
| InvalidOperationException | データセットは既に存在します。 |

### 関連項目

* class [Dataset](../../../aspose.gis/dataset/)
* class [FileGdbOptions](../../filegdboptions/)
* class [FileGdbDriver](../)
* 名前空間 [Aspose.Gis.Formats.FileGdb](../../filegdbdriver/)
* 組み立て [Aspose.GIS](../../../)

---

## CreateDataset(AbstractPath, DriverOptions) {#createdataset_1}

データセットを作成します。

```csharp
public override Dataset CreateDataset(AbstractPath path, DriverOptions options)
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
| [GisException](../../../aspose.gis/gisexception/) | データセットの読み取りエラー。 |
| IOException | I/O エラーが発生しました。 |
| NotSupportedException | ドライバーはデータセットを開くことができません (参照[`CanOpenDatasets`](../../../aspose.gis/filedriver/canopendatasets/)）。 |
| InvalidOperationException | データセットは既に存在します。 |

### 関連項目

* class [Dataset](../../../aspose.gis/dataset/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [DriverOptions](../../../aspose.gis/driveroptions/)
* class [FileGdbDriver](../)
* 名前空間 [Aspose.Gis.Formats.FileGdb](../../filegdbdriver/)
* 組み立て [Aspose.GIS](../../../)

---

## CreateDataset(AbstractPath, FileGdbOptions) {#createdataset_2}

データセットを作成します。

```csharp
public Dataset CreateDataset(AbstractPath path, FileGdbOptions options)
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
| [GisException](../../../aspose.gis/gisexception/) | データセットの読み取りエラー。 |
| IOException | I/O エラーが発生しました。 |
| NotSupportedException | ドライバーはデータセットを開くことができません (参照[`CanOpenDatasets`](../../../aspose.gis/filedriver/canopendatasets/)）。 |
| InvalidOperationException | データセットは既に存在します。 |

### 関連項目

* class [Dataset](../../../aspose.gis/dataset/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [FileGdbOptions](../../filegdboptions/)
* class [FileGdbDriver](../)
* 名前空間 [Aspose.Gis.Formats.FileGdb](../../filegdbdriver/)
* 組み立て [Aspose.GIS](../../../)


