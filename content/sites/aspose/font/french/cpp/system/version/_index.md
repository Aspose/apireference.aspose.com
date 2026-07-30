---
title: "Classe System::Version"
linktitle: "Version"
second_title: "Aspose.Font pour C++"
description: "Classe System::Version. Représente un numéro de version. Ce type doit être alloué sur la pile et passé aux fonctions par valeur ou par référence. N'utilisez jamais la classe System::SmartPtr pour gérer des objets de ce type en C++."
type: docs
weight: 7300
url: /fr/cpp/system/version/
---
## Version class


Représente un numéro de version. Ce type doit être alloué sur la pile et passé aux fonctions par valeur ou par référence. N'utilisez jamais la classe [System::SmartPtr](../smartptr/) pour gérer des objets de ce type.

```cpp
class Version
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [CompareTo](./compareto/)(const Version\&) const | Compare les versions représentées par l'objet actuel et l'objet spécifié. |
| [Equals](./equals/)(const Version\&) const | Détermine si les numéros de version représentés par les objets actuel et spécifié sont égaux. |
| [get_Build](./get_build/)() const | Renvoie le numéro de build. |
| [get_Major](./get_major/)() const | Renvoie la version majeure. |
| [get_MajorRevision](./get_majorrevision/)() const | Renvoie la valeur haute de 16 bits du numéro de révision. |
| [get_Minor](./get_minor/)() const | Renvoie la version mineure. |
| [get_MinorRevision](./get_minorrevision/)() const | Renvoie la valeur basse de 16 bits du numéro de révision. |
| [get_Revision](./get_revision/)() const | Renvoie le numéro de révision. |
| [GetHashCode](./gethashcode/)() const | Renvoie un code de hachage pour l'objet actuel. |
| static [Parse](./parse/)(const String\&) | Convertit la représentation sous forme de chaîne d'un numéro de version en une instance équivalente de la classe [Version](./). |
| [ToString](./tostring/)() const | Renvoie la représentation sous forme de chaîne du numéro de version représenté par l'objet actuel. |
| [ToString](./tostring/)(int) const | Renvoie la représentation sous forme de chaîne du nombre spécifié de sections du numéro de version représenté par l'objet actuel. |
| [Version](./version/)(int, int, int, int) | Construit une instance qui représente les valeurs majeures, mineures, de build et de révision spécifiées. |
| [Version](./version/)(int, int, int) | Construit une instance qui représente les valeurs majeures, mineures et de build spécifiées. |
| [Version](./version/)(int, int) | Construit une instance qui représente la valeur majeure et les valeurs spécifiées. |
| [Version](./version/)(const String\&) | Construit une instance qui représente le numéro de version représenté sous forme de chaîne. |
| [Version](./version/)() | Construit une instance qui représente le numéro de version 0.0.-1.-1. |
## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
