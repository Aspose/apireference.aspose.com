---
title: "classe System::Xml::XmlNodeChangedEventArgs"
linktitle: "XmlNodeChangedEventArgs"
second_title: "Aspose.Font pour C++"
description: "Classe System::Xml::XmlNodeChangedEventArgs. Fournit des données pour les événements XmlDocument::NodeChanged, XmlDocument::NodeChanging, XmlDocument::NodeInserted, XmlDocument::NodeInserting, XmlDocument::NodeRemoved et XmlDocument::NodeRemoving en C++."
type: docs
weight: 2600
url: /fr/cpp/system.xml/xmlnodechangedeventargs/
---
## XmlNodeChangedEventArgs class


Fournit des données pour les événements **XmlDocument::NodeChanged**, **XmlDocument::NodeChanging**, **XmlDocument::NodeInserted**, **XmlDocument::NodeInserting**, **XmlDocument::NodeRemoved** et **XmlDocument::NodeRemoving**.

```cpp
class XmlNodeChangedEventArgs : public System::EventArgs
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_Action](./get_action/)() | Renvoie une valeur indiquant le type d'événement de modification de nœud qui se produit. |
| [get_NewParent](./get_newparent/)() | Renvoie la valeur de [XmlNode::get_ParentNode](../xmlnode/get_parentnode/) après la fin de l'opération. |
| [get_NewValue](./get_newvalue/)() | Renvoie la nouvelle valeur du nœud. |
| [get_Node](./get_node/)() | Renvoie le [XmlNode](../xmlnode/) qui est ajouté, supprimé ou modifié. |
| [get_OldParent](./get_oldparent/)() | Renvoie la valeur de [XmlNode::get_ParentNode](../xmlnode/get_parentnode/) avant le début de l'opération. |
| [get_OldValue](./get_oldvalue/)() | Renvoie la valeur originale du nœud. |
| [XmlNodeChangedEventArgs](./xmlnodechangedeventargs/)(const SharedPtr\<XmlNode\>\&, const SharedPtr\<XmlNode\>\&, const SharedPtr\<XmlNode\>\&, const String\&, const String\&, XmlNodeChangedAction) | Initialise une nouvelle instance de la classe [XmlNodeChangedEventArgs](./). |
## Champs

| Champ | Description |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Un membre statique qui représente un pointeur partagé "vide" [EventArgs](../../system/eventargs/) (pointeur nul). |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Remarques



Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instances de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

## Voir aussi

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
