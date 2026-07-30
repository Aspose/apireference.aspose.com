---
title: "Classe System::Net::Http::Headers::NameValueWithParametersHeaderValue"
linktitle: "NameValueWithParametersHeaderValue"
second_title: "Aspose.Font pour C++"
description: "Classe System::Net::Http::Headers::NameValueWithParametersHeaderValue. Représente une paire clé/valeur avec paramètres à utiliser dans les en‑têtes. Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction System::MakeObject() . Ne créez jamais d’instance de ce type sur la pile ou avec l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des échecs d’assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour la transmettre aux fonctions en tant qu’argument en C++."
type: docs
weight: 1500
url: /fr/cpp/system.net.http.headers/namevaluewithparametersheadervalue/
---
## NameValueWithParametersHeaderValue class


Représente une paire clé/valeur avec paramètres à utiliser dans les en‑têtes. Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction [System::MakeObject()](../../system/makeobject/) . Ne créez jamais d’instance de ce type sur la pile ou avec l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des échecs d’assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour la transmettre aux fonctions en tant qu’argument.

```cpp
class NameValueWithParametersHeaderValue : public System::Net::Http::Headers::NameValueHeaderValue
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Compare les objets en utilisant la sémantique C# [Object.Equals](../../system/object/equals/). |
| [get_Parameters](./get_parameters/)() | Informations RTTI. |
| [GetHashCode](./gethashcode/)() const override | Analogue de la méthode C# [Object.GetHashCode()](../../system/object/gethashcode/) . Permet le hachage d'objets personnalisés. |
| static [GetNameValueWithParametersLength](./getnamevaluewithparameterslength/)(String, int32_t, System::SharedPtr\<Object\>\&) | Convertit une chaîne passée à partir de l’index spécifié en une instance de la classe [NameValueWithParametersHeaderValue](./). |
| [NameValueWithParametersHeaderValue](./namevaluewithparametersheadervalue/)(String) | Construit une nouvelle instance. |
| [NameValueWithParametersHeaderValue](./namevaluewithparametersheadervalue/)(String, String) | Construit une nouvelle instance. |
| [NameValueWithParametersHeaderValue](./namevaluewithparametersheadervalue/)() | Construit une nouvelle instance. |
| static [Parse](./parse/)(String) | Convertit une chaîne passée en une instance de la classe [NameValueWithParametersHeaderValue](./). |
| [ToString](./tostring/)() const override | Analogue de la méthode C# [Object.ToString()](../../system/object/tostring/). Permet de convertir des objets personnalisés en chaîne. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<NameValueWithParametersHeaderValue\>\&) | Essaie de convertir une chaîne passée en une instance de la classe [NameValueWithParametersHeaderValue](./). |
## Voir aussi

* Class [NameValueHeaderValue](../namevalueheadervalue/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
