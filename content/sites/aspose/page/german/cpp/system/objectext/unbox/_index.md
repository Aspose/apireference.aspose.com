---
title: "System::ObjectExt::Unbox Methode"
linktitle: "Unbox"
second_title: "Aspose.Page für C++"
description: "System::ObjectExt::Unbox Methode. Entpackt Werttypen, nachdem sie in Object konvertiert wurden. Implementierung für Enum‑Typen in C++."
type: docs
weight: 1400
url: /de/cpp/system/objectext/unbox/
---
## ObjectExt::Unbox(const SmartPtr\<Object\>\&) method


Entpackt Werttypen, nachdem sie in [Object](../../object/) konvertiert wurden. Implementierung für Enum‑Typen.

```cpp
template<typename T> static std::enable_if<std::is_enum<T>::value, T>::type System::ObjectExt::Unbox(const SmartPtr<Object> &obj)
```


| Parameter | Beschreibung |
| --- | --- |
| T | [Enum](../../enum/) Typ. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) zum Entpacken. |

### ReturnValue

[Enum](../../enum/) value.

## Siehe auch

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Unbox(const SmartPtr\<Object\>\&) method


Entpackt Werttypen, nachdem sie in [Object](../../object/) konvertiert wurden. Implementierung für Nicht‑Enum‑ und Nicht‑Nullable‑Typen.

```cpp
template<class T> static std::enable_if<!std::is_enum<T>::value &&detail::has_operator_equal<T>::value, T>::type System::ObjectExt::Unbox(const SmartPtr<Object> &obj)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Werttyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) zum Entpacken. |

### ReturnValue

Entpackter Wert.

## Siehe auch

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Unbox(const SmartPtr\<Object\>\&) method


Entpackt Werttypen, nachdem sie in [Object](../../object/) konvertiert wurden. Implementierung für Nicht‑Enum‑ und Nicht‑Nullable‑Typen.

```cpp
template<class T> static std::enable_if<!std::is_enum<T>::value &&!detail::has_operator_equal<T>::value, T>::type System::ObjectExt::Unbox(const SmartPtr<Object> &obj)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Werttyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) zum Entpacken. |

### ReturnValue

Entpackter Wert.

## Siehe auch

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Unbox(const SmartPtr\<Object\>\&) method


Entboxt String-Werte.

```cpp
String System::ObjectExt::Unbox(const SmartPtr<Object> &obj)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) zum Entpacken |

### ReturnValue

[String](../../string/) representation of boxed string, can be null if boxed string was null.

## Siehe auch

* Class [String](../../string/)
* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Unbox(E) method


Entboxt Aufzählungstypen zu Integer.

```cpp
template<class T,class E> static std::enable_if<std::is_enum<E>::value &&std::numeric_limits<T>::is_integer, T>::type System::ObjectExt::Unbox(E e)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Ziel‑Ganzzahltyp. |
| E | Quell‑Enum‑Typ. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| e | E | Wert zum Entpacken. |

### ReturnValue

Ganzzahlige Darstellung des Enums.

## Siehe auch

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Unbox(E) method


Konvertiert Aufzählungstypen.

```cpp
template<class T,class E> static std::enable_if<std::is_enum<E>::value &&std::is_enum<T>::value, T>::type System::ObjectExt::Unbox(E e)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Ziel-Enum-Typ. |
| E | Quell‑Enum‑Typ. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| e | E | Wert zum Entpacken. |

### ReturnValue

Konvertierter Enum-Wert.

## Siehe auch

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
