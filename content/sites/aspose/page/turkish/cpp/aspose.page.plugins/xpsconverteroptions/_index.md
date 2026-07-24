---
title: "Aspose::Page::Plugins::XpsConverterOptions sınıfı"
linktitle: "XpsConverterOptions"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::Plugins::XpsConverterOptions sınıfı. C++'da XpsConverter eklentisi için seçenekleri temsil eder."
type: docs
weight: 2000
url: /tr/cpp/aspose.page.plugins/xpsconverteroptions/
---
## XpsConverterOptions class


[XpsConverter](../xpsconverter/) eklentisi için seçenekleri temsil eder.

```cpp
class XpsConverterOptions : public Aspose::Page::Plugins::IPluginOptions,
                            public Aspose::Page::Plugins::IDataContainer,
                            public Aspose::Page::Plugins::ISaveInstruction
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [AddDataSource](./adddatasource/)(System::SharedPtr\<IDataSource\>) override | [XpsConverter](../xpsconverter/) eklentisinin veri koleksiyonuna yeni bir veri kaynağı ekler. |
| [AddSaveDataSource](./addsavedatasource/)(System::SharedPtr\<IDataSource\>) override | [XpsConverterOptions](./) eklentisinin veri koleksiyonuna yeni bir veri kaynağı ekler. |
| [get_DataCollection](./get_datacollection/)() override | [XpsConverterOptions](./) eklentisinin veri koleksiyonunu döndürür. |
| [get_JpegQualityLevel](./get_jpegqualitylevel/)() const | Kalite kategorisi, bir görüntünün sıkıştırma seviyesini belirtir. Kullanılabilir değerler 0 ile 100 arasındadır. Belirtilen sayı ne kadar düşük olursa sıkıştırma o kadar yüksek olur ve dolayısıyla görüntünün kalitesi o kadar düşük olur. 0 değeri en düşük kaliteye, 100 değeri ise en yüksek kaliteye sahip görüntü üretir. |
| virtual [get_OperationName](./get_operationname/)() | İşlem adını döndürür. |
| [get_SaveTargetsCollection](./get_savetargetscollection/)() override | Kaydedilen işlem sonuçları için eklenen hedeflerin koleksiyonunu alır. |
| [set_JpegQualityLevel](./set_jpegqualitylevel/)(int32_t) | Kalite kategorisi, bir görüntünün sıkıştırma seviyesini belirtir. Kullanılabilir değerler 0 ile 100 arasındadır. Belirtilen sayı ne kadar düşük olursa sıkıştırma o kadar yüksek olur ve dolayısıyla görüntünün kalitesi o kadar düşük olur. 0 değeri en düşük kaliteye, 100 değeri ise en yüksek kaliteye sahip görüntü üretir. |
## Ayrıca Bakınız

* Class [IPluginOptions](../ipluginoptions/)
* Class [IDataContainer](../idatacontainer/)
* Class [ISaveInstruction](../isaveinstruction/)
* Namespace [Aspose::Page::Plugins](../)
* Library [Aspose.Page for C++](../../)
