---
title: "Classe System::Net::Http::Headers::HttpHeaders"
linktitle: "HttpHeaders"
second_title: "Aspose.Font pour C++"
description: "Classe System::Net::Http::Headers::HttpHeaders. La collection des en‑têtes HTTP. Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction System::MakeObject() . Ne créez jamais d’instance de ce type sur la pile ou avec l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des échecs d’assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour la transmettre aux fonctions en tant qu’argument en C++."
type: docs
weight: 700
url: /fr/cpp/system.net.http.headers/httpheaders/
---
## HttpHeaders class


La collection des en‑têtes HTTP. Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction [System::MakeObject()](../../system/makeobject/) . Ne créez jamais d’instance de ce type sur la pile ou avec l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des échecs d’assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour la transmettre aux fonctions en tant qu’argument.

```cpp
class HttpHeaders : public System::Collections::Generic::IEnumerable<System::Collections::Generic::KeyValuePair<System::String, System::SharedPtr<System::Collections::Generic::IEnumerable<System::String>>>>
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Add](./add/)(String, System::SharedPtr\<Collections::Generic::IEnumerable\<String\>\>) | Valide une nouvelle paire nom‑valeurs et l’ajoute à la collection actuelle. |
| [Add](./add/)(String, String) | Valide une nouvelle paire nom‑valeur et l’ajoute à la collection actuelle. |
| virtual [AddHeaders](./addheaders/)(System::SharedPtr\<HttpHeaders\>) | Concatène l'instance HttpHeaders-class spécifiée avec celle actuelle. |
| [AddParsedValue](./addparsedvalue/)(String, System::SharedPtr\<Object\>) | Obtient un en-tête par le nom spécifié et ajoute une valeur analysée à l'en-tête. |
| [Clear](./clear/)() | Supprime tous les éléments de la collection. |
| [Contains](./contains/)(String) |  |
| [ContainsParsedValue](./containsparsedvalue/)(String, System::SharedPtr\<Object\>) | Vérifie si l'en-tête contient la valeur spécifiée. |
| [GetEnumerator](./getenumerator/)() override | Obtient l'énumérateur. |
| [GetHeaderString](./getheaderstring/)(String) | Renvoie une représentation sous forme de chaîne des valeurs pour le nom d'en-tête spécifié. |
| [GetHeaderString](./getheaderstring/)(String, System::SharedPtr\<Object\>) | Renvoie une représentation sous forme de chaîne des valeurs pour le nom d'en-tête spécifié. |
| [GetHeaderStrings](./getheaderstrings/)() | Renvoie une collection qui contient les représentations sous forme de chaîne des valeurs des en-têtes. |
| [GetParsedValues](./getparsedvalues/)(String) | Renvoie les valeurs analysées pour le nom d'en-tête spécifié. |
| [GetValues](./getvalues/)(String) | Renvoie les valeurs correspondantes pour le nom spécifié. |
| static [ParsedValuesAsList](./parsedvaluesaslist/)(const System::SharedPtr\<Object\>) | Convertit les valeurs analysées en liste. |
| [Remove](./remove/)(String) | Tente de supprimer un élément par le nom spécifié. |
| [RemoveParsedValue](./removeparsedvalue/)(String, System::SharedPtr\<Object\>) | Obtient un en-tête par le nom spécifié et supprime une valeur analysée de l'en-tête. |
| [SetConfiguration](./setconfiguration/)(System::SharedPtr\<Collections::Generic::Dictionary\<String, System::SharedPtr\<HttpHeaderParser\>\>\>, System::SharedPtr\<Collections::Generic::HashSet\<String\>\>) |  |
| [SetOrRemoveParsedValue](./setorremoveparsedvalue/)(String, System::SharedPtr\<Object\>) | Obtient un en-tête par le nom spécifié et définit ou supprime sa valeur. La valeur de l'en-tête sera supprimée lorsque le paramètre 'value' est nullptr, sinon une valeur analysée sera définie. |
| [SetParsedValue](./setparsedvalue/)(String, System::SharedPtr\<Object\>) | Obtient un en-tête par le nom spécifié et définit une valeur analysée pour l'en-tête. |
| [ToString](./tostring/)() const override | Analogue de la méthode C# [Object.ToString()](../../system/object/tostring/). Permet de convertir des objets personnalisés en chaîne. |
| [TryAddWithoutValidation](./tryaddwithoutvalidation/)(String, String) | Tente d'ajouter une nouvelle paire nom-valeur à la collection actuelle. |
| [TryAddWithoutValidation](./tryaddwithoutvalidation/)(String, System::SharedPtr\<Collections::Generic::IEnumerable\<String\>\>) | Ajoute une collection de paires nom-valeur à la collection actuelle. |
| [TryGetValues](./trygetvalues/)(String, System::SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\&) | Tente d'obtenir les valeurs correspondantes pour le nom spécifié. |
| [TryParseAndAddValue](./tryparseandaddvalue/)(String, String) | Tente d'analyser la valeur spécifiée et de l'ajouter aux valeurs de l'en-tête. |
## Voir aussi

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
