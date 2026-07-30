---
title: "Metodo System::AsCast"
linktitle: "AsCast"
second_title: "Aspose.Font per C++"
description: "Metodo System::AsCast. Converte il tipo di origine al tipo di risultato usando il cast dell'operatore ''as''. Utilizzato quando è necessario un cast semplice simile a un costruttore in C++."
type: docs
weight: 13600
url: /it/cpp/system/ascast/
---
## System::AsCast(const Source\&) method


Converte il tipo di origine al tipo di risultato usando il cast dell'operatore 'as'. Utilizzato quando è necessario un cast semplice simile a un costruttore.

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
* Library [Aspose.Font for C++](../../)
## System::AsCast(const Source\&) method


Converte il tipo di origine al tipo di risultato usando il cast dell'operatore 'as'. Utilizzato quando i tipi di origine e di risultato sono gli stessi.

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
* Library [Aspose.Font for C++](../../)
## System::AsCast(const Source\&) method


Converte il tipo di origine al tipo di risultato usando il cast dell'operatore 'as'. Utilizzato per i wrapper di eccezioni.

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
* Library [Aspose.Font for C++](../../)
## System::AsCast(const Source\&) method


Esegue il cast del tipo sorgente al tipo risultato usando l'operatore di cast 'as'. Utilizzato per convertire un oggetto in eccezione.

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
* Library [Aspose.Font for C++](../../)
## System::AsCast(const Source\&) method


Esegue il cast del tipo sorgente al tipo risultato usando l'operatore di cast 'as'. Utilizzato quando sia la sorgente sia il risultato sono puntatori intelligenti.

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
* Library [Aspose.Font for C++](../../)
## System::AsCast(const Source\&) method


Esegue il cast del tipo sorgente al tipo risultato usando l'operatore di cast 'as'. Utilizzato quando sia la sorgente sia il risultato sono puntatori intelligenti (con esplicito [SmartPtr<...>](../smartptr/) nel tipo risultato).

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
* Library [Aspose.Font for C++](../../)
## System::AsCast(const Source\&) method


Esegue il cast del tipo sorgente al tipo risultato usando l'operatore di cast 'as'. Utilizzato per l'unboxing di un oggetto in nullable.

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
* Library [Aspose.Font for C++](../../)
## System::AsCast(const Source\&) method


Esegue il cast del tipo sorgente al tipo risultato usando l'operatore di cast 'as'. Unboxing non valido verso un tipo non oggetto.

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
* Library [Aspose.Font for C++](../../)
## System::AsCast(const Source\&) method


Unboxing non valido verso un tipo non oggetto.

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
* Library [Aspose.Font for C++](../../)
## System::AsCast(const Source\&) method


Esegue il cast del tipo sorgente al tipo risultato usando l'operatore di cast 'as'. Utilizzato per il boxing di un oggetto nullable.

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
* Library [Aspose.Font for C++](../../)
## System::AsCast(const Source\&) method


Esegue il cast del tipo sorgente al tipo risultato usando l'operatore di cast 'as'. Utilizzato per il boxing di un oggetto comune.

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
* Library [Aspose.Font for C++](../../)
## System::AsCast(const Source\&) method


Esegue il cast del tipo sorgente al tipo risultato usando l'operatore di cast 'as'. Utilizzato per il boxing di un oggetto comune.

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
* Library [Aspose.Font for C++](../../)
## System::AsCast(const Source\&) method


Esegue il cast del tipo sorgente al tipo risultato usando l'operatore di cast 'as'. Utilizzato per l'unboxing di stringhe.

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
* Library [Aspose.Font for C++](../../)
## System::AsCast(const Source\&) method


Esegue il cast del tipo sorgente al tipo risultato usando l'operatore di cast 'as'. Utilizzato per il casting di nullptr.

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
* Library [Aspose.Font for C++](../../)
## System::AsCast(const Source\&) method


Esegue il cast del tipo sorgente al tipo risultato usando l'operatore di cast 'as'. Utilizzato per convertire tra array.

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
* Library [Aspose.Font for C++](../../)
