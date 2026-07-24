---
title: "System::Xml::Schema::XmlSchemaFacet sınıfı"
linktitle: "XmlSchemaFacet"
second_title: "Aspose.Page için C++"
description: "System::Xml::Schema::XmlSchemaFacet sınıfı. C++'ta basit tipler kısıtlama ile türetilirken kullanılan tüm facet'ler için temel sınıf."
type: docs
weight: 2900
url: /tr/cpp/system.xml.schema/xmlschemafacet/
---
## XmlSchemaFacet class


Kısıtlama yoluyla türetilen basit tipler için kullanılan tüm facet'ler için bir temel sınıf.

```cpp
class XmlSchemaFacet : public System::Xml::Schema::XmlSchemaAnnotated
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [get_IsFixed](./get_isfixed/)() | Bu facet'in sabit olduğunu gösteren bilgiyi döndürür. |
| [get_Value](./get_value/)() | Facet'in **value** özniteliğini döndürür. |
| virtual [set_IsFixed](./set_isfixed/)(bool) | Bu facet'in sabit olduğunu gösteren bilgiyi ayarlar. |
| [set_Value](./set_value/)(const String\&) | Facet'in **value** özniteliğini ayarlar. |
| [XmlSchemaFacet](./xmlschemafacet/)() | Yeni bir [XmlSchemaFacet](./) sınıfı örneği başlatır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma addır. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Yığını üzerinde veya new operatörüyle bu tipin örneklerini asla oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [XmlSchemaAnnotated](../xmlschemaannotated/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
