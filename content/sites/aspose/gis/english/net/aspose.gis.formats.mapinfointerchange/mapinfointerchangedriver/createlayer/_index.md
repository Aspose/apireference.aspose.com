---
title: MapInfoInterchangeDriver.CreateLayer
second_title: Aspose.GIS for .NET API Reference
description: MapInfoInterchangeDriver method. Creates a layer and opens it for adding new features
type: docs
weight: 40
url: /net/aspose.gis.formats.mapinfointerchange/mapinfointerchangedriver/createlayer/
---
## CreateLayer(string, MapInfoInterchangeOptions) {#createlayer_7}

Creates a layer and opens it for adding new features.

```csharp
public VectorLayer CreateLayer(string path, MapInfoInterchangeOptions options)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | String | Path to the file. |
| options | MapInfoInterchangeOptions | Driver-specific options. |

### Return Value

An instance of [`VectorLayer`](../../../aspose.gis/vectorlayer/).

### Exceptions

| exception | condition |
| --- | --- |
| InvalidOperationException | The layer already exists. |

### See Also

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [MapInfoInterchangeOptions](../../mapinfointerchangeoptions/)
* class [MapInfoInterchangeDriver](../)
* namespace [Aspose.Gis.Formats.MapInfoInterchange](../../mapinfointerchangedriver/)
* assembly [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, DriverOptions, SpatialReferenceSystem) {#createlayer_2}

Creates a layer and opens it for adding new features.

```csharp
public override VectorLayer CreateLayer(AbstractPath path, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | AbstractPath | Path to the file. |
| options | DriverOptions | Driver-specific options. |
| spatialReferenceSystem | SpatialReferenceSystem | Spatial reference system. |

### Return Value

An instance of [`VectorLayer`](../../../aspose.gis/vectorlayer/).

### Exceptions

| exception | condition |
| --- | --- |
| InvalidOperationException | The layer already exists. |

### See Also

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [DriverOptions](../../../aspose.gis/driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [MapInfoInterchangeDriver](../)
* namespace [Aspose.Gis.Formats.MapInfoInterchange](../../mapinfointerchangedriver/)
* assembly [Aspose.GIS](../../../)

---

## CreateLayer(string, MapInfoInterchangeOptions, SpatialReferenceSystem) {#createlayer_8}

Creates a layer and opens it for adding new features.

```csharp
public VectorLayer CreateLayer(string path, MapInfoInterchangeOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | String | Path to the file. |
| options | MapInfoInterchangeOptions | Driver-specific options. |
| spatialReferenceSystem | SpatialReferenceSystem | Spatial reference system. |

### Return Value

An instance of [`VectorLayer`](../../../aspose.gis/vectorlayer/).

### Exceptions

| exception | condition |
| --- | --- |
| InvalidOperationException | The layer already exists. |
| NotSupportedException | Spatial reference system is not supported by the driver. |

### See Also

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [MapInfoInterchangeOptions](../../mapinfointerchangeoptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [MapInfoInterchangeDriver](../)
* namespace [Aspose.Gis.Formats.MapInfoInterchange](../../mapinfointerchangedriver/)
* assembly [Aspose.GIS](../../../)


