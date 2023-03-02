---
title: VectorLayer.Create
second_title: Aspose.GIS for .NET API リファレンス
description: VectorLayer 方法. レイヤーを作成しそれを開いて新しいフィーチャを追加します
type: docs
weight: 10
url: /ja/net/aspose.gis/vectorlayer/create/
---
## Create(string, FileDriver) {#create_4}

レイヤーを作成し、それを開いて新しいフィーチャを追加します。

```csharp
public static VectorLayer Create(string path, FileDriver driver)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| path | String | ファイルへのパス。 |
| driver | FileDriver | 使用するドライバー。 |

### 戻り値

書き込み専用レイヤー。

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | パスは`null`. |
| ArgumentException | オプション オブジェクトは、このドライバーに対して正しくない型を持っています。 |
| [GisException](../../gisexception/) | ファイルへの機能の書き込み中にエラーが発生しました。 |
| IOException | I/O エラーが発生しました。 |

### 関連項目

* class [FileDriver](../../filedriver/)
* class [VectorLayer](../)
* 名前空間 [Aspose.Gis](../../vectorlayer/)
* 組み立て [Aspose.GIS](../../../)

---

## Create(string, FileDriver, DriverOptions) {#create_5}

レイヤーを作成し、それを開いて新しいフィーチャを追加します。

```csharp
public static VectorLayer Create(string path, FileDriver driver, DriverOptions options)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| path | String | ファイルへのパス。 |
| driver | FileDriver | 使用するドライバー。 |
| options | DriverOptions | ドライバー固有のオプション。 |

### 戻り値

書き込み専用レイヤー。

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | パスは`null`. |
| ArgumentException | オプション オブジェクトは、このドライバーに対して正しくない型を持っています。 |
| [GisException](../../gisexception/) | ファイルへの機能の書き込み中にエラーが発生しました。 |
| IOException | I/O エラーが発生しました。 |

### 関連項目

* class [FileDriver](../../filedriver/)
* class [DriverOptions](../../driveroptions/)
* class [VectorLayer](../)
* 名前空間 [Aspose.Gis](../../vectorlayer/)
* 組み立て [Aspose.GIS](../../../)

---

## Create(AbstractPath, FileDriver) {#create}

レイヤーを作成し、それを開いて新しいフィーチャを追加します。

```csharp
public static VectorLayer Create(AbstractPath path, FileDriver driver)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| path | AbstractPath | ファイルへのパス。 |
| driver | FileDriver | 使用するドライバー。 |

### 戻り値

書き込み専用レイヤー。

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | パスは`null`. |
| ArgumentException | オプション オブジェクトは、このドライバーに対して正しくない型を持っています。 |
| [GisException](../../gisexception/) | ファイルへの機能の書き込み中にエラーが発生しました。 |
| IOException | I/O エラーが発生しました。 |

### 関連項目

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [VectorLayer](../)
* 名前空間 [Aspose.Gis](../../vectorlayer/)
* 組み立て [Aspose.GIS](../../../)

---

## Create(AbstractPath, FileDriver, DriverOptions) {#create_1}

レイヤーを作成し、それを開いて新しいフィーチャを追加します。

```csharp
public static VectorLayer Create(AbstractPath path, FileDriver driver, DriverOptions options)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| path | AbstractPath | ファイルへのパス。 |
| driver | FileDriver | 使用するドライバー。 |
| options | DriverOptions | ドライバー固有のオプション。 |

### 戻り値

書き込み専用レイヤー。

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | パスは`null`. |
| ArgumentException | オプション オブジェクトは、このドライバーに対して正しくない型を持っています。 |
| [GisException](../../gisexception/) | ファイルへの機能の書き込み中にエラーが発生しました。 |
| IOException | I/O エラーが発生しました。 |

### 関連項目

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [DriverOptions](../../driveroptions/)
* class [VectorLayer](../)
* 名前空間 [Aspose.Gis](../../vectorlayer/)
* 組み立て [Aspose.GIS](../../../)

---

## Create(string, FileDriver, SpatialReferenceSystem) {#create_7}

レイヤーを作成し、追加用に開きます。

