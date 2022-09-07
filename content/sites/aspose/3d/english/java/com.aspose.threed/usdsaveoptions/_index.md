---
title: UsdSaveOptions
second_title: Aspose.3D for Java API Reference
description: Save options for USD/USDZ formats.
type: docs
weight: 180
url: /java/com.aspose.threed/usdsaveoptions/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.IOConfig](../../com.aspose.threed/ioconfig), [com.aspose.threed.SaveOptions](../../com.aspose.threed/saveoptions)
```
public class UsdSaveOptions extends SaveOptions
```

Save options for USD/USDZ formats.
## Constructors

| Constructor | Description |
| --- | --- |
| [UsdSaveOptions()](#UsdSaveOptions--) | Initialize a new com.aspose.threed.UsdSaveOptions with com.aspose.threed.FileFormat\#USD format |
| [UsdSaveOptions(FileFormat fileFormat)](#UsdSaveOptions-com.aspose.threed.FileFormat-) | Initialize a new com.aspose.threed.UsdSaveOptions with specified USD/USDZ format. |
## Methods

| Method | Description |
| --- | --- |
| [getPrimitiveToMesh()](#getPrimitiveToMesh--) | Convert the primitive entities to mesh during the export. |
| [setPrimitiveToMesh(boolean value)](#setPrimitiveToMesh-boolean-) | Convert the primitive entities to mesh during the export. |
| [getExportMetaData()](#getExportMetaData--) | Export node's properties through USD's customData field. |
| [setExportMetaData(boolean value)](#setExportMetaData-boolean-) | Export node's properties through USD's customData field. |
| [getMaterialConverter()](#getMaterialConverter--) | Custom converter to convert the geometry's material to PBR material If this is unassigned, USD exporter will automatically convert the standard material to PBR material. |
| [setMaterialConverter(MaterialConverter value)](#setMaterialConverter-com.aspose.threed.MaterialConverter-) | Custom converter to convert the geometry's material to PBR material If this is unassigned, USD exporter will automatically convert the standard material to PBR material. |
### UsdSaveOptions() {#UsdSaveOptions--}
```
public UsdSaveOptions()
```


Initialize a new com.aspose.threed.UsdSaveOptions with com.aspose.threed.FileFormat\#USD format

### UsdSaveOptions(FileFormat fileFormat) {#UsdSaveOptions-com.aspose.threed.FileFormat-}
```
public UsdSaveOptions(FileFormat fileFormat)
```


Initialize a new com.aspose.threed.UsdSaveOptions with specified USD/USDZ format.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fileFormat | [FileFormat](../../com.aspose.threed/fileformat) |  |

### getPrimitiveToMesh() {#getPrimitiveToMesh--}
```
public boolean getPrimitiveToMesh()
```


Convert the primitive entities to mesh during the export. Or directly encode the primitives to the output file(will use Aspose's extension definition for unofficial primitives like Dish, Torus) Default value is true.

**Returns:**
boolean
### setPrimitiveToMesh(boolean value) {#setPrimitiveToMesh-boolean-}
```
public void setPrimitiveToMesh(boolean value)
```


Convert the primitive entities to mesh during the export. Or directly encode the primitives to the output file(will use Aspose's extension definition for unofficial primitives like Dish, Torus) Default value is true.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### getExportMetaData() {#getExportMetaData--}
```
public boolean getExportMetaData()
```


Export node's properties through USD's customData field.

**Returns:**
boolean
### setExportMetaData(boolean value) {#setExportMetaData-boolean-}
```
public void setExportMetaData(boolean value)
```


Export node's properties through USD's customData field.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### getMaterialConverter() {#getMaterialConverter--}
```
public MaterialConverter getMaterialConverter()
```


Custom converter to convert the geometry's material to PBR material If this is unassigned, USD exporter will automatically convert the standard material to PBR material. Default value is null

**Returns:**
[MaterialConverter](../../com.aspose.threed/materialconverter)
### setMaterialConverter(MaterialConverter value) {#setMaterialConverter-com.aspose.threed.MaterialConverter-}
```
public void setMaterialConverter(MaterialConverter value)
```


Custom converter to convert the geometry's material to PBR material If this is unassigned, USD exporter will automatically convert the standard material to PBR material. Default value is null

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [MaterialConverter](../../com.aspose.threed/materialconverter) | New value |

