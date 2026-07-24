---
title: "System::StaticCast metodo"
linktitle: "StaticCast"
second_title: "Aspose.Page per C++"
description: "System::StaticCast metodo. Esegue cast statico su oggetti non puntatore in C++."
type: docs
weight: 38500
url: /it/cpp/system/staticcast/
---
## System::StaticCast(const TFrom\&) method


Esegue cast statico su oggetti non puntatore.

```cpp
template<typename TTo,typename TFrom> std::enable_if<!std::is_same<TFrom, System::String>::value &&!IsExceptionWrapper<TFrom>::value &&!IsSmartPtr<TFrom>::value &&!std::is_arithmetic<TFrom>::value, TTo>::type System::StaticCast(const TFrom &obj)
```


| Parametro | Descrizione |
| --- | --- |
| TTo | Tipo di destinazione. |
| TFrom | Tipo di origine. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | const TFrom\& | Oggetto di origine. |

### ReturnValue

Risultato del cast se il cast è consentito.

## Deprecated
Mantenuto per compatibilità retroattiva. Usa ExplicitCast invece.

## Vedi anche

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(const TFrom\&) method


Esegue cast statico su oggetti [Exception](../exception/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<IsExceptionWrapper<TFrom>::value &&IsExceptionWrapper<TTo>::value &&(std::is_convertible<TTo, TFrom>::value||std::is_base_of<TTo, TFrom>::value), TTo>::type System::StaticCast(const TFrom &obj)
```


| Parametro | Descrizione |
| --- | --- |
| TTo | Tipo [Exception](../exception/) di destinazione. |
| TFrom | Tipo [Exception](../exception/) di origine. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | const TFrom\& | Puntatore di origine. |

### ReturnValue

Risultato del cast se il cast è consentito.

## Deprecated
Mantenuto per compatibilità retroattiva. Usa ExplicitCast invece.

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(const TFrom *) method


Specializzazione per tipi aritmetici.

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_arithmetic<TFrom>::value, TTo>::type System::StaticCast(const TFrom *value)
```

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(SmartPtr\<TFrom\> const\&) method


Esegue cast statico su oggetti [SmartPtr](../smartptr/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::StaticCast(SmartPtr<TFrom> const &obj)
```


| Parametro | Descrizione |
| --- | --- |
| TTo | Tipo dell'oggetto puntato di destinazione. |
| TFrom | Tipo dell'oggetto puntato di origine. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | Puntatore di origine. |

### ReturnValue

Risultato del cast se il cast è consentito.

## Deprecated
Mantenuto per compatibilità retroattiva. Usa ExplicitCast invece.

## Vedi anche

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(SmartPtr\<TFrom\>) method


Esegue cast statico su oggetti Object a oggetti [Exception](../exception/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_same<System::Object, TFrom>::value &&IsExceptionWrapper<TTo>::value, TTo>::type System::StaticCast(SmartPtr<TFrom> obj) noexcept
```


| Parametro | Descrizione |
| --- | --- |
| TTo | Tipo [Exception](../exception/) di destinazione. |
| TFrom | Tipo [Object](../object/). |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> | Puntatore di origine. |

### ReturnValue

Risultato del cast se il cast è consentito.

## Deprecated
Mantenuto per compatibilità retroattiva. Usa ExplicitCast invece.

## Vedi anche

* Class [Object](../object/)
* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(std::nullptr_t) method


Esegue cast statico di oggetti null.

```cpp
template<typename TTo> CastResult<TTo>::type System::StaticCast(std::nullptr_t)
```


| Parametro | Descrizione |
| --- | --- |
| TTo | Tipo dell'oggetto puntato di destinazione. |

### ReturnValue

nullptr.

## Deprecated
Mantenuto per compatibilità retroattiva. Usa ExplicitCast invece.

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(TFrom) method


Specializzazione per tipi aritmetici.

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_arithmetic<TFrom>::value, TTo>::type System::StaticCast(TFrom value)
```

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(TTo) method


Processa il cast da [String](../string/) a [String](../string/).

```cpp
template<typename TTo> std::enable_if<std::is_same<TTo, System::String>::value, TTo>::type System::StaticCast(TTo value)
```

## Vedi anche

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(WeakPtr\<TFrom\> const\&) method


Esegue cast statico su oggetti [WeakPtr](../weakptr/).

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::StaticCast(WeakPtr<TFrom> const &obj)
```


| Parametro | Descrizione |
| --- | --- |
| TTo | Tipo dell'oggetto puntato di destinazione. |
| TFrom | Tipo dell'oggetto puntato di origine. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | WeakPtr\<TFrom\> const\& | Puntatore di origine. |

### ReturnValue

Risultato del cast se il cast è consentito.

## Deprecated
Mantenuto per compatibilità retroattiva. Usa ExplicitCast invece.

## Vedi anche

* Class [WeakPtr](../weakptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
