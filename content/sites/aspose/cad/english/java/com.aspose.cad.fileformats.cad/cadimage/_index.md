---
title: "CadImage"
linktitle: "CadImage"
second_title: "Aspose.CAD for Java"
description: "Cad image class"
type: docs
weight: 10
url: /java/com.aspose.cad.fileformats.cad/cadimage/
---

**Inheritance:** java.lang.Object, Image

Cad image class

## Constructors

| Constructor | Description |
| --- | --- |
| [CadImage()](#CadImage) | Initializes a new instance of the CadImage class. |

## Methods

| Method | Description |
| --- | --- |
| [getPreviewByteData()](#getPreviewByteData) | Gets or sets the preview byte data. |
| [setPreviewByteData(byte[] value)](#setPreviewByteData-byte:A) | Gets or sets the preview byte data. |
| [getAppInfoHistoryByteData()](#getAppInfoHistoryByteData) | Gets or sets the app info history byte data. |
| [setAppInfoHistoryByteData(byte[] value)](#setAppInfoHistoryByteData-byte:A) | Gets or sets the app info history byte data. |
| [getAppInfoByteData()](#getAppInfoByteData) | Gets or sets the app info byte data. |
| [setAppInfoByteData(byte[] value)](#setAppInfoByteData-byte:A) | Gets or sets the app info byte data. |
| [getRevHistoryByteData()](#getRevHistoryByteData) | Gets or sets the revHistory byte data. |
| [setRevHistoryByteData(byte[] value)](#setRevHistoryByteData-byte:A) | Gets or sets the revHistory byte data. |
| [getObjFreeSpaceByteData()](#getObjFreeSpaceByteData) | Gets or sets the obj free space byte data. |
| [setObjFreeSpaceByteData(byte[] value)](#setObjFreeSpaceByteData-byte:A) | Gets or sets the obj free space byte data. |
| [getTemplateByteData()](#getTemplateByteData) | Gets or sets the template byte data. |
| [setTemplateByteData(byte[] value)](#setTemplateByteData-byte:A) | Gets or sets the template byte data. |
| [getAuxHeaderByteData()](#getAuxHeaderByteData) | Gets or sets the aux header byte data. |
| [setAuxHeaderByteData(byte[] value)](#setAuxHeaderByteData-byte:A) | Gets or sets the aux header byte data. |
| [getHeaderByteData()](#getHeaderByteData) | Gets or sets the header byte data. |
| [setHeaderByteData(byte[] value)](#setHeaderByteData-byte:A) | Gets or sets the header byte data. |
| [getFileDepByteData()](#getFileDepByteData) | Gets or sets the fileDep byte data. |
| [setFileDepByteData(byte[] value)](#setFileDepByteData-byte:A) | Gets or sets the fileDep byte data. |
| [getClassesByteData()](#getClassesByteData) | Gets or sets the classes byte data. |
| [setClassesByteData(byte[] value)](#setClassesByteData-byte:A) | Gets or sets the classes byte data. |
| [getAcDsPrototypeByteData()](#getAcDsPrototypeByteData) | Gets or sets the acDsPrototype byte data. |
| [setAcDsPrototypeByteData(byte[] value)](#setAcDsPrototypeByteData-byte:A) | Gets or sets the acDsPrototype byte data. |
| [getActivePage()](#getActivePage) | Gets the active page. |
| [getDefaultLineWeight()](#getDefaultLineWeight) | Gets or sets the default line weight. |
| [setDefaultLineWeight(float value)](#setDefaultLineWeight-float) | Gets or sets the default line weight. |
| [getDefaultFont()](#getDefaultFont) | Gets or sets the default font. |
| [setDefaultFont(String value)](#setDefaultFont-java.lang.String) | Gets or sets the default font. |
| [getFileEncoding()](#getFileEncoding) | Gets file's encoding |
| [setFileEncoding(int value)](#setFileEncoding-int) | Gets file's encoding |
| [getApplicationVersion()](#getApplicationVersion) | Gets or sets the application version. Value: The application version. |
| [setApplicationVersion(int value)](#setApplicationVersion-int) | Gets or sets the application version. Value: The application version. |
| [getMaintenanceVersion()](#getMaintenanceVersion) | Gets or sets the maintenance version. Value: The maintenance version. |
| [setMaintenanceVersion(int value)](#setMaintenanceVersion-int) | Gets or sets the maintenance version. Value: The maintenance version. |
| [getSpecifiedEncoding()](#getSpecifiedEncoding) | Gets or sets the specified encoding. |
| [setSpecifiedEncoding(int value)](#setSpecifiedEncoding-int) | Gets or sets the specified encoding. |
| [getSpecifiedMifEncoding()](#getSpecifiedMifEncoding) | Gets or sets the specified MIF character encoding |
| [setSpecifiedMifEncoding(int value)](#setSpecifiedMifEncoding-int) | Gets or sets the specified MIF character encoding |
| [getLineTypes()](#getLineTypes) | Gets or sets the dimension styles. |
| [setLineTypes(CadLineTypesDictionary value)](#setLineTypes-com.aspose.cad.fileformats.cad.CadLineTypesDictionary) | Gets or sets the dimension styles. |
| [getBlockEntities()](#getBlockEntities) | Gets or sets the block entities. |
| [setBlockEntities(CadBlockDictionary value)](#setBlockEntities-com.aspose.cad.fileformats.cad.CadBlockDictionary) | Gets or sets the block entities. |
| [getClassEntities()](#getClassEntities) | Gets or sets the class entities. |
| [setClassEntities(CadClassList value)](#setClassEntities-com.aspose.cad.fileformats.cad.CadClassList) | Gets or sets the class entities. |
| [getThumbnailImage()](#getThumbnailImage) | Gets or sets the thumbnail image. |
| [setThumbnailImage(CadThumbnailImage value)](#setThumbnailImage-com.aspose.cad.fileformats.cad.cadobjects.CadThumbnailImage) | Gets or sets the thumbnail image. |
| [getBlocksTables()](#getBlocksTables) | Gets or sets the blocks tables. |
| [setBlocksTables(CadBlockRecordList value)](#setBlocksTables-com.aspose.cad.fileformats.cad.CadBlockRecordList) | Gets or sets the blocks tables. |
| [getDimensionStyles()](#getDimensionStyles) | Gets or sets the dimension styles. |
| [setDimensionStyles(CadDimensionDictionary value)](#setDimensionStyles-com.aspose.cad.fileformats.cad.CadDimensionDictionary) | Gets or sets the dimension styles. |
| [getEntities()](#getEntities) | Gets or sets the entities. |
| [setEntities(CadBaseEntity[] value)](#setEntities-com.aspose.cad.fileformats.cad.cadobjects.CadBaseEntity:A) | Gets or sets the entities. |
| [getObjects()](#getObjects) | Gets or sets the objects. |
| [setObjects(CadBaseObject[] value)](#setObjects-com.aspose.cad.fileformats.cad.cadobjects.CadBaseObject:A) | Gets or sets the objects. |
| [getHeight()](#getHeight) | Gets the image height. |
| [isCached()](#isCached) | Gets a value indicating whether object's data is cached currently and no data reading is required. |
| [getLayers()](#getLayers) | Gets or sets the layers. |
| [setLayers(CadLayersList value)](#setLayers-com.aspose.cad.fileformats.cad.CadLayersList) | Gets or sets the layers. |
| [getMaxPoint()](#getMaxPoint) | Gets the max point. |
| [getMinPoint()](#getMinPoint) | Gets the min point. |
| [getStyles()](#getStyles) | Gets or sets the styles. |
| [setStyles(CadStylesList value)](#setStyles-com.aspose.cad.fileformats.cad.CadStylesList) | Gets or sets the styles. |
| [getWidth()](#getWidth) | Gets the image width. |
| [getLayouts()](#getLayouts) | Gets the layouts. |
| [getHeader()](#getHeader) | Gets or sets the header. |
| [setHeader(CadHeader value)](#setHeader-com.aspose.cad.fileformats.cad.cadobjects.CadHeader) | Gets or sets the header. |
| [getViewPorts()](#getViewPorts) | Gets or sets the view ports. |
| [setViewPorts(CadVportList value)](#setViewPorts-com.aspose.cad.fileformats.cad.CadVportList) | Gets or sets the view ports. |
| [getViews()](#getViews) | Gets or sets the views. |
| [setViews(CadViewList value)](#setViews-com.aspose.cad.fileformats.cad.CadViewList) | Gets or sets the views. |
| [getUCSs()](#getUCSs) | Gets or sets the uc ss. |
| [setUCSs(CadUcsList value)](#setUCSs-com.aspose.cad.fileformats.cad.CadUcsList) | Gets or sets the uc ss. |
| [getCadAcds()](#getCadAcds) | Gets or sets the CadAcds list |
| [setCadAcds(CadAcdsList value)](#setCadAcds-com.aspose.cad.fileformats.cad.CadAcdsList) | Gets or sets the CadAcds list |
| [getAppIdTables()](#getAppIdTables) | Gets or sets the application identifier tables. |
| [setAppIdTables(CadAppIdDictionary value)](#setAppIdTables-com.aspose.cad.fileformats.cad.CadAppIdDictionary) | Gets or sets the application identifier tables. |
| [removeEntityAt(int position)](#removeEntityAt-int) | Removes entity by its position. |
| [removeEntity(CadBaseEntity entity)](#removeEntity-com.aspose.cad.fileformats.cad.cadobjects.CadBaseEntity) | Removes enity. |
| [cacheData()](#cacheData) | Caches the data and ensures no additional data loading will be performed from the underlying DataStreamSupporter.DataStreamContainer ( DataStreamSupporter.getDataStreamContainer() / DataStreamSupporter.setDataStreamContainer_internalized(StreamContainer) ). |
| [getStrings()](#getStrings) | Gets all string values from image. |
| [updateSize()](#updateSize) |  |
| [updateSize(boolean includeBeyondSize)](#updateSize-boolean) | Updates size of an image after changes, that may affect initial size, e.g. removing of entities. MinPoint, MaxPoint, Width and Height properties of image are updated. |
| [fillBounds()](#fillBounds) | Fills Bounds property (contain minimum and maximum point of entity) for all entities. |
| [getBounds(CadBaseEntity entity)](#getBounds-com.aspose.cad.fileformats.cad.cadobjects.CadBaseEntity) | Fills Bounds property (contains minimum and maximum point) for entity. |

### CadImage() {#CadImage}
```java
public CadImage()
```

Initializes a new instance of the CadImage class.

### getPreviewByteData() {#getPreviewByteData}
```java
public final byte[] getPreviewByteData()
```

Gets or sets the preview byte data.

**Returns:** byte[]

### setPreviewByteData(byte[] value) {#setPreviewByteData-byte:A}
```java
public final void setPreviewByteData(byte[] value)
```

Gets or sets the preview byte data.

### getAppInfoHistoryByteData() {#getAppInfoHistoryByteData}
```java
public final byte[] getAppInfoHistoryByteData()
```

Gets or sets the app info history byte data.

**Returns:** byte[]

### setAppInfoHistoryByteData(byte[] value) {#setAppInfoHistoryByteData-byte:A}
```java
public final void setAppInfoHistoryByteData(byte[] value)
```

Gets or sets the app info history byte data.

### getAppInfoByteData() {#getAppInfoByteData}
```java
public final byte[] getAppInfoByteData()
```

Gets or sets the app info byte data.

**Returns:** byte[]

### setAppInfoByteData(byte[] value) {#setAppInfoByteData-byte:A}
```java
public final void setAppInfoByteData(byte[] value)
```

Gets or sets the app info byte data.

### getRevHistoryByteData() {#getRevHistoryByteData}
```java
public final byte[] getRevHistoryByteData()
```

Gets or sets the revHistory byte data.

**Returns:** byte[]

### setRevHistoryByteData(byte[] value) {#setRevHistoryByteData-byte:A}
```java
public final void setRevHistoryByteData(byte[] value)
```

Gets or sets the revHistory byte data.

### getObjFreeSpaceByteData() {#getObjFreeSpaceByteData}
```java
public final byte[] getObjFreeSpaceByteData()
```

Gets or sets the obj free space byte data.

**Returns:** byte[]

### setObjFreeSpaceByteData(byte[] value) {#setObjFreeSpaceByteData-byte:A}
```java
public final void setObjFreeSpaceByteData(byte[] value)
```

Gets or sets the obj free space byte data.

### getTemplateByteData() {#getTemplateByteData}
```java
public final byte[] getTemplateByteData()
```

Gets or sets the template byte data.

**Returns:** byte[]

### setTemplateByteData(byte[] value) {#setTemplateByteData-byte:A}
```java
public final void setTemplateByteData(byte[] value)
```

Gets or sets the template byte data.

### getAuxHeaderByteData() {#getAuxHeaderByteData}
```java
public final byte[] getAuxHeaderByteData()
```

Gets or sets the aux header byte data.

**Returns:** byte[]

### setAuxHeaderByteData(byte[] value) {#setAuxHeaderByteData-byte:A}
```java
public final void setAuxHeaderByteData(byte[] value)
```

Gets or sets the aux header byte data.

### getHeaderByteData() {#getHeaderByteData}
```java
public final byte[] getHeaderByteData()
```

Gets or sets the header byte data.

**Returns:** byte[]

### setHeaderByteData(byte[] value) {#setHeaderByteData-byte:A}
```java
public final void setHeaderByteData(byte[] value)
```

Gets or sets the header byte data.

### getFileDepByteData() {#getFileDepByteData}
```java
public final byte[] getFileDepByteData()
```

Gets or sets the fileDep byte data.

**Returns:** byte[]

### setFileDepByteData(byte[] value) {#setFileDepByteData-byte:A}
```java
public final void setFileDepByteData(byte[] value)
```

Gets or sets the fileDep byte data.

### getClassesByteData() {#getClassesByteData}
```java
public final byte[] getClassesByteData()
```

Gets or sets the classes byte data.

**Returns:** byte[]

### setClassesByteData(byte[] value) {#setClassesByteData-byte:A}
```java
public final void setClassesByteData(byte[] value)
```

Gets or sets the classes byte data.

### getAcDsPrototypeByteData() {#getAcDsPrototypeByteData}
```java
public final byte[] getAcDsPrototypeByteData()
```

Gets or sets the acDsPrototype byte data.

**Returns:** byte[]

### setAcDsPrototypeByteData(byte[] value) {#setAcDsPrototypeByteData-byte:A}
```java
public final void setAcDsPrototypeByteData(byte[] value)
```

Gets or sets the acDsPrototype byte data.

### getActivePage() {#getActivePage}
```java
public final CadLayout getActivePage()
```

Gets the active page.

**Returns:** CadLayout

### getDefaultLineWeight() {#getDefaultLineWeight}
```java
public final float getDefaultLineWeight()
```

Gets or sets the default line weight.

**Returns:** float - The default line weight.

### setDefaultLineWeight(float value) {#setDefaultLineWeight-float}
```java
public final void setDefaultLineWeight(float value)
```

Gets or sets the default line weight.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | float | The default line weight. |

### getDefaultFont() {#getDefaultFont}
```java
public final String getDefaultFont()
```

Gets or sets the default font.

**Returns:** String - The default font.

### setDefaultFont(String value) {#setDefaultFont-java.lang.String}
```java
public final void setDefaultFont(String value)
```

Gets or sets the default font.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | The default font. |

### getFileEncoding() {#getFileEncoding}
```java
public final int getFileEncoding()
```

Gets file's encoding

**Returns:** int

### setFileEncoding(int value) {#setFileEncoding-int}
```java
public final void setFileEncoding(int value)
```

Gets file's encoding

### getApplicationVersion() {#getApplicationVersion}
```java
public final int getApplicationVersion()
```

Gets or sets the application version. Value: The application version.

**Returns:** int

### setApplicationVersion(int value) {#setApplicationVersion-int}
```java
public final void setApplicationVersion(int value)
```

Gets or sets the application version. Value: The application version.

### getMaintenanceVersion() {#getMaintenanceVersion}
```java
public final int getMaintenanceVersion()
```

Gets or sets the maintenance version. Value: The maintenance version.

**Returns:** int

### setMaintenanceVersion(int value) {#setMaintenanceVersion-int}
```java
public final void setMaintenanceVersion(int value)
```

Gets or sets the maintenance version. Value: The maintenance version.

### getSpecifiedEncoding() {#getSpecifiedEncoding}
```java
public final int getSpecifiedEncoding()
```

Gets or sets the specified encoding.

**Returns:** int - The specified encoding.

### setSpecifiedEncoding(int value) {#setSpecifiedEncoding-int}
```java
public final void setSpecifiedEncoding(int value)
```

Gets or sets the specified encoding.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The specified encoding. |

### getSpecifiedMifEncoding() {#getSpecifiedMifEncoding}
```java
public final int getSpecifiedMifEncoding()
```

Gets or sets the specified MIF character encoding

**Returns:** int

### setSpecifiedMifEncoding(int value) {#setSpecifiedMifEncoding-int}
```java
public final void setSpecifiedMifEncoding(int value)
```

Gets or sets the specified MIF character encoding

### getLineTypes() {#getLineTypes}
```java
public final CadLineTypesDictionary getLineTypes()
```

Gets or sets the dimension styles.

**Returns:** CadLineTypesDictionary - The dimension styles.

### setLineTypes(CadLineTypesDictionary value) {#setLineTypes-com.aspose.cad.fileformats.cad.CadLineTypesDictionary}
```java
public final void setLineTypes(CadLineTypesDictionary value)
```

Gets or sets the dimension styles.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | CadLineTypesDictionary | The dimension styles. |

### getBlockEntities() {#getBlockEntities}
```java
public final CadBlockDictionary getBlockEntities()
```

Gets or sets the block entities.

**Returns:** CadBlockDictionary - The block entities.

### setBlockEntities(CadBlockDictionary value) {#setBlockEntities-com.aspose.cad.fileformats.cad.CadBlockDictionary}
```java
public final void setBlockEntities(CadBlockDictionary value)
```

Gets or sets the block entities.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | CadBlockDictionary | The block entities. |

### getClassEntities() {#getClassEntities}
```java
public final CadClassList getClassEntities()
```

Gets or sets the class entities.

**Returns:** CadClassList - The class entities.

### setClassEntities(CadClassList value) {#setClassEntities-com.aspose.cad.fileformats.cad.CadClassList}
```java
public final void setClassEntities(CadClassList value)
```

Gets or sets the class entities.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | CadClassList | The class entities. |

### getThumbnailImage() {#getThumbnailImage}
```java
public final CadThumbnailImage getThumbnailImage()
```

Gets or sets the thumbnail image.

**Returns:** CadThumbnailImage - The thumbnail image.

### setThumbnailImage(CadThumbnailImage value) {#setThumbnailImage-com.aspose.cad.fileformats.cad.cadobjects.CadThumbnailImage}
```java
public final void setThumbnailImage(CadThumbnailImage value)
```

Gets or sets the thumbnail image.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | CadThumbnailImage | The thumbnail image. |

### getBlocksTables() {#getBlocksTables}
```java
public final CadBlockRecordList getBlocksTables()
```

Gets or sets the blocks tables.

**Returns:** CadBlockRecordList - The blocks tables.

### setBlocksTables(CadBlockRecordList value) {#setBlocksTables-com.aspose.cad.fileformats.cad.CadBlockRecordList}
```java
public final void setBlocksTables(CadBlockRecordList value)
```

Gets or sets the blocks tables.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | CadBlockRecordList | The blocks tables. |

### getDimensionStyles() {#getDimensionStyles}
```java
public final CadDimensionDictionary getDimensionStyles()
```

Gets or sets the dimension styles.

**Returns:** CadDimensionDictionary - The dimension styles.

### setDimensionStyles(CadDimensionDictionary value) {#setDimensionStyles-com.aspose.cad.fileformats.cad.CadDimensionDictionary}
```java
public final void setDimensionStyles(CadDimensionDictionary value)
```

Gets or sets the dimension styles.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | CadDimensionDictionary | The dimension styles. |

### getEntities() {#getEntities}
```java
public final CadBaseEntity[] getEntities()
```

Gets or sets the entities.

**Returns:** CadBaseEntity[] - The entities.

### setEntities(CadBaseEntity[] value) {#setEntities-com.aspose.cad.fileformats.cad.cadobjects.CadBaseEntity:A}
```java
public final void setEntities(CadBaseEntity[] value)
```

Gets or sets the entities.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | CadBaseEntity[] | The entities. |

### getObjects() {#getObjects}
```java
public final CadBaseObject[] getObjects()
```

Gets or sets the objects.

**Returns:** CadBaseObject[] - The objects.

**Throws:**

- `CadException` - Invalid value for Objects

### setObjects(CadBaseObject[] value) {#setObjects-com.aspose.cad.fileformats.cad.cadobjects.CadBaseObject:A}
```java
public final void setObjects(CadBaseObject[] value)
```

Gets or sets the objects.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | CadBaseObject[] | The objects. |

**Throws:**

- `CadException` - Invalid value for Objects

### getHeight() {#getHeight}
```java
public int getHeight()
```

Gets the image height.

**Returns:** int - The image height.

### isCached() {#isCached}
```java
public final boolean isCached()
```

Gets a value indicating whether object's data is cached currently and no data reading is required.

**Returns:** boolean - true if object's data is cached; otherwise, false .

### getLayers() {#getLayers}
```java
public final CadLayersList getLayers()
```

Gets or sets the layers.

**Returns:** CadLayersList - The layers.

### setLayers(CadLayersList value) {#setLayers-com.aspose.cad.fileformats.cad.CadLayersList}
```java
public final void setLayers(CadLayersList value)
```

Gets or sets the layers.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | CadLayersList | The layers. |

### getMaxPoint() {#getMaxPoint}
```java
public final Cad3DPoint getMaxPoint()
```

Gets the max point.

**Returns:** Cad3DPoint

### getMinPoint() {#getMinPoint}
```java
public final Cad3DPoint getMinPoint()
```

Gets the min point.

**Returns:** Cad3DPoint

### getStyles() {#getStyles}
```java
public final CadStylesList getStyles()
```

Gets or sets the styles.

**Returns:** CadStylesList

### setStyles(CadStylesList value) {#setStyles-com.aspose.cad.fileformats.cad.CadStylesList}
```java
public final void setStyles(CadStylesList value)
```

Gets or sets the styles.

### getWidth() {#getWidth}
```java
public int getWidth()
```

Gets the image width.

**Returns:** int - The image width.

### getLayouts() {#getLayouts}
```java
public final CadLayoutDictionary getLayouts()
```

Gets the layouts.

**Returns:** CadLayoutDictionary - The layouts.

### getHeader() {#getHeader}
```java
public final CadHeader getHeader()
```

Gets or sets the header.

**Returns:** CadHeader - The header.

### setHeader(CadHeader value) {#setHeader-com.aspose.cad.fileformats.cad.cadobjects.CadHeader}
```java
public final void setHeader(CadHeader value)
```

Gets or sets the header.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | CadHeader | The header. |

### getViewPorts() {#getViewPorts}
```java
public final CadVportList getViewPorts()
```

Gets or sets the view ports.

**Returns:** CadVportList - The view ports.

### setViewPorts(CadVportList value) {#setViewPorts-com.aspose.cad.fileformats.cad.CadVportList}
```java
public final void setViewPorts(CadVportList value)
```

Gets or sets the view ports.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | CadVportList | The view ports. |

### getViews() {#getViews}
```java
public final CadViewList getViews()
```

Gets or sets the views.

**Returns:** CadViewList - The views.

### setViews(CadViewList value) {#setViews-com.aspose.cad.fileformats.cad.CadViewList}
```java
public final void setViews(CadViewList value)
```

Gets or sets the views.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | CadViewList | The views. |

### getUCSs() {#getUCSs}
```java
public final CadUcsList getUCSs()
```

Gets or sets the uc ss.

**Returns:** CadUcsList - The uc ss.

### setUCSs(CadUcsList value) {#setUCSs-com.aspose.cad.fileformats.cad.CadUcsList}
```java
public final void setUCSs(CadUcsList value)
```

Gets or sets the uc ss.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | CadUcsList | The uc ss. |

### getCadAcds() {#getCadAcds}
```java
public final CadAcdsList getCadAcds()
```

Gets or sets the CadAcds list

**Returns:** CadAcdsList

### setCadAcds(CadAcdsList value) {#setCadAcds-com.aspose.cad.fileformats.cad.CadAcdsList}
```java
public final void setCadAcds(CadAcdsList value)
```

Gets or sets the CadAcds list

### getAppIdTables() {#getAppIdTables}
```java
public final CadAppIdDictionary getAppIdTables()
```

Gets or sets the application identifier tables.

**Returns:** CadAppIdDictionary - The application identifier tables.

### setAppIdTables(CadAppIdDictionary value) {#setAppIdTables-com.aspose.cad.fileformats.cad.CadAppIdDictionary}
```java
public final void setAppIdTables(CadAppIdDictionary value)
```

Gets or sets the application identifier tables.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | CadAppIdDictionary | The application identifier tables. |

### removeEntityAt(int position) {#removeEntityAt-int}
```java
public final void removeEntityAt(int position)
```

Removes entity by its position.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| position | int | Position to remove entity from. |

### removeEntity(CadBaseEntity entity) {#removeEntity-com.aspose.cad.fileformats.cad.cadobjects.CadBaseEntity}
```java
public void removeEntity(CadBaseEntity entity)
```

Removes enity.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| entity | CadBaseEntity | Entity to remove. |

### cacheData() {#cacheData}
```java
public final void cacheData()
```

Caches the data and ensures no additional data loading will be performed from the underlying DataStreamSupporter.DataStreamContainer ( DataStreamSupporter.getDataStreamContainer() / DataStreamSupporter.setDataStreamContainer_internalized(StreamContainer) ).

### getStrings() {#getStrings}
```java
public String[] getStrings()
```

Gets all string values from image.

**Returns:** String[] - The array with string values.

### updateSize() {#updateSize}
```java
public final void updateSize()
```

### updateSize(boolean includeBeyondSize) {#updateSize-boolean}
```java
public final void updateSize(boolean includeBeyondSize)
```

Updates size of an image after changes, that may affect initial size, e.g. removing of entities. MinPoint, MaxPoint, Width and Height properties of image are updated.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| includeBeyondSize | boolean | Determines whether entities that lie outside the boundaries of the image size should affect the new image size. |

### fillBounds() {#fillBounds}
```java
public final void fillBounds()
```

Fills Bounds property (contain minimum and maximum point of entity) for all entities.

### getBounds(CadBaseEntity entity) {#getBounds-com.aspose.cad.fileformats.cad.cadobjects.CadBaseEntity}
```java
public final void getBounds(CadBaseEntity entity)
```

Fills Bounds property (contains minimum and maximum point) for entity.

