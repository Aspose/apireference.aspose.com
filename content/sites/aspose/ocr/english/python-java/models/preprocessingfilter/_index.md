---
title: "PreprocessingFilter Class"
linktitle: "PreprocessingFilter"
articleTitle: "PreprocessingFilter"
second_title: "Aspose.OCR for Python via Java"
description: "Base class for image processing commands."
type: docs
weight: 10
url: /python-java/models/preprocessingfilter/
---

## PreprocessingFilter class

**Module:** `models`

**Inherits:** `BaseJavaClass`


Base class for image processing commands.


## Constructors

| Name | Description |
| --- | --- |
| [__init__](./preprocessingfilter/) |  |

## Methods

| Name | Return Type | Static | Description |
| --- | --- | --- | --- |
| [add](./add/) |  | No | Add filter to collection for further preprocessing. |
| [auto_denoising](./auto_denoising/) |  | Yes | Enables the use of an additional neural network to improve the image - reduce noise. Useful for images with scan artifacts, distortion, spots, flares, gradients, foreign elements. |
| [auto_dewarping](./auto_dewarping/) |  | Yes | Automatically corrects geometric distortions in the image. Extremely resource intensive! |
| [auto_skew](./auto_skew/) |  | Yes | Enables the automatic image skew correction. |
| [binarize](./binarize/) |  | Yes | Converts an image to black-and-white image. Binary images are images whose pixels have only two possible intensity values. They are normally displayed as black and white. Numerically, the two values are often 0 for black, and 255 for white. Binary images are produced by auto thresholding an image. |
| [binarize_and_dilate](./binarize_and_dilate/) |  | Yes | Dilation adds pixels to the boundaries of objects in an image. |
| [contrast_correction](./contrast_correction/) |  | Yes | Contrast correction filter. |
| [getJavaClass](./getjavaclass/) |  | No |  |
| [invert](./invert/) |  | Yes | Automatically inverts colors in a document image. |
| [median](./median/) |  | Yes | The median filter run through each element of the image and replace each pixel with the median of its neighboring pixels. |
| [resize](./resize/) |  | Yes | Rescale image - upscale or downscale image resolution. |
| [rotate](./rotate/) |  | Yes | Rotate original image. |
| [scale](./scale/) |  | Yes | Rescale image - Upscale or downscale image resolution. InterpolationFilterType bilinear or nearest neighbor. |
| [threshold](./threshold/) |  | Yes | Create a binary image based on setting a threshold value on the pixel intensity of the original image. |
| [to_grayscale](./to_grayscale/) |  | Yes | Converts an image to grayscale image. Grayscale image have 256 level of light in image (0 to 255). |

## Fields

| Name | Value | Description |
| --- | --- | --- |
| [JAVA_CLASS_NAME](./java_class_name/) | `"com.aspose.ocr.PreprocessingFilter"` |  |
