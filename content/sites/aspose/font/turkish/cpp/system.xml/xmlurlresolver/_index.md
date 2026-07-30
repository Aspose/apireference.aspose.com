---
title: "System::Xml::XmlUrlResolver sınıfı"
linktitle: "XmlUrlResolver"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlUrlResolver sınıfı. C++'da Birleşik Kaynak Tanımlayıcısı (URI) ile adlandırılan dış XML kaynaklarını çözer."
type: docs
weight: 4100
url: /tr/cpp/system.xml/xmlurlresolver/
---
## XmlUrlResolver class


Bir Uniform Resource Identifier (URI) tarafından adlandırılan dış XML kaynaklarını çözer.

```cpp
class XmlUrlResolver : public System::Xml::XmlResolver
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [GetEntity](./getentity/)(SharedPtr\<Uri\>, String, const TypeInfo\&) override | Bir URI'yi gerçek kaynağı içeren bir nesneye eşler. |
| [ResolveUri](./resolveuri/)(SharedPtr\<Uri\>, String) override | Temel ve göreli URI'lerden mutlak URI'yi çözer. |
| [set_CachePolicy](./set_cachepolicy/)(const SharedPtr\<Net::Cache::RequestCachePolicy\>\&) | Temel WebRequest nesnesi için önbellek politikasını ayarlar. |
| [set_Credentials](./set_credentials/)(SharedPtr\<Net::ICredentials\>) override | Web isteklerini kimlik doğrulamak için kullanılan kimlik bilgilerini ayarlar. |
| [set_Proxy](./set_proxy/)(const SharedPtr\<Net::IWebProxy\>\&) | Temel WebRequest nesnesi için ağ proxy'sini ayarlar. |
| [XmlUrlResolver](./xmlurlresolver/)() | [XmlUrlResolver](./) sınıfının yeni bir örneğini başlatır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma ad. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türden örnekleri yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) göstericisine sarın ve bu göstericiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [XmlResolver](../xmlresolver/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
