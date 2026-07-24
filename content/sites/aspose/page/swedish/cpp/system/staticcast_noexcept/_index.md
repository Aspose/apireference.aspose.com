---
title: "System::StaticCast_noexcept‑metod"
linktitle: "StaticCast_noexcept"
second_title: "Aspose.Page för C++"
description: "System::StaticCast_noexcept‑metod. Utför statisk cast på Exception‑objekt i C++."
type: docs
weight: 39400
url: /sv/cpp/system/staticcast_noexcept/
---
## System::StaticCast_noexcept(const TFrom\&) method


Utför statisk cast på [Exception](../exception/)-objekt.

```cpp
template<typename TTo,typename TFrom> std::enable_if<IsExceptionWrapper<TFrom>::value &&IsExceptionWrapper<TTo>::value &&(std::is_convertible<TTo, TFrom>::value||std::is_base_of<TTo, TFrom>::value), TTo>::type System::StaticCast_noexcept(const TFrom &obj)
```


| Parameter | Beskrivning |
| --- | --- |
| TTo | Måltyp för [Exception](../exception/)-typen. |
| TFrom | Källtyp för [Exception](../exception/)-typen. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| obj | const TFrom\& | Källpekare. |

### ReturnValue

Cast‑resultat om cast är tillåten eller nullptr annars.

## Deprecated
Lämnad för bakåtkompatibilitet. Använd AsCast istället.

## Se även

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast_noexcept(SmartPtr\<TFrom\> const\&) method


Utför statisk cast på [SmartPtr](../smartptr/)-objekt.

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::StaticCast_noexcept(SmartPtr<TFrom> const &obj)
```


| Parameter | Beskrivning |
| --- | --- |
| TTo | Målpointerns typ. |
| TFrom | Källpointerns typ. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | Källpekare. |

### ReturnValue

Cast‑resultat om cast är tillåten eller nullptr annars.

## Deprecated
Lämnad för bakåtkompatibilitet. Använd AsCast istället.

## Se även

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast_noexcept(SmartPtr\<TFrom\>) method


Utför statisk cast på Objects till [Exception](../exception/)-objekt.

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_same<System::Object, TFrom>::value &&IsExceptionWrapper<TTo>::value, TTo>::type System::StaticCast_noexcept(SmartPtr<TFrom> obj) noexcept
```


| Parameter | Beskrivning |
| --- | --- |
| TTo | Måltyp för [Exception](../exception/)-typen. |
| TFrom | [Object](../object/)-typ. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> | Källpekare. |

### ReturnValue

Cast‑resultat om cast är tillåten eller nullptr annars.

## Deprecated
Lämnad för bakåtkompatibilitet. Använd AsCast istället.

## Se även

* Class [Object](../object/)
* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast_noexcept(WeakPtr\<TFrom\> const\&) method


Utför statisk cast på [WeakPtr](../weakptr/)-objekt.

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::StaticCast_noexcept(WeakPtr<TFrom> const &obj)
```


| Parameter | Beskrivning |
| --- | --- |
| TTo | Målpointerns typ. |
| TFrom | Källpointerns typ. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| obj | WeakPtr\<TFrom\> const\& | Källpekare. |

### ReturnValue

Cast‑resultat om cast är tillåten eller nullptr annars.

## Deprecated
Lämnad för bakåtkompatibilitet. Använd AsCast istället.

## Se även

* Class [WeakPtr](../weakptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
