---
title: "System::Xml::Schema::XmlSchemaDatatype sınıfı"
linktitle: "XmlSchemaDatatype"
second_title: "Aspose.Page için C++"
description: "System::Xml::Schema::XmlSchemaDatatype sınıfı. XmlSchemaDatatype sınıfı, XML Schema tanım dili (XSD) tiplerini C++'da çalışma zamanı tiplerine eşlemek için kullanılan soyut bir sınıftır."
type: docs
weight: 2400
url: /tr/cpp/system.xml.schema/xmlschemadatatype/
---
## XmlSchemaDatatype class


[XmlSchemaDatatype](./) sınıfı, XML [Schema](../) tanım dili (XSD) tiplerini çalışma zamanı tiplerine eşlemek için kullanılan soyut bir sınıftır.

```cpp
class XmlSchemaDatatype : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [ChangeType](./changetype/)(SharedPtr\<Object\>, const TypeInfo\&) | Belirtilen değeri, türü [XmlSchemaDatatype](./) tarafından temsil edilen XML şema tipinin geçerli temsillerinden biri olan, belirtilen çalışma zamanı tipine dönüştürür. |
| virtual [ChangeType](./changetype/)(SharedPtr\<Object\>, const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) | Belirtilen değeri, türü [XmlSchemaDatatype](./) tarafından temsil edilen XML şema tipinin geçerli temsillerinden biri olan, [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) kullanılarak belirtilen çalışma zamanı tipine dönüştürür; eğer [XmlSchemaDatatype](./) **xs:QName** tipini veya ondan türetilmiş bir tipi temsil ediyorsa. |
| virtual [get_TokenizedType](./get_tokenizedtype/)() | Türetilmiş bir sınıfta geçersiz kılındığında, Dünya Çapında [Web](../../system.web/) Konsorsiyumu (W3C) XML 1.0 spesifikasyonunda belirtildiği gibi **string** tipini alır. |
| virtual [get_TypeCode](./get_typecode/)() | Basit tip için [XmlTypeCode](../xmltypecode/) değerini döndürür. |
| virtual [get_ValueType](./get_valuetype/)() | Türetilmiş bir sınıfta geçersiz kılındığında, öğenin tipini alır. |
| virtual [get_Variety](./get_variety/)() | Basit tip için [XmlSchemaDatatypeVariety](../xmlschemadatatypevariety/) değerini döndürür. |
| virtual [IsDerivedFrom](./isderivedfrom/)(SharedPtr\<XmlSchemaDatatype\>) | Bu yöntem her zaman **false** döndürür. |
| virtual [ParseValue](./parsevalue/)(String, SharedPtr\<XmlNameTable\>, SharedPtr\<IXmlNamespaceResolver\>) | Türetilmiş bir sınıfta geçersiz kılındığında, belirtilen **string** değerini yerleşik veya kullanıcı tanımlı bir basit tip ile doğrular. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma addır. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
