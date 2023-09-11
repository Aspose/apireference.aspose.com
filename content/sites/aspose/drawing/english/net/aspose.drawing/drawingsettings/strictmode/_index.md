---
title: DrawingSettings.StrictMode
second_title: Aspose.Drawing for .NET API Reference
description: DrawingSettings property. Gets or sets a value indicating whether the more strict catching of not implemented features is enabled
type: docs
weight: 10
url: /net/aspose.drawing/drawingsettings/strictmode/
---
## DrawingSettings.StrictMode property

Gets or sets a value indicating whether the more strict catching of not implemented features is enabled.

```csharp
public static bool StrictMode { get; set; }
```

## Remarks

If set to true, in case of using features/parameters that not work correctly in current implementation the library will throw NotImplementedException. If set to false, some parameters may be ignored to give user program chance to work. In that case the drawing results may look different comparing to GDI+.

### See Also

* class [DrawingSettings](../)
* namespace [Aspose.Drawing](../../drawingsettings/)
* assembly [Aspose.Drawing.Common](../../../)


