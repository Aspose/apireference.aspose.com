---
title: "System::Xml::Schema::XmlSchemaSimpleType sınıfı"
linktitle: "XmlSchemaSimpleType"
second_title: "Aspose.Font için C++"
description: "System::Xml::Schema::XmlSchemaSimpleType sınıfı. XML Şeması'ndan (World Wide Web Consortium (W3C) tarafından belirlenen) basit içerik için simpleType öğesini temsil eder. Bu sınıf basit bir tür tanımlar. Basit türler, C++'ta yalnızca metin içeren özniteliklerin veya öğelerin değerleri için bilgi ve kısıtlamalar belirtebilir."
type: docs
weight: 6200
url: /tr/cpp/system.xml.schema/xmlschemasimpletype/
---
## XmlSchemaSimpleType class


XML [Schema](../) üzerinden basit içerik için **simpleType** öğesini temsil eder; World Wide [Web](../../system.web/) Consortium (W3C) tarafından belirlenmiştir. Bu sınıf basit bir tür tanımlar. Basit türler, yalnızca metin içeren özniteliklerin veya öğelerin değerleri için bilgi ve kısıtlamalar belirtebilir.

```cpp
class XmlSchemaSimpleType : public System::Xml::Schema::XmlSchemaType
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Content](./get_content/)() | Aşağıdakilerden birini döndürür: [XmlSchemaSimpleTypeUnion](../xmlschemasimpletypeunion/), [XmlSchemaSimpleTypeList](../xmlschemasimpletypelist/), veya [XmlSchemaSimpleTypeRestriction](../xmlschemasimpletyperestriction/). |
| [set_Content](./set_content/)(const SharedPtr\<XmlSchemaSimpleTypeContent\>\&) | Aşağıdakilerden birini ayarlar: [XmlSchemaSimpleTypeUnion](../xmlschemasimpletypeunion/), [XmlSchemaSimpleTypeList](../xmlschemasimpletypelist/), veya [XmlSchemaSimpleTypeRestriction](../xmlschemasimpletyperestriction/). |
| [XmlSchemaSimpleType](./xmlschemasimpletype/)() | Yeni bir [XmlSchemaSimpleType](./) sınıfının örneğini başlatır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma ad. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türden örnekleri yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) göstericisine sarın ve bu göstericiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [XmlSchemaType](../xmlschematype/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
