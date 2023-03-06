---
title: FileDriver.CreateDataset
second_title: Aspose.GIS for .NET API リファレンス
description: FileDriver 方法. データセットを作成します
type: docs
weight: 50
url: /ja/net/aspose.gis/filedriver/createdataset/
---
## CreateDataset(string) {#createdataset_2}

データセットを作成します。

```csharp
public Dataset CreateDataset(string path)
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
| [GisException](../../gisexception/) | データセットの作成中にエラーが発生しました。 |
| IOException | I/O エラーが発生しました。 |
| NotSupportedException | ドライバーはデータセットを開くことができません (参照[`CanOpenDatasets`](../canopendatasets/)）。 |
| InvalidOperationException | データセットは既に存在します。 |

### 関連項目

* class [Dataset](../../dataset/)
* class [FileDriver](../)
* 名前空間 [Aspose.Gis](../../filedriver/)
* 組み立て [Aspose.GIS](../../../)

---

## CreateDataset(AbstractPath) {#createdataset}

データセットを作成します。

```csharp
public Dataset CreateDataset(AbstractPath path)
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
| [GisException](../../gisexception/) | データセットの作成中にエラーが発生しました。 |
| IOException | I/O エラーが発生しました。 |
| NotSupportedException | ドライバーはデータセットを開くことができません (参照[`CanOpenDatasets`](../canopendatasets/)）。 |
| InvalidOperationException | データセットは既に存在します。 |

### 関連項目

* class [Dataset](../../dataset/)
* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../)
* 名前空間 [Aspose.Gis](../../filedriver/)
* 組み立て [Aspose.GIS](../../../)

---

## CreateDataset(string, DriverOptions) {#createdataset_3}

データセットを作成します。

```csharp
public Dataset CreateDataset(string path, DriverOptions options)
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
| [GisException](../../gisexception/) | データセットの作成中にエラーが発生しました。 |
| IOException | I/O エラーが発生しました。 |
| NotSupportedException | ドライバーはデータセットを開くことができません (参照[`CanOpenDatasets`](../canopendatasets/)）。 |
| InvalidOperationException | データセットは既に存在します。 |

### 関連項目

* class [Dataset](../../dataset/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* 名前空間 [Aspose.Gis](../../filedriver/)
* 組み立て [Aspose.GIS](../../../)

---

## CreateDataset(AbstractPath, DriverOptions) {#createdataset_1}

データセットを作成します。

```csharp
public virtual Dataset CreateDataset(AbstractPath path, DriverOptions options)
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
| [GisException](../../gisexception/) | データセットの作成中にエラーが発生しました。 |
| IOException | I/O エラーが発生しました。 |
| NotSupportedException | ドライバーはデータセットを開くことができません (参照[`CanOpenDatasets`](../canopendatasets/)）。 |
| InvalidOperationException | データセットは既に存在します。 |

### 関連項目

* class [Dataset](../../dataset/)
* class [AbstractPath](../../abstractpath/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* 名前空間 [Aspose.Gis](../../filedriver/)
* 組み立て [Aspose.GIS](../../../)


