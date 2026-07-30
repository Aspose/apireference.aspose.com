---
title: "System::Collections::Generic::IDictionary classe"
linktitle: "IDictionary"
second_title: "Aspose.Font per C++"
description: "System::Collections::Generic::IDictionary classe. Interfaccia per contenitori simili a dizionari. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 2100
url: /it/cpp/system.collections.generic/idictionary/
---
## IDictionary class


Interfaccia per contenitori simili a dizionari. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarla alle funzioni come argomento.

```cpp
template<typename TKey,typename TValue>class IDictionary : public System::Collections::Generic::ICollection<KeyValuePair<TKey, TValue>>
```


| Parametro | Descrizione |
| --- | --- |
| TKey | Tipo di chiave. |
| TValue | Tipo valore. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [Add](./add/)(const TKey\&, const TValue\&) | Aggiunge una coppia chiave-valore al contenitore. |
| virtual [ContainsKey](./containskey/)(const TKey\&) const | Verifica se il contenitore contiene la chiave. |
| [CopyTo](./copyto/)(ArrayPtr\<KeyValuePair\<TKey, TValue\>\>, int) override | Copia il contenuto del dizionario negli elementi esistenti dell'array. |
| virtual [get_Count](./get_count/)() const | Rende visibile la funzione membro get_Count. |
| [get_IsFixedSize](./get_isfixedsize/)() const | Verifica se la dimensione della collezione è fissa. |
| [get_IsSynchronized](./get_issynchronized/)() const | Verifica se il contenitore è thread-safe. |
| virtual [get_Keys](./get_keys/)() const | Accede alla collezione delle chiavi. |
| virtual [get_Values](./get_values/)() const | Accede alla collezione dei valori. |
| virtual [GetValueOrDefault](./getvalueordefault/)(const TKey\&) const | Restituisce il valore se trovato; altrimenti **Value()**. |
| virtual [GetValueOrDefault](./getvalueordefault/)(const TKey\&, const TValue\&) const | Restituisce il valore se trovato; altrimenti **defaultValue**. |
| virtual [GetValueOrNull](./getvalueornull/)(const TKey\&) const | Restituisce il valore se trovato; altrimenti **null**, ha senso solo per i tipi di riferimento. |
| virtual [idx_get](./idx_get/)(const TKey\&) const | Funzione getter. |
| virtual [idx_set](./idx_set/)(const TKey\&, TValue) | Funzione setter. |
| virtual [Remove](./remove/)(const TKey\&) | Rimuove la chiave dal contenitore. |
| virtual [TryGetValue](./trygetvalue/)(const TKey\&, TValue\&) const | Cerca il valore e lo recupera se trovato. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [BaseType](./basetype/) | Informazioni RTTI. |
| [KeyValuePairType](./keyvaluepairtype/) | Tipo di coppia chiave-valore. |

## Vedi anche

* Class [ICollection](../icollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
