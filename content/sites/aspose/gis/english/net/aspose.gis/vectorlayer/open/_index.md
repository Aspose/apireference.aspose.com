---
title: VectorLayer.Open
second_title: Aspose.GIS for .NET API Reference
description: VectorLayer method. Open the layer for reading
type: docs
weight: 20
url: /net/aspose.gis/vectorlayer/open/
---
## Open(string, FileDriver) {#open_2}

Open the layer for reading.

```csharp
public static VectorLayer Open(string path, FileDriver driver)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | String | Path to the file. |
| driver | FileDriver | Driver to use. |

### Return Value

A read-only layer.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentException | Options object has an incorrect type for this driver. |
| ArgumentNullException | The path is `null`. |
| [GisException](../../gisexception/) | Error reading the feature from the file. |
| IOException | An I/O error occurred. |

### See Also

* class [FileDriver](../../filedriver/)
* class [VectorLayer](../)
* namespace [Aspose.Gis](../../vectorlayer/)
* assembly [Aspose.GIS](../../../)

---

## Open(AbstractPath, FileDriver) {#open}

Open the layer for reading.

```csharp
public static VectorLayer Open(AbstractPath path, FileDriver driver)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | AbstractPath | Path to the file. |
| driver | FileDriver | Driver to use. |

### Return Value

A read-only layer.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentException | Options object has an incorrect type for this driver. |
| ArgumentNullException | The path is `null`. |
| [GisException](../../gisexception/) | Error reading the feature from the file. |
| IOException | An I/O error occurred. |

### See Also

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [VectorLayer](../)
* namespace [Aspose.Gis](../../vectorlayer/)
* assembly [Aspose.GIS](../../../)

---

## Open(string, FileDriver, DriverOptions) {#open_3}

Open the layer for reading.

```csharp
public static VectorLayer Open(string path, FileDriver driver, DriverOptions options)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | String | Path to the file. |
| driver | FileDriver | Driver to use. |
| options | DriverOptions | Driver-specific options. |

### Return Value

A read-only layer.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentException | Options object has an incorrect type for this driver. |
| ArgumentNullException | The path is `null`. |
| [GisException](../../gisexception/) | Error reading the feature from the file. |
| IOException | An I/O error occurred. |

### See Also

* class [FileDriver](../../filedriver/)
* class [DriverOptions](../../driveroptions/)
* class [VectorLayer](../)
* namespace [Aspose.Gis](../../vectorlayer/)
* assembly [Aspose.GIS](../../../)

---

## Open(AbstractPath, FileDriver, DriverOptions) {#open_1}

Open the layer for reading.

```csharp
public static VectorLayer Open(AbstractPath path, FileDriver driver, DriverOptions options)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | AbstractPath | Path to the file. |
| driver | FileDriver | Driver to use. |
| options | DriverOptions | Driver-specific options. |

### Return Value

A read-only layer.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentException | Options object has an incorrect type for this driver. |
| ArgumentNullException | The path is `null`. |
| [GisException](../../gisexception/) | Error reading the feature from the file. |
| IOException | An I/O error occurred. |

### See Also

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [DriverOptions](../../driveroptions/)
* class [VectorLayer](../)
* namespace [Aspose.Gis](../../vectorlayer/)
* assembly [Aspose.GIS](../../../)


