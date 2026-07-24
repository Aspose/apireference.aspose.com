---
title: "Metodo System::StaticCast_noexcept"
linktitle: "StaticCast_noexcept"
second_title: "Aspose.Page per C++"
description: "Metodo System::StaticCast_noexcept. Esegue cast statico su oggetti Exception in C++."
type: docs
weight: 39400
url: /it/cpp/system/staticcast_noexcept/
---
## System::StaticCast_noexcept(const TFrom\&) method


Esegue cast statico su oggetti [Exception](../exception/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<IsExceptionWrapper<TFrom>::value &&IsExceptionWrapper<TTo>::value &&(std::is_convertible<TTo, TFrom>::value||std::is_base_of<TTo, TFrom>::value), TTo>::type System::StaticCast_noexcept(const TFrom &obj)
```


| Parametro | Descrizione |
| --- | --- |
| TTo | Tipo [Exception](../exception/) di destinazione. |
| TFrom | Tipo [Exception](../exception/) di origine. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | const TFrom\& | Puntatore di origine. |

### ReturnValue

Risultato del cast se il cast è consentito, altrimenti nullptr.

## Deprecated
Mantenuto per compatibilità retroattiva. Usa AsCast invece.

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast_noexcept(SmartPtr\<TFrom\> const\&) method


Esegue cast statico su oggetti [SmartPtr](../smartptr/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::StaticCast_noexcept(SmartPtr<TFrom> const &obj)
```


| Parametro | Descrizione |
| --- | --- |
| TTo | Tipo dell'oggetto puntato di destinazione. |
| TFrom | Tipo dell'oggetto puntato di origine. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | Puntatore di origine. |

### ReturnValue

Risultato del cast se il cast è consentito, altrimenti nullptr.

## Deprecated
Mantenuto per compatibilità retroattiva. Usa AsCast invece.

## Vedi anche

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast_noexcept(SmartPtr\<TFrom\>) method


Esegue cast statico su oggetti Object a oggetti [Exception](../exception/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_same<System::Object, TFrom>::value &&IsExceptionWrapper<TTo>::value, TTo>::type System::StaticCast_noexcept(SmartPtr<TFrom> obj) noexcept
```


| Parametro | Descrizione |
| --- | --- |
| TTo | Tipo [Exception](../exception/) di destinazione. |
| TFrom | Tipo [Object](../object/). |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> | Puntatore di origine. |

### ReturnValue

Risultato del cast se il cast è consentito, altrimenti nullptr.

## Deprecated
Mantenuto per compatibilità retroattiva. Usa AsCast invece.

## Vedi anche

* Class [Object](../object/)
* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast_noexcept(WeakPtr\<TFrom\> const\&) method


Esegue cast statico su oggetti [WeakPtr](../weakptr/).

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::StaticCast_noexcept(WeakPtr<TFrom> const &obj)
```


| Parametro | Descrizione |
| --- | --- |
| TTo | Tipo dell'oggetto puntato di destinazione. |
| TFrom | Tipo dell'oggetto puntato di origine. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | WeakPtr\<TFrom\> const\& | Puntatore di origine. |

### ReturnValue

Risultato del cast se il cast è consentito, altrimenti nullptr.

## Deprecated
Mantenuto per compatibilità retroattiva. Usa AsCast invece.

## Vedi anche

* Class [WeakPtr](../weakptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
