---
title: Aspose::Page::Plugins::PsConverterOptions class
linktitle: PsConverterOptions
second_title: Aspose.Page for C++
description: 'Aspose::Page::Plugins::PsConverterOptions class. Represents options for PsConverter plugin in C++.'
type: docs
weight: 1200
url: /cpp/aspose.page.plugins/psconverteroptions/
---
## PsConverterOptions class


Represents options for [PsConverter](../psconverter/) plugin.

```cpp
class PsConverterOptions : public Aspose::Page::Plugins::IPluginOptions,
                           public Aspose::Page::Plugins::IDataContainer,
                           public Aspose::Page::Plugins::ISaveInstruction
```

## Methods

| Method | Description |
| --- | --- |
| [AddDataSource](./adddatasource/)(System::SharedPtr\<IDataSource\>) override | Adds new data source to the [PsConverter](../psconverter/) plugin data collection. |
| [AddSaveDataSource](./addsavedatasource/)(System::SharedPtr\<IDataSource\>) override | Adds new data source to the [PsConverterOptions](./) plugin data collection. |
| [get_AdditionalFontsFolders](./get_additionalfontsfolders/)() const | Specifies additional folders where converter should find fonts for input document. Default folder are standard fonts folder where OS finds fonts for internal needs. |
| [get_DataCollection](./get_datacollection/)() override | Returns [PsConverterOptions](./) plugin data collection. |
| virtual [get_Debug](./get_debug/)() | Specifies whether debug information must be printed to standard output stream or not. |
| virtual [get_Exceptions](./get_exceptions/)() | Returns a list of suppressed conversion errors If [SuppressErrors](../) is true. |
| [get_JpegQualityLevel](./get_jpegqualitylevel/)() const | The Quality category specifies the level of compression for an image. Available values are 0 to 100. The lower the number specified, the higher the compression and therefore the lower the quality of the image. 0 value results in lowest quality image, while 100 results in highest. |
| virtual [get_OperationName](./get_operationname/)() | Returns operation name. |
| [get_SaveTargetsCollection](./get_savetargetscollection/)() override | Gets collection of added targets for saving operation results. |
| [get_SupressErrors](./get_supresserrors/)() const | Specifies whether errors must be suppressed or not. If true suppressed errors are added to [Exceptions](../) list. If false the first error will terminate the program. |
| [set_AdditionalFontsFolders](./set_additionalfontsfolders/)(System::ArrayPtr\<System::String\>) | Specifies additional folders where converter should find fonts for input document. Default folder are standard fonts folder where OS finds fonts for internal needs. |
| virtual [set_Debug](./set_debug/)(bool) | Specifies whether debug information must be printed to standard output stream or not. |
| virtual [set_Exceptions](./set_exceptions/)(System::SharedPtr\<System::Collections::Generic::IList\<System::Exception\>\>) | Returns a list of suppressed conversion errors If [SuppressErrors](../) is true. |
| [set_JpegQualityLevel](./set_jpegqualitylevel/)(int32_t) | The Quality category specifies the level of compression for an image. Available values are 0 to 100. The lower the number specified, the higher the compression and therefore the lower the quality of the image. 0 value results in lowest quality image, while 100 results in highest. |
| [set_SupressErrors](./set_supresserrors/)(bool) | Specifies whether errors must be suppressed or not. If true suppressed errors are added to [Exceptions](../) list. If false the first error will terminate the program. |
## See Also

* Class [IPluginOptions](../ipluginoptions/)
* Class [IDataContainer](../idatacontainer/)
* Class [ISaveInstruction](../isaveinstruction/)
* Namespace [Aspose::Page::Plugins](../)
* Library [Aspose.Page for C++](../../)
