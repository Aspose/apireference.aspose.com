---
title: "System::CastEnumerableTo Methode"
linktitle: "CastEnumerableTo"
second_title: "Aspose.Font für C++"
description: "System::CastEnumerableTo Methode. Führt das explizite Casten der Elemente des angegebenen aufzählbaren Objekts in einen anderen Typ in C++ aus."
type: docs
weight: 15600
url: /de/cpp/system/castenumerableto/
---
## System::CastEnumerableTo(const From\&) method


Führt das explizite Casten der Elemente des angegebenen aufzählbaren Objekts in einen anderen Typ aus.

```cpp
template<class To,class From> std::enable_if<!System::detail::has_method_get_Count<From>::value, Collections::Generic::ListPtr<To>>::type System::CastEnumerableTo(const From &enumerable)
```


| Parameter | Beschreibung |
| --- | --- |
| Zu | Der Typ, zu dem die Elemente des aufzählbaren Objekts statisch gecastet werden sollen |
| From | Der Typ des aufzählbaren Objekts |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| aufzählbar | const From\& | Aufzählbares Objekt, das die zu castenden Elemente enthält |

### ReturnValue

Ein Zeiger auf eine neue Sammlung, die Elemente des Typs **To** enthält, die den Elementen von **enumerable** entsprechen

## Siehe auch

* Class [ListPtr](../../system.collections.generic/listptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::CastEnumerableTo(const From\&) method


Führt das explizite Casten der Elemente des angegebenen aufzählbaren Objekts in einen anderen Typ aus.

```cpp
template<class To,class From> std::enable_if<System::detail::has_method_get_Count<From>::value, Collections::Generic::ListPtr<To>>::type System::CastEnumerableTo(const From &enumerable)
```


| Parameter | Beschreibung |
| --- | --- |
| Zu | Der Typ, zu dem die Elemente des aufzählbaren Objekts statisch gecastet werden sollen |
| From | Der Typ des aufzählbaren Objekts |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| aufzählbar | const From\& | ist Erbe des Enumerable-Objekts mit definierter get_Count-Methode und enthält die Elemente zum Casten |

### ReturnValue

Ein Zeiger auf eine neue Sammlung, die Elemente des Typs **To** enthält, die den Elementen von **enumerable** entsprechen

## Siehe auch

* Class [ListPtr](../../system.collections.generic/listptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
