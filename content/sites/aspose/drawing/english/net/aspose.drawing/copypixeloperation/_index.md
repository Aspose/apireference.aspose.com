---
title: Enum CopyPixelOperation
second_title: Aspose.Drawing for .NET API Reference
description: Aspose.Drawing.CopyPixelOperation enum. Determines how the source color in a copy pixel operation is combined with the destination color to result in a final color
type: docs
weight: 90
url: /net/aspose.drawing/copypixeloperation/
---
## CopyPixelOperation enumeration

Determines how the source color in a copy pixel operation is combined with the destination color to result in a final color.

```csharp
public enum CopyPixelOperation
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| NoMirrorBitmap | `-2147483648` | The bitmap is not mirrored. |
| Blackness | `66` | The destination area is filled by using the color associated with index 0 in the physical palette. (This color is black for the default physical palette.) |
| NotSourceErase | `1114278` | The source and destination colors are combined using the Boolean `OR` operator, and then resultant color is then inverted. |
| NotSourceCopy | `3342344` | The inverted source area is copied to the destination. |
| SourceErase | `4457256` | The inverted colors of the destination area are combined with the colors of the source area using the Boolean `AND` operator. |
| DestinationInvert | `5570569` | The destination area is inverted. |
| PatInvert | `5898313` | The colors of the brush currently selected in the destination device context are combined with the colors of the destination are using the Boolean `XOR` operator. |
| SourceInvert | `6684742` | The colors of the source and destination areas are combined using the Boolean `XOR` operator. |
| SourceAnd | `8913094` | The colors of the source and destination areas are combined using the Boolean `AND` operator. |
| MergePaint | `12255782` | The colors of the inverted source area are merged with the colors of the destination area by using the Boolean `OR` operator. |
| MergeCopy | `12583114` | The colors of the source area are merged with the colors of the selected brush of the destination device context using the Boolean `AND` operator. |
| SourceCopy | `13369376` | The source area is copied directly to the destination area. |
| SourcePaint | `15597702` | The colors of the source and destination areas are combined using the Boolean `OR` operator. |
| PatCopy | `15728673` | The brush currently selected in the destination device context is copied to the destination bitmap. |
| PatPaint | `16452105` | The colors of the brush currently selected in the destination device context are combined with the colors of the inverted source area using the Boolean `OR` operator. The result of this operation is combined with the colors of the destination area using the Boolean `OR` operator. |
| Whiteness | `16711778` | The destination area is filled by using the color associated with index 1 in the physical palette. (This color is white for the default physical palette.) |
| CaptureBlt | `1073741824` | Windows that are layered on top of your window are included in the resulting image. By default, the image contains only your window. Note that this generally cannot be used for printing device contexts. |

### See Also

* namespace [Aspose.Drawing](../../aspose.drawing/)
* assembly [Aspose.Drawing.Common](../../)


