﻿---
title: XlsbSaveOptions
second_title: Aspose.Cells for Node.js via C++ API Reference
description: Represents the options for saving xlsb file.
type: docs
url: /nodejs-cpp/xlsbsaveoptions/
---

## XlsbSaveOptions class

Represents the options for saving xlsb file.

```javascript
class XlsbSaveOptions extends SaveOptions;
```


## Constructors

| Constructor | Description |
| --- | --- |
| [constructor()](#constructor--)| Creates xlsb file save options. |
| [constructor(SaveOptions)](#constructor-saveoptions-)| Constructs from a parent object convertible to this. |

## Properties

| Property | Type | Description |
| --- | --- | --- |
| [compressionType](#compressionType--)| OoxmlCompressionType | Gets and sets the compression type for ooxml file. |
| [exportAllColumnIndexes](#exportAllColumnIndexes--)| boolean | Indicates whether exporting all column indexes for cells. |
| [lightCellsDataProvider](#lightCellsDataProvider--)| LightCellsDataProvider | The data provider for saving workbook in light mode. |
| [saveFormat](#saveFormat--)| SaveFormat | Readonly. Gets the save file format. |
| [clearData](#clearData--)| boolean | Make the workbook empty after saving the file. |
| [cachedFileFolder](#cachedFileFolder--)| string | The folder for temporary files that may be used as data cache. |
| [validateMergedAreas](#validateMergedAreas--)| boolean | Indicates whether validate merged cells before saving the file. |
| [mergeAreas](#mergeAreas--)| boolean | Indicates whether merge the areas of conditional formatting and validation before saving the file. |
| [createDirectory](#createDirectory--)| boolean | If true and the directory does not exist, the directory will be automatically created before saving the file. |
| [sortNames](#sortNames--)| boolean | Indicates whether sorting defined names before saving file. |
| [sortExternalNames](#sortExternalNames--)| boolean | Indicates whether sorting external defined names before saving file. |
| [refreshChartCache](#refreshChartCache--)| boolean | Indicates whether refreshing chart cache data |
| [warningCallback](#warningCallback--)| IWarningCallback | Gets or sets warning callback. |
| [checkExcelRestriction](#checkExcelRestriction--)| boolean | Whether check restriction of excel file when user modify cells related objects. For example, excel does not allow inputting string value longer than 32K. When you input a value longer than 32K, it will be truncated. |
| [updateSmartArt](#updateSmartArt--)| boolean | Indicates whether updating smart art setting. The default value is false. |
| [encryptDocumentProperties](#encryptDocumentProperties--)| boolean | Indicates whether encrypt document properties when saving as .xls file. The default value is true. |

## Methods

| Method | Description |
| --- | --- |
| [getCompressionType()](#getCompressionType--)| <b>@deprecated.</b> Please use the 'compressionType' property instead. Gets and sets the compression type for ooxml file. |
| [setCompressionType(OoxmlCompressionType)](#setCompressionType-ooxmlcompressiontype-)| <b>@deprecated.</b> Please use the 'compressionType' property instead. Gets and sets the compression type for ooxml file. |
| [getExportAllColumnIndexes()](#getExportAllColumnIndexes--)| <b>@deprecated.</b> Please use the 'exportAllColumnIndexes' property instead. Indicates whether exporting all column indexes for cells. |
| [setExportAllColumnIndexes(boolean)](#setExportAllColumnIndexes-boolean-)| <b>@deprecated.</b> Please use the 'exportAllColumnIndexes' property instead. Indicates whether exporting all column indexes for cells. |
| [getLightCellsDataProvider()](#getLightCellsDataProvider--)| <b>@deprecated.</b> Please use the 'lightCellsDataProvider' property instead. The data provider for saving workbook in light mode. |
| [setLightCellsDataProvider(LightCellsDataProvider)](#setLightCellsDataProvider-lightcellsdataprovider-)| <b>@deprecated.</b> Please use the 'lightCellsDataProvider' property instead. The data provider for saving workbook in light mode. |
| [isNull()](#isNull--)| Checks whether the implementation object is null. |
| [getSaveFormat()](#getSaveFormat--)| <b>@deprecated.</b> Please use the 'saveFormat' property instead. Gets the save file format. |
| [getClearData()](#getClearData--)| <b>@deprecated.</b> Please use the 'clearData' property instead. Make the workbook empty after saving the file. |
| [setClearData(boolean)](#setClearData-boolean-)| <b>@deprecated.</b> Please use the 'clearData' property instead. Make the workbook empty after saving the file. |
| [getCachedFileFolder()](#getCachedFileFolder--)| <b>@deprecated.</b> Please use the 'cachedFileFolder' property instead. The folder for temporary files that may be used as data cache. |
| [setCachedFileFolder(string)](#setCachedFileFolder-string-)| <b>@deprecated.</b> Please use the 'cachedFileFolder' property instead. The folder for temporary files that may be used as data cache. |
| [getValidateMergedAreas()](#getValidateMergedAreas--)| <b>@deprecated.</b> Please use the 'validateMergedAreas' property instead. Indicates whether validate merged cells before saving the file. |
| [setValidateMergedAreas(boolean)](#setValidateMergedAreas-boolean-)| <b>@deprecated.</b> Please use the 'validateMergedAreas' property instead. Indicates whether validate merged cells before saving the file. |
| [getMergeAreas()](#getMergeAreas--)| <b>@deprecated.</b> Please use the 'mergeAreas' property instead. Indicates whether merge the areas of conditional formatting and validation before saving the file. |
| [setMergeAreas(boolean)](#setMergeAreas-boolean-)| <b>@deprecated.</b> Please use the 'mergeAreas' property instead. Indicates whether merge the areas of conditional formatting and validation before saving the file. |
| [getCreateDirectory()](#getCreateDirectory--)| <b>@deprecated.</b> Please use the 'createDirectory' property instead. If true and the directory does not exist, the directory will be automatically created before saving the file. |
| [setCreateDirectory(boolean)](#setCreateDirectory-boolean-)| <b>@deprecated.</b> Please use the 'createDirectory' property instead. If true and the directory does not exist, the directory will be automatically created before saving the file. |
| [getSortNames()](#getSortNames--)| <b>@deprecated.</b> Please use the 'sortNames' property instead. Indicates whether sorting defined names before saving file. |
| [setSortNames(boolean)](#setSortNames-boolean-)| <b>@deprecated.</b> Please use the 'sortNames' property instead. Indicates whether sorting defined names before saving file. |
| [getSortExternalNames()](#getSortExternalNames--)| <b>@deprecated.</b> Please use the 'sortExternalNames' property instead. Indicates whether sorting external defined names before saving file. |
| [setSortExternalNames(boolean)](#setSortExternalNames-boolean-)| <b>@deprecated.</b> Please use the 'sortExternalNames' property instead. Indicates whether sorting external defined names before saving file. |
| [getRefreshChartCache()](#getRefreshChartCache--)| <b>@deprecated.</b> Please use the 'refreshChartCache' property instead. Indicates whether refreshing chart cache data |
| [setRefreshChartCache(boolean)](#setRefreshChartCache-boolean-)| <b>@deprecated.</b> Please use the 'refreshChartCache' property instead. Indicates whether refreshing chart cache data |
| [setWarningCallback(IWarningCallback)](#setWarningCallback-iwarningcallback-)| <b>@deprecated.</b> Please use the 'warningCallback' property instead. Gets or sets warning callback. |
| [getWarningCallback()](#getWarningCallback--)| <b>@deprecated.</b> Please use the 'warningCallback' property instead. Gets or sets warning callback. |
| [getCheckExcelRestriction()](#getCheckExcelRestriction--)| <b>@deprecated.</b> Please use the 'checkExcelRestriction' property instead. Whether check restriction of excel file when user modify cells related objects. For example, excel does not allow inputting string value longer than 32K. When you input a value longer than 32K, it will be truncated. |
| [setCheckExcelRestriction(boolean)](#setCheckExcelRestriction-boolean-)| <b>@deprecated.</b> Please use the 'checkExcelRestriction' property instead. Whether check restriction of excel file when user modify cells related objects. For example, excel does not allow inputting string value longer than 32K. When you input a value longer than 32K, it will be truncated. |
| [getUpdateSmartArt()](#getUpdateSmartArt--)| <b>@deprecated.</b> Please use the 'updateSmartArt' property instead. Indicates whether updating smart art setting. The default value is false. |
| [setUpdateSmartArt(boolean)](#setUpdateSmartArt-boolean-)| <b>@deprecated.</b> Please use the 'updateSmartArt' property instead. Indicates whether updating smart art setting. The default value is false. |
| [getEncryptDocumentProperties()](#getEncryptDocumentProperties--)| <b>@deprecated.</b> Please use the 'encryptDocumentProperties' property instead. Indicates whether encrypt document properties when saving as .xls file. The default value is true. |
| [setEncryptDocumentProperties(boolean)](#setEncryptDocumentProperties-boolean-)| <b>@deprecated.</b> Please use the 'encryptDocumentProperties' property instead. Indicates whether encrypt document properties when saving as .xls file. The default value is true. |


### constructor() {#constructor--}

Creates xlsb file save options.

```javascript
constructor();
```


### constructor(SaveOptions) {#constructor-saveoptions-}

Constructs from a parent object convertible to this.

```javascript
constructor(obj: SaveOptions);
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| obj | SaveOptions | The parent object. |

### compressionType {#compressionType--}

Gets and sets the compression type for ooxml file.

```javascript
compressionType : OoxmlCompressionType;
```


**Remarks**

The default value is OoxmlCompressionType.Level6.

### exportAllColumnIndexes {#exportAllColumnIndexes--}

Indicates whether exporting all column indexes for cells.

```javascript
exportAllColumnIndexes : boolean;
```


**Remarks**

The default value is true.

### lightCellsDataProvider {#lightCellsDataProvider--}

The data provider for saving workbook in light mode.

```javascript
lightCellsDataProvider : LightCellsDataProvider;
```


### saveFormat {#saveFormat--}

Readonly. Gets the save file format.

```javascript
saveFormat : SaveFormat;
```


### clearData {#clearData--}

Make the workbook empty after saving the file.

```javascript
clearData : boolean;
```


### cachedFileFolder {#cachedFileFolder--}

The folder for temporary files that may be used as data cache.

```javascript
cachedFileFolder : string;
```


**Remarks**

If the folder has not been specified, the default value for it is [CellsHelper.GetCacheFolder()](../cellshelper.getcachefolder()/). If its default value is null or empty, or has been specified as null or empty, then no cache file will be used when saving the workbook.

### validateMergedAreas {#validateMergedAreas--}

Indicates whether validate merged cells before saving the file.

```javascript
validateMergedAreas : boolean;
```


**Remarks**

The default value is false.

### mergeAreas {#mergeAreas--}

Indicates whether merge the areas of conditional formatting and validation before saving the file.

```javascript
mergeAreas : boolean;
```


**Remarks**

The default value is false.

### createDirectory {#createDirectory--}

If true and the directory does not exist, the directory will be automatically created before saving the file.

```javascript
createDirectory : boolean;
```


**Remarks**

The default value is false.

### sortNames {#sortNames--}

Indicates whether sorting defined names before saving file.

```javascript
sortNames : boolean;
```


### sortExternalNames {#sortExternalNames--}

Indicates whether sorting external defined names before saving file.

```javascript
sortExternalNames : boolean;
```


### refreshChartCache {#refreshChartCache--}

Indicates whether refreshing chart cache data

```javascript
refreshChartCache : boolean;
```


### warningCallback {#warningCallback--}

Gets or sets warning callback.

```javascript
warningCallback : IWarningCallback;
```


### checkExcelRestriction {#checkExcelRestriction--}

Whether check restriction of excel file when user modify cells related objects. For example, excel does not allow inputting string value longer than 32K. When you input a value longer than 32K, it will be truncated.

```javascript
checkExcelRestriction : boolean;
```


### updateSmartArt {#updateSmartArt--}

Indicates whether updating smart art setting. The default value is false.

```javascript
updateSmartArt : boolean;
```


**Remarks**

Only effects after calling Shape.GetResultOfSmartArt() method and the cached shapes exist in the template file.

### encryptDocumentProperties {#encryptDocumentProperties--}

Indicates whether encrypt document properties when saving as .xls file. The default value is true.

```javascript
encryptDocumentProperties : boolean;
```


**Remarks**

Only for .xls,xlsx,xlsb and xlsm file.

### getCompressionType() {#getCompressionType--}

<b>@deprecated.</b> Please use the 'compressionType' property instead. Gets and sets the compression type for ooxml file.

```javascript
getCompressionType() : OoxmlCompressionType;
```


**Returns**

[OoxmlCompressionType](../ooxmlcompressiontype/)

**Remarks**

The default value is OoxmlCompressionType.Level6.

### setCompressionType(OoxmlCompressionType) {#setCompressionType-ooxmlcompressiontype-}

<b>@deprecated.</b> Please use the 'compressionType' property instead. Gets and sets the compression type for ooxml file.

```javascript
setCompressionType(value: OoxmlCompressionType) : void;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [OoxmlCompressionType](../ooxmlcompressiontype/) | The value to set. |

**Remarks**

The default value is OoxmlCompressionType.Level6.

### getExportAllColumnIndexes() {#getExportAllColumnIndexes--}

<b>@deprecated.</b> Please use the 'exportAllColumnIndexes' property instead. Indicates whether exporting all column indexes for cells.

```javascript
getExportAllColumnIndexes() : boolean;
```


**Remarks**

The default value is true.

### setExportAllColumnIndexes(boolean) {#setExportAllColumnIndexes-boolean-}

<b>@deprecated.</b> Please use the 'exportAllColumnIndexes' property instead. Indicates whether exporting all column indexes for cells.

```javascript
setExportAllColumnIndexes(value: boolean) : void;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | The value to set. |

**Remarks**

The default value is true.

### getLightCellsDataProvider() {#getLightCellsDataProvider--}

<b>@deprecated.</b> Please use the 'lightCellsDataProvider' property instead. The data provider for saving workbook in light mode.

```javascript
getLightCellsDataProvider() : LightCellsDataProvider;
```


**Returns**

[LightCellsDataProvider](../lightcellsdataprovider/)

### setLightCellsDataProvider(LightCellsDataProvider) {#setLightCellsDataProvider-lightcellsdataprovider-}

<b>@deprecated.</b> Please use the 'lightCellsDataProvider' property instead. The data provider for saving workbook in light mode.

```javascript
setLightCellsDataProvider(value: LightCellsDataProvider) : void;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [LightCellsDataProvider](../lightcellsdataprovider/) | The value to set. |

### isNull() {#isNull--}

Checks whether the implementation object is null.

```javascript
isNull() : boolean;
```


### getSaveFormat() {#getSaveFormat--}

<b>@deprecated.</b> Please use the 'saveFormat' property instead. Gets the save file format.

```javascript
getSaveFormat() : SaveFormat;
```


**Returns**

[SaveFormat](../saveformat/)

### getClearData() {#getClearData--}

<b>@deprecated.</b> Please use the 'clearData' property instead. Make the workbook empty after saving the file.

```javascript
getClearData() : boolean;
```


### setClearData(boolean) {#setClearData-boolean-}

<b>@deprecated.</b> Please use the 'clearData' property instead. Make the workbook empty after saving the file.

```javascript
setClearData(value: boolean) : void;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | The value to set. |

### getCachedFileFolder() {#getCachedFileFolder--}

<b>@deprecated.</b> Please use the 'cachedFileFolder' property instead. The folder for temporary files that may be used as data cache.

```javascript
getCachedFileFolder() : string;
```


**Remarks**

If the folder has not been specified, the default value for it is [CellsHelper.GetCacheFolder()](../cellshelper.getcachefolder()/). If its default value is null or empty, or has been specified as null or empty, then no cache file will be used when saving the workbook.

### setCachedFileFolder(string) {#setCachedFileFolder-string-}

<b>@deprecated.</b> Please use the 'cachedFileFolder' property instead. The folder for temporary files that may be used as data cache.

```javascript
setCachedFileFolder(value: string) : void;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | string | The value to set. |

**Remarks**

If the folder has not been specified, the default value for it is [CellsHelper.GetCacheFolder()](../cellshelper.getcachefolder()/). If its default value is null or empty, or has been specified as null or empty, then no cache file will be used when saving the workbook.

### getValidateMergedAreas() {#getValidateMergedAreas--}

<b>@deprecated.</b> Please use the 'validateMergedAreas' property instead. Indicates whether validate merged cells before saving the file.

```javascript
getValidateMergedAreas() : boolean;
```


**Remarks**

The default value is false.

### setValidateMergedAreas(boolean) {#setValidateMergedAreas-boolean-}

<b>@deprecated.</b> Please use the 'validateMergedAreas' property instead. Indicates whether validate merged cells before saving the file.

```javascript
setValidateMergedAreas(value: boolean) : void;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | The value to set. |

**Remarks**

The default value is false.

### getMergeAreas() {#getMergeAreas--}

<b>@deprecated.</b> Please use the 'mergeAreas' property instead. Indicates whether merge the areas of conditional formatting and validation before saving the file.

```javascript
getMergeAreas() : boolean;
```


**Remarks**

The default value is false.

### setMergeAreas(boolean) {#setMergeAreas-boolean-}

<b>@deprecated.</b> Please use the 'mergeAreas' property instead. Indicates whether merge the areas of conditional formatting and validation before saving the file.

```javascript
setMergeAreas(value: boolean) : void;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | The value to set. |

**Remarks**

The default value is false.

### getCreateDirectory() {#getCreateDirectory--}

<b>@deprecated.</b> Please use the 'createDirectory' property instead. If true and the directory does not exist, the directory will be automatically created before saving the file.

```javascript
getCreateDirectory() : boolean;
```


**Remarks**

The default value is false.

### setCreateDirectory(boolean) {#setCreateDirectory-boolean-}

<b>@deprecated.</b> Please use the 'createDirectory' property instead. If true and the directory does not exist, the directory will be automatically created before saving the file.

```javascript
setCreateDirectory(value: boolean) : void;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | The value to set. |

**Remarks**

The default value is false.

### getSortNames() {#getSortNames--}

<b>@deprecated.</b> Please use the 'sortNames' property instead. Indicates whether sorting defined names before saving file.

```javascript
getSortNames() : boolean;
```


### setSortNames(boolean) {#setSortNames-boolean-}

<b>@deprecated.</b> Please use the 'sortNames' property instead. Indicates whether sorting defined names before saving file.

```javascript
setSortNames(value: boolean) : void;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | The value to set. |

### getSortExternalNames() {#getSortExternalNames--}

<b>@deprecated.</b> Please use the 'sortExternalNames' property instead. Indicates whether sorting external defined names before saving file.

```javascript
getSortExternalNames() : boolean;
```


### setSortExternalNames(boolean) {#setSortExternalNames-boolean-}

<b>@deprecated.</b> Please use the 'sortExternalNames' property instead. Indicates whether sorting external defined names before saving file.

```javascript
setSortExternalNames(value: boolean) : void;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | The value to set. |

### getRefreshChartCache() {#getRefreshChartCache--}

<b>@deprecated.</b> Please use the 'refreshChartCache' property instead. Indicates whether refreshing chart cache data

```javascript
getRefreshChartCache() : boolean;
```


### setRefreshChartCache(boolean) {#setRefreshChartCache-boolean-}

<b>@deprecated.</b> Please use the 'refreshChartCache' property instead. Indicates whether refreshing chart cache data

```javascript
setRefreshChartCache(value: boolean) : void;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | The value to set. |

### setWarningCallback(IWarningCallback) {#setWarningCallback-iwarningcallback-}

<b>@deprecated.</b> Please use the 'warningCallback' property instead. Gets or sets warning callback.

```javascript
setWarningCallback(value: IWarningCallback) : void;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [IWarningCallback](../iwarningcallback/) | The value to set. |

### getWarningCallback() {#getWarningCallback--}

<b>@deprecated.</b> Please use the 'warningCallback' property instead. Gets or sets warning callback.

```javascript
getWarningCallback() : IWarningCallback;
```


**Returns**

[IWarningCallback](../iwarningcallback/)

### getCheckExcelRestriction() {#getCheckExcelRestriction--}

<b>@deprecated.</b> Please use the 'checkExcelRestriction' property instead. Whether check restriction of excel file when user modify cells related objects. For example, excel does not allow inputting string value longer than 32K. When you input a value longer than 32K, it will be truncated.

```javascript
getCheckExcelRestriction() : boolean;
```


### setCheckExcelRestriction(boolean) {#setCheckExcelRestriction-boolean-}

<b>@deprecated.</b> Please use the 'checkExcelRestriction' property instead. Whether check restriction of excel file when user modify cells related objects. For example, excel does not allow inputting string value longer than 32K. When you input a value longer than 32K, it will be truncated.

```javascript
setCheckExcelRestriction(value: boolean) : void;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | The value to set. |

### getUpdateSmartArt() {#getUpdateSmartArt--}

<b>@deprecated.</b> Please use the 'updateSmartArt' property instead. Indicates whether updating smart art setting. The default value is false.

```javascript
getUpdateSmartArt() : boolean;
```


**Remarks**

Only effects after calling Shape.GetResultOfSmartArt() method and the cached shapes exist in the template file.

### setUpdateSmartArt(boolean) {#setUpdateSmartArt-boolean-}

<b>@deprecated.</b> Please use the 'updateSmartArt' property instead. Indicates whether updating smart art setting. The default value is false.

```javascript
setUpdateSmartArt(value: boolean) : void;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | The value to set. |

**Remarks**

Only effects after calling Shape.GetResultOfSmartArt() method and the cached shapes exist in the template file.

### getEncryptDocumentProperties() {#getEncryptDocumentProperties--}

<b>@deprecated.</b> Please use the 'encryptDocumentProperties' property instead. Indicates whether encrypt document properties when saving as .xls file. The default value is true.

```javascript
getEncryptDocumentProperties() : boolean;
```


**Remarks**

Only for .xls,xlsx,xlsb and xlsm file.

### setEncryptDocumentProperties(boolean) {#setEncryptDocumentProperties-boolean-}

<b>@deprecated.</b> Please use the 'encryptDocumentProperties' property instead. Indicates whether encrypt document properties when saving as .xls file. The default value is true.

```javascript
setEncryptDocumentProperties(value: boolean) : void;
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | The value to set. |

**Remarks**

Only for .xls,xlsx,xlsb and xlsm file.


