---
title: "Classe System::Xml::XmlNotation"
linktitle: "XmlNotation"
second_title: "Aspose.Font pour C++"
description: "Classe System::Xml::XmlNotation. Représente une déclaration de notation, telle que <!NOTATION... > en C++."
type: docs
weight: 2900
url: /fr/cpp/system.xml/xmlnotation/
---
## XmlNotation class


Représente une déclaration de notation, telle que **<!NOTATION... >**.

```cpp
class XmlNotation : public System::Xml::XmlNode
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Crée un duplicata de ce nœud. Les nœuds de notation ne peuvent pas être clonés. Appeler cette méthode sur un objet [XmlNotation](./) lève une exception. |
| [get_InnerXml](./get_innerxml/)() override | Renvoie le balisage représentant les enfants de ce nœud. |
| [get_IsReadOnly](./get_isreadonly/)() override | Renvoie une valeur indiquant si le nœud est en lecture seule. |
| [get_LocalName](./get_localname/)() override | Renvoie le nom du nœud actuel sans le préfixe d'espace de noms. |
| [get_Name](./get_name/)() override | Renvoie le nom du nœud actuel. |
| [get_NodeType](./get_nodetype/)() override | Renvoie le type du nœud actuel. |
| [get_OuterXml](./get_outerxml/)() override | Renvoie le balisage représentant ce nœud et tous ses enfants. |
| [get_PublicId](./get_publicid/)() | Renvoie la valeur de l'identifiant public dans la déclaration de notation. |
| [get_SystemId](./get_systemid/)() | Renvoie la valeur de l'identifiant système dans la déclaration de notation. |
| [set_InnerXml](./set_innerxml/)(String) override | Définit le balisage représentant les enfants de ce nœud. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Enregistre les enfants du nœud dans le [XmlWriter](../xmlwriter/) spécifié. Cette méthode n'a aucun effet sur les nœuds [XmlNotation](./). |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | Enregistre le nœud dans le [XmlWriter](../xmlwriter/) spécifié. Cette méthode n'a aucun effet sur les nœuds [XmlNotation](./). |
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
