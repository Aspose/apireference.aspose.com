---
title: Aspose::TeX::Presentation::Pdf::PdfSaveOptions class
linktitle: PdfSaveOptions
second_title: Aspose.TeX for C++
description: 'Aspose::TeX::Presentation::Pdf::PdfSaveOptions class. Class representing options of saving to PDF in C++.'
type: docs
weight: 500
url: /cpp/aspose.tex.presentation.pdf/pdfsaveoptions/
---
## PdfSaveOptions class


Class representing options of saving to PDF.

```cpp
class PdfSaveOptions : public Aspose::TeX::Presentation::SaveOptions
```

## Methods

| Method | Description |
| --- | --- |
| [get_EncryptionDetails](./get_encryptiondetails/)() const | Gets a encryption details. If not set, then no encryption will be performed. |
| [get_ImageCompression](./get_imagecompression/)() const | Specifies compression type to be used for all images in the document. Default is [PdfImageCompression::Auto](../pdfimagecompression/). |
| [get_JpegQualityLevel](./get_jpegqualitylevel/)() const | The Quality category specifies the level of compression for an image. Available values are 0 to 100. The lower the number specified, the higher the compression and therefore the lower the quality of the image. 0 value results in lowest quality image, while 100 results in highest. |
| [get_OutlineTreeExpansionLevel](./get_outlinetreeexpansionlevel/)() const | Specifies up to what level the document outline should be expanded when the PDF file is viewed. 1 - only the first level outline items are shown, 2 - only the first and second level outline items are shown, and so on. Default is 1. |
| [get_OutlineTreeHeight](./get_outlinetreeheight/)() const | Specifies the height of the document outline tree to save. 0 - the outline tree will not be converted, 1 - only the first level outline items will be converted, ans so on. |
| [get_TextCompression](./get_textcompression/)() const | Specifies at which level in the document outline to display [ApsBookmark](../) objects. 0 - not displayed. 1 at first level and so on. Default is 0. |
| [PdfSaveOptions](./pdfsaveoptions/)() | Creates new instance of options. |
| [set_EncryptionDetails](./set_encryptiondetails/)(System::SharedPtr\<PdfEncryptionDetails\>) | Sets a encryption details. If not set, then no encryption will be performed. |
| [set_ImageCompression](./set_imagecompression/)(PdfImageCompression) | Specifies compression type to be used for all images in the document. Default is [PdfImageCompression::Auto](../pdfimagecompression/). |
| [set_JpegQualityLevel](./set_jpegqualitylevel/)(int32_t) | The Quality category specifies the level of compression for an image. Available values are 0 to 100. The lower the number specified, the higher the compression and therefore the lower the quality of the image. 0 value results in lowest quality image, while 100 results in highest. |
| [set_OutlineTreeExpansionLevel](./set_outlinetreeexpansionlevel/)(int32_t) | Specifies up to what level the document outline should be expanded when the PDF file is viewed. 1 - only the first level outline items are shown, 2 - only the first and second level outline items are shown, and so on. Default is 1. |
| [set_OutlineTreeHeight](./set_outlinetreeheight/)(int32_t) | Specifies the height of the document outline tree to save. 0 - the outline tree will not be converted, 1 - only the first level outline items will be converted, ans so on. |
| [set_TextCompression](./set_textcompression/)(PdfTextCompression) | Specifies at which level in the document outline to display [ApsBookmark](../) objects. 0 - not displayed. 1 at first level and so on. Default is 0. |
## See Also

* Class [SaveOptions](../../aspose.tex.presentation/saveoptions/)
* Namespace [Aspose::TeX::Presentation::Pdf](../)
* Library [Aspose.TeX for C++](../../)
