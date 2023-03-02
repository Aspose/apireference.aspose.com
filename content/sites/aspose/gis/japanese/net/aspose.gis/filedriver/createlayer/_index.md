---
title: FileDriver.CreateLayer
second_title: Aspose.GIS for .NET API リファレンス
description: FileDriver 方法. レイヤーを作成し追加用に開きます
type: docs
weight: 60
url: /ja/net/aspose.gis/filedriver/createlayer/
---
## CreateLayer(string) {#createlayer_4}

レイヤーを作成し、追加用に開きます。

```csharp
public VectorLayer CreateLayer(string path)
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
| [GisException](../../gisexception/) | ファイルへの機能の書き込み中にエラーが発生しました。 |
| IOException | I/O エラーが発生しました。 |
| NotSupportedException | ドライバーはベクター レイヤーを作成できません ([`CanCreateLayers`](../cancreatelayers/)）。 |

### 関連項目

* class [VectorLayer](../../vectorlayer/)
* class [FileDriver](../)
* 名前空間 [Aspose.Gis](../../filedriver/)
* 組み立て [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath) {#createlayer}

レイヤーを作成し、追加用に開きます。

```csharp
public VectorLayer CreateLayer(AbstractPath path)
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
| [GisException](../../gisexception/) | ファイルへの機能の書き込み中にエラーが発生しました。 |
| IOException | I/O エラーが発生しました。 |
| NotSupportedException | ドライバーはベクター レイヤーを作成できません ([`CanCreateLayers`](../cancreatelayers/)）。 |

### 関連項目

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../)
* 名前空間 [Aspose.Gis](../../filedriver/)
* 組み立て [Aspose.GIS](../../../)

---

## CreateLayer(string, DriverOptions) {#createlayer_5}

レイヤーを作成し、追加用に開きます。

```csharp
public VectorLayer CreateLayer(string path, DriverOptions options)
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
| ArgumentNullException | パスは`null`. |
| ArgumentException | オプション オブジェクトは、このドライバーに対して正しくない型を持っています。 |
| [GisException](../../gisexception/) | ファイルへの機能の書き込み中にエラーが発生しました。 |
| IOException | I/O エラーが発生しました。 |
| NotSupportedException | ドライバーはベクター レイヤーを作成できません ([`CanCreateLayers`](../cancreatelayers/)）。 |

### 関連項目

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* 名前空間 [Aspose.Gis](../../filedriver/)
* 組み立て [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, DriverOptions) {#createlayer_1}

レイヤーを作成し、追加用に開きます。

```csharp
public VectorLayer CreateLayer(AbstractPath path, DriverOptions options)
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
| ArgumentNullException | パスは`null`. |
| ArgumentException | オプション オブジェクトは、このドライバーに対して正しくない型を持っています。 |
| [GisException](../../gisexception/) | ファイルへの機能の書き込み中にエラーが発生しました。 |
| IOException | I/O エラーが発生しました。 |
| NotSupportedException | ドライバーはベクター レイヤーを作成できません ([`CanCreateLayers`](../cancreatelayers/)）。 |

### 関連項目

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* 名前空間 [Aspose.Gis](../../filedriver/)
* 組み立て [Aspose.GIS](../../../)

---

## CreateLayer(string, SpatialReferenceSystem) {#createlayer_7}

レイヤーを作成し、追加用に開きます。

```csharp
public VectorLayer CreateLayer(string path, SpatialReferenceSystem spatialReferenceSystem)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| path | String | ファイルへのパス。 |
| spatialReferenceSystem | SpatialReferenceSystem | 空間参照系。 |

### 戻り値

のインスタンス[`VectorLayer`](../../vectorlayer/).

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | パスは`null`. |
| [GisException](../../gisexception/) | ファイルへの機能の書き込み中にエラーが発生しました。 |
| IOException | I/O エラーが発生しました。 |
| NotSupportedException | ドライバーは空間参照系をサポートしていません。 使用[`SupportsSpatialReferenceSystem`](../supportsspatialreferencesystem/)空間参照系がサポートされているかどうかを確認します. |

### 関連項目

* class [VectorLayer](../../vectorlayer/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileDriver](../)
* 名前空間 [Aspose.Gis](../../filedriver/)
* 組み立て [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, SpatialReferenceSystem) {#createlayer_3}

レイヤーを作成し、追加用に開きます。

```csharp
public VectorLayer CreateLayer(AbstractPath path, SpatialReferenceSystem spatialReferenceSystem)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| path | AbstractPath | ファイルへのパス。 |
| spatialReferenceSystem | SpatialReferenceSystem | 空間参照系。 |

### 戻り値

のインスタンス[`VectorLayer`](../../vectorlayer/).

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | パスは`null`. |
| [GisException](../../gisexception/) | ファイルへの機能の書き込み中にエラーが発生しました。 |
| IOException | I/O エラーが発生しました。 |
| NotSupportedException | ドライバーは空間参照系をサポートしていません。 使用[`SupportsSpatialReferenceSystem`](../supportsspatialreferencesystem/)空間参照系がサポートされているかどうかを確認します. |

### 関連項目

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileDriver](../)
* 名前空間 [Aspose.Gis](../../filedriver/)
* 組み立て [Aspose.GIS](../../../)

