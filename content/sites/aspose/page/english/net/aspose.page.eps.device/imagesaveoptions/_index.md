---
title: Class ImageSaveOptions
second_title: Aspose.Page for .NET API Reference
description: Aspose.Page.EPS.Device.ImageSaveOptions class. This class contains options necessary for managing image saving process
type: docs
weight: 80
url: /net/aspose.page.eps.device/imagesaveoptions/
---
## ImageSaveOptions class

This class contains options necessary for managing image saving process.

```csharp
public class ImageSaveOptions : SaveOptions
```

## Constructors

| Name | Description |
| --- | --- |
| [ImageSaveOptions](imagesaveoptions/#constructor)() | Initializes a new instance of the `ImageSaveOptions` class with default values for flags !:SuppressErrors (true) and Debug (false). |
| [ImageSaveOptions](imagesaveoptions/#constructor_7)(bool) | Initializes a new instance of the `ImageSaveOptions` with default value for flag Debug (false). |
| [ImageSaveOptions](imagesaveoptions/#constructor_1)(ImageFormat) | Initializes a new instance of the `ImageSaveOptions` with with specified image format. |
| [ImageSaveOptions](imagesaveoptions/#constructor_3)(Size) | Initializes a new instance of the `ImageSaveOptions` with with specified size of the image. |
| [ImageSaveOptions](imagesaveoptions/#constructor_2)(ImageFormat, bool) | Initializes a new instance of the `ImageSaveOptions` with with specified image format. |
| [ImageSaveOptions](imagesaveoptions/#constructor_6)(Size, bool) | Initializes a new instance of the `ImageSaveOptions` with with specified size. |
| [ImageSaveOptions](imagesaveoptions/#constructor_4)(Size, ImageFormat) | Initializes a new instance of the `ImageSaveOptions` with with specified size of the image and image format. |
| [ImageSaveOptions](imagesaveoptions/#constructor_5)(Size, ImageFormat, bool) | Initializes a new instance of the `ImageSaveOptions` with with specified size of the image and image format. |

## Properties

| Name | Description |
| --- | --- |
| [AdditionalFontsFolders](../../aspose.page/saveoptions/additionalfontsfolders/) { get; set; } | Specifies additional folders where converter should find fonts for input document. Default folder are standard fonts folder where OS finds fonts for internal needs. |
| virtual [ConvertFontsToTTF](../../aspose.page/saveoptions/convertfontstottf/) { get; set; } | Specifies whether to save non-TrueType fonts to TTF. It significantly decreases the volume of the resulting document in PS to PDF conversion and increases the speed of conversion of PS files with a large quantity of text in non-TrueType fonts to any output format. However there is small vertical shift of text when converting PostSctipt file to image. |
| virtual [Debug](../../aspose.page/saveoptions/debug/) { get; set; } | Specifies whether debug information must be printed to standard output stream or not. |
| virtual [Exceptions](../../aspose.page/saveoptions/exceptions/) { get; } | Returns a list of suppressed conversion errors If !:SuppressErrors is true. |
| [ImageFormat](../../aspose.page.eps.device/imagesaveoptions/imageformat/) { get; set; } | Gets/sets an image format for resulting image. |
| [JpegQualityLevel](../../aspose.page/saveoptions/jpegqualitylevel/) { get; set; } | The Quality category specifies the level of compression for an image. Available values are 0 to 100. The lower the number specified, the higher the compression and therefore the lower the quality of the image. 0 value results in lowest quality image, while 100 results in highest. |
| [Resolution](../../aspose.page.eps.device/imagesaveoptions/resolution/) { get; set; } | Gets/sets the image resolution. |
| [Size](../../aspose.page/saveoptions/size/) { get; set; } | Gets/sets the size of the image. |
| [SmoothingMode](../../aspose.page.eps.device/imagesaveoptions/smoothingmode/) { get; set; } | Gets/sets the smoothing mode for rendering image. |
| virtual [SupressErrors](../../aspose.page/saveoptions/supresserrors/) { get; set; } | Specifies whether errors must be suppressed or not. If true suppressed errors are added to [`Exceptions`](../../aspose.page/saveoptions/exceptions/) list. If false the first error will terminate the program. |
| [TryJoinImageFragments](../../aspose.page.eps.device/imagesaveoptions/tryjoinimagefragments/) { get; set; } | The flag for combining image fragments into one picture. |

### See Also

* class [SaveOptions](../../aspose.page/saveoptions/)
* namespace [Aspose.Page.EPS.Device](../../aspose.page.eps.device/)
* assembly [Aspose.Page](../../)


