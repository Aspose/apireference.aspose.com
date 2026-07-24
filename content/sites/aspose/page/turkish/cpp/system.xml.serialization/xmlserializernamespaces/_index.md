---
title: "System::Xml::Serialization::XmlSerializerNamespaces sınıfı"
linktitle: "XmlSerializerNamespaces"
second_title: "Aspose.Page için C++"
description: "System::Xml::Serialization::XmlSerializerNamespaces sınıfı. C++'da Serialization::XmlSerializer'ın bir XML belge örneğinde nitelikli adlar oluşturmak için kullandığı XML ad alanlarını ve öneklerini içerir."
type: docs
weight: 800
url: /tr/cpp/system.xml.serialization/xmlserializernamespaces/
---
## XmlSerializerNamespaces class


Bir XML belge örneğinde nitelikli adlar oluşturmak için [Serialization::XmlSerializer](../xmlserializer/) tarafından kullanılan XML ad alanlarını ve öneklerini içerir.

```cpp
class XmlSerializerNamespaces : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Add](./add/)(const String\&, const String\&) | Bir [Serialization::XmlSerializerNamespaces](./) nesnesine bir önek ve ad alanı çifti ekler. |
| [get_Count](./get_count/)() | Koleksiyondaki önek ve ad alanı çiftlerinin sayısını döndürür. |
| [get_NamespaceList](./get_namespacelist/)() |  |
| [get_Namespaces](./get_namespaces/)() |  |
| [set_Namespaces](./set_namespaces/)(const SharedPtr\<Collections::Generic::Dictionary\<String, String\>\>\&) |  |
| [ToArray](./toarray/)() | Bir [Serialization::XmlSerializerNamespaces](./) nesnesindeki önek ve ad alanı çiftlerinin dizisini döndürür. |
| [XmlSerializerNamespaces](./xmlserializernamespaces/)() | Yeni bir [Serialization::XmlSerializerNamespaces](./) sınıfının örneğini başlatır. |
| [XmlSerializerNamespaces](./xmlserializernamespaces/)(const SharedPtr\<XmlSerializerNamespaces\>\&) | Belirtilen önek ve ad alanı çifti koleksiyonunu içeren **[XmlSerializerNamespaces](./)** örneğini kullanarak yeni bir [Serialization::XmlSerializerNamespaces](./) sınıfının örneğini başlatır. |
| [XmlSerializerNamespaces](./xmlserializernamespaces/)(const ArrayPtr\<SharedPtr\<XmlQualifiedName\>\>\&) | Yeni bir [Serialization::XmlSerializerNamespaces](./) sınıfının örneğini başlatır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma addır. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Yığını üzerinde veya new operatörüyle bu tipin örneklerini asla oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Xml::Serialization](../)
* Library [Aspose.Page for C++](../../)
