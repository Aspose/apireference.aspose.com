---
title: Struct
second_title: Aspose.3D for Java API Reference
description: Created by lexchou on 11/13/2017.
type: docs
weight: 262
url: /java/com.aspose.threed/struct/
---

**All Implemented Interfaces:**
java.lang.Cloneable, java.io.Serializable
```
public interface Struct<T> extends Cloneable, Serializable
```

Created by lexchou on 11/13/2017.
## Methods

| Method | Description |
| --- | --- |
| [<T>byVal(T value)](#-T-byVal-T-) | Try to copy the input value if it's Struct |
| [clone()](#clone--) | Clone current instance |
| [copyFrom(T t)](#copyFrom-T-) | Copy internal state from argument t |
### <T>byVal(T value) {#-T-byVal-T-}
```
public static T <T>byVal(T value)
```


Try to copy the input value if it's Struct

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | T | input value to clone |

**Returns:**
T - null if input is null or cloned instance
### clone() {#clone--}
```
public abstract T clone()
```


Clone current instance

**Returns:**
T - cloned instance
### copyFrom(T t) {#copyFrom-T-}
```
public abstract void copyFrom(T t)
```


Copy internal state from argument t

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| t | T | source instance to copy |

