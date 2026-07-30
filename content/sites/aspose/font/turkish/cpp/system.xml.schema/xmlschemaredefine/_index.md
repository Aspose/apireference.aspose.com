---
title: "System::Xml::Schema::XmlSchemaRedefine sınıfı"
linktitle: "XmlSchemaRedefine"
second_title: "Aspose.Font için C++"
description: "System::Xml::Schema::XmlSchemaRedefine sınıfı. Dünya Çapında Ağ Konsorsiyumu (W3C) tarafından belirlenen XML Şeması'ndan redefine öğesini temsil eder. Bu sınıf, dış şema dosyalarından gelen basit ve karmaşık tipleri, grupları ve öznitelik gruplarını geçerli şemada yeniden tanımlamaya izin vermek için kullanılabilir. Ayrıca bu sınıf, C++'ta şema öğeleri için sürümleme sağlamada da kullanılabilir."
type: docs
weight: 5600
url: /tr/cpp/system.xml.schema/xmlschemaredefine/
---
## XmlSchemaRedefine class


XML [Schema](../) içindeki **redefine** öğesini, Dünya Çapında [Web](../../system.web/) Konsorsiyumu (W3C) tarafından belirlenen şekilde temsil eder. Bu sınıf, dış şema dosyalarından gelen basit ve karmaşık tipleri, grupları ve öznitelik gruplarını geçerli şemada yeniden tanımlamaya izin vermek için kullanılabilir. Ayrıca bu sınıf, şema öğeleri için sürümleme sağlamada da kullanılabilir.

```cpp
class XmlSchemaRedefine : public System::Xml::Schema::XmlSchemaExternal
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_AttributeGroups](./get_attributegroups/)() | Şemadaki tüm öznitelikler için, **AttributeGroups** değerinin derleme sonrası yorumunu tutan [XmlSchemaObjectTable](../xmlschemaobjecttable/) nesnesini döndürür. |
| [get_Groups](./get_groups/)() | Şemadaki tüm gruplar için, **Groups** değerinin derleme sonrası yorumunu tutan [XmlSchemaObjectTable](../xmlschemaobjecttable/) nesnesini döndürür. |
| [get_Items](./get_items/)() | Aşağıdaki sınıfların koleksiyonunu döndürür: [XmlSchemaAnnotation](../xmlschemaannotation/), [XmlSchemaAttributeGroup](../xmlschemaattributegroup/), [XmlSchemaComplexType](../xmlschemacomplextype/), [XmlSchemaSimpleType](../xmlschemasimpletype/), ve [XmlSchemaGroup](../xmlschemagroup/). |
| [get_SchemaTypes](./get_schematypes/)() | Şemadaki tüm basit ve karmaşık tipler için, **SchemaTypes** değerinin derleme sonrası yorumunu tutan [XmlSchemaObjectTable](../xmlschemaobjecttable/) nesnesini döndürür. |
| [XmlSchemaRedefine](./xmlschemaredefine/)() | [XmlSchemaRedefine](./) sınıfının yeni bir örneğini başlatır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma ad. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türden örnekleri yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) göstericisine sarın ve bu göstericiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [XmlSchemaExternal](../xmlschemaexternal/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
