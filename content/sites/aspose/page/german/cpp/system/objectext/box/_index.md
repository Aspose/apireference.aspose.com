---
title: "System::ObjectExt::Box-Methode"
linktitle: "Box"
second_title: "Aspose.Page für C++"
description: "System::ObjectExt::Box-Methode. Verpackt Zeichenkettenwerte in C++."
type: docs
weight: 200
url: /de/cpp/system/objectext/box/
---
## ObjectExt::Box(const String\&) method


Boxt Zeichenkettenwerte.

```cpp
SmartPtr<Object> System::ObjectExt::Box(const String &value)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | const String\& | Wert zum Verpacken. |

### ReturnValue

Verpackter Wert oder null, falls die Quellzeichenkette null ist.

## Siehe auch

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Box(const T\&) method


Verpackt Werttypen zur Konvertierung in [Object](../../object/). Implementierung für Aufzählungstypen.

```cpp
template<typename T> static std::enable_if<std::is_enum<T>::value, System::SmartPtr<System::Object>>::type System::ObjectExt::Box(const T &value)
```


| Parameter | Beschreibung |
| --- | --- |
| T | [Enum](../../enum/) Typ. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | const T\& | [Enum](../../enum/) Wert zum Verpacken. |

### ReturnValue

Intelligenter Zeiger auf ein Objekt, das den verpackten Wert hält.

## Siehe auch

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Box(const T\&) method


Verpackt Werttypen zur Konvertierung in [Object](../../object/). Implementierung für Nicht‑Aufzählungstypen.

```cpp
template<typename T> static std::enable_if<!std::is_enum<T>::value &&!IsNullable<T>::value, System::SmartPtr<System::Object>>::type System::ObjectExt::Box(const T &value)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Werttyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | const T\& | Wert zum Verpacken. |

### ReturnValue

Intelligenter Zeiger auf ein Objekt, das den verpackten Wert hält.

## Siehe auch

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Box(const T\&) method


Verpackt [Nullable](../../nullable/)-Typen zur Konvertierung in [Object](../../object/).

```cpp
template<typename T> static std::enable_if<IsNullable<T>::value, System::SmartPtr<System::Object>>::type System::ObjectExt::Box(const T &value)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Werttyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | const T\& | Wert zum Verpacken. |

### ReturnValue

Intelligenter Zeiger auf ein Objekt, das den verpackten Wert hält.

## Siehe auch

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
