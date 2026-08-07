---
title: "ASPsdExportConfiguration"
linktitle: "ASPsdExportConfiguration"
second_title: "Aspose.CAD for JasperReports"
description: "The PSD file format export configuration."
type: docs
weight: 10
url: /jasperreports/com.aspose.cad.jasperreports.psd/aspsdexportconfiguration/
---

**Inheritance:** java.lang.Object, ImageExportConfiguration

The PSD file format export configuration.

## Methods

| Method | Description |
| --- | --- |
| [getVersion()](#getVersion) | Gets or sets the psd file version. |
| [getCompressionMethod()](#getCompressionMethod) | Gets or sets the psd compression method. |
| [getPsdVersion()](#getPsdVersion) | Gets the file format version. It can be PSD or PSB. Value: The file format version. |
| [getColorMode()](#getColorMode) | Gets or sets the psd color mode. |
| [getChannelBitsCount()](#getChannelBitsCount) | Gets or sets the bits count per color channel. |
| [getChannelsCount()](#getChannelsCount) | Gets the color channels count. |
| [isRemoveGlobalTextEngineResource()](#isRemoveGlobalTextEngineResource) | Gets a value indicating whether - Remove the global text engine resource - Used for some text-layered psd files, in only case, when they can not be opened in Adobe Photoshop after processing (mostly for absent fonts text layers related). After using this option, user need to Make next in opened in Photoshop file: Menu "Text" -> "Process absent fonts". After that operation all text will appear again. Please note, that this operation may cause some final layout changes. |
| [isRefreshImagePreviewData()](#isRefreshImagePreviewData) | Gets a value indicating whether [refresh image preview data] - option used to maximize compatibility with another PSD image viewers. |

### getVersion() {#getVersion}
```java
int getVersion()
```

Gets or sets the psd file version.

**Returns:** int - The psd file version.

### getCompressionMethod() {#getCompressionMethod}
```java
CompressionMethodEnum getCompressionMethod()
```

Gets or sets the psd compression method.

**Returns:** CompressionMethodEnum - The compression method.

### getPsdVersion() {#getPsdVersion}
```java
PsdVersionEnum getPsdVersion()
```

Gets the file format version. It can be PSD or PSB. Value: The file format version.

**Returns:** PsdVersionEnum - the file format version.

### getColorMode() {#getColorMode}
```java
ColorModesEnum getColorMode()
```

Gets or sets the psd color mode.

**Returns:** ColorModesEnum - The color mode.

### getChannelBitsCount() {#getChannelBitsCount}
```java
short getChannelBitsCount()
```

Gets or sets the bits count per color channel.

**Returns:** short - The bits count per color channel.

### getChannelsCount() {#getChannelsCount}
```java
short getChannelsCount()
```

Gets the color channels count.

**Returns:** short - The color channels count.

### isRemoveGlobalTextEngineResource() {#isRemoveGlobalTextEngineResource}
```java
boolean isRemoveGlobalTextEngineResource()
```

Gets a value indicating whether - Remove the global text engine resource - Used for some text-layered psd files, in only case, when they can not be opened in Adobe Photoshop after processing (mostly for absent fonts text layers related). After using this option, user need to Make next in opened in Photoshop file: Menu "Text" -> "Process absent fonts". After that operation all text will appear again. Please note, that this operation may cause some final layout changes.

**Returns:** boolean - true if [remove global text engine resource]; otherwise, false .

### isRefreshImagePreviewData() {#isRefreshImagePreviewData}
```java
boolean isRefreshImagePreviewData()
```

Gets a value indicating whether [refresh image preview data] - option used to maximize compatibility with another PSD image viewers.

**Returns:** boolean - true if [refresh image preview data]; otherwise, false .

