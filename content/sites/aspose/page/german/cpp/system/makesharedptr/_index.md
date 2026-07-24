---
title: "System::MakeSharedPtr Methode"
linktitle: "MakeSharedPtr"
second_title: "Aspose.Page für C++"
description: "System::MakeSharedPtr Methode. Konvertiert rohen Zeiger zu Smart-Pointer. Überladung für const‑Zeiger. Nützlich z. B. beim Verwenden der ''this''‑Variablen in C#‑Methoden, die in C++ als const übersetzt werden."
type: docs
weight: 24800
url: /de/cpp/system/makesharedptr/
---
## System::MakeSharedPtr(const X *) method


Konvertiert rohen Zeiger zu Smart-Pointer. Überladung für const‑Zeiger. Nützlich z. B. beim Verwenden der 'this'‑Variablen in C#‑Methoden, die als const übersetzt werden.

```cpp
template<class X> SmartPtr<X> System::MakeSharedPtr(const X *p)
```


| Parameter | Beschreibung |
| --- | --- |
| X | Typ des Zeigers. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| p | const X * | Rohzeiger auf Objekt. |

### ReturnValue

Gemeinsamer Smart-Pointer auf Objekt.

## Siehe auch

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::MakeSharedPtr(X *) method


Konvertiert rohen Zeiger zu Smart-Pointer.

```cpp
template<class X> SmartPtr<X> System::MakeSharedPtr(X *p)
```


| Parameter | Beschreibung |
| --- | --- |
| X | Typ des Zeigers. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| p | X * | Rohzeiger auf Objekt. |

### ReturnValue

Gemeinsamer Smart-Pointer auf Objekt.

## Siehe auch

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
