---
title: "System::Xml::Schema::XmlSchemaDatatype Klasse"
linktitle: "XmlSchemaDatatype"
second_title: "Aspose.Font für C++"
description: "System::Xml::Schema::XmlSchemaDatatype Klasse. Die XmlSchemaDatatype Klasse ist eine abstrakte Klasse zum Zuordnen von XML Schema-Definitionssprache (XSD)-Typen zu Laufzeittypen in C++."
type: docs
weight: 2400
url: /de/cpp/system.xml.schema/xmlschemadatatype/
---
## XmlSchemaDatatype class


Die [XmlSchemaDatatype](./) Klasse ist eine abstrakte Klasse zum Zuordnen von XML [Schema](../) Definitionssprache (XSD)-Typen zu Laufzeittypen.

```cpp
class XmlSchemaDatatype : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [ChangeType](./changetype/)(SharedPtr\<Object\>, const TypeInfo\&) | Konvertiert den angegebenen Wert, dessen Typ eine der gültigen Darstellungen des XML‑Schematyps ist, der durch das [XmlSchemaDatatype](./) repräsentiert wird, in den angegebenen Laufzeittyp. |
| virtual [ChangeType](./changetype/)(SharedPtr\<Object\>, const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) | Konvertiert den angegebenen Wert, dessen Typ eine der gültigen Darstellungen des XML‑Schematyps ist, der durch das [XmlSchemaDatatype](./) repräsentiert wird, in den angegebenen Laufzeittyp unter Verwendung des [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/), falls das [XmlSchemaDatatype](./) den **xs:QName**‑Typ oder einen davon abgeleiteten Typ darstellt. |
| virtual [get_TokenizedType](./get_tokenizedtype/)() | Wird in einer abgeleiteten Klasse überschrieben, gibt den Typ für **string** zurück, wie in der World Wide [Web](../../system.web/) Consortium (W3C) XML‑1.0‑Spezifikation angegeben. |
| virtual [get_TypeCode](./get_typecode/)() | Gibt den [XmlTypeCode](../xmltypecode/) Wert für den einfachen Typ zurück. |
| virtual [get_ValueType](./get_valuetype/)() | Wird in einer abgeleiteten Klasse überschrieben, gibt den Typ des Elements zurück. |
| virtual [get_Variety](./get_variety/)() | Gibt den [XmlSchemaDatatypeVariety](../xmlschemadatatypevariety/) Wert für den einfachen Typ zurück. |
| virtual [IsDerivedFrom](./isderivedfrom/)(SharedPtr\<XmlSchemaDatatype\>) | Diese Methode gibt immer **false** zurück. |
| virtual [ParseValue](./parsevalue/)(String, SharedPtr\<XmlNameTable\>, SharedPtr\<IXmlNamespaceResolver\>) | Wird in einer abgeleiteten Klasse überschrieben, validiert den angegebenen **string** gegenüber einem integrierten oder benutzerdefinierten einfachen Typ. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared‑Pointer auf eine Instanz dieser Klasse. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
