---
title: Dataset.Open
second_title: Aspose.GIS for .NET API Reference
description: Dataset method. Opens the dataset
type: docs
weight: 20
url: /net/aspose.gis/dataset/open/
---
## Open(string, FileDriver) {#open_3}

Opens the dataset.

```csharp
public static Dataset Open(string path, FileDriver driver)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | String | Path to the dataset. |
| driver | FileDriver | Driver to use. |

### Return Value

An instance of [`Dataset`](../).

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | The path is `null`. |
| [GisException](../../gisexception/) | Error reading the dataset. |
| IOException | An I/O error occurred. |

### See Also

* class [FileDriver](../../filedriver/)
* class [Dataset](../)
* namespace [Aspose.Gis](../../dataset/)
* assembly [Aspose.GIS](../../../)

---

## Open(AbstractPath, FileDriver) {#open}

Opens the dataset.

```csharp
public static Dataset Open(AbstractPath path, FileDriver driver)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | AbstractPath | Path to the dataset. |
| driver | FileDriver | Driver to use. |

### Return Value

An instance of [`Dataset`](../).

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | The path is `null`. |
| [GisException](../../gisexception/) | Error reading the dataset. |
| IOException | An I/O error occurred. |

### See Also

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [Dataset](../)
* namespace [Aspose.Gis](../../dataset/)
* assembly [Aspose.GIS](../../../)

---

## Open(string, FileDriver, DriverOptions) {#open_4}

Opens the dataset.

```csharp
public static Dataset Open(string path, FileDriver driver, DriverOptions options)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | String | Path to the dataset. |
| driver | FileDriver | Driver to use. |
| options | DriverOptions | Driver-specific options. |

### Return Value

An instance of [`Dataset`](../).

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentException | Options object has an incorrect type for this driver. |
| ArgumentNullException | The path is `null`. |
| [GisException](../../gisexception/) | Error reading the dataset. |
| IOException | An I/O error occurred. |

### See Also

* class [FileDriver](../../filedriver/)
* class [DriverOptions](../../driveroptions/)
* class [Dataset](../)
* namespace [Aspose.Gis](../../dataset/)
* assembly [Aspose.GIS](../../../)

---

## Open(AbstractPath, FileDriver, DriverOptions) {#open_1}

Opens the dataset.

```csharp
public static Dataset Open(AbstractPath path, FileDriver driver, DriverOptions options)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | AbstractPath | Path to the dataset. |
| driver | FileDriver | Driver to use. |
| options | DriverOptions | Driver-specific options. |

### Return Value

An instance of [`Dataset`](../).

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentException | Options object has an incorrect type for this driver. |
| ArgumentNullException | The path is `null`. |
| [GisException](../../gisexception/) | Error reading the dataset. |
| IOException | An I/O error occurred. |

### See Also

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [DriverOptions](../../driveroptions/)
* class [Dataset](../)
* namespace [Aspose.Gis](../../dataset/)
* assembly [Aspose.GIS](../../../)

---

## Open(IDbConnection, DatabaseDriver) {#open_2}

Opens the dataset.

```csharp
public static Dataset Open(IDbConnection connection, DatabaseDriver driver)
```

| Parameter | Type | Description |
| --- | --- | --- |
| connection | IDbConnection | Opened connection to the database. |
| driver | DatabaseDriver | Driver to use. |

### Return Value

An instance of [`Dataset`](../).

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentException | Options object has an incorrect type for this driver. |
| ArgumentNullException | The path is `null`. |
| [GisException](../../gisexception/) | Error reading the dataset. |
| IOException | An I/O error occurred. |

### See Also

* class [DatabaseDriver](../../databasedriver/)
* class [Dataset](../)
* namespace [Aspose.Gis](../../dataset/)
* assembly [Aspose.GIS](../../../)


