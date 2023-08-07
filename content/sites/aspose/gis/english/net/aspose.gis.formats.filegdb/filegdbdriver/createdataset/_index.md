---
title: FileGdbDriver.CreateDataset
second_title: Aspose.GIS for .NET API Reference
description: FileGdbDriver method. Creates a dataset
type: docs
weight: 50
url: /net/aspose.gis.formats.filegdb/filegdbdriver/createdataset/
---
## CreateDataset(string, FileGdbOptions) {#createdataset_5}

Creates a dataset.

```csharp
public Dataset CreateDataset(string path, FileGdbOptions options)
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
| [GisException](../../../aspose.gis/gisexception/) | Error reading the dataset. |
| IOException | An I/O error occurred. |
| NotSupportedException | Driver can not open datasets (see [`CanOpenDatasets`](../../../aspose.gis/filedriver/canopendatasets/)). |
| InvalidOperationException | Dataset already exists. |

### See Also

* class [Dataset](../../../aspose.gis/dataset/)
* class [FileGdbOptions](../../filegdboptions/)
* class [FileGdbDriver](../)
* namespace [Aspose.Gis.Formats.FileGdb](../../filegdbdriver/)
* assembly [Aspose.GIS](../../../)

---

## CreateDataset(AbstractPath, DriverOptions) {#createdataset_1}

Creates a dataset.

```csharp
public override Dataset CreateDataset(AbstractPath path, DriverOptions options)
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
| [GisException](../../../aspose.gis/gisexception/) | Error reading the dataset. |
| IOException | An I/O error occurred. |
| NotSupportedException | Driver can not open datasets (see [`CanOpenDatasets`](../../../aspose.gis/filedriver/canopendatasets/)). |
| InvalidOperationException | Dataset already exists. |

### See Also

* class [Dataset](../../../aspose.gis/dataset/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [DriverOptions](../../../aspose.gis/driveroptions/)
* class [FileGdbDriver](../)
* namespace [Aspose.Gis.Formats.FileGdb](../../filegdbdriver/)
* assembly [Aspose.GIS](../../../)

---

## CreateDataset(AbstractPath, FileGdbOptions) {#createdataset_2}

Creates a dataset.

```csharp
public Dataset CreateDataset(AbstractPath path, FileGdbOptions options)
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
| [GisException](../../../aspose.gis/gisexception/) | Error reading the dataset. |
| IOException | An I/O error occurred. |
| NotSupportedException | Driver can not open datasets (see [`CanOpenDatasets`](../../../aspose.gis/filedriver/canopendatasets/)). |
| InvalidOperationException | Dataset already exists. |

### See Also

* class [Dataset](../../../aspose.gis/dataset/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [FileGdbOptions](../../filegdboptions/)
* class [FileGdbDriver](../)
* namespace [Aspose.Gis.Formats.FileGdb](../../filegdbdriver/)
* assembly [Aspose.GIS](../../../)


