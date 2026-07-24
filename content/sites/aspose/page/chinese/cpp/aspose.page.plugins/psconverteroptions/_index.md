---
title: "Aspose::Page::Plugins::PsConverterOptions 类"
linktitle: "PsConverterOptions"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::Plugins::PsConverterOptions 类。表示 C++ 中 PsConverter 插件的选项。"
type: docs
weight: 1200
url: /zh/cpp/aspose.page.plugins/psconverteroptions/
---
## PsConverterOptions class


表示 [PsConverter](../psconverter/) 插件的选项。

```cpp
class PsConverterOptions : public Aspose::Page::Plugins::IPluginOptions,
                           public Aspose::Page::Plugins::IDataContainer,
                           public Aspose::Page::Plugins::ISaveInstruction
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [AddDataSource](./adddatasource/)(System::SharedPtr\<IDataSource\>) override | 向 [PsConverter](../psconverter/) 插件的数据集合添加新数据源。 |
| [AddSaveDataSource](./addsavedatasource/)(System::SharedPtr\<IDataSource\>) override | 向 [PsConverterOptions](./) 插件的数据集合添加新数据源。 |
| [get_AdditionalFontsFolders](./get_additionalfontsfolders/)() const | 指定转换器应在其中查找输入文档字体的附加文件夹。默认文件夹是操作系统用于内部需求的标准字体文件夹。 |
| [get_DataCollection](./get_datacollection/)() override | 返回 [PsConverterOptions](./) 插件的数据集合。 |
| virtual [get_Debug](./get_debug/)() | 指定是否必须将调试信息打印到标准输出流。 |
| virtual [get_Exceptions](./get_exceptions/)() | 如果 [SuppressErrors](../) 为 true，则返回被抑制的转换错误列表。 |
| [get_JpegQualityLevel](./get_jpegqualitylevel/)() const | Quality 类别指定图像的压缩程度。可用值为 0 到 100。指定的数值越低，压缩率越高，图像质量因此越低。0 值产生最低质量的图像，而 100 则产生最高质量的图像。 |
| virtual [get_OperationName](./get_operationname/)() | 返回操作名称。 |
| [get_SaveTargetsCollection](./get_savetargetscollection/)() override | 获取用于保存操作结果的已添加目标的集合。 |
| [get_SupressErrors](./get_supresserrors/)() const | 指定是否必须抑制错误。如果为 true，则将被抑制的错误添加到 [Exceptions](../) 列表中。如果为 false，第一次错误将终止程序。 |
| [set_AdditionalFontsFolders](./set_additionalfontsfolders/)(System::ArrayPtr\<System::String\>) | 指定转换器应在其中查找输入文档字体的附加文件夹。默认文件夹是操作系统用于内部需求的标准字体文件夹。 |
| virtual [set_Debug](./set_debug/)(bool) | 指定是否必须将调试信息打印到标准输出流。 |
| virtual [set_Exceptions](./set_exceptions/)(System::SharedPtr\<System::Collections::Generic::IList\<System::Exception\>\>) | 如果 [SuppressErrors](../) 为 true，则返回被抑制的转换错误列表。 |
| [set_JpegQualityLevel](./set_jpegqualitylevel/)(int32_t) | Quality 类别指定图像的压缩程度。可用值为 0 到 100。指定的数值越低，压缩率越高，图像质量因此越低。0 值产生最低质量的图像，而 100 则产生最高质量的图像。 |
| [set_SupressErrors](./set_supresserrors/)(bool) | 指定是否必须抑制错误。如果为 true，则将被抑制的错误添加到 [Exceptions](../) 列表中。如果为 false，第一次错误将终止程序。 |
## 另见

* Class [IPluginOptions](../ipluginoptions/)
* Class [IDataContainer](../idatacontainer/)
* Class [ISaveInstruction](../isaveinstruction/)
* Namespace [Aspose::Page::Plugins](../)
* Library [Aspose.Page for C++](../../)
