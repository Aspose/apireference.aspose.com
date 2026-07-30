---
title: "metodo System::BuildObject"
linktitle: "BuildObject"
second_title: "Aspose.Font per C++"
description: "metodo System::BuildObject. Crea un oggetto con proprietà condivisa in C++."
type: docs
weight: 15300
url: /it/cpp/system/buildobject/
---
## System::BuildObject method


Crea un oggetto con proprietà condivisa.

```cpp
template<typename T,typename...> Details::ObjectBuilder<T, SharedPtr<T>> System::BuildObject(Args &&... args)
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo di oggetto da costruire |
| Argomenti | Tipi di argomento per la costruzione dell'oggetto |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| argomenti | Args\&&... | Argomenti da inoltrare al costruttore dell'oggetto |

### ReturnValue

ObjectBuilder configurato per la costruzione di puntatori condivisi
## Osservazioni



Crea un [SharedPtr<T>](../sharedptr/) e restituisce un builder per esso
[Object](../object/) construction must be finished with [Get()](../get/) call 

## Vedi anche

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
