---
title: "System::String::operator+‑metod"
linktitle: "operator+"
second_title: "Aspose.Page för C++"
description: "System::String::operator+‑metod. Lägger till ett tecken i slutet av strängen i C++."
type: docs
weight: 2800
url: /sv/cpp/system/string/operator+/
---
## String::operator+(char_t) const method


Lägger till tecken i slutet av strängen.

```cpp
String System::String::operator+(char_t x) const
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| x | char_t | Tecken att lägga till. |

### ReturnValue

[String](../) concatenation result.

## Se även

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(const String\&) const method


[String](../) concatenation operator.

```cpp
String System::String::operator+(const String &str) const
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| str | const String\& | [String](../) att lägga till i slutet av den aktuella. |

### ReturnValue

Konkatenerad sträng.

## Se även

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(const T\&) const method


[String](../) concatenation with string literal or character string pointer.

```cpp
template<typename T,std::enable_if_t< IsStringLiteral< T, char_t >::value > *> String System::String::operator+(const T &arg) const
```


| Parameter | Beskrivning |
| --- | --- |
| T | En av formerna för strängliteral eller teckensträngspekare. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| arg | const T\& | Entitet att konkatenera med den aktuella strängen. |

### ReturnValue

Konkatenerad sträng.

## Se även

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(const T\&) const method


Lägger till referenstypobjektets strängrepresentation i slutet av strängen.

```cpp
template<typename T,std::enable_if_t< IsSmartPtr< T >::value > *> String System::String::operator+(const T &value) const
```


| Parameter | Beskrivning |
| --- | --- |
| T | pekartyp. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| value | const T\& | [Object](../../object/) för att konvertera till sträng med hjälp av [ToString()](../tostring/)-anrop och lägga till i den aktuella strängen. |

### ReturnValue

[String](../) concatenation result.

## Se även

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(const T\&) const method


Lägger till värdetypens objektsträngrepresentation i slutet av strängen.

```cpp
template<typename T,std::enable_if_t<!IsSmartPtr< T >::value &&!std::is_scalar< T >::value &&!std::is_array< T >::value > *> String System::String::operator+(const T &value) const
```


| Parameter | Beskrivning |
| --- | --- |
| T | Värdetyp att anropa [ToString()](../tostring/) på. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| value | const T\& | [Object](../../object/) för att konvertera till sträng med hjälp av [ToString()](../tostring/)-anrop och lägga till i den aktuella strängen. |

### ReturnValue

[String](../) concatenation result.

## Se även

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(double) const method


Lägger till flyttalsvärdets strängrepresentation i slutet av strängen.

```cpp
String System::String::operator+(double d) const
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| d | double | Värde att konvertera till sträng och lägga till. |

### ReturnValue

[String](../) concatenation result.

## Se även

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(int) const method


Lägger till heltalsvärdets strängrepresentation i slutet av strängen.

```cpp
String System::String::operator+(int i) const
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| i | int | Heltalsvärde att konvertera till sträng och lägga till. |

### ReturnValue

[String](../) concatenation result.

## Se även

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(int64_t) const method


Lägger till heltalsvärdets strängrepresentation i slutet av strängen.

```cpp
String System::String::operator+(int64_t v) const
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| v | int64_t | Värde att konvertera till sträng och lägga till att lägga till. |

### ReturnValue

[String](../) concatenation result.

## Se även

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(T) const method


Lägger till det booleska värdets strängrepresentation i slutet av strängen.

```cpp
template<typename T,std::enable_if_t< std::is_same< T, bool >::value > *> String System::String::operator+(T arg) const
```


| Parameter | Beskrivning |
| --- | --- |
| T | Värdetyp att konkatenera med sträng. Måste vara bool |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| arg | T | [Boolean](../../boolean/) värde att konvertera till sträng och lägga till. |

### ReturnValue

[String](../) concatenation result.

## Se även

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(uint32_t) const method


Lägger till den osignerade heltalsvärdets strängrepresentation i slutet av strängen.

```cpp
String System::String::operator+(uint32_t i) const
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| i | uint32_t | Värde att konvertera till sträng och lägga till. |

### ReturnValue

[String](../) concatenation result.

## Se även

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
