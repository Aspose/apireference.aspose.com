---
title: Enum ImageLockMode
second_title: Aspose.Page for .NET API Reference
description: Aspose.Page.Drawing.Imaging.ImageLockMode enum. Specifies flags that are passed to the flags parameter of the OverloadAspose.Page.Drawing.Bitmap.LockBits method. The OverloadAspose.Page.Drawing.Bitmap.LockBits method locks a portion of an image so that you can read or write the pixel data
type: docs
weight: 330
url: /net/aspose.page.drawing.imaging/imagelockmode/
---
## ImageLockMode enumeration

Specifies flags that are passed to the flags parameter of the !:Overload:Aspose.Page.Drawing.Bitmap.LockBits method. The !:Overload:Aspose.Page.Drawing.Bitmap.LockBits method locks a portion of an image so that you can read or write the pixel data.

```csharp
public enum ImageLockMode
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| ReadOnly | `1` | Specifies that a portion of the image is locked for reading. |
| WriteOnly | `2` | Specifies that a portion of the image is locked for writing. |
| ReadWrite | `3` | Specifies that a portion of the image is locked for reading or writing. |
| UserInputBuffer | `4` | Specifies that the buffer used for reading or writing pixel data is allocated by the user. If this flag is set, the *flags* parameter of the !:Overload:System.Drawing.Bitmap.LockBits method serves as an input parameter (and possibly as an output parameter). If this flag is cleared, then the *flags* parameter serves only as an output parameter. |

### See Also

* namespace [Aspose.Page.Drawing.Imaging](../../aspose.page.drawing.imaging/)
* assembly [Aspose.Page](../../)


