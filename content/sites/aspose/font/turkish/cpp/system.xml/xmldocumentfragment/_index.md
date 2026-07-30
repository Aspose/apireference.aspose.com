---
title: "System::Xml::XmlDocumentFragment sınıfı"
linktitle: "XmlDocumentFragment"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlDocumentFragment sınıfı. C++'ta ağaç ekleme işlemleri için yararlı olan hafif bir nesneyi temsil eder."
type: docs
weight: 1500
url: /tr/cpp/system.xml/xmldocumentfragment/
---
## XmlDocumentFragment class


Ağaç ekleme işlemleri için yararlı olan hafif bir nesneyi temsil eder.

```cpp
class XmlDocumentFragment : public System::Xml::XmlNode
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Bu düğümün bir kopyasını oluşturur. |
| [get_InnerXml](./get_innerxml/)() override | Bu düğümün çocuklarını temsil eden işaretlemeyi döndürür. |
| [get_LocalName](./get_localname/)() override | Düğümün yerel adını döndürür. |
| [get_Name](./get_name/)() override | Düğümün nitelikli adını döndürür. |
| [get_NodeType](./get_nodetype/)() override | Geçerli düğümün tipini döndürür. |
| [get_OwnerDocument](./get_ownerdocument/)() override | Bu düğümün ait olduğu [XmlDocument](../xmldocument/) öğesini döndürür. |
| [set_InnerXml](./set_innerxml/)(String) override | Bu düğümün çocuklarını temsil eden işaretlemeyi ayarlar. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Düğümün tüm alt öğelerini belirtilen [XmlWriter](../xmlwriter/) öğesine kaydeder. |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | Düğümü belirtilen [XmlWriter](../xmlwriter/) öğesine kaydeder. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma ad. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türden örnekleri yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) göstericisine sarın ve bu göstericiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [XmlNode](../xmlnode/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
