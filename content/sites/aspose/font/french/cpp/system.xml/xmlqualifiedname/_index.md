---
title: "Classe System::Xml::XmlQualifiedName"
linktitle: "XmlQualifiedName"
second_title: "Aspose.Font pour C++"
description: "Classe System::Xml::XmlQualifiedName. Représente un nom qualifié XML en C++."
type: docs
weight: 3200
url: /fr/cpp/system.xml/xmlqualifiedname/
---
## XmlQualifiedName class


Représente un nom qualifié XML.

```cpp
class XmlQualifiedName : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Détermine si l'objet [XmlQualifiedName](./) spécifié est égal à l'objet [XmlQualifiedName](./) actuel. |
| [get_IsEmpty](./get_isempty/)() const | Renvoie une valeur indiquant si le [XmlQualifiedName](./) est vide. |
| [get_Name](./get_name/)() const | Renvoie une représentation sous forme de chaîne du nom qualifié du [XmlQualifiedName](./). |
| [get_Namespace](./get_namespace/)() const | Renvoie une représentation sous forme de chaîne de l'espace de noms du [XmlQualifiedName](./). |
| [GetHashCode](./gethashcode/)() const override | Renvoie le code de hachage du [XmlQualifiedName](./). |
| static [ToString](./tostring/)(const String\&, const String\&) | Renvoie la valeur chaîne du [XmlQualifiedName](./). |
| [ToString](./tostring/)() const override | Renvoie la valeur chaîne du [XmlQualifiedName](./). |
| [XmlQualifiedName](./xmlqualifiedname/)() | Initialise une nouvelle instance de la classe [XmlQualifiedName](./). |
| [XmlQualifiedName](./xmlqualifiedname/)(const String\&) | Initialise une nouvelle instance de la classe [XmlQualifiedName](./) avec le nom spécifié. |
| [XmlQualifiedName](./xmlqualifiedname/)(const String\&, const String\&) | Initialise une nouvelle instance de la classe [XmlQualifiedName](./) avec le nom et l'espace de noms spécifiés. |
## Champs

| Champ | Description |
| --- | --- |
| static [Empty](./empty/) | Fournit un [XmlQualifiedName](./) vide. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Remarques



Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instances de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
