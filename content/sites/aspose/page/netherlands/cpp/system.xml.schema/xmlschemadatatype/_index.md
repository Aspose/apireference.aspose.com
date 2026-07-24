---
title: "System::Xml::Schema::XmlSchemaDatatype klasse"
linktitle: "XmlSchemaDatatype"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Schema::XmlSchemaDatatype klasse. De XmlSchemaDatatype klasse is een abstracte klasse voor het in kaart brengen van XML Schema definitietaal (XSD) typen naar runtime‑typen in C++."
type: docs
weight: 2400
url: /nl/cpp/system.xml.schema/xmlschemadatatype/
---
## XmlSchemaDatatype class


De [XmlSchemaDatatype](./) klasse is een abstracte klasse voor het in kaart brengen van XML [Schema](../) definitietaal (XSD) typen naar runtime‑typen.

```cpp
class XmlSchemaDatatype : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [ChangeType](./changetype/)(SharedPtr\<Object\>, const TypeInfo\&) | Converteert de opgegeven waarde, waarvan het type een van de geldige representaties is van het XML-schematype dat wordt vertegenwoordigd door de [XmlSchemaDatatype](./), naar het opgegeven runtime‑type. |
| virtual [ChangeType](./changetype/)(SharedPtr\<Object\>, const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) | Converteert de opgegeven waarde, waarvan het type een van de geldige representaties is van het XML-schematype dat wordt vertegenwoordigd door de [XmlSchemaDatatype](./), naar het opgegeven runtime‑type met behulp van de [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) als de [XmlSchemaDatatype](./) het **xs:QName**‑type of een daarvan afgeleid type vertegenwoordigt. |
| virtual [get_TokenizedType](./get_tokenizedtype/)() | Wanneer overschreven in een afgeleide klasse, haalt het het type op voor de **string** zoals gespecificeerd in de World Wide [Web](../../system.web/) Consortium (W3C) XML 1.0 specificatie. |
| virtual [get_TypeCode](./get_typecode/)() | Retourneert de [XmlTypeCode](../xmltypecode/) waarde voor het eenvoudige type. |
| virtual [get_ValueType](./get_valuetype/)() | Wanneer overschreven in een afgeleide klasse, haalt het het type van het item op. |
| virtual [get_Variety](./get_variety/)() | Retourneert de [XmlSchemaDatatypeVariety](../xmlschemadatatypevariety/) waarde voor het eenvoudige type. |
| virtual [IsDerivedFrom](./isderivedfrom/)(SharedPtr\<XmlSchemaDatatype\>) | Deze methode retourneert altijd **false**. |
| virtual [ParseValue](./parsevalue/)(String, SharedPtr\<XmlNameTable\>, SharedPtr\<IXmlNamespaceResolver\>) | Wanneer overschreven in een afgeleide klasse, valideert het de opgegeven **string** tegen een ingebouwd of door de gebruiker gedefinieerd eenvoudig type. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
