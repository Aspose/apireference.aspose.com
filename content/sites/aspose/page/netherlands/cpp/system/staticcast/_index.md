---
title: "System::StaticCast methode"
linktitle: "StaticCast"
second_title: "Aspose.Page voor C++"
description: "System::StaticCast methode. Voert een statische cast uit op niet‑pointerobjecten in C++."
type: docs
weight: 38500
url: /nl/cpp/system/staticcast/
---
## System::StaticCast(const TFrom\&) method


Voert een statische cast uit op niet‑pointerobjecten.

```cpp
template<typename TTo,typename TFrom> std::enable_if<!std::is_same<TFrom, System::String>::value &&!IsExceptionWrapper<TFrom>::value &&!IsSmartPtr<TFrom>::value &&!std::is_arithmetic<TFrom>::value, TTo>::type System::StaticCast(const TFrom &obj)
```


| Parameter | Beschrijving |
| --- | --- |
| TTo | Doeltype. |
| TFrom | Brontype. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | const TFrom\& | Bronobject. |

### ReturnValue

Cast‑resultaat als de cast is toegestaan.

## Deprecated
Behoudens voor achterwaartse compatibiliteit. Gebruik ExplicitCast in plaats daarvan.

## Zie ook

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(const TFrom\&) method


Voert een static cast uit op [Exception](../exception/) objecten.

```cpp
template<typename TTo,typename TFrom> std::enable_if<IsExceptionWrapper<TFrom>::value &&IsExceptionWrapper<TTo>::value &&(std::is_convertible<TTo, TFrom>::value||std::is_base_of<TTo, TFrom>::value), TTo>::type System::StaticCast(const TFrom &obj)
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
## System::StaticCast(const TFrom *) method


Specialisatie voor rekenkundige types.

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_arithmetic<TFrom>::value, TTo>::type System::StaticCast(const TFrom *value)
```

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(SmartPtr\<TFrom\> const\&) method


Voert een static cast uit op [SmartPtr](../smartptr/) objecten.

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::StaticCast(SmartPtr<TFrom> const &obj)
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
## System::StaticCast(SmartPtr\<TFrom\>) method


Voert een statische cast uit op Objects naar [Exception](../exception/) objecten.

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_same<System::Object, TFrom>::value &&IsExceptionWrapper<TTo>::value, TTo>::type System::StaticCast(SmartPtr<TFrom> obj) noexcept
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
## System::StaticCast(std::nullptr_t) method


Voert een statische cast uit van null-objecten.

```cpp
template<typename TTo> CastResult<TTo>::type System::StaticCast(std::nullptr_t)
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
## System::StaticCast(TFrom) method


Specialisatie voor rekenkundige types.

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_arithmetic<TFrom>::value, TTo>::type System::StaticCast(TFrom value)
```

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(TTo) method


Voer een cast uit van [String](../string/) naar [String](../string/).

```cpp
template<typename TTo> std::enable_if<std::is_same<TTo, System::String>::value, TTo>::type System::StaticCast(TTo value)
```

## Zie ook

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(WeakPtr\<TFrom\> const\&) method


Voert een statische cast uit op [WeakPtr](../weakptr/) objecten.

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::StaticCast(WeakPtr<TFrom> const &obj)
```


| Parameter | Beschrijving |
| --- | --- |
| TTo | Doel‑pointee type. |
| TFrom | Bron‑pointee type. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | WeakPtr\<TFrom\> const\& | Bron‑pointer. |

### ReturnValue

Cast‑resultaat als de cast is toegestaan.

## Deprecated
Behoudens voor achterwaartse compatibiliteit. Gebruik ExplicitCast in plaats daarvan.

## Zie ook

* Class [WeakPtr](../weakptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
