---
title: CreateLayer
second_title: Aspose.GIS for .NET API Reference
description: 
type: docs
weight: 60
url: /net/aspose.gis/filedriver/createlayer/
---
## FileDriver.CreateLayer method (1 of 8)

Creates the layer and opens it for appending.

```csharp
public VectorLayer CreateLayer(string path)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | String | Path to the file. |

### Return Value

An instance of [`VectorLayer`](../../vectorlayer).

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | The path is `null`. |
| [GisException](../../gisexception) | Error writing the feature to the file. |
| IOException | An I/O error occurred. |
| NotSupportedException | Driver can not create vector layers (see [`CanCreateLayers`](../cancreatelayers)). |

### See Also

* class [VectorLayer](../../vectorlayer)
* class [FileDriver](../../filedriver)
* namespace [Aspose.Gis](../../filedriver)
* assembly [Aspose.GIS](../../../)

---

## FileDriver.CreateLayer method (2 of 8)

Creates the layer and opens it for appending.

```csharp
public VectorLayer CreateLayer(AbstractPath path)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | AbstractPath | Path to the file. |

### Return Value

An instance of [`VectorLayer`](../../vectorlayer).

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | The path is `null`. |
| [GisException](../../gisexception) | Error writing the feature to the file. |
| IOException | An I/O error occurred. |
| NotSupportedException | Driver can not create vector layers (see [`CanCreateLayers`](../cancreatelayers)). |

### See Also

* class [VectorLayer](../../vectorlayer)
* class [AbstractPath](../../abstractpath)
* class [FileDriver](../../filedriver)
* namespace [Aspose.Gis](../../filedriver)
* assembly [Aspose.GIS](../../../)

---

## FileDriver.CreateLayer method (3 of 8)

Creates the layer and opens it for appending.

```csharp
public VectorLayer CreateLayer(string path, DriverOptions options)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | String | Path to the file. |
| options | DriverOptions | Driver-specific options. |

### Return Value

An instance of [`VectorLayer`](../../vectorlayer).

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | The path is `null`. |
| ArgumentException | Options object has an incorrect type for this driver. |
| [GisException](../../gisexception) | Error writing the feature to the file. |
| IOException | An I/O error occurred. |
| NotSupportedException | Driver can not create vector layers (see [`CanCreateLayers`](../cancreatelayers)). |

### See Also

* class [VectorLayer](../../vectorlayer)
* class [DriverOptions](../../driveroptions)
* class [FileDriver](../../filedriver)
* namespace [Aspose.Gis](../../filedriver)
* assembly [Aspose.GIS](../../../)

---

## FileDriver.CreateLayer method (4 of 8)

Creates the layer and opens it for appending.

```csharp
public VectorLayer CreateLayer(AbstractPath path, DriverOptions options)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | AbstractPath | Path to the file. |
| options | DriverOptions | Driver-specific options. |

### Return Value

An instance of [`VectorLayer`](../../vectorlayer).

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | The path is `null`. |
| ArgumentException | Options object has an incorrect type for this driver. |
| [GisException](../../gisexception) | Error writing the feature to the file. |
| IOException | An I/O error occurred. |
| NotSupportedException | Driver can not create vector layers (see [`CanCreateLayers`](../cancreatelayers)). |

### See Also

* class [VectorLayer](../../vectorlayer)
* class [AbstractPath](../../abstractpath)
* class [DriverOptions](../../driveroptions)
* class [FileDriver](../../filedriver)
* namespace [Aspose.Gis](../../filedriver)
* assembly [Aspose.GIS](../../../)

---

## FileDriver.CreateLayer method (5 of 8)

Creates the layer and opens it for appending.

