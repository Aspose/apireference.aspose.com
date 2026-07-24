---
title: "System::Xml::Schema::XmlSchemaCollection klasse"
linktitle: "XmlSchemaCollection"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Schema::XmlSchemaCollection klasse. Bevat een cache van XML Schema definitietaal (XSD) en XML-Data Reduced (XDR) schema's in C++."
type: docs
weight: 1500
url: /nl/cpp/system.xml.schema/xmlschemacollection/
---
## XmlSchemaCollection class


Bevat een cache van XML [Schema](../) definitietaal (XSD) en XML-Data Reduced (XDR) schema's.

```cpp
class XmlSchemaCollection : public System::Collections::Generic::IEnumerable<SharedPtr<System::Xml::Schema::XmlSchema>>
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Add](./add/)(const String\&, const String\&) | Voegt het schema dat zich op de opgegeven URL bevindt toe aan de schemacollectie. |
| [Add](./add/)(const String\&, const SharedPtr\<XmlReader\>\&) | Voegt het schema dat zich in de [XmlReader](../../system.xml/xmlreader/) bevindt toe aan de schemacollectie. |
| [Add](./add/)(const String\&, const SharedPtr\<XmlReader\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Voegt het schema dat zich in de [XmlReader](../../system.xml/xmlreader/) bevindt toe aan de schemacollectie. De opgegeven [XmlResolver](../../system.xml/xmlresolver/) wordt gebruikt om eventuele externe bronnen op te lossen. |
| [Add](./add/)(const SharedPtr\<XmlSchema\>\&) | Voegt de [XmlSchema](../xmlschema/) toe aan de collectie. |
| [Add](./add/)(const SharedPtr\<XmlSchema\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Voegt de [XmlSchema](../xmlschema/) toe aan de collectie. De opgegeven [XmlResolver](../../system.xml/xmlresolver/) wordt gebruikt om eventuele externe referenties op te lossen. |
| [Add](./add/)(const SharedPtr\<XmlSchemaCollection\>\&) | Voegt alle namespaces die in de opgegeven collectie zijn gedefinieerd (inclusief hun bijbehorende schema's) toe aan deze collectie. |
| [Contains](./contains/)(const SharedPtr\<XmlSchema\>\&) | Geeft een waarde terug die aangeeft of de **targetNamespace** van de opgegeven [XmlSchema](../xmlschema/) zich in de collectie bevindt. |
| [Contains](./contains/)(const String\&) | Geeft een waarde terug die aangeeft of een schema met de opgegeven namespace zich in de collectie bevindt. |
| [CopyTo](./copyto/)(const ArrayPtr\<SharedPtr\<XmlSchema\>\>\&, int32_t) | Kopieert alle [XmlSchema](../xmlschema/) objecten uit deze collectie naar de opgegeven array, beginnend bij de opgegeven index. |
| [get_Count](./get_count/)() | Geeft het aantal namespaces terug dat in deze collectie is gedefinieerd. |
| [get_NameTable](./get_nametable/)() | Geeft de standaard [XmlNameTable](../../system.xml/xmlnametable/) terug die door de [XmlSchemaCollection](./) wordt gebruikt bij het laden van nieuwe schema's. |
| [GetEnumerator](./getenumerator/)() override | Biedt ondersteuning voor iteratie over de collectie van schema's. |
| [idx_get](./idx_get/)(const String\&) | Geeft de [XmlSchema](../xmlschema/) terug die is gekoppeld aan de opgegeven namespace-URI. |
| [XmlSchemaCollection](./xmlschemacollection/)() | Initialiseert een nieuw exemplaar van de klasse [XmlSchemaCollection](./). |
| [XmlSchemaCollection](./xmlschemacollection/)(const SharedPtr\<XmlNameTable\>\&) | Initialiseert een nieuw exemplaar van de klasse [XmlSchemaCollection](./) met de opgegeven [XmlNameTable](../../system.xml/xmlnametable/). De [XmlNameTable](../../system.xml/xmlnametable/) wordt gebruikt bij het laden van schema's. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Opmerkingen


## Deprecated
De XmlSchemaCollection klasse is verouderd. Gebruik XmlSchemaSet in plaats daarvan.

Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit exemplaren van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

## Zie ook

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
