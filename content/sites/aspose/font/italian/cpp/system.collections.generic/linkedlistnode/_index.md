---
title: "classe System::Collections::Generic::LinkedListNode"
linktitle: "LinkedListNode"
second_title: "Aspose.Font per C++"
description: "Classe System::Collections::Generic::LinkedListNode. Nodo di una lista collegata. Implementa un wrapper su un iteratore di std::list che è avvolto nella lista collegata. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 3200
url: /it/cpp/system.collections.generic/linkedlistnode/
---
## LinkedListNode class


Nodo di una lista collegata. Implementa un wrapper su un iteratore di std::list che è avvolto nella lista collegata. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
template<typename T>class LinkedListNode : public System::Object
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo di valore memorizzato. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_List](./get_list/)() const | Restituisce la lista contenente. |
| [get_Next](./get_next/)() const | Restituisce il nodo successivo. |
| [get_Previous](./get_previous/)() const | Restituisce il nodo precedente. |
| [get_Value](./get_value/)() const | Restituisce il valore memorizzato. |
| [LinkedListNode](./linkedlistnode/)(const T\&) | Costruttore. |
| [set_Value](./set_value/)(const T\&) | Imposta il valore memorizzato. |

## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
