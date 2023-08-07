---
title: FileDriver.OpenDataset
second_title: Aspose.GIS for .NET API Reference
description: FileDriver method. Opens the dataset
type: docs
weight: 80
url: /net/aspose.gis/filedriver/opendataset/
---
## OpenDataset(string) {#opendataset_2}

Opens the dataset.

```csharp
public Dataset OpenDataset(string path)
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
| [GisException](../../gisexception/) | Error reading the dataset. |
| IOException | An I/O error occurred. |
| NotSupportedException | Driver can not open datasets (see [`CanOpenDatasets`](../canopendatasets/)). |

### See Also

* class [Dataset](../../dataset/)
* class [FileDriver](../)
* namespace [Aspose.Gis](../../filedriver/)
* assembly [Aspose.GIS](../../../)

---

## OpenDataset(AbstractPath) {#opendataset}

Opens the dataset.

```csharp
public Dataset OpenDataset(AbstractPath path)
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
| [GisException](../../gisexception/) | Error reading the dataset. |
| IOException | An I/O error occurred. |
| NotSupportedException | Driver can not open datasets (see [`CanOpenDatasets`](../canopendatasets/)). |

### See Also

* class [Dataset](../../dataset/)
* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../)
* namespace [Aspose.Gis](../../filedriver/)
* assembly [Aspose.GIS](../../../)

---

## OpenDataset(string, DriverOptions) {#opendataset_3}

Opens the dataset.

```csharp
public Dataset OpenDataset(string path, DriverOptions options)
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
| [GisException](../../gisexception/) | Error reading the dataset. |
| IOException | An I/O error occurred. |
| NotSupportedException | Driver can not open datasets (see [`CanOpenDatasets`](../canopendatasets/)). |

### See Also

* class [Dataset](../../dataset/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* namespace [Aspose.Gis](../../filedriver/)
* assembly [Aspose.GIS](../../../)

---

## OpenDataset(AbstractPath, DriverOptions) {#opendataset_1}

Opens the dataset.

```csharp
public virtual Dataset OpenDataset(AbstractPath path, DriverOptions options)
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
| [GisException](../../gisexception/) | Error reading the dataset. |
| IOException | An I/O error occurred. |
| NotSupportedException | Driver can not open datasets (see [`CanOpenDatasets`](../canopendatasets/)). |

### See Also

* class [Dataset](../../dataset/)
* class [AbstractPath](../../abstractpath/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* namespace [Aspose.Gis](../../filedriver/)
* assembly [Aspose.GIS](../../../)


