---
title: "System::Xml::Serialization::IXmlSerializable sınıfı"
linktitle: "IXmlSerializable"
second_title: "Aspose.Page için C++"
description: "System::Xml::Serialization::IXmlSerializable sınıfı. XML serileştirme ve seriden çıkarma için özel biçimlendirme sağlar. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak allocate edilmelidir. Bu tipin örneğini yığına ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirin."
type: docs
weight: 100
url: /tr/cpp/system.xml.serialization/ixmlserializable/
---
## IXmlSerializable class


XML serileştirme ve seriden çıkarma için özel biçimlendirme sağlar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak allocate edilmelidir. Bu tipin örneğini yığına ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class IXmlSerializable : public virtual System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [GetSchema](./getschema/)() | Bir XmlSchema nesnesi, [WriteXml()](./writexml/) yöntemi tarafından döndürülen ve [ReadXml()](./readxml/) yöntemi tarafından kabul edilen nesnenin XML temsilini tanımlar. |
| virtual [ReadXml](./readxml/)(System::SharedPtr\<System::Xml::XmlReader\>) | Nesneyi XML temsilinden seriden çıkarır. |
| virtual [WriteXml](./writexml/)(System::SharedPtr\<System::Xml::XmlWriter\>) | Geçerli nesneyi XML temsiline serileştirir. |
| virtual [~IXmlSerializable](./~ixmlserializable/)() | Yıkıcı. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Xml::Serialization](../)
* Library [Aspose.Page for C++](../../)
