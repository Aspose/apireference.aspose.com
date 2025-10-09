---
title: FileGdbDriver.OpenDataset
second_title: Aspose.GIS for .NET API Reference
description: FileGdbDriver method. Opens the dataset
type: docs
weight: 80
url: /net/aspose.gis.formats.filegdb/filegdbdriver/opendataset/
---
## OpenDataset(string, FileGdbOptions) {#opendataset_5}

Opens the dataset.

```csharp
public Dataset OpenDataset(string path, FileGdbOptions options)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | String | Path to the dataset. |
| options | FileGdbOptions | Driver-specific options. |

### Return Value

An instance of [`Dataset`](../../../aspose.gis/dataset/).

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentException | Options object has an incorrect type for this driver. |
| ArgumentNullException | The path is `null`. |
| [GisException](../../../aspose.gis/gisexception/) | Error reading the layer from the dataset. |
| IOException | An I/O error occurred. |
| NotSupportedException | Driver can not open datasets (see [`CanOpenDatasets`](../canopendatasets/)). |

### See Also

* class [Dataset](../../../aspose.gis/dataset/)
* class [FileGdbOptions](../../filegdboptions/)
* class [FileGdbDriver](../)
* namespace [Aspose.Gis.Formats.FileGdb](../../filegdbdriver/)
* assembly [Aspose.GIS](../../../)

---

## OpenDataset(AbstractPath, DriverOptions) {#opendataset_1}

Opens the dataset.

```csharp
public override Dataset OpenDataset(AbstractPath path, DriverOptions options)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | AbstractPath | Path to the dataset. |
| options | DriverOptions | Driver-specific options. |

### Return Value

An instance of [`Dataset`](../../../aspose.gis/dataset/).

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentException | Options object has an incorrect type for this driver. |
| ArgumentNullException | The path is `null`. |
| [GisException](../../../aspose.gis/gisexception/) | Error reading the layer from the dataset. |
| IOException | An I/O error occurred. |
| NotSupportedException | Driver can not open datasets (see [`CanOpenDatasets`](../canopendatasets/)). |

### See Also

* class [Dataset](../../../aspose.gis/dataset/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [DriverOptions](../../../aspose.gis/driveroptions/)
* class [FileGdbDriver](../)
* namespace [Aspose.Gis.Formats.FileGdb](../../filegdbdriver/)
* assembly [Aspose.GIS](../../../)

---

## OpenDataset(AbstractPath, FileGdbOptions) {#opendataset_2}

Opens the dataset.

```csharp
public Dataset OpenDataset(AbstractPath path, FileGdbOptions options)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | AbstractPath | Path to the dataset. |
| options | FileGdbOptions | Driver-specific options. |

### Return Value

An instance of [`Dataset`](../../../aspose.gis/dataset/).

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentException | Options object has an incorrect type for this driver. |
| ArgumentNullException | The path is `null`. |
| [GisException](../../../aspose.gis/gisexception/) | Error reading the layer from the dataset. |
| IOException | An I/O error occurred. |
| NotSupportedException | Driver can not open datasets (see [`CanOpenDatasets`](../canopendatasets/)). |

### See Also

* class [Dataset](../../../aspose.gis/dataset/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [FileGdbOptions](../../filegdboptions/)
* class [FileGdbDriver](../)
* namespace [Aspose.Gis.Formats.FileGdb](../../filegdbdriver/)
* assembly [Aspose.GIS](../../../)


