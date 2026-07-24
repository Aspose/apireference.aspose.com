---
title: "System::Xml::XmlNodeChangedEventArgs class"
linktitle: "XmlNodeChangedEventArgs"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlNodeChangedEventArgs klasse. Biedt gegevens voor de XmlDocument::NodeChanged, XmlDocument::NodeChanging, XmlDocument::NodeInserted, XmlDocument::NodeInserting, XmlDocument::NodeRemoved en XmlDocument::NodeRemoving‑gebeurtenissen in C++."
type: docs
weight: 2600
url: /nl/cpp/system.xml/xmlnodechangedeventargs/
---
## XmlNodeChangedEventArgs class


Levert gegevens voor de **XmlDocument::NodeChanged**, **XmlDocument::NodeChanging**, **XmlDocument::NodeInserted**, **XmlDocument::NodeInserting**, **XmlDocument::NodeRemoved** en **XmlDocument::NodeRemoving**‑gebeurtenissen.

```cpp
class XmlNodeChangedEventArgs : public System::EventArgs
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_Action](./get_action/)() | Retourneert een waarde die aangeeft welk type knooppunt‑wijzigingsgebeurtenis zich voordoet. |
| [get_NewParent](./get_newparent/)() | Retourneert de waarde van de [XmlNode::get_ParentNode](../xmlnode/get_parentnode/) nadat de bewerking is voltooid. |
| [get_NewValue](./get_newvalue/)() | Retourneert de nieuwe waarde van het knooppunt. |
| [get_Node](./get_node/)() | Retourneert de [XmlNode](../xmlnode/) die wordt toegevoegd, verwijderd of gewijzigd. |
| [get_OldParent](./get_oldparent/)() | Retourneert de waarde van de [XmlNode::get_ParentNode](../xmlnode/get_parentnode/) voordat de bewerking begon. |
| [get_OldValue](./get_oldvalue/)() | Retourneert de oorspronkelijke waarde van het knooppunt. |
| [XmlNodeChangedEventArgs](./xmlnodechangedeventargs/)(const SharedPtr\<XmlNode\>\&, const SharedPtr\<XmlNode\>\&, const SharedPtr\<XmlNode\>\&, const String\&, const String\&, XmlNodeChangedAction) | Initialiseert een nieuw exemplaar van de [XmlNodeChangedEventArgs](./) klasse. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Een statisch lid dat een "lege" [EventArgs](../../system/eventargs/) gedeelde pointer (null-pointer) vertegenwoordigt. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Opmerkingen



Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit exemplaren van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

## Zie ook

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
