---
title: "System::Object::ReferenceEquals methode"
linktitle: "ReferenceEquals"
second_title: "Aspose.Page voor C++"
description: "System::Object::ReferenceEquals methode. Specialisatie van Object::ReferenceEquals voor het geval van string en nullptr in C++."
type: docs
weight: 1200
url: /nl/cpp/system/object/referenceequals/
---
## Object::ReferenceEquals(String const\&, std::nullptr_t) method


Specialisatie van [Object::ReferenceEquals](./) voor het geval van string en nullptr.

```cpp
bool System::Object::ReferenceEquals(String const &str, std::nullptr_t)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| str | String const\& | [String](../../string/) om te vergelijken met nullptr. |

### ReturnValue

true als string null is, false anders.

## Zie ook

* Class [String](../../string/)
* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Object::ReferenceEquals(String const\&, String const\&) method


Specialisatie van [Object::ReferenceEquals](./) voor het geval van strings.

```cpp
bool System::Object::ReferenceEquals(String const &str1, String const &str2)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| str1 | String const\& | Eerste string om te vergelijken. |
| str2 | String const\& | Tweede string om te vergelijken. |

### ReturnValue

true als strings overeenkomen, false anders.

## Zie ook

* Class [String](../../string/)
* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Object::ReferenceEquals(ptr const\&, ptr const\&) method


Vergelijkt objecten op referentie.

```cpp
static bool System::Object::ReferenceEquals(ptr const &objA, ptr const &objB)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| objA | ptr const\& | Eerste pointer om te vergelijken. |
| objB | ptr const\& | Tweede pointer om te vergelijken. |

### ReturnValue

Waar als pointers overeenkomen en onwaar anders.

## Zie ook

* Typedef [ptr](../ptr/)
* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Object::ReferenceEquals(T const\&, std::nullptr_t) method


Vergelijkt een value‑type object met nullptr op referentie.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value, bool>::type System::Object::ReferenceEquals(T const &objA, std::nullptr_t)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Type van object om te vergelijken. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| objA | T const\& | Eerste object om te vergelijken. |

### ReturnValue

Retourneert altijd false omdat waardetypen niet genulld kunnen worden.

## Zie ook

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Object::ReferenceEquals(T const\&, T const\&) method


Vergelijkt objecten op referentie.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value, bool>::type System::Object::ReferenceEquals(T const &objA, T const &objB)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Type van objecten om te vergelijken. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| objA | T const\& | Eerste object om te vergelijken. |
| objB | T const\& | Tweede object om te vergelijken. |

### ReturnValue

True als objectadressen overeenkomen en anders false.

## Zie ook

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
