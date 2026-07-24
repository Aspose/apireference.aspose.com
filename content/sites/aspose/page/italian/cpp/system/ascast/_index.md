---
title: "Metodo System::AsCast"
linktitle: "AsCast"
second_title: "Aspose.Page per C++"
description: "Metodo System::AsCast. Converte il tipo di origine nel tipo di risultato usando il cast con operatore ''as''. Usato quando è necessario un cast semplice simile a un costruttore in C++."
type: docs
weight: 13500
url: /it/cpp/system/ascast/
---
## System::AsCast(const Source\&) method


Converte il tipo di origine nel tipo di risultato usando il cast con operatore 'as'. Usato quando è necessario un cast semplice simile a un costruttore.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Static, Result> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


Esegue il cast del tipo di origine al tipo di risultato usando l'operatore di cast 'as'. Utilizzato quando il tipo di origine e il tipo di risultato sono gli stessi.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::None, Result> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


Esegue il cast del tipo di origine al tipo di risultato usando l'operatore di cast 'as'. Utilizzato per i wrapper di eccezione.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Exception, Result> System::AsCast(const Source &value)
```


| Parametro | Descrizione |
| --- | --- |
| Origine | Il tipo di origine. |
| Result | Il tipo di risultato. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) da convertire. |

### ReturnValue

Il risultato del cast. Restituisce nullptr se non è disponibile alcuna conversione.

## Vedi anche

* Typedef [Exception](../exception/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


Esegue il cast del tipo di origine al tipo di risultato usando l'operatore di cast 'as'. Utilizzato per il cast di un oggetto a eccezione.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::ObjectToException, Result> System::AsCast(const Source &value)
```


| Parametro | Descrizione |
| --- | --- |
| Origine | Il tipo di origine. |
| Result | Il tipo di risultato. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) da convertire. |

### ReturnValue

Il risultato del cast. Restituisce nullptr se non è disponibile alcuna conversione.

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


Esegue il cast del tipo di origine al tipo di risultato usando l'operatore di cast 'as'. Utilizzato quando sia l'origine sia il risultato sono smart pointer.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Pointer, typename CastResult<Result>::type> System::AsCast(const Source &value)
```


| Parametro | Descrizione |
| --- | --- |
| Origine | Il tipo di origine. |
| Result | Il tipo di risultato. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) da convertire. |

### ReturnValue

Il risultato del cast. Restituisce nullptr se non è disponibile alcuna conversione.

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


Esegue il cast del tipo di origine al tipo di risultato usando l'operatore di cast 'as'. Utilizzato quando sia l'origine sia il risultato sono smart pointer (con [SmartPtr<...>](../smartptr/) esplicito nel tipo di risultato).

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::PointerToPointer, Result> System::AsCast(const Source &value)
```


| Parametro | Descrizione |
| --- | --- |
| Origine | Il tipo di origine. |
| Result | Il tipo di risultato. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) da convertire. |

### ReturnValue

Il risultato del cast. Restituisce nullptr se non è disponibile alcuna conversione.

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


Esegue il cast del tipo di origine al tipo di risultato usando l'operatore di cast 'as'. Utilizzato per l'unboxing di un oggetto a nullable.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::UnboxingToNullable, Result> System::AsCast(const Source &value)
```


| Parametro | Descrizione |
| --- | --- |
| Origine | Il tipo di origine. |
| Result | Il tipo di risultato. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) da convertire. |

### ReturnValue

Il risultato del cast. Restituisce un nullable vuoto se non è disponibile alcuna conversione.

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


Esegue il cast del tipo di origine al tipo di risultato usando l'operatore di cast 'as'. Unboxing non valido a tipo non oggetto.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InterfaceUnboxingToNullable, Result> System::AsCast(const Source &value)
```


| Parametro | Descrizione |
| --- | --- |
| Origine | Il tipo di origine. |
| Result | Il tipo di risultato. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) da convertire. |

### ReturnValue

Restituisce sempre null.

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


Unboxing non valido a tipo non oggetto.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InvalidUnboxing, Result> System::AsCast(const Source &value)
```


| Parametro | Descrizione |
| --- | --- |
| Origine | Il tipo di origine. |
| Result | Il tipo di risultato. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) da convertire. |

### ReturnValue

Restituisce sempre null.

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


Esegue il cast del tipo di origine al tipo di risultato usando l'operatore di cast 'as'. Utilizzato per il boxing di un oggetto nullable.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::NullableBoxing, Result> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


Esegue il cast del tipo di origine al tipo di risultato usando l'operatore di cast 'as'. Utilizzato per il boxing di un oggetto comune.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InterfaceBoxing, typename CastResult<Result>::type> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


Esegue il cast del tipo di origine al tipo di risultato usando l'operatore di cast 'as'. Utilizzato per il boxing di un oggetto comune.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Boxing, typename CastResult<Result>::type> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


Esegue il cast del tipo di origine al tipo di risultato usando l'operatore di cast 'as'. Utilizzato per l'unboxing di stringhe.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::UnboxingToString, Result> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


Esegue il cast del tipo di origine al tipo di risultato usando l'operatore di cast 'as'. Utilizzato per il cast di nullptr.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Null, typename CastResult<Result>::type> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


Esegue il cast del tipo di origine al tipo di risultato usando l'operatore di cast 'as'. Utilizzato per il cast tra array.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Array, typename CastResult<Result>::type> System::AsCast(const Source &value)
```


| Parametro | Descrizione |
| --- | --- |
| Origine | Il tipo di origine. |
| Result | Il tipo di risultato. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) da convertire. |

### ReturnValue

Il risultato del cast. Restituisce nullptr se non è disponibile alcuna conversione per alcun elemento dell'array.

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
