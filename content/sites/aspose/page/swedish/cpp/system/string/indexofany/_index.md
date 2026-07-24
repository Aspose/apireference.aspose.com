---
title: "System::String::IndexOfAny metod"
linktitle: "IndexOfAny"
second_title: "Aspose.Page för C++"
description: "System::String::IndexOfAny metod. Framåtsökning av tecken i C++."
type: docs
weight: 1600
url: /sv/cpp/system/string/indexofany/
---
## String::IndexOfAny(char_t, int) const method


Framåtsökning av tecken.

```cpp
int System::String::IndexOfAny(char_t c, int startIndex=0) const
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| c | char_t | Tecken att söka efter. |
| startIndex | int | Index att börja sökningen vid. |

### ReturnValue

Index för den första teckenpositionen från startIndex eller -1 om den inte hittas.

## Se även

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::IndexOfAny(const ArrayPtr\<char_t\>\&) const method


Söker efter någon av de angivna tecknen i hela strängen. Jämför det första tecknet i strängen med alla tecken i anyOf, sedan det andra och så vidare. Returnerar index för det första som matchar något av måltecknen.

```cpp
int System::String::IndexOfAny(const ArrayPtr<char_t> &anyOf) const
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) av tecken att söka efter. Ordningen spelar ingen roll. |

### ReturnValue

Index för det första matchande tecknet eller -1 om det inte hittas.

## Se även

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::IndexOfAny(const ArrayPtr\<char_t\>\&, int32_t) const method


Söker efter någon av de angivna tecknen i delsträngen. Jämför det första tecknet i strängen med alla tecken i anyOf, sedan det andra och så vidare. Returnerar index för det första som matchar något av måltecknen.

```cpp
int System::String::IndexOfAny(const ArrayPtr<char_t> &anyOf, int32_t startindex) const
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) av tecken att söka efter. Ordningen spelar ingen roll. |
| startindex | int32_t | Index att börja sökningen från. |

### ReturnValue

Index för det första matchande tecknet eller -1 om det inte hittas.

## Se även

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::IndexOfAny(const ArrayPtr\<char_t\>\&, int32_t, int32_t) const method


Söker efter någon av de angivna tecknen i delsträngen. Jämför det första tecknet i strängen med alla tecken i anyOf, sedan det andra och så vidare. Returnerar index för det första som matchar något av måltecknen.

```cpp
int System::String::IndexOfAny(const ArrayPtr<char_t> &anyOf, int32_t startindex, int32_t count) const
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) av tecken att söka efter. Ordningen spelar ingen roll. |
| startindex | int32_t | Index att börja sökningen från. |
| count | int32_t | Antal tecken att söka igenom. |

### ReturnValue

Index för det första matchande tecknet eller -1 om det inte hittas.

## Se även

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::IndexOfAny(const String\&, int) const method


Söker därför efter alla tecken i str i detta. Om det första tecknet hittas returneras dess position, annars söks det andra och så vidare.

```cpp
int System::String::IndexOfAny(const String &str, int startIndex=0) const
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| str | const String\& | [String](../) av tecken att leta efter. Ordningen på tecknen är viktig. |
| startIndex | int | Position att börja sökningen från. |

### ReturnValue

Index för det första hittade tecknet eller -1 om inget hittas.

## Se även

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
