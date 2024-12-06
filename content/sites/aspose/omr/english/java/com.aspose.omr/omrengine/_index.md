---
title: OmrEngine
second_title: Aspose.OMR for Java API Reference
description: The OMR engine
type: docs
weight: 22
url: /java/com.aspose.omr/omrengine/
---

**Inheritance:**
java.lang.Object
```
public class OmrEngine
```

The OMR engine. Handles the creation of the template and image processing classes and GUI components.
## Constructors

| Constructor | Description |
| --- | --- |
| [OmrEngine()](#OmrEngine) |  |
## Methods

| Method | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object) |  |
| [generateTemplate(String markupPath)](#generateTemplate-java.lang.String) | Creates template (.omr) and template image based on text markup |
| [generateTemplate(String markupPath, GlobalPageSettings settings)](#generateTemplate-java.lang.String-com.aspose.omr.GlobalPageSettings) | Creates template (.omr) and template image based on text markup |
| [generateTemplate(String markupPath, ImageCollection collection)](#generateTemplate-java.lang.String-com.aspose.omr.ImageCollection) | Creates template (.omr) and template image based on text markup |
| [generateTemplate(String markupPath, ImageCollection collection, GlobalPageSettings settings)](#generateTemplate-java.lang.String-com.aspose.omr.ImageCollection-com.aspose.omr.GlobalPageSettings) | Creates template (.omr) and template image based on text markup |
| [getClass()](#getClass) |  |
| [getTemplateProcessor(String templatePath)](#getTemplateProcessor-java.lang.String) | Creates the [TemplateProcessor](../../com.aspose.omr/templateprocessor/) instance that allows working with specified template. |
| [hashCode()](#hashCode) |  |
| [notify()](#notify) |  |
| [notifyAll()](#notifyAll) |  |
| [toString()](#toString) |  |
| [wait()](#wait) |  |
| [wait(long arg0)](#wait-long) |  |
| [wait(long arg0, int arg1)](#wait-long-int) |  |
### OmrEngine() {#OmrEngine}
```
public OmrEngine()
```


### equals(Object arg0) {#equals-java.lang.Object}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### generateTemplate(String markupPath) {#generateTemplate-java.lang.String}
```
public final GenerationResult generateTemplate(String markupPath)
```


Creates template (.omr) and template image based on text markup

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| markupPath | java.lang.String | Path to the text markup file |

**Returns:**
[GenerationResult](../../com.aspose.omr/generationresult/) - Generation result
### generateTemplate(String markupPath, GlobalPageSettings settings) {#generateTemplate-java.lang.String-com.aspose.omr.GlobalPageSettings}
```
public final GenerationResult generateTemplate(String markupPath, GlobalPageSettings settings)
```


Creates template (.omr) and template image based on text markup

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| markupPath | java.lang.String | Path to the text markup file |
| settings | [GlobalPageSettings](../../com.aspose.omr/globalpagesettings/) | global settings for each page |

**Returns:**
[GenerationResult](../../com.aspose.omr/generationresult/) - Generation result
### generateTemplate(String markupPath, ImageCollection collection) {#generateTemplate-java.lang.String-com.aspose.omr.ImageCollection}
```
public final GenerationResult generateTemplate(String markupPath, ImageCollection collection)
```


Creates template (.omr) and template image based on text markup

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| markupPath | java.lang.String | Path to the text markup file |
| collection | [ImageCollection](../../com.aspose.omr/imagecollection/) | Collection of images to be used in this template generation |

**Returns:**
[GenerationResult](../../com.aspose.omr/generationresult/) - Generation result
### generateTemplate(String markupPath, ImageCollection collection, GlobalPageSettings settings) {#generateTemplate-java.lang.String-com.aspose.omr.ImageCollection-com.aspose.omr.GlobalPageSettings}
```
public final GenerationResult generateTemplate(String markupPath, ImageCollection collection, GlobalPageSettings settings)
```


Creates template (.omr) and template image based on text markup

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| markupPath | java.lang.String | Path to the text markup file |
| collection | [ImageCollection](../../com.aspose.omr/imagecollection/) | Collection of images to be used in this template generation |
| settings | [GlobalPageSettings](../../com.aspose.omr/globalpagesettings/) | global settings for each page |

**Returns:**
[GenerationResult](../../com.aspose.omr/generationresult/) - Generation result
### getClass() {#getClass}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getTemplateProcessor(String templatePath) {#getTemplateProcessor-java.lang.String}
```
public final TemplateProcessor getTemplateProcessor(String templatePath)
```


Creates the [TemplateProcessor](../../com.aspose.omr/templateprocessor/) instance that allows working with specified template.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| templatePath | java.lang.String | The path to the OMR template file |

**Returns:**
[TemplateProcessor](../../com.aspose.omr/templateprocessor/) - The [TemplateProcessor](../../com.aspose.omr/templateprocessor/) instance
### hashCode() {#hashCode}
```
public native int hashCode()
```




**Returns:**
int
### notify() {#notify}
```
public final native void notify()
```




### notifyAll() {#notifyAll}
```
public final native void notifyAll()
```




### toString() {#toString}
```
public String toString()
```




**Returns:**
java.lang.String
### wait() {#wait}
```
public final void wait()
```




### wait(long arg0) {#wait-long}
```
public final native void wait(long arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

