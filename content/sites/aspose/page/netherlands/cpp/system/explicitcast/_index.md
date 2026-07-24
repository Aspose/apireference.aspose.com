---
title: "System::ExplicitCast methode"
linktitle: "Expliciete cast"
second_title: "Aspose.Page voor C++"
description: "System::ExplicitCast methode. Casts het brontype naar het resultaattype met expliciete cast. Gebruikt wanneer het brontype en het resultaattype hetzelfde zijn in C++."
type: docs
weight: 18500
url: /nl/cpp/system/explicitcast/
---
## System::ExplicitCast(const Source\&) method


Casts het brontype naar het resultaattype met expliciete cast. Gebruikt wanneer het brontype en het resultaattype hetzelfde zijn.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::None, Result> System::ExplicitCast(const Source &value)
```


| Parameter | Beschrijving |
| --- | --- |
| Bron | Het brontype. |
| Result | Het resulttype. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) om te casten. |

### ReturnValue

Het castresultaat.

## Zie ook

* Enum [Base64FormattingOptions](../base64formattingoptions/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Casts het brontype naar het resultaattype met expliciete cast. Gebruikt wanneer een eenvoudige constructor-achtige cast nodig is.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Static, Result> System::ExplicitCast(const Source &value)
```


| Parameter | Beschrijving |
| --- | --- |
| Bron | Het brontype. |
| Result | Het resulttype. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) om te casten. |

### ReturnValue

Het castresultaat.

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Casts het brontype naar het resultaattype met expliciete cast. Gebruikt voor exceptiewrappers.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Exception, Result> System::ExplicitCast(const Source &value)
```


| Parameter | Beschrijving |
| --- | --- |
| Bron | Het brontype. |
| Result | Het resulttype. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) om te casten. |

### ReturnValue

Het castresultaat.

## Zie ook

* Typedef [Exception](../exception/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Casts het brontype naar het resultaattype met expliciete cast. Gebruikt voor het casten van een object naar een exceptie.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::ObjectToException, Result> System::ExplicitCast(const Source &value)
```


| Parameter | Beschrijving |
| --- | --- |
| Bron | Het brontype. |
| Result | Het resulttype. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) om te casten. |

### ReturnValue

Het castresultaat.

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Casts het brontype naar het resultaattype met expliciete cast. Gebruikt wanneer zowel de bron als het resultaat smart pointers zijn (zonder expicit [SmartPtr<...>](../smartptr/) in het resultaattype).

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Pointer, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Parameter | Beschrijving |
| --- | --- |
| Bron | Het brontype. |
| Result | Het resulttype. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) om te casten. |

### ReturnValue

Het castresultaat.

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Casts het brontype naar het resultaattype met expliciete cast. Gebruikt wanneer zowel de bron als het resultaat smart pointers zijn (met expicit [SmartPtr<...>](../smartptr/) in het resultaattype).

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::PointerToPointer, Result> System::ExplicitCast(const Source &value)
```


| Parameter | Beschrijving |
| --- | --- |
| Bron | Het brontype. |
| Result | Het resulttype. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) om te casten. |

### ReturnValue

Het castresultaat.

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Casts het brontype naar het resultaattype met expliciete cast. Gebruikt voor het unboxen van een object naar nullable.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::UnboxingToNullable, Result> System::ExplicitCast(const Source &value)
```


| Parameter | Beschrijving |
| --- | --- |
| Bron | Het brontype. |
| Result | Het resulttype. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) om te casten. |

### ReturnValue

Het castresultaat.

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Casts het brontype naar het resultaattype met expliciete cast. Gebruikt om nullable te boxen.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::NullableBoxing, Result> System::ExplicitCast(const Source &value)
```


| Parameter | Beschrijving |
| --- | --- |
| Bron | Het brontype. |
| Result | Het resulttype. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) om te casten. |

### ReturnValue

Het castresultaat.

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Casts het brontype naar het resultaattype met expliciete cast. Gebruikt voor het unboxen van een nullable object.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::NullableUnboxing, Result> System::ExplicitCast(const Source &value)
```


