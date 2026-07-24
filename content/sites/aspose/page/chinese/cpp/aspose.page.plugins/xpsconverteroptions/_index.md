---
title: "Aspose::Page::Plugins::XpsConverterOptions 类"
linktitle: "XpsConverterOptions"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::Plugins::XpsConverterOptions 类。表示 C++ 中 XpsConverter 插件的选项。"
type: docs
weight: 2000
url: /zh/cpp/aspose.page.plugins/xpsconverteroptions/
---
## XpsConverterOptions class


表示 [XpsConverter](../xpsconverter/) 插件的选项。

```cpp
class XpsConverterOptions : public Aspose::Page::Plugins::IPluginOptions,
                            public Aspose::Page::Plugins::IDataContainer,
                            public Aspose::Page::Plugins::ISaveInstruction
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [AddDataSource](./adddatasource/)(System::SharedPtr\<IDataSource\>) override | 向 [XpsConverter](../xpsconverter/) 插件的数据集合添加新数据源。 |
| [AddSaveDataSource](./addsavedatasource/)(System::SharedPtr\<IDataSource\>) override | 向 [XpsConverterOptions](./) 插件的数据集合添加新数据源。 |
| [get_DataCollection](./get_datacollection/)() override | 返回 [XpsConverterOptions](./) 插件的数据集合。 |
| [get_JpegQualityLevel](./get_jpegqualitylevel/)() const | Quality 类别指定图像的压缩程度。可用值为 0 到 100。指定的数值越低，压缩率越高，图像质量因此越低。0 值产生最低质量的图像，而 100 则产生最高质量的图像。 |
| virtual [get_OperationName](./get_operationname/)() | 返回操作名称。 |
| [get_SaveTargetsCollection](./get_savetargetscollection/)() override | 获取用于保存操作结果的已添加目标的集合。 |
| [set_JpegQualityLevel](./set_jpegqualitylevel/)(int32_t) | Quality 类别指定图像的压缩程度。可用值为 0 到 100。指定的数值越低，压缩率越高，图像质量因此越低。0 值产生最低质量的图像，而 100 则产生最高质量的图像。 |
## 另见

* Class [IPluginOptions](../ipluginoptions/)
* Class [IDataContainer](../idatacontainer/)
* Class [ISaveInstruction](../isaveinstruction/)
* Namespace [Aspose::Page::Plugins](../)
* Library [Aspose.Page for C++](../../)
