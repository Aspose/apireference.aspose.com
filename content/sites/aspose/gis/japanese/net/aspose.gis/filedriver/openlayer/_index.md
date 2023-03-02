---
title: FileDriver.OpenLayer
second_title: Aspose.GIS for .NET API リファレンス
description: FileDriver 方法. 読み取り用にレイヤーを開きます
type: docs
weight: 90
url: /ja/net/aspose.gis/filedriver/openlayer/
---
## OpenLayer(string) {#openlayer_2}

読み取り用にレイヤーを開きます。

```csharp
public VectorLayer OpenLayer(string path)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| path | String | ファイルへのパス。 |

### 戻り値

のインスタンス[`VectorLayer`](../../vectorlayer/).

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | パスは`null`. |
| [GisException](../../gisexception/) | ファイルからのフィーチャの読み取り中にエラーが発生しました。 |
| IOException | I/O エラーが発生しました。 |
| NotSupportedException | ドライバーがベクター レイヤーを開くことができません ([`CanOpenLayers`](../canopenlayers/)）。 |

### 関連項目

* class [VectorLayer](../../vectorlayer/)
* class [FileDriver](../)
* 名前空間 [Aspose.Gis](../../filedriver/)
* 組み立て [Aspose.GIS](../../../)

---

## OpenLayer(AbstractPath) {#openlayer}

読み取り用にレイヤーを開きます。

```csharp
public VectorLayer OpenLayer(AbstractPath path)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| path | AbstractPath | ファイルへのパス。 |

### 戻り値

のインスタンス[`VectorLayer`](../../vectorlayer/).

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | パスは`null`. |
| [GisException](../../gisexception/) | ファイルからのフィーチャの読み取り中にエラーが発生しました。 |
| IOException | I/O エラーが発生しました。 |
| NotSupportedException | ドライバーがベクター レイヤーを開くことができません ([`CanOpenLayers`](../canopenlayers/)）。 |

### 関連項目

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../)
* 名前空間 [Aspose.Gis](../../filedriver/)
* 組み立て [Aspose.GIS](../../../)

---

## OpenLayer(string, DriverOptions) {#openlayer_3}

読み取り用にレイヤーを開きます。

```csharp
public VectorLayer OpenLayer(string path, DriverOptions options)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| path | String | ファイルへのパス。 |
| options | DriverOptions | ドライバー固有のオプション。 |

### 戻り値

のインスタンス[`VectorLayer`](../../vectorlayer/).

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentException | オプション オブジェクトは、このドライバーに対して正しくない型を持っています。 |
| ArgumentNullException | パスは`null`. |
| [GisException](../../gisexception/) | ファイルからのフィーチャの読み取り中にエラーが発生しました。 |
| IOException | I/O エラーが発生しました。 |
| NotSupportedException | ドライバーがベクター レイヤーを開くことができません ([`CanOpenLayers`](../canopenlayers/)）。 |

### 関連項目

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* 名前空間 [Aspose.Gis](../../filedriver/)
* 組み立て [Aspose.GIS](../../../)

---

## OpenLayer(AbstractPath, DriverOptions) {#openlayer_1}

読み取り用にレイヤーを開きます。

```csharp
public abstract VectorLayer OpenLayer(AbstractPath path, DriverOptions options)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| path | AbstractPath | ファイルへのパス。 |
| options | DriverOptions | ドライバー固有のオプション。 |

### 戻り値

のインスタンス[`VectorLayer`](../../vectorlayer/).

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentException | オプション オブジェクトは、このドライバーに対して正しくない型を持っています。 |
| ArgumentNullException | パスは`null`. |
| [GisException](../../gisexception/) | ファイルからのフィーチャの読み取り中にエラーが発生しました。 |
| IOException | I/O エラーが発生しました。 |
| NotSupportedException | ドライバーがベクター レイヤーを開くことができません ([`CanOpenLayers`](../canopenlayers/)）。 |

### 関連項目

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* 名前空間 [Aspose.Gis](../../filedriver/)
* 組み立て [Aspose.GIS](../../../)


