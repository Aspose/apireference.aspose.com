---
title: "ResizeType"
linktitle: "ResizeType"
second_title: "Aspose.CAD for Java"
description: "Specifies the resize type."
type: docs
weight: 10
url: /java/com.aspose.cad/resizetype/
---

**Inheritance:** java.lang.Object, com.aspose.ms.System.Enum

Specifies the resize type.

## Enum Values

| Field | Description |
| --- | --- |
| [None](#None) | The pixels are not preserved during resize operation. |
| [LeftTopToLeftTop](#LeftTopToLeftTop) | Left top point of the new image will coincide with the left top point of the original image. Crop will occur if required. |
| [RightTopToRightTop](#RightTopToRightTop) | Right top point of the new image will coincide with the right top point of the original image. Crop will occur if required. |
| [RightBottomToRightBottom](#RightBottomToRightBottom) | Right bottom point of the new image will coincide with the right bottom point of the original image. Crop will occur if required. |
| [LeftBottomToLeftBottom](#LeftBottomToLeftBottom) | Left bottom point of the new image will coincide with the left bottom point of the original image. Crop will occur if required. |
| [CenterToCenter](#CenterToCenter) | Center of the new image will coincide with the center of the original image. Crop will occur if required. |
| [LanczosResample](#LanczosResample) | Resample using lanczos algorithm with a=3. |
| [NearestNeighbourResample](#NearestNeighbourResample) | Resample using nearest neighbour algorithm. |
| [AdaptiveResample](#AdaptiveResample) | Resample using adaptive algorithm based on weighted and blended rational function and lanczos3 interpolation algorithms. |
| [BilinearResample](#BilinearResample) | Resample using bilinear interpolation. Image pre-filtering is allowed to remove the noice before resample, when needed |

### None {#None}
```java
public static final int None
```

The pixels are not preserved during resize operation.

**Returns:** int

### LeftTopToLeftTop {#LeftTopToLeftTop}
```java
public static final int LeftTopToLeftTop
```

Left top point of the new image will coincide with the left top point of the original image. Crop will occur if required.

**Returns:** int

### RightTopToRightTop {#RightTopToRightTop}
```java
public static final int RightTopToRightTop
```

Right top point of the new image will coincide with the right top point of the original image. Crop will occur if required.

**Returns:** int

### RightBottomToRightBottom {#RightBottomToRightBottom}
```java
public static final int RightBottomToRightBottom
```

Right bottom point of the new image will coincide with the right bottom point of the original image. Crop will occur if required.

**Returns:** int

### LeftBottomToLeftBottom {#LeftBottomToLeftBottom}
```java
public static final int LeftBottomToLeftBottom
```

Left bottom point of the new image will coincide with the left bottom point of the original image. Crop will occur if required.

**Returns:** int

### CenterToCenter {#CenterToCenter}
```java
public static final int CenterToCenter
```

Center of the new image will coincide with the center of the original image. Crop will occur if required.

**Returns:** int

### LanczosResample {#LanczosResample}
```java
public static final int LanczosResample
```

Resample using lanczos algorithm with a=3.

**Returns:** int

### NearestNeighbourResample {#NearestNeighbourResample}
```java
public static final int NearestNeighbourResample
```

Resample using nearest neighbour algorithm.

**Returns:** int

### AdaptiveResample {#AdaptiveResample}
```java
public static final int AdaptiveResample
```

Resample using adaptive algorithm based on weighted and blended rational function and lanczos3 interpolation algorithms.

**Returns:** int

### BilinearResample {#BilinearResample}
```java
public static final int BilinearResample
```

Resample using bilinear interpolation. Image pre-filtering is allowed to remove the noice before resample, when needed

**Returns:** int

