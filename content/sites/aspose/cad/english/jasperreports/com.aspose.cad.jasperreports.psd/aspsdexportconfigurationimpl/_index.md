---
title: "ASPsdExportConfigurationImpl"
linktitle: "ASPsdExportConfigurationImpl"
second_title: "Aspose.CAD for JasperReports"
description: "The PSD file format export configuration."
type: docs
weight: 10
url: /jasperreports/com.aspose.cad.jasperreports.psd/aspsdexportconfigurationimpl/
---

**Inheritance:** java.lang.Object, ImageExportConfigurationImpl

**All Implemented Interfaces:** ASPsdExportConfiguration

The PSD file format export configuration.

## Constructors

| Constructor | Description |
| --- | --- |
| [ASPsdExportConfigurationImpl()](#ASPsdExportConfigurationImpl) | Initializes a new instance of the PsdOptions class. |

## Methods

| Method | Description |
| --- | --- |
| [getVersion()](#getVersion) | Gets or sets the psd file version. |
| [setVersion(int value)](#setVersion-int) | Gets or sets the psd file version. |
| [getCompressionMethod()](#getCompressionMethod) | Gets or sets the psd compression method. |
| [setCompressionMethod(CompressionMethodEnum value)](#setCompressionMethod-com.aspose.cad.jasperreports.psd.CompressionMethodEnum) | Gets or sets the psd compression method. |
| [getPsdVersion()](#getPsdVersion) | Gets the file format version. It can be PSD or PSB. |
| [setPsdVersion(PsdVersionEnum value)](#setPsdVersion-com.aspose.cad.jasperreports.psd.PsdVersionEnum) | Sets the file format version. It can be PSD or PSB. Value: The file format version. |
| [getColorMode()](#getColorMode) | Gets or sets the psd color mode. |
| [setColorMode(ColorModesEnum value)](#setColorMode-com.aspose.cad.jasperreports.psd.ColorModesEnum) | Gets or sets the psd color mode. |
| [getChannelBitsCount()](#getChannelBitsCount) | Gets or sets the bits count per color channel. |
| [setChannelBitsCount(short value)](#setChannelBitsCount-short) | Gets or sets the bits count per color channel. |
| [getChannelsCount()](#getChannelsCount) | Gets the color channels count. |
| [setChannelsCount(short value)](#setChannelsCount-short) | Sets the color channels count. |
| [isRemoveGlobalTextEngineResource()](#isRemoveGlobalTextEngineResource) | Gets a value indicating whether - Remove the global text engine resource - Used for some text-layered psd files, in only case, when they can not be opened in Adobe Photoshop after processing (mostly for absent fonts text layers related). After using this option, user need to Make next in opened in Photoshop file: Menu "Text" -> "Process absent fonts". After that operation all text will appear again. Please note, that this operation may cause some final layout changes. |
| [setRemoveGlobalTextEngineResource(boolean value)](#setRemoveGlobalTextEngineResource-boolean) | Sets a value indicating whether - Remove the global text engine resource - Used for some text-layered psd files, in only case, when they can not be opened in Adobe Photoshop after processing (mostly for absent fonts text layers related). After using this option, user need to Make next in opened in Photoshop file: Menu "Text" -> "Process absent fonts". After that operation all text will appear again. Please note, that this operation may cause some final layout changes. |
| [isRefreshImagePreviewData()](#isRefreshImagePreviewData) | Gets a value indicating whether [refresh image preview data] - option used to maximize compatibility with another PSD image viewers. |
| [setRefreshImagePreviewData(boolean value)](#setRefreshImagePreviewData-boolean) | Sets a value indicating whether [refresh image preview data] - option used to maximize compatibility with another PSD image viewers. |

### ASPsdExportConfigurationImpl() {#ASPsdExportConfigurationImpl}
```java
public ASPsdExportConfigurationImpl()
```

Initializes a new instance of the PsdOptions class.

### getVersion() {#getVersion}
```java
public int getVersion()
```

Gets or sets the psd file version.

**Returns:** int - The psd file version.

### setVersion(int value) {#setVersion-int}
```java
public void setVersion(int value)
```

Gets or sets the psd file version.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The psd file version. |

### getCompressionMethod() {#getCompressionMethod}
```java
public CompressionMethodEnum getCompressionMethod()
```

Gets or sets the psd compression method.

**Returns:** CompressionMethodEnum - The compression method.

### setCompressionMethod(CompressionMethodEnum value) {#setCompressionMethod-com.aspose.cad.jasperreports.psd.CompressionMethodEnum}
```java
public void setCompressionMethod(CompressionMethodEnum value)
```

Gets or sets the psd compression method.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | CompressionMethodEnum | The compression method. |

### getPsdVersion() {#getPsdVersion}
```java
public final PsdVersionEnum getPsdVersion()
```

Gets the file format version. It can be PSD or PSB.

**Returns:** PsdVersionEnum - the file format version.

### setPsdVersion(PsdVersionEnum value) {#setPsdVersion-com.aspose.cad.jasperreports.psd.PsdVersionEnum}
```java
public final void setPsdVersion(PsdVersionEnum value)
```

Sets the file format version. It can be PSD or PSB. Value: The file format version.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | PsdVersionEnum | the file format version. |

### getColorMode() {#getColorMode}
```java
public ColorModesEnum getColorMode()
```

Gets or sets the psd color mode.

**Returns:** ColorModesEnum - The color mode.

### setColorMode(ColorModesEnum value) {#setColorMode-com.aspose.cad.jasperreports.psd.ColorModesEnum}
```java
public void setColorMode(ColorModesEnum value)
```

Gets or sets the psd color mode.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value: | ColorModesEnum | The color mode. |

### getChannelBitsCount() {#getChannelBitsCount}
```java
public short getChannelBitsCount()
```

Gets or sets the bits count per color channel.

**Returns:** short - The bits count per color channel.

### setChannelBitsCount(short value) {#setChannelBitsCount-short}
```java
public void setChannelBitsCount(short value)
```

Gets or sets the bits count per color channel.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | short | The bits count per color channel. |

### getChannelsCount() {#getChannelsCount}
```java
public short getChannelsCount()
```

Gets the color channels count.

**Returns:** short - The color channels count.

### setChannelsCount(short value) {#setChannelsCount-short}
```java
public void setChannelsCount(short value)
```

Sets the color channels count.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | short | The color channels count. |

### isRemoveGlobalTextEngineResource() {#isRemoveGlobalTextEngineResource}
```java
public boolean isRemoveGlobalTextEngineResource()
```

Gets a value indicating whether - Remove the global text engine resource - Used for some text-layered psd files, in only case, when they can not be opened in Adobe Photoshop after processing (mostly for absent fonts text layers related). After using this option, user need to Make next in opened in Photoshop file: Menu "Text" -> "Process absent fonts". After that operation all text will appear again. Please note, that this operation may cause some final layout changes.

**Returns:** boolean - true if [remove global text engine resource]; otherwise, false .

### setRemoveGlobalTextEngineResource(boolean value) {#setRemoveGlobalTextEngineResource-boolean}
```java
public void setRemoveGlobalTextEngineResource(boolean value)
```

Sets a value indicating whether - Remove the global text engine resource - Used for some text-layered psd files, in only case, when they can not be opened in Adobe Photoshop after processing (mostly for absent fonts text layers related). After using this option, user need to Make next in opened in Photoshop file: Menu "Text" -> "Process absent fonts". After that operation all text will appear again. Please note, that this operation may cause some final layout changes.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | true if [remove global text engine resource]; otherwise, false . |

### isRefreshImagePreviewData() {#isRefreshImagePreviewData}
```java
public boolean isRefreshImagePreviewData()
```

Gets a value indicating whether [refresh image preview data] - option used to maximize compatibility with another PSD image viewers.

**Returns:** boolean - true if [refresh image preview data]; otherwise, false .

### setRefreshImagePreviewData(boolean value) {#setRefreshImagePreviewData-boolean}
```java
public void setRefreshImagePreviewData(boolean value)
```

Sets a value indicating whether [refresh image preview data] - option used to maximize compatibility with another PSD image viewers.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | true if [refresh image preview data]; otherwise, false . |

