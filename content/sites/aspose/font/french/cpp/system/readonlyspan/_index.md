---
title: "Classe System::ReadOnlySpan"
linktitle: "ReadOnlySpan"
second_title: "Aspose.Font pour C++"
description: "Classe System::ReadOnlySpan. À utiliser dans la classe Span en C++."
type: docs
weight: 5300
url: /fr/cpp/system/readonlyspan/
---
## ReadOnlySpan class


À utiliser dans la classe [Span](../span/).

```cpp
template<typename T>class ReadOnlySpan : public System::Details::SpanCore<const T, ReadOnlySpan<T>, Span<T>>
```


| Paramètre | Description |
| --- | --- |
| T | Le type des éléments dans le span. Cette classe fournit une façon sûre de type pour travailler avec des séquences contiguës d'objets en lecture seule. Elle peut être utilisée pour encapsuler des tableaux, des tableaux sur la pile ou des pointeurs bruts tout en maintenant la vérification des limites. Le [ReadOnlySpan](./) ne possède pas la mémoire à laquelle il pointe - il ne s'agit que d'une vue sur la mémoire existante. |
## Méthodes

| Méthode | Description |
| --- | --- |
| [ReadOnlySpan](./readonlyspan/)(const Span\<T\>\&) | Construit un span en lecture seule à partir d'un span régulier. |
| static [to_ReadOnlySpan](./to_readonlyspan/)(const typename BaseType::ArrayPtrT\&) | Convertit un tableau en [ReadOnlySpan](./). |
## Remarques


Représente une région contiguë en lecture seule d'une mémoire arbitraire.

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
