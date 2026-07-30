---
title: "System::Xml::Schema::XmlSchemaInfo sınıfı"
linktitle: "XmlSchemaInfo"
second_title: "Aspose.Font için C++"
description: "System::Xml::Schema::XmlSchemaInfo sınıfı. C++'ta doğrulanmış bir XML düğümünün şema sonrası doğrulama bilgi kümesini temsil eder."
type: docs
weight: 3800
url: /tr/cpp/system.xml.schema/xmlschemainfo/
---
## XmlSchemaInfo class


Doğrulanmış bir XML düğümünün şema-doğrulama sonrası bilgi kümesini temsil eder.

```cpp
class XmlSchemaInfo : public System::Xml::Schema::IXmlSchemaInfo
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_ContentType](./get_contenttype/)() | Bu doğrulanmış XML düğümünün içerik türüne karşılık gelen [XmlSchemaContentType](../xmlschemacontenttype/) nesnesini döndürür. |
| [get_IsDefault](./get_isdefault/)() override | Bu doğrulanmış XML düğümünün, XML [Schema](../) Tanım Dili (XSD) şema doğrulaması sırasında bir varsayılanın uygulanması sonucu ayarlanıp ayarlanmadığını gösteren bir değeri döndürür. |
| [get_IsNil](./get_isnil/)() override | Bu doğrulanmış XML düğümünün değerinin **nil** olup olmadığını gösteren bir değeri döndürür. |
| [get_MemberType](./get_membertype/)() override | Bu doğrulanmış XML düğümü için dinamik şema tipini döndürür. |
| [get_SchemaAttribute](./get_schemaattribute/)() override | Bu doğrulanmış XML düğümüne karşılık gelen derlenmiş [XmlSchemaAttribute](../xmlschemaattribute/) nesnesini döndürür. |
| [get_SchemaElement](./get_schemaelement/)() override | Bu doğrulanmış XML düğümüne karşılık gelen derlenmiş [XmlSchemaElement](../xmlschemaelement/) nesnesini döndürür. |
| [get_SchemaType](./get_schematype/)() override | Bu doğrulanmış XML düğümünün statik XML [Schema](../) Tanım Dili (XSD) şema tipini döndürür. |
| [get_Validity](./get_validity/)() override | Bu doğrulanmış XML düğümünün [XmlSchemaValidity](../xmlschemavalidity/) değerini döndürür. |
| [set_ContentType](./set_contenttype/)(XmlSchemaContentType) | Bu doğrulanmış XML düğümünün içerik türüne karşılık gelen [XmlSchemaContentType](../xmlschemacontenttype/) nesnesini ayarlar. |
| [set_IsDefault](./set_isdefault/)(bool) | Bu doğrulanmış XML düğümünün, XML [Schema](../) Tanım Dili (XSD) şema doğrulaması sırasında bir varsayılanın uygulanması sonucu ayarlanıp ayarlanmadığını gösteren bir değeri ayarlar. |
| [set_IsNil](./set_isnil/)(bool) | Bu doğrulanmış XML düğümünün değerinin **nil** olup olmadığını gösteren bir değeri ayarlar. |
| [set_MemberType](./set_membertype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | Bu doğrulanmış XML düğümü için dinamik şema tipini ayarlar. |
| [set_SchemaAttribute](./set_schemaattribute/)(const SharedPtr\<XmlSchemaAttribute\>\&) | Bu doğrulanmış XML düğümüne karşılık gelen derlenmiş [XmlSchemaAttribute](../xmlschemaattribute/) nesnesini ayarlar. |
| [set_SchemaElement](./set_schemaelement/)(const SharedPtr\<XmlSchemaElement\>\&) | Bu doğrulanmış XML düğümüne karşılık gelen derlenmiş [XmlSchemaElement](../xmlschemaelement/) nesnesini ayarlar. |
| [set_SchemaType](./set_schematype/)(const SharedPtr\<XmlSchemaType\>\&) | Bu doğrulanmış XML düğümünün statik XML [Schema](../) Tanım Dili (XSD) şema tipini ayarlar. |
| [set_Validity](./set_validity/)(XmlSchemaValidity) | Bu doğrulanmış XML düğümünün [XmlSchemaValidity](../xmlschemavalidity/) değerini ayarlar. |
| [XmlSchemaInfo](./xmlschemainfo/)() | Yeni bir [XmlSchemaInfo](./) sınıfının örneğini başlatır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma ad. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türden örnekleri yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) göstericisine sarın ve bu göstericiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [IXmlSchemaInfo](../ixmlschemainfo/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
