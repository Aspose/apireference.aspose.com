---
title: "System::Net::Http::Headers::EntityTagHeaderValue classe"
linktitle: "EntityTagHeaderValue"
second_title: "Aspose.Font pour C++"
description: "System::Net::Http::Headers::EntityTagHeaderValue classe. Représente une valeur de l’en-tête ''Entity-Tag''. Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction System::MakeObject(). Ne créez jamais d’instance de ce type sur la pile ou en utilisant l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des échecs d’assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu’argument en C++."
type: docs
weight: 500
url: /fr/cpp/system.net.http.headers/entitytagheadervalue/
---
## EntityTagHeaderValue class


Représente une valeur de l’en-tête 'Entity-Tag'. Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d’instance de ce type sur la pile ou en utilisant l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des échecs d’assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu’argument.

```cpp
class EntityTagHeaderValue : public System::ICloneable
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [EntityTagHeaderValue](./entitytagheadervalue/)(String) | Construit une nouvelle instance. |
| [EntityTagHeaderValue](./entitytagheadervalue/)(String, bool) | Construit une nouvelle instance. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Compare les objets en utilisant la sémantique C# [Object.Equals](../../system/object/equals/). |
| static [get_Any](./get_any/)() | Obtient une valeur de l’en-tête 'ETag'. |
| [get_IsWeak](./get_isweak/)() | Obtient une valeur qui indique si l’instance actuelle est un validateur faible. |
| [get_Tag](./get_tag/)() | Informations RTTI. |
| static [GetEntityTagLength](./getentitytaglength/)(String, int32_t, System::SharedPtr\<EntityTagHeaderValue\>\&) | Convertit une chaîne passée depuis l’index spécifié en une instance de la classe [EntityTagHeaderValue](./). |
| [GetHashCode](./gethashcode/)() const override | Analogue de la méthode C# [Object.GetHashCode()](../../system/object/gethashcode/) . Permet le hachage d'objets personnalisés. |
| static [Parse](./parse/)(String) | Convertit une chaîne passée en une instance de la classe [EntityTagHeaderValue](./). |
| [ToString](./tostring/)() const override | Analogue de la méthode C# [Object.ToString()](../../system/object/tostring/). Permet de convertir des objets personnalisés en chaîne. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<EntityTagHeaderValue\>\&) | Essaie de convertir une chaîne passée en une instance de la classe [EntityTagHeaderValue](./). |
## Voir aussi

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
