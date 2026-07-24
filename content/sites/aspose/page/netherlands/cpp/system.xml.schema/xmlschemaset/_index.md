---
title: "System::Xml::Schema::XmlSchemaSet class"
linktitle: "XmlSchemaSet"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Schema::XmlSchemaSet class. Bevat een cache van XML Schema definitietaal (XSD) schema's in C++."
type: docs
weight: 5800
url: /nl/cpp/system.xml.schema/xmlschemaset/
---
## XmlSchemaSet class


Bevat een cache van XML [Schema](../) definitietaal (XSD) schema's.

```cpp
class XmlSchemaSet : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Add](./add/)(String, const String\&) | Voegt het XML [Schema](../) definitietaal (XSD) schema toe op de opgegeven URL aan de [XmlSchemaSet](./). |
| [Add](./add/)(String, const SharedPtr\<XmlReader\>\&) | Voegt het XML [Schema](../) definitietaal (XSD) schema toe dat is opgenomen in de [XmlReader](../../system.xml/xmlreader/) aan de [XmlSchemaSet](./). |
| [Add](./add/)(const SharedPtr\<XmlSchemaSet\>\&) | Voegt alle XML [Schema](../) definitietaal (XSD) schema's in de opgegeven [XmlSchemaSet](./) toe aan de [XmlSchemaSet](./). |
| [Add](./add/)(const SharedPtr\<XmlSchema\>\&) | Voegt het opgegeven [XmlSchema](../xmlschema/) toe aan de [XmlSchemaSet](./). |
| [Compile](./compile/)() | Compileert de XML [Schema](../) definitietaal (XSD) schema's die zijn toegevoegd aan de [XmlSchemaSet](./) tot één logisch schema. |
| [Contains](./contains/)(String) | Geeft aan of een XML [Schema](../) definitietaal (XSD) schema met de opgegeven doel‑namespace‑URI aanwezig is in de [XmlSchemaSet](./). |
| [Contains](./contains/)(const SharedPtr\<XmlSchema\>\&) | Geeft aan of het opgegeven XML [Schema](../) definitietaal (XSD) [XmlSchema](../xmlschema/) object aanwezig is in de [XmlSchemaSet](./). |
| [CopyTo](./copyto/)(const ArrayPtr\<SharedPtr\<XmlSchema\>\>\&, int32_t) | Kopieert alle [XmlSchema](../xmlschema/) objecten van de [XmlSchemaSet](./) naar de opgegeven array, beginnend bij de opgegeven index. |
| [get_CompilationSettings](./get_compilationsettings/)() | Retourneert de [XmlSchemaCompilationSettings](../xmlschemacompilationsettings/) voor de [XmlSchemaSet](./). |
| [get_Count](./get_count/)() | Retourneert het aantal logische XML [Schema](../) definitietaal (XSD) schema's in de [XmlSchemaSet](./). |
| [get_GlobalAttributes](./get_globalattributes/)() | Retourneert alle globale attributen in alle XML [Schema](../) definitietaal (XSD) schema's in de [XmlSchemaSet](./). |
| [get_GlobalElements](./get_globalelements/)() | Retourneert alle globale elementen in alle XML [Schema](../) definitietaal (XSD) schema's in de [XmlSchemaSet](./). |
| [get_GlobalTypes](./get_globaltypes/)() | Retourneert alle globale eenvoudige en complexe typen in alle XML [Schema](../) definitietaal (XSD) schema's in de [XmlSchemaSet](./). |
| [get_IsCompiled](./get_iscompiled/)() | Retourneert een waarde die aangeeft of de XML [Schema](../) definitietaal (XSD) schema's in de [XmlSchemaSet](./) zijn gecompileerd. |
| [get_NameTable](./get_nametable/)() | Retourneert de standaard [XmlNameTable](../../system.xml/xmlnametable/) die wordt gebruikt door de [XmlSchemaSet](./) bij het laden van nieuwe XML [Schema](../) definitietaal (XSD) schema's. |
| [Remove](./remove/)(const SharedPtr\<XmlSchema\>\&) | Verwijdert het opgegeven XML [Schema](../) definitietaal (XSD) schema uit de [XmlSchemaSet](./). |
| [RemoveRecursive](./removerecursive/)(const SharedPtr\<XmlSchema\>\&) | Verwijdert het opgegeven XML [Schema](../) definitietaal (XSD) schema en alle schema's die het importeert uit de [XmlSchemaSet](./). |
| [Reprocess](./reprocess/)(SharedPtr\<XmlSchema\>) | Verwerkt een XML [Schema](../) definitietaal (XSD) schema dat al bestaat in de [XmlSchemaSet](./) opnieuw. |
| [Schemas](./schemas/)() | Retourneert een verzameling van alle XML [Schema](../) definitietaal (XSD) schema's in de [XmlSchemaSet](./). |
| [Schemas](./schemas/)(String) | Retourneert een verzameling van alle XML [Schema](../) definitietaal (XSD) schema's in de [XmlSchemaSet](./) die tot de opgegeven namespace behoren. |
| [set_CompilationSettings](./set_compilationsettings/)(const SharedPtr\<XmlSchemaCompilationSettings\>\&) | Stelt de [XmlSchemaCompilationSettings](../xmlschemacompilationsettings/) in voor de [XmlSchemaSet](./). |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | Stelt de [XmlResolver](../../system.xml/xmlresolver/) in die wordt gebruikt om namespaces of locaties op te lossen die worden verwezen in include- en importelementen van een schema. |
| [ValidationEventHandler_add](./validationeventhandler_add/)(Args...) | Voegt een gebeurtenishandler toe voor het ontvangen van informatie over XML [Schema](../) definitietaal (XSD) schema validatiefouten. |
| [ValidationEventHandler_remove](./validationeventhandler_remove/)(Args...) | Verwijdert een gebeurtenishandler voor het ontvangen van informatie over XML [Schema](../) definitietaal (XSD) schema validatiefouten. |
| [XmlSchemaSet](./xmlschemaset/)() | Initialiseert een nieuw exemplaar van de klasse [XmlSchemaSet](./). |
| [XmlSchemaSet](./xmlschemaset/)(const SharedPtr\<XmlNameTable\>\&) | Initialiseert een nieuw exemplaar van de klasse [XmlSchemaSet](./) met de opgegeven [XmlNameTable](../../system.xml/xmlnametable/). |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Opmerkingen



Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit exemplaren van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
