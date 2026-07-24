---
title: "System::BuildObject method"
linktitle: "BuildObject"
second_title: "Aspose.Page per C++"
description: "System::BuildObject method. Crea un oggetto con proprietà condivisa in C++."
type: docs
weight: 15200
url: /it/cpp/system/buildobject/
---
## System::BuildObject method


Crea un oggetto con proprietà condivisa.

```cpp
template<typename T,typename...> Details::ObjectBuilder<T, SharedPtr<T>> System::BuildObject(Args &&... args)
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo di oggetto da creare |
| Argomenti | Tipi di argomenti per la costruzione dell'oggetto |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| args | Args\&&... | Argomenti da inoltrare al costruttore dell'oggetto |

### ReturnValue

ObjectBuilder configurato per la costruzione di puntatori condivisi
## Osservazioni



Crea un [SharedPtr<T>](../sharedptr/) e restituisce un builder per esso
[Object](../object/) construction must be finished with [Get()](../get/) call 

## Vedi anche

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
