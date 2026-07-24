---
title: "System::Xml::Schema::XmlSchemaDocumentation sınıfı"
linktitle: "XmlSchemaDocumentation"
second_title: "Aspose.Page için C++"
description: "System::Xml::Schema::XmlSchemaDocumentation sınıfı. World Wide Web Consortium (W3C) tarafından belirlenen XML Şeması'ndan belge öğesini temsil eder. Bu sınıf, C++'da bir açıklama içinde insanlar tarafından okunacak veya kullanılacak bilgileri belirtir."
type: docs
weight: 2500
url: /tr/cpp/system.xml.schema/xmlschemadocumentation/
---
## XmlSchemaDocumentation class


World Wide [Web](../../system.web/) Consortium (W3C) tarafından belirlenen XML [Schema](../) içindeki **documentation** öğesini temsil eder. Bu sınıf, bir **annotation** içinde insanlar tarafından okunacak veya kullanılacak bilgileri belirtir.

```cpp
class XmlSchemaDocumentation : public System::Xml::Schema::XmlSchemaObject
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Language](./get_language/)() | **xml:lang** özniteliğini döndürür. Bu, içeriklerde kullanılan dili gösteren bir göstergedir. |
| [get_Markup](./get_markup/)() | Belge alt düğümlerini temsil eden [XmlNode](../../system.xml/xmlnode/) nesnelerinin bir dizisini döndürür. |
| [get_Source](./get_source/)() | Bilginin Uniform Resource Identifier (URI) kaynağını döndürür. |
| [set_Language](./set_language/)(const String\&) | **xml:lang** özniteliğini ayarlar. Bu, içeriklerde kullanılan dili gösteren bir göstergedir. |
| [set_Markup](./set_markup/)(const ArrayPtr\<SharedPtr\<XmlNode\>\>\&) | Belge alt düğümlerini temsil eden [XmlNode](../../system.xml/xmlnode/) nesnelerinin bir dizisini ayarlar. |
| [set_Source](./set_source/)(const String\&) | Bilginin Uniform Resource Identifier (URI) kaynağını ayarlar. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma addır. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Yığını üzerinde veya new operatörüyle bu tipin örneklerini asla oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [XmlSchemaObject](../xmlschemaobject/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
