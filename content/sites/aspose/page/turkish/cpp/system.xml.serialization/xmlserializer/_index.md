---
title: "System::Xml::Serialization::XmlSerializer sınıfı"
linktitle: "XmlSerializer"
second_title: "Aspose.Page için C++"
description: "System::Xml::Serialization::XmlSerializer sınıfı. Nesnelerin XML belgelerine ve belgelerden serileştirilmesi ve seriden çıkarılmasını gerçekleştirir. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak tahsis edilmelidir. Bu tür bir örneği yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için C++'ta kullanın."
type: docs
weight: 600
url: /tr/cpp/system.xml.serialization/xmlserializer/
---
## XmlSerializer class


Nesnelerin XML belgelerine ve belgelerden serileştirilmesi ve seriden çıkarılmasını gerçekleştirir. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak tahsis edilmelidir. Bu tür bir örneği yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class XmlSerializer : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [CanDeserialize](./candeserialize/)(System::SharedPtr\<XmlReader\>) | Belirli okuyucunun seriden çıkarılabilir durumda olup olmadığını kontrol eder. |
| [Deserialize](./deserialize/)(System::SharedPtr\<IO::Stream\>) | XML belgesini nesneye seriden çıkarır. |
| [Deserialize](./deserialize/)(System::SharedPtr\<IO::TextReader\>) | XML belgesini nesneye seriden çıkarır. |
| [Deserialize](./deserialize/)(System::SharedPtr\<XmlReader\>) | XML belgesini nesneye seriden çıkarır. |
| [Deserialize](./deserialize/)(System::SharedPtr\<XmlReader\>, String) | XML belgesini nesneye seriden çıkarır. |
| [Serialize](./serialize/)(System::SharedPtr\<IO::Stream\>, System::SharedPtr\<Object\>) | Belgeyi XML'e serileştirir. |
| [Serialize](./serialize/)(System::SharedPtr\<IO::TextWriter\>, System::SharedPtr\<Object\>) | Belgeyi XML'e serileştirir. |
| [Serialize](./serialize/)(System::SharedPtr\<XmlWriter\>, System::SharedPtr\<Object\>) | Belgeyi XML'e serileştirir. |
| [Serialize](./serialize/)(System::SharedPtr\<IO::Stream\>, System::SharedPtr\<Object\>, System::SharedPtr\<XmlSerializerNamespaces\>) | Belgeyi XML'e serileştirir. |
| [Serialize](./serialize/)(System::SharedPtr\<IO::TextWriter\>, System::SharedPtr\<Object\>, System::SharedPtr\<XmlSerializerNamespaces\>) | Belgeyi XML'e serileştirir. |
| [Serialize](./serialize/)(System::SharedPtr\<XmlWriter\>, System::SharedPtr\<Object\>, System::SharedPtr\<XmlSerializerNamespaces\>) | Belgeyi XML'e serileştirir. |
| [Serialize](./serialize/)(System::SharedPtr\<XmlWriter\>, System::SharedPtr\<Object\>, System::SharedPtr\<XmlSerializerNamespaces\>, String) | Belgeyi XML'e serileştirir. |
| [Serialize](./serialize/)(System::SharedPtr\<XmlWriter\>, System::SharedPtr\<Object\>, System::SharedPtr\<XmlSerializerNamespaces\>, String, String) | Belgeyi XML'e serileştirir. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static [EncodingNamespace](./encodingnamespace/) | Ad alanı adını kodluyor. |
| static [WsdlNamespace](./wsdlnamespace/) | RTTI. |
| static [WsdlTypesNamespace](./wsdltypesnamespace/) | WSDL tipleri ad alanı adı. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Xml::Serialization](../)
* Library [Aspose.Page for C++](../../)
