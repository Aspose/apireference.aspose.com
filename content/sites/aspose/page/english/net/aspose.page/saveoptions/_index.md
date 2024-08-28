---
title: Class SaveOptions
second_title: Aspose.Page for .NET API Reference
description: Aspose.Page.SaveOptions class. This class contains options necessary for managing conversion process
type: docs
weight: 510
url: /net/aspose.page/saveoptions/
---
## SaveOptions class

This class contains options necessary for managing conversion process.

```csharp
public class SaveOptions
```

## Constructors

| Name | Description |
| --- | --- |
| [SaveOptions](saveoptions/#constructor)() | Initializes a new instance of the `SaveOptions` class with default values for flags !:SuppressErrors (true) and [`Debug`](./debug/) (false). |
| [SaveOptions](saveoptions/#constructor_2)(bool) | Initializes a new instance of the `SaveOptions` class with default value for flag [`Debug`](./debug/) (false). |
| [SaveOptions](saveoptions/#constructor_1)(Size) | Initializes a new instance of the `SaveOptions` with with specified size of the page. |
| [SaveOptions](saveoptions/#constructor_3)(bool, Size) | Initializes a new instance of the `SaveOptions` class with default value for flag [`Debug`](./debug/) (false) and with specified size of the page. |

## Properties

| Name | Description |
| --- | --- |
| [AdditionalFontsFolders](../../aspose.page/saveoptions/additionalfontsfolders/) { get; set; } | Specifies additional folders where converter should find fonts for input document. Default folder are standard fonts folder where OS finds fonts for internal needs. |
| virtual [Debug](../../aspose.page/saveoptions/debug/) { get; set; } | Specifies whether debug information must be printed to standard output stream or not. |
| virtual [Exceptions](../../aspose.page/saveoptions/exceptions/) { get; } | Returns a list of suppressed conversion errors If !:SuppressErrors is true. |
| [JpegQualityLevel](../../aspose.page/saveoptions/jpegqualitylevel/) { get; set; } | The Quality category specifies the level of compression for an image. Available values are 0 to 100. The lower the number specified, the higher the compression and therefore the lower the quality of the image. 0 value results in lowest quality image, while 100 results in highest. |
| [Size](../../aspose.page/saveoptions/size/) { get; set; } | Gets/sets the size of the image. |
| virtual [SupressErrors](../../aspose.page/saveoptions/supresserrors/) { get; set; } | Specifies whether errors must be suppressed or not. If true suppressed errors are added to [`Exceptions`](./exceptions/) list. If false the first error will terminate the program. |

### See Also

* namespace [Aspose.Page](../../aspose.page/)
* assembly [Aspose.Page](../../)


