---
title: Aspose::Page::SaveOptions class
linktitle: SaveOptions
second_title: Aspose.Page for C++
description: 'Aspose::Page::SaveOptions class. This class contains options necessary for managing conversion process in C++.'
type: docs
weight: 1500
url: /cpp/aspose.page/saveoptions/
---
## SaveOptions class


This class contains options necessary for managing conversion process.

```cpp
class SaveOptions : public virtual System::Object
```

## Methods

| Method | Description |
| --- | --- |
| [get_AdditionalFontsFolders](./get_additionalfontsfolders/)() const | Specifies additional folders where converter should find fonts for input document. Default folder are standard fonts folder where OS finds fonts for internal needs. |
| virtual [get_Debug](./get_debug/)() | Specifies whether debug information must be printed to standard output stream or not. |
| virtual [get_Exceptions](./get_exceptions/)() | Returns a list of suppressed conversion errors If [SuppressErrors](../) is true. |
| [get_JpegQualityLevel](./get_jpegqualitylevel/)() const | The Quality category specifies the level of compression for an image. Available values are 0 to 100. The lower the number specified, the higher the compression and therefore the lower the quality of the image. 0 value results in lowest quality image, while 100 results in highest. |
| [get_Size](./get_size/)() const | Gets/sets the size of the image. |
| virtual [get_SupressErrors](./get_supresserrors/)() | Specifies whether errors must be suppressed or not. If true suppressed errors are added to [Exceptions](../) list. If false the first error will terminate the program. |
| [SaveOptions](./saveoptions/)() | Initializes a new instance of the [SaveOptions](./) class with default values for flags [SuppressErrors](../) (true) and [Debug](../) (false). |
| [SaveOptions](./saveoptions/)(bool) | Initializes a new instance of the [SaveOptions](./) class with default value for flag [Debug](../) (false). |
| [SaveOptions](./saveoptions/)(Aspose::Page::Drawing::Size) | Initializes a new instance of the [SaveOptions](./) with with specified size of the page. |
| [SaveOptions](./saveoptions/)(bool, Aspose::Page::Drawing::Size) | Initializes a new instance of the [SaveOptions](./) class with default value for flag [Debug](../) (false) and with specified size of the page. |
| [set_AdditionalFontsFolders](./set_additionalfontsfolders/)(System::ArrayPtr\<System::String\>) | Specifies additional folders where converter should find fonts for input document. Default folder are standard fonts folder where OS finds fonts for internal needs. |
| virtual [set_Debug](./set_debug/)(bool) | Specifies whether debug information must be printed to standard output stream or not. |
| [set_JpegQualityLevel](./set_jpegqualitylevel/)(int32_t) | The Quality category specifies the level of compression for an image. Available values are 0 to 100. The lower the number specified, the higher the compression and therefore the lower the quality of the image. 0 value results in lowest quality image, while 100 results in highest. |
| [set_Size](./set_size/)(Aspose::Page::Drawing::Size) | Gets/sets the size of the image. |
| virtual [set_SupressErrors](./set_supresserrors/)(bool) | Specifies whether errors must be suppressed or not. If true suppressed errors are added to [Exceptions](../) list. If false the first error will terminate the program. |
## See Also

* Class [Object](../../system/object/)
* Namespace [Aspose::Page](../)
* Library [Aspose.Page for C++](../../)
