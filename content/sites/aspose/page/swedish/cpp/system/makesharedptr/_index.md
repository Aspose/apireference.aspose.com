---
title: "System::MakeSharedPtr-metod"
linktitle: "MakeSharedPtr"
second_title: "Aspose.Page för C++"
description: "System::MakeSharedPtr-metod. Konverterar rå pekare till smart pekare. Överlagring för const-pekare. Användbar t.ex. när ''this''-variabeln används i C#-metoder som översätts som const i C++."
type: docs
weight: 24800
url: /sv/cpp/system/makesharedptr/
---
## System::MakeSharedPtr(const X *) method


Konverterar rå pekare till smart pekare. Överlagring för const-pekare. Användbar t.ex. när 'this'-variabeln används i C#-metoder som översätts som const.

```cpp
template<class X> SmartPtr<X> System::MakeSharedPtr(const X *p)
```


| Parameter | Beskrivning |
| --- | --- |
| X | Pekartyp. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| p | const X * | Rå pekare till objekt. |

### ReturnValue

Delad smart pekare till objekt.

## Se även

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::MakeSharedPtr(X *) method


Konverterar rå pekare till smart pekare.

```cpp
template<class X> SmartPtr<X> System::MakeSharedPtr(X *p)
```


| Parameter | Beskrivning |
| --- | --- |
| X | Pekartyp. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| p | X * | Rå pekare till objekt. |

### ReturnValue

Delad smart pekare till objekt.

## Se även

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
