---
title: "classe System::Net::Http::Headers::ContentRangeHeaderValue"
linktitle: "ContentRangeHeaderValue"
second_title: "Aspose.Font pour C++"
description: "Classe System::Net::Http::Headers::ContentRangeHeaderValue. Représente une valeur de l'en-tête ''Content-Range''. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() . Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 400
url: /fr/cpp/system.net.http.headers/contentrangeheadervalue/
---
## ContentRangeHeaderValue class


Représente une valeur de l'en-tête 'Content-Range'. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/) . Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
class ContentRangeHeaderValue : public System::ICloneable
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [ContentRangeHeaderValue](./contentrangeheadervalue/)(int64_t, int64_t, int64_t) | Construit une nouvelle instance. |
| [ContentRangeHeaderValue](./contentrangeheadervalue/)(int64_t) | Construit une nouvelle instance. |
| [ContentRangeHeaderValue](./contentrangeheadervalue/)(int64_t, int64_t) | Construit une nouvelle instance. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Compare les objets en utilisant la sémantique C# [Object.Equals](../../system/object/equals/). |
| [get_From](./get_from/)() | Obtient une position à laquelle l'envoi de données doit commencer. |
| [get_HasLength](./get_haslength/)() const | Obtient une valeur qui indique si la longueur est spécifiée pour l'en-tête actuel. |
| [get_HasRange](./get_hasrange/)() const | Obtient une valeur qui indique si la plage est spécifiée pour l’en-tête actuel. |
| [get_Length](./get_length/)() | Obtient la longueur du corps de l’entité. |
| [get_To](./get_to/)() | Obtient une position à laquelle l’envoi des données doit s’arrêter. |
| [get_Unit](./get_unit/)() | Informations RTTI. |
| static [GetContentRangeLength](./getcontentrangelength/)(String, int32_t, System::SharedPtr\<Object\>\&) | Convertit une chaîne passée depuis la position spécifiée en une instance de la classe [ContentRangeHeaderValue](./). |
| [GetHashCode](./gethashcode/)() const override | Analogue de la méthode C# [Object.GetHashCode()](../../system/object/gethashcode/) . Permet le hachage d'objets personnalisés. |
| static [Parse](./parse/)(String) | Convertit une chaîne passée en une instance de la classe [ContentRangeHeaderValue](./). |
| [set_Unit](./set_unit/)(String) | Définit les unités utilisées dans la plage. |
| [ToString](./tostring/)() const override | Analogue de la méthode C# [Object.ToString()](../../system/object/tostring/). Permet de convertir des objets personnalisés en chaîne. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<ContentRangeHeaderValue\>\&) | Essaie de convertir une chaîne passée en une instance de la classe [ContentRangeHeaderValue](./). |
## Voir aussi

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
