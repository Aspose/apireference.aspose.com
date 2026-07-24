---
title: "System::Xml::Schema::XmlSchemaObjectTable class"
linktitle: "XmlSchemaObjectTable"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Schema::XmlSchemaObjectTable class. Biedt de collecties voor de opgenomen elementen in de XmlSchema‑klasse (bijvoorbeeld Attributes, AttributeGroups, Elements, enzovoort) in C++."
type: docs
weight: 5300
url: /nl/cpp/system.xml.schema/xmlschemaobjecttable/
---
## XmlSchemaObjectTable class


Biedt de collecties voor de opgenomen elementen in de [XmlSchema](../xmlschema/) klasse (bijvoorbeeld Attributes, AttributeGroups, Elements, enzovoort).

```cpp
class XmlSchemaObjectTable : public System::Collections::Generic::IEnumerable<System::Collections::Generic::KeyValuePair<SharedPtr<System::Xml::XmlQualifiedName>, SharedPtr<System::Xml::Schema::XmlSchemaObject>>>
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Contains](./contains/)(const SharedPtr\<XmlQualifiedName\>\&) | Bepaalt of de opgegeven gekwalificeerde naam bestaat in de collectie. |
| [get_Count](./get_count/)() | Retourneert het aantal items dat zich bevindt in de [XmlSchemaObjectTable](./). |
| [get_Names](./get_names/)() | Retourneert een collectie van alle benoemde elementen in de [XmlSchemaObjectTable](./). |
| [get_Values](./get_values/)() | Retourneert een collectie van alle waarden voor alle elementen in de [XmlSchemaObjectTable](./). |
| [GetEnumerator](./getenumerator/)() override | Retourneert een enumerator die door de [XmlSchemaObjectTable](./) kan itereren. |
| [idx_get](./idx_get/)(const SharedPtr\<XmlQualifiedName\>\&) | Retourneert het element in de [XmlSchemaObjectTable](./) dat is gespecificeerd door de gekwalificeerde naam. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Opmerkingen



Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit exemplaren van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

## Zie ook

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
