---
title: Dataset.Open
second_title: Aspose.GIS for .NET API リファレンス
description: Dataset 方法. データセットを開きます
type: docs
weight: 20
url: /ja/net/aspose.gis/dataset/open/
---
## Open(string, FileDriver) {#open_3}

データセットを開きます。

```csharp
public static Dataset Open(string path, FileDriver driver)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| path | String | データセットへのパス。 |
| driver | FileDriver | 使用するドライバー。 |

### 戻り値

のインスタンス[`Dataset`](../).

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | パスは`null`. |
| [GisException](../../gisexception/) | データセットの読み取りエラー。 |
| IOException | I/O エラーが発生しました。 |

### 関連項目

* class [FileDriver](../../filedriver/)
* class [Dataset](../)
* 名前空間 [Aspose.Gis](../../dataset/)
* 組み立て [Aspose.GIS](../../../)

---

## Open(AbstractPath, FileDriver) {#open}

データセットを開きます。

```csharp
public static Dataset Open(AbstractPath path, FileDriver driver)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| path | AbstractPath | データセットへのパス。 |
| driver | FileDriver | 使用するドライバー。 |

### 戻り値

のインスタンス[`Dataset`](../).

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | パスは`null`. |
| [GisException](../../gisexception/) | データセットの読み取りエラー。 |
| IOException | I/O エラーが発生しました。 |

### 関連項目

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [Dataset](../)
* 名前空間 [Aspose.Gis](../../dataset/)
* 組み立て [Aspose.GIS](../../../)

---

## Open(string, FileDriver, DriverOptions) {#open_4}

データセットを開きます。

```csharp
public static Dataset Open(string path, FileDriver driver, DriverOptions options)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| path | String | データセットへのパス。 |
| driver | FileDriver | 使用するドライバー。 |
| options | DriverOptions | ドライバー固有のオプション。 |

### 戻り値

のインスタンス[`Dataset`](../).

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentException | オプション オブジェクトは、このドライバーに対して正しくない型を持っています。 |
| ArgumentNullException | パスは`null`. |
| [GisException](../../gisexception/) | データセットの読み取りエラー。 |
| IOException | I/O エラーが発生しました。 |

### 関連項目

* class [FileDriver](../../filedriver/)
* class [DriverOptions](../../driveroptions/)
* class [Dataset](../)
* 名前空間 [Aspose.Gis](../../dataset/)
* 組み立て [Aspose.GIS](../../../)

---

## Open(AbstractPath, FileDriver, DriverOptions) {#open_1}

データセットを開きます。

```csharp
public static Dataset Open(AbstractPath path, FileDriver driver, DriverOptions options)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| path | AbstractPath | データセットへのパス。 |
| driver | FileDriver | 使用するドライバー。 |
| options | DriverOptions | ドライバー固有のオプション。 |

### 戻り値

のインスタンス[`Dataset`](../).

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentException | オプション オブジェクトは、このドライバーに対して正しくない型を持っています。 |
| ArgumentNullException | パスは`null`. |
| [GisException](../../gisexception/) | データセットの読み取りエラー。 |
| IOException | I/O エラーが発生しました。 |

### 関連項目

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [DriverOptions](../../driveroptions/)
* class [Dataset](../)
* 名前空間 [Aspose.Gis](../../dataset/)
* 組み立て [Aspose.GIS](../../../)

---

## Open(IDbConnection, DatabaseDriver) {#open_2}

データセットを開きます。

```csharp
public static Dataset Open(IDbConnection connection, DatabaseDriver driver)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| connection | IDbConnection | データベースへの接続を開きました。 |
| driver | DatabaseDriver | 使用するドライバー。 |

### 戻り値

のインスタンス[`Dataset`](../).

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentException | オプション オブジェクトは、このドライバーに対して正しくない型を持っています。 |
| ArgumentNullException | パスは`null`. |
| [GisException](../../gisexception/) | データセットの読み取りエラー。 |
| IOException | I/O エラーが発生しました。 |

### 関連項目

* class [DatabaseDriver](../../databasedriver/)
* class [Dataset](../)
* 名前空間 [Aspose.Gis](../../dataset/)
* 組み立て [Aspose.GIS](../../../)


