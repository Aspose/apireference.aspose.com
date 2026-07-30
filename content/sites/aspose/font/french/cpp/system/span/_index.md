---
title: "Classe System::Span"
linktitle: "Span"
second_title: "Aspose.Font pour C++"
description: "Classe System::Span. Représente une région contiguë de mémoire arbitraire similaire à std::span de C++20 en C++."
type: docs
weight: 5700
url: /fr/cpp/system/span/
---
## Span class


Représente une région contiguë de mémoire arbitraire similaire à std::span de C++20.

```cpp
template<typename T>class Span : public System::Details::SpanCore<T, Span<T>, Span<T>>
```


| Paramètre | Description |
| --- | --- |
| T | Le type des éléments dans le span. Cette classe fournit une manière sûre du point de vue du type de travailler avec des séquences contiguës d'objets. Elle peut être utilisée pour envelopper des tableaux, des tableaux sur la pile ou des pointeurs bruts tout en maintenant la vérification des limites. Le [Span](./) ne possède pas la mémoire à laquelle il pointe - il ne s'agit que d'une vue sur la mémoire existante. |
## Méthodes

| Méthode | Description |
| --- | --- |
| [Clear](./clear/)() const | Efface le contenu du span en définissant tous les éléments à la valeur par défaut. |
| [Fill](./fill/)(const T\&) const | Remplit le span avec la valeur spécifiée. |
| static [to_Span](./to_span/)(const typename BaseType::ArrayPtrT\&) | Convertit un tableau en un [Span](./). |

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
