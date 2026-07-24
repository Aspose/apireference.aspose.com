---
title: "System::Text::RegularExpressions::Regex::Split method"
linktitle: "Split"
second_title: "Aspose.Page voor C++"
description: "System::Text::RegularExpressions::Regex::Split method. Splitst een string op basis van regex‑overeenkomsten in C++."
type: docs
weight: 900
url: /nl/cpp/system.text.regularexpressions/regex/split/
---
## Regex::Split(const String\&) method


Splitst een string op regex‑overeenkomsten.

```cpp
ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| input | const String\& | [String](../../../system/string/) om te splitsen. |

### ReturnValue

[Array](../../../system/array/) of substrings between matches.

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Split(const String\&, int) method


Splitst een string op regex‑overeenkomsten.

```cpp
ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input, int count)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| input | const String\& | [String](../../../system/string/) om te splitsen. |
| count | int | Aantal subreeksen limiet. |

### ReturnValue

[Array](../../../system/array/) of substrings between matches.

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Split(const String\&, int, int) method


Splitst een invoertekenreeks een opgegeven maximum aantal keren in een array van subreeksen, op de posities die zijn gedefinieerd door een reguliere expressie opgegeven in de [Regex](../) constructor. Het zoeken naar het patroon van de reguliere expressie begint op een opgegeven tekenpositie in de invoertekenreeks.

```cpp
ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input, int count, int startat)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| invoer | const String\& | De te splitsen tekenreeks. |
| count | int | Het maximale aantal keren dat de splitsing kan plaatsvinden. |
| startat | int | De tekenpositie in de invoertekenreeks waar het zoeken begint. |

### ReturnValue

Een array van tekenreeksen.

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Split(const String\&, const String\&, int, RegexOptions, TimeSpan) method


Splitst een string op regexp.

```cpp
static ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input, const String &pattern, int count, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| invoer | const String\& | Invoertekenreeks. |
| patroon | const String\& | Regexp-patroon. |
| count | int | [Match](../../match/) aantal limiet. |
| opties | RegexOptions | Opties voor vergelijken. |
| matchTimeout | TimeSpan | Time-out. |

### ReturnValue

[Array](../../../system/array/) of strings between matchse.

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Split(const String\&, const String\&, RegexOptions, TimeSpan) method


Splitst een string op regexp.

```cpp
static ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input, const String &pattern, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| invoer | const String\& | Invoertekenreeks. |
| patroon | const String\& | Regexp-patroon. |
| opties | RegexOptions | Opties voor vergelijken. |
| matchTimeout | TimeSpan | Time-out. |

### ReturnValue

[Array](../../../system/array/) of strings between matchse.

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
