---
title: CopyPixelOperation
second_title: Aspose.Drawing for Java API Reference
description: Determines how the source color in a copy pixel operation is combined with the destination color to result in a final color.
type: docs
weight: 18
url: /java/com.aspose.drawing/copypixeloperation/
---
**Inheritance:**
java.lang.Object, com.aspose.ms.System.ValueType, com.aspose.ms.System.Enum
```
public final class CopyPixelOperation extends System.Enum
```

Determines how the source color in a copy pixel operation is combined with the destination color to result in a final color.
## Fields

| Field | Description |
| --- | --- |
| [NoMirrorBitmap](#NoMirrorBitmap) | The bitmap is not mirrored. |
| [Blackness](#Blackness) | The destination area is filled by using the color associated with index 0 in the physical palette. |
| [NotSourceErase](#NotSourceErase) | The source and destination colors are combined using the Boolean `OR` operator, and then resultant color is then inverted. |
| [NotSourceCopy](#NotSourceCopy) | The inverted source area is copied to the destination. |
| [SourceErase](#SourceErase) | The inverted colors of the destination area are combined with the colors of the source area using the Boolean `AND` operator. |
| [DestinationInvert](#DestinationInvert) | The destination area is inverted. |
| [PatInvert](#PatInvert) | The colors of the brush currently selected in the destination device context are combined with the colors of the destination are using the Boolean `XOR` operator. |
| [SourceInvert](#SourceInvert) | The colors of the source and destination areas are combined using the Boolean `XOR` operator. |
| [SourceAnd](#SourceAnd) | The colors of the source and destination areas are combined using the Boolean `AND` operator. |
| [MergePaint](#MergePaint) | The colors of the inverted source area are merged with the colors of the destination area by using the Boolean `OR` operator. |
| [MergeCopy](#MergeCopy) | The colors of the source area are merged with the colors of the selected brush of the destination device context using the Boolean `AND` operator. |
| [SourceCopy](#SourceCopy) | The source area is copied directly to the destination area. |
| [SourcePaint](#SourcePaint) | The colors of the source and destination areas are combined using the Boolean `OR` operator. |
| [PatCopy](#PatCopy) | The brush currently selected in the destination device context is copied to the destination bitmap. |
| [PatPaint](#PatPaint) | The colors of the brush currently selected in the destination device context are combined with the colors of the inverted source area using the Boolean `OR` operator. |
| [Whiteness](#Whiteness) | The destination area is filled by using the color associated with index 1 in the physical palette. |
| [CaptureBlt](#CaptureBlt) | Windows that are layered on top of your window are included in the resulting image. |
### NoMirrorBitmap {#NoMirrorBitmap}
```
public static final int NoMirrorBitmap
```


The bitmap is not mirrored.

### Blackness {#Blackness}
```
public static final int Blackness
```


The destination area is filled by using the color associated with index 0 in the physical palette. (This color is black for the default physical palette.)

### NotSourceErase {#NotSourceErase}
```
public static final int NotSourceErase
```


The source and destination colors are combined using the Boolean `OR` operator, and then resultant color is then inverted.

### NotSourceCopy {#NotSourceCopy}
```
public static final int NotSourceCopy
```


The inverted source area is copied to the destination.

### SourceErase {#SourceErase}
```
public static final int SourceErase
```


The inverted colors of the destination area are combined with the colors of the source area using the Boolean `AND` operator.

### DestinationInvert {#DestinationInvert}
```
public static final int DestinationInvert
```


The destination area is inverted.

### PatInvert {#PatInvert}
```
public static final int PatInvert
```


The colors of the brush currently selected in the destination device context are combined with the colors of the destination are using the Boolean `XOR` operator.

### SourceInvert {#SourceInvert}
```
public static final int SourceInvert
```


The colors of the source and destination areas are combined using the Boolean `XOR` operator.

### SourceAnd {#SourceAnd}
```
public static final int SourceAnd
```


The colors of the source and destination areas are combined using the Boolean `AND` operator.

### MergePaint {#MergePaint}
```
public static final int MergePaint
```


The colors of the inverted source area are merged with the colors of the destination area by using the Boolean `OR` operator.

### MergeCopy {#MergeCopy}
```
public static final int MergeCopy
```


The colors of the source area are merged with the colors of the selected brush of the destination device context using the Boolean `AND` operator.

### SourceCopy {#SourceCopy}
```
public static final int SourceCopy
```


The source area is copied directly to the destination area.

### SourcePaint {#SourcePaint}
```
public static final int SourcePaint
```


The colors of the source and destination areas are combined using the Boolean `OR` operator.

### PatCopy {#PatCopy}
```
public static final int PatCopy
```


The brush currently selected in the destination device context is copied to the destination bitmap.

### PatPaint {#PatPaint}
```
public static final int PatPaint
```


The colors of the brush currently selected in the destination device context are combined with the colors of the inverted source area using the Boolean `OR` operator. The result of this operation is combined with the colors of the destination area using the Boolean `OR` operator.

### Whiteness {#Whiteness}
```
public static final int Whiteness
```


The destination area is filled by using the color associated with index 1 in the physical palette. (This color is white for the default physical palette.)

### CaptureBlt {#CaptureBlt}
```
public static final int CaptureBlt
```


Windows that are layered on top of your window are included in the resulting image. By default, the image contains only your window. Note that this generally cannot be used for printing device contexts.

