---
title: "System::Collections::Generic::BaseDictionary class"
linktitle: "BaseDictionary"
second_title: "Aspose.Font per C++"
description: "Classe System::Collections::Generic::BaseDictionary. Implementa codice comune per varie strutture dati simili a dizionari (ad es. Dictionary, SortedDictionary). Non dovrebbe essere usata direttamente, eccetto per l'ereditarietà quando si definiscono contenitori. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 500
url: /it/cpp/system.collections.generic/basedictionary/
---
## BaseDictionary class


Implementa codice comune per varie strutture dati simili a dizionari (ad es. [Dictionary](../dictionary/), [SortedDictionary](../sorteddictionary/)). Non dovrebbe essere usato direttamente, eccetto per l'ereditarietà quando si definiscono contenitori. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
template<typename Map>class BaseDictionary : public System::Collections::Generic::IDictionary<Map::key_type, Map::mapped_type>
```


| Parametro | Descrizione |
| --- | --- |
| Map | Tipo di mappa sottostante. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [_add_range](./_add_range/)(std::initializer_list\<typename Map::value_type\>) | Specifico per C++. |
| [Add](./add/)(const key_t\&, const mapped_t\&) override | Aggiunge una coppia chiave-valore al dizionario. |
| [BaseDictionary](./basedictionary/)() | Crea una struttura dati vuota. |
| [BaseDictionary](./basedictionary/)(int, const Args\&...) | Costruttore forwarding per passare gli argomenti al costruttore della mappa sottostante. |
| [BaseDictionary](./basedictionary/)(BaseType *, const Args\&...) | Costruttore di copia. |
| [BaseDictionary](./basedictionary/)(BaseType *) | Costruttore di copia. |
| [begin](./begin/)() const | Restituisce un iteratore al wrapper KVPair per l'elemento chiave-valore del contenitore. Implementato in stile C# - l'iteratore dovrebbe restituire l'oggetto KVPair con l'interfaccia get_Key() e get_Value(). Se il contenitore è vuoto, l'iteratore restituito sarà uguale a [end()](../ienumerable/end/). |
| [cbegin](./cbegin/)() const | Restituisce un iteratore al primo elemento del contenitore. Implementato in stile STL. Se il contenitore è vuoto, l'iteratore restituito sarà uguale a [end()](../ienumerable/end/). |
| [cend](./cend/)() const | Restituisce un iteratore all'elemento successivo all'ultimo elemento del contenitore. Implementato in stile STL. Questo elemento funge da segnaposto; tentare di accedervi provoca un comportamento indefinito. |
| [Clear](./clear/)() override | Elimina tutti gli elementi. |
| [ContainsKey](./containskey/)(const key_t\&) const override | Verifica se la chiave è presente nel dizionario. |
| [ContainsValue](./containsvalue/)(const mapped_t\&) | Verifica se il valore è presente nel dizionario. Usa l'operatore == per confrontare i valori. |
| [data](./data/)() | Accessor per l'archiviazione dati sottostante. |
| [data](./data/)() const | Accessor per l'archiviazione dati sottostante. |
| [end](./end/)() const | Restituisce un iteratore al wrapper KVPair per l'elemento chiave-valore successivo all'ultimo elemento del contenitore. Implementato in stile C# - l'iteratore dovrebbe restituire l'oggetto KVPair con l'interfaccia get_Key() e get_Value(). Questo elemento funge da segnaposto; tentare di accedervi provoca un comportamento indefinito. |
| [get_Count](./get_count/)() const override | Ottiene il conteggio degli elementi. |
| virtual [GetEnumerator](./getenumerator/)() | Crea un'istanza dell'enumeratore, dovrebbe essere implementata dalla sottoclasse. |
| [GetValueOrDefault](./getvalueordefault/)(const key_t\&) const override | Restituisce il valore se trovato; altrimenti **Value()**. |
| [GetValueOrDefault](./getvalueordefault/)(const key_t\&, const mapped_t\&) const override | Restituisce il valore se trovato; altrimenti **defaultValue**. |
| [GetValueOrNull](./getvalueornull/)(const key_t\&) const override | Restituisce il valore se trovato; altrimenti **null**. Ha senso solo per i tipi di riferimento. |
| [idx_get](./idx_get/)(const key_t\&) const override | Funzione getter indicizzata. |
| [idx_set](./idx_set/)(const key_t\&, mapped_t) override | Funzione setter indicizzata. Modifica o crea l'elemento. |
| virtual [operator[]](./operator[]/)(const key_t\&) | Funzione di accesso. |
| [Remove](./remove/)(const key_t\&) override | Rimuove la chiave specifica dal dizionario. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(unsigned int) override |  |
| [TryGetValue](./trygetvalue/)(const key_t\&, mapped_t\&) const override | Cerca il valore indicizzato e lo recupera se trovato. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Ottiene l'implementazione dell'iteratore const begin per il contenitore corrente. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Ottiene l'implementazione dell'iteratore begin per il contenitore corrente. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Ottiene l'implementazione dell'iteratore const end per il contenitore corrente. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Ottiene l'implementazione dell'iteratore end per il contenitore corrente. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [BaseType](./basetype/) | Interfaccia implementata. |
| [const_iterator](./const_iterator/) | Tipo di iteratore const. |
| [iterator](./iterator/) | Tipo di iteratore. |
| [KeyCollection](./keycollection/) | Assicurati di utilizzare l'allocatore corretto con il tipo di archiviazione sottostante. |
| [KVPair](./kvpair/) | Tipo di coppia chiave-valore. |
| [map_t](./map_t/) | Tipo di mappa interno. |
| [ValueCollection](./valuecollection/) | Collezione di valori. |

## Vedi anche

* Class [IDictionary](../idictionary/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