---

## CreateLayer(string, DriverOptions, SpatialReferenceSystem) {#createlayer_6}

レイヤーを作成し、追加用に開きます。

```csharp
public VectorLayer CreateLayer(string path, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| path | String | ファイルへのパス。 |
| options | DriverOptions | ドライバー固有のオプション。 |
| spatialReferenceSystem | SpatialReferenceSystem | 空間参照系。 |

### 戻り値

のインスタンス[`VectorLayer`](../../vectorlayer/).

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | パスは`null`. |
| ArgumentException | オプション オブジェクトは、このドライバーに対して正しくない型を持っています。 |
| [GisException](../../gisexception/) | ファイルへの機能の書き込み中にエラーが発生しました。 |
| IOException | I/O エラーが発生しました。 |
| NotSupportedException | ドライバーは空間参照系をサポートしていません。 使用[`SupportsSpatialReferenceSystem`](../supportsspatialreferencesystem/)空間参照系がサポートされているかどうかを確認します. |
| NotSupportedException | ドライバーはベクター レイヤーを作成できません ([`CanCreateLayers`](../cancreatelayers/)）。 |

### 関連項目

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileDriver](../)
* 名前空間 [Aspose.Gis](../../filedriver/)
* 組み立て [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, DriverOptions, SpatialReferenceSystem) {#createlayer_2}

レイヤーを作成し、追加用に開きます。

```csharp
public abstract VectorLayer CreateLayer(AbstractPath path, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| path | AbstractPath | ファイルへのパス。 |
| options | DriverOptions | ドライバー固有のオプション。 |
| spatialReferenceSystem | SpatialReferenceSystem | 空間参照系。 |

### 戻り値

のインスタンス[`VectorLayer`](../../vectorlayer/).

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | パスは`null`. |
| ArgumentException | オプション オブジェクトは、このドライバーに対して正しくない型を持っています。 |
| [GisException](../../gisexception/) | ファイルへの機能の書き込み中にエラーが発生しました。 |
| IOException | I/O エラーが発生しました。 |
| NotSupportedException | ドライバーは空間参照系をサポートしていません。 使用[`SupportsSpatialReferenceSystem`](../supportsspatialreferencesystem/)空間参照系がサポートされているかどうかを確認します. |
| NotSupportedException | ドライバーはベクター レイヤーを作成できません ([`CanCreateLayers`](../cancreatelayers/)）。 |

### 関連項目

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [DriverOptions](../../driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileDriver](../)
* 名前空間 [Aspose.Gis](../../filedriver/)
* 組み立て [Aspose.GIS](../../../)


