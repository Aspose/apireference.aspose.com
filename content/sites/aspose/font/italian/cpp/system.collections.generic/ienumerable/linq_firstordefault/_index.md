---
title: "System::Collections::Generic::IEnumerable::LINQ_FirstOrDefault metodo"
linktitle: "LINQ_FirstOrDefault"
second_title: "Aspose.Font per C++"
description: "System::Collections::Generic::IEnumerable::LINQ_FirstOrDefault metodo. Restituisce il primo elemento di una sequenza, oppure un valore predefinito se la sequenza è vuota in C++."
type: docs
weight: 1600
url: /it/cpp/system.collections.generic/ienumerable/linq_firstordefault/
---
## IEnumerable::LINQ_FirstOrDefault() method


Restituisce il primo elemento di una sequenza, o un valore predefinito se la sequenza è vuota.

```cpp
T System::Collections::Generic::IEnumerable<T>::LINQ_FirstOrDefault()
```


### ReturnValue

Primo elemento nella sequenza o valore costruito di default se la sequenza è vuota.

## Vedi anche

* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
## IEnumerable::LINQ_FirstOrDefault(std::function\<bool(T)>) method


Restituisce il primo elemento della sequenza che soddisfa una condizione o un valore predefinito se non viene trovato alcun elemento.

```cpp
T System::Collections::Generic::IEnumerable<T>::LINQ_FirstOrDefault(std::function<bool(T)> predicate)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| predicato | std::function\<bool(T)> | Una funzione per verificare ogni elemento rispetto a una condizione. |

### ReturnValue

default(T) se la sorgente è vuota o se nessun elemento supera il test specificato dal predicato; altrimenti, il primo elemento nella sorgente che supera il test specificato dal predicato.

## Vedi anche

* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
