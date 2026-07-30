---
title: "System::MakeSharedPtr method"
linktitle: "MakeSharedPtr"
second_title: "Aspose.Font per C++"
description: "System::MakeSharedPtr method. Converte un puntatore grezzo in un puntatore intelligente. Sovraccarico per puntatori const. Utile, ad es., quando si utilizza la variabile ''this'' nei metodi C# tradotti come const in C++."
type: docs
weight: 24900
url: /it/cpp/system/makesharedptr/
---
## System::MakeSharedPtr(const X *) method


Converte un puntatore grezzo in un puntatore intelligente. Sovraccarico per puntatori const. Utile, ad es., quando si utilizza la variabile 'this' nei metodi C# tradotti come const.

```cpp
template<class X> SmartPtr<X> System::MakeSharedPtr(const X *p)
```


| Parametro | Descrizione |
| --- | --- |
| X | Tipo puntato. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| p | const X * | Puntatore grezzo a oggetto. |

### ReturnValue

Puntatore intelligente condiviso a oggetto.

## Vedi anche

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::MakeSharedPtr(X *) method


Converte un puntatore grezzo in un puntatore intelligente.

```cpp
template<class X> SmartPtr<X> System::MakeSharedPtr(X *p)
```


| Parametro | Descrizione |
| --- | --- |
| X | Tipo puntato. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| p | X * | Puntatore grezzo a oggetto. |

### ReturnValue

Puntatore intelligente condiviso a oggetto.

## Vedi anche

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
