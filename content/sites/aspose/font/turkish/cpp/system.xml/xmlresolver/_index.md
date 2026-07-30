---
title: "System::Xml::XmlResolver sınıfı"
linktitle: "XmlResolver"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlResolver sınıfı. C++'da Birleşik Kaynak Tanımlayıcısı (URI) ile adlandırılan harici XML kaynaklarını çözer."
type: docs
weight: 3500
url: /tr/cpp/system.xml/xmlresolver/
---
## XmlResolver class


Bir Uniform Resource Identifier (URI) tarafından adlandırılan dış XML kaynaklarını çözer.

```cpp
class XmlResolver : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [GetEntity](./getentity/)(SharedPtr\<Uri\>, String, const TypeInfo\&) | Türetilmiş bir sınıfta geçersiz kılındığında, bir URI'yi gerçek kaynağı içeren bir nesneye eşler. |
| virtual [ResolveUri](./resolveuri/)(SharedPtr\<Uri\>, String) | Türetilmiş bir sınıfta geçersiz kılındığında, temel ve göreli URI'lerden mutlak URI'yi çözer. |
| virtual [set_Credentials](./set_credentials/)(SharedPtr\<Net::ICredentials\>) | Türetilmiş bir sınıfta geçersiz kılındığında, web isteklerini kimlik doğrulamak için kullanılan kimlik bilgilerini ayarlar. |
| virtual [SupportsType](./supportstype/)(SharedPtr\<Uri\>, const TypeInfo\&) | Çözücünün Stream dışındaki türleri döndürmesini sağlar. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma ad. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
