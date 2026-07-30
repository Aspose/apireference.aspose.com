---
title: "System::Xml::Serialization::XmlSerializer sınıfı"
linktitle: "XmlSerializer"
second_title: "Aspose.Font için C++"
description: "System::Xml::Serialization::XmlSerializer sınıfı. Nesnelerin XML belgelerine serileştirilmesini ve XML belgelerinden ayrıştırılmasını gerçekleştirir. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da operator new ile oluşturmayın; bu, çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 600
url: /tr/cpp/system.xml.serialization/xmlserializer/
---
## XmlSerializer class


Objeleri XML belgelerine serileştirme ve serileştirilmiş halden geri alma işlemlerini gerçekleştirir. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek hiçbir zaman yığına veya new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class XmlSerializer : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [CanDeserialize](./candeserialize/)(System::SharedPtr\<XmlReader\>) | Belirli okuyucunun serileştirilebilir durumda olup olmadığını denetler. |
| [Deserialize](./deserialize/)(System::SharedPtr\<IO::Stream\>) | XML belgesini nesneye serileştirir. |
| [Deserialize](./deserialize/)(System::SharedPtr\<IO::TextReader\>) | XML belgesini nesneye serileştirir. |
| [Deserialize](./deserialize/)(System::SharedPtr\<XmlReader\>) | XML belgesini nesneye serileştirir. |
| [Deserialize](./deserialize/)(System::SharedPtr\<XmlReader\>, String) | XML belgesini nesneye serileştirir. |
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
| static [EncodingNamespace](./encodingnamespace/) | Kodlama ad alanı adı. |
| static [WsdlNamespace](./wsdlnamespace/) | RTTI. |
| static [WsdlTypesNamespace](./wsdltypesnamespace/) | WSDL tipleri ad alanı adı. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Xml::Serialization](../)
* Library [Aspose.Font for C++](../../)
