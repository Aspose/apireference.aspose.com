---
title: "System::AsCast methode"
linktitle: "AsCast"
second_title: "Aspose.Page voor C++"
description: "System::AsCast methode. Castt het brontype naar het resulttype met behulp van de ''as'' operator cast. Wordt gebruikt wanneer een eenvoudige constructor-achtige cast nodig is in C++."
type: docs
weight: 13500
url: /nl/cpp/system/ascast/
---
## System::AsCast(const Source\&) method


Castt het brontype naar het resulttype met behulp van de 'as' operator cast. Wordt gebruikt wanneer een eenvoudige constructor-achtige cast nodig is.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Static, Result> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


Castt het brontype naar het resulttype met behulp van de 'as' operator cast. Wordt gebruikt wanneer het bron- en resulttype hetzelfde zijn.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::None, Result> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


Castt het brontype naar het resulttype met behulp van de 'as' operator cast. Wordt gebruikt voor exceptie-wrappers.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Exception, Result> System::AsCast(const Source &value)
```


| Parameter | Beschrijving |
| --- | --- |
| Bron | Het brontype. |
| Result | Het resulttype. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) om te casten. |

### ReturnValue

Het castresultaat. Retourneert nullptr als er geen conversie beschikbaar is.

## Zie ook

* Typedef [Exception](../exception/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


Castt het brontype naar het resulttype met behulp van de 'as' operator cast. Wordt gebruikt voor het casten van een object naar een exceptie.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::ObjectToException, Result> System::AsCast(const Source &value)
```


| Parameter | Beschrijving |
| --- | --- |
| Bron | Het brontype. |
| Result | Het resulttype. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) om te casten. |

### ReturnValue

Het castresultaat. Retourneert nullptr als er geen conversie beschikbaar is.

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


Castt het brontype naar het resulttype met behulp van de 'as' operator cast. Wordt gebruikt wanneer zowel het bron- als het resulttype slimme pointers zijn.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Pointer, typename CastResult<Result>::type> System::AsCast(const Source &value)
```


| Parameter | Beschrijving |
| --- | --- |
| Bron | Het brontype. |
| Result | Het resulttype. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) om te casten. |

### ReturnValue

Het castresultaat. Retourneert nullptr als er geen conversie beschikbaar is.

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


Castt het brontype naar het resulttype met behulp van de 'as' operator cast. Wordt gebruikt wanneer zowel het bron- als het resulttype slimme pointers zijn (met expliciete [SmartPtr<...>](../smartptr/) in het resulttype).

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::PointerToPointer, Result> System::AsCast(const Source &value)
```


| Parameter | Beschrijving |
| --- | --- |
| Bron | Het brontype. |
| Result | Het resulttype. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) om te casten. |

### ReturnValue

Het castresultaat. Retourneert nullptr als er geen conversie beschikbaar is.

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


Castt het brontype naar het resulttype met behulp van de 'as' operator cast. Wordt gebruikt voor het unboxen van een object naar nullable.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::UnboxingToNullable, Result> System::AsCast(const Source &value)
```


| Parameter | Beschrijving |
| --- | --- |
| Bron | Het brontype. |
| Result | Het resulttype. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) om te casten. |

### ReturnValue

Het castresultaat. Retourneert een lege nullable als er geen conversie beschikbaar is.

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


Castt het brontype naar het resulttype met behulp van de 'as' operator cast. Ongeldig unboxing naar een niet-objecttype.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InterfaceUnboxingToNullable, Result> System::AsCast(const Source &value)
```


| Parameter | Beschrijving |
| --- | --- |
| Bron | Het brontype. |
| Result | Het resulttype. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) om te casten. |

### ReturnValue

Retourneert altijd null.

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


Ongeldig unboxing naar een niet-objecttype.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InvalidUnboxing, Result> System::AsCast(const Source &value)
```


| Parameter | Beschrijving |
| --- | --- |
| Bron | Het brontype. |
| Result | Het resulttype. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) om te casten. |

### ReturnValue

Retourneert altijd null.

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


Castt het brontype naar het resulttype met behulp van de 'as' operator cast. Wordt gebruikt voor het boxen van een nullable object.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::NullableBoxing, Result> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


Castt het brontype naar het resulttype met behulp van de 'as' operator cast. Wordt gebruikt voor het boxen van een algemeen object.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InterfaceBoxing, typename CastResult<Result>::type> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


Castt het brontype naar het resulttype met behulp van de 'as' operator cast. Wordt gebruikt voor het boxen van een algemeen object.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Boxing, typename CastResult<Result>::type> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


Cast het brontype naar het resulttype met behulp van een 'as' operator cast. Gebruikt voor het uitpakken van strings.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::UnboxingToString, Result> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


Cast het brontype naar het resulttype met behulp van een 'as' operator cast. Gebruikt voor nullptr-casting.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Null, typename CastResult<Result>::type> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


Cast het brontype naar het resulttype met behulp van een 'as' operator cast. Gebruikt om tussen arrays te casten.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Array, typename CastResult<Result>::type> System::AsCast(const Source &value)
```


| Parameter | Beschrijving |
| --- | --- |
| Bron | Het brontype. |
| Result | Het resulttype. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) om te casten. |

### ReturnValue

Het castresultaat. Retourneert nullptr als er geen conversie beschikbaar is voor een array‑element.

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
