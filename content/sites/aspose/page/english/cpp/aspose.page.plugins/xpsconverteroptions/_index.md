---
title: Aspose::Page::Plugins::XpsConverterOptions class
linktitle: XpsConverterOptions
second_title: Aspose.Page for C++
description: 'Aspose::Page::Plugins::XpsConverterOptions class. Represents options for XpsConverter plugin in C++.'
type: docs
weight: 2000
url: /cpp/aspose.page.plugins/xpsconverteroptions/
---
## XpsConverterOptions class


Represents options for [XpsConverter](../xpsconverter/) plugin.

```cpp
class XpsConverterOptions : public Aspose::Page::Plugins::IPluginOptions,
                            public Aspose::Page::Plugins::IDataContainer,
                            public Aspose::Page::Plugins::ISaveInstruction
```

## Methods

| Method | Description |
| --- | --- |
| [AddDataSource](./adddatasource/)(System::SharedPtr\<IDataSource\>) override | Adds new data source to the [XpsConverter](../xpsconverter/) plugin data collection. |
| [AddSaveDataSource](./addsavedatasource/)(System::SharedPtr\<IDataSource\>) override | Adds new data source to the [XpsConverterOptions](./) plugin data collection. |
| [get_DataCollection](./get_datacollection/)() override | Returns [XpsConverterOptions](./) plugin data collection. |
| [get_JpegQualityLevel](./get_jpegqualitylevel/)() const | The Quality category specifies the level of compression for an image. Available values are 0 to 100. The lower the number specified, the higher the compression and therefore the lower the quality of the image. 0 value results in lowest quality image, while 100 results in highest. |
| virtual [get_OperationName](./get_operationname/)() | Returns operation name. |
| [get_SaveTargetsCollection](./get_savetargetscollection/)() override | Gets collection of added targets for saving operation results. |
| [set_JpegQualityLevel](./set_jpegqualitylevel/)(int32_t) | The Quality category specifies the level of compression for an image. Available values are 0 to 100. The lower the number specified, the higher the compression and therefore the lower the quality of the image. 0 value results in lowest quality image, while 100 results in highest. |
## See Also

* Class [IPluginOptions](../ipluginoptions/)
* Class [IDataContainer](../idatacontainer/)
* Class [ISaveInstruction](../isaveinstruction/)
* Namespace [Aspose::Page::Plugins](../)
* Library [Aspose.Page for C++](../../)
