---
title: "System::StaticCastArray methode"
linktitle: "StaticCastArray"
second_title: "Aspose.Page voor C++"
description: "System::StaticCastArray methode. Voert casting uit van elementen van de opgegeven array naar een ander type. Overschrijft voor gevallen waarin From een SmartPtr-object is in C++."
type: docs
weight: 39800
url: /nl/cpp/system/staticcastarray/
---
## System::StaticCastArray(const System::SharedPtr\<System::Array\<From\>\>\&) method


Voert casting uit van elementen van de opgegeven array naar een ander type. Overschrijft voor gevallen waarin From een [SmartPtr](../smartptr/) object is.

```cpp
template<typename To,typename From> std::enable_if_t<System::IsSmartPtr<From>::value, System::SharedPtr<System::Array<To>>> System::StaticCastArray(const System::SharedPtr<System::Array<From>> &from)
```


| Parameter | Beschrijving |
| --- | --- |
| Naar | Het type waarnaar de elementen van de opgegeven array moeten worden gecast |
| From | Het type van de elementen van de array‑elementen die moeten worden gecast |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| from | const System::SharedPtr\<System::Array\<From\>\>\& | Gedeelde pointer naar de array die de te casten elementen bevat |

### ReturnValue

Een pointer naar een nieuwe array die elementen van type **To** bevat die equivalent zijn aan de elementen van **from**

## Deprecated
Toegevoegd voor achterwaartse compatibiliteit. Gebruik in plaats daarvan ExplicitCast.

## Zie ook

* Typedef [SharedPtr](../sharedptr/)
* Class [Array](../array/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCastArray(const System::SharedPtr\<System::Array\<From\>\>\&) method


Voert casting uit van elementen van de opgegeven array naar een ander type. Overschrijft voor gevallen waarin From Boxable is en To een [Object](../object/)[].

```cpp
template<typename To,typename From> std::enable_if_t<!System::IsSmartPtr<From>::value &&System::IsBoxable<From>::value &&std::is_same<To, System::SharedPtr<Object>>::value, System::SharedPtr<System::Array<To>>> System::StaticCastArray(const System::SharedPtr<System::Array<From>> &from)
```


| Parameter | Beschrijving |
| --- | --- |
| Naar | Het type waarnaar de elementen van de opgegeven array moeten worden gecast |
| From | Het type van de elementen van de array‑elementen die moeten worden gecast |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| from | const System::SharedPtr\<System::Array\<From\>\>\& | Gedeelde pointer naar de array die de te casten elementen bevat |

### ReturnValue

Een pointer naar een nieuwe array die elementen van type **To** bevat die equivalent zijn aan de elementen van **from**

## Deprecated
Toegevoegd voor achterwaartse compatibiliteit. Gebruik in plaats daarvan ExplicitCast.

## Zie ook

* Typedef [SharedPtr](../sharedptr/)
* Class [Object](../object/)
* Class [Array](../array/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
