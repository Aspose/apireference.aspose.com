---
title: "System::CastEnumerableTo Methode"
linktitle: "CastEnumerableTo"
second_title: "Aspose.Page für C++"
description: "System::CastEnumerableTo Methode. Führt das explizite Casting der Elemente des angegebenen aufzählbaren Objekts in einen anderen Typ in C++ durch."
type: docs
weight: 15500
url: /de/cpp/system/castenumerableto/
---
## System::CastEnumerableTo(const From\&) method


Führt das explizite Casting der Elemente des angegebenen aufzählbaren Objekts in einen anderen Typ durch.

```cpp
template<class To,class From> std::enable_if<!System::detail::has_method_get_Count<From>::value, Collections::Generic::ListPtr<To>>::type System::CastEnumerableTo(const From &enumerable)
```


| Parameter | Beschreibung |
| --- | --- |
| Zu | Der Typ, zu dem die Elemente des aufzählbaren Objekts statisch gecastet werden sollen |
| From | Der Typ des aufzählbaren Objekts |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| aufzählbar | const From\& | Enumerable-Objekt, das die zu castenden Elemente enthält |

### ReturnValue

Ein Zeiger auf eine neue Sammlung, die Elemente vom Typ **To** enthält, die den Elementen von **enumerable** entsprechen

## Siehe auch

* Class [ListPtr](../../system.collections.generic/listptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::CastEnumerableTo(const From\&) method


Führt das explizite Casting der Elemente des angegebenen aufzählbaren Objekts in einen anderen Typ durch.

```cpp
template<class To,class From> std::enable_if<System::detail::has_method_get_Count<From>::value, Collections::Generic::ListPtr<To>>::type System::CastEnumerableTo(const From &enumerable)
```


| Parameter | Beschreibung |
| --- | --- |
| Zu | Der Typ, zu dem die Elemente des aufzählbaren Objekts statisch gecastet werden sollen |
| From | Der Typ des aufzählbaren Objekts |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| aufzählbar | const From\& | ist Erbe eines Enumerable-Objekts mit definierter get_Count-Methode und enthält die zu castenden Elemente |

### ReturnValue

Ein Zeiger auf eine neue Sammlung, die Elemente vom Typ **To** enthält, die den Elementen von **enumerable** entsprechen

## Siehe auch

* Class [ListPtr](../../system.collections.generic/listptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
