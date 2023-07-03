---
title: Class PsSaveOptions
second_title: Aspose.Page for .NET API Reference
description: Aspose.Page.EPS.Device.PsSaveOptions class. This class contains options necessary for managing process of converting document to PostScript PS or Encapsulated PostScript EPS file
type: docs
weight: 80
url: /net/aspose.page.eps.device/pssaveoptions/
---
## PsSaveOptions class

This class contains options necessary for managing process of converting document to PostScript (PS) or Encapsulated PostScript (EPS) file.

```csharp
public class PsSaveOptions : SaveOptions
```

## Constructors

| Name | Description |
| --- | --- |
| [PsSaveOptions](pssaveoptions/#constructor)() | Initializes a new instance of the `PsSaveOptions` class with default values for flags !:SuppressErrors (true) and !:Debug (false). |
| [PsSaveOptions](pssaveoptions/#constructor_1)(bool) | Initializes a new instance of the `PsSaveOptions` class with default values for flag !:Debug (false). |

## Properties

| Name | Description |
| --- | --- |
| [AdditionalFontsFolders](../../aspose.page/saveoptions/additionalfontsfolders/) { get; set; } | Specifies additional folders where converter should find fonts for input document. Default folder are standard fonts folder where OS finds fonts for internal needs. |
| [BackgroundColor](../../aspose.page.eps.device/pssaveoptions/backgroundcolor/) { get; set; } | The background color. |
| virtual [Debug](../../aspose.page/saveoptions/debug/) { get; set; } | Specifies whether debug information must be printed to standard output stream or not. |
| [EmbedFonts](../../aspose.page.eps.device/pssaveoptions/embedfonts/) { get; set; } | Indicates whether to embed used fonts in PS document. |
| [EmbedFontsAs](../../aspose.page.eps.device/pssaveoptions/embedfontsas/) { get; set; } | A type of font in which to embed fonts in PS document. |
| virtual [Exceptions](../../aspose.page/saveoptions/exceptions/) { get; } | Returns a list of suppressed conversion errors If !:SuppressErrors is true. |
| [JpegQualityLevel](../../aspose.page/saveoptions/jpegqualitylevel/) { get; set; } | The Quality category specifies the level of compression for an image. Available values are 0 to 100. The lower the number specified, the higher the compression and therefore the lower the quality of the image. 0 value results in lowest quality image, while 100 results in highest. |
| [Margins](../../aspose.page.eps.device/pssaveoptions/margins/) { get; set; } | The margins of the page. |
| [PageSize](../../aspose.page.eps.device/pssaveoptions/pagesize/) { get; set; } | The size of the page. |
| [SaveFormat](../../aspose.page.eps.device/pssaveoptions/saveformat/) { get; set; } | The save format of resulting file. |
| virtual [SupressErrors](../../aspose.page/saveoptions/supresserrors/) { get; set; } | Specifies whether errors must be suppressed or not. If true suppressed errors are added to [`Exceptions`](../../aspose.page/saveoptions/exceptions/) list. If false the first error will terminate the program. |
| [Transparent](../../aspose.page.eps.device/pssaveoptions/transparent/) { get; set; } | Indicates if background is transparent. |

### See Also

* class [SaveOptions](../../aspose.page/saveoptions/)
* namespace [Aspose.Page.EPS.Device](../../aspose.page.eps.device/)
* assembly [Aspose.Page](../../)


