---
title: "System::Xml::Schema::XmlSchemaObjectTable sınıfı"
linktitle: "XmlSchemaObjectTable"
second_title: "Aspose.Font için C++"
description: "System::Xml::Schema::XmlSchemaObjectTable sınıfı. C++'ta XmlSchema sınıfındaki (örneğin, Attributes, AttributeGroups, Elements ve benzeri) içerilen öğeler için koleksiyonları sağlar."
type: docs
weight: 5300
url: /tr/cpp/system.xml.schema/xmlschemaobjecttable/
---
## XmlSchemaObjectTable class


[XmlSchema](../xmlschema/) sınıfındaki (örneğin, Attributes, AttributeGroups, Elements ve benzeri) içerilen öğeler için koleksiyonları sağlar.

```cpp
class XmlSchemaObjectTable : public System::Collections::Generic::IEnumerable<System::Collections::Generic::KeyValuePair<SharedPtr<System::Xml::XmlQualifiedName>, SharedPtr<System::Xml::Schema::XmlSchemaObject>>>
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Contains](./contains/)(const SharedPtr\<XmlQualifiedName\>\&) | Belirtilen nitelikli adın koleksiyonda bulunup bulunmadığını belirler. |
| [get_Count](./get_count/)() | [XmlSchemaObjectTable](./) içinde bulunan öğe sayısını döndürür. |
| [get_Names](./get_names/)() | [XmlSchemaObjectTable](./) içindeki tüm adlandırılmış öğelerin bir koleksiyonunu döndürür. |
| [get_Values](./get_values/)() | [XmlSchemaObjectTable](./) içindeki tüm öğelerin tüm değerlerinin bir koleksiyonunu döndürür. |
| [GetEnumerator](./getenumerator/)() override | [XmlSchemaObjectTable](./) üzerinde yineleme yapabilen bir enumerator döndürür. |
| [idx_get](./idx_get/)(const SharedPtr\<XmlQualifiedName\>\&) | Nitelikli ada göre [XmlSchemaObjectTable](./) içindeki öğeyi döndürür. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma ad. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türden örnekleri yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) göstericisine sarın ve bu göstericiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
