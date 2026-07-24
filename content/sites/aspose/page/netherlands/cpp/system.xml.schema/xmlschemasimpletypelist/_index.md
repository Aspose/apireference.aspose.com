---
title: "System::Xml::Schema::XmlSchemaSimpleTypeList klasse"
linktitle: "XmlSchemaSimpleTypeList"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Schema::XmlSchemaSimpleTypeList klasse. Vertegenwoordigt het lijst‑element van XML Schema zoals gespecificeerd door het World Wide Web Consortium (W3C). Deze klasse kan worden gebruikt om een simpleType‑element te definiëren als een lijst van waarden van een opgegeven gegevenstype in C++."
type: docs
weight: 6400
url: /nl/cpp/system.xml.schema/xmlschemasimpletypelist/
---
## XmlSchemaSimpleTypeList class


Vertegenwoordigt het **list**‑element van XML [Schema](../) zoals gespecificeerd door het World Wide [Web](../../system.web/) Consortium (W3C). Deze klasse kan worden gebruikt om een **simpleType**‑element te definiëren als een lijst van waarden van een opgegeven gegevenstype.

```cpp
class XmlSchemaSimpleTypeList : public System::Xml::Schema::XmlSchemaSimpleTypeContent
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_BaseItemType](./get_baseitemtype/)() | Retourneert de [XmlSchemaSimpleType](../xmlschemasimpletype/) die het type van het **simpleType**‑element weergeeft op basis van de waarden van [XmlSchemaSimpleTypeList::get_ItemType](./get_itemtype/) en [XmlSchemaSimpleTypeList::get_ItemTypeName](./get_itemtypename/) van het simple type. |
| [get_ItemType](./get_itemtype/)() | Retourneert het **simpleType**‑element dat is afgeleid van het type dat door de basiswaarde is gespecificeerd. |
| [get_ItemTypeName](./get_itemtypename/)() | Retourneert de naam van een ingebouwd gegevenstype of **simpleType**‑element dat in dit schema is gedefinieerd (of in een ander schema dat wordt aangeduid door de opgegeven namespace). |
| [set_BaseItemType](./set_baseitemtype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | Stelt de [XmlSchemaSimpleType](../xmlschemasimpletype/) in die het type van het **simpleType**‑element weergeeft op basis van de waarden van [XmlSchemaSimpleTypeList::get_ItemType](./get_itemtype/) en [XmlSchemaSimpleTypeList::get_ItemTypeName](./get_itemtypename/) van het simple type. |
| [set_ItemType](./set_itemtype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | Stelt het **simpleType**‑element in dat is afgeleid van het type dat door de basiswaarde is gespecificeerd. |
| [set_ItemTypeName](./set_itemtypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Stelt de naam in van een ingebouwd gegevenstype of **simpleType**‑element dat in dit schema is gedefinieerd (of in een ander schema dat wordt aangeduid door de opgegeven namespace). |
| [XmlSchemaSimpleTypeList](./xmlschemasimpletypelist/)() | Initialiseert een nieuw exemplaar van de [XmlSchemaSimpleTypeList](./) klasse. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Opmerkingen



Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit exemplaren van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

## Zie ook

* Class [XmlSchemaSimpleTypeContent](../xmlschemasimpletypecontent/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
