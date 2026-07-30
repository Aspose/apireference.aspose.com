---
title: "System::Xml::Resolvers::XmlPreloadedResolver sınıfı"
linktitle: "XmlPreloadedResolver"
second_title: "Aspose.Font için C++"
description: "System::Xml::Resolvers::XmlPreloadedResolver sınıfı. C++'ta önbelleği DTD'ler veya XML akışlarıyla önceden doldurmak için kullanılan bir sınıfı temsil eder."
type: docs
weight: 100
url: /tr/cpp/system.xml.resolvers/xmlpreloadedresolver/
---
## XmlPreloadedResolver class


Önbelleği DTD'ler veya XML akışlarıyla önceden doldurmak için kullanılan bir sınıfı temsil eder.

```cpp
class XmlPreloadedResolver : public System::Xml::XmlResolver
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Add](./add/)(const SharedPtr\<Uri\>\&, const ArrayPtr\<uint8_t\>\&) | Bir bayt dizisini [XmlPreloadedResolver](./) deposuna ekler ve bir URI'ye eşler. Depo aynı URI için zaten bir eşleme içeriyorsa, mevcut eşleme geçersiz kılınır. |
| [Add](./add/)(const SharedPtr\<Uri\>\&, const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Bir bayt dizisini [XmlPreloadedResolver](./) deposuna ekler ve bir URI'ye eşler. Depo aynı URI için zaten bir eşleme içeriyorsa, mevcut eşleme geçersiz kılınır. |
| [Add](./add/)(const SharedPtr\<Uri\>\&, const SharedPtr\<IO::Stream\>\&) | Bir Akışı [XmlPreloadedResolver](./) deposuna ekler ve bir URI'ye eşler. Depo aynı URI için zaten bir eşleme içeriyorsa, mevcut eşleme geçersiz kılınır. |
| [Add](./add/)(const SharedPtr\<Uri\>\&, const String\&) | Önceden yüklenmiş veriye sahip bir dizeyi [XmlPreloadedResolver](./) deposuna ekler ve bir URI'ye eşler. Depo aynı URI için zaten bir eşleme içeriyorsa, mevcut eşleme geçersiz kılınır. |
| [get_PreloadedUris](./get_preloadeduris/)() | Önceden yüklenmiş URI'lerin bir koleksiyonunu döndürür. |
| [GetEntity](./getentity/)(SharedPtr\<Uri\>, String, const TypeInfo\&) override | Bir URI'yi gerçek kaynağı içeren bir nesneye eşler. |
| [Remove](./remove/)(const SharedPtr\<Uri\>\&) | URI'ye karşılık gelen veriyi [XmlPreloadedResolver](./) deposundan kaldırır. |
| [ResolveUri](./resolveuri/)(SharedPtr\<Uri\>, String) override | Temel ve göreli URI'lerden mutlak URI'yi çözer. |
| [set_Credentials](./set_credentials/)(SharedPtr\<Net::ICredentials\>) override | Temel [Net::WebRequest](../../system.net/webrequest/) kimlik doğrulaması için kullanılan kimlik bilgilerini ayarlar. |
| [SupportsType](./supportstype/)(SharedPtr\<Uri\>, const TypeInfo\&) override | Çözümleyicinin yalnızca Stream dışındaki diğer türleri destekleyip desteklemediğini belirler. |
| [XmlPreloadedResolver](./xmlpreloadedresolver/)() | [XmlPreloadedResolver](./) sınıfının yeni bir örneğini başlatır. |
| [XmlPreloadedResolver](./xmlpreloadedresolver/)(XmlKnownDtds) | Belirtilen önceden yüklenmiş iyi bilinen DTD'lerle [XmlPreloadedResolver](./) sınıfının yeni bir örneğini başlatır. |
| [XmlPreloadedResolver](./xmlpreloadedresolver/)(const SharedPtr\<XmlResolver\>\&) | Belirtilen yedek çözümleyiciyle [XmlPreloadedResolver](./) sınıfının yeni bir örneğini başlatır. |
| [XmlPreloadedResolver](./xmlpreloadedresolver/)(const SharedPtr\<XmlResolver\>\&, XmlKnownDtds) | Belirtilen yedek çözümleyici ve önceden yüklenmiş iyi bilinen DTD'lerle [XmlPreloadedResolver](./) sınıfının yeni bir örneğini başlatır. |
| [XmlPreloadedResolver](./xmlpreloadedresolver/)(const SharedPtr\<XmlResolver\>\&, XmlKnownDtds, const SharedPtr\<Collections::Generic::IEqualityComparer\<SharedPtr\<Uri\>\>\>\&) | Belirtilen yedek çözümleyici, önceden yüklenmiş iyi bilinen DTD'ler ve URI eşitliği karşılaştırıcısıyla [XmlPreloadedResolver](./) sınıfının yeni bir örneğini başlatır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma ad. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türden örnekleri yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) göstericisine sarın ve bu göstericiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [XmlResolver](../../system.xml/xmlresolver/)
* Namespace [System::Xml::Resolvers](../)
* Library [Aspose.Font for C++](../../)
