---
title: PreprocessingFilter
second_title: Aspose.OCR for Java API Reference
description: Base class for image processing commands
type: docs
weight: 24
url: /java/com.aspose.ocr/preprocessingfilter/
---

**Inheritance:**
java.lang.Object
```
public class PreprocessingFilter
```

Base class for image processing commands.
## Constructors

| Constructor | Description |
| --- | --- |
| [PreprocessingFilter()](#PreprocessingFilter) |  |
## Fields

| Field | Description |
| --- | --- |
| [Empty](#Empty) |  |
## Methods

| Method | Description |
| --- | --- |
| [AutoDenoising()](#AutoDenoising) | Enables the use of an additional neural network to improve the image - reduce noise. |
| [AutoDenoising(Rectangle area)](#AutoDenoising-java.awt.Rectangle) | Enables the use of an additional neural network to improve the part of the image - reduce noise. |
| [AutoDewarping()](#AutoDewarping) | Automatically corrects geometric distortions in the image. |
| [AutoSkew()](#AutoSkew) | Enables the automatic image skew correction. |
| [AutoSkew(Rectangle area)](#AutoSkew-java.awt.Rectangle) | Enables the automatic image part skew correction. |
| [Binarize()](#Binarize) | Converts an image to black-and-white image. |
| [Binarize(Rectangle area)](#Binarize-java.awt.Rectangle) | Converts a part of the image to black-and-white image. |
| [BinarizeAndDilate()](#BinarizeAndDilate) | Dilation adds pixels to the boundaries of objects in an image. |
| [BinarizeAndDilate(Rectangle area)](#BinarizeAndDilate-java.awt.Rectangle) | Dilation adds pixels to the boundaries of objects in a part of the image. |
| [ContrastCorrection()](#ContrastCorrection) | Contrast correction filter. |
| [ContrastCorrection(Rectangle area)](#ContrastCorrection-java.awt.Rectangle) | Contrast correction filter for the part of the image. |
| [Invert()](#Invert) | Automatically inverts colors in a document image. |
| [Invert(Rectangle area)](#Invert-java.awt.Rectangle) | Automatically inverts colors in a part of the image. |
| [Median()](#Median) | The median filter run through each element of the image and replace each pixel with the median of its neighboring pixels. |
| [Median(Rectangle area)](#Median-java.awt.Rectangle) | The median filter run through each element of the part of the image and replace each pixel with the median of its neighboring pixels. |
| [Resize(int width, int height)](#Resize-int-int) | Rescale image - Upscale or downscale image resolution. |
| [Resize(int width, int height, InterpolationFilterType type)](#Resize-int-int-com.aspose.ocr.InterpolationFilterType) | Rescale image - upscale or downscale image resolution. |
| [Rotate(float angle)](#Rotate-float) | Rotate original image. |
| [Rotate(float angle, Rectangle area)](#Rotate-float-java.awt.Rectangle) | Rotate the part of the image. |
| [Scale(float ratio)](#Scale-float) | Rescale image - Upscale or downscale image resolution. |
| [Scale(float ratio, InterpolationFilterType type)](#Scale-float-com.aspose.ocr.InterpolationFilterType) | Rescale image - Upscale or downscale image resolution. |
| [Threshold(int value)](#Threshold-int) | Create a binary image based on setting a threshold value on the pixel intensity of the original image. |
| [Threshold(int value, Rectangle area)](#Threshold-int-java.awt.Rectangle) | Create a binary image part based on setting a threshold value on the pixel intensity of the original image part. |
| [ToGrayscale()](#ToGrayscale) | Converts an image to grayscale image. |
| [add(PreprocessingFilter filter)](#add-com.aspose.ocr.PreprocessingFilter) | Add the new filter to the collection to further run all operations. |
| [equals(Object arg0)](#equals-java.lang.Object) |  |
| [getClass()](#getClass) |  |
| [hashCode()](#hashCode) |  |
| [notify()](#notify) |  |
| [notifyAll()](#notifyAll) |  |
| [toString()](#toString) |  |
| [wait()](#wait) |  |
| [wait(long arg0)](#wait-long) |  |
| [wait(long arg0, int arg1)](#wait-long-int) |  |
### PreprocessingFilter() {#PreprocessingFilter}
```
public PreprocessingFilter()
```


### Empty {#Empty}
```
public static final PreprocessingFilter Empty
```


### AutoDenoising() {#AutoDenoising}
```
public static PreprocessingFilter AutoDenoising()
```


Enables the use of an additional neural network to improve the image - reduce noise. Useful for images with scan artifacts, distortion, spots, flares, gradients, foreign elements.

**Returns:**
[PreprocessingFilter](../../com.aspose.ocr/preprocessingfilter/) - AutoDenoisingFilter object.
### AutoDenoising(Rectangle area) {#AutoDenoising-java.awt.Rectangle}
```
public static PreprocessingFilter AutoDenoising(Rectangle area)
```


Enables the use of an additional neural network to improve the part of the image - reduce noise. Useful for images with scan artifacts, distortion, spots, flares, gradients, foreign elements.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| area | java.awt.Rectangle | Rectangle to preprocess. |

**Returns:**
[PreprocessingFilter](../../com.aspose.ocr/preprocessingfilter/) - AutoDenoisingFilter object.
### AutoDewarping() {#AutoDewarping}
```
public static PreprocessingFilter AutoDewarping()
```


Automatically corrects geometric distortions in the image. Extremely resource intensive!

**Returns:**
[PreprocessingFilter](../../com.aspose.ocr/preprocessingfilter/) - AutoDewarpingFilter object.
### AutoSkew() {#AutoSkew}
```
public static PreprocessingFilter AutoSkew()
```


Enables the automatic image skew correction.

**Returns:**
[PreprocessingFilter](../../com.aspose.ocr/preprocessingfilter/) - AutoSkewFilter object.
### AutoSkew(Rectangle area) {#AutoSkew-java.awt.Rectangle}
```
public static PreprocessingFilter AutoSkew(Rectangle area)
```


Enables the automatic image part skew correction.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| area | java.awt.Rectangle | Rectangle to preprocess. |

**Returns:**
[PreprocessingFilter](../../com.aspose.ocr/preprocessingfilter/) - AutoSkewFilter object.
### Binarize() {#Binarize}
```
public static PreprocessingFilter Binarize()
```


Converts an image to black-and-white image. Binary images are images whose pixels have only two possible intensity values. They are normally displayed as black and white. Numerically, the two values are often 0 for black, and 255 for white. Binary images are produced by auto thresholding an image.

**Returns:**
[PreprocessingFilter](../../com.aspose.ocr/preprocessingfilter/) - BinarizeFilter object.
### Binarize(Rectangle area) {#Binarize-java.awt.Rectangle}
```
public static PreprocessingFilter Binarize(Rectangle area)
```


Converts a part of the image to black-and-white image. Binary images are images whose pixels have only two possible intensity values. They are normally displayed as black and white. Numerically, the two values are often 0 for black, and 255 for white. Binary images are produced by auto thresholding an image.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| area | java.awt.Rectangle | Rectangle to preprocess. |

**Returns:**
[PreprocessingFilter](../../com.aspose.ocr/preprocessingfilter/) - BinarizeFilter object.
### BinarizeAndDilate() {#BinarizeAndDilate}
```
public static PreprocessingFilter BinarizeAndDilate()
```


Dilation adds pixels to the boundaries of objects in an image.

**Returns:**
[PreprocessingFilter](../../com.aspose.ocr/preprocessingfilter/) - DilateFilter object.
### BinarizeAndDilate(Rectangle area) {#BinarizeAndDilate-java.awt.Rectangle}
```
public static PreprocessingFilter BinarizeAndDilate(Rectangle area)
```


Dilation adds pixels to the boundaries of objects in a part of the image.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| area | java.awt.Rectangle | Rectangle to preprocess. |

**Returns:**
[PreprocessingFilter](../../com.aspose.ocr/preprocessingfilter/) - DilateFilter object.
### ContrastCorrection() {#ContrastCorrection}
```
public static PreprocessingFilter ContrastCorrection()
```


Contrast correction filter.

**Returns:**
[PreprocessingFilter](../../com.aspose.ocr/preprocessingfilter/) - ContrastCorrectionFilter object.
### ContrastCorrection(Rectangle area) {#ContrastCorrection-java.awt.Rectangle}
```
public static PreprocessingFilter ContrastCorrection(Rectangle area)
```


Contrast correction filter for the part of the image.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| area | java.awt.Rectangle | Rectangle to preprocess. |

**Returns:**
[PreprocessingFilter](../../com.aspose.ocr/preprocessingfilter/) - ContrastCorrectionFilter object.
### Invert() {#Invert}
```
public static PreprocessingFilter Invert()
```


Automatically inverts colors in a document image.

**Returns:**
[PreprocessingFilter](../../com.aspose.ocr/preprocessingfilter/) - InvertFilter object.
### Invert(Rectangle area) {#Invert-java.awt.Rectangle}
```
public static PreprocessingFilter Invert(Rectangle area)
```


Automatically inverts colors in a part of the image.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| area | java.awt.Rectangle | Rectangle to preprocess. |

**Returns:**
[PreprocessingFilter](../../com.aspose.ocr/preprocessingfilter/) - InvertFilter object.
### Median() {#Median}
```
public static PreprocessingFilter Median()
```


The median filter run through each element of the image and replace each pixel with the median of its neighboring pixels.

**Returns:**
[PreprocessingFilter](../../com.aspose.ocr/preprocessingfilter/) - MedianFilter object.
### Median(Rectangle area) {#Median-java.awt.Rectangle}
```
public static PreprocessingFilter Median(Rectangle area)
```


The median filter run through each element of the part of the image and replace each pixel with the median of its neighboring pixels.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| area | java.awt.Rectangle | Rectangle to preprocess. |

**Returns:**
[PreprocessingFilter](../../com.aspose.ocr/preprocessingfilter/) - MedianFilter object.
### Resize(int width, int height) {#Resize-int-int}
```
public static PreprocessingFilter Resize(int width, int height)
```


Rescale image - Upscale or downscale image resolution. InterpolationFilterType = bilinear or nearest neighbor @see [InterpolationFilterType](../../com.aspose.ocr/interpolationfiltertype/)

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| width | int | The new width of the image. |
| height | int | The new height of the image. |

**Returns:**
[PreprocessingFilter](../../com.aspose.ocr/preprocessingfilter/) - ResizeFilter object.
### Resize(int width, int height, InterpolationFilterType type) {#Resize-int-int-com.aspose.ocr.InterpolationFilterType}
```
public static PreprocessingFilter Resize(int width, int height, InterpolationFilterType type)
```


Rescale image - upscale or downscale image resolution.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| width | int | The new width of the image. |
| height | int | The new height of the image. |
| type | [InterpolationFilterType](../../com.aspose.ocr/interpolationfiltertype/) | InterpolationFilterType @see [InterpolationFilterType](../../com.aspose.ocr/interpolationfiltertype/) |

**Returns:**
[PreprocessingFilter](../../com.aspose.ocr/preprocessingfilter/) - ResizeFilter object.
### Rotate(float angle) {#Rotate-float}
```
public static PreprocessingFilter Rotate(float angle)
```


Rotate original image.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| angle | float | Angle of rotation. Value from -360 to 360. |

**Returns:**
[PreprocessingFilter](../../com.aspose.ocr/preprocessingfilter/) - RotateFilter object.
### Rotate(float angle, Rectangle area) {#Rotate-float-java.awt.Rectangle}
```
public static PreprocessingFilter Rotate(float angle, Rectangle area)
```


Rotate the part of the image.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| angle | float | Angle of rotation. Value from -360 to 360. |
| area | java.awt.Rectangle | Rectangle to preprocess. |

**Returns:**
[PreprocessingFilter](../../com.aspose.ocr/preprocessingfilter/) - RotateFilter object.
### Scale(float ratio) {#Scale-float}
```
public static PreprocessingFilter Scale(float ratio)
```


Rescale image - Upscale or downscale image resolution. InterpolationFilterType default bilinear or nearest neighbor @see [InterpolationFilterType](../../com.aspose.ocr/interpolationfiltertype/)

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| ratio | float | The scaling factor. Recommended value from 0.1 to 1 to shrink. From 1 to 10 to enlarge. |

**Returns:**
[PreprocessingFilter](../../com.aspose.ocr/preprocessingfilter/) - ScaleFilter object.
### Scale(float ratio, InterpolationFilterType type) {#Scale-float-com.aspose.ocr.InterpolationFilterType}
```
public static PreprocessingFilter Scale(float ratio, InterpolationFilterType type)
```


Rescale image - Upscale or downscale image resolution.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| ratio | float | The scaling factor. Recommended value from 0.1 to 1 to shrink. From 1 to 10 to enlarge. |
| type | [InterpolationFilterType](../../com.aspose.ocr/interpolationfiltertype/) | InterpolationFilterType @see [InterpolationFilterType](../../com.aspose.ocr/interpolationfiltertype/) |

**Returns:**
[PreprocessingFilter](../../com.aspose.ocr/preprocessingfilter/) - ScaleFilter object.
### Threshold(int value) {#Threshold-int}
```
public static PreprocessingFilter Threshold(int value)
```


Create a binary image based on setting a threshold value on the pixel intensity of the original image.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The max value. |

**Returns:**
[PreprocessingFilter](../../com.aspose.ocr/preprocessingfilter/) - BinarizeFilter object.
### Threshold(int value, Rectangle area) {#Threshold-int-java.awt.Rectangle}
```
public static PreprocessingFilter Threshold(int value, Rectangle area)
```


Create a binary image part based on setting a threshold value on the pixel intensity of the original image part.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The max value. |
| area | java.awt.Rectangle | Rectangle to preprocess. |

**Returns:**
[PreprocessingFilter](../../com.aspose.ocr/preprocessingfilter/) - BinarizeFilter object.
### ToGrayscale() {#ToGrayscale}
```
public static PreprocessingFilter ToGrayscale()
```


Converts an image to grayscale image. Grayscale image have 256 level of light in image (0 to 255).

**Returns:**
[PreprocessingFilter](../../com.aspose.ocr/preprocessingfilter/) - GrayscaleFilter object.
### add(PreprocessingFilter filter) {#add-com.aspose.ocr.PreprocessingFilter}
```
public void add(PreprocessingFilter filter)
```


Add the new filter to the collection to further run all operations. Consistency in the collection matters.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| filter | [PreprocessingFilter](../../com.aspose.ocr/preprocessingfilter/) | New operation to add to filter list. |

### equals(Object arg0) {#equals-java.lang.Object}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getClass() {#getClass}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### hashCode() {#hashCode}
```
public native int hashCode()
```




**Returns:**
int
### notify() {#notify}
```
public final native void notify()
```




### notifyAll() {#notifyAll}
```
public final native void notifyAll()
```




### toString() {#toString}
```
public String toString()
```




**Returns:**
java.lang.String
### wait() {#wait}
```
public final void wait()
```




### wait(long arg0) {#wait-long}
```
public final native void wait(long arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

