---
title: PreprocessingFilter
second_title: Aspose.OCR for .NET API Reference
description: Base class for image processing commands.
type: docs
weight: 510
url: /net/aspose.ocr.models.preprocessingfilters/preprocessingfilter/
---
## PreprocessingFilter class

Base class for image processing commands.

Base class for image processing commands.

```csharp
public class PreprocessingFilter : IEnumerable
```

## Constructors

| Name | Description |
| --- | --- |
| [PreprocessingFilter](preprocessingfilter)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| static [Default](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/default) { get; } | Default filters collection contain AutoSkew filter |
| static [Empty](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/empty) { get; } | Empty filters collection |

## Methods

| Name | Description |
| --- | --- |
| static [AutoDenoising](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autodenoising#autodenoising)() | Enables the use of an additional neural network to improve the image - reduce noise. Useful for images with scan artifacts, distortion, spots, flares, gradients, foreign elements. |
| static [AutoDenoising](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autodenoising#autodenoising_1)(Rectangle) | Enables the use of an additional neural network to improve the image part - reduce noise. Useful for images with scan artifacts, distortion, spots, flares, gradients, foreign elements. |
| static [AutoDewarping](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autodewarping)() | Automatically corrects geometric distortions in the image. Extremely resource intensive! |
| static [AutoSkew](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autoskew#autoskew)() | Enables the automatic image skew correction. |
| static [AutoSkew](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autoskew#autoskew_1)(Rectangle) | Enables the automatic image part skew correction. |
| static [Binarize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/binarize#binarize)() | Converts an image to black-and-white image. Binary images are images whose pixels have only two possible intensity values. They are normally displayed as black and white. Numerically, the two values are often 0 for black, and 255 for white. Binary images are produced by auto thresholding an image. |
| static [Binarize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/binarize#binarize_1)(Rectangle) | Converts a part of the image to black-and-white image. Binary images are images whose pixels have only two possible intensity values. They are normally displayed as black and white. Numerically, the two values are often 0 for black, and 255 for white. Binary images are produced by auto thresholding an image. |
| static [ContrastCorrectionFilter](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/contrastcorrectionfilter#contrastcorrectionfilter)() | Contrast correction filter. |
| static [ContrastCorrectionFilter](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/contrastcorrectionfilter#contrastcorrectionfilter_1)(Rectangle) | Contrast correction filter for the part of the image. |
| static [Dilate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/dilate#dilate)() | Dilation adds pixels to the boundaries of objects in an image. |
| static [Dilate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/dilate#dilate_1)(Rectangle) | Dilation adds pixels to the boundaries of objects in a part of the image. |
| static [Invert](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/invert#invert)() | Automatically inverts colors in a document image. |
| static [Invert](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/invert#invert_1)(Rectangle) | Automatically inverts colors in a part of the image. |
| static [Median](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/median#median)() | The median filter run through each element of the image and replace each pixel with the median of its neighboring pixels. |
| static [Median](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/median#median_1)(Rectangle) | The median filter run through each element of the image part and replace each pixel with the median of its neighboring pixels. |
| static [Resize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/resize#resize)(int, int) | Rescale image - Upscale or downscale image resolution. InterpolationFilterType = Lanczos8 |
| static [Resize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/resize#resize_1)(int, int, InterpolationFilterType) | Rescale image - Upscale or downscale image resolution. |
| static [Rotate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/rotate#rotate)(float) | Rotate original image. |
| static [Rotate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/rotate#rotate_1)(float, Rectangle) | Rotate a part of the image. |
| static [Scale](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/scale#scale)(float) | Rescale image - Upscale or downscale image resolution. InterpolationFilterType = Lanczos8 |
| static [Scale](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/scale#scale_1)(float, InterpolationFilterType) | Rescale image - Upscale or downscale image resolution. |
| static [Threshold](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/threshold#threshold)(int) | Create a binary image based on setting a threshold value on the pixel intensity of the original image. |
| static [Threshold](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/threshold#threshold_1)(int, Rectangle) | Create a binary part of the image based on setting a threshold value on the pixel intensity of the original image part. |
| static [ToGrayscale](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/tograyscale)() | Converts an image to grayscale image. Grayscale image have 256 level of light in image (0 to 255). |
| [Add](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/add)(PreprocessingFilter) | Add the new filter to the collection to further run all operations. Consistency in the collection matters. |
| [GetEnumerator](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/getenumerator)() | For IEnumarable interface realization. |

### See Also

* namespace [Aspose.OCR.Models.PreprocessingFilters](../../aspose.ocr.models.preprocessingfilters)
* assembly [Aspose.OCR](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.OCR.dll -->
