---
title: "System::DynamicCast_noexcept method"
linktitle: "DynamicCast_noexcept"
second_title: "Aspose.Page voor C++"
description: "System::DynamicCast_noexcept method. Oude verouderde casts. Wordt verwijderd in toekomstige versies in C++."
type: docs
weight: 17600
url: /nl/cpp/system/dynamiccast_noexcept/
---
## System::DynamicCast_noexcept(const TFrom\&) method


Oude verouderde casts. Wordt verwijderd in toekomstige versies.

```cpp
template<typename TTo,typename TFrom> std::enable_if<IsExceptionWrapper<TFrom>::value &&IsExceptionWrapper<TTo>::value &&(std::is_convertible<TTo, TFrom>::value||std::is_base_of<TTo, TFrom>::value), TTo>::type System::DynamicCast_noexcept(const TFrom &obj) noexcept
```


| Parameter | Beschrijving |
| --- | --- |
| TTo | Doel [Exception](../exception/) type. |
| TFrom | Bron [Exception](../exception/) type. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | const TFrom\& | Bron‑pointer. |

### ReturnValue

Castresultaat als cast is toegestaan, anders nullptr.
## Opmerkingen


Voert een dynamische cast uit op [Exception](../exception/) objecten. ## Verouderd
Behoudt voor achterwaartse compatibiliteit. Gebruik AsCast in plaats daarvan.

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::DynamicCast_noexcept(SmartPtr\<TFrom\> const\&) method


Voert een dynamische cast uit op [SmartPtr](../smartptr/) objecten.

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::DynamicCast_noexcept(SmartPtr<TFrom> const &obj) noexcept
```


| Parameter | Beschrijving |
| --- | --- |
| TTo | Doel‑pointee type. |
| TFrom | Bron‑pointee type. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | Bron‑pointer. |

### ReturnValue

Castresultaat als cast is toegestaan, anders nullptr.

## Deprecated
Behoudt voor achterwaartse compatibiliteit. Gebruik AsCast in plaats daarvan.

## Zie ook

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::DynamicCast_noexcept(SmartPtr\<TFrom\>) method


Voert een dynamische cast uit op objecten naar [Exception](../exception/) objecten.

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_same<System::Object, TFrom>::value &&IsExceptionWrapper<TTo>::value, TTo>::type System::DynamicCast_noexcept(SmartPtr<TFrom> obj) noexcept
```


| Parameter | Beschrijving |
| --- | --- |
| TTo | Doel [Exception](../exception/) type. |
| TFrom | [Object](../object/) type. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> | Bron‑pointer. |

### ReturnValue

Castresultaat als cast is toegestaan, anders nullptr.

## Deprecated
Behoudt voor achterwaartse compatibiliteit. Gebruik AsCast in plaats daarvan.

## Zie ook

* Class [Object](../object/)
* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
