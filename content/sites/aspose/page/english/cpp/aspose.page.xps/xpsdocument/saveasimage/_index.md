---
title: Aspose::Page::XPS::XpsDocument::SaveAsImage method
linktitle: SaveAsImage
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::XpsDocument::SaveAsImage method. Saves the document to image file.The output directory and the file name will be the same as from input XPS file. The file extension will correspond to image format in "options" param. If the document was initialized with a stream that is not FileStream, image file will be saved in the current folder with default file name template in C++.'
type: docs
weight: 5500
url: /cpp/aspose.page.xps/xpsdocument/saveasimage/
---
## XpsDocument::SaveAsImage(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>) method


Saves the document to image file.The output directory and the file name will be the same as from input [XPS](../../) file. The file extension will correspond to image format in "options" param. If the document was initialized with a stream that is not FileStream, image file will be saved in the current folder with default file name template.

```cpp
void Aspose::Page::XPS::XpsDocument::SaveAsImage(System::SharedPtr<Presentation::Image::ImageSaveOptions> options)
```


| Parameter | Type | Description |
| --- | --- | --- |
| options | System::SharedPtr\<Presentation::Image::ImageSaveOptions\> | Options for saving the document in a bitmap image format. |

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ImageSaveOptions](../../../aspose.page.xps.presentation.image/imagesaveoptions/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::SaveAsImage(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>, System::String, System::String) method


Saves the document to image file to the specified directory with the specified file name. The file extension will correspond to the image format in "options" param.

```cpp
void Aspose::Page::XPS::XpsDocument::SaveAsImage(System::SharedPtr<Presentation::Image::ImageSaveOptions> options, System::String outDir, System::String fileNameTemplate)
```


| Parameter | Type | Description |
| --- | --- | --- |
| options | System::SharedPtr\<Presentation::Image::ImageSaveOptions\> | Options for saving the document in a bitmap image format. |
| outDir | System::String | The output directory where image file will be saved. |
| fileNameTemplate | System::String | The file name template for image (without extension). If the input [XPS](../../) file is 1-paged it will be precisely the file name, otherwise "_[n]", where "n" - a number of page starting from 0, suffix will be appended to this. The file extension will correspond to image format in "option" param. |

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ImageSaveOptions](../../../aspose.page.xps.presentation.image/imagesaveoptions/)
* Class [String](../../../system/string/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
