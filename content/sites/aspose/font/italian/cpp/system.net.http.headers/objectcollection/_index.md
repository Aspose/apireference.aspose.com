---
title: "System::Net::Http::Headers::ObjectCollection class"
linktitle: "ObjectCollection"
second_title: "Aspose.Font per C++"
description: "System::Net::Http::Headers::ObjectCollection class. Rappresenta la raccolta degli oggetti in C++."
type: docs
weight: 1600
url: /it/cpp/system.net.http.headers/objectcollection/
---
## ObjectCollection class


Rappresenta la raccolta degli oggetti.

```cpp
template<typename T>class ObjectCollection : public System::Collections::ObjectModel::Collection<T>
```


| Parametro | Descrizione |
| --- | --- |
| T | Il tipo di oggetto. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [ObjectCollection](./objectcollection/)() | Informazioni RTTI. |
| [ObjectCollection](./objectcollection/)(Action\<T\>) | Crea una nuova istanza. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Imposta il n‑esimo argomento del template a un puntatore debole (invece di condiviso). Consente di passare i puntatori nei contenitori alla modalità debole. |

## Vedi anche

* Class [Collection](../../system.collections.objectmodel/collection/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
