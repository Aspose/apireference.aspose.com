---
title: "System::Xml::Schema::XmlSchemaType Klasse"
linktitle: "XmlSchemaType"
second_title: "Aspose.Page für C++"
description: "System::Xml::Schema::XmlSchemaType Klasse. Die Basisklasse für alle einfachen Typen und komplexen Typen in C++."
type: docs
weight: 6800
url: /de/cpp/system.xml.schema/xmlschematype/
---
## XmlSchemaType class


Die Basisklasse für alle einfachen und komplexen Typen.

```cpp
class XmlSchemaType : public System::Xml::Schema::XmlSchemaAnnotated
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_BaseSchemaType](./get_baseschematype/)() | Gibt den Objekt-Typ nach der Kompilierung oder den eingebauten XML-[Schema](../)-Definitionssprache (XSD)-Datentyp, simpleType-Element oder complexType-Element zurück. Dies ist ein Wert des Infosets nach der Schema-Kompilierung. |
| [get_BaseXmlSchemaType](./get_basexmlschematype/)() | Gibt den Wert nach der Kompilierung für den Basistyp dieses Schematyps zurück. |
| [get_Datatype](./get_datatype/)() | Gibt den Wert nach der Kompilierung für den Datentyp des komplexen Typs zurück. |
| [get_DerivedBy](./get_derivedby/)() | Gibt die Informationen nach der Kompilierung darüber zurück, wie dieses Element von seinem Basistyp abgeleitet wurde. |
| [get_Final](./get_final/)() | Gibt das Final-Attribut der Typableitung zurück, das anzeigt, ob weitere Ableitungen erlaubt sind. |
| [get_FinalResolved](./get_finalresolved/)() | Gibt die Interpretation nach der Kompilierung des Werts von [XmlSchemaType::get_Final](./get_final/) zurück. |
| virtual [get_IsMixed](./get_ismixed/)() | Gibt einen Wert zurück, der anzeigt, ob dieser Typ ein gemischtes Inhaltsmodell hat. Dieser Aufruf ist nur in einem komplexen Typ gültig. |
| [get_Name](./get_name/)() | Gibt den Namen des Typs zurück. |
| [get_QualifiedName](./get_qualifiedname/)() | Gibt den qualifizierten Namen für den Typ zurück, der aus dem **Name**‑Attribut dieses Typs erstellt wurde. Dies ist ein Wert nach der Schema‑Kompilierung. |
| [get_TypeCode](./get_typecode/)() | Gibt den [XmlTypeCode](../xmltypecode/) des Typs zurück. |
| static [GetBuiltInComplexType](./getbuiltincomplextype/)(XmlTypeCode) | Gibt einen [XmlSchemaComplexType](../xmlschemacomplextype/) zurück, der den integrierten komplexen Typ des angegebenen komplexen Typs darstellt. |
| static [GetBuiltInComplexType](./getbuiltincomplextype/)(const SharedPtr\<XmlQualifiedName\>\&) | Gibt einen [XmlSchemaComplexType](../xmlschemacomplextype/) zurück, der den integrierten komplexen Typ des durch qualifizierten Namen angegebenen komplexen Typs darstellt. |
| static [GetBuiltInSimpleType](./getbuiltinsimpletype/)(const SharedPtr\<XmlQualifiedName\>\&) | Gibt einen [XmlSchemaSimpleType](../xmlschemasimpletype/) zurück, der den integrierten einfachen Typ des einfachen Typs darstellt, der durch den qualifizierten Namen angegeben ist. |
| static [GetBuiltInSimpleType](./getbuiltinsimpletype/)(XmlTypeCode) | Gibt einen [XmlSchemaSimpleType](../xmlschemasimpletype/) zurück, der den integrierten einfachen Typ des angegebenen einfachen Typs darstellt. |
| static [IsDerivedFrom](./isderivedfrom/)(SharedPtr\<XmlSchemaType\>, const SharedPtr\<XmlSchemaType\>\&, XmlSchemaDerivationMethod) | Gibt einen Wert zurück, der angibt, ob der angegebene abgeleitete Schematyp vom angegebenen Basisschematyp abgeleitet ist. |
| [set_Final](./set_final/)(XmlSchemaDerivationMethod) | Setzt das final‑Attribut der Typableitung, das angibt, ob weitere Ableitungen erlaubt sind. |
| virtual [set_IsMixed](./set_ismixed/)(bool) | Setzt einen Wert, der angibt, ob dieser Typ ein gemischtes Inhaltsmodell hat. Dieser Aufruf ist nur in einem komplexen Typ gültig. |
| [set_Name](./set_name/)(const String\&) | Setzt den Namen des Typs. |
| [XmlSchemaType](./xmlschematype/)() | Initialisiert eine neue Instanz der Klasse [XmlSchemaType](./). |
## Typedefs

| Typedef | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared-Pointer auf eine Instanz dieser Klasse. |
## Hinweise



Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals Instanzen dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Pointer und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen zu übergeben.

## Siehe auch

* Class [XmlSchemaAnnotated](../xmlschemaannotated/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
