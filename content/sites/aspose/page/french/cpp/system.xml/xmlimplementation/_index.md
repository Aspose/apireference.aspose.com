---
title: "Classe System::Xml::XmlImplementation"
linktitle: "XmlImplementation"
second_title: "Aspose.Page pour C++"
description: "Classe System::Xml::XmlImplementation. Définit le contexte pour un ensemble d'objets XmlDocument en C++."
type: docs
weight: 2000
url: /fr/cpp/system.xml/xmlimplementation/
---
## XmlImplementation class


Définit le contexte pour un ensemble d'objets [XmlDocument](../xmldocument/).

```cpp
class XmlImplementation : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [CreateDocument](./createdocument/)() | Crée un nouveau [XmlDocument](../xmldocument/). |
| [HasFeature](./hasfeature/)(const String\&, const String\&) | Teste si l'implémentation du modèle d'objet Document (DOM) [Object](../../system/object/) implémente une fonctionnalité spécifique. |
| [XmlImplementation](./xmlimplementation/)() | Initialise une nouvelle instance de la classe [XmlImplementation](./). |
| [XmlImplementation](./xmlimplementation/)(const SharedPtr\<XmlNameTable\>\&) | Initialise une nouvelle instance de la classe [XmlImplementation](./) avec le [XmlNameTable](../xmlnametable/) spécifié. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Remarques



Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instances de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
