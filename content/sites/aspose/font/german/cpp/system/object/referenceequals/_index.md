---
title: "System::Object::ReferenceEquals Methode"
linktitle: "ReferenceEquals"
second_title: "Aspose.Font für C++"
description: "System::Object::ReferenceEquals Methode. Spezialisierung von Object::ReferenceEquals für den Fall von string und nullptr in C++."
type: docs
weight: 1200
url: /de/cpp/system/object/referenceequals/
---
## Object::ReferenceEquals(String const\&, std::nullptr_t) method


Spezialisierung von [Object::ReferenceEquals](./) für den Fall von string und nullptr.

```cpp
bool System::Object::ReferenceEquals(String const &str, std::nullptr_t)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| str | String const\& | [String](../../string/) zum Vergleich mit nullptr. |

### ReturnValue

true, wenn die Zeichenkette null ist, sonst false.

## Siehe auch

* Class [String](../../string/)
* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Object::ReferenceEquals(String const\&, String const\&) method


Spezialisierung von [Object::ReferenceEquals](./) für den Fall von strings.

```cpp
bool System::Object::ReferenceEquals(String const &str1, String const &str2)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| str1 | String const\& | Erster zu vergleichender String. |
| str2 | String const\& | Zweiter zu vergleichender String. |

### ReturnValue

Wahr, wenn die Zeichenketten übereinstimmen, sonst falsch.

## Siehe auch

* Class [String](../../string/)
* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Object::ReferenceEquals(ptr const\&, ptr const\&) method


Vergleicht Objekte nach Referenz.

```cpp
static bool System::Object::ReferenceEquals(ptr const &objA, ptr const &objB)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| objA | ptr const\& | Erster Zeiger zum Vergleichen. |
| objB | ptr const\& | Zweiter Zeiger zum Vergleichen. |

### ReturnValue

Wahr, wenn Zeiger übereinstimmen, sonst falsch.

## Siehe auch

* Typedef [ptr](../ptr/)
* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Object::ReferenceEquals(T const\&, std::nullptr_t) method


Vergleicht den Werttyp‑Objekt referenziell mit nullptr.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value, bool>::type System::Object::ReferenceEquals(T const &objA, std::nullptr_t)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Typ des zu vergleichenden Objekts. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| objA | T const\& | Erstes Objekt zum Vergleichen. |

### ReturnValue

Gibt immer false zurück, da Werttypen nicht null sein können.

## Siehe auch

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Object::ReferenceEquals(T const\&, T const\&) method


Vergleicht Objekte nach Referenz.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value, bool>::type System::Object::ReferenceEquals(T const &objA, T const &objB)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Typ der zu vergleichenden Objekte. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| objA | T const\& | Erstes Objekt zum Vergleichen. |
| objB | T const\& | Zweites Objekt zum Vergleichen. |

### ReturnValue

Wahr, wenn Objektadressen übereinstimmen, sonst falsch.

## Siehe auch

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
