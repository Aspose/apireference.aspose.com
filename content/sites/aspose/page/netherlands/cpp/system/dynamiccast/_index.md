---
title: "System::DynamicCast methode"
linktitle: "DynamicCast"
second_title: "Aspose.Page voor C++"
description: "System::DynamicCast methode. Voert een dynamische cast uit op Exception-objecten in C++."
type: docs
weight: 16900
url: /nl/cpp/system/dynamiccast/
---
## System::DynamicCast(const TFrom\&) method


Voert een dynamische cast uit op [Exception](../exception/) objecten.

```cpp
template<typename TTo,typename TFrom> std::enable_if<IsExceptionWrapper<TFrom>::value &&IsExceptionWrapper<TTo>::value &&(std::is_convertible<TTo, TFrom>::value||std::is_base_of<TTo, TFrom>::value), TTo>::type System::DynamicCast(const TFrom &obj)
```


| Parameter | Beschrijving |
| --- | --- |
| TTo | Doel [Exception](../exception/) type. |
| TFrom | Bron [Exception](../exception/) type. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | const TFrom\& | Bron‑pointer. |

### ReturnValue

Cast‑resultaat als de cast is toegestaan.

## Deprecated
Behoudens voor achterwaartse compatibiliteit. Gebruik ExplicitCast in plaats daarvan.

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::DynamicCast(SmartPtr\<TFrom\> const\&) method


Voert een dynamische cast uit op [SmartPtr](../smartptr/) objecten.

```cpp
template<typename TTo,typename TFrom> std::enable_if<!std::is_enum<TTo>::value &&!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::DynamicCast(SmartPtr<TFrom> const &obj)
```


| Parameter | Beschrijving |
| --- | --- |
| TTo | Doel‑pointee type. |
| TFrom | Bron‑pointee type. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | Bron‑pointer. |

### ReturnValue

Cast‑resultaat als de cast is toegestaan.

## Deprecated
Behoudens voor achterwaartse compatibiliteit. Gebruik ExplicitCast in plaats daarvan.

## Zie ook

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::DynamicCast(SmartPtr\<TFrom\>) method


Deboxt een verpakte enum via cast.

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_enum<TTo>::value, TTo>::type System::DynamicCast(SmartPtr<TFrom> obj)
```


| Parameter | Beschrijving |
| --- | --- |
| TTo | Doel enumtype. |
| TFrom | Bron‑pointee type. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> | Pointer naar het object waaruit gegevens moeten worden gedeboxed. |

### ReturnValue

Gedeboxte enumwaarde.

## Deprecated
Behoudens voor achterwaartse compatibiliteit. Gebruik ExplicitCast in plaats daarvan.

## Zie ook

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::DynamicCast(SmartPtr\<TFrom\>) method


Voert een dynamische cast uit op objecten naar [Exception](../exception/) objecten.

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_same<System::Object, TFrom>::value &&IsExceptionWrapper<TTo>::value, TTo>::type System::DynamicCast(SmartPtr<TFrom> obj)
```


| Parameter | Beschrijving |
| --- | --- |
| TTo | Doel [Exception](../exception/) type. |
| TFrom | [Object](../object/) type. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> | Bron‑pointer. |

### ReturnValue

Cast‑resultaat als de cast is toegestaan.

## Deprecated
Behoudens voor achterwaartse compatibiliteit. Gebruik ExplicitCast in plaats daarvan.

## Zie ook

* Class [Object](../object/)
* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::DynamicCast(std::nullptr_t) method


Voert een dynamische cast uit op null-objecten.

```cpp
template<typename TTo> CastResult<TTo>::type System::DynamicCast(std::nullptr_t) noexcept
```


| Parameter | Beschrijving |
| --- | --- |
| TTo | Doel‑pointee type. |

### ReturnValue

nullptr.

## Deprecated
Behoudens voor achterwaartse compatibiliteit. Gebruik ExplicitCast in plaats daarvan.

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::DynamicCast(TFrom\&) method


Voert een dynamische cast uit op niet-pointer objecten.

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TFrom>::value &&!IsSmartPtr<TFrom>::value &&std::is_convertible<TTo, TFrom>::value, TTo>::type System::DynamicCast(TFrom &obj)
```


| Parameter | Beschrijving |
| --- | --- |
| TTo | Doeltype. |
| TFrom | Brontype. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | TFrom\& | Bronobject. |

### ReturnValue

Castresultaat.

## Deprecated
Behoudens voor achterwaartse compatibiliteit. Gebruik ExplicitCast in plaats daarvan.

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::DynamicCast(TFrom) method


Voert een dynamische cast uit van IntPtr naar pointer.

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_pointer<TTo>::value &&std::is_same<IntPtr, TFrom>::value, TTo>::type System::DynamicCast(TFrom value) noexcept
```


| Parameter | Beschrijving |
| --- | --- |
| TTo | Doeltype. |
| TFrom | Brontype. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | TFrom | Bron IntPtr-waarde. |

### ReturnValue

Castresultaat.

## Deprecated
Behoudens voor achterwaartse compatibiliteit. Gebruik ExplicitCast in plaats daarvan.

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
