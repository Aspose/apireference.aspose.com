---
title: "Classe System::Xml::XmlNamespaceManager"
linktitle: "XmlNamespaceManager"
second_title: "Aspose.Font pour C++"
description: "Classe System::Xml::XmlNamespaceManager. Résout, ajoute et supprime des espaces de noms dans une collection et fournit une gestion de portée pour ces espaces de noms en C++."
type: docs
weight: 2300
url: /fr/cpp/system.xml/xmlnamespacemanager/
---
## XmlNamespaceManager class


Résout, ajoute et supprime des espaces de noms dans une collection et assure la gestion de la portée pour ces espaces de noms.

```cpp
class XmlNamespaceManager : public System::Xml::IXmlNamespaceResolver,
                            public System::Collections::Generic::IEnumerable<String>
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [AddNamespace](./addnamespace/)(String, String) | Ajoute l'espace de noms donné à la collection. |
| virtual [get_DefaultNamespace](./get_defaultnamespace/)() | Renvoie l'URI de l'espace de noms pour l'espace de noms par défaut. |
| virtual [get_NameTable](./get_nametable/)() | Renvoie le [XmlNameTable](../xmlnametable/) associé à cet objet. |
| [GetEnumerator](./getenumerator/)() override | Renvoie un énumérateur à utiliser pour parcourir les espaces de noms dans le [XmlNamespaceManager](./). |
| [GetNamespacesInScope](./getnamespacesinscope/)(XmlNamespaceScope) override | Renvoie une collection de noms d'espaces de noms indexés par préfixe qui peut être utilisée pour énumérer les espaces de noms actuellement en portée. |
| virtual [HasNamespace](./hasnamespace/)(String) | Renvoie une valeur indiquant si le préfixe fourni possède un espace de noms défini pour la portée actuellement poussée. |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | Renvoie l'URI de l'espace de noms pour le préfixe spécifié. |
| [LookupPrefix](./lookupprefix/)(const String\&) override | Trouve le préfixe déclaré pour l'URI d'espace de noms donné. |
| virtual [PopScope](./popscope/)() | Retire une portée d'espace de noms de la pile. |
| virtual [PushScope](./pushscope/)() | Empile une portée d'espace de noms sur la pile. |
| virtual [RemoveNamespace](./removenamespace/)(String, String) | Supprime l'espace de noms donné pour le préfixe indiqué. |
| [XmlNamespaceManager](./xmlnamespacemanager/)(const SharedPtr\<XmlNameTable\>\&) | Initialise une nouvelle instance de la classe [XmlNamespaceManager](./) avec la [XmlNameTable](../xmlnametable/) spécifiée. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Remarques



Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instances de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

## Voir aussi

* Class [IXmlNamespaceResolver](../ixmlnamespaceresolver/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
