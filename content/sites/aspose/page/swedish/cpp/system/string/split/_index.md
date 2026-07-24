---
title: "System::String::Split metod"
linktitle: "Dela"
second_title: "Aspose.Page för C++"
description: "System::String::Split metod. Delar strängen efter tecken i C++."
type: docs
weight: 4300
url: /sv/cpp/system/string/split/
---
## String::Split(char_t, int32_t, StringSplitOptions) const method


Delar strängen efter tecken.

```cpp
ArrayPtr<String> System::String::Split(char_t separator, int32_t count, StringSplitOptions opt=StringSplitOptions::None) const
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| avgränsare | char_t | Tecken att dela strängen efter. |
| count | int32_t | Det maximala antalet delsträngar att returnera. |
| alternativ | StringSplitOptions | Delningsalternativ. |

### ReturnValue

[Array](../../array/) of substrings.

## Se även

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(char_t, StringSplitOptions) const method


Delar strängen efter tecken.

```cpp
ArrayPtr<String> System::String::Split(char_t separator=u' ', StringSplitOptions opt=StringSplitOptions::None) const
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| avgränsare | char_t | Tecken att dela strängen efter. |
| alternativ | StringSplitOptions | Delningsalternativ. |

### ReturnValue

[Array](../../array/) of substrings.

## Se även

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(char_t, char_t, StringSplitOptions) const method


Delar strängen efter en av två tecken.

```cpp
ArrayPtr<String> System::String::Split(char_t separatorA, char_t separatorB, StringSplitOptions opt=StringSplitOptions::None) const
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| separatorA | char_t | Första tecknet att dela strängen med. |
| separatorB | char_t | Andra tecknet att dela strängen med. |
| alternativ | StringSplitOptions | Delningsalternativ. |

### ReturnValue

[Array](../../array/) of substrings.

## Se även

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(const ArrayPtr\<char_t\>\&, int32_t, StringSplitOptions) const method


Delar strängen efter ett av de angivna tecknen.

```cpp
ArrayPtr<String> System::String::Split(const ArrayPtr<char_t> &separators, int32_t count, StringSplitOptions opt=StringSplitOptions::None) const
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| separators | const ArrayPtr\<char_t\>\& | [Array](../../array/) av separatortecken. Om den är tom, betraktas alla blankstegstecken som en separator. |
| count | int32_t | Det maximala antalet delsträngar att returnera. |
| alternativ | StringSplitOptions | Delningsalternativ. |

### ReturnValue

[Array](../../array/) of substrings.

## Se även

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(const ArrayPtr\<char_t\>\&, StringSplitOptions) const method


Delar strängen efter ett av de angivna tecknen.

```cpp
ArrayPtr<String> System::String::Split(const ArrayPtr<char_t> &separators, StringSplitOptions opt=StringSplitOptions::None) const
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| separators | const ArrayPtr\<char_t\>\& | [Array](../../array/) av separatortecken. Om den är tom, betraktas alla blankstegstecken som en separator. |
| alternativ | StringSplitOptions | Delningsalternativ. |

### ReturnValue

[Array](../../array/) of substrings.

## Se även

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(const ArrayPtr\<String\>\&, int, StringSplitOptions) const method


Delar strängen efter en delsträng. För närvarande stöds endast en separatorarray med noll eller ett element.

```cpp
ArrayPtr<String> System::String::Split(const ArrayPtr<String> &separators, int count, StringSplitOptions opt=StringSplitOptions::None) const
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| separators | const ArrayPtr\<String\>\& | [Array](../../array/) av separatorsträngar. Om den är tom, utförs ingen delning. |
| count | int | Maximalt antal element i delningsarrayen. |
| alternativ | StringSplitOptions | Delningsalternativ. |

### ReturnValue

[Array](../../array/) of substrings.

## Se även

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(const ArrayPtr\<String\>\&, StringSplitOptions) const method


Delar strängen efter en delsträng.

```cpp
ArrayPtr<String> System::String::Split(const ArrayPtr<String> &separators, StringSplitOptions opt=StringSplitOptions::None) const
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| separators | const ArrayPtr\<String\>\& | [Array](../../array/) av separatorsträngar. Om den är tom, utförs ingen delning. |
| alternativ | StringSplitOptions | Delningsalternativ. |

### ReturnValue

[Array](../../array/) of substrings.

## Se även

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(const String\&, int, StringSplitOptions) const method


Delar strängen efter en delsträng.

```cpp
ArrayPtr<String> System::String::Split(const String &separator, int count, StringSplitOptions opt=StringSplitOptions::None) const
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| avgränsare | const String\& | Delsträng som fungerar som separator. Om den är tom, fungerar blankstegstecken som separator. |
| count | int | Maximalt antal element i delningsarrayen. |
| alternativ | StringSplitOptions | Delningsalternativ. |

### ReturnValue

[Array](../../array/) of substrings.

## Se även

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(const String\&, StringSplitOptions) const method


Delar strängen efter en delsträng.

```cpp
ArrayPtr<String> System::String::Split(const String &separator, StringSplitOptions opt=StringSplitOptions::None) const
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| avgränsare | const String\& | Delsträng som fungerar som separator. Om den är tom, fungerar blankstegstecken som separator. |
| alternativ | StringSplitOptions | Delningsalternativ. |

### ReturnValue

[Array](../../array/) of substrings.

## Se även

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
