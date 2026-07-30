---
title: "System::Xml::XmlCDataSection classe"
linktitle: "XmlCDataSection"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XmlCDataSection classe. Représente une section CDATA en C++."
type: docs
weight: 800
url: /fr/cpp/system.xml/xmlcdatasection/
---
## XmlCDataSection class


Représente une section CDATA.

```cpp
class XmlCDataSection : public System::Xml::XmlCharacterData
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Crée un duplicata de ce nœud. |
| [get_LocalName](./get_localname/)() override | Renvoie le nom local du nœud. |
| [get_Name](./get_name/)() override | Renvoie le nom qualifié du nœud. |
| [get_NodeType](./get_nodetype/)() override | Renvoie le type du nœud actuel. |
| [get_PreviousText](./get_previoustext/)() override | Renvoie le nœud texte qui précède immédiatement ce nœud. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Enregistre les enfants du nœud dans le [XmlWriter](../xmlwriter/) spécifié. |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | Enregistre le nœud dans le [XmlWriter](../xmlwriter/) spécifié. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Remarques



Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instances de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

## Voir aussi

* Class [XmlCharacterData](../xmlcharacterdata/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
