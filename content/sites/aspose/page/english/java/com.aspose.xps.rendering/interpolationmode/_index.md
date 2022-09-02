---
title: InterpolationMode
second_title: Aspose.Page for Java API Reference
description: Specifies the algorithm that is used when images are scaled or rotated.
type: docs
weight: 20
url: /java/com.aspose.xps.rendering/interpolationmode/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum InterpolationMode extends Enum<InterpolationMode>
```

Specifies the algorithm that is used when images are scaled or rotated.
## Fields

| Field | Description |
| --- | --- |
| [Default](#Default) | Specifies default mode. |
| [Low](#Low) | Specifies low quality interpolation. |
| [High](#High) | Specifies high quality interpolation. |
| [Bilinear](#Bilinear) | Specifies bilinear interpolation. |
| [Bicubic](#Bicubic) | Specifies bicubic interpolation. |
| [NearestNeighbor](#NearestNeighbor) | Specifies nearest-neighbor interpolation. |
| [HighQualityBilinear](#HighQualityBilinear) | Specifies high-quality, bilinear interpolation. |
| [HighQualityBicubic](#HighQualityBicubic) | Specifies high-quality, bicubic interpolation. |
## Methods

| Method | Description |
| --- | --- |
| [values()](#values--) |  |
| [valueOf(String name)](#valueOf-java.lang.String-) |  |
### Default {#Default}
```
public static final InterpolationMode Default
```


Specifies default mode.

### Low {#Low}
```
public static final InterpolationMode Low
```


Specifies low quality interpolation.

### High {#High}
```
public static final InterpolationMode High
```


Specifies high quality interpolation.

### Bilinear {#Bilinear}
```
public static final InterpolationMode Bilinear
```


Specifies bilinear interpolation. No prefiltering is done. This mode is not suitable for shrinking an image below 50 percent of its original size.

### Bicubic {#Bicubic}
```
public static final InterpolationMode Bicubic
```


Specifies bicubic interpolation. No prefiltering is done. This mode is not suitable for shrinking an image below 25 percent of its original size.

### NearestNeighbor {#NearestNeighbor}
```
public static final InterpolationMode NearestNeighbor
```


Specifies nearest-neighbor interpolation.

### HighQualityBilinear {#HighQualityBilinear}
```
public static final InterpolationMode HighQualityBilinear
```


Specifies high-quality, bilinear interpolation. Prefiltering is performed to ensure high-quality shrinking.

### HighQualityBicubic {#HighQualityBicubic}
```
public static final InterpolationMode HighQualityBicubic
```


Specifies high-quality, bicubic interpolation. Prefiltering is performed to ensure high-quality shrinking. This mode produces the highest quality transformed images.

### values() {#values--}
```
public static InterpolationMode[] values()
```




**Returns:**
com.aspose.xps.rendering.InterpolationMode[]
### valueOf(String name) {#valueOf-java.lang.String-}
```
public static InterpolationMode valueOf(String name)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String |  |

**Returns:**
[InterpolationMode](../../com.aspose.xps.rendering/interpolationmode)
