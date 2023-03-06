---
title: FileDriver.CreateDataset
second_title: Aspose.GIS for .NET API Reference
description: FileDriver method. Creates a dataset.
type: docs
weight: 50
url: /net/aspose.gis/filedriver/createdataset/
---
## CreateDataset(string) {#createdataset_2}

Creates a dataset.

```csharp
public Dataset CreateDataset(string path)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | String | Path to the dataset. |

### Return Value

An instance of [`Dataset`](../../dataset/).

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | The path is `null`. |
| [GisException](../../gisexception/) | Error creating the dataset. |
| IOException | An I/O error occurred. |
| NotSupportedException | Driver can not open datasets (see [`CanOpenDatasets`](../canopendatasets/)). |
| InvalidOperationException | Dataset already exists. |

### See Also

* class [Dataset](../../dataset/)
* class [FileDriver](../)
* namespace [Aspose.Gis](../../filedriver/)
* assembly [Aspose.GIS](../../../)

---

## CreateDataset(AbstractPath) {#createdataset}

Creates a dataset.

```csharp
public Dataset CreateDataset(AbstractPath path)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | AbstractPath | Path to the dataset. |

### Return Value

An instance of [`Dataset`](../../dataset/).

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | The path is `null`. |
| [GisException](../../gisexception/) | Error creating the dataset. |
| IOException | An I/O error occurred. |
| NotSupportedException | Driver can not open datasets (see [`CanOpenDatasets`](../canopendatasets/)). |
| InvalidOperationException | Dataset already exists. |

### See Also

* class [Dataset](../../dataset/)
* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../)
* namespace [Aspose.Gis](../../filedriver/)
* assembly [Aspose.GIS](../../../)

---

## CreateDataset(string, DriverOptions) {#createdataset_3}

Creates a dataset.

```csharp
public Dataset CreateDataset(string path, DriverOptions options)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | String | Path to the dataset. |
| options | DriverOptions | Driver-specific options. |

### Return Value

An instance of [`Dataset`](../../dataset/).

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentException | Options object has an incorrect type for this driver. |
| ArgumentNullException | The path is `null`. |
| [GisException](../../gisexception/) | Error creating the dataset. |
| IOException | An I/O error occurred. |
| NotSupportedException | Driver can not open datasets (see [`CanOpenDatasets`](../canopendatasets/)). |
| InvalidOperationException | Dataset already exists. |

### See Also

* class [Dataset](../../dataset/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* namespace [Aspose.Gis](../../filedriver/)
* assembly [Aspose.GIS](../../../)

---

## CreateDataset(AbstractPath, DriverOptions) {#createdataset_1}

Creates a dataset.

```csharp
public virtual Dataset CreateDataset(AbstractPath path, DriverOptions options)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | AbstractPath | Path to the dataset. |
| options | DriverOptions | Driver-specific options. |

### Return Value

An instance of [`Dataset`](../../dataset/).

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentException | Options object has an incorrect type for this driver. |
| ArgumentNullException | The path is `null`. |
| [GisException](../../gisexception/) | Error creating the dataset. |
| IOException | An I/O error occurred. |
| NotSupportedException | Driver can not open datasets (see [`CanOpenDatasets`](../canopendatasets/)). |
| InvalidOperationException | Dataset already exists. |

### See Also

* class [Dataset](../../dataset/)
* class [AbstractPath](../../abstractpath/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* namespace [Aspose.Gis](../../filedriver/)
* assembly [Aspose.GIS](../../../)


