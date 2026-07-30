---
title: "Classe System::Xml::XmlEntityReference"
linktitle: "XmlEntityReference"
second_title: "Aspose.Font pour C++"
description: "Classe System::Xml::XmlEntityReference. Représente un nœud de référence d'entité en C++."
type: docs
weight: 1900
url: /fr/cpp/system.xml/xmlentityreference/
---
## XmlEntityReference class


Représente un nœud de référence d'entité.

```cpp
class XmlEntityReference : public System::Xml::XmlLinkedNode
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Crée un duplicata de ce nœud. |
| [get_BaseURI](./get_baseuri/)() override | Renvoie l'identifiant uniforme de ressource (URI) de base du nœud actuel. |
| [get_IsReadOnly](./get_isreadonly/)() override | Renvoie une valeur indiquant si le nœud est en lecture seule. |
| [get_LocalName](./get_localname/)() override | Renvoie le nom local du nœud. |
| [get_Name](./get_name/)() override | Renvoie le nom du nœud. |
| [get_NodeType](./get_nodetype/)() override | Renvoie le type du nœud. |
| [get_Value](./get_value/)() override | Renvoie la valeur du nœud. |
| [set_Value](./set_value/)(String) override | Définit la valeur du nœud. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Enregistre tous les enfants du nœud dans le [XmlWriter](../xmlwriter/) spécifié. |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | Enregistre le nœud dans le [XmlWriter](../xmlwriter/) spécifié. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Remarques



Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instances de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

## Voir aussi

* Class [XmlLinkedNode](../xmllinkednode/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
