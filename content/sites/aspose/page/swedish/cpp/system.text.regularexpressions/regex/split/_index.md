---
title: "System::Text::RegularExpressions::Regex::Split metod"
linktitle: "Dela"
second_title: "Aspose.Page för C++"
description: "System::Text::RegularExpressions::Regex::Split metod. Delar strängen efter regex‑matchningar i C++."
type: docs
weight: 900
url: /sv/cpp/system.text.regularexpressions/regex/split/
---
## Regex::Split(const String\&) method


Delar strängen vid regex‑matchningar.

```cpp
ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| input | const String\& | [String](../../../system/string/) för att dela. |

### ReturnValue

[Array](../../../system/array/) of substrings between matches.

## Se även

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Split(const String\&, int) method


Delar strängen vid regex‑matchningar.

```cpp
ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input, int count)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| input | const String\& | [String](../../../system/string/) för att dela. |
| count | int | Gräns för antal delsträngar. |

### ReturnValue

[Array](../../../system/array/) of substrings between matches.

## Se även

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Split(const String\&, int, int) method


Delar en indatasträng ett angivet maximalt antal gånger i en array av delsträngar, på de positioner som definieras av ett reguljärt uttryck som specificeras i [Regex](../)-konstruktorn. Sökningen efter mönstret för det reguljära uttrycket startar vid en angiven teckenposition i indatasträngen.

```cpp
ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input, int count, int startat)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| inmatning | const String\& | Strängen som ska delas. |
| count | int | Det maximala antalet gånger som delningen kan ske. |
| startat | int | Teckenpositionen i indatasträngen där sökningen ska börja. |

### ReturnValue

En array av strängar.

## Se även

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Split(const String\&, const String\&, int, RegexOptions, TimeSpan) method


Delar strängen vid regexp.

```cpp
static ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input, const String &pattern, int count, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| inmatning | const String\& | Indatasträng. |
| mönster | const String\& | Regexp‑mönster. |
| count | int | Gräns för [Match](../../match/) antal. |
| alternativ | RegexOptions | Matchningsalternativ. |
| matchTimeout | TimeSpan | Tidsgräns. |

### ReturnValue

[Array](../../../system/array/) of strings between matchse.

## Se även

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Split(const String\&, const String\&, RegexOptions, TimeSpan) method


Delar strängen vid regexp.

```cpp
static ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input, const String &pattern, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| inmatning | const String\& | Indatasträng. |
| mönster | const String\& | Regexp‑mönster. |
| alternativ | RegexOptions | Matchningsalternativ. |
| matchTimeout | TimeSpan | Tidsgräns. |

### ReturnValue

[Array](../../../system/array/) of strings between matchse.

## Se även

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
