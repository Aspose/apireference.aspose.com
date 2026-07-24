---
title: "System::Xml::Schema::XmlSchemaRedefine sınıfı"
linktitle: "XmlSchemaRedefine"
second_title: "Aspose.Page için C++"
description: "System::Xml::Schema::XmlSchemaRedefine sınıfı. Dünya Çapında Ağ Konsorsiyumu (W3C) tarafından belirlenen XML Şeması'ndaki yeniden tanımlama (redefine) öğesini temsil eder. Bu sınıf, dış şema dosyalarından gelen basit ve karmaşık tipleri, grupları ve öznitelik gruplarını geçerli şemada yeniden tanımlamaya izin vermek için kullanılabilir. Ayrıca bu sınıf, C++'ta şema öğeleri için sürümleme sağlamada da kullanılabilir."
type: docs
weight: 5600
url: /tr/cpp/system.xml.schema/xmlschemaredefine/
---
## XmlSchemaRedefine class


XML [Schema](../) içinde **redefine** öğesini, Dünya Çapında [Web](../../system.web/) Konsorsiyumu (W3C) tarafından belirtildiği gibi temsil eder. Bu sınıf, harici şema dosyalarından basit ve karmaşık tipleri, grupları ve öznitelik gruplarını geçerli şemada yeniden tanımlamaya izin vermek için kullanılabilir. Bu sınıf ayrıca şema öğeleri için sürümleme sağlamada da kullanılabilir.

```cpp
class XmlSchemaRedefine : public System::Xml::Schema::XmlSchemaExternal
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_AttributeGroups](./get_attributegroups/)() | Şemadaki tüm öznitelikler için [XmlSchemaObjectTable](../xmlschemaobjecttable/) döndürür; bu tablo, **AttributeGroups** değerinin derleme sonrası yorumlamasını tutar. |
| [get_Groups](./get_groups/)() | Şemadaki tüm gruplar için [XmlSchemaObjectTable](../xmlschemaobjecttable/) döndürür; bu tablo, **Groups** değerinin derleme sonrası yorumlamasını tutar. |
| [get_Items](./get_items/)() | Aşağıdaki sınıfların koleksiyonunu döndürür: [XmlSchemaAnnotation](../xmlschemaannotation/), [XmlSchemaAttributeGroup](../xmlschemaattributegroup/), [XmlSchemaComplexType](../xmlschemacomplextype/), [XmlSchemaSimpleType](../xmlschemasimpletype/), ve [XmlSchemaGroup](../xmlschemagroup/). |
| [get_SchemaTypes](./get_schematypes/)() | Şemadaki tüm basit ve karmaşık tipler için [XmlSchemaObjectTable](../xmlschemaobjecttable/) döndürür; bu tablo, **SchemaTypes** değerinin derleme sonrası yorumlamasını tutar. |
| [XmlSchemaRedefine](./xmlschemaredefine/)() | [XmlSchemaRedefine](./) sınıfının yeni bir örneğini başlatır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma addır. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Yığını üzerinde veya new operatörüyle bu tipin örneklerini asla oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [XmlSchemaExternal](../xmlschemaexternal/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
