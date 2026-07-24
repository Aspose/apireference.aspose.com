---
title: "System::String::LastIndexOf metod"
linktitle: "LastIndexOf"
second_title: "Aspose.Page för C++"
description: "System::String::LastIndexOf metod. Bakåtsökning av tecken i C++."
type: docs
weight: 2400
url: /sv/cpp/system/string/lastindexof/
---
## String::LastIndexOf(char_t) const method


Bakåtsökning av tecken.

```cpp
int System::String::LastIndexOf(char_t value) const
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| value | char_t | Tecken att söka efter. |

### ReturnValue

Index för sista teckenposition eller -1 om inte hittad.

## Se även

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(char_t, int32_t) const method


Bakåtsökning av tecken.

```cpp
int System::String::LastIndexOf(char_t value, int32_t startIndex) const
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| value | char_t | Tecken att söka efter. |
| startIndex | int32_t | Index att börja sökningen vid. |

### ReturnValue

Index för sista teckenposition sedan startIndex eller -1 om inte hittad.

## Se även

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(char_t, int32_t, int32_t) const method


Bakåtsökning av tecken.

```cpp
int System::String::LastIndexOf(char_t value, int32_t startIndex, int32_t count) const
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| value | char_t | Tecken att söka efter. |
| startIndex | int32_t | Index att börja sökningen vid. |
| count | int32_t | Antal tecken att söka igenom |

### ReturnValue

Index för sista teckenposition sedan startIndex eller -1 om inte hittad.

## Se även

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(const String\&, int, System::StringComparison) const method


Bakåtsökning i delsträng.

```cpp
int System::String::LastIndexOf(const String &str, int startIndex, System::StringComparison comparison_type) const
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| str | const String\& | Delsträng att söka efter. |
| startIndex | int | Position i källsträngen där sökningen ska börja. |
| comparison_type | System::StringComparison | [Comparison](../../comparison/) läge. |

### ReturnValue

Index för senast hittade delsträng eller -1 om inte hittad. För tom söksträng returneras alltid strängens längd.

## Se även

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(const String\&, int) const method


Bakåtsökning i delsträng.

```cpp
int System::String::LastIndexOf(const String &str, int startIndex=INT32_MAX) const
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| str | const String\& | Delsträng att söka efter. |
| startIndex | int | Position i källsträngen där sökningen ska börja. |

### ReturnValue

Index för senast hittade delsträng eller -1 om inte hittad. För tom söksträng returneras alltid strängens längd.

## Se även

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(const String\&, System::StringComparison) const method


Bakåtsökning i delsträng.

```cpp
int System::String::LastIndexOf(const String &str, System::StringComparison comparison_type) const
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| str | const String\& | Delsträng att söka efter. |
| comparison_type | System::StringComparison | [Comparison](../../comparison/) läge. |

### ReturnValue

Index för senast hittade delsträng eller -1 om inte hittad. För tom söksträng returneras alltid strängens längd.

## Se även

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(const String\&, int, int, StringComparison) const method


Bakåtsökning i delsträng.

```cpp
int System::String::LastIndexOf(const String &value, int startIndex, int count, StringComparison comparisonType) const
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| value | const String\& | Delsträng att söka efter. |
| startIndex | int | Position i källsträngen där sökningen ska börja. |
| count | int | Antal tecken att söka igenom. |
| comparisonType | StringComparison | [Comparison](../../comparison/) läge. |

### ReturnValue

Index för senast hittade delsträng eller -1 om inte hittad. För tom söksträng returneras alltid startIndex+antal.

## Se även

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
