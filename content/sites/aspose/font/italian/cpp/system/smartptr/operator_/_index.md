---
title: "System::SmartPtr::operator* method"
linktitle: "operator*"
second_title: "Aspose.Font per C++"
description: "System::SmartPtr::operator* method. Ottiene un riferimento all'oggetto puntato. Verifica che il puntatore non sia nullo in C++."
type: docs
weight: 2500
url: /it/cpp/system/smartptr/operator_/
---
## SmartPtr::operator* method


Ottiene un riferimento all'oggetto puntato. Verifica che il puntatore non sia nullo.

```cpp
Pointee_ & System::SmartPtr<T>::operator*() const
```


### ReturnValue

Riferimento all'oggetto puntato.

## Vedi anche

* Typedef [Pointee_](../pointee_/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
---
titolo: System::SmartPtr::operator< method
titolo collegamento: operator<
second_title: Aspose.Font for C++
descrizione: 'System::SmartPtr::operator< method. Fornisce la semantica di confronto minore per la classe SmartPtr in C++.'
type: docs
peso: 2700
url: /cpp/system/smartptr/operator_/
---
## SmartPtr::operator<(SmartPtr\<Y\> const\&) const method


Fornisce una semantica di confronto minore per la classe [SmartPtr](../).

```cpp
template<class Y> bool System::SmartPtr<T>::operator<(SmartPtr<Y> const &x) const
```


| Parametro | Descrizione |
| --- | --- |
| Y | Tipo di puntatore con cui confrontare quello corrente. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| x | SmartPtr\<Y\> const\& | Puntatore con cui confrontare quello corrente. |

### ReturnValue

Vero se l'oggetto referenziato da [SmartPtr](../) è 'minore' di x e falso altrimenti.

## Vedi anche

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::operator<(Y *) const method


Fornisce una semantica di confronto minore per la classe [SmartPtr](../).

```cpp
template<class Y> bool System::SmartPtr<T>::operator<(Y *p) const
```


| Parametro | Descrizione |
| --- | --- |
| Y | Tipo di puntatore con cui confrontare quello corrente. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| p | Y * | Puntatore con cui confrontare quello corrente. |

### ReturnValue

Vero se l'oggetto referenziato da [SmartPtr](../) è 'minore' di p e falso altrimenti.

## Vedi anche

* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
