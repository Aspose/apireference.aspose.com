---
title: "Metodo System::DynamicCast"
linktitle: "CastDinamico"
second_title: "Aspose.Font per C++"
description: "Metodo System::DynamicCast. Esegue il cast dinamico su oggetti Exception in C++."
type: docs
weight: 17000
url: /it/cpp/system/dynamiccast/
---
## System::DynamicCast(const TFrom\&) method


Esegue il cast dinamico su oggetti [Exception](../exception/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<IsExceptionWrapper<TFrom>::value &&IsExceptionWrapper<TTo>::value &&(std::is_convertible<TTo, TFrom>::value||std::is_base_of<TTo, TFrom>::value), TTo>::type System::DynamicCast(const TFrom &obj)
```


| Parametro | Descrizione |
| --- | --- |
| TTo | Tipo di destinazione [Exception](../exception/). |
| TFrom | Tipo di origine [Exception](../exception/). |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | const TFrom\& | Puntatore di origine. |

### ReturnValue

Risultato del cast se il cast è consentito.

## Deprecated
Mantenuto per compatibilità retroattiva. Usa ExplicitCast invece.

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::DynamicCast(SmartPtr\<TFrom\> const\&) method


Esegue cast dinamico su oggetti [SmartPtr](../smartptr/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<!std::is_enum<TTo>::value &&!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::DynamicCast(SmartPtr<TFrom> const &obj)
```


| Parametro | Descrizione |
| --- | --- |
| TTo | Tipo di puntatore di destinazione. |
| TFrom | Tipo di puntatore di origine. |

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
* Library [Aspose.Font for C++](../../)
## System::DynamicCast(SmartPtr\<TFrom\>) method


Estrae l'enumerazione incapsulata tramite cast.

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_enum<TTo>::value, TTo>::type System::DynamicCast(SmartPtr<TFrom> obj)
```


| Parametro | Descrizione |
| --- | --- |
| TTo | Tipo di enumerazione di destinazione. |
| TFrom | Tipo di puntatore di origine. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> | Puntatore all'oggetto da cui estrarre i dati. |

### ReturnValue

Valore enum non incapsulato.

## Deprecated
Mantenuto per compatibilità retroattiva. Usa ExplicitCast invece.

## Vedi anche

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::DynamicCast(SmartPtr\<TFrom\>) method


Esegue cast dinamico su oggetti verso oggetti [Exception](../exception/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_same<System::Object, TFrom>::value &&IsExceptionWrapper<TTo>::value, TTo>::type System::DynamicCast(SmartPtr<TFrom> obj)
```


| Parametro | Descrizione |
| --- | --- |
| TTo | Tipo di destinazione [Exception](../exception/). |
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
* Library [Aspose.Font for C++](../../)
## System::DynamicCast(std::nullptr_t) method


Esegue il cast dinamico di oggetti null.

```cpp
template<typename TTo> CastResult<TTo>::type System::DynamicCast(std::nullptr_t) noexcept
```


| Parametro | Descrizione |
| --- | --- |
| TTo | Tipo di puntatore di destinazione. |

### ReturnValue

nullptr.

## Deprecated
Mantenuto per compatibilità retroattiva. Usa ExplicitCast invece.

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::DynamicCast(TFrom\&) method


Esegue il cast dinamico su oggetti non puntatore.

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TFrom>::value &&!IsSmartPtr<TFrom>::value &&std::is_convertible<TTo, TFrom>::value, TTo>::type System::DynamicCast(TFrom &obj)
```


| Parametro | Descrizione |
| --- | --- |
| TTo | Tipo di destinazione. |
| TFrom | Tipo di origine. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | TFrom\& | Oggetto di origine. |

### ReturnValue

Risultato del cast.

## Deprecated
Mantenuto per compatibilità retroattiva. Usa ExplicitCast invece.

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::DynamicCast(TFrom) method


Esegue il cast dinamico da IntPtr a puntatore.

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_pointer<TTo>::value &&std::is_same<IntPtr, TFrom>::value, TTo>::type System::DynamicCast(TFrom value) noexcept
```


| Parametro | Descrizione |
| --- | --- |
| TTo | Tipo di destinazione. |
| TFrom | Tipo di origine. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | TFrom | Valore IntPtr di origine. |

### ReturnValue

Risultato del cast.

## Deprecated
Mantenuto per compatibilità retroattiva. Usa ExplicitCast invece.

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
