---
title: "metodo System::DynamicCastArray"
linktitle: "CastDinamicoArray"
second_title: "Aspose.Font per C++"
description: "metodo System::DynamicCastArray. Esegue il casting degli elementi dell'array specificato a un tipo diverso in C++."
type: docs
weight: 18000
url: /it/cpp/system/dynamiccastarray/
---
## System::DynamicCastArray method


Esegue il casting degli elementi dell'array specificato a un tipo diverso.

```cpp
template<class To,class From> SharedPtr<Array<To>> System::DynamicCastArray(const SharedPtr<Array<From>> &from)
```


| Parametro | Descrizione |
| --- | --- |
| To | Il tipo a cui castare gli elementi dell'array specificato |
| From | Il tipo degli elementi dell'array di cui fare il cast |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| from | const SharedPtr\<Array\<From\>\>\& | Puntatore condiviso all'array contenente gli elementi da castare |

### ReturnValue

Un puntatore a un nuovo array contenente elementi di tipo **To** equivalenti agli elementi di **from**

## Deprecated
Aggiunto per compatibilità retroattiva. Usa ExplicitCast invece.

## Vedi anche

* Typedef [SharedPtr](../sharedptr/)
* Class [Array](../array/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
