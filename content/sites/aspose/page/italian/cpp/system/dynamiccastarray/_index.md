---
title: "metodo System::DynamicCastArray"
linktitle: "DynamicCastArray"
second_title: "Aspose.Page per C++"
description: "metodo System::DynamicCastArray. Esegue il cast degli elementi dell'array specificato a un tipo diverso in C++."
type: docs
weight: 17900
url: /it/cpp/system/dynamiccastarray/
---
## System::DynamicCastArray method


Esegue il cast degli elementi dell'array specificato a un tipo diverso.

```cpp
template<class To,class From> SharedPtr<Array<To>> System::DynamicCastArray(const SharedPtr<Array<From>> &from)
```


| Parametro | Descrizione |
| --- | --- |
| A | Il tipo a cui castare gli elementi dell'array specificato |
| From | Il tipo degli elementi degli elementi dell'array di cui effettuare il cast |

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
* Library [Aspose.Page for C++](../../)
