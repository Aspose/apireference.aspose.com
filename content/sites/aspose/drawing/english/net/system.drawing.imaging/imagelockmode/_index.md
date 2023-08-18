---
title: Enum ImageLockMode
second_title: Aspose.Drawing for .NET API Reference
description: System.Drawing.Imaging.ImageLockMode enum. Specifies flags that are passed to the flags parameter of the LockBits method. The LockBits method locks a portion of an image so that you can read or write the pixel data
type: docs
weight: 790
url: /net/system.drawing.imaging/imagelockmode/
---
## ImageLockMode enumeration

Specifies flags that are passed to the flags parameter of the [`LockBits`](../../system.drawing/bitmap/lockbits/) method. The [`LockBits`](../../system.drawing/bitmap/lockbits/) method locks a portion of an image so that you can read or write the pixel data.

```csharp
public enum ImageLockMode
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| ReadOnly | `1` | Specifies that a portion of the image is locked for reading. |
| WriteOnly | `2` | Specifies that a portion of the image is locked for writing. |
| ReadWrite | `3` | Specifies that a portion of the image is locked for reading or writing. |
| UserInputBuffer | `4` | Specifies that the buffer used for reading or writing pixel data is allocated by the user. If this flag is set, the *flags* parameter of the [`LockBits`](../../system.drawing/bitmap/lockbits/) method serves as an input parameter (and possibly as an output parameter). If this flag is cleared, then the *flags* parameter serves only as an output parameter. |

### See Also

* namespace [System.Drawing.Imaging](../../system.drawing.imaging/)
* assembly [Aspose.Drawing](../../)


