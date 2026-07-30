---
title: "System::GetHashCode Methode"
linktitle: "HashCodeAbrufen"
second_title: "Aspose.Font für C++"
description: "System::GetHashCode Methode. Spezialisierung für std::thread::id; Gibt den Hashcode für das angegebene Thread-Objekt in C++ zurück."
type: docs
weight: 21300
url: /de/cpp/system/gethashcode/
---
## System::GetHashCode(const std::thread::id\&) method


Spezialisierung für std::thread::id; Gibt den Hashcode für das angegebene Thread-Objekt zurück.

```cpp
int System::GetHashCode(const std::thread::id &id)
```

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::GetHashCode(const T\&) method


Gibt einen Hashcode für den angegebenen Skalarenwert zurück.

```cpp
template<typename T> std::enable_if<std::is_scalar<T>::value, int>::type System::GetHashCode(const T &obj)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Der Typ des Wertes, für den die Funktion einen Hashcode erzeugt. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | const T\& | Der Wert, für den ein Hashcode erzeugt werden soll |

### ReturnValue

Der für den angegebenen Wert erzeugte Hashcode

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::GetHashCode(const T\&) method


Gibt einen Hashcode für das angegebene Objekt zurück.

```cpp
template<typename T> std::enable_if<!std::is_scalar<T>::value &&System::IsSmartPtr<T>::value, int>::type System::GetHashCode(const T &obj)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Der Typ des Objekts, für das die Funktion einen Hashcode erzeugt |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | const T\& | Der [SmartPtr](../smartptr/), der auf das Objekt zeigt, für das ein Hashcode erzeugt werden soll |

### ReturnValue

Der für das angegebene Objekt erzeugte Hashcode

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::GetHashCode(const T\&) method


Gibt einen Hashcode für das angegebene Objekt zurück, das eine Ausnahme ist.

```cpp
template<typename T> std::enable_if<System::IsExceptionWrapper<T>::value, int>::type System::GetHashCode(const T &obj)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Der Typ des Objekts, für das die Funktion einen Hashcode erzeugt |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | const T\& | Der [Exception](../exception/)-Wrapper, der das Objekt enthält, für das ein Hashcode erzeugt werden soll |

### ReturnValue

Der für das angegebene Objekt erzeugte Hashcode

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::GetHashCode(const T\&) method


Gibt einen Hashcode für das angegebene Objekt zurück, das weder ein SmartPtr noch eine Ausnahme ist.

```cpp
template<typename T> std::enable_if<!std::is_scalar<T>::value &&!System::IsSmartPtr<T>::value &&!System::IsExceptionWrapper<T>::value, int>::type System::GetHashCode(const T &obj)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Der Typ des Objekts, für das die Funktion einen Hashcode erzeugt |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | const T\& | Eine konstante Referenz auf das Objekt, für das ein Hashcode erzeugt werden soll |

### ReturnValue

Der für das angegebene Objekt erzeugte Hashcode

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
