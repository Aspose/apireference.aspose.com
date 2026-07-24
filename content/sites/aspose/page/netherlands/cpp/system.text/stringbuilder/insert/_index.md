---
title: "System::Text::StringBuilder::Insert method"
linktitle: "Invoegen"
second_title: "Aspose.Page voor C++"
description: "System::Text::StringBuilder::Insert method. Voegt tekens in op een vaste positie van de builder in C++."
type: docs
weight: 1200
url: /nl/cpp/system.text/stringbuilder/insert/
---
## StringBuilder::Insert(int, const System::ArrayPtr\<char_t\>\&, int, int) method


Voegt tekens in op de vaste positie van de builder.

```cpp
StringBuilder * System::Text::StringBuilder::Insert(int index, const System::ArrayPtr<char_t> &chars, int startIndex, int charCount)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| index | int | Positie om tekens in in te voegen. |
| chars | const System::ArrayPtr\<char_t\>\& | [Array](../../../system/array/) om een slice van in te voegen. |
| startIndex | int | [Array](../../../system/array/) beginindex van de slice. |
| charCount | int | [Array](../../../system/array/) slice lengte. |

### ReturnValue

Deze pointer.

## Zie ook

* Class [StringBuilder](../)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Insert(int, char_t) method


Voegt teken in op de vaste positie van de builder.

```cpp
StringBuilder * System::Text::StringBuilder::Insert(int startIndex, char_t ch)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| startIndex | int | Positie om tekens in in te voegen. |
| ch | char_t | Teken om in te voegen. |

### ReturnValue

Deze pointer.

## Zie ook

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Insert(int, const String\&) method


Voegt een tekenreeks in op een vaste positie in de builder.

```cpp
StringBuilder * System::Text::StringBuilder::Insert(int startIndex, const String &str)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| startIndex | int | Positie om tekens in in te voegen. |
| str | const String\& | [String](../../../system/string/) om in te voegen. |

### ReturnValue

Deze pointer.

## Zie ook

* Class [StringBuilder](../)
* Class [String](../../../system/string/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Insert(int, T) method


Voegt waarde in op de vaste positie van de builder.

```cpp
template<typename T> std::enable_if<std::is_arithmetic<T>::value, StringBuilder *>::type System::Text::StringBuilder::Insert(int startIndex, T value)
```


| Parameter | Beschrijving |
| --- | --- |
| Parameter | type. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| startIndex | int | Positie om tekens in in te voegen. |
| value | T | Waarde om te formatteren en in te voegen. |

### ReturnValue

Deze pointer.

## Zie ook

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Insert(int32_t, const String\&, int32_t) method


Voegt herhaalde tekenreeks in op de vaste positie van de builder.

```cpp
StringBuilder * System::Text::StringBuilder::Insert(int32_t index, const String &value, int32_t count)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| index | int32_t | Positie om tekens in in te voegen. |
| value | const String\& | [String](../../../system/string/) om in te voegen. |
| count | int32_t | Hoe vaak de **value**-string te herhalen. |

### ReturnValue

Deze pointer.

## Zie ook

* Class [StringBuilder](../)
* Class [String](../../../system/string/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
