---
title: "metodo System::With"
linktitle: "With"
second_title: "Aspose.Font per C++"
description: "metodo System::With. Clona il record di riferimento e applica il functor di inizializzazione ad esso in C++."
type: docs
weight: 40200
url: /it/cpp/system/with/
---
## System::With(const SharedPtr\<T\>\&, const A\&) method


Clona il record di riferimento e applica il functor di inizializzazione ad esso.

```cpp
template<typename T,typename A> SharedPtr<T> System::With(const SharedPtr<T> &record, const A &initializer)
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo di record da clonare. |
| A | Tipo di functor di inizializzazione. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| record | const SharedPtr\<T\>\& | Puntatore condiviso all'oggetto da clonare e inizializzare. |
| inizializzatore | const A\& | Functore di inizializzazione applicato alla clonazione del record. |

### ReturnValue

Puntatore condiviso al record clonato.

## Vedi anche

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::With(const T\&, const A\&) method


Copia il record struct e applica il functore di inizializzazione.

```cpp
template<typename T,typename A> T System::With(const T &record, const A &initializer)
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo di record da copiare. |
| A | Tipo di functor di inizializzazione. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| record | const T\& | Record da copiare e inizializzare. |
| inizializzatore | const A\& | Functore di inizializzazione applicato alla copia del record. |

### ReturnValue

Record copiato.

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
