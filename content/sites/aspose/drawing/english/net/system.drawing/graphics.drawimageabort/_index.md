---
title: Delegate Graphics.DrawImageAbort
second_title: Aspose.Drawing for .NET API Reference
description: Provides a callback method for deciding when the DrawImage method should prematurely cancel execution and stop drawing an image
type: docs
weight: 530
url: /net/system.drawing/graphics.drawimageabort/
---
## Graphics.DrawImageAbort delegate

Provides a callback method for deciding when the [`DrawImage`](../graphics/drawimage/) method should prematurely cancel execution and stop drawing an image.

```csharp
public delegate bool DrawImageAbort(IntPtr callbackdata);
```

| Parameter | Type | Description |
| --- | --- | --- |
| callbackdata | IntPtr | Internal pointer that specifies data for the callback method. This parameter is not passed by all [`DrawImage`](../graphics/drawimage/) overloads. You can test for its absence by checking for the value Zero. |

### Return Value

This method returns true if it decides that the [`DrawImage`](../graphics/drawimage/) method should prematurely stop execution. Otherwise it returns false to indicate that the [`DrawImage`](../graphics/drawimage/) method should continue execution.

### See Also

* class [Graphics](../graphics/)
* namespace [System.Drawing](../../system.drawing/)
* assembly [Aspose.Drawing](../../)


