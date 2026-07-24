---
title: "System::String::operator+ methode"
linktitle: "operator+"
second_title: "Aspose.Page voor C++"
description: "System::String::operator+ methode. Voegt een teken toe aan het einde van de string in C++."
type: docs
weight: 2800
url: /nl/cpp/system/string/operator+/
---
## String::operator+(char_t) const method


Voegt een teken toe aan het einde van de string.

```cpp
String System::String::operator+(char_t x) const
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| x | char_t | Teken om toe te voegen. |

### ReturnValue

[String](../) concatenation result.

## Zie ook

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(const String\&) const method


[String](../) concatenation operator.

```cpp
String System::String::operator+(const String &str) const
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| str | const String\& | [String](../) om toe te voegen aan het einde van de huidige. |

### ReturnValue

Samengevoegde string.

## Zie ook

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(const T\&) const method


[String](../) concatenation with string literal or character string pointer.

```cpp
template<typename T,std::enable_if_t< IsStringLiteral< T, char_t >::value > *> String System::String::operator+(const T &arg) const
```


| Parameter | Beschrijving |
| --- | --- |
| T | Een van de vormen: stringliteral of tekenreeks pointer. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg | const T\& | Entiteit om te concatenaten met de huidige string. |

### ReturnValue

Samengevoegde string.

## Zie ook

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(const T\&) const method


Voegt de tekenreeksrepresentatie van een referentietype-object toe aan het einde van de string.

```cpp
template<typename T,std::enable_if_t< IsSmartPtr< T >::value > *> String System::String::operator+(const T &value) const
```


| Parameter | Beschrijving |
| --- | --- |
| T | pointertype. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | const T\& | [Object](../../object/) om te converteren naar string met behulp van de [ToString()](../tostring/)‑aanroep en toe te voegen aan de huidige string. |

### ReturnValue

[String](../) concatenation result.

## Zie ook

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(const T\&) const method


Voegt de stringrepresentatie van een value‑type object toe aan het einde van de string.

```cpp
template<typename T,std::enable_if_t<!IsSmartPtr< T >::value &&!std::is_scalar< T >::value &&!std::is_array< T >::value > *> String System::String::operator+(const T &value) const
```


| Parameter | Beschrijving |
| --- | --- |
| T | Value‑type om [ToString()](../tostring/) op aan te roepen. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | const T\& | [Object](../../object/) om te converteren naar string met behulp van de [ToString()](../tostring/)‑aanroep en toe te voegen aan de huidige string. |

### ReturnValue

[String](../) concatenation result.

## Zie ook

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(double) const method


Voegt de tekenreeksrepresentatie van een zwevendekommagetal toe aan het einde van de string.

```cpp
String System::String::operator+(double d) const
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| d | double | Waarde om te converteren naar string en toe te voegen. |

### ReturnValue

[String](../) concatenation result.

## Zie ook

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(int) const method


Voegt de tekenreeksrepresentatie van een geheel getal toe aan het einde van de string.

```cpp
String System::String::operator+(int i) const
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| i | int | Integer‑waarde om te converteren naar string en toe te voegen. |

### ReturnValue

[String](../) concatenation result.

## Zie ook

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(int64_t) const method


Voegt de tekenreeksrepresentatie van een geheel getal toe aan het einde van de string.

```cpp
String System::String::operator+(int64_t v) const
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| v | int64_t | Waarde om te converteren naar string en toe te voegen aan toevoegen. |

### ReturnValue

[String](../) concatenation result.

## Zie ook

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(T) const method


Voegt de tekenreeksrepresentatie van een booleaanse waarde toe aan het einde van de string.

```cpp
template<typename T,std::enable_if_t< std::is_same< T, bool >::value > *> String System::String::operator+(T arg) const
```


| Parameter | Beschrijving |
| --- | --- |
| T | Waarde-type om te concatenëren met string. Moet bool zijn. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg | T | [Boolean](../../boolean/) waarde om te converteren naar string en toe te voegen. |

### ReturnValue

[String](../) concatenation result.

## Zie ook

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(uint32_t) const method


Voegt de tekenreeksrepresentatie van een ongetekend geheel getal toe aan het einde van de string.

```cpp
String System::String::operator+(uint32_t i) const
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| i | uint32_t | Waarde om te converteren naar string en toe te voegen. |

### ReturnValue

[String](../) concatenation result.

## Zie ook

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
