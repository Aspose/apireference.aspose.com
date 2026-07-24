---
title: "metodo System::InitObject"
linktitle: "InizializzaOggetto"
second_title: "Aspose.Page per C++"
description: "metodo System::InitObject. Avvia l'inizializzazione di un oggetto con proprietà condivisa in C++."
type: docs
weight: 21800
url: /it/cpp/system/initobject/
---
## System::InitObject method


Avvia l'inizializzazione di un oggetto con proprietà condivisa.

```cpp
template<typename T> Details::ObjectBuilder<T, SharedPtr<T>> System::InitObject(const SharedPtr<T> &object)
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo di oggetto da inizializzare |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| object | const SharedPtr\<T\>\& | [Object](../object/) da inizializzare |

### ReturnValue

ObjectBuilder configurato per la costruzione di puntatori condivisi
## Osservazioni



[Object](../object/) initialization must be finished with [Get()](../get/) call 

## Vedi anche

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
