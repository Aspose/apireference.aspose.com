---
title: "classe System::Collections::Generic::SimpleEnumerator"
linktitle: "SimpleEnumerator"
second_title: "Aspose.Font per C++"
description: "classe System::Collections::Generic::SimpleEnumerator. Classe iteratore per contenitori semplici che contengono gli elementi direttamente usando le funzioni rbegin() e rend(). Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 3900
url: /it/cpp/system.collections.generic/simpleenumerator/
---
## SimpleEnumerator class


Classe iteratore per contenitori semplici che contengono gli elementi direttamente usando le funzioni rbegin() e rend(). Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarla alle funzioni come argomento.

```cpp
template<typename Container,typename Element>class SimpleEnumerator : public System::Collections::Generic::BaseEnumerator<Container, typename Container::value_type>
```


| Parametro | Descrizione |
| --- | --- |
| Contenitore | Tipo di contenitore da iterare. |
| Element | Tipo di elemento. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | Clona l'iteratore corrente. |
| [get_Current](./get_current/)() const override | Ottiene l'elemento 'corrente'. |
| [SimpleEnumerator](./simpleenumerator/)(Object::ptr, Container\&) | Crea un iteratore semplice. |

## Vedi anche

* Class [BaseEnumerator](../baseenumerator/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