| Parameter | Beschrijving |
| --- | --- |
| Bron | Het brontype. |
| Result | Het resulttype. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) om te casten. |

### ReturnValue

Het castresultaat.

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Casts het brontype naar het resultaattype met expliciete cast. Gebruikt voor enum-boxing.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::EnumBoxing, SmartPtr<BoxedValueBase>> System::ExplicitCast(const Source &value)
```


| Parameter | Beschrijving |
| --- | --- |
| Bron | Het brontype. |
| Result | Het resulttype. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) om te casten. |

### ReturnValue

Het castresultaat.

## Zie ook

* Class [SmartPtr](../smartptr/)
* Class [BoxedValueBase](../boxedvaluebase/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Casts het brontype naar het resultaattype met expliciete cast. Gebruikt voor het kopiëren van waardetypen naar de heap wanneer een waardetype moet worden gerefereerd als smart pointer (in generics beperkt tot een interfacetype maar gespecificeerd met een structuur die dit interface implementeert).

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::HeapifyBoxing, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Parameter | Beschrijving |
| --- | --- |
| Bron | Het brontype. |
| Result | Het resulttype. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) om te casten. |

### ReturnValue

Het castresultaat.

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Casts het brontype naar het resultaattype met expliciete cast. Gebruikt om interfaces uit waardetypen te verkrijgen.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InterfaceBoxing, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Parameter | Beschrijving |
| --- | --- |
| Bron | Het brontype. |
| Result | Het resulttype. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) om te casten. |

### ReturnValue

Het castresultaat.

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Casts het brontype naar het resulttype met een expliciete cast. Gebruikt voor algemene boxing.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Boxing, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Parameter | Beschrijving |
| --- | --- |
| Bron | Het brontype. |
| Result | Het resulttype. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) om te casten. |

### ReturnValue

Het castresultaat.

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Casts het brontype naar het resulttype met een expliciete cast. Gebruikt voor [System::String](../string/) boxing.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::StringBoxing, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Parameter | Beschrijving |
| --- | --- |
| Bron | Het brontype. |
| Result | Het resulttype. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) om te casten. |

### ReturnValue

Het castresultaat.

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Casts het brontype naar het resulttype met een expliciete cast. Gebruikt voor het unboxen van interfaces.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InterfaceUnboxing, Result> System::ExplicitCast(const Source &value)
```


| Parameter | Beschrijving |
| --- | --- |
| Bron | Het brontype. |
| Result | Het resulttype. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) om te casten. |

### ReturnValue

Het castresultaat.

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Casts het brontype naar het resulttype met een expliciete cast. Gebruikt voor algemene unboxing.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Unboxing, Result> System::ExplicitCast(const Source &value)
```


| Parameter | Beschrijving |
| --- | --- |
| Bron | Het brontype. |
| Result | Het resulttype. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) om te casten. |

### ReturnValue

Het castresultaat.

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Casts het brontype naar het resulttype met een expliciete cast. Gebruikt voor nullptr-casting.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Null, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Parameter | Beschrijving |
| --- | --- |
| Bron | Het brontype. |
| Result | Het resulttype. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) om te casten. |

### ReturnValue

Het castresultaat.

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Casts het brontype naar het resulttype met een expliciete cast. Gebruikt voor casting tussen arrays.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Array, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Parameter | Beschrijving |
| --- | --- |
| Bron | Het brontype. |
| Result | Het resulttype. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) om te casten. |

### ReturnValue

Het castresultaat.

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(Source) method


Casts het brontype naar het resulttype met een expliciete cast. Gebruikt wanneer een ruwe pointer naar een slimme pointer wordt gecast.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::RawPointer, typename CastResult<std::remove_pointer_t<Result>>::type> System::ExplicitCast(Source value)
```


| Parameter | Beschrijving |
| --- | --- |
| Bron | Het brontype. |
| Result | Het resulttype. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | Source | [Object](../object/) om te casten. |

### ReturnValue

Het castresultaat.

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