```csharp
public static VectorLayer Create(string path, FileDriver driver, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| path | String | ファイルへのパス。 |
| driver | FileDriver | 使用するドライバー。 |
| spatialReferenceSystem | SpatialReferenceSystem | 空間参照系。 |

### 戻り値

のインスタンス[`VectorLayer`](../).

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | パスは`null`. |
| [GisException](../../gisexception/) | ファイルに対するフィーチャの読み取りまたは書き込みでエラーが発生しました。 |
| IOException | I/O エラーが発生しました。 |
| NotSupportedException | ドライバーは空間参照系をサポートしていません。 使用[`SupportsSpatialReferenceSystem`](../../filedriver/supportsspatialreferencesystem/)空間参照系がサポートされているかどうかを確認します. |

### 関連項目

* class [FileDriver](../../filedriver/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [VectorLayer](../)
* 名前空間 [Aspose.Gis](../../vectorlayer/)
* 組み立て [Aspose.GIS](../../../)

---

## Create(AbstractPath, FileDriver, SpatialReferenceSystem) {#create_3}

レイヤーを作成し、追加用に開きます。

```csharp
public static VectorLayer Create(AbstractPath path, FileDriver driver, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| path | AbstractPath | ファイルへのパス。 |
| driver | FileDriver | 使用するドライバー。 |
| spatialReferenceSystem | SpatialReferenceSystem | 空間参照系。 |

### 戻り値

のインスタンス[`VectorLayer`](../).

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | パスは`null`. |
| [GisException](../../gisexception/) | ファイルに対するフィーチャの読み取りまたは書き込みでエラーが発生しました。 |
| IOException | I/O エラーが発生しました。 |
| NotSupportedException | ドライバーは空間参照系をサポートしていません。 使用[`SupportsSpatialReferenceSystem`](../../filedriver/supportsspatialreferencesystem/)空間参照系がサポートされているかどうかを確認します. |

### 関連項目

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [VectorLayer](../)
* 名前空間 [Aspose.Gis](../../vectorlayer/)
* 組み立て [Aspose.GIS](../../../)

---

## Create(string, FileDriver, DriverOptions, SpatialReferenceSystem) {#create_6}

レイヤーを作成し、追加用に開きます。

```csharp
public static VectorLayer Create(string path, FileDriver driver, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| path | String | ファイルへのパス。 |
| driver | FileDriver | 使用するドライバー。 |
| options | DriverOptions | ドライバー固有のオプション。 |
| spatialReferenceSystem | SpatialReferenceSystem | 空間参照系。 |

### 戻り値

のインスタンス[`VectorLayer`](../).

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | パスは`null`. |
| ArgumentException | オプション オブジェクトは、このドライバーに対して正しくない型を持っています。 |
| [GisException](../../gisexception/) | ファイルに対するフィーチャの読み取りまたは書き込みでエラーが発生しました。 |
| IOException | I/O エラーが発生しました。 |
| NotSupportedException | ドライバーは空間参照系をサポートしていません。 使用[`SupportsSpatialReferenceSystem`](../../filedriver/supportsspatialreferencesystem/)空間参照系がサポートされているかどうかを確認します. |

### 関連項目

* class [FileDriver](../../filedriver/)
* class [DriverOptions](../../driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [VectorLayer](../)
* 名前空間 [Aspose.Gis](../../vectorlayer/)
* 組み立て [Aspose.GIS](../../../)

---

## Create(AbstractPath, FileDriver, DriverOptions, SpatialReferenceSystem) {#create_2}

レイヤーを作成し、追加用に開きます。

```csharp
public static VectorLayer Create(AbstractPath path, FileDriver driver, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| path | AbstractPath | ファイルへのパス。 |
| driver | FileDriver | 使用するドライバー。 |
| options | DriverOptions | ドライバー固有のオプション。 |
| spatialReferenceSystem | SpatialReferenceSystem | 空間参照系。 |

### 戻り値

のインスタンス[`VectorLayer`](../).

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | パスは`null`. |
| ArgumentException | オプション オブジェクトは、このドライバーに対して正しくない型を持っています。 |
| [GisException](../../gisexception/) | ファイルに対するフィーチャの読み取りまたは書き込みでエラーが発生しました。 |
| IOException | I/O エラーが発生しました。 |
| NotSupportedException | ドライバーは空間参照系をサポートしていません。 使用[`SupportsSpatialReferenceSystem`](../../filedriver/supportsspatialreferencesystem/)空間参照系がサポートされているかどうかを確認します. |

### 関連項目

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [DriverOptions](../../driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [VectorLayer](../)
* 名前空間 [Aspose.Gis](../../vectorlayer/)
* 組み立て [Aspose.GIS](../../../)


