---
title: "classe System::Xml::XmlNodeChangedEventArgs"
linktitle: "XmlNodeChangedEventArgs"
second_title: "Aspose.Font per C++"
description: "Classe System::Xml::XmlNodeChangedEventArgs. Fornisce dati per gli eventi XmlDocument::NodeChanged, XmlDocument::NodeChanging, XmlDocument::NodeInserted, XmlDocument::NodeInserting, XmlDocument::NodeRemoved e XmlDocument::NodeRemoving in C++."
type: docs
weight: 2600
url: /it/cpp/system.xml/xmlnodechangedeventargs/
---
## XmlNodeChangedEventArgs class


Fornisce dati per gli eventi **XmlDocument::NodeChanged**, **XmlDocument::NodeChanging**, **XmlDocument::NodeInserted**, **XmlDocument::NodeInserting**, **XmlDocument::NodeRemoved** e **XmlDocument::NodeRemoving**.

```cpp
class XmlNodeChangedEventArgs : public System::EventArgs
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_Action](./get_action/)() | Restituisce un valore che indica quale tipo di evento di modifica del nodo si sta verificando. |
| [get_NewParent](./get_newparent/)() | Restituisce il valore di [XmlNode::get_ParentNode](../xmlnode/get_parentnode/) dopo il completamento dell'operazione. |
| [get_NewValue](./get_newvalue/)() | Restituisce il nuovo valore del nodo. |
| [get_Node](./get_node/)() | Restituisce il [XmlNode](../xmlnode/) che viene aggiunto, rimosso o modificato. |
| [get_OldParent](./get_oldparent/)() | Restituisce il valore di [XmlNode::get_ParentNode](../xmlnode/get_parentnode/) prima dell'inizio dell'operazione. |
| [get_OldValue](./get_oldvalue/)() | Restituisce il valore originale del nodo. |
| [XmlNodeChangedEventArgs](./xmlnodechangedeventargs/)(const SharedPtr\<XmlNode\>\&, const SharedPtr\<XmlNode\>\&, const SharedPtr\<XmlNode\>\&, const String\&, const String\&, XmlNodeChangedAction) | Inizializza una nuova istanza della classe [XmlNodeChangedEventArgs](./). |
## Campi

| Campo | Descrizione |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Un membro statico che rappresenta un puntatore condiviso "empty" [EventArgs](../../system/eventargs/) (null-pointer). |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Osservazioni



Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
