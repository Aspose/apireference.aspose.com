---
title: ShapefileDriver.EditLayer
second_title: Aspose.GIS for .NET API Reference
description: ShapefileDriver method. Opens a layer for editing.
type: docs
weight: 50
url: /net/aspose.gis.formats.shapefile/shapefiledriver/editlayer/
---
## EditLayer(AbstractPath, DriverOptions) {#editlayer}

Opens a layer for editing.

```csharp
public override VectorLayer EditLayer(AbstractPath path, DriverOptions options = null)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | AbstractPath | Path to the file. |
| options | DriverOptions | Driver-specific options. |

### Return Value

An instance of [`VectorLayer`](../../../aspose.gis/vectorlayer/).

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentException | Options object has an incorrect type for this driver. |
| ArgumentNullException | The path is `null`. |
| [GisException](../../../aspose.gis/gisexception/) | Error reading the feature from the file. |
| IOException | An I/O error occurred. |

### See Also

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [DriverOptions](../../../aspose.gis/driveroptions/)
* class [ShapefileDriver](../)
* namespace [Aspose.Gis.Formats.Shapefile](../../shapefiledriver/)
* assembly [Aspose.GIS](../../../)

---

## EditLayer(string, ShapefileOptions) {#editlayer_3}

Opens a layer for editing.

```csharp
public VectorLayer EditLayer(string path, ShapefileOptions options = null)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | String | Path to the file. |
| options | ShapefileOptions | Driver-specific options. |

### Return Value

An instance of [`VectorLayer`](../../../aspose.gis/vectorlayer/).

### See Also

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [ShapefileOptions](../../shapefileoptions/)
* class [ShapefileDriver](../)
* namespace [Aspose.Gis.Formats.Shapefile](../../shapefiledriver/)
* assembly [Aspose.GIS](../../../)

---

## EditLayer(AbstractPath, ShapefileOptions) {#editlayer_1}

Opens a layer for editing.

```csharp
public VectorLayer EditLayer(AbstractPath path, ShapefileOptions options = null)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | AbstractPath | Path to the file. |
| options | ShapefileOptions | Driver-specific options. |

### Return Value

An instance of [`VectorLayer`](../../../aspose.gis/vectorlayer/).

### See Also

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [ShapefileOptions](../../shapefileoptions/)
* class [ShapefileDriver](../)
* namespace [Aspose.Gis.Formats.Shapefile](../../shapefiledriver/)
* assembly [Aspose.GIS](../../../)


