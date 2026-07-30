---
title: "Classe System::Xml::XmlAttribute"
linktitle: "Attribut XML"
second_title: "Aspose.Font pour C++"
description: "Classe System::Xml::XmlAttribute. Représente un attribut. Les valeurs valides et par défaut de l’attribut sont définies dans une définition de type de document (DTD) ou un schéma en C++."
type: docs
weight: 600
url: /fr/cpp/system.xml/xmlattribute/
---
## XmlAttribute class


Représente un attribut. Les valeurs valides et par défaut de l'attribut sont définies dans une définition de type de document (DTD) ou un schéma.

```cpp
class XmlAttribute : public System::Xml::XmlNode
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [AppendChild](./appendchild/)(SharedPtr\<XmlNode\>) override | Ajoute le nœud spécifié à la fin de la liste des nœuds enfants de ce nœud. |
| [CloneNode](./clonenode/)(bool) override | Crée un duplicata de ce nœud. |
| [get_BaseURI](./get_baseuri/)() override | Renvoie l’identifiant uniforme de ressource (URI) de base du nœud. |
| [get_LocalName](./get_localname/)() override | Renvoie le nom local du nœud. |
| [get_Name](./get_name/)() override | Renvoie le nom qualifié du nœud. |
| [get_NamespaceURI](./get_namespaceuri/)() override | Renvoie l'URI d'espace de noms de ce nœud. |
| [get_NodeType](./get_nodetype/)() override | Renvoie le type du nœud actuel. |
| [get_OwnerDocument](./get_ownerdocument/)() override | Renvoie le [XmlDocument](../xmldocument/) auquel appartient ce nœud. |
| virtual [get_OwnerElement](./get_ownerelement/)() | Renvoie le [XmlElement](../xmlelement/) auquel l’attribut appartient. |
| [get_Prefix](./get_prefix/)() override | Renvoie le préfixe d'espace de noms de ce nœud. |
| [get_SchemaInfo](./get_schemainfo/)() override | Renvoie le post-schema-validation-infoset qui a été attribué à ce nœud à la suite de la validation du schéma. |
| virtual [get_Specified](./get_specified/)() | Renvoie une valeur indiquant si la valeur de l’attribut a été explicitement définie. |
| [get_Value](./get_value/)() override | Renvoie la valeur du nœud. |
| [InsertAfter](./insertafter/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) override | Insère le nœud spécifié immédiatement après le nœud de référence spécifié. |
| [InsertBefore](./insertbefore/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) override | Insère le nœud spécifié immédiatement avant le nœud de référence spécifié. |
| [PrependChild](./prependchild/)(SharedPtr\<XmlNode\>) override | Ajoute le nœud spécifié au début de la liste des nœuds enfants de ce nœud. |
| [RemoveChild](./removechild/)(SharedPtr\<XmlNode\>) override | Supprime le nœud enfant spécifié. |
| [ReplaceChild](./replacechild/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) override | Remplace le nœud enfant spécifié par le nouveau nœud enfant spécifié. |
| [set_InnerText](./set_innertext/)(String) override | Définit les valeurs concaténées du nœud et de tous ses enfants. |
| [set_InnerXml](./set_innerxml/)(String) override | Définit la valeur de l’attribut. |
| [set_Prefix](./set_prefix/)(String) override | Définit le préfixe d'espace de noms de ce nœud. |
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

* Class [XmlNode](../xmlnode/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
