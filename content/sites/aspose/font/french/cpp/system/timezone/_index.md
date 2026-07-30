---
title: "Classe System::TimeZone"
linktitle: "TimeZone"
second_title: "Aspose.Font pour C++"
description: "Classe System::TimeZone. Représente un fuseau horaire. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 6200
url: /fr/cpp/system/timezone/
---
## TimeZone class


Représente un fuseau horaire. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
class TimeZone : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| static [get_CurrentTimeZone](./get_currenttimezone/)() | Renvoie une nouvelle instance de la classe [TimeZone](./) qui représente le fuseau horaire actuel. |
| virtual [get_DaylightName](./get_daylightname/)() const | Renvoie un nom pour l'heure d'été du fuseau horaire représenté par l'objet actuel. |
| virtual [get_StandardName](./get_standardname/)() const | Renvoie un nom pour l'heure standard du fuseau horaire représenté par l'objet actuel. |
| virtual [GetDaylightChanges](./getdaylightchanges/)(int32_t) | Renvoie la période d'heure d'été pour une année particulière. |
| virtual [GetUtcOffset](./getutcoffset/)(DateTime) | Renvoie le décalage UTC pour l'heure locale spécifiée. |
| virtual [IsDaylightSavingTime](./isdaylightsavingtime/)(DateTime) | Détermine si la valeur de date et d'heure représentée par l'objet [DateTime](../datetime/) spécifié se situe dans la plage d'heure d'été pour le fuseau horaire représenté par l'objet [TimeZone](./) actuel. |
## Voir aussi

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
