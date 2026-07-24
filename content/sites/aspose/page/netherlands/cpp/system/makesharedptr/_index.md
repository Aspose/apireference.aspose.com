---
title: "System::MakeSharedPtr methode"
linktitle: "MakeSharedPtr"
second_title: "Aspose.Page voor C++"
description: "System::MakeSharedPtr methode. Converteert een ruwe pointer naar een slimme pointer. Overload voor const-pointer. Handig bijv. bij het gebruik van ''this'' variabele in C#-methoden die naar const worden vertaald in C++."
type: docs
weight: 24800
url: /nl/cpp/system/makesharedptr/
---
## System::MakeSharedPtr(const X *) method


Converteert een ruwe pointer naar een slimme pointer. Overload voor const-pointer. Handig bijv. bij het gebruik van 'this' variabele in C#-methoden die naar const worden vertaald.

```cpp
template<class X> SmartPtr<X> System::MakeSharedPtr(const X *p)
```


| Parameter | Beschrijving |
| --- | --- |
| X | Pointee-type. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| p | const X * | Ruwe pointer naar object. |

### ReturnValue

Gedeelde slimme pointer naar object.

## Zie ook

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::MakeSharedPtr(X *) method


Converteert ruwe pointer naar slimme pointer.

```cpp
template<class X> SmartPtr<X> System::MakeSharedPtr(X *p)
```


| Parameter | Beschrijving |
| --- | --- |
| X | Pointee-type. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| p | X * | Ruwe pointer naar object. |

### ReturnValue

Gedeelde slimme pointer naar object.

## Zie ook

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
