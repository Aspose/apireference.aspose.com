---
title: "Metodo System::StaticCastArray"
linktitle: "StaticCastArray"
second_title: "Aspose.Font per C++"
description: "Metodo System::StaticCastArray. Esegue il cast degli elementi dell'array specificato a un tipo diverso. Override per i casi in cui From è un oggetto SmartPtr in C++."
type: docs
weight: 39900
url: /it/cpp/system/staticcastarray/
---
## System::StaticCastArray(const System::SharedPtr\<System::Array\<From\>\>\&) method


Esegue il cast degli elementi dell'array specificato a un tipo diverso. Override per i casi in cui From è un oggetto [SmartPtr](../smartptr/).

```cpp
template<typename To,typename From> std::enable_if_t<System::IsSmartPtr<From>::value, System::SharedPtr<System::Array<To>>> System::StaticCastArray(const System::SharedPtr<System::Array<From>> &from)
```


| Parametro | Descrizione |
| --- | --- |
| To | Il tipo a cui castare gli elementi dell'array specificato |
| From | Il tipo degli elementi dell'array di cui fare il cast |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| from | const System::SharedPtr\<System::Array\<From\>\>\& | Puntatore condiviso all'array contenente gli elementi da castare |

### ReturnValue

Un puntatore a un nuovo array contenente elementi di tipo **To** equivalenti agli elementi di **from**

## Deprecated
Aggiunto per compatibilità retroattiva. Usa ExplicitCast invece.

## Vedi anche

* Typedef [SharedPtr](../sharedptr/)
* Class [Array](../array/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::StaticCastArray(const System::SharedPtr\<System::Array\<From\>\>\&) method


Esegue il cast degli elementi dell'array specificato a un tipo diverso. Override per i casi in cui From è Boxable e To è [Object](../object/)[].

```cpp
template<typename To,typename From> std::enable_if_t<!System::IsSmartPtr<From>::value &&System::IsBoxable<From>::value &&std::is_same<To, System::SharedPtr<Object>>::value, System::SharedPtr<System::Array<To>>> System::StaticCastArray(const System::SharedPtr<System::Array<From>> &from)
```


| Parametro | Descrizione |
| --- | --- |
| To | Il tipo a cui castare gli elementi dell'array specificato |
| From | Il tipo degli elementi dell'array di cui fare il cast |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| from | const System::SharedPtr\<System::Array\<From\>\>\& | Puntatore condiviso all'array contenente gli elementi da castare |

### ReturnValue

Un puntatore a un nuovo array contenente elementi di tipo **To** equivalenti agli elementi di **from**

## Deprecated
Aggiunto per compatibilità retroattiva. Usa ExplicitCast invece.

## Vedi anche

* Typedef [SharedPtr](../sharedptr/)
* Class [Object](../object/)
* Class [Array](../array/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
