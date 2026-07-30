---
title: "Classe System::Xml::XmlDeclaration"
linktitle: "XmlDeclaration"
second_title: "Aspose.Font pour C++"
description: "Classe System::Xml::XmlDeclaration. Représente le nœud de déclaration XML <?xml version=''1.0''...?> en C++."
type: docs
weight: 1300
url: /fr/cpp/system.xml/xmldeclaration/
---
## XmlDeclaration class


Représente le nœud de déclaration XML **<?xml version='1.0'...?>**.

```cpp
class XmlDeclaration : public System::Xml::XmlLinkedNode
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Crée un duplicata de ce nœud. |
| [get_Encoding](./get_encoding/)() | Retourne le niveau d'encodage du document XML. |
| [get_InnerText](./get_innertext/)() override | Retourne les valeurs concaténées du [XmlDeclaration](./). |
| [get_LocalName](./get_localname/)() override | Renvoie le nom local du nœud. |
| [get_Name](./get_name/)() override | Renvoie le nom qualifié du nœud. |
| [get_NodeType](./get_nodetype/)() override | Renvoie le type du nœud actuel. |
| [get_Standalone](./get_standalone/)() | Retourne la valeur de l'attribut standalone. |
| [get_Value](./get_value/)() override | Retourne la valeur du [XmlDeclaration](./). |
| [get_Version](./get_version/)() | Retourne la version XML du document. |
| [set_Encoding](./set_encoding/)(const String\&) | Définit le niveau d'encodage du document XML. |
| [set_InnerText](./set_innertext/)(String) override | Définit les valeurs concaténées du [XmlDeclaration](./). |
| [set_Standalone](./set_standalone/)(const String\&) | Définit la valeur de l'attribut standalone. |
| [set_Value](./set_value/)(String) override | Définit la valeur du [XmlDeclaration](./). |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Enregistre les enfants du nœud dans le [XmlWriter](../xmlwriter/) spécifié. Comme les nœuds [XmlDeclaration](./) n’ont pas d’enfants, cette méthode n’a aucun effet. |
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
