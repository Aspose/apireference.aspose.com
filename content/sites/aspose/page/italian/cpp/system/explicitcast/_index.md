---
title: "Metodo System::ExplicitCast"
linktitle: "ConversioneEsplicita"
second_title: "Aspose.Page per C++"
description: "Metodo System::ExplicitCast. Converte il tipo di origine nel tipo di risultato usando un cast esplicito. Utilizzato quando i tipi di origine e di risultato sono gli stessi in C++."
type: docs
weight: 18500
url: /it/cpp/system/explicitcast/
---
## System::ExplicitCast(const Source\&) method


Converte il tipo di origine nel tipo di risultato usando un cast esplicito. Utilizzato quando i tipi di origine e di risultato sono gli stessi.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::None, Result> System::ExplicitCast(const Source &value)
```


| Parametro | Descrizione |
| --- | --- |
| Origine | Il tipo di origine. |
| Result | Il tipo di risultato. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) da convertire. |

### ReturnValue

Il risultato del cast.

## Vedi anche

* Enum [Base64FormattingOptions](../base64formattingoptions/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Converte il tipo di origine nel tipo di risultato usando un cast esplicito. Utilizzato quando è necessario un cast semplice simile a un costruttore.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Static, Result> System::ExplicitCast(const Source &value)
```


| Parametro | Descrizione |
| --- | --- |
| Origine | Il tipo di origine. |
| Result | Il tipo di risultato. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) da convertire. |

### ReturnValue

Il risultato del cast.

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Converte il tipo di origine nel tipo di risultato usando un cast esplicito. Utilizzato per wrapper di eccezioni.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Exception, Result> System::ExplicitCast(const Source &value)
```


| Parametro | Descrizione |
| --- | --- |
| Origine | Il tipo di origine. |
| Result | Il tipo di risultato. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) da convertire. |

### ReturnValue

Il risultato del cast.

## Vedi anche

* Typedef [Exception](../exception/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Converte il tipo di origine nel tipo di risultato usando un cast esplicito. Utilizzato per convertire un oggetto in eccezione.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::ObjectToException, Result> System::ExplicitCast(const Source &value)
```


| Parametro | Descrizione |
| --- | --- |
| Origine | Il tipo di origine. |
| Result | Il tipo di risultato. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) da convertire. |

### ReturnValue

Il risultato del cast.

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Converte il tipo di origine nel tipo di risultato usando un cast esplicito. Utilizzato quando sia l'origine sia il risultato sono smart pointer (senza [SmartPtr<...>](../smartptr/) esplicito nel tipo di risultato).

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Pointer, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Parametro | Descrizione |
| --- | --- |
| Origine | Il tipo di origine. |
| Result | Il tipo di risultato. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) da convertire. |

### ReturnValue

Il risultato del cast.

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Converte il tipo di origine nel tipo di risultato usando un cast esplicito. Utilizzato quando sia l'origine sia il risultato sono smart pointer (con [SmartPtr<...>](../smartptr/) esplicito nel tipo di risultato).

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::PointerToPointer, Result> System::ExplicitCast(const Source &value)
```


| Parametro | Descrizione |
| --- | --- |
| Origine | Il tipo di origine. |
| Result | Il tipo di risultato. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) da convertire. |

### ReturnValue

Il risultato del cast.

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Converte il tipo di origine nel tipo di risultato usando un cast esplicito. Utilizzato per il unboxing di un oggetto in nullable.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::UnboxingToNullable, Result> System::ExplicitCast(const Source &value)
```


| Parametro | Descrizione |
| --- | --- |
| Origine | Il tipo di origine. |
| Result | Il tipo di risultato. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) da convertire. |

### ReturnValue

Il risultato del cast.

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Converte il tipo di origine nel tipo di risultato usando un cast esplicito. Utilizzato per il boxing di nullable.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::NullableBoxing, Result> System::ExplicitCast(const Source &value)
```


| Parametro | Descrizione |
| --- | --- |
| Origine | Il tipo di origine. |
| Result | Il tipo di risultato. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) da convertire. |

### ReturnValue

Il risultato del cast.

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Converte il tipo di origine nel tipo di risultato usando un cast esplicito. Utilizzato per il unboxing di un oggetto nullable.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::NullableUnboxing, Result> System::ExplicitCast(const Source &value)
```


