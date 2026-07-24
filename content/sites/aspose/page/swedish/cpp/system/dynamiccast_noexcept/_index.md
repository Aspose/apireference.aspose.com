---
title: "System::DynamicCast_noexcept‑metod"
linktitle: "DynamicCast_noexcept"
second_title: "Aspose.Page för C++"
description: "System::DynamicCast_noexcept‑metod. Gamla föråldrade kast. Kommer att tas bort i framtida versioner i C++."
type: docs
weight: 17600
url: /sv/cpp/system/dynamiccast_noexcept/
---
## System::DynamicCast_noexcept(const TFrom\&) method


Gamla föråldrade kast. Kommer att tas bort i framtida versioner.

```cpp
template<typename TTo,typename TFrom> std::enable_if<IsExceptionWrapper<TFrom>::value &&IsExceptionWrapper<TTo>::value &&(std::is_convertible<TTo, TFrom>::value||std::is_base_of<TTo, TFrom>::value), TTo>::type System::DynamicCast_noexcept(const TFrom &obj) noexcept
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
## Anmärkningar


Utför dynamisk cast på [Exception](../exception/)-objekt. ## Föråldrat
Lämnad för bakåtkompatibilitet. Använd AsCast istället.

## Se även

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::DynamicCast_noexcept(SmartPtr\<TFrom\> const\&) method


Utför dynamisk cast på [SmartPtr](../smartptr/)-objekt.

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::DynamicCast_noexcept(SmartPtr<TFrom> const &obj) noexcept
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
## System::DynamicCast_noexcept(SmartPtr\<TFrom\>) method


Utför dynamisk cast på objekt till [Exception](../exception/)-objekt.

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_same<System::Object, TFrom>::value &&IsExceptionWrapper<TTo>::value, TTo>::type System::DynamicCast_noexcept(SmartPtr<TFrom> obj) noexcept
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
