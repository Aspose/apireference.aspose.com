---
title: "System::ExplicitCast-metod"
linktitle: "ExplicitKast"
second_title: "Aspose.Page för C++"
description: "System::ExplicitCast-metod. Kastar källtypen till resultattypen med explicit kast. Används när käll- och resultattyperna är desamma i C++."
type: docs
weight: 18500
url: /sv/cpp/system/explicitcast/
---
## System::ExplicitCast(const Source\&) method


Kastar källtypen till resultattypen med explicit kast. Används när käll- och resultattyperna är desamma.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::None, Result> System::ExplicitCast(const Source &value)
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
## System::ExplicitCast(const Source\&) method


Kastar källtypen till resultattypen med explicit kast. Används när ett enkelt konstruktorlikt kast behövs.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Static, Result> System::ExplicitCast(const Source &value)
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
## System::ExplicitCast(const Source\&) method


Kastar källtypen till resultattypen med explicit kast. Används för undantagsomslag.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Exception, Result> System::ExplicitCast(const Source &value)
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

* Typedef [Exception](../exception/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Kastar källtypen till resultattypen med explicit kast. Används för att kasta objekt till undantag.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::ObjectToException, Result> System::ExplicitCast(const Source &value)
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
## System::ExplicitCast(const Source\&) method


Kastar källtypen till resultattypen med explicit kast. Används när både käll- och resultattypen är smarta pekare (utan expicit [SmartPtr<...>](../smartptr/) i resultattypen).

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Pointer, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
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
## System::ExplicitCast(const Source\&) method


Kastar källtypen till resultattypen med explicit kast. Används när både käll- och resultattypen är smarta pekare (med expicit [SmartPtr<...>](../smartptr/) i resultattypen).

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::PointerToPointer, Result> System::ExplicitCast(const Source &value)
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
## System::ExplicitCast(const Source\&) method


Kastar källtypen till resultattypen med explicit kast. Används för att packa upp objekt till nullable.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::UnboxingToNullable, Result> System::ExplicitCast(const Source &value)
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
## System::ExplicitCast(const Source\&) method


Kastar källtypen till resultattypen med explicit kast. Används för att boxa nullable.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::NullableBoxing, Result> System::ExplicitCast(const Source &value)
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
## System::ExplicitCast(const Source\&) method


Kastar källtypen till resultattypen med explicit kast. Används för att packa upp nullable-objekt.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::NullableUnboxing, Result> System::ExplicitCast(const Source &value)
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
## System::ExplicitCast(const Source\&) method


Kastar källtypen till resultattypen med explicit kast. Används för enum-boxning.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::EnumBoxing, SmartPtr<BoxedValueBase>> System::ExplicitCast(const Source &value)
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

* Class [SmartPtr](../smartptr/)
* Class [BoxedValueBase](../boxedvaluebase/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Kastar källtypen till resultattypen med explicit kast. Används för att kopiera värdetyper till heapen när värdetypen ska refereras som smart pekare (i generiska typer begränsade med gränssnittstyp men specialiserade med struktur som implementerar detta gränssnitt).

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::HeapifyBoxing, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
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
## System::ExplicitCast(const Source\&) method


Kastar källtypen till resultattypen med explicit kast. Används för att hämta gränssnitt från värdetyper.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InterfaceBoxing, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
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
## System::ExplicitCast(const Source\&) method


Kastar källtypen till resultattypen med explicit kast. Används för vanlig boxning.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Boxing, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
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
## System::ExplicitCast(const Source\&) method


Kastar källtypen till resultattypen med explicit kast. Används för [System::String](../string/) boxning.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::StringBoxing, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
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
## System::ExplicitCast(const Source\&) method


Kastar källtypen till resultattypen med explicit kast. Används för att packa upp gränssnitt.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InterfaceUnboxing, Result> System::ExplicitCast(const Source &value)
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
## System::ExplicitCast(const Source\&) method


Kastar källtypen till resultattypen med explicit kast. Används för vanlig uppackning.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Unboxing, Result> System::ExplicitCast(const Source &value)
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
## System::ExplicitCast(const Source\&) method


Kastar källtypen till resultattypen med explicit kast. Används för nullptr-kast.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Null, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
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
## System::ExplicitCast(const Source\&) method


Kastar källtypen till resultattypen med explicit kast. Används för kast mellan arrayer.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Array, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
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
## System::ExplicitCast(Source) method


Kastar källtypen till resultattypen med explicit kast. Används när råpekare kastas till smart pekare.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::RawPointer, typename CastResult<std::remove_pointer_t<Result>>::type> System::ExplicitCast(Source value)
```


| Parameter | Beskrivning |
| --- | --- |
| Källa | Källtypen. |
| Result | Resultattypen. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| value | Source | [Object](../object/) att kasta. |

### ReturnValue

Kastresultatet.

## Se även

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
