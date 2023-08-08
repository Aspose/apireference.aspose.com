---
title: Dataset.CreateLayer
second_title: Aspose.GIS for .NET API Reference
description: Dataset method. Creates a new vector layer and opens it for appending
type: docs
weight: 70
url: /net/aspose.gis/dataset/createlayer/
---
## CreateLayer() {#createlayer}

Creates a new vector layer and opens it for appending.

```csharp
public virtual VectorLayer CreateLayer()
```

### Return Value

A [`VectorLayer`](../../vectorlayer/) opened for writing.

### See Also

* class [VectorLayer](../../vectorlayer/)
* class [Dataset](../)
* namespace [Aspose.Gis](../../dataset/)
* assembly [Aspose.GIS](../../../)

---

## CreateLayer(SpatialReferenceSystem) {#createlayer_2}

Creates a new vector layer and opens it for appending.

```csharp
public virtual VectorLayer CreateLayer(SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Type | Description |
| --- | --- | --- |
| spatialReferenceSystem | SpatialReferenceSystem | Spatial reference system of the new layer. |

### Return Value

A [`VectorLayer`](../../vectorlayer/) opened for writing.

### See Also

* class [VectorLayer](../../vectorlayer/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [Dataset](../)
* namespace [Aspose.Gis](../../dataset/)
* assembly [Aspose.GIS](../../../)

---

## CreateLayer(DriverOptions, SpatialReferenceSystem) {#createlayer_1}

Creates a new vector layer and opens it for appending.

```csharp
public virtual VectorLayer CreateLayer(DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem = null)
```

| Parameter | Type | Description |
| --- | --- | --- |
| options | DriverOptions | Open options. |
| spatialReferenceSystem | SpatialReferenceSystem | Spatial reference system of the new layer. |

### Return Value

A [`VectorLayer`](../../vectorlayer/) opened for writing.

### Exceptions

| exception | condition |
| --- | --- |
| NotSupportedException | Layer creation is not supported for this dataset. |
| IOException | An I/O error occurred. |
| [GisException](../../gisexception/) | Error while creating the layer. |

### See Also

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [Dataset](../)
* namespace [Aspose.Gis](../../dataset/)
* assembly [Aspose.GIS](../../../)

---

## CreateLayer(string, SpatialReferenceSystem) {#createlayer_4}

Creates a new vector layer with specified name and opens it for appending.

```csharp
public virtual VectorLayer CreateLayer(string name, 
    SpatialReferenceSystem spatialReferenceSystem = null)
```

| Parameter | Type | Description |
| --- | --- | --- |
| name | String | Name of the layer. |
| spatialReferenceSystem | SpatialReferenceSystem | Spatial reference system of the new layer. |

### Return Value

A [`VectorLayer`](../../vectorlayer/) opened for writing.

### Exceptions

| exception | condition |
| --- | --- |
| NotSupportedException | Layer creation is not supported for this dataset. |
| IOException | An I/O error occurred. |
| [GisException](../../gisexception/) | Error while creating the layer. |

### See Also

* class [VectorLayer](../../vectorlayer/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [Dataset](../)
* namespace [Aspose.Gis](../../dataset/)
* assembly [Aspose.GIS](../../../)

---

## CreateLayer(string, DriverOptions, SpatialReferenceSystem) {#createlayer_3}

Creates a new vector layer with specified name and opens it for appending.

```csharp
public virtual VectorLayer CreateLayer(string name, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem = null)
```

| Parameter | Type | Description |
| --- | --- | --- |
| name | String | Name of the layer. |
| options | DriverOptions | Open options. |
| spatialReferenceSystem | SpatialReferenceSystem | Spatial reference system of the new layer. |

### Return Value

A [`VectorLayer`](../../vectorlayer/) opened for writing.

### Exceptions

| exception | condition |
| --- | --- |
| NotSupportedException | Layer creation is not supported for this dataset. |
| IOException | An I/O error occurred. |
| [GisException](../../gisexception/) | Error while creating the layer. |

### See Also

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [Dataset](../)
* namespace [Aspose.Gis](../../dataset/)
* assembly [Aspose.GIS](../../../)


