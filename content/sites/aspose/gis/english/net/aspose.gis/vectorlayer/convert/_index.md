---
title: VectorLayer.Convert
second_title: Aspose.GIS for .NET API Reference
description: VectorLayer method. Convert a layer to a different format
type: docs
weight: 220
url: /net/aspose.gis/vectorlayer/convert/
---
## Convert(string, FileDriver, string, FileDriver) {#convert_2}

Convert a layer to a different format.

```csharp
public static void Convert(string sourcePath, FileDriver sourceDriver, string destinationPath, 
    FileDriver destinationDriver)
```

| Parameter | Type | Description |
| --- | --- | --- |
| sourcePath | String | Path to the layer that will be converted. |
| sourceDriver | FileDriver | The format driver for the source layer. |
| destinationPath | String | Path to the layer that will created as a result of conversion. |
| destinationDriver | FileDriver | The format driver for the destination layer. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Either of paths is `null`. |

### See Also

* class [FileDriver](../../filedriver/)
* class [VectorLayer](../)
* namespace [Aspose.Gis](../../vectorlayer/)
* assembly [Aspose.GIS](../../../)

---

## Convert(AbstractPath, FileDriver, AbstractPath, FileDriver) {#convert}

Convert a layer to a different format.

```csharp
public static void Convert(AbstractPath sourcePath, FileDriver sourceDriver, 
    AbstractPath destinationPath, FileDriver destinationDriver)
```

| Parameter | Type | Description |
| --- | --- | --- |
| sourcePath | AbstractPath | Path to the layer that will be converted. |
| sourceDriver | FileDriver | The format driver for the source layer. |
| destinationPath | AbstractPath | Path to the layer that will created as a result of conversion. |
| destinationDriver | FileDriver | The format driver for the destination layer. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Either of paths is `null`. |

### See Also

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [VectorLayer](../)
* namespace [Aspose.Gis](../../vectorlayer/)
* assembly [Aspose.GIS](../../../)

---

## Convert(string, FileDriver, string, FileDriver, ConversionOptions) {#convert_3}

Convert a layer to a different format.

```csharp
public static void Convert(string sourcePath, FileDriver sourceDriver, string destinationPath, 
    FileDriver destinationDriver, ConversionOptions options)
```

| Parameter | Type | Description |
| --- | --- | --- |
| sourcePath | String | Path to the layer that will be converted. |
| sourceDriver | FileDriver | The format driver for the source layer. |
| destinationPath | String | Path to the layer that will created as a result of conversion. |
| destinationDriver | FileDriver | The format driver for the destination layer. |
| options | ConversionOptions | Options for the conversion procedure. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Either of paths is `null`. |
| ArgumentException | Options object has an incorrect type for this driver. |
| [GisException](../../gisexception/) | Error reading or writing the feature to/from the file. |
| IOException | An I/O error occurred. |
| NotSupportedException | Spatial reference system specified in *options* is not supported by *destinationDriver*. |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | Transformation of features geometry from source spatial reference system to target spatial reference system failed. |

### See Also

* class [FileDriver](../../filedriver/)
* class [ConversionOptions](../../conversionoptions/)
* class [VectorLayer](../)
* namespace [Aspose.Gis](../../vectorlayer/)
* assembly [Aspose.GIS](../../../)

---

## Convert(AbstractPath, FileDriver, AbstractPath, FileDriver, ConversionOptions) {#convert_1}

Convert a layer to a different format.

```csharp
public static void Convert(AbstractPath sourcePath, FileDriver sourceDriver, 
    AbstractPath destinationPath, FileDriver destinationDriver, ConversionOptions options)
```

| Parameter | Type | Description |
| --- | --- | --- |
| sourcePath | AbstractPath | Path to the layer that will be converted. |
| sourceDriver | FileDriver | The format driver for the source layer. |
| destinationPath | AbstractPath | Path to the layer that will created as a result of conversion. |
| destinationDriver | FileDriver | The format driver for the destination layer. |
| options | ConversionOptions | Options for the conversion procedure. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Either of paths is `null`. |
| ArgumentException | Options object has an incorrect type for this driver. |
| [GisException](../../gisexception/) | Error reading or writing the feature to/from the file. |
| IOException | An I/O error occurred. |
| NotSupportedException | Spatial reference system specified in *options* is not supported by *destinationDriver*. |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | Transformation of features geometry from source spatial reference system to target spatial reference system failed. |

### See Also

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [ConversionOptions](../../conversionoptions/)
* class [VectorLayer](../)
* namespace [Aspose.Gis](../../vectorlayer/)
* assembly [Aspose.GIS](../../../)


