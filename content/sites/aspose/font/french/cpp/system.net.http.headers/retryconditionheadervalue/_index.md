---
title: "System::Net::Http::Headers::RetryConditionHeaderValue class"
linktitle: "RetryConditionHeaderValue"
second_title: "Aspose.Font pour C++"
description: "System::Net::Http::Headers::RetryConditionHeaderValue class. Représente une valeur de l’en-tête ''Retry-After''. Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction System::MakeObject(). Ne créez jamais d’instance de ce type sur la pile ou en utilisant l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des fautes d’assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en argument en C++."
type: docs
weight: 2200
url: /fr/cpp/system.net.http.headers/retryconditionheadervalue/
---
## RetryConditionHeaderValue class


Représente une valeur de l’en-tête 'Retry-After'. Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d’instance de ce type sur la pile ou en utilisant l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des fautes d’assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en argument.

```cpp
class RetryConditionHeaderValue : public System::ICloneable
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Compare les objets en utilisant la sémantique C# [Object.Equals](../../system/object/equals/). |
| [get_Date](./get_date/)() | Informations RTTI. |
| [get_Delta](./get_delta/)() | Renvoie la valeur delta. |
| [GetHashCode](./gethashcode/)() const override | Analogue de la méthode C# [Object.GetHashCode()](../../system/object/gethashcode/) . Permet le hachage d'objets personnalisés. |
| static [GetRetryConditionLength](./getretryconditionlength/)(String, int32_t, System::SharedPtr\<Object\>\&) | Convertit une chaîne passée à partir de l’index spécifié en une instance de la classe [RetryConditionHeaderValue](./). |
| static [Parse](./parse/)(String) | Convertit une chaîne passée en une instance de la classe [RetryConditionHeaderValue](./). |
| [RetryConditionHeaderValue](./retryconditionheadervalue/)(DateTimeOffset) | Construit une nouvelle instance. |
| [RetryConditionHeaderValue](./retryconditionheadervalue/)(TimeSpan) | Construit une nouvelle instance. |
| [ToString](./tostring/)() const override | Analogue de la méthode C# [Object.ToString()](../../system/object/tostring/). Permet de convertir des objets personnalisés en chaîne. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<RetryConditionHeaderValue\>\&) | Essaie de convertir une chaîne passée en une instance de la classe [RetryConditionHeaderValue](./). |
## Voir aussi

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
