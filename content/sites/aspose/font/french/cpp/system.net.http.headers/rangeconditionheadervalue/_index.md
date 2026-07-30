---
title: "System::Net::Http::Headers::RangeConditionHeaderValue classe"
linktitle: "RangeConditionHeaderValue"
second_title: "Aspose.Font pour C++"
description: "System::Net::Http::Headers::RangeConditionHeaderValue classe. Représente une valeur de l'en-tête ''If-Range''. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour la transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 1900
url: /fr/cpp/system.net.http.headers/rangeconditionheadervalue/
---
## RangeConditionHeaderValue class


Représente une valeur de l'en-tête 'If-Range'. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour la transmettre aux fonctions en tant qu'argument.

```cpp
class RangeConditionHeaderValue : public System::ICloneable
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Compare les objets en utilisant la sémantique C# [Object.Equals](../../system/object/equals/). |
| [get_Date](./get_date/)() | Informations RTTI. |
| [get_EntityTag](./get_entitytag/)() | Renvoie une valeur d'en-tête 'ETag'. |
| [GetHashCode](./gethashcode/)() const override | Analogue de la méthode C# [Object.GetHashCode()](../../system/object/gethashcode/) . Permet le hachage d'objets personnalisés. |
| static [GetRangeConditionLength](./getrangeconditionlength/)(String, int32_t, System::SharedPtr\<Object\>\&) | Convertit une chaîne passée à partir de l'index spécifié en une instance de la classe [RangeConditionHeaderValue](./). |
| static [Parse](./parse/)(String) | Convertit une chaîne passée en une instance de la classe [RangeConditionHeaderValue](./). |
| [RangeConditionHeaderValue](./rangeconditionheadervalue/)(DateTimeOffset) | Construit une nouvelle instance. |
| [RangeConditionHeaderValue](./rangeconditionheadervalue/)(System::SharedPtr\<EntityTagHeaderValue\>) | Construit une nouvelle instance. |
| [RangeConditionHeaderValue](./rangeconditionheadervalue/)(String) | Construit une nouvelle instance. |
| [ToString](./tostring/)() const override | Analogue de la méthode C# [Object.ToString()](../../system/object/tostring/). Permet de convertir des objets personnalisés en chaîne. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<RangeConditionHeaderValue\>\&) | Essaie de convertir une chaîne passée en une instance de la classe [RangeConditionHeaderValue](./). |
## Voir aussi

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
