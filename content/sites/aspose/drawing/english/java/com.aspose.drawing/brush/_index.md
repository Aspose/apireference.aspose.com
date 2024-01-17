---
title: Brush
second_title: Aspose.Drawing for Java API Reference
description: Defines objects used to fill the interiors of graphical shapes such as rectangles ellipses pies polygons and paths.
type: docs
weight: 11
url: /java/com.aspose.drawing/brush/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
com.aspose.ms.System.IDisposable
```
public abstract class Brush implements System.IDisposable
```

Defines objects used to fill the interiors of graphical shapes such as rectangles, ellipses, pies, polygons, and paths.
## Constructors

| Constructor | Description |
| --- | --- |
| [Brush()](#Brush--) |  |
## Methods

| Method | Description |
| --- | --- |
| [deepClone()](#deepClone--) | When overridden in a derived class, creates an exact copy of this [Brush](../../com.aspose.drawing/brush). |
| [dispose()](#dispose--) | Releases all resources used by this Brush object. |
| [getOpacity()](#getOpacity--) |  |
| [setOpacity(float v)](#setOpacity-float-) |  |
### Brush() {#Brush--}
```
public Brush()
```


### deepClone() {#deepClone--}
```
public abstract Object deepClone()
```


When overridden in a derived class, creates an exact copy of this [Brush](../../com.aspose.drawing/brush).

**Returns:**
java.lang.Object - The new [Brush](../../com.aspose.drawing/brush) that this method creates.
### dispose() {#dispose--}
```
public final void dispose()
```


Releases all resources used by this Brush object.

--------------------

This method actually does nothing. It's just for compatibility with System.Drawing API.

### getOpacity() {#getOpacity--}
```
public float getOpacity()
```




**Returns:**
float
### setOpacity(float v) {#setOpacity-float-}
```
public void setOpacity(float v)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| v | float |  |

