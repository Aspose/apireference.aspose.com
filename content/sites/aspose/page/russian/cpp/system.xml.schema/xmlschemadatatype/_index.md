---
title: "System::Xml::Schema::XmlSchemaDatatype класс"
linktitle: "XmlSchemaDatatype"
second_title: "Aspose.Page для C++"
description: "System::Xml::Schema::XmlSchemaDatatype класс. Класс XmlSchemaDatatype является абстрактным классом для отображения типов языка определения XML Schema (XSD) в типы времени выполнения в C++."
type: docs
weight: 2400
url: /ru/cpp/system.xml.schema/xmlschemadatatype/
---
## XmlSchemaDatatype class


Класс [XmlSchemaDatatype](./) является абстрактным классом для отображения типов XML [Schema](../) definition language (XSD) в типы времени выполнения.

```cpp
class XmlSchemaDatatype : public System::Object
```

## Методы

| Метод | Описание |
| --- | --- |
| virtual [ChangeType](./changetype/)(SharedPtr\<Object\>, const TypeInfo\&) | Преобразует указанное значение, тип которого является одной из допустимых репрезентаций типа схемы XML, представленного [XmlSchemaDatatype](./), в указанный тип времени выполнения. |
| virtual [ChangeType](./changetype/)(SharedPtr\<Object\>, const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) | Преобразует указанное значение, тип которого является одной из допустимых репрезентаций типа схемы XML, представленного [XmlSchemaDatatype](./), в указанный тип времени выполнения с использованием [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/), если [XmlSchemaDatatype](./) представляет тип **xs:QName** или тип, производный от него. |
| virtual [get_TokenizedType](./get_tokenizedtype/)() | При переопределении в производном классе возвращает тип для **string**, как указано в спецификации World Wide [Web](../../system.web/) Consortium (W3C) XML 1.0. |
| virtual [get_TypeCode](./get_typecode/)() | Возвращает значение [XmlTypeCode](../xmltypecode/) для простого типа. |
| virtual [get_ValueType](./get_valuetype/)() | При переопределении в производном классе возвращает тип элемента. |
| virtual [get_Variety](./get_variety/)() | Возвращает значение [XmlSchemaDatatypeVariety](../xmlschemadatatypevariety/) для простого типа. |
| virtual [IsDerivedFrom](./isderivedfrom/)(SharedPtr\<XmlSchemaDatatype\>) | Этот метод всегда возвращает **false**. |
| virtual [ParseValue](./parsevalue/)(String, SharedPtr\<XmlNameTable\>, SharedPtr\<IXmlNamespaceResolver\>) | При переопределении в производном классе проверяет указанную **string** на соответствие встроенному или пользовательскому простому типу. |
## Typedefs

| Определение типа. | Описание |
| --- | --- |
| [Ptr](./ptr/) | Псевдоним для shared pointer к экземпляру этого класса. |
## См. также

* Class [Object](../../system/object/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
