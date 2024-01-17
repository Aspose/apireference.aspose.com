---
title: InterpolationMode
second_title: Aspose.Drawing for Java API Reference
description: The InterpolationMode enumeration specifies the algorithm that is used when images are scaled or rotated.
type: docs
weight: 28
url: /java/com.aspose.drawing.drawing2d/interpolationmode/
---
**Inheritance:**
java.lang.Object, com.aspose.ms.System.ValueType, com.aspose.ms.System.Enum
```
public final class InterpolationMode extends System.Enum
```

The InterpolationMode enumeration specifies the algorithm that is used when images are scaled or rotated.
## Fields

| Field | Description |
| --- | --- |
| [Invalid](#Invalid) | Equivalent to the Invalid element of the QualityMode enumeration. |
| [Default](#Default) | Specifies default mode. |
| [Low](#Low) | Specifies low quality interpolation. |
| [High](#High) | Specifies high quality interpolation. |
| [Bilinear](#Bilinear) | Specifies bilinear interpolation. |
| [Bicubic](#Bicubic) | Specifies bicubic interpolation. |
| [NearestNeighbor](#NearestNeighbor) | Specifies nearest-neighbor interpolation. |
| [HighQualityBilinear](#HighQualityBilinear) | Specifies high-quality, bilinear interpolation. |
| [HighQualityBicubic](#HighQualityBicubic) | Specifies high-quality, bicubic interpolation. |
### Invalid {#Invalid}
```
public static final int Invalid
```


Equivalent to the Invalid element of the QualityMode enumeration.

### Default {#Default}
```
public static final int Default
```


Specifies default mode.

### Low {#Low}
```
public static final int Low
```


Specifies low quality interpolation.

### High {#High}
```
public static final int High
```


Specifies high quality interpolation.

### Bilinear {#Bilinear}
```
public static final int Bilinear
```


Specifies bilinear interpolation. No prefiltering is done. This mode is not suitable for shrinking an image below 50 percent of its original size.

### Bicubic {#Bicubic}
```
public static final int Bicubic
```


Specifies bicubic interpolation. No prefiltering is done. This mode is not suitable for shrinking an image below 25 percent of its original size.

### NearestNeighbor {#NearestNeighbor}
```
public static final int NearestNeighbor
```


Specifies nearest-neighbor interpolation.

### HighQualityBilinear {#HighQualityBilinear}
```
public static final int HighQualityBilinear
```


Specifies high-quality, bilinear interpolation. Prefiltering is performed to ensure high-quality shrinking.

### HighQualityBicubic {#HighQualityBicubic}
```
public static final int HighQualityBicubic
```


Specifies high-quality, bicubic interpolation. Prefiltering is performed to ensure high-quality shrinking. This mode produces the highest quality transformed images.

