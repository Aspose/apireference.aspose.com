---
title: "Classe System::Xml::XmlDocumentFragment"
linktitle: "XmlDocumentFragment"
second_title: "Aspose.Font pour C++"
description: "Classe System::Xml::XmlDocumentFragment. Représente un objet léger utile pour les opérations d'insertion d'arbre en C++."
type: docs
weight: 1500
url: /fr/cpp/system.xml/xmldocumentfragment/
---
## XmlDocumentFragment class


Représente un objet léger utile pour les opérations d'insertion d'arbre.

```cpp
class XmlDocumentFragment : public System::Xml::XmlNode
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Crée un duplicata de ce nœud. |
| [get_InnerXml](./get_innerxml/)() override | Renvoie le balisage représentant les enfants de ce nœud. |
| [get_LocalName](./get_localname/)() override | Renvoie le nom local du nœud. |
| [get_Name](./get_name/)() override | Renvoie le nom qualifié du nœud. |
| [get_NodeType](./get_nodetype/)() override | Renvoie le type du nœud actuel. |
| [get_OwnerDocument](./get_ownerdocument/)() override | Renvoie le [XmlDocument](../xmldocument/) auquel appartient ce nœud. |
| [set_InnerXml](./set_innerxml/)(String) override | Définit le balisage représentant les enfants de ce nœud. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Enregistre tous les enfants du nœud dans le [XmlWriter](../xmlwriter/) spécifié. |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | Enregistre le nœud dans le [XmlWriter](../xmlwriter/) spécifié. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Remarques



Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instances de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

## Voir aussi

* Class [XmlNode](../xmlnode/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
