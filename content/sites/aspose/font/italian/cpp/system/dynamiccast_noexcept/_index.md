---
title: "metodo System::DynamicCast_noexcept"
linktitle: "CastDinamico_noexcept"
second_title: "Aspose.Font per C++"
description: "metodo System::DynamicCast_noexcept. Cast obsoleti vecchi. Verrà rimosso nelle versioni future di C++."
type: docs
weight: 17700
url: /it/cpp/system/dynamiccast_noexcept/
---
## System::DynamicCast_noexcept(const TFrom\&) method


Vecchi cast obsoleti. Verranno rimossi nelle versioni future.

```cpp
template<typename TTo,typename TFrom> std::enable_if<IsExceptionWrapper<TFrom>::value &&IsExceptionWrapper<TTo>::value &&(std::is_convertible<TTo, TFrom>::value||std::is_base_of<TTo, TFrom>::value), TTo>::type System::DynamicCast_noexcept(const TFrom &obj) noexcept
```


| Parametro | Descrizione |
| --- | --- |
| TTo | Tipo di destinazione [Exception](../exception/). |
| TFrom | Tipo di origine [Exception](../exception/). |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | const TFrom\& | Puntatore di origine. |

### ReturnValue

Risultato del cast se il cast è consentito o nullptr altrimenti.
## Osservazioni


Esegue cast dinamico su oggetti [Exception](../exception/). ## Deprecated
Mantenuto per compatibilità retroattiva. Usa AsCast invece.

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::DynamicCast_noexcept(SmartPtr\<TFrom\> const\&) method


Esegue cast dinamico su oggetti [SmartPtr](../smartptr/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::DynamicCast_noexcept(SmartPtr<TFrom> const &obj) noexcept
```


| Parametro | Descrizione |
| --- | --- |
| TTo | Tipo di puntatore di destinazione. |
| TFrom | Tipo di puntatore di origine. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | Puntatore di origine. |

### ReturnValue

Risultato del cast se il cast è consentito o nullptr altrimenti.

## Deprecated
Mantenuto per compatibilità retroattiva. Usa AsCast invece.

## Vedi anche

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::DynamicCast_noexcept(SmartPtr\<TFrom\>) method


Esegue cast dinamico su oggetti verso oggetti [Exception](../exception/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_same<System::Object, TFrom>::value &&IsExceptionWrapper<TTo>::value, TTo>::type System::DynamicCast_noexcept(SmartPtr<TFrom> obj) noexcept
```


| Parametro | Descrizione |
| --- | --- |
| TTo | Tipo di destinazione [Exception](../exception/). |
| TFrom | Tipo [Object](../object/). |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> | Puntatore di origine. |

### ReturnValue

Risultato del cast se il cast è consentito o nullptr altrimenti.

## Deprecated
Mantenuto per compatibilità retroattiva. Usa AsCast invece.

## Vedi anche

* Class [Object](../object/)
* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
