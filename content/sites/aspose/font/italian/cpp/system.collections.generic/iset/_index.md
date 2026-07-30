---
title: "System::Collections::Generic::ISet classe"
linktitle: "ISet"
second_title: "Aspose.Font per C++"
description: "System::Collections::Generic::ISet classe. Interfaccia di una collezione che contiene un insieme di elementi unici. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 2700
url: /it/cpp/system.collections.generic/iset/
---
## ISet class


Interfaccia di una collezione contenente un insieme di elementi unici. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
template<typename T>class ISet : public System::Collections::Generic::ICollection<T>
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo di elemento. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [ExceptWith](./exceptwith/)(IEnumerablePtr) | Rimuove un gruppo di elementi. |
| virtual [IntersectWith](./intersectwith/)(IEnumerablePtr) | Rimuove gli elementi non presenti in un contenitore diverso. |
| virtual [IsProperSubsetOf](./ispropersubsetof/)(IEnumerablePtr) | Verifica se l'insieme corrente è un sottoinsieme stretto di un altro contenitore. |
| virtual [IsProperSupersetOf](./ispropersupersetof/)(IEnumerablePtr) | Verifica se l'insieme corrente è un sovrainsieme stretto di un altro contenitore. |
| virtual [IsSubsetOf](./issubsetof/)(IEnumerablePtr) | Verifica se l'insieme corrente è un sottoinsieme di un altro contenitore. |
| virtual [IsSupersetOf](./issupersetof/)(IEnumerablePtr) | Verifica se l'insieme corrente è un sovrainsieme di un altro contenitore. |
| virtual [Overlaps](./overlaps/)(IEnumerablePtr) | Verifica se l'insieme si sovrappone a un altro contenitore. |
| virtual [SetEquals](./setequals/)(IEnumerablePtr) | Verifica se l'insieme e il contenitore contengono gli stessi elementi. |
| virtual [SymmetricExceptWith](./symmetricexceptwith/)(IEnumerablePtr) | Calcola la differenza simmetrica di due contenitori. Rimuove tutti gli elementi presenti in entrambi i contenitori, ma allo stesso tempo aggiunge tutti gli elementi presenti in **other**, ma non nell'insieme corrente. |
| virtual [UnionWith](./unionwith/)(IEnumerablePtr) | Aggiunge gli elementi dalla collezione specificata che non sono ancora presenti nell'insieme corrente. |
| virtual [~ISet](./~iset/)() | Distruttore. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [IEnumerablePtr](./ienumerableptr/) | Informazioni RTTI. |

## Vedi anche

* Class [ICollection](../icollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
