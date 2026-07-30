---
title: "Classe System::Net::Http::Headers::ProductHeaderValue"
linktitle: "ProductHeaderValue"
second_title: "Aspose.Font pour C++"
description: "Classe System::Net::Http::Headers::ProductHeaderValue. Représente un jeton de produit dans la valeur de l'en-tête ''User-Agent''. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() . Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour la transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 1700
url: /fr/cpp/system.net.http.headers/productheadervalue/
---
## ProductHeaderValue class


Représente un jeton de produit dans la valeur de l'en-tête 'User-Agent'. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour la transmettre aux fonctions en tant qu'argument.

```cpp
class ProductHeaderValue : public System::ICloneable
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Compare les objets en utilisant la sémantique C# [Object.Equals](../../system/object/equals/). |
| [get_Name](./get_name/)() | Informations RTTI. |
| [get_Version](./get_version/)() | Renvoie la version du jeton de produit. |
| [GetHashCode](./gethashcode/)() const override | Analogue de la méthode C# [Object.GetHashCode()](../../system/object/gethashcode/) . Permet le hachage d'objets personnalisés. |
| static [GetProductLength](./getproductlength/)(String, int32_t, System::SharedPtr\<ProductHeaderValue\>\&) | Convertit une chaîne passée à partir de l'index spécifié en une instance de la classe [ProductHeaderValue](./). |
| static [Parse](./parse/)(String) | Convertit une chaîne passée en une instance de la classe [ProductHeaderValue](./). |
| [ProductHeaderValue](./productheadervalue/)(String) | Construit une nouvelle instance. |
| [ProductHeaderValue](./productheadervalue/)(String, String) | Construit une nouvelle instance. |
| [ToString](./tostring/)() const override | Analogue de la méthode C# [Object.ToString()](../../system/object/tostring/). Permet de convertir des objets personnalisés en chaîne. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<ProductHeaderValue\>\&) | Essaie de convertir une chaîne passée en une instance de la classe [ProductHeaderValue](./). |
## Voir aussi

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
