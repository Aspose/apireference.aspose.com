---
title: DrawingSettings
second_title: Aspose.Drawing for Java API Reference
description: Allows to adjust the behavior of the drawing library in case of using of some features that are not yet implemented completely.
type: docs
weight: 19
url: /java/com.aspose.drawing/drawingsettings/
---
**Inheritance:**
java.lang.Object
```
public final class DrawingSettings
```

Allows to adjust the behavior of the drawing library in case of using of some features that are not yet implemented completely.
## Constructors

| Constructor | Description |
| --- | --- |
| [DrawingSettings()](#DrawingSettings--) |  |
## Methods

| Method | Description |
| --- | --- |
| [getStrictMode()](#getStrictMode--) | Gets a value indicating whether the more strict catching of not implemented features is enabled. |
| [setStrictMode(boolean value)](#setStrictMode-boolean-) | Sets a value indicating whether the more strict catching of not implemented features is enabled. |
### DrawingSettings() {#DrawingSettings--}
```
public DrawingSettings()
```


### getStrictMode() {#getStrictMode--}
```
public static boolean getStrictMode()
```


Gets a value indicating whether the more strict catching of not implemented features is enabled.

--------------------

If set to true, in case of using features/parameters that not work correctly in current implementation the library will throw NotImplementedException. If set to false, some parameters may be ignored to give user program chance to work. In that case the drawing results may look different comparing to GDI+.

**Returns:**
boolean - a value indicating whether the more strict catching of not implemented features is enabled.
### setStrictMode(boolean value) {#setStrictMode-boolean-}
```
public static void setStrictMode(boolean value)
```


Sets a value indicating whether the more strict catching of not implemented features is enabled.

--------------------

If set to true, in case of using features/parameters that not work correctly in current implementation the library will throw NotImplementedException. If set to false, some parameters may be ignored to give user program chance to work. In that case the drawing results may look different comparing to GDI+.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | a value indicating whether the more strict catching of not implemented features is enabled. |

