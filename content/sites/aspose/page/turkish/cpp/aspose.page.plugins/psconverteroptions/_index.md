---
title: "Aspose::Page::Plugins::PsConverterOptions sınıf"
linktitle: "PsConverterOptions"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::Plugins::PsConverterOptions sınıf. C++'da PsConverter eklentisi için seçenekleri temsil eder."
type: docs
weight: 1200
url: /tr/cpp/aspose.page.plugins/psconverteroptions/
---
## PsConverterOptions class


[PsConverter](../psconverter/) eklentisi için seçenekleri temsil eder.

```cpp
class PsConverterOptions : public Aspose::Page::Plugins::IPluginOptions,
                           public Aspose::Page::Plugins::IDataContainer,
                           public Aspose::Page::Plugins::ISaveInstruction
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [AddDataSource](./adddatasource/)(System::SharedPtr\<IDataSource\>) override | Yeni veri kaynağını [PsConverter](../psconverter/) eklentisinin veri koleksiyonuna ekler. |
| [AddSaveDataSource](./addsavedatasource/)(System::SharedPtr\<IDataSource\>) override | Yeni veri kaynağını [PsConverterOptions](./) eklentisinin veri koleksiyonuna ekler. |
| [get_AdditionalFontsFolders](./get_additionalfontsfolders/)() const | Dönüştürücünün giriş belgesi için yazı tiplerini bulması gereken ek klasörleri belirtir. Varsayılan klasör, işletim sisteminin dahili ihtiyaçları için yazı tiplerini bulduğu standart yazı tipi klasörüdür. |
| [get_DataCollection](./get_datacollection/)() override | [PsConverterOptions](./) eklentisinin veri koleksiyonunu döndürür. |
| virtual [get_Debug](./get_debug/)() | Hata ayıklama bilgilerinin standart çıktı akışına yazdırılıp yazdırılmayacağını belirtir. |
| virtual [get_Exceptions](./get_exceptions/)() | [SuppressErrors](../) doğru ise, bastırılan dönüşüm hatalarının bir listesini döndürür. |
| [get_JpegQualityLevel](./get_jpegqualitylevel/)() const | Kalite kategorisi, bir görüntünün sıkıştırma seviyesini belirtir. Kullanılabilir değerler 0 ile 100 arasındadır. Belirtilen sayı ne kadar düşük olursa sıkıştırma o kadar yüksek olur ve dolayısıyla görüntünün kalitesi o kadar düşük olur. 0 değeri en düşük kaliteye, 100 değeri ise en yüksek kaliteye sahip görüntü üretir. |
| virtual [get_OperationName](./get_operationname/)() | İşlem adını döndürür. |
| [get_SaveTargetsCollection](./get_savetargetscollection/)() override | Kaydedilen işlem sonuçları için eklenen hedeflerin koleksiyonunu alır. |
| [get_SupressErrors](./get_supresserrors/)() const | Hataların bastırılıp bastırılmayacağını belirtir. Doğru ise bastırılan hatalar [Exceptions](../) listesine eklenir. Yanlış ise ilk hata programı sonlandırır. |
| [set_AdditionalFontsFolders](./set_additionalfontsfolders/)(System::ArrayPtr\<System::String\>) | Dönüştürücünün giriş belgesi için yazı tiplerini bulması gereken ek klasörleri belirtir. Varsayılan klasör, işletim sisteminin dahili ihtiyaçları için yazı tiplerini bulduğu standart yazı tipi klasörüdür. |
| virtual [set_Debug](./set_debug/)(bool) | Hata ayıklama bilgilerinin standart çıktı akışına yazdırılıp yazdırılmayacağını belirtir. |
| virtual [set_Exceptions](./set_exceptions/)(System::SharedPtr\<System::Collections::Generic::IList\<System::Exception\>\>) | [SuppressErrors](../) doğru ise, bastırılan dönüşüm hatalarının bir listesini döndürür. |
| [set_JpegQualityLevel](./set_jpegqualitylevel/)(int32_t) | Kalite kategorisi, bir görüntünün sıkıştırma seviyesini belirtir. Kullanılabilir değerler 0 ile 100 arasındadır. Belirtilen sayı ne kadar düşük olursa sıkıştırma o kadar yüksek olur ve dolayısıyla görüntünün kalitesi o kadar düşük olur. 0 değeri en düşük kaliteye, 100 değeri ise en yüksek kaliteye sahip görüntü üretir. |
| [set_SupressErrors](./set_supresserrors/)(bool) | Hataların bastırılıp bastırılmayacağını belirtir. Doğru ise bastırılan hatalar [Exceptions](../) listesine eklenir. Yanlış ise ilk hata programı sonlandırır. |
## Ayrıca Bakınız

* Class [IPluginOptions](../ipluginoptions/)
* Class [IDataContainer](../idatacontainer/)
* Class [ISaveInstruction](../isaveinstruction/)
* Namespace [Aspose::Page::Plugins](../)
* Library [Aspose.Page for C++](../../)
