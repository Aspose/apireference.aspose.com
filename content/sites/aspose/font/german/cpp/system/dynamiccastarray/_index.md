---
title: "System::DynamicCastArray Methode"
linktitle: "DynamicCastArray"
second_title: "Aspose.Font für C++"
description: "System::DynamicCastArray Methode. Führt das Casten von Elementen des angegebenen Arrays in einen anderen Typ in C++ durch."
type: docs
weight: 18000
url: /de/cpp/system/dynamiccastarray/
---
## System::DynamicCastArray method


Führt das Casten von Elementen des angegebenen Arrays in einen anderen Typ durch.

```cpp
template<class To,class From> SharedPtr<Array<To>> System::DynamicCastArray(const SharedPtr<Array<From>> &from)
```


| Parameter | Beschreibung |
| --- | --- |
| Zu | Der Typ, in den die Elemente des angegebenen Arrays gecastet werden sollen |
| From | Der Typ der Elemente des Arrays, dessen Elemente gecastet werden sollen |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| from | const SharedPtr\<Array\<From\>\>\& | Shared-Pointer auf das Array, das die zu castenden Elemente enthält |

### ReturnValue

Ein Zeiger auf ein neues Array, das Elemente des Typs **To** enthält, die den Elementen von **from** entsprechen

## Deprecated
Hinzugefügt für die Rückwärtskompatibilität. Verwenden Sie stattdessen ExplicitCast.

## Siehe auch

* Typedef [SharedPtr](../sharedptr/)
* Class [Array](../array/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
