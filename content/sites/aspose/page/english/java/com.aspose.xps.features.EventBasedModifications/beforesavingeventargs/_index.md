---
title: BeforeSavingEventArgs
second_title: Aspose.Page for Java API Reference
description: Defines the base class for arguments of various before-saving events.
type: docs
weight: 11
url: /java/com.aspose.xps.features.eventbasedmodifications/beforesavingeventargs/
---
**Inheritance:**
java.lang.Object
```
public class BeforeSavingEventArgs<T>
```

Defines the base class for arguments of various before-saving events.
## Methods

| Method | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAbsolutePageNumber()](#getAbsolutePageNumber--) | Returns the current absolute page number across all documents within the XPS package. |
| [getClass()](#getClass--) |  |
| [getDocumentNumber()](#getDocumentNumber--) | Returns the current document number within the XPS package. |
| [getElementAPI()](#getElementAPI--) | Returns the modification API of the element that is about to be saved. |
| [getOutputPageNumber()](#getOutputPageNumber--) | Returns the current output number. |
| [getRelativePageNumber()](#getRelativePageNumber--) | Returns the current page number relative to the current document within the XPS package. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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
### getAbsolutePageNumber() {#getAbsolutePageNumber--}
```
public int getAbsolutePageNumber()
```


Returns the current absolute page number across all documents within the XPS package.

**Returns:**
int - The current absolute page number across all documents within the XPS package.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getDocumentNumber() {#getDocumentNumber--}
```
public int getDocumentNumber()
```


Returns the current document number within the XPS package.

**Returns:**
int - The current document number within the XPS package.
### getElementAPI() {#getElementAPI--}
```
public T getElementAPI()
```


Returns the modification API of the element that is about to be saved.

**Returns:**
T - The modification API of the element that is about to be saved.
### getOutputPageNumber() {#getOutputPageNumber--}
```
public int getOutputPageNumber()
```


Returns the current output number. It differs from **AbsolutePageNumber** if the **PageNumbers** save option is specified.

**Returns:**
int - The current output number.
### getRelativePageNumber() {#getRelativePageNumber--}
```
public int getRelativePageNumber()
```


Returns the current page number relative to the current document within the XPS package.

**Returns:**
int - The current page number relative to the current document within the XPS package.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




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

