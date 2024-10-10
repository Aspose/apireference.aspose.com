---
title: PdfOptimizationMode
second_title: Aspose.OCR for Java API Reference
description: Significantly reduce the PDF file size at the expense of lower image quality
type: docs
weight: 42
url: /java/com.aspose.ocr/pdfoptimizationmode/
---

**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum PdfOptimizationMode extends Enum<PdfOptimizationMode>
```

Significantly reduce the PDF file size at the expense of lower image quality.

Specify the balance between file size and image quality of saved PDFs.
## Fields

| Field | Description |
| --- | --- |
| [AGGRESSIVE](#AGGRESSIVE) | Significantly reduce the PDF file size at the expense of lower image quality. |
| [BALANCED](#BALANCED) | Downsample images to balance file size and image quality. |
| [HIGH_QUALITY](#HIGH-QUALITY) | Smaller PDF file size at the expense of slight image downsampling. |
| [MAXIMUM_QUALITY](#MAXIMUM-QUALITY) | Optimize file size while preserving the highest image quality. |
| [NONE](#NONE) | Do not optimize PDF size. |
## Methods

| Method | Description |
| --- | --- |
| [<T>valueOf(Class<T> arg0, String arg1)](#-T-valueOf-java.lang.Class-T--java.lang.String) |  |
| [compareTo(E arg0)](#compareTo-E) |  |
| [equals(Object arg0)](#equals-java.lang.Object) |  |
| [getClass()](#getClass) |  |
| [getDeclaringClass()](#getDeclaringClass) |  |
| [getValue()](#getValue) |  |
| [hashCode()](#hashCode) |  |
| [name()](#name) |  |
| [notify()](#notify) |  |
| [notifyAll()](#notifyAll) |  |
| [ordinal()](#ordinal) |  |
| [toString()](#toString) |  |
| [valueOf(String name)](#valueOf-java.lang.String) |  |
| [values()](#values) |  |
| [wait()](#wait) |  |
| [wait(long arg0)](#wait-long) |  |
| [wait(long arg0, int arg1)](#wait-long-int) |  |
### AGGRESSIVE {#AGGRESSIVE}
```
public static final PdfOptimizationMode AGGRESSIVE
```


Significantly reduce the PDF file size at the expense of lower image quality.

### BALANCED {#BALANCED}
```
public static final PdfOptimizationMode BALANCED
```


Downsample images to balance file size and image quality.

### HIGH_QUALITY {#HIGH-QUALITY}
```
public static final PdfOptimizationMode HIGH_QUALITY
```


Smaller PDF file size at the expense of slight image downsampling.

### MAXIMUM_QUALITY {#MAXIMUM-QUALITY}
```
public static final PdfOptimizationMode MAXIMUM_QUALITY
```


Optimize file size while preserving the highest image quality.

### NONE {#NONE}
```
public static final PdfOptimizationMode NONE
```


Do not optimize PDF size.

### <T>valueOf(Class<T> arg0, String arg1) {#-T-valueOf-java.lang.Class-T--java.lang.String}
```
public static T <T>valueOf(Class<T> arg0, String arg1)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | java.lang.Class<T> |  |
| arg1 | java.lang.String |  |

**Returns:**
T
### compareTo(E arg0) {#compareTo-E}
```
public final int compareTo(E arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | E |  |

**Returns:**
int
### equals(Object arg0) {#equals-java.lang.Object}
```
public final boolean equals(Object arg0)
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
### getDeclaringClass() {#getDeclaringClass}
```
public final Class<E> getDeclaringClass()
```




**Returns:**
java.lang.Class<E>
### getValue() {#getValue}
```
public int getValue()
```




**Returns:**
int
### hashCode() {#hashCode}
```
public final int hashCode()
```




**Returns:**
int
### name() {#name}
```
public final String name()
```




**Returns:**
java.lang.String
### notify() {#notify}
```
public final native void notify()
```




### notifyAll() {#notifyAll}
```
public final native void notifyAll()
```




### ordinal() {#ordinal}
```
public final int ordinal()
```




**Returns:**
int
### toString() {#toString}
```
public String toString()
```




**Returns:**
java.lang.String
### valueOf(String name) {#valueOf-java.lang.String}
```
public static PdfOptimizationMode valueOf(String name)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String |  |

**Returns:**
[PdfOptimizationMode](../../com.aspose.ocr/pdfoptimizationmode/)
### values() {#values}
```
public static PdfOptimizationMode[] values()
```




**Returns:**
com.aspose.ocr.PdfOptimizationMode[]
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

