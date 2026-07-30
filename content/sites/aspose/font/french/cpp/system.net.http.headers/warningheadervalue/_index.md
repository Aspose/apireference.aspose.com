---
title: "Classe System::Net::Http::Headers::WarningHeaderValue"
linktitle: "WarningHeaderValue"
second_title: "Aspose.Font pour C++"
description: "Classe System::Net::Http::Headers::WarningHeaderValue. Représente une valeur de l'en-tête ''Warning''. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 2700
url: /fr/cpp/system.net.http.headers/warningheadervalue/
---
## WarningHeaderValue class


Représente une valeur de l'en-tête 'Warning'. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
class WarningHeaderValue : public System::ICloneable
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Compare les objets en utilisant la sémantique C# [Object.Equals](../../system/object/equals/). |
| [get_Agent](./get_agent/)() | Renvoie l'hôte attaché à l'avertissement. |
| [get_Code](./get_code/)() | Informations RTTI. |
| [get_Date](./get_date/)() | Renvoie la date et l'heure de l'avertissement. |
| [get_Text](./get_text/)() | Renvoie le texte de l'avertissement. |
| [GetHashCode](./gethashcode/)() const override | Analogue de la méthode C# [Object.GetHashCode()](../../system/object/gethashcode/) . Permet le hachage d'objets personnalisés. |
| static [GetWarningLength](./getwarninglength/)(String, int32_t, System::SharedPtr\<Object\>\&) | Convertit une chaîne passée à partir de l'index spécifié en une instance de la classe [WarningHeaderValue](./). |
| static [Parse](./parse/)(String) | Convertit une chaîne passée en une instance de la classe [WarningHeaderValue](./). |
| [ToString](./tostring/)() const override | Analogue de la méthode C# [Object.ToString()](../../system/object/tostring/). Permet de convertir des objets personnalisés en chaîne. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<WarningHeaderValue\>\&) | Tente de convertir une chaîne passée en une instance de la classe [WarningHeaderValue](./). |
| [WarningHeaderValue](./warningheadervalue/)(int32_t, String, String) | Construit une nouvelle instance. |
| [WarningHeaderValue](./warningheadervalue/)(int32_t, String, String, DateTimeOffset) | Construit une nouvelle instance. |
## Voir aussi

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
