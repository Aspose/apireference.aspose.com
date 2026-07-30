---
title: "System::Net::Http::Headers::ProductInfoHeaderValue classe"
linktitle: "ProductInfoHeaderValue"
second_title: "Aspose.Font pour C++"
description: "System::Net::Http::Headers::ProductInfoHeaderValue classe. Représente un produit ou un commentaire dans la valeur de l'en-tête ''User-Agent''. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 1800
url: /fr/cpp/system.net.http.headers/productinfoheadervalue/
---
## ProductInfoHeaderValue class


Représente un produit ou un commentaire dans la valeur de l'en-tête 'User-Agent'. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
class ProductInfoHeaderValue : public System::ICloneable
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Compare les objets en utilisant la sémantique C# [Object.Equals](../../system/object/equals/). |
| [get_Comment](./get_comment/)() | Renvoie un commentaire. |
| [get_Product](./get_product/)() | Informations RTTI. |
| [GetHashCode](./gethashcode/)() const override | Analogue de la méthode C# [Object.GetHashCode()](../../system/object/gethashcode/) . Permet le hachage d'objets personnalisés. |
| static [GetProductInfoLength](./getproductinfolength/)(String, int32_t, System::SharedPtr\<ProductInfoHeaderValue\>\&) | Convertit une chaîne passée à partir de l'index spécifié en une instance de la classe [ProductInfoHeaderValue](./). |
| static [Parse](./parse/)(String) | Convertit une chaîne passée en une instance de la classe [ProductInfoHeaderValue](./). |
| [ProductInfoHeaderValue](./productinfoheadervalue/)(String, String) | Construit une nouvelle instance. |
| [ProductInfoHeaderValue](./productinfoheadervalue/)(System::SharedPtr\<ProductHeaderValue\>) | Construit une nouvelle instance. |
| [ProductInfoHeaderValue](./productinfoheadervalue/)(String) | Construit une nouvelle instance. |
| [ToString](./tostring/)() const override | Analogue de la méthode C# [Object.ToString()](../../system/object/tostring/). Permet de convertir des objets personnalisés en chaîne. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<ProductInfoHeaderValue\>\&) | Tente de convertir une chaîne passée en une instance de la classe [ProductInfoHeaderValue](./). |
## Voir aussi

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
