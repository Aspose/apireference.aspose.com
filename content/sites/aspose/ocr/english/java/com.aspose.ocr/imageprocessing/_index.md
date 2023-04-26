---
title: ImageProcessing
second_title: Aspose.OCR for Java API Reference
description: Helper class for Aspose OCR library.
type: docs
weight: 17
url: /java/com.aspose.ocr/imageprocessing/
---

**Inheritance:**
java.lang.Object
```
public class ImageProcessing
```

Helper class for Aspose OCR library. Allows to preprocess and save images.
## Constructors

| Constructor | Description |
| --- | --- |
| [ImageProcessing()](#ImageProcessing--) |  |
## Methods

| Method | Description |
| --- | --- |
| [Save(OcrInput images, String folderPath)](#Save-com.aspose.ocr.OcrInput-java.lang.String-) | Use image processing to improve the accuracy of OCR. |
| [Render(OcrInput images)](#Render-com.aspose.ocr.OcrInput-) | Use image processing to improve the accuracy of OCR. |
### ImageProcessing() {#ImageProcessing--}
```
public ImageProcessing()
```


### Save(OcrInput images, String folderPath) {#Save-com.aspose.ocr.OcrInput-java.lang.String-}
```
public static OcrInput Save(OcrInput images, String folderPath)
```


Use image processing to improve the accuracy of OCR. Create a list of filters that will be applied to the input image in the order you specify. Example to create filters: PreprocessingFilter filters = new PreprocessingFilter(); filters.add(PreprocessingFilter.AutoDewarping()); filters.add(PreprocessingFilter.Invert()); filters.add(PreprocessingFilter.Threshold(150)); filters.add(PreprocessingFilter.Binarize()); filters.add(PreprocessingFilter.Rotate(180)); filters.add(PreprocessingFilter.Scale(6f)); filters.add(PreprocessingFilter.Dilate()); You don't need all of them. Set only what you need.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| images | [OcrInput](../../com.aspose.ocr/ocrinput) | OcrInput object containing different images @see \#OcrInput. |
| folderPath | java.lang.String | Path without image names for saving processed images. |

**Returns:**
[OcrInput](../../com.aspose.ocr/ocrinput) - OcrInput object containing result processed images @see \#OcrInput.
### Render(OcrInput images) {#Render-com.aspose.ocr.OcrInput-}
```
public static OcrInput Render(OcrInput images)
```


Use image processing to improve the accuracy of OCR. Create a list of filters that will be applied to the input image in the order you specify. Example to create filters: PreprocessingFilter filters = new PreprocessingFilter(); filters.add(PreprocessingFilter.AutoDewarping()); filters.add(PreprocessingFilter.Invert()); filters.add(PreprocessingFilter.Threshold(150)); filters.add(PreprocessingFilter.Binarize()); filters.add(PreprocessingFilter.Rotate(180)); filters.add(PreprocessingFilter.Scale(6f)); filters.add(PreprocessingFilter.Dilate()); You don't need all of them. Set only what you need.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| images | [OcrInput](../../com.aspose.ocr/ocrinput) | OcrInput object containing different images @see \#OcrInput. |

**Returns:**
[OcrInput](../../com.aspose.ocr/ocrinput) - OcrInput object containing result processed images @see \#OcrInput in Image field.
