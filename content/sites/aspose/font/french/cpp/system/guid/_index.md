---
title: "Classe System::Guid"
linktitle: "Guid"
second_title: "Aspose.Font pour C++"
description: "Classe System::Guid. Représente un identifiant globalement unique. Ce type doit être alloué sur la pile et passé aux fonctions par valeur ou par référence. N'utilisez jamais la classe System::SmartPtr pour gérer les objets de ce type en C++."
type: docs
weight: 3000
url: /fr/cpp/system/guid/
---
## Guid class


Représente un identifiant globalement unique. Ce type doit être alloué sur la pile et passé aux fonctions par valeur ou par référence. N'utilisez jamais la classe [System::SmartPtr](../smartptr/) pour gérer les objets de ce type.

```cpp
class Guid
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [CompareTo](./compareto/)(const Guid\&) const | Effectue une comparaison arithmétique des GUID représentés par les objets actuel et spécifié. |
| [Equals](./equals/)(const Guid\&) const | Détermine si les GUID représentés par les objets actuel et spécifié sont égaux. |
| [GetHashCode](./gethashcode/)() const | Renvoie un code de hachage pour l'objet actuel. |
| [Guid](./guid/)() | Construit un objet qui représente un GUID composé de tous les zéros. |
| [Guid](./guid/)(const ArrayPtr\<uint8_t\>\&) | Construit un objet qui représente un GUID spécifié sous forme de tableau de valeurs entières non signées de 8 bits. |
| [Guid](./guid/)(const System::Details::ArrayView\<uint8_t\>\&) | Construit un objet qui représente un GUID spécifié sous forme de vue de tableau de valeurs entières non signées de 8 bits. |
| [Guid](./guid/)(const String\&) | Construit un objet qui représente un GUID spécifié sous forme de chaîne. |
| [Guid](./guid/)(int32_t, int16_t, int16_t, const ArrayPtr\<uint8_t\>\&) | Construit une instance de la classe [Guid](./) à partir des composants GUID spécifiés. |
| [Guid](./guid/)(int32_t, int16_t, int16_t, const System::Details::ArrayView\<uint8_t\>\&) | Construit une instance de la classe [Guid](./) à partir des composants GUID spécifiés. |
| [Guid](./guid/)(int32_t, int16_t, int16_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t) | Construit une instance de la classe [Guid](./) à partir des entiers non signés et des octets spécifiés. |
| [Guid](./guid/)(uint32_t, uint16_t, uint16_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t) | Construit une instance de la classe [Guid](./) à partir des entiers non signés et des octets spécifiés. |
| [Guid](./guid/)(const Guid\&) | Construit un objet qui représente le même GUID que l'objet spécifié. |
| static [NewGuid](./newguid/)() | Génère un nouveau GUID et renvoie un objet [Guid](./) qui le représente. |
| [operator!=](./operator!=/)(const Guid\&) const | Détermine si les GUID représentés par les objets actuel et spécifié ne sont pas égaux. |
| [operator=](./operator=/)(const Guid\&) | Attribue à l'objet actuel la valeur GUID représentée par l'objet [Guid](./) spécifié. |
| [operator==](./operator==/)(const Guid\&) const | Détermine si les GUID représentés par les objets actuel et spécifié sont égaux. |
| static [Parse](./parse/)(const String\&) | Convertit la représentation sous forme de chaîne spécifiée d'un GUID en un objet [Guid](./) équivalent. |
| [ToByteArray](./tobytearray/)() const | Convertit le GUID représenté par l'objet actuel en tableau d'octets. |
| [ToString](./tostring/)() const | Convertit le GUID représenté par l'objet actuel en sa représentation sous forme de chaîne. |
| [ToString](./tostring/)(const String\&) const | Convertit le GUID représenté par l'objet actuel en sa représentation sous forme de chaîne en utilisant le format de chaîne spécifié. |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) const | Convertit le GUID représenté par l'objet actuel en sa représentation sous forme de chaîne en utilisant le format de chaîne et la culture spécifiés. |
| static [TryParse](./tryparse/)(const String\&, Guid\&) | Tente de convertir la chaîne spécifiée en objet [Guid](./). |
| [~Guid](./~guid/)() | Destructeur. |
## Champs

| Champ | Description |
| --- | --- |
| static [Empty](./empty/) | Représente un GUID dont la valeur est 0. |
## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
