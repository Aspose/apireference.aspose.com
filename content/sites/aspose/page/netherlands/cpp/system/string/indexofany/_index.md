---
title: "System::String::IndexOfAny methode"
linktitle: "IndexOfAny"
second_title: "Aspose.Page voor C++"
description: "System::String::IndexOfAny methode. Voorwaartse tekenzoekopdracht in C++."
type: docs
weight: 1600
url: /nl/cpp/system/string/indexofany/
---
## String::IndexOfAny(char_t, int) const method


Voorwaartse zoekopdracht naar teken.

```cpp
int System::String::IndexOfAny(char_t c, int startIndex=0) const
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| c | char_t | Teken om naar te zoeken. |
| startIndex | int | Index om de zoekopdracht te starten. |

### ReturnValue

Index van de eerste tekenpositie vanaf startIndex of -1 als niet gevonden.

## Zie ook

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::IndexOfAny(const ArrayPtr\<char_t\>\&) const method


Zoekt naar elk van de opgegeven tekens in de volledige string. Vergelijkt het eerste teken van de string met alle tekens in anyOf, vervolgens het tweede teken, enzovoort. Retourneert de index van het eerste teken dat overeenkomt met een van de doeltekens.

```cpp
int System::String::IndexOfAny(const ArrayPtr<char_t> &anyOf) const
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) van tekens om naar te zoeken. Volgorde maakt niet uit. |

### ReturnValue

Index van het eerste overeenkomende teken of -1 als niet gevonden.

## Zie ook

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::IndexOfAny(const ArrayPtr\<char_t\>\&, int32_t) const method


Zoekt naar elk van de opgegeven tekens in een substring. Vergelijkt het eerste teken van de string met alle tekens in anyOf, vervolgens het tweede teken, enzovoort. Retourneert de index van het eerste teken dat overeenkomt met een van de doeltekens.

```cpp
int System::String::IndexOfAny(const ArrayPtr<char_t> &anyOf, int32_t startindex) const
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) van tekens om naar te zoeken. Volgorde maakt niet uit. |
| startindex | int32_t | Index om vanaf te beginnen met zoeken. |

### ReturnValue

Index van het eerste overeenkomende teken of -1 als niet gevonden.

## Zie ook

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::IndexOfAny(const ArrayPtr\<char_t\>\&, int32_t, int32_t) const method


Zoekt naar elk van de opgegeven tekens in een substring. Vergelijkt het eerste teken van de string met alle tekens in anyOf, vervolgens het tweede teken, enzovoort. Retourneert de index van het eerste teken dat overeenkomt met een van de doeltekens.

```cpp
int System::String::IndexOfAny(const ArrayPtr<char_t> &anyOf, int32_t startindex, int32_t count) const
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) van tekens om naar te zoeken. Volgorde maakt niet uit. |
| startindex | int32_t | Index om vanaf te beginnen met zoeken. |
| count | int32_t | Aantal tekens om door te zoeken. |

### ReturnValue

Index van het eerste overeenkomende teken of -1 als niet gevonden.

## Zie ook

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::IndexOfAny(const String\&, int) const method


Zoekt vervolgens naar alle tekens van str hierin. Als het eerste teken wordt gevonden, wordt de positie geretourneerd, anders wordt naar het tweede teken gezocht, enzovoort.

```cpp
int System::String::IndexOfAny(const String &str, int startIndex=0) const
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| str | const String\& | [String](../) van te zoeken tekens. De volgorde van tekens is belangrijk. |
| startIndex | int | Positie om de zoekopdracht vanaf te starten. |

### ReturnValue

Index van het eerst gevonden teken of -1 als er geen is gevonden.

## Zie ook

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