| Parametro | Descrizione |
| --- | --- |
| Origine | Il tipo di origine. |
| Result | Il tipo di risultato. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) da convertire. |

### ReturnValue

Il risultato del cast.

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Converte il tipo di origine nel tipo di risultato usando un cast esplicito. Utilizzato per il boxing di enum.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::EnumBoxing, SmartPtr<BoxedValueBase>> System::ExplicitCast(const Source &value)
```


| Parametro | Descrizione |
| --- | --- |
| Origine | Il tipo di origine. |
| Result | Il tipo di risultato. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) da convertire. |

### ReturnValue

Il risultato del cast.

## Vedi anche

* Class [SmartPtr](../smartptr/)
* Class [BoxedValueBase](../boxedvaluebase/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Converte il tipo di origine nel tipo di risultato usando un cast esplicito. Utilizzato per copiare i tipi valore sull'heap quando il tipo valore deve essere referenziato come smart pointer (in generici vincolati a un tipo interfaccia ma specializzati con una struttura che implementa questa interfaccia).

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::HeapifyBoxing, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Parametro | Descrizione |
| --- | --- |
| Origine | Il tipo di origine. |
| Result | Il tipo di risultato. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) da convertire. |

### ReturnValue

Il risultato del cast.

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Converte il tipo di origine nel tipo di risultato usando un cast esplicito. Utilizzato per ottenere interfacce da tipi valore.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InterfaceBoxing, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Parametro | Descrizione |
| --- | --- |
| Origine | Il tipo di origine. |
| Result | Il tipo di risultato. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) da convertire. |

### ReturnValue

Il risultato del cast.

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Converte il tipo di origine nel tipo di risultato usando un cast esplicito. Utilizzato per il boxing comune.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Boxing, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Parametro | Descrizione |
| --- | --- |
| Origine | Il tipo di origine. |
| Result | Il tipo di risultato. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) da convertire. |

### ReturnValue

Il risultato del cast.

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Converte il tipo di origine nel tipo di risultato usando un cast esplicito. Utilizzato per il boxing di [System::String](../string/).

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::StringBoxing, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Parametro | Descrizione |
| --- | --- |
| Origine | Il tipo di origine. |
| Result | Il tipo di risultato. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) da convertire. |

### ReturnValue

Il risultato del cast.

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Converte il tipo di origine nel tipo di risultato usando un cast esplicito. Utilizzato per il unboxing di interfacce.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InterfaceUnboxing, Result> System::ExplicitCast(const Source &value)
```


| Parametro | Descrizione |
| --- | --- |
| Origine | Il tipo di origine. |
| Result | Il tipo di risultato. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) da convertire. |

### ReturnValue

Il risultato del cast.

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Converte il tipo di origine nel tipo di risultato usando un cast esplicito. Utilizzato per il unboxing comune.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Unboxing, Result> System::ExplicitCast(const Source &value)
```


| Parametro | Descrizione |
| --- | --- |
| Origine | Il tipo di origine. |
| Result | Il tipo di risultato. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) da convertire. |

### ReturnValue

Il risultato del cast.

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Converte il tipo di origine nel tipo di risultato usando un cast esplicito. Utilizzato per il cast di nullptr.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Null, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Parametro | Descrizione |
| --- | --- |
| Origine | Il tipo di origine. |
| Result | Il tipo di risultato. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) da convertire. |

### ReturnValue

Il risultato del cast.

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Converte il tipo di origine nel tipo di risultato usando un cast esplicito. Utilizzato per il cast tra array.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Array, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Parametro | Descrizione |
| --- | --- |
| Origine | Il tipo di origine. |
| Result | Il tipo di risultato. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) da convertire. |

### ReturnValue

Il risultato del cast.

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(Source) method


Converte il tipo di origine nel tipo di risultato usando un cast esplicito. Utilizzato quando si converte un puntatore grezzo in smart pointer.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::RawPointer, typename CastResult<std::remove_pointer_t<Result>>::type> System::ExplicitCast(Source value)
```


| Parametro | Descrizione |
| --- | --- |
| Origine | Il tipo di origine. |
| Result | Il tipo di risultato. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | Source | [Object](../object/) da convertire. |

### ReturnValue

Il risultato del cast.

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
