---
title: "System::Web::Services::Protocols::SoapMessage sınıfı"
linktitle: "SoapMessage"
second_title: "Aspose.Page için C++"
description: "System::Web::Services::Protocols::SoapMessage sınıfı. SOAP mesajını temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek hiçbir zaman yığına (stack) ya da new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 1000
url: /tr/cpp/system.web.services.protocols/soapmessage/
---
## SoapMessage class


SOAP mesajını temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek hiçbir zaman yığına (stack) ya da new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class SoapMessage : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [CollectHeaders](./collectheaders/)(System::SharedPtr\<Object\>, System::ArrayPtr\<System::SharedPtr\<SoapHeaderMapping\>\>, SoapHeaderDirection) | SOAP başlıklarının dahili koleksiyonunu ayarlar. |
| [FindHeader](./findheader/)(System::ArrayPtr\<System::SharedPtr\<SoapHeaderMapping\>\>, const TypeInfo\&) | Belirtilen başlık türüne göre başlık eşlemesini bul. |
| virtual [get_Action](./get_action/)() | 'SOAPAction' özniteliğinin değerini döndürür. |
| [get_ContentEncoding](./get_contentencoding/)() | 'Content-Encoding' başlığının değerini alır. |
| [get_ContentType](./get_contenttype/)() | 'Content-Type' başlığının bir değerini alır. |
| [get_Exception](./get_exception/)() | XML [Web](../../system.web/) hizmet metodunun fırlattığı istisna alır. |
| [get_Headers](./get_headers/)() | SOAP başlıklarının koleksiyonunu döndürür. |
| [get_InParameters](./get_inparameters/)() | XML [Web](../../system.web/) hizmet metoduna geçirilen parametreleri alır. |
| [get_IsSoap12](./get_issoap12/)() | SOAP sürüm 1.2 kullanılıp kullanılmadığını gösteren bir değer döndürür. |
| [get_OutParameters](./get_outparameters/)() | XML [Web](../../system.web/) hizmet metoduna geçirilen çıktı parametrelerini alır. |
| virtual [get_SoapVersion](./get_soapversion/)() | Kullanılan SOAP sürümünü döndürür. |
| [get_Stage](./get_stage/)() | Bir SOAP mesajının işleme aşamasını alır. |
| [get_Stream](./get_stream/)() | SOAP mesajı verilerini içeren akışı alır. |
| virtual [get_Url](./get_url/)() | XML [Web](../../system.web/) hizmetinin URL'sini döndürür. |
| [GetInParameterValue](./getinparametervalue/)(int32_t) | Belirtilen indeksteki giriş parametresi değerini alır. |
| [GetOutParameterValue](./getoutparametervalue/)(int32_t) | Belirtilen indeksteki çıktı parametresi değerini alır. |
| [GetReturnValue](./getreturnvalue/)() | XML [Web](../../system.web/) hizmet metodunun dönüş değerini alır. |
| [set_ContentEncoding](./set_contentencoding/)(String) | 'Content-Encoding' başlığının değerini ayarlar. |
| [set_ContentType](./set_contenttype/)(String) | 'Content-Type' başlığına bir değer ayarlar. |
| [set_InParameters](./set_inparameters/)(System::ArrayPtr\<System::SharedPtr\<Object\>\>) | XML [Web](../../system.web/) hizmet metoduna geçirilen parametreleri ayarlar. |
| [set_InternalStream](./set_internalstream/)(System::SharedPtr\<System::IO::Stream\>) | SOAP mesajı verilerini içeren akışı ayarlar. |
| [set_OutParameters](./set_outparameters/)(System::ArrayPtr\<System::SharedPtr\<Object\>\>) | XML [Web](../../system.web/) hizmet metoduna geçirilen çıktı parametrelerini ayarlar. |
| [SetException](./setexception/)(SoapException) | XML [Web](../../system.web/) hizmet metodunun fırlattığı istisna ayarlar. |
| [SetHeaders](./setheaders/)(System::SharedPtr\<SoapHeaderCollection\>) | SOAP başlıklarının koleksiyonunu ayarlar. |
| [SetStage](./setstage/)(SoapMessageStage) | SOAP mesajının işleme aşamasını ayarlar. |
| [SetStream](./setstream/)(System::SharedPtr\<System::IO::Stream\>) | SOAP mesajı verilerini içeren akışı ayarlar. |
| [SoapMessage](./soapmessage/)() | Yeni bir örnek oluşturur. |
| [UpdateHeaderValues](./updateheadervalues/)(System::SharedPtr\<Object\>, System::ArrayPtr\<System::SharedPtr\<SoapHeaderMapping\>\>) | SOAP başlıklarının iç koleksiyonunu günceller. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
