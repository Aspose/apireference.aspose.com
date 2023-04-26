---
title: PreprocessingFilter
second_title: Aspose.Sildes for Python via .NET API Reference
description: 
type: docs
weight: 10
url: /ocr/python-net/aspose.ocr.models.preprocessingfilters/preprocessingfilter/
---

## PreprocessingFilter class

Base class for image processing commands.

The PreprocessingFilter type exposes the following members:
## Constructors
| Name | Description |
| :- | :- |
|PreprocessingFilter()|Initializes a new instance of the PreprocessingFilter class|
## Properties
| Name | Description |
| :- | :- |
|default|Default filters collection contain AutoSkew filter|
|empty|Empty filters collection|
## Methods
| Name | Description |
| :- | :- |
|resize(width, height, type)|Rescale image - Upscale or downscale image resolution.|
|resize(width, height)|Rescale image - Upscale or downscale image resolution.|
|scale(ratio)|Rescale image - Upscale or downscale image resolution.<br/>            InterpolationFilterType = Lanczos8|
|scale(ratio, type)|Rescale image - Upscale or downscale image resolution.|
|binarize()|Converts an image to black-and-white image.<br/>            Binary images are images whose pixels have only two possible intensity values. <br/>            They are normally displayed as black and white. Numerically, the two values are often 0 for black, and 255 for white.<br/>            Binary images are produced by auto thresholding an image.|
|dilate()|Dilation adds pixels to the boundaries of objects in an image.|
|invert()|Automatically inverts colors in a document image.|
|rotate(angle)|Rotate original image.|
|to_grayscale()|Converts an image to grayscale image.<br/>            Grayscale image have 256 level of light in image (0 to 255).|
|threshold(value)|Create a binary image based on setting a threshold value on the pixel intensity of the original image.|
|median()|The median filter run through each element of the image and replace each pixel with the median of its neighboring pixels.|
|auto_denoising()|Enables the use of an additional neural network to improve the image - reduce noise.<br/>            Useful for images with scan artifacts, distortion, spots, flares, gradients, foreign elements.|
|auto_skew()|Enables the automatic image skew correction.|
|auto_dewarping()|Automatically corrects geometric distortions in the image.<br/>            Extremely resource intensive!|
|contrast_correction_filter()|Contrast correction filter.|
|add(filter)|Add the new filter to the collection to further run all operations.<br/>            Consistency in the collection matters.|

### See Also

* namespace [aspose.ocr.models.preprocessingfilters](/ocr/python-net/aspose.ocr.models.preprocessingfilters/)
* assembly [Aspose.ocr](/ocr/python-net/)

