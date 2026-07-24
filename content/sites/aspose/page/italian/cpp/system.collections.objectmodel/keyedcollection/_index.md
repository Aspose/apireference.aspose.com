---
title: "classe System::Collections::ObjectModel::KeyedCollection"
linktitle: "KeyedCollection"
second_title: "Aspose.Page per C++"
description: "System::Collections::ObjectModel::KeyedCollection classe. Collezione astratta di elementi con chiavi incorporate. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione System::MakeObject() . Non creare mai un'istanza di questo tipo nello stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 200
url: /it/cpp/system.collections.objectmodel/keyedcollection/
---
## KeyedCollection class


Collezione astratta di elementi con chiavi incorporate. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/) . Non creare mai un'istanza di questo tipo nello stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
template<typename TKey,typename TItem>class KeyedCollection : public System::Collections::ObjectModel::Collection<TItem>
```


| Parametro | Descrizione |
| --- | --- |
| TKey | Tipo di chiave. |
| TItem | tipo di valore. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Add](./add/)(const TItem\&) override | Aggiungi l'elemento alla fine del contenitore. |
| [Contains](./contains/)(TKey) | Verifica se la chiave è presente nel contenitore. |
| [get_Comparer](./get_comparer/)() | Ottiene il comparatore. |
| [idx_get](./idx_get/)(TKey) | Ottiene l'elemento a un indice specifico. |
| [Remove](./remove/)(TKey) | Rimuove la chiave dal contenitore. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Fa sì che un argomento template specifico sia trattato come puntatore debole invece di puntatore condiviso (se applicabile). |
## Campi

| Campo | Descrizione |
| --- | --- |
| static [defaultThreshold](./defaultthreshold/) | Soglia di creazione del dizionario di ricerca, predefinita. |

## Vedi anche

* Class [Collection](../collection/)
* Namespace [System::Collections::ObjectModel](../)
* Library [Aspose.Page for C++](../../)
