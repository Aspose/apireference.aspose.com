---
title: "System::MakeArray Methode"
linktitle: "MakeArray"
second_title: "Aspose.Font für C++"
description: "System::MakeArray Methode. Eine Fabrikfunktion, die ein neues Array‑Objekt erstellt und die angegebenen Argumente an dessen Konstruktor in C++ übergibt."
type: docs
weight: 24100
url: /de/cpp/system/makearray/
---
## System::MakeArray(Args\&&...) method


Eine Fabrikfunktion, die ein neues [Array](../array/) Objekt erstellt und die angegebenen Argumente an dessen Konstruktor übergibt.

```cpp
template<class T,class...> ArrayPtr<T> System::MakeArray(Args &&... args)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Der Typ der Elemente des [Array](../array/) Objekts, das die Funktion erstellt |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| args | Args\&&... | Die Argumente, die an den Konstruktor des zu erstellenden [Array](../array/) Objekts übergeben werden |

### ReturnValue

Ein Smart‑Pointer, der auf das konstruierte [Array](../array/) Objekt zeigt

## Siehe auch

* Typedef [ArrayPtr](../arrayptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::MakeArray(Integral, Args\&&...) method


Eine Fabrikfunktion, die ein neues [Array](../array/) Objekt erstellt und die angegebenen Argumente an dessen Konstruktor übergibt.

```cpp
template<class T,class Integral,class...> std::enable_if<std::is_integral<Integral>::value, ArrayPtr<T>>::type System::MakeArray(Integral size, Args &&... args)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Der Typ der Elemente des [Array](../array/) Objekts, das die Funktion erstellt |
| Integral | Typ der Array‑Größe. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| size | Integral | Größe des zu erstellenden Arrays. |
| args | Args\&&... | Die Argumente, die an den Konstruktor des zu erstellenden [Array](../array/) Objekts übergeben werden |

### ReturnValue

Ein Smart‑Pointer, der auf das konstruierte [Array](../array/) Objekt zeigt

## Siehe auch

* Typedef [ArrayPtr](../arrayptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::MakeArray(std::initializer_list\<T\>) method


Eine Fabrikfunktion, die ein neues [Array](../array/) Objekt erstellt, es mit den Elementen aus der angegebenen Initialisierungsliste füllt und einen Smart‑Pointer zurückgibt, der auf das [Array](../array/) Objekt zeigt.

```cpp
template<typename T> ArrayPtr<T> System::MakeArray(std::initializer_list<T> init)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Der Typ der Elemente des [Array](../array/) Objekts, das die Funktion erstellt |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| init | std::initializer_list\<T\> | Die Initialisierungsliste, die die Elemente enthält, mit denen das Array gefüllt werden soll |

### ReturnValue

Ein Smart‑Pointer, der auf das konstruierte [Array](../array/) Objekt zeigt

## Siehe auch

* Typedef [ArrayPtr](../arrayptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
