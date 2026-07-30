---
title: "Classe System::Xml::XmlDocumentType"
linktitle: "XmlDocumentType"
second_title: "Aspose.Font pour C++"
description: "Classe System::Xml::XmlDocumentType. Représente la déclaration de type de document en C++."
type: docs
weight: 1600
url: /fr/cpp/system.xml/xmldocumenttype/
---
## XmlDocumentType class


Représente la déclaration de type de document.

```cpp
class XmlDocumentType : public System::Xml::XmlLinkedNode
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Crée un duplicata de ce nœud. |
| [get_Entities](./get_entities/)() | Renvoie la collection des nœuds [XmlEntity](../xmlentity/) déclarés dans la déclaration du type de document. |
| [get_InternalSubset](./get_internalsubset/)() | Renvoie la valeur du sous-ensemble interne de la définition du type de document (DTD) dans la déclaration DOCTYPE. |
| [get_IsReadOnly](./get_isreadonly/)() override | Renvoie une valeur indiquant si le nœud est en lecture seule. |
| [get_LocalName](./get_localname/)() override | Renvoie le nom local du nœud. |
| [get_Name](./get_name/)() override | Renvoie le nom qualifié du nœud. |
| [get_NodeType](./get_nodetype/)() override | Renvoie le type du nœud actuel. |
| [get_Notations](./get_notations/)() | Renvoie la collection des nœuds [XmlNotation](../xmlnotation/) présents dans la déclaration du type de document. |
| [get_PublicId](./get_publicid/)() | Renvoie la valeur de l'identifiant public dans la déclaration DOCTYPE. |
| [get_SystemId](./get_systemid/)() | Renvoie la valeur de l'identifiant système dans la déclaration DOCTYPE. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Enregistre tous les enfants du nœud dans le [XmlWriter](../xmlwriter/) spécifié. Pour les nœuds [XmlDocumentType](./), cette méthode n'a aucun effet. |
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
