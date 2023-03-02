---
title: FileDriver.OpenDataset
second_title: Aspose.GIS for .NET API リファレンス
description: FileDriver 方法. データセットを開きます
type: docs
weight: 80
url: /ja/net/aspose.gis/filedriver/opendataset/
---
## OpenDataset(string) {#opendataset_2}

データセットを開きます。

```csharp
public Dataset OpenDataset(string path)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| path | String | データセットへのパス。 |

### 戻り値

のインスタンス[`Dataset`](../../dataset/).

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | パスは`null`. |
| [GisException](../../gisexception/) | データセットの読み取りエラー。 |
| IOException | I/O エラーが発生しました。 |
| NotSupportedException | ドライバーはデータセットを開くことができません (参照[`CanOpenDatasets`](../canopendatasets/)）。 |

### 関連項目

* class [Dataset](../../dataset/)
* class [FileDriver](../)
* 名前空間 [Aspose.Gis](../../filedriver/)
* 組み立て [Aspose.GIS](../../../)

---

## OpenDataset(AbstractPath) {#opendataset}

データセットを開きます。

```csharp
public Dataset OpenDataset(AbstractPath path)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| path | AbstractPath | データセットへのパス。 |

### 戻り値

のインスタンス[`Dataset`](../../dataset/).

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | パスは`null`. |
| [GisException](../../gisexception/) | データセットの読み取りエラー。 |
| IOException | I/O エラーが発生しました。 |
| NotSupportedException | ドライバーはデータセットを開くことができません (参照[`CanOpenDatasets`](../canopendatasets/)）。 |

### 関連項目

* class [Dataset](../../dataset/)
* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../)
* 名前空間 [Aspose.Gis](../../filedriver/)
* 組み立て [Aspose.GIS](../../../)

---

## OpenDataset(string, DriverOptions) {#opendataset_3}

データセットを開きます。

```csharp
public Dataset OpenDataset(string path, DriverOptions options)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| path | String | データセットへのパス。 |
| options | DriverOptions | ドライバー固有のオプション。 |

### 戻り値

のインスタンス[`Dataset`](../../dataset/).

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentException | オプション オブジェクトは、このドライバーに対して正しくない型を持っています。 |
| ArgumentNullException | パスは`null`. |
| [GisException](../../gisexception/) | データセットの読み取りエラー。 |
| IOException | I/O エラーが発生しました。 |
| NotSupportedException | ドライバーはデータセットを開くことができません (参照[`CanOpenDatasets`](../canopendatasets/)）。 |

### 関連項目

* class [Dataset](../../dataset/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* 名前空間 [Aspose.Gis](../../filedriver/)
* 組み立て [Aspose.GIS](../../../)

---

## OpenDataset(AbstractPath, DriverOptions) {#opendataset_1}

データセットを開きます。

```csharp
public virtual Dataset OpenDataset(AbstractPath path, DriverOptions options)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| path | AbstractPath | データセットへのパス。 |
| options | DriverOptions | ドライバー固有のオプション。 |

### 戻り値

のインスタンス[`Dataset`](../../dataset/).

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentException | オプション オブジェクトは、このドライバーに対して正しくない型を持っています。 |
| ArgumentNullException | パスは`null`. |
| [GisException](../../gisexception/) | データセットの読み取りエラー。 |
| IOException | I/O エラーが発生しました。 |
| NotSupportedException | ドライバーはデータセットを開くことができません (参照[`CanOpenDatasets`](../canopendatasets/)）。 |

### 関連項目

* class [Dataset](../../dataset/)
* class [AbstractPath](../../abstractpath/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* 名前空間 [Aspose.Gis](../../filedriver/)
* 組み立て [Aspose.GIS](../../../)


