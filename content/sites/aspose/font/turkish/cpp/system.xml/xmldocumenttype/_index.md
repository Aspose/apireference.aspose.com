---
title: "System::Xml::XmlDocumentType sınıfı"
linktitle: "XmlDocumentType"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlDocumentType sınıfı. C++'da belge türü bildirimini temsil eder."
type: docs
weight: 1600
url: /tr/cpp/system.xml/xmldocumenttype/
---
## XmlDocumentType class


Belge türü bildirimini temsil eder.

```cpp
class XmlDocumentType : public System::Xml::XmlLinkedNode
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Bu düğümün bir kopyasını oluşturur. |
| [get_Entities](./get_entities/)() | Belge türü bildiriminde bildirilen [XmlEntity](../xmlentity/) düğümlerinin koleksiyonunu döndürür. |
| [get_InternalSubset](./get_internalsubset/)() | DOCTYPE bildirimindeki belge türü tanımı (DTD) iç alt kümesinin değerini döndürür. |
| [get_IsReadOnly](./get_isreadonly/)() override | Düğümün yalnızca okunur olup olmadığını gösteren bir değer döndürür. |
| [get_LocalName](./get_localname/)() override | Düğümün yerel adını döndürür. |
| [get_Name](./get_name/)() override | Düğümün nitelikli adını döndürür. |
| [get_NodeType](./get_nodetype/)() override | Geçerli düğümün tipini döndürür. |
| [get_Notations](./get_notations/)() | Belge türü bildiriminde bulunan [XmlNotation](../xmlnotation/) düğümlerinin koleksiyonunu döndürür. |
| [get_PublicId](./get_publicid/)() | DOCTYPE bildirimindeki genel tanımlayıcının değerini döndürür. |
| [get_SystemId](./get_systemid/)() | DOCTYPE bildirimindeki sistem tanımlayıcının değerini döndürür. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Düğümün tüm alt öğelerini belirtilen [XmlWriter](../xmlwriter/)'a kaydeder. [XmlDocumentType](./) düğümleri için bu yöntem hiçbir etki yapmaz. |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | Düğümü belirtilen [XmlWriter](../xmlwriter/) öğesine kaydeder. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma ad. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türden örnekleri yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) göstericisine sarın ve bu göstericiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [XmlLinkedNode](../xmllinkednode/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
