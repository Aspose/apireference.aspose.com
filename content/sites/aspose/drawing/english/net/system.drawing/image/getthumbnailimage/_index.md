---
title: Image.GetThumbnailImage
second_title: Aspose.Drawing for .NET API Reference
description: Image method. Returns a thumbnail for this Image
type: docs
weight: 230
url: /net/system.drawing/image/getthumbnailimage/
---
## Image.GetThumbnailImage method

Returns a thumbnail for this Image.

```csharp
public Image GetThumbnailImage(int thumbWidth, int thumbHeight, GetThumbnailImageAbort callback, 
    IntPtr callbackData)
```

| Parameter | Type | Description |
| --- | --- | --- |
| thumbWidth | Int32 | The width, in pixels, of the requested thumbnail image. |
| thumbHeight | Int32 | The height, in pixels, of the requested thumbnail image. |
| callback | GetThumbnailImageAbort | A [`GetThumbnailImageAbort`](../../image.getthumbnailimageabort/) delegate. Note You must create a delegate and pass a reference to the delegate as the *callback* parameter, but the delegate is not used. |
| callbackData | IntPtr | Must be Zero. |

### Return Value

An Image that represents the thumbnail.

### See Also

* delegate [GetThumbnailImageAbort](../../image.getthumbnailimageabort/)
* class [Image](../)
* namespace [System.Drawing](../../image/)
* assembly [Aspose.Drawing](../../../)


