---
title: GenerationResult
second_title: Aspose.OMR for Java API Reference
description: The result of the template generation
type: docs
weight: 14
url: /java/com.aspose.omr/generationresult/
---

**Inheritance:**
java.lang.Object
```
public class GenerationResult
```

The result of the template generation. Contains the template image and the template (json that describes elements location on the image).
## Methods

| Method | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object) |  |
| [getClass()](#getClass) |  |
| [getErrorCode()](#getErrorCode) | Gets or sets the error code. |
| [getErrorMessage()](#getErrorMessage) | Gets or sets the message describing error. |
| [getTemplate()](#getTemplate) | Gets the Template JSON string |
| [getTemplateImage()](#getTemplateImage) | Gets or sets the generated Template Image |
| [getWarnings()](#getWarnings) | Gets or sets list of the warnings messages describing non-critical faults appeared during generation |
| [hashCode()](#hashCode) |  |
| [notify()](#notify) |  |
| [notifyAll()](#notifyAll) |  |
| [save(String folder, String name)](#save-java.lang.String-java.lang.String) | Save template image and template to the specified folder |
| [setErrorCode(int value)](#setErrorCode-int) | Gets or sets the error code. |
| [setErrorMessage(String value)](#setErrorMessage-java.lang.String) | Gets or sets the message describing error. |
| [setTemplate(String value)](#setTemplate-java.lang.String) | Sets the Template JSON string |
| [setTemplateImage(BufferedImage value)](#setTemplateImage-java.awt.image.BufferedImage) | Gets or sets the generated Template Image |
| [setWarnings(List<String> value)](#setWarnings-java.util.List-java.lang.String) | Gets or sets list of the warnings messages describing non-critical faults appeared during generation |
| [toString()](#toString) |  |
| [wait()](#wait) |  |
| [wait(long arg0)](#wait-long) |  |
| [wait(long arg0, int arg1)](#wait-long-int) |  |
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
### getClass() {#getClass}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getErrorCode() {#getErrorCode}
```
public final int getErrorCode()
```


Gets or sets the error code. Equals 0 if no errors occured.

**Returns:**
int - the error code
### getErrorMessage() {#getErrorMessage}
```
public final String getErrorMessage()
```


Gets or sets the message describing error. Empty if no errors occured.

**Returns:**
java.lang.String - the message describing error
### getTemplate() {#getTemplate}
```
public final String getTemplate()
```


Gets the Template JSON string

**Returns:**
java.lang.String - the Template JSON string
### getTemplateImage() {#getTemplateImage}
```
public final BufferedImage getTemplateImage()
```


Gets or sets the generated Template Image

**Returns:**
java.awt.image.BufferedImage
### getWarnings() {#getWarnings}
```
public final List<String> getWarnings()
```


Gets or sets list of the warnings messages describing non-critical faults appeared during generation

**Returns:**
java.util.List<java.lang.String>
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




### save(String folder, String name) {#save-java.lang.String-java.lang.String}
```
public final void save(String folder, String name)
```


Save template image and template to the specified folder

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| folder | java.lang.String | Destination folder |
| name | java.lang.String | Name of the template |

### setErrorCode(int value) {#setErrorCode-int}
```
public final void setErrorCode(int value)
```


Gets or sets the error code. Equals 0 if no errors occured.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | the error code |

### setErrorMessage(String value) {#setErrorMessage-java.lang.String}
```
public final void setErrorMessage(String value)
```


Gets or sets the message describing error. Empty if no errors occured.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | the message describing error |

### setTemplate(String value) {#setTemplate-java.lang.String}
```
public final void setTemplate(String value)
```


Sets the Template JSON string

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | the Template JSON string |

### setTemplateImage(BufferedImage value) {#setTemplateImage-java.awt.image.BufferedImage}
```
public final void setTemplateImage(BufferedImage value)
```


Gets or sets the generated Template Image

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.awt.image.BufferedImage |  |

### setWarnings(List<String> value) {#setWarnings-java.util.List-java.lang.String}
```
public final void setWarnings(List<String> value)
```


Gets or sets list of the warnings messages describing non-critical faults appeared during generation

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.util.List<java.lang.String> |  |

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

