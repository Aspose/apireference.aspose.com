---
title: "Classe System::Xml::XmlEntity"
linktitle: "XmlEntity"
second_title: "Aspose.Font pour C++"
description: "Classe System::Xml::XmlEntity. Représente une déclaration d'entité, telle que <!ENTITY... > en C++."
type: docs
weight: 1800
url: /fr/cpp/system.xml/xmlentity/
---
## XmlEntity class


Représente une déclaration d'entité, telle que **<!ENTITY... >**.

```cpp
class XmlEntity : public System::Xml::XmlNode
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Crée un duplicata de ce nœud. Les nœuds d'entité ne peuvent pas être clonés. Appeler cette méthode sur un objet [XmlEntity](./) lève une exception. |
| [get_BaseURI](./get_baseuri/)() override | Renvoie l'identifiant uniforme de ressource (URI) de base du nœud actuel. |
| [get_InnerText](./get_innertext/)() override | Renvoie les valeurs concaténées du nœud d'entité et de tous ses enfants. |
| [get_InnerXml](./get_innerxml/)() override | Renvoie le balisage représentant les enfants de ce nœud. |
| [get_IsReadOnly](./get_isreadonly/)() override | Renvoie une valeur indiquant si le nœud est en lecture seule. |
| [get_LocalName](./get_localname/)() override | Renvoie le nom du nœud sans le préfixe d'espace de noms. |
| [get_Name](./get_name/)() override | Renvoie le nom du nœud. |
| [get_NodeType](./get_nodetype/)() override | Renvoie le type du nœud. |
| [get_NotationName](./get_notationname/)() | Renvoie le nom de l'attribut NDATA optionnel de la déclaration d'entité. |
| [get_OuterXml](./get_outerxml/)() override | Renvoie le balisage représentant ce nœud et tous ses enfants. |
| [get_PublicId](./get_publicid/)() | Renvoie la valeur de l'identifiant public de la déclaration d'entité. |
| [get_SystemId](./get_systemid/)() | Renvoie la valeur de l'identifiant système de la déclaration d'entité. |
| [set_InnerText](./set_innertext/)(String) override | Définit les valeurs concaténées du nœud d'entité et de tous ses enfants. |
| [set_InnerXml](./set_innerxml/)(String) override | Définit le balisage représentant les enfants de ce nœud. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Enregistre tous les enfants du nœud dans le [XmlWriter](../xmlwriter/) spécifié. Pour les nœuds [XmlEntity](./), cette méthode n'a aucun effet. |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | Enregistre le nœud dans le [XmlWriter](../xmlwriter/) spécifié. Pour les nœuds [XmlEntity](./), cette méthode n'a aucun effet. |
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
