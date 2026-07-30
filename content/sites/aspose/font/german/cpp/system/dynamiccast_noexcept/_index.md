---
title: "System::DynamicCast_noexcept-Methode"
linktitle: "DynamicCast_noexcept"
second_title: "Aspose.Font für C++"
description: "System::DynamicCast_noexcept-Methode. Alte veraltete Casts. Wird in zukünftigen Versionen in C++ entfernt."
type: docs
weight: 17700
url: /de/cpp/system/dynamiccast_noexcept/
---
## System::DynamicCast_noexcept(const TFrom\&) method


Alte veraltete Casts. Werden in zukünftigen Versionen entfernt.

```cpp
template<typename TTo,typename TFrom> std::enable_if<IsExceptionWrapper<TFrom>::value &&IsExceptionWrapper<TTo>::value &&(std::is_convertible<TTo, TFrom>::value||std::is_base_of<TTo, TFrom>::value), TTo>::type System::DynamicCast_noexcept(const TFrom &obj) noexcept
```


| Parameter | Beschreibung |
| --- | --- |
| TTo | Ziel‑[Exception](../exception/)-Typ. |
| TFrom | Quell‑[Exception](../exception/)-Typ. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | const TFrom\& | Quellzeiger. |

### ReturnValue

Cast-Ergebnis, wenn der Cast erlaubt ist, sonst nullptr.
## Hinweise


Führt einen dynamischen Cast auf [Exception](../exception/) Objekten aus. ## Veraltet
Zurückwärtskompatibilität beibehalten. Verwenden Sie stattdessen AsCast.

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::DynamicCast_noexcept(SmartPtr\<TFrom\> const\&) method


Führt einen dynamischen Cast auf [SmartPtr](../smartptr/) Objekten aus.

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::DynamicCast_noexcept(SmartPtr<TFrom> const &obj) noexcept
```


| Parameter | Beschreibung |
| --- | --- |
| TTo | Ziel-Pointee-Typ. |
| TFrom | Quell-Pointee-Typ. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | Quellzeiger. |

### ReturnValue

Cast-Ergebnis, wenn der Cast erlaubt ist, sonst nullptr.

## Deprecated
Zurückwärtskompatibilität beibehalten. Verwenden Sie stattdessen AsCast.

## Siehe auch

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::DynamicCast_noexcept(SmartPtr\<TFrom\>) method


Führt einen dynamischen Cast von Objekten zu [Exception](../exception/) Objekten aus.

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_same<System::Object, TFrom>::value &&IsExceptionWrapper<TTo>::value, TTo>::type System::DynamicCast_noexcept(SmartPtr<TFrom> obj) noexcept
```


| Parameter | Beschreibung |
| --- | --- |
| TTo | Ziel‑[Exception](../exception/)-Typ. |
| TFrom | [Object](../object/) Typ. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> | Quellzeiger. |

### ReturnValue

Cast-Ergebnis, wenn der Cast erlaubt ist, sonst nullptr.

## Deprecated
Zurückwärtskompatibilität beibehalten. Verwenden Sie stattdessen AsCast.

## Siehe auch

* Class [Object](../object/)
* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
