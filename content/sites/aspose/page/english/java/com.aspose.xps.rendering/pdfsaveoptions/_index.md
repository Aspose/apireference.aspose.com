---
title: PdfSaveOptions
second_title: Aspose.Page for Java API Reference
description: Class for XPS-as-PDF saving options.
type: docs
weight: 14
url: /java/com.aspose.xps.rendering/pdfsaveoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.SaveOptions](../../com.aspose.page/saveoptions)

**All Implemented Interfaces:**
[com.aspose.page.IMultiPageSaveOptions](../../com.aspose.page/imultipagesaveoptions), [com.aspose.xps.rendering.IXpsTextConversionOptions](../../com.aspose.xps.rendering/ixpstextconversionoptions), [com.aspose.xps.rendering.IPipelineOptions](../../com.aspose.xps.rendering/ipipelineoptions), [com.aspose.xps.rendering.IEventBasedModificationOptions](../../com.aspose.xps.rendering/ieventbasedmodificationoptions)
```
public class PdfSaveOptions extends SaveOptions implements IMultiPageSaveOptions, IXpsTextConversionOptions, IPipelineOptions, IEventBasedModificationOptions
```

Class for XPS-as-PDF saving options.
## Constructors

| Constructor | Description |
| --- | --- |
| [PdfSaveOptions()](#PdfSaveOptions--) | Creates new instance of options. |
## Methods

| Method | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | Returns additional fonts folders where converter should find fonts for input document. |
| [getBatchSize()](#getBatchSize--) | Returns the size of a portion of pages to pass from node to node. |
| [getBeforePageSavingEventHandlers()](#getBeforePageSavingEventHandlers--) | Returns the collection of event handlers that performs modifications to an XPS page just before it is saved. |
| [getClass()](#getClass--) |  |
| [getEncryptionDetails()](#getEncryptionDetails--) | Returns the encryption details. |
| [getExceptions()](#getExceptions--) | Returns a list of non-critical errors. |
| [getImageCompression()](#getImageCompression--) | Returns the compression type to be used for all images in the document. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Returns the value specifying the level of compression for an image. |
| [getOutlineTreeExpansionLevel()](#getOutlineTreeExpansionLevel--) | Gets up to what level the document outline should be expanded when the PDF file is opened in a viewer. 1 - only the first level outline items are shown, 2 - only the first and second level outline items are shown, and so on. |
| [getOutlineTreeHeight()](#getOutlineTreeHeight--) | Gets the height of the document outline tree to save. 0 - the outline tree will not be converted, 1 - only the first level outline items will be converted, and so on. |
| [getPageNumbers()](#getPageNumbers--) | Gets the array of numbers of pages to render. |
| [getSize()](#getSize--) | Gets a size of the page or image. |
| [getTextCompression()](#getTextCompression--) | Returns the compression type to be used for all content streams except images. |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | Gets the flag that allows output of warnings and messages during conversion. |
| [isSupressErrors()](#isSupressErrors--) | Returns a value indicating whether errors will be suppressed during conversion. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [preserveText()](#preserveText--) | In XPS, some text elements may contain references to alternate glyph forms that do not correspond to any character code in the font. |
| [preserveText(boolean value)](#preserveText-boolean-) | In XPS, some text elements may contain references to alternate glyph forms that do not correspond to any character code in the font. |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | Specifies additional fonts folders where converter should find fonts for input document. |
| [setBatchSize(int value)](#setBatchSize-int-) | Sets the size of a portion of pages to pass from node to node. |
| [setDebug(boolean debug)](#setDebug-boolean-) | Specifies the flag that allows output of warnings and messages during conversion. |
| [setEncryptionDetails(PdfEncryptionDetails value)](#setEncryptionDetails-com.aspose.xps.rendering.PdfEncryptionDetails-) | Sets the encryption details. |
| [setImageCompression(PdfImageCompression value)](#setImageCompression-com.aspose.xps.rendering.PdfImageCompression-) | Sets the compression type to be used for all images in the document. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Sets the value specifying the level of compression for an image. |
| [setOutlineTreeExpansionLevel(int value)](#setOutlineTreeExpansionLevel-int-) | Sets up to what level the document outline should be expanded when the PDF file is opened in a viewer. 1 - only the first level outline items are shown, 2 - only the first and second level outline items are shown, and so on. |
| [setOutlineTreeHeight(int value)](#setOutlineTreeHeight-int-) | Sets the height of the document outline tree to save. 0 - the outline tree will not be converted, 1 - only the first level outline items will be converted, and so on. |
| [setPageNumbers(int[] value)](#setPageNumbers-int---) | Sets the array of numbers of pages to render. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Specifies a size of the page or image. |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | Specifies the flag that indicates whether errors will be suppressed during conversion. |
| [setTextCompression(PdfTextCompression value)](#setTextCompression-com.aspose.xps.rendering.PdfTextCompression-) | Sets the compression type to be used for all content streams except images. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PdfSaveOptions() {#PdfSaveOptions--}
```
public PdfSaveOptions()
```


Creates new instance of options.

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getAdditionalFontsFolders() {#getAdditionalFontsFolders--}
```
public String[] getAdditionalFontsFolders()
```


Returns additional fonts folders where converter should find fonts for input document. Default folder is standard fonts folder where OS finds fonts for internal needs.

**Returns:**
java.lang.String[] - An array of fonts folders.
### getBatchSize() {#getBatchSize--}
```
public int getBatchSize()
```


Returns the size of a portion of pages to pass from node to node.

**Returns:**
int - The size of a portion of pages to pass from node to node.
### getBeforePageSavingEventHandlers() {#getBeforePageSavingEventHandlers--}
```
public List<EventBasedModifications.BeforePageSavingEventHandler> getBeforePageSavingEventHandlers()
```


Returns the collection of event handlers that performs modifications to an XPS page just before it is saved.

**Returns:**
java.util.List<com.aspose.xps.features.EventBasedModifications.BeforePageSavingEventHandler> - The collection of event handlers that performs modifications to an XPS page just before it is saved.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getEncryptionDetails() {#getEncryptionDetails--}
```
public PdfEncryptionDetails getEncryptionDetails()
```


Returns the encryption details. If not set, then no encryption will be performed.

**Returns:**
[PdfEncryptionDetails](../../com.aspose.xps.rendering/pdfencryptiondetails) - The encryption details.
### getExceptions() {#getExceptions--}
```
public List<Exception> getExceptions()
```


Returns a list of non-critical errors.

**Returns:**
java.util.List<java.lang.Exception> - Exceptions list
### getImageCompression() {#getImageCompression--}
```
public PdfImageCompression getImageCompression()
```


Returns the compression type to be used for all images in the document. Default is  PdfImageCompression.Auto .

**Returns:**
[PdfImageCompression](../../com.aspose.xps.rendering/pdfimagecompression) - The compression type.
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


Returns the value specifying the level of compression for an image. Available values are 0 to 100. The lower the number specified, the higher the compression and therefore the lower the quality of the image. 0 value results in lowest quality image, while 100 results in highest.

**Returns:**
int - The value specifying the level of compression for an image.
### getOutlineTreeExpansionLevel() {#getOutlineTreeExpansionLevel--}
```
public int getOutlineTreeExpansionLevel()
```


Gets up to what level the document outline should be expanded when the PDF file is opened in a viewer. 1 - only the first level outline items are shown, 2 - only the first and second level outline items are shown, and so on.

**Returns:**
int - The outline tree expansion level.
### getOutlineTreeHeight() {#getOutlineTreeHeight--}
```
public int getOutlineTreeHeight()
```


Gets the height of the document outline tree to save. 0 - the outline tree will not be converted, 1 - only the first level outline items will be converted, and so on. Default is 10.

**Returns:**
int - The outline tree height.
### getPageNumbers() {#getPageNumbers--}
```
public int[] getPageNumbers()
```


Gets the array of numbers of pages to render.

**Returns:**
int[] - Numbers of pages.
### getSize() {#getSize--}
```
public Dimension getSize()
```


Gets a size of the page or image.

**Returns:**
java.awt.Dimension - A size of the page or image.
### getTextCompression() {#getTextCompression--}
```
public PdfTextCompression getTextCompression()
```


Returns the compression type to be used for all content streams except images. Default is  PdfTextCompression.Flate .

**Returns:**
[PdfTextCompression](../../com.aspose.xps.rendering/pdftextcompression) - The compression type.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isDebug() {#isDebug--}
```
public boolean isDebug()
```


Gets the flag that allows output of warnings and messages during conversion.

**Returns:**
boolean - debug value.
### isSupressErrors() {#isSupressErrors--}
```
public boolean isSupressErrors()
```


Returns a value indicating whether errors will be suppressed during conversion.

**Returns:**
boolean - boolean value
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### preserveText() {#preserveText--}
```
public boolean preserveText()
```


In XPS, some text elements may contain references to alternate glyph forms that do not correspond to any character code in the font. If this flag is set to true, the text from such XPS elements is converted to graphic shapes. Then the text itself appears transparent on top. This leaves the text of such elements selectable. But the side effect is that the output file may be much larger than the original. If this flag is set to false, the characters that should be displayed as alternate forms are replaced with some other characters that become mapped to the alternate glyph forms. Therefore the text, although still selectable, will be modified and likely become unreadable.

**Returns:**
boolean - The flag value.
### preserveText(boolean value) {#preserveText-boolean-}
```
public void preserveText(boolean value)
```


In XPS, some text elements may contain references to alternate glyph forms that do not correspond to any character code in the font. If this flag is set to true, the text from such XPS elements is converted to graphic shapes. Then the text itself appears transparent on top. This leaves the text of such elements selectable. But the side effect is that the output file may be much larger than the original. If this flag is set to false, the characters that should be displayed as alternate forms are replaced with some other characters that become mapped to the alternate glyph forms. Therefore the text, although still selectable, will be modified and likely become unreadable.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | The flag value. |

### setAdditionalFontsFolders(String[] fontsFolders) {#setAdditionalFontsFolders-java.lang.String---}
```
public void setAdditionalFontsFolders(String[] fontsFolders)
```


Specifies additional fonts folders where converter should find fonts for input document. Default folder is standard fonts folder where OS finds fonts for internal needs.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fontsFolders | java.lang.String[] | An array of fonts folders. |

### setBatchSize(int value) {#setBatchSize-int-}
```
public void setBatchSize(int value)
```


Sets the size of a portion of pages to pass from node to node.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The size of a portion of pages to pass from node to node. |

### setDebug(boolean debug) {#setDebug-boolean-}
```
public void setDebug(boolean debug)
```


Specifies the flag that allows output of warnings and messages during conversion.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| debug | boolean | Boolean value. |

### setEncryptionDetails(PdfEncryptionDetails value) {#setEncryptionDetails-com.aspose.xps.rendering.PdfEncryptionDetails-}
```
public void setEncryptionDetails(PdfEncryptionDetails value)
```


Sets the encryption details. If not set, then no encryption will be performed.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [PdfEncryptionDetails](../../com.aspose.xps.rendering/pdfencryptiondetails) | The encryption details. |

### setImageCompression(PdfImageCompression value) {#setImageCompression-com.aspose.xps.rendering.PdfImageCompression-}
```
public void setImageCompression(PdfImageCompression value)
```


Sets the compression type to be used for all images in the document. Default is  PdfImageCompression.Auto .

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [PdfImageCompression](../../com.aspose.xps.rendering/pdfimagecompression) | The compression type. |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Sets the value specifying the level of compression for an image. Available values are 0 to 100. The lower the number specified, the higher the compression and therefore the lower the quality of the image. 0 value results in lowest quality image, while 100 results in highest.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The value specifying the level of compression for an image. |

### setOutlineTreeExpansionLevel(int value) {#setOutlineTreeExpansionLevel-int-}
```
public void setOutlineTreeExpansionLevel(int value)
```


Sets up to what level the document outline should be expanded when the PDF file is opened in a viewer. 1 - only the first level outline items are shown, 2 - only the first and second level outline items are shown, and so on.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The outline tree expansion level. |

### setOutlineTreeHeight(int value) {#setOutlineTreeHeight-int-}
```
public void setOutlineTreeHeight(int value)
```


Sets the height of the document outline tree to save. 0 - the outline tree will not be converted, 1 - only the first level outline items will be converted, and so on.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The outline tree height. |

### setPageNumbers(int[] value) {#setPageNumbers-int---}
```
public void setPageNumbers(int[] value)
```


Sets the array of numbers of pages to render.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int[] | Numbers of pages. |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


Specifies a size of the page or image.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| size | java.awt.Dimension | Size of the page or image. |

### setSupressErrors(boolean supressErrors) {#setSupressErrors-boolean-}
```
public void setSupressErrors(boolean supressErrors)
```


Specifies the flag that indicates whether errors will be suppressed during conversion.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| supressErrors | boolean | Boolean value. |

### setTextCompression(PdfTextCompression value) {#setTextCompression-com.aspose.xps.rendering.PdfTextCompression-}
```
public void setTextCompression(PdfTextCompression value)
```


Sets the compression type to be used for all content streams except images. Default is  PdfTextCompression.Flate .

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [PdfTextCompression](../../com.aspose.xps.rendering/pdftextcompression) | The compression type. |

### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

