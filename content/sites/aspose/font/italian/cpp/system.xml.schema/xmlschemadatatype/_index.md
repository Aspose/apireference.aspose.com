---
title: "classe System::Xml::Schema::XmlSchemaDatatype"
linktitle: "XmlSchemaDatatype"
second_title: "Aspose.Font per C++"
description: "classe System::Xml::Schema::XmlSchemaDatatype. La classe XmlSchemaDatatype è una classe astratta per mappare i tipi del linguaggio di definizione XML Schema (XSD) ai tipi di runtime in C++."
type: docs
weight: 2400
url: /it/cpp/system.xml.schema/xmlschemadatatype/
---
## XmlSchemaDatatype class


La classe [XmlSchemaDatatype](./) è una classe astratta per mappare i tipi del linguaggio di definizione XML [Schema](../) (XSD) ai tipi di runtime.

```cpp
class XmlSchemaDatatype : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [ChangeType](./changetype/)(SharedPtr\<Object\>, const TypeInfo\&) | Converte il valore specificato, il cui tipo è una delle rappresentazioni valide del tipo di schema XML rappresentato da [XmlSchemaDatatype](./), al tipo di runtime specificato. |
| virtual [ChangeType](./changetype/)(SharedPtr\<Object\>, const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) | Converte il valore specificato, il cui tipo è una delle rappresentazioni valide del tipo di schema XML rappresentato da [XmlSchemaDatatype](./), al tipo di runtime specificato utilizzando [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) se [XmlSchemaDatatype](./) rappresenta il tipo **xs:QName** o un tipo derivato da esso. |
| virtual [get_TokenizedType](./get_tokenizedtype/)() | Quando sovrascritto in una classe derivata, ottiene il tipo per la **string** come specificato nel Consorzio World Wide [Web](../../system.web/) (W3C) della specifica XML 1.0. |
| virtual [get_TypeCode](./get_typecode/)() | Restituisce il valore [XmlTypeCode](../xmltypecode/) per il tipo semplice. |
| virtual [get_ValueType](./get_valuetype/)() | Quando sovrascritto in una classe derivata, ottiene il tipo dell'elemento. |
| virtual [get_Variety](./get_variety/)() | Restituisce il valore [XmlSchemaDatatypeVariety](../xmlschemadatatypevariety/) per il tipo semplice. |
| virtual [IsDerivedFrom](./isderivedfrom/)(SharedPtr\<XmlSchemaDatatype\>) | Questo metodo restituisce sempre **false**. |
| virtual [ParseValue](./parsevalue/)(String, SharedPtr\<XmlNameTable\>, SharedPtr\<IXmlNamespaceResolver\>) | Quando sovrascritto in una classe derivata, valida la **string** specificata rispetto a un tipo semplice incorporato o definito dall'utente. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
