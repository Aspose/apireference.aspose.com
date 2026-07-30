---
title: "System::MakeObject Methode"
linktitle: "MakeObject"
second_title: "Aspose.Font für C++"
description: "System::MakeObject-Methode. Erstellt ein Objekt im Heap und gibt einen Shared-Pointer darauf zurück in C++."
type: docs
weight: 24600
url: /de/cpp/system/makeobject/
---
## System::MakeObject(Args\&&...) method


Erstellt ein Objekt im Heap und gibt einen Shared-Pointer darauf zurück.

```cpp
template<class T,class ...> std::enable_if<!IsSmartPtr<T>::value, SmartPtr<T>>::type System::MakeObject(Args &&... args)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Klasse zum Instanziieren. |
| Argumente | Typen der Konstruktorargumente. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| args | Args\&&... | Konstruktorargumente. |

### ReturnValue

[SmartPtr](../smartptr/) to newly created object, always in shared mode.

## Siehe auch

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::MakeObject(Args\&&...) method


Erstellt ein Objekt im Heap und gibt einen Shared-Pointer darauf zurück.

```cpp
template<class T,class ...> std::enable_if<IsSmartPtr<T>::value, T>::type System::MakeObject(Args &&... args)
```


| Parameter | Beschreibung |
| --- | --- |
| T | [SmartPtr](../smartptr/) zur zu instanzierenden Klasse. |
| Argumente | Typen der Konstruktorargumente. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| args | Args\&&... | Konstruktorargumente. |

### ReturnValue

[SmartPtr](../smartptr/) to newly created object, always in shared mode.

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
