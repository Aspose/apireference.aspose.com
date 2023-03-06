---
title: VectorLayer.Create
second_title: Aspose.GIS for .NET API Reference
description: VectorLayer method. Creates the layer and opens it for adding new features.
type: docs
weight: 10
url: /net/aspose.gis/vectorlayer/create/
---
## Create(string, FileDriver) {#create_4}

Creates the layer and opens it for adding new features.

```csharp
public static VectorLayer Create(string path, FileDriver driver)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | String | Path to the file. |
| driver | FileDriver | Driver to use. |

### Return Value

A write-only layer.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | The path is `null`. |
| ArgumentException | Options object has an incorrect type for this driver. |
| [GisException](../../gisexception/) | Error writing the feature to the file. |
| IOException | An I/O error occurred. |

### See Also

* class [FileDriver](../../filedriver/)
* class [VectorLayer](../)
* namespace [Aspose.Gis](../../vectorlayer/)
* assembly [Aspose.GIS](../../../)

---

## Create(string, FileDriver, DriverOptions) {#create_5}

Creates the layer and opens it for adding new features.

```csharp
public static VectorLayer Create(string path, FileDriver driver, DriverOptions options)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | String | Path to the file. |
| driver | FileDriver | Driver to use. |
| options | DriverOptions | Driver-specific options. |

### Return Value

A write-only layer.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | The path is `null`. |
| ArgumentException | Options object has an incorrect type for this driver. |
| [GisException](../../gisexception/) | Error writing the feature to the file. |
| IOException | An I/O error occurred. |

### See Also

* class [FileDriver](../../filedriver/)
* class [DriverOptions](../../driveroptions/)
* class [VectorLayer](../)
* namespace [Aspose.Gis](../../vectorlayer/)
* assembly [Aspose.GIS](../../../)

---

## Create(AbstractPath, FileDriver) {#create}

Creates the layer and opens it for adding new features.

```csharp
public static VectorLayer Create(AbstractPath path, FileDriver driver)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | AbstractPath | Path to the file. |
| driver | FileDriver | Driver to use. |

### Return Value

A write-only layer.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | The path is `null`. |
| ArgumentException | Options object has an incorrect type for this driver. |
| [GisException](../../gisexception/) | Error writing the feature to the file. |
| IOException | An I/O error occurred. |

### See Also

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [VectorLayer](../)
* namespace [Aspose.Gis](../../vectorlayer/)
* assembly [Aspose.GIS](../../../)

---

## Create(AbstractPath, FileDriver, DriverOptions) {#create_1}

Creates the layer and opens it for adding new features.

```csharp
public static VectorLayer Create(AbstractPath path, FileDriver driver, DriverOptions options)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | AbstractPath | Path to the file. |
| driver | FileDriver | Driver to use. |
| options | DriverOptions | Driver-specific options. |

### Return Value

A write-only layer.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | The path is `null`. |
| ArgumentException | Options object has an incorrect type for this driver. |
| [GisException](../../gisexception/) | Error writing the feature to the file. |
| IOException | An I/O error occurred. |

### See Also

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [DriverOptions](../../driveroptions/)
* class [VectorLayer](../)
* namespace [Aspose.Gis](../../vectorlayer/)
* assembly [Aspose.GIS](../../../)

---

## Create(string, FileDriver, SpatialReferenceSystem) {#create_7}

Creates the layer and opens it for appending.

```csharp
public static VectorLayer Create(string path, FileDriver driver, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | String | Path to the file. |
| driver | FileDriver | Driver to use. |
| spatialReferenceSystem | SpatialReferenceSystem | Spatial reference system. |

### Return Value

An instance of [`VectorLayer`](../).

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | The path is `null`. |
| [GisException](../../gisexception/) | Error reading or writing the feature to/from the file. |
| IOException | An I/O error occurred. |
| NotSupportedException | Spatial reference system is not supported by the driver. Use [`SupportsSpatialReferenceSystem`](../../filedriver/supportsspatialreferencesystem/) to check whether spatial reference system is supported. |

### See Also

* class [FileDriver](../../filedriver/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [VectorLayer](../)
* namespace [Aspose.Gis](../../vectorlayer/)
* assembly [Aspose.GIS](../../../)

---

## Create(AbstractPath, FileDriver, SpatialReferenceSystem) {#create_3}

Creates the layer and opens it for appending.

```csharp
public static VectorLayer Create(AbstractPath path, FileDriver driver, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | AbstractPath | Path to the file. |
| driver | FileDriver | Driver to use. |
| spatialReferenceSystem | SpatialReferenceSystem | Spatial reference system. |

### Return Value

An instance of [`VectorLayer`](../).

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | The path is `null`. |
| [GisException](../../gisexception/) | Error reading or writing the feature to/from the file. |
| IOException | An I/O error occurred. |
| NotSupportedException | Spatial reference system is not supported by the driver. Use [`SupportsSpatialReferenceSystem`](../../filedriver/supportsspatialreferencesystem/) to check whether spatial reference system is supported. |

### See Also

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [VectorLayer](../)
* namespace [Aspose.Gis](../../vectorlayer/)
* assembly [Aspose.GIS](../../../)

---

## Create(string, FileDriver, DriverOptions, SpatialReferenceSystem) {#create_6}

Creates the layer and opens it for appending.

```csharp
public static VectorLayer Create(string path, FileDriver driver, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | String | Path to the file. |
| driver | FileDriver | Driver to use. |
| options | DriverOptions | Driver-specific options. |
| spatialReferenceSystem | SpatialReferenceSystem | Spatial reference system. |

### Return Value

An instance of [`VectorLayer`](../).

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | The path is `null`. |
| ArgumentException | Options object has an incorrect type for this driver. |
| [GisException](../../gisexception/) | Error reading or writing the feature to/from the file. |
| IOException | An I/O error occurred. |
| NotSupportedException | Spatial reference system is not supported by the driver. Use [`SupportsSpatialReferenceSystem`](../../filedriver/supportsspatialreferencesystem/) to check whether spatial reference system is supported. |

### See Also

* class [FileDriver](../../filedriver/)
* class [DriverOptions](../../driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [VectorLayer](../)
* namespace [Aspose.Gis](../../vectorlayer/)
* assembly [Aspose.GIS](../../../)

---

## Create(AbstractPath, FileDriver, DriverOptions, SpatialReferenceSystem) {#create_2}

Creates the layer and opens it for appending.

```csharp
public static VectorLayer Create(AbstractPath path, FileDriver driver, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | AbstractPath | Path to the file. |
| driver | FileDriver | Driver to use. |
| options | DriverOptions | Driver-specific options. |
| spatialReferenceSystem | SpatialReferenceSystem | Spatial reference system. |

### Return Value

An instance of [`VectorLayer`](../).

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | The path is `null`. |
| ArgumentException | Options object has an incorrect type for this driver. |
| [GisException](../../gisexception/) | Error reading or writing the feature to/from the file. |
| IOException | An I/O error occurred. |
| NotSupportedException | Spatial reference system is not supported by the driver. Use [`SupportsSpatialReferenceSystem`](../../filedriver/supportsspatialreferencesystem/) to check whether spatial reference system is supported. |

### See Also

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [DriverOptions](../../driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [VectorLayer](../)
* namespace [Aspose.Gis](../../vectorlayer/)
* assembly [Aspose.GIS](../../../)


