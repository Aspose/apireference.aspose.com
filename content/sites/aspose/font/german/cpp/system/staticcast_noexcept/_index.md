---
title: "System::StaticCast_noexcept‑Methode"
linktitle: "StaticCast_noexcept"
second_title: "Aspose.Font für C++"
description: "System::StaticCast_noexcept‑Methode. Führt einen statischen Cast auf Exception‑Objekten in C++ durch."
type: docs
weight: 39500
url: /de/cpp/system/staticcast_noexcept/
---
## System::StaticCast_noexcept(const TFrom\&) method


Führt einen statischen Cast auf [Exception](../exception/)‑Objekten durch.

```cpp
template<typename TTo,typename TFrom> std::enable_if<IsExceptionWrapper<TFrom>::value &&IsExceptionWrapper<TTo>::value &&(std::is_convertible<TTo, TFrom>::value||std::is_base_of<TTo, TFrom>::value), TTo>::type System::StaticCast_noexcept(const TFrom &obj)
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

## Deprecated
Zurückwärtskompatibilität beibehalten. Verwenden Sie stattdessen AsCast.

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::StaticCast_noexcept(SmartPtr\<TFrom\> const\&) method


Führt einen statischen Cast auf [SmartPtr](../smartptr/) Objekten aus.

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::StaticCast_noexcept(SmartPtr<TFrom> const &obj)
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
## System::StaticCast_noexcept(SmartPtr\<TFrom\>) method


Führt einen statischen Cast von Objekten zu [Exception](../exception/) Objekten aus.

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_same<System::Object, TFrom>::value &&IsExceptionWrapper<TTo>::value, TTo>::type System::StaticCast_noexcept(SmartPtr<TFrom> obj) noexcept
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
## System::StaticCast_noexcept(WeakPtr\<TFrom\> const\&) method


Führt einen statischen Cast auf [WeakPtr](../weakptr/) Objekten aus.

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::StaticCast_noexcept(WeakPtr<TFrom> const &obj)
```


| Parameter | Beschreibung |
| --- | --- |
| TTo | Ziel-Pointee-Typ. |
| TFrom | Quell-Pointee-Typ. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | WeakPtr\<TFrom\> const\& | Quellzeiger. |

### ReturnValue

Cast-Ergebnis, wenn der Cast erlaubt ist, sonst nullptr.

## Deprecated
Zurückwärtskompatibilität beibehalten. Verwenden Sie stattdessen AsCast.

## Siehe auch

* Class [WeakPtr](../weakptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
