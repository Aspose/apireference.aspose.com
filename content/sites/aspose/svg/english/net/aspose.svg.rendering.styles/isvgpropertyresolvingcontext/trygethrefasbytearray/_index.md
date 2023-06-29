---
title: ISVGPropertyResolvingContext.TryGetHrefAsByteArray
second_title: Aspose.SVG for .NET API Reference
description: ISVGPropertyResolvingContext method. Tries to get the HREF as a byte array with the specified size format and cancellation token
type: docs
weight: 150
url: /net/aspose.svg.rendering.styles/isvgpropertyresolvingcontext/trygethrefasbytearray/
---
## ISVGPropertyResolvingContext.TryGetHrefAsByteArray method

Tries to get the HREF as a byte array, with the specified size, format, and cancellation token.

```csharp
public bool TryGetHrefAsByteArray(Url href, Size size, out byte[] data, out WebImageFormat format, 
    CancellationToken cancellationToken)
```

| Parameter | Type | Description |
| --- | --- | --- |
| href | Url | The URL representing the HREF. |
| size | Size | The desired size of the image. |
| data | Byte[]& | The resulting byte array of the image data. |
| format | WebImageFormat& | The resulting [`WebImageFormat`](../../../aspose.svg.drawing/webimageformat/) of the image. |
| cancellationToken | CancellationToken | The cancellation token. |

### Return Value

`true` if the operation was successful; otherwise, `false`.

### See Also

* class [Url](../../../aspose.svg/url/)
* class [Size](../../../aspose.svg.drawing/size/)
* enum [WebImageFormat](../../../aspose.svg.drawing/webimageformat/)
* interface [ISVGPropertyResolvingContext](../)
* namespace [Aspose.Svg.Rendering.Styles](../../../aspose.svg.rendering.styles/)
* assembly [Aspose.SVG](../../../)
