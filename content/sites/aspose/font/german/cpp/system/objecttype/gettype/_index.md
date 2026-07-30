---
title: "System::ObjectType::GetType Methode"
linktitle: "GetType"
second_title: "Aspose.Font für C++"
description: "System::ObjectType::GetType Methode. Implementiert die Übersetzung von typeof(). Überladung für primitive Typen in C++."
type: docs
weight: 100
url: /de/cpp/system/objecttype/gettype/
---
## ObjectType::GetType() method


Implementiert die typeof()-Übersetzung. Überladung für primitive Typen.

```cpp
template<typename T> static std::enable_if<std::is_fundamental<T>::value &&!std::is_enum<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| Parameter | Beschreibung |
| --- | --- |
| T | Primitiver Typ. |

### ReturnValue

Konstante Referenz auf die [TypeInfo](../../typeinfo/) Struktur, die den angegebenen Typ beschreibt.

## Siehe auch

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


Implementiert die typeof()-Übersetzung. Überladung für Aufzählungstypen.

```cpp
template<typename T> static std::enable_if<std::is_enum<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| Parameter | Beschreibung |
| --- | --- |
| T | Primitiver Typ. |

### ReturnValue

Konstante Referenz auf die [TypeInfo](../../typeinfo/) Struktur, die den angegebenen Typ beschreibt.

## Siehe auch

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


Implementiert die typeof()-Übersetzung. Überladung für Strukturen und Pointer.

```cpp
template<typename T> static std::enable_if<(!std::is_fundamental<T>::value &&!std::is_enum<T>::value &&!IsBoxable<T>::value)||IsExceptionWrapper<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| Parameter | Beschreibung |
| --- | --- |
| T | Primitiver Typ. |

### ReturnValue

Konstante Referenz auf die [TypeInfo](../../typeinfo/) Struktur, die die angegebene Struktur beschreibt.

## Siehe auch

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


Implementiert die Übersetzung von typeof(). Überladung für [Nullable](../../nullable/).

```cpp
template<typename T> static std::enable_if<IsNullable<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| Parameter | Beschreibung |
| --- | --- |
| T | [Nullable](../../nullable/) Typ. |

### ReturnValue

Konstante Referenz auf die [TypeInfo](../../typeinfo/) Struktur, die die angegebene Struktur beschreibt.

## Siehe auch

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


Implementiert die typeof()-Übersetzung. Überladung für MutlicastDelegate.

```cpp
template<typename T> static std::enable_if<detail::is_a<T, MulticastDelegate>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| Parameter | Beschreibung |
| --- | --- |
| T | MutlicastDelegate Typ. |

### ReturnValue

Konstante Referenz auf die [TypeInfo](../../typeinfo/) Struktur, die die angegebene Struktur beschreibt.

## Siehe auch

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


Implementiert die typeof()-Übersetzung. Überladung für Strukturen und Pointer.

```cpp
template<typename T> static std::enable_if<!std::is_fundamental<T>::value &&!std::is_enum<T>::value &&IsBoxable<T>::value &&!detail::is_a<T, MulticastDelegate>::value &&!IsNullable<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| Parameter | Beschreibung |
| --- | --- |
| T | Primitiver Typ. |

### ReturnValue

Konstante Referenz auf die [TypeInfo](../../typeinfo/) Struktur, die die angegebene Struktur beschreibt oder den Zeigertyp, falls für [SmartPtr](../../smartptr/) aufgerufen wird.

## Siehe auch

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


Implementiert die typeof()-Übersetzung. Überladung für uint8_t.

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## Siehe auch

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


Implementiert die Übersetzung von typeof(). Überladung für char16_t.

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## Siehe auch

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


Implementiert die Übersetzung von typeof(). Überladung für int32_t.

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## Siehe auch

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


Implementiert die Übersetzung von typeof(). Überladung für int64_t.

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## Siehe auch

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


Implementiert die Übersetzung von typeof(). Überladung für bool.

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## Siehe auch

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


Implementiert die Übersetzung von typeof(). Überladung für [Void](../../void/).

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## Siehe auch

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType(const String\&) method


Implementiert die typeof()-Übersetzung. Überladung für den string‑Typ.

```cpp
static const System::TypeInfo & System::ObjectType::GetType(const String &obj)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Primitiver Typ. |

### ReturnValue

Konstante Referenz auf die [TypeInfo](../../typeinfo/) Struktur, die den [String](../../string/) Typ beschreibt.

## Siehe auch

* Class [TypeInfo](../../typeinfo/)
* Class [String](../../string/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType(const T\&) method


Implementiert die typeof()-Übersetzung. Überladung für Smart‑Pointer.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType(const T &obj)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Zeiger-Objekttyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | const T\& | [Object](../../object/) zum Abrufen von [TypeInfo](../../typeinfo/). |

### ReturnValue

Konstante Referenz auf die [TypeInfo](../../typeinfo/) Struktur, die die endgültige Klasse des übergebenen Objekts beschreibt.

## Siehe auch

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType(const T\&) method


Implementiert die typeof()-Übersetzung. Überladung für Strukturen.

```cpp
template<typename T> static std::enable_if<!IsExceptionWrapper<T>::value &&!IsSmartPtr<T>::value &&!std::is_fundamental<T>::value &&!std::is_enum<T>::value &&!IsNullable<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType(const T &obj)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Strukturtyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | const T\& | [Object](../../object/) zum Abrufen von [TypeInfo](../../typeinfo/). |

### ReturnValue

Konstante Referenz auf die [TypeInfo](../../typeinfo/) Struktur, die die endgültige Klasse des übergebenen Objekts beschreibt.

## Siehe auch

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType(const T\&) method


Implementiert die typeof()-Übersetzung. Überladung für Ausnahmen.

```cpp
template<typename T> static std::enable_if<IsExceptionWrapper<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType(const T &obj)
```


| Parameter | Beschreibung |
| --- | --- |
| T | [Exception](../../exception/) Typ. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | const T\& | [Object](../../object/) zum Abrufen von [TypeInfo](../../typeinfo/). |

### ReturnValue

Konstante Referenz auf die [TypeInfo](../../typeinfo/) Struktur, die die endgültige Klasse des übergebenen Objekts beschreibt.

## Siehe auch

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType(const T) method


Implementiert die typeof()-Übersetzung. Überladung für primitive Typen.

```cpp
template<typename T> static std::enable_if<std::is_fundamental<T>::value||std::is_enum<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType(const T obj)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Primitiver Typ. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | const T | IGNORED |

### ReturnValue

Konstante Referenz auf die [TypeInfo](../../typeinfo/) Struktur, die den Typ des übergebenen Objekts beschreibt.

## Siehe auch

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType(const T) method


Implementiert die Übersetzung von typeof(). Überladung für [Nullable](../../nullable/) Typen.

```cpp
template<typename T> static std::enable_if<IsNullable<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType(const T obj)
```


| Parameter | Beschreibung |
| --- | --- |
| T | [Nullable](../../nullable/) Typ. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | const T | IGNORED |

### ReturnValue

Konstante Referenz auf die [TypeInfo](../../typeinfo/) Struktur, die den Typ des übergebenen Objekts beschreibt.

## Siehe auch

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
