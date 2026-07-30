---
title: "System::Collections::Generic::BaseKVCollection classe"
linktitle: "BaseKVCollection"
second_title: "Aspose.Font per C++"
description: "System::Collections::Generic::BaseKVCollection classe. Contiene codice comune per collezioni di chiavi o valori. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e usare questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 700
url: /it/cpp/system.collections.generic/basekvcollection/
---
## BaseKVCollection class


Contiene codice comune per collezioni di chiavi o valori. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usare questo puntatore per passarlo alle funzioni come argomento.

```cpp
template<typename Dict,typename KV>class BaseKVCollection : public System::Collections::Generic::IKVCollection<KV>
```


| Parametro | Descrizione |
| --- | --- |
| Dict | [Dictionary](../dictionary/) tipo. |
| KV | Tipo di chiave o valore, a seconda dell'interfaccia utilizzata. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [BaseKVCollection](./basekvcollection/)(const typename Dict::Ptr\&) | Crea la collezione. |
| [CopyTo](./copyto/)(ArrayPtr\<KV\>, int) override | Copia i dati negli elementi esistenti dell'array. |
| [get_Count](./get_count/)() const override | Ottiene il numero di elementi. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Abilita la compilazione, ma non fa realmente nulla poiché questa struttura non possiede dati. |

## Vedi anche

* Class [IKVCollection](../ikvcollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
