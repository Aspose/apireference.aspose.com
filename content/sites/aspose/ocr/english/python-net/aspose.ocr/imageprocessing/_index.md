---
title: ImageProcessing
second_title: Aspose.OCR for Python via .NET API Reference
description: 
type: docs
weight: 120
url: /python-net/aspose.ocr/imageprocessing/
---

## ImageProcessing class

Helper class for Aspose OCR library. Allows to preprocess and save images.

The ImageProcessing type exposes the following members:
## Methods
| Name | Description |
| :- | :- |
|save(images, folder_path)|Use image processing to improve the accuracy of OCR.<br/>            Create a list of filters that will be applied to the input image in the order you specify.<br/>            Example to create filters:<br/>            PreprocessingFilter filters = new PreprocessingFilter<br/>               {<br/>                   PreprocessingFilter.Invert(),<br/>                   PreprocessingFilter.Threshold(150),<br/>                   PreprocessingFilter.Binarize(),<br/>                   PreprocessingFilter.Rotate(180),<br/>                   PreprocessingFilter.Resize(3000,3000, Aspose.OCR.Filters.InterpolationFilterType.Box),<br/>                   PreprocessingFilter.Scale(6f),<br/>                   PreprocessingFilter.Dilate()<br/>            };<br/>            You don't need all of them. Set only what you need.|
|render(images)|Use image processing to improve the accuracy of OCR.<br/>            Create a list of filters that will be applied to the input image in the order you specify.<br/>            example to create filters:<br/>            PreprocessingFilter filters = new PreprocessingFilter<br/>               {<br/>                   PreprocessingFilter.Invert(),<br/>                   PreprocessingFilter.Threshold(150),<br/>                   PreprocessingFilter.Binarize(),<br/>                   PreprocessingFilter.Rotate(180),<br/>                   PreprocessingFilter.Resize(3000,3000, Aspose.OCR.Filters.InterpolationFilterType.Box),<br/>                   PreprocessingFilter.Scale(6f),<br/>                   PreprocessingFilter.Dilate()<br/>            };<br/>            You don't need all of them. Set only what you need.|

### See Also

* namespace [aspose.ocr](/ocr/python-net/aspose.ocr/)
* assembly [Aspose.ocr](/ocr/python-net/)

