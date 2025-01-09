---
title: IBuffer
second_title: Aspose.3D for Java API Reference
description: The base interface of all managed buffers used in rendering
type: docs
weight: 223
url: /java/com.aspose.threed/ibuffer/
---

**All Implemented Interfaces:**
java.io.Closeable
```
public interface IBuffer extends Closeable
```

The base interface of all managed buffers used in rendering
## Methods

| Method | Description |
| --- | --- |
| [getSize()](#getSize--) | Size of this buffer in bytes |
| [loadData(byte[] data)](#loadData-byte---) | Load the data into current buffer |
### getSize() {#getSize--}
```
public abstract int getSize()
```


Size of this buffer in bytes

**Returns:**
int - Size of this buffer in bytes
### loadData(byte[] data) {#loadData-byte---}
```
public abstract void loadData(byte[] data)
```


Load the data into current buffer

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| data | byte[] |  |

