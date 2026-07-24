---
title: "System::AsCast‑metod"
linktitle: "AsCast"
second_title: "Aspose.Page för C++"
description: "System::AsCast‑metod. Kastar källtypen till resultattypen med hjälp av ''as''‑operatorn. Används när en enkel konstruktorliknande typkonvertering behövs i C++."
type: docs
weight: 13500
url: /sv/cpp/system/ascast/
---
## System::AsCast(const Source\&) method


Kastar källtypen till resultattypen med hjälp av 'as'‑operatorn. Används när en enkel konstruktorliknande typkonvertering behövs.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Static, Result> System::AsCast(const Source &value)
```


| Parameter | Beskrivning |
| --- | --- |
| Källa | Källtypen. |
| Result | Resultattypen. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) att kasta. |

### ReturnValue

Kastresultatet.

## Se även

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


Kastar källtypen till resultattypen med 'as'-operatorn. Används när käll- och resultattyperna är desamma.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::None, Result> System::AsCast(const Source &value)
```


| Parameter | Beskrivning |
| --- | --- |
| Källa | Källtypen. |
| Result | Resultattypen. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) att kasta. |

### ReturnValue

Kastresultatet.

## Se även

* Enum [Base64FormattingOptions](../base64formattingoptions/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


Kastar källtypen till resultattypen med 'as'-operatorn. Används för undantagsomslag.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Exception, Result> System::AsCast(const Source &value)
```


| Parameter | Beskrivning |
| --- | --- |
| Källa | Källtypen. |
| Result | Resultattypen. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) att kasta. |

### ReturnValue

Kastresultatet. Returnerar nullptr om ingen konvertering är tillgänglig.

## Se även

* Typedef [Exception](../exception/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


Kastar källtypen till resultattypen med 'as'-operatorn. Används för att kasta objekt till undantag.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::ObjectToException, Result> System::AsCast(const Source &value)
```


| Parameter | Beskrivning |
| --- | --- |
| Källa | Källtypen. |
| Result | Resultattypen. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) att kasta. |

### ReturnValue

Kastresultatet. Returnerar nullptr om ingen konvertering är tillgänglig.

## Se även

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


Kastar källtypen till resultattypen med 'as'-operatorn. Används när både källan och resultatet är smarta pekare.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Pointer, typename CastResult<Result>::type> System::AsCast(const Source &value)
```


| Parameter | Beskrivning |
| --- | --- |
| Källa | Källtypen. |
| Result | Resultattypen. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) att kasta. |

### ReturnValue

Kastresultatet. Returnerar nullptr om ingen konvertering är tillgänglig.

## Se även

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


Kastar källtypen till resultattypen med 'as'-operatorn. Används när både källan och resultatet är smarta pekare (med explicit [SmartPtr<...>](../smartptr/) i resultattypen).

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::PointerToPointer, Result> System::AsCast(const Source &value)
```


| Parameter | Beskrivning |
| --- | --- |
| Källa | Källtypen. |
| Result | Resultattypen. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) att kasta. |

### ReturnValue

Kastresultatet. Returnerar nullptr om ingen konvertering är tillgänglig.

## Se även

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


Kastar källtypen till resultattypen med 'as'-operatorn. Används för att packa upp objekt till nullable.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::UnboxingToNullable, Result> System::AsCast(const Source &value)
```


| Parameter | Beskrivning |
| --- | --- |
| Källa | Källtypen. |
| Result | Resultattypen. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) att kasta. |

### ReturnValue

Kastresultatet. Returnerar tom nullable om ingen konvertering är tillgänglig.

## Se även

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


Kastar källtypen till resultattypen med 'as'-operatorn. Ogiltig uppackning till icke-objekttyp.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InterfaceUnboxingToNullable, Result> System::AsCast(const Source &value)
```


| Parameter | Beskrivning |
| --- | --- |
| Källa | Källtypen. |
| Result | Resultattypen. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) att kasta. |

### ReturnValue

Returnerar alltid null.

## Se även

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


Ogiltig uppackning till icke-objekttyp.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InvalidUnboxing, Result> System::AsCast(const Source &value)
```


| Parameter | Beskrivning |
| --- | --- |
| Källa | Källtypen. |
| Result | Resultattypen. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) att kasta. |

### ReturnValue

Returnerar alltid null.

## Se även

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


Kastar källtypen till resultattypen med 'as'-operatorn. Används för att paketera nullable-objekt.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::NullableBoxing, Result> System::AsCast(const Source &value)
```


| Parameter | Beskrivning |
| --- | --- |
| Källa | Källtypen. |
| Result | Resultattypen. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) att kasta. |

### ReturnValue

Kastresultatet.

## Se även

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


Kastar källtypen till resultattypen med 'as'-operatorn. Används för att paketera vanligt objekt.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InterfaceBoxing, typename CastResult<Result>::type> System::AsCast(const Source &value)
```


| Parameter | Beskrivning |
| --- | --- |
| Källa | Källtypen. |
| Result | Resultattypen. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) att kasta. |

### ReturnValue

Kastresultatet.

## Se även

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


Kastar källtypen till resultattypen med 'as'-operatorn. Används för att paketera vanligt objekt.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Boxing, typename CastResult<Result>::type> System::AsCast(const Source &value)
```


| Parameter | Beskrivning |
| --- | --- |
| Källa | Källtypen. |
| Result | Resultattypen. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) att kasta. |

### ReturnValue

Kastresultatet.

## Se även

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


Kastar källtypen till resultattypen med 'as'-operatorn. Används för uppackning av sträng.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::UnboxingToString, Result> System::AsCast(const Source &value)
```


| Parameter | Beskrivning |
| --- | --- |
| Källa | Källtypen. |
| Result | Resultattypen. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) att kasta. |

### ReturnValue

Kastresultatet.

## Se även

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


Kastar källtypen till resultattypen med 'as'-operatorn. Används för nullptr-fall.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Null, typename CastResult<Result>::type> System::AsCast(const Source &value)
```


| Parameter | Beskrivning |
| --- | --- |
| Källa | Källtypen. |
| Result | Resultattypen. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) att kasta. |

### ReturnValue

Kastresultatet.

## Se även

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


Kastar källtypen till resultattypen med 'as'-operatorn. Används för att kasta mellan arrayer.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Array, typename CastResult<Result>::type> System::AsCast(const Source &value)
```


| Parameter | Beskrivning |
| --- | --- |
| Källa | Källtypen. |
| Result | Resultattypen. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) att kasta. |

### ReturnValue

Kastresultatet. Returnerar nullptr om ingen konvertering för någon arraymedlem är tillgänglig.

## Se även

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
