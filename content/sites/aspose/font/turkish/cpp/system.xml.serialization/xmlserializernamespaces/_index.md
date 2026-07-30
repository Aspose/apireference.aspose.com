---
title: "System::Xml::Serialization::XmlSerializerNamespaces sınıf"
linktitle: "XmlSerializerNamespaces"
second_title: "Aspose.Font için C++"
description: "System::Xml::Serialization::XmlSerializerNamespaces sınıf. Serialization::XmlSerializer'ın C++'ta bir XML belge örneğinde nitelikli adlar oluşturmak için kullandığı XML ad alanlarını ve öneklerini içerir."
type: docs
weight: 800
url: /tr/cpp/system.xml.serialization/xmlserializernamespaces/
---
## XmlSerializerNamespaces class


XML ad alanları ve öneklerini içerir; bu önek ve ad alanları, [Serialization::XmlSerializer](../xmlserializer/) tarafından bir XML belge örneğinde nitelikli adlar oluşturmak için kullanılır.

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
| [XmlSerializerNamespaces](./xmlserializernamespaces/)() | [Serialization::XmlSerializerNamespaces](./) sınıfının yeni bir örneğini başlatır. |
| [XmlSerializerNamespaces](./xmlserializernamespaces/)(const SharedPtr\<XmlSerializerNamespaces\>\&) | [Serialization::XmlSerializerNamespaces](./) sınıfının yeni bir örneğini, önek ve ad alanı çiftleri koleksiyonunu içeren belirtilen **[XmlSerializerNamespaces](./)** örneğini kullanarak başlatır. |
| [XmlSerializerNamespaces](./xmlserializernamespaces/)(const ArrayPtr\<SharedPtr\<XmlQualifiedName\>\>\&) | [Serialization::XmlSerializerNamespaces](./) sınıfının yeni bir örneğini başlatır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma ad. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türden örnekleri yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) göstericisine sarın ve bu göstericiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Xml::Serialization](../)
* Library [Aspose.Font for C++](../../)
