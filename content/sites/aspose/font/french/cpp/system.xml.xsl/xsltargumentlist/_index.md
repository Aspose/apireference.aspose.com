---
title: "classe System::Xml::Xsl::XsltArgumentList"
linktitle: "XsltArgumentList"
second_title: "Aspose.Font pour C++"
description: "classe System::Xml::Xsl::XsltArgumentList. Contient un nombre variable d'arguments qui sont soit des paramètres XSLT, soit des objets d'extension en C++."
type: docs
weight: 400
url: /fr/cpp/system.xml.xsl/xsltargumentlist/
---
## XsltArgumentList class


Contient un nombre variable d'arguments qui sont soit des paramètres XSLT, soit des objets d'extension.

```cpp
class XsltArgumentList : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [AddExtensionObject](./addextensionobject/)(const String\&, const SharedPtr\<Object\>\&) | Ajoute un nouvel objet à la [XsltArgumentList](./) et l'associe à l'URI de l'espace de noms. |
| [AddParam](./addparam/)(const String\&, const String\&, const SharedPtr\<Object\>\&) | Ajoute un paramètre à la [XsltArgumentList](./) et l'associe au nom qualifié de l'espace de noms. |
| [Clear](./clear/)() | Supprime tous les paramètres et objets d'extension de la [XsltArgumentList](./). |
| [GetExtensionObject](./getextensionobject/)(const String\&) | Renvoie l'objet associé à l'espace de noms donné. |
| [GetParam](./getparam/)(const String\&, const String\&) | Renvoie le paramètre associé au nom qualifié de l'espace de noms. |
| [RemoveExtensionObject](./removeextensionobject/)(const String\&) | Supprime l'objet avec l'URI de l'espace de noms de la [XsltArgumentList](./). |
| [RemoveParam](./removeparam/)(const String\&, const String\&) | Supprime le paramètre de la [XsltArgumentList](./). |
| [XsltArgumentList](./xsltargumentlist/)() | Implémente une nouvelle instance de la [XsltArgumentList](./). |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Remarques



Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instances de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Font for C++](../../)
