---
title: ImageLockMode
second_title: Aspose.Drawing for Java API Reference
description: Specifies flags that are passed to the flags parameter of the  method.
type: docs
weight: 28
url: /java/com.aspose.drawing.imaging/imagelockmode/
---
**Inheritance:**
java.lang.Object, com.aspose.ms.System.ValueType, com.aspose.ms.System.Enum
```
public final class ImageLockMode extends System.Enum
```

Specifies flags that are passed to the flags parameter of the [Bitmap.lockBits(Rectangle, int, int)](../../com.aspose.drawing/bitmap\#lockBits-Rectangle--int--int-) method. The [Bitmap.lockBits(Rectangle, int, int)](../../com.aspose.drawing/bitmap\#lockBits-Rectangle--int--int-) method locks a portion of an image so that you can read or write the pixel data.
## Fields

| Field | Description |
| --- | --- |
| [ReadOnly](#ReadOnly) | Specifies that a portion of the image is locked for reading. |
| [WriteOnly](#WriteOnly) | Specifies that a portion of the image is locked for writing. |
| [ReadWrite](#ReadWrite) | Specifies that a portion of the image is locked for reading or writing. |
| [UserInputBuffer](#UserInputBuffer) | Specifies that the buffer used for reading or writing pixel data is allocated by the user. |
### ReadOnly {#ReadOnly}
```
public static final int ReadOnly
```


Specifies that a portion of the image is locked for reading.

### WriteOnly {#WriteOnly}
```
public static final int WriteOnly
```


Specifies that a portion of the image is locked for writing.

### ReadWrite {#ReadWrite}
```
public static final int ReadWrite
```


Specifies that a portion of the image is locked for reading or writing.

### UserInputBuffer {#UserInputBuffer}
```
public static final int UserInputBuffer
```


Specifies that the buffer used for reading or writing pixel data is allocated by the user. If this flag is set, the `flags` parameter of the [Bitmap.lockBits(Rectangle, int, int)](../../com.aspose.drawing/bitmap\#lockBits-Rectangle--int--int-) method serves as an input parameter (and possibly as an output parameter). If this flag is cleared, then the `flags` parameter serves only as an output parameter.

