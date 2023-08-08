---
title: Dataset.Create
second_title: Aspose.GIS for .NET API Reference
description: Dataset method. Creates a dataset
type: docs
weight: 10
url: /net/aspose.gis/dataset/create/
---
## Create(string, FileDriver) {#create_2}

Creates a dataset.

```csharp
public static Dataset Create(string path, FileDriver driver)
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
| ArgumentException | Options object has an incorrect type for this driver. |
| ArgumentNullException | The path is `null`. |
| [GisException](../../gisexception/) | Error while creating the dataset. |
| IOException | An I/O error occurred. |
| NotSupportedException | Driver can not open datasets. |
| InvalidOperationException | Dataset already exists. |

### See Also

* class [FileDriver](../../filedriver/)
* class [Dataset](../)
* namespace [Aspose.Gis](../../dataset/)
* assembly [Aspose.GIS](../../../)

---

## Create(AbstractPath, FileDriver) {#create}

Creates a dataset.

```csharp
public static Dataset Create(AbstractPath path, FileDriver driver)
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
| ArgumentException | Options object has an incorrect type for this driver. |
| ArgumentNullException | The path is `null`. |
| [GisException](../../gisexception/) | Error while creating the dataset. |
| IOException | An I/O error occurred. |
| NotSupportedException | Driver can not open datasets. |
| InvalidOperationException | Dataset already exists. |

### See Also

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [Dataset](../)
* namespace [Aspose.Gis](../../dataset/)
* assembly [Aspose.GIS](../../../)

---

## Create(string, FileDriver, DriverOptions) {#create_3}

Creates a dataset.

```csharp
public static Dataset Create(string path, FileDriver driver, DriverOptions options)
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
| [GisException](../../gisexception/) | Error while creating the dataset. |
| IOException | An I/O error occurred. |
| NotSupportedException | Driver can not open datasets. |
| InvalidOperationException | Dataset already exists. |

### See Also

* class [FileDriver](../../filedriver/)
* class [DriverOptions](../../driveroptions/)
* class [Dataset](../)
* namespace [Aspose.Gis](../../dataset/)
* assembly [Aspose.GIS](../../../)

---

## Create(AbstractPath, FileDriver, DriverOptions) {#create_1}

Creates a dataset.

```csharp
public static Dataset Create(AbstractPath path, FileDriver driver, DriverOptions options)
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
| [GisException](../../gisexception/) | Error while creating the dataset. |
| IOException | An I/O error occurred. |
| NotSupportedException | Driver can not open datasets. |
| InvalidOperationException | Dataset already exists. |

### See Also

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [DriverOptions](../../driveroptions/)
* class [Dataset](../)
* namespace [Aspose.Gis](../../dataset/)
* assembly [Aspose.GIS](../../../)


