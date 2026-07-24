---
title: "System::Collections::Generic::SimpleEnumerator classe"
linktitle: "SimpleEnumerator"
second_title: "Aspose.Page per C++"
description: "Classe System::Collections::Generic::SimpleEnumerator. Classe iteratore per contenitori semplici che contengono elementi direttamente usando le funzioni rbegin() e rend(). Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 3900
url: /it/cpp/system.collections.generic/simpleenumerator/
---
## SimpleEnumerator class


Classe iteratore per contenitori semplici che contengono elementi direttamente usando le funzioni rbegin() e rend(). Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
template<typename Container,typename Element>class SimpleEnumerator : public System::Collections::Generic::BaseEnumerator<Container, typename Container::value_type>
```


| Parametro | Descrizione |
| --- | --- |
| Contenitore | Tipo di contenitore da iterare. |
| Elemento | Tipo di elemento. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | Clona l'iteratore corrente. |
| [get_Current](./get_current/)() const override | Restituisce l'elemento 'corrente'. |
| [SimpleEnumerator](./simpleenumerator/)(Object::ptr, Container\&) | Crea un iteratore semplice. |

## Vedi anche

* Class [BaseEnumerator](../baseenumerator/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
