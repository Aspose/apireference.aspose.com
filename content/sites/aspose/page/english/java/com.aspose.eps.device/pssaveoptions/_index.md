---
title: PsSaveOptions
second_title: Aspose.Page for Java API Reference
description: This class contains options necessary for managing conversion process.
type: docs
weight: 14
url: /java/com.aspose.eps.device/pssaveoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.SaveOptions](../../com.aspose.page/saveoptions)
```
public class PsSaveOptions extends SaveOptions
```

This class contains options necessary for managing conversion process.
## Constructors

| Constructor | Description |
| --- | --- |
| [PsSaveOptions()](#PsSaveOptions--) | Initialize new instance of  PdfSaveOptions  class with default values for flags  suppressErrors  (true) and  debug  (false). |
| [PsSaveOptions(boolean supressErrors)](#PsSaveOptions-boolean-) | Initialize new instance of  PdfSaveOptions  class with default values for flag  debug  (false). |
## Methods

| Method | Description |
| --- | --- |
| [getPageSize()](#getPageSize--) |  |
| [setPageSize(Dimension pageSize)](#setPageSize-java.awt.Dimension-) |  |
| [getMargins()](#getMargins--) |  |
| [setMargins(Insets margins)](#setMargins-java.awt.Insets-) |  |
| [getBackgroundColor()](#getBackgroundColor--) |  |
| [setBackgroundColor(Color backgroundColor)](#setBackgroundColor-java.awt.Color-) |  |
| [isTransparent()](#isTransparent--) |  |
| [setTransparent(boolean transparent)](#setTransparent-boolean-) |  |
| [isEmbedFonts()](#isEmbedFonts--) | Indicates whether to embed used fonts in PS document |
| [setEmbedFonts(boolean embedFonts)](#setEmbedFonts-boolean-) | Specifies whether to embed used fonts in PS document |
| [getEmbedFontsAs()](#getEmbedFontsAs--) |  |
| [setEmbedFontsAs(String embedFontsAs)](#setEmbedFontsAs-java.lang.String-) | Specify font type in which to embed fonts in PS document |
| [getSaveFormat()](#getSaveFormat--) |  |
| [setSaveFormat(PsSaveFormat saveFormat)](#setSaveFormat-com.aspose.eps.device.PsSaveFormat-) | Specify save format of resulting file |
### PsSaveOptions() {#PsSaveOptions--}
```
public PsSaveOptions()
```


Initialize new instance of  PdfSaveOptions  class with default values for flags  suppressErrors  (true) and  debug  (false).

### PsSaveOptions(boolean supressErrors) {#PsSaveOptions-boolean-}
```
public PsSaveOptions(boolean supressErrors)
```


Initialize new instance of  PdfSaveOptions  class with default values for flag  debug  (false).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| supressErrors | boolean | If true conversion will be continued despite of non-critical errors. |

### getPageSize() {#getPageSize--}
```
public Dimension getPageSize()
```




**Returns:**
java.awt.Dimension - the size of the page
### setPageSize(Dimension pageSize) {#setPageSize-java.awt.Dimension-}
```
public void setPageSize(Dimension pageSize)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pageSize | java.awt.Dimension | Specifies the size of the page |

### getMargins() {#getMargins--}
```
public Insets getMargins()
```




**Returns:**
java.awt.Insets - the margins of the page
### setMargins(Insets margins) {#setMargins-java.awt.Insets-}
```
public void setMargins(Insets margins)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| margins | java.awt.Insets | Specifies the margins of the page |

### getBackgroundColor() {#getBackgroundColor--}
```
public Color getBackgroundColor()
```




**Returns:**
java.awt.Color - the background color
### setBackgroundColor(Color backgroundColor) {#setBackgroundColor-java.awt.Color-}
```
public void setBackgroundColor(Color backgroundColor)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| backgroundColor | java.awt.Color | Specifies background color |

### isTransparent() {#isTransparent--}
```
public boolean isTransparent()
```




**Returns:**
boolean - Indicates if background is transparent
### setTransparent(boolean transparent) {#setTransparent-boolean-}
```
public void setTransparent(boolean transparent)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| transparent | boolean | Specifies if background is transparent |

### isEmbedFonts() {#isEmbedFonts--}
```
public boolean isEmbedFonts()
```


Indicates whether to embed used fonts in PS document

**Returns:**
boolean - value of embedFonts flag
### setEmbedFonts(boolean embedFonts) {#setEmbedFonts-boolean-}
```
public void setEmbedFonts(boolean embedFonts)
```


Specifies whether to embed used fonts in PS document

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| embedFonts | boolean | embedFonts flag |

### getEmbedFontsAs() {#getEmbedFontsAs--}
```
public String getEmbedFontsAs()
```




**Returns:**
java.lang.String - a type of font in which to embed fonts in PS document
### setEmbedFontsAs(String embedFontsAs) {#setEmbedFontsAs-java.lang.String-}
```
public void setEmbedFontsAs(String embedFontsAs)
```


Specify font type in which to embed fonts in PS document

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| embedFontsAs | java.lang.String | Font type |

### getSaveFormat() {#getSaveFormat--}
```
public PsSaveFormat getSaveFormat()
```




**Returns:**
[PsSaveFormat](../../com.aspose.eps.device/pssaveformat) - save format of resulting file
### setSaveFormat(PsSaveFormat saveFormat) {#setSaveFormat-com.aspose.eps.device.PsSaveFormat-}
```
public void setSaveFormat(PsSaveFormat saveFormat)
```


Specify save format of resulting file

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| saveFormat | [PsSaveFormat](../../com.aspose.eps.device/pssaveformat) | Format of resulting file |