```csharp
public VectorLayer CreateLayer(string path, SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | String | Path to the file. |
| spatialReferenceSystem | SpatialReferenceSystem | Spatial reference system. |

### Return Value

An instance of [`VectorLayer`](../../vectorlayer).

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | The path is `null`. |
| [GisException](../../gisexception) | Error writing the feature to the file. |
| IOException | An I/O error occurred. |
| NotSupportedException | Spatial reference system is not supported by the driver. Use [`SupportsSpatialReferenceSystem`](../supportsspatialreferencesystem) to check whether spatial reference system is supported. |

### See Also

* class [VectorLayer](../../vectorlayer)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem)
* class [FileDriver](../../filedriver)
* namespace [Aspose.Gis](../../filedriver)
* assembly [Aspose.GIS](../../../)

---

## FileDriver.CreateLayer method (6 of 8)

Creates the layer and opens it for appending.

```csharp
public VectorLayer CreateLayer(AbstractPath path, SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | AbstractPath | Path to the file. |
| spatialReferenceSystem | SpatialReferenceSystem | Spatial reference system. |

### Return Value

An instance of [`VectorLayer`](../../vectorlayer).

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | The path is `null`. |
| [GisException](../../gisexception) | Error writing the feature to the file. |
| IOException | An I/O error occurred. |
| NotSupportedException | Spatial reference system is not supported by the driver. Use [`SupportsSpatialReferenceSystem`](../supportsspatialreferencesystem) to check whether spatial reference system is supported. |

### See Also

* class [VectorLayer](../../vectorlayer)
* class [AbstractPath](../../abstractpath)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem)
* class [FileDriver](../../filedriver)
* namespace [Aspose.Gis](../../filedriver)
* assembly [Aspose.GIS](../../../)

---

## FileDriver.CreateLayer method (7 of 8)

Creates the layer and opens it for appending.

```csharp
public VectorLayer CreateLayer(string path, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | String | Path to the file. |
| options | DriverOptions | Driver-specific options. |
| spatialReferenceSystem | SpatialReferenceSystem | Spatial reference system. |

### Return Value

An instance of [`VectorLayer`](../../vectorlayer).

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | The path is `null`. |
| ArgumentException | Options object has an incorrect type for this driver. |
| [GisException](../../gisexception) | Error writing the feature to the file. |
| IOException | An I/O error occurred. |
| NotSupportedException | Spatial reference system is not supported by the driver. Use [`SupportsSpatialReferenceSystem`](../supportsspatialreferencesystem) to check whether spatial reference system is supported. |
| NotSupportedException | Driver can not create vector layers (see [`CanCreateLayers`](../cancreatelayers)). |

### See Also

* class [VectorLayer](../../vectorlayer)
* class [DriverOptions](../../driveroptions)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem)
* class [FileDriver](../../filedriver)
* namespace [Aspose.Gis](../../filedriver)
* assembly [Aspose.GIS](../../../)

---

## FileDriver.CreateLayer method (8 of 8)

Creates the layer and opens it for appending.

```csharp
public abstract VectorLayer CreateLayer(AbstractPath path, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | AbstractPath | Path to the file. |
| options | DriverOptions | Driver-specific options. |
| spatialReferenceSystem | SpatialReferenceSystem | Spatial reference system. |

### Return Value

An instance of [`VectorLayer`](../../vectorlayer).

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | The path is `null`. |
| ArgumentException | Options object has an incorrect type for this driver. |
| [GisException](../../gisexception) | Error writing the feature to the file. |
| IOException | An I/O error occurred. |
| NotSupportedException | Spatial reference system is not supported by the driver. Use [`SupportsSpatialReferenceSystem`](../supportsspatialreferencesystem) to check whether spatial reference system is supported. |
| NotSupportedException | Driver can not create vector layers (see [`CanCreateLayers`](../cancreatelayers)). |

### See Also

* class [VectorLayer](../../vectorlayer)
* class [AbstractPath](../../abstractpath)
* class [DriverOptions](../../driveroptions)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem)
* class [FileDriver](../../filedriver)
* namespace [Aspose.Gis](../../filedriver)
* assembly [Aspose.GIS](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
