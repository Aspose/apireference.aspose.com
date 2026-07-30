---
title: "System::StaticCastArray-Methode"
linktitle: "StaticCastArray"
second_title: "Aspose.Font für C++"
description: "System::StaticCastArray-Methode. Führt das Casten von Elementen des angegebenen Arrays in einen anderen Typ durch. Überschreibung für Fälle, in denen From ein SmartPtr-Objekt in C++ ist."
type: docs
weight: 39900
url: /de/cpp/system/staticcastarray/
---
## System::StaticCastArray(const System::SharedPtr\<System::Array\<From\>\>\&) method


Führt das Casten von Elementen des angegebenen Arrays in einen anderen Typ durch. Überschreibung für Fälle, in denen From ein [SmartPtr](../smartptr/) Objekt ist.

```cpp
template<typename To,typename From> std::enable_if_t<System::IsSmartPtr<From>::value, System::SharedPtr<System::Array<To>>> System::StaticCastArray(const System::SharedPtr<System::Array<From>> &from)
```


| Parameter | Beschreibung |
| --- | --- |
| Zu | Der Typ, in den die Elemente des angegebenen Arrays gecastet werden sollen |
| From | Der Typ der Elemente des Arrays, dessen Elemente gecastet werden sollen |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| from | const System::SharedPtr\<System::Array\<From\>\>\& | Shared-Pointer auf das Array, das die zu castenden Elemente enthält |

### ReturnValue

Ein Zeiger auf ein neues Array, das Elemente des Typs **To** enthält, die den Elementen von **from** entsprechen

## Deprecated
Hinzugefügt für die Rückwärtskompatibilität. Verwenden Sie stattdessen ExplicitCast.

## Siehe auch

* Typedef [SharedPtr](../sharedptr/)
* Class [Array](../array/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::StaticCastArray(const System::SharedPtr\<System::Array\<From\>\>\&) method


Führt das Casten von Elementen des angegebenen Arrays in einen anderen Typ durch. Überschreibung für Fälle, in denen From Boxable ist und To ein [Object](../object/)[].

```cpp
template<typename To,typename From> std::enable_if_t<!System::IsSmartPtr<From>::value &&System::IsBoxable<From>::value &&std::is_same<To, System::SharedPtr<Object>>::value, System::SharedPtr<System::Array<To>>> System::StaticCastArray(const System::SharedPtr<System::Array<From>> &from)
```


| Parameter | Beschreibung |
| --- | --- |
| Zu | Der Typ, in den die Elemente des angegebenen Arrays gecastet werden sollen |
| From | Der Typ der Elemente des Arrays, dessen Elemente gecastet werden sollen |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| from | const System::SharedPtr\<System::Array\<From\>\>\& | Shared-Pointer auf das Array, das die zu castenden Elemente enthält |

### ReturnValue

Ein Zeiger auf ein neues Array, das Elemente des Typs **To** enthält, die den Elementen von **from** entsprechen

## Deprecated
Hinzugefügt für die Rückwärtskompatibilität. Verwenden Sie stattdessen ExplicitCast.

## Siehe auch

* Typedef [SharedPtr](../sharedptr/)
* Class [Object](../object/)
* Class [Array](../array/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
