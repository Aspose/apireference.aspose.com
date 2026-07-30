---
title: "System::Xml::Serialization::IXmlSerializable class"
linktitle: "IXmlSerializable"
second_title: "Aspose.Font için C++"
description: "System::Xml::Serialization::IXmlSerializable sınıfı. XML serileştirme ve serileştirilmiş halden geri alma için özel biçimlendirme sağlar. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek hiçbir zaman yığına veya new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman C++'ta System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin."
type: docs
weight: 100
url: /tr/cpp/system.xml.serialization/ixmlserializable/
---
## IXmlSerializable class


XML serileştirme ve serileştirilmiş halden geri alma için özel biçimlendirme sağlar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek hiçbir zaman yığına veya new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class IXmlSerializable : public virtual System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [GetSchema](./getschema/)() | Bir XmlSchema nesnesi, [WriteXml()](./writexml/) yöntemi tarafından döndürülen ve [ReadXml()](./readxml/) yöntemi tarafından kabul edilen nesnenin XML temsilini tanımlar. |
| virtual [ReadXml](./readxml/)(System::SharedPtr\<System::Xml::XmlReader\>) | Nesneyi XML temsilinden geri alır. |
| virtual [WriteXml](./writexml/)(System::SharedPtr\<System::Xml::XmlWriter\>) | Geçerli nesneyi XML temsiline serileştirir. |
| virtual [~IXmlSerializable](./~ixmlserializable/)() | Yıkıcı. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Xml::Serialization](../)
* Library [Aspose.Font for C++](../../)
