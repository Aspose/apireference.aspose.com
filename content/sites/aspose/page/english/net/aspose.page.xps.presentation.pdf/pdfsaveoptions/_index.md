---
title: Class PdfSaveOptions
second_title: Aspose.Page for .NET API Reference
description: Aspose.Page.XPS.Presentation.Pdf.PdfSaveOptions class. Class for XPSasPDF saving options
type: docs
weight: 750
url: /net/aspose.page.xps.presentation.pdf/pdfsaveoptions/
---
## PdfSaveOptions class

Class for XPS-as-PDF saving options.

```csharp
public class PdfSaveOptions : SaveOptions, IEventBasedModificationOptions, IPipelineOptions, 
    IXpsTextConversionOptions
```

## Constructors

| Name | Description |
| --- | --- |
| [PdfSaveOptions](pdfsaveoptions/)() | Creates new instance of options. |

## Properties

| Name | Description |
| --- | --- |
| [AdditionalFontsFolders](../../aspose.page/saveoptions/additionalfontsfolders/) { get; set; } | Specifies additional folders where converter should find fonts for input document. Default folder are standard fonts folder where OS finds fonts for internal needs. |
| [BatchSize](../../aspose.page.xps.presentation.pdf/pdfsaveoptions/batchsize/) { get; set; } | Specifies the size of a portion of pages to pass from node to node. |
| [BeforePageSavingEventHandlers](../../aspose.page.xps.presentation.pdf/pdfsaveoptions/beforepagesavingeventhandlers/) { get; } | The collection of event handlers that performs modifications to an XPS page just before it is saved. |
| virtual [Debug](../../aspose.page/saveoptions/debug/) { get; set; } | Specifies whether debug information must be printed to standard output stream or not. |
| [EncryptionDetails](../../aspose.page.xps.presentation.pdf/pdfsaveoptions/encryptiondetails/) { get; set; } | Gets or sets a encryption details. If not set, then no encryption will be performed. |
| virtual [Exceptions](../../aspose.page/saveoptions/exceptions/) { get; } | Returns a list of suppressed conversion errors If !:SuppressErrors is true. |
| [ImageCompression](../../aspose.page.xps.presentation.pdf/pdfsaveoptions/imagecompression/) { get; set; } | Specifies compression type to be used for all images in the document. Default is Auto. |
| [JpegQualityLevel](../../aspose.page/saveoptions/jpegqualitylevel/) { get; set; } | The Quality category specifies the level of compression for an image. Available values are 0 to 100. The lower the number specified, the higher the compression and therefore the lower the quality of the image. 0 value results in lowest quality image, while 100 results in highest. |
| [OutlineTreeExpansionLevel](../../aspose.page.xps.presentation.pdf/pdfsaveoptions/outlinetreeexpansionlevel/) { get; set; } | Specifies up to what level the document outline should be expanded when the PDF file is opened in a viewer. 1 - only the first level outline items are shown, 2 - only the first and second level outline items are shown, and so on. Default is 1. |
| [OutlineTreeHeight](../../aspose.page.xps.presentation.pdf/pdfsaveoptions/outlinetreeheight/) { get; set; } | Specifies the height of the document outline tree to save. 0 - the outline tree will not be converted, 1 - only the first level outline items will be converted, ans so on. Default is 10. |
| [PageNumbers](../../aspose.page.xps.presentation.pdf/pdfsaveoptions/pagenumbers/) { get; set; } | Gets/sets the array of numbers of pages to convert. |
| [PreserveText](../../aspose.page.xps.presentation.pdf/pdfsaveoptions/preservetext/) { get; set; } | In XPS, some text elements may contain references to alternate glyph forms that do not correspond to any character code in the font. If this flag is set to true, the text from such XPS elements is converted to graphic shapes. Then the text itself appears transparent on top. This leaves the text of such elements selectable. But the side effect is that the output file may be much larger than the original. If this flag is set to false, the characters that should be displayed as alternate forms are replaced with some other characters that become mapped to the alternate glyph forms. Therefore the text, although still selectable, will be modified and likely become unreadable. Default is false. |
| [Size](../../aspose.page/saveoptions/size/) { get; set; } | Gets/sets the size of the image. |
| virtual [SupressErrors](../../aspose.page/saveoptions/supresserrors/) { get; set; } | Specifies whether errors must be suppressed or not. If true suppressed errors are added to [`Exceptions`](../../aspose.page/saveoptions/exceptions/) list. If false the first error will terminate the program. |
| [TextCompression](../../aspose.page.xps.presentation.pdf/pdfsaveoptions/textcompression/) { get; set; } | Specifies compression type to be used for all content streams except images. Default is Flate. |

### See Also

* class [SaveOptions](../../aspose.page/saveoptions/)
* interface [IEventBasedModificationOptions](../../aspose.page.xps.presentation/ieventbasedmodificationoptions/)
* interface [IPipelineOptions](../../aspose.page.xps.presentation/ipipelineoptions/)
* interface [IXpsTextConversionOptions](../../aspose.page.xps.presentation/ixpstextconversionoptions/)
* namespace [Aspose.Page.XPS.Presentation.Pdf](../../aspose.page.xps.presentation.pdf/)
* assembly [Aspose.Page](../../)


