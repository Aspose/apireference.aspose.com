---
title: "System::Xml::Schema::XmlSchemaDocumentation sınıf"
linktitle: "XmlSchemaDocumentation"
second_title: "Aspose.Font için C++"
description: "System::Xml::Schema::XmlSchemaDocumentation sınıf. XML Şeması'ndan, World Wide Web Consortium (W3C) tarafından belirlenen documentation öğesini temsil eder. Bu sınıf, C++'de bir açıklama içinde insanlar tarafından okunacak veya kullanılacak bilgileri belirtir."
type: docs
weight: 2500
url: /tr/cpp/system.xml.schema/xmlschemadocumentation/
---
## XmlSchemaDocumentation class


**documentation** öğesini, XML [Schema](../) üzerinden, World Wide [Web](../../system.web/) Consortium (W3C) tarafından belirlenen şekilde temsil eder. Bu sınıf, insanlar tarafından **annotation** içinde okunacak veya kullanılacak bilgileri belirtir.

```cpp
class XmlSchemaDocumentation : public System::Xml::Schema::XmlSchemaObject
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Language](./get_language/)() | **xml:lang** özniteliğini döndürür. Bu, içerikte kullanılan dilin bir göstergesi olarak hizmet eder. |
| [get_Markup](./get_markup/)() | documentation alt düğümlerini temsil eden [XmlNode](../../system.xml/xmlnode/) nesnelerinden oluşan bir dizi döndürür. |
| [get_Source](./get_source/)() | Bilginin Uniform Resource Identifier (URI) kaynağını döndürür. |
| [set_Language](./set_language/)(const String\&) | **xml:lang** özniteliğini ayarlar. Bu, içerikte kullanılan dilin bir göstergesi olarak hizmet eder. |
| [set_Markup](./set_markup/)(const ArrayPtr\<SharedPtr\<XmlNode\>\>\&) | documentation alt düğümlerini temsil eden [XmlNode](../../system.xml/xmlnode/) nesnelerinden oluşan bir dizi ayarlar. |
| [set_Source](./set_source/)(const String\&) | Bilginin Uniform Resource Identifier (URI) kaynağını ayarlar. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma ad. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türden örnekleri yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) göstericisine sarın ve bu göstericiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [XmlSchemaObject](../xmlschemaobject/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
