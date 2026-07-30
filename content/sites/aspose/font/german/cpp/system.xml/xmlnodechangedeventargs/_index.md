---
title: "System::Xml::XmlNodeChangedEventArgs Klasse"
linktitle: "XmlNodeChangedEventArgs"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlNodeChangedEventArgs Klasse. Stellt Daten für die XmlDocument::NodeChanged, XmlDocument::NodeChanging, XmlDocument::NodeInserted, XmlDocument::NodeInserting, XmlDocument::NodeRemoved und XmlDocument::NodeRemoving Ereignisse in C++ bereit."
type: docs
weight: 2600
url: /de/cpp/system.xml/xmlnodechangedeventargs/
---
## XmlNodeChangedEventArgs class


Stellt Daten für die Ereignisse **XmlDocument::NodeChanged**, **XmlDocument::NodeChanging**, **XmlDocument::NodeInserted**, **XmlDocument::NodeInserting**, **XmlDocument::NodeRemoved** und **XmlDocument::NodeRemoving** bereit.

```cpp
class XmlNodeChangedEventArgs : public System::EventArgs
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_Action](./get_action/)() | Gibt einen Wert zurück, der angibt, welcher Typ von Knotenänderungsereignis gerade auftritt. |
| [get_NewParent](./get_newparent/)() | Gibt den Wert von [XmlNode::get_ParentNode](../xmlnode/get_parentnode/) zurück, nachdem die Operation abgeschlossen ist. |
| [get_NewValue](./get_newvalue/)() | Gibt den neuen Wert des Knotens zurück. |
| [get_Node](./get_node/)() | Gibt das [XmlNode](../xmlnode/) zurück, das hinzugefügt, entfernt oder geändert wird. |
| [get_OldParent](./get_oldparent/)() | Gibt den Wert von [XmlNode::get_ParentNode](../xmlnode/get_parentnode/) zurück, bevor die Operation begann. |
| [get_OldValue](./get_oldvalue/)() | Gibt den ursprünglichen Wert des Knotens zurück. |
| [XmlNodeChangedEventArgs](./xmlnodechangedeventargs/)(const SharedPtr\<XmlNode\>\&, const SharedPtr\<XmlNode\>\&, const SharedPtr\<XmlNode\>\&, const String\&, const String\&, XmlNodeChangedAction) | Initialisiert eine neue Instanz der [XmlNodeChangedEventArgs](./) Klasse. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Ein statisches Mitglied, das einen "leeren" [EventArgs](../../system/eventargs/) Shared Pointer (Nullzeiger) darstellt. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared‑Pointer auf eine Instanz dieser Klasse. |
## Hinweise



Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals Instanzen dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)‑Pointer und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen zu übergeben.

## Siehe auch

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
