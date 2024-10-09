---
title: Aspose::Page::XPS::Presentation::Pdf::PdfSaveOptions class
linktitle: PdfSaveOptions
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::Presentation::Pdf::PdfSaveOptions class. Class for XPS-as-PDF saving options in C++.'
type: docs
weight: 300
url: /cpp/aspose.page.xps.presentation.pdf/pdfsaveoptions/
---
## PdfSaveOptions class


Class for XPS-as-PDF saving options.

```cpp
class PdfSaveOptions : public Aspose::Page::SaveOptions,
                       public Aspose::Page::IMultiPageSaveOptions,
                       public Aspose::Page::XPS::Presentation::IXpsTextConversionOptions,
                       public Aspose::Page::XPS::Presentation::IPipelineOptions,
                       public Aspose::Page::XPS::Presentation::IEventBasedModificationOptions
```

## Methods

| Method | Description |
| --- | --- |
| [get_BatchSize](./get_batchsize/)() override | Specifies the size of a portion of pages to pass from node to node. |
| [get_BeforePageSavingEventHandlers](./get_beforepagesavingeventhandlers/)() override | The collection of event handlers that performs modifications to an [XPS](../../aspose.page.xps/) page just before it is saved. |
| [get_EncryptionDetails](./get_encryptiondetails/)() const | Gets a encryption details. If not set, then no encryption will be performed. |
| [get_ImageCompression](./get_imagecompression/)() const | Specifies compression type to be used for all images in the document. Default is [PdfImageCompression::Auto](../pdfimagecompression/). |
| [get_OutlineTreeExpansionLevel](./get_outlinetreeexpansionlevel/)() const | Specifies up to what level the document outline should be expanded when the PDF file is opened in a viewer. 1 - only the first level outline items are shown, 2 - only the first and second level outline items are shown, and so on. Default is 1. |
| [get_OutlineTreeHeight](./get_outlinetreeheight/)() const | Specifies the height of the document outline tree to save. 0 - the outline tree will not be converted, 1 - only the first level outline items will be converted, ans so on. Default is 10. |
| [get_PageNumbers](./get_pagenumbers/)() override | Gets/sets the array of numbers of pages to convert. |
| [get_PreserveText](./get_preservetext/)() override | In [XPS](../../aspose.page.xps/), some text elements may contain references to alternate glyph forms that do not correspond to any character code in the font. If this flag is set to true, the text from such [XPS](../../aspose.page.xps/) elements is converted to graphic shapes. Then the text itself appears transparent on top. This leaves the text of such elements selectable. But the side effect is that the output file may be much larger than the original. If this flag is set to false, the characters that should be displayed as alternate forms are replaced with some other characters that become mapped to the alternate glyph forms. Therefore the text, although still selectable, will be modified and likely become unreadable. Default is false. |
| [get_TextCompression](./get_textcompression/)() const | Specifies at which level in the document outline to display [ApsBookmark](../) objects. 0 - not displayed. 1 at first level and so on. Default is 0. |
| [PdfSaveOptions](./pdfsaveoptions/)() | Creates new instance of options. |
| [set_BatchSize](./set_batchsize/)(int32_t) override | Specifies the size of a portion of pages to pass from node to node. |
| [set_EncryptionDetails](./set_encryptiondetails/)(System::SharedPtr\<PdfEncryptionDetails\>) | Sets a encryption details. If not set, then no encryption will be performed. |
| [set_ImageCompression](./set_imagecompression/)(PdfImageCompression) | Specifies compression type to be used for all images in the document. Default is [PdfImageCompression::Auto](../pdfimagecompression/). |
| [set_OutlineTreeExpansionLevel](./set_outlinetreeexpansionlevel/)(int32_t) | Specifies up to what level the document outline should be expanded when the PDF file is opened in a viewer. 1 - only the first level outline items are shown, 2 - only the first and second level outline items are shown, and so on. Default is 1. |
| [set_OutlineTreeHeight](./set_outlinetreeheight/)(int32_t) | Specifies the height of the document outline tree to save. 0 - the outline tree will not be converted, 1 - only the first level outline items will be converted, ans so on. Default is 10. |
| [set_PageNumbers](./set_pagenumbers/)(System::ArrayPtr\<int32_t\>) override | Gets/sets the array of numbers of pages to convert. |
| [set_PreserveText](./set_preservetext/)(bool) override | In [XPS](../../aspose.page.xps/), some text elements may contain references to alternate glyph forms that do not correspond to any character code in the font. If this flag is set to true, the text from such [XPS](../../aspose.page.xps/) elements is converted to graphic shapes. Then the text itself appears transparent on top. This leaves the text of such elements selectable. But the side effect is that the output file may be much larger than the original. If this flag is set to false, the characters that should be displayed as alternate forms are replaced with some other characters that become mapped to the alternate glyph forms. Therefore the text, although still selectable, will be modified and likely become unreadable. Default is false. |
| [set_TextCompression](./set_textcompression/)(PdfTextCompression) | Specifies at which level in the document outline to display [ApsBookmark](../) objects. 0 - not displayed. 1 at first level and so on. Default is 0. |
## See Also

* Class [SaveOptions](../../aspose.page/saveoptions/)
* Class [IMultiPageSaveOptions](../../aspose.page/imultipagesaveoptions/)
* Class [IXpsTextConversionOptions](../../aspose.page.xps.presentation/ixpstextconversionoptions/)
* Class [IPipelineOptions](../../aspose.page.xps.presentation/ipipelineoptions/)
* Class [IEventBasedModificationOptions](../../aspose.page.xps.presentation/ieventbasedmodificationoptions/)
* Namespace [Aspose::Page::XPS::Presentation::Pdf](../)
* Library [Aspose.Page for C++](../../)
