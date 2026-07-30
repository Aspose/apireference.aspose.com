---
title: "Metodo System::String::operator+"
linktitle: "operator+"
second_title: "Aspose.Font per C++"
description: "Metodo System::String::operator+. Aggiunge un carattere alla fine della stringa in C++."
type: docs
weight: 2800
url: /it/cpp/system/string/operator+/
---
## String::operator+(char_t) const method


Aggiunge un carattere alla fine della stringa.

```cpp
String System::String::operator+(char_t x) const
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| x | char_t | Carattere da aggiungere. |

### ReturnValue

[String](../) concatenation result.

## Vedi anche

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::operator+(const String\&) const method


[String](../) concatenation operator.

```cpp
String System::String::operator+(const String &str) const
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| str | const String\& | [String](../) da aggiungere alla fine di quello corrente. |

### ReturnValue

Stringa concatenata.

## Vedi anche

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::operator+(const T\&) const method


[String](../) concatenation with string literal or character string pointer.

```cpp
template<typename T,std::enable_if_t< IsStringLiteral< T, char_t >::value > *> String System::String::operator+(const T &arg) const
```


| Parametro | Descrizione |
| --- | --- |
| T | Una delle forme di letterale stringa o puntatore a stringa di caratteri. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg | const T\& | Entità da concatenare con la stringa corrente. |

### ReturnValue

Stringa concatenata.

## Vedi anche

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::operator+(const T\&) const method


Aggiunge la rappresentazione stringa dell'oggetto di tipo riferimento alla fine della stringa.

```cpp
template<typename T,std::enable_if_t< IsSmartPtr< T >::value > *> String System::String::operator+(const T &value) const
```


| Parametro | Descrizione |
| --- | --- |
| T | tipo puntatore. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | const T\& | [Object](../../object/) per convertire in stringa usando la chiamata [ToString()](../tostring/) e aggiungere alla stringa corrente. |

### ReturnValue

[String](../) concatenation result.

## Vedi anche

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::operator+(const T\&) const method


Aggiunge la rappresentazione stringa dell'oggetto di tipo valore alla fine della stringa.

```cpp
template<typename T,std::enable_if_t<!IsSmartPtr< T >::value &&!std::is_scalar< T >::value &&!std::is_array< T >::value > *> String System::String::operator+(const T &value) const
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo valore su cui chiamare [ToString()](../tostring/). |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | const T\& | [Object](../../object/) per convertire in stringa usando la chiamata [ToString()](../tostring/) e aggiungere alla stringa corrente. |

### ReturnValue

[String](../) concatenation result.

## Vedi anche

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::operator+(double) const method


Aggiunge la rappresentazione stringa del valore a virgola mobile alla fine della stringa.

```cpp
String System::String::operator+(double d) const
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| d | double | Valore da convertire in stringa e aggiungere. |

### ReturnValue

[String](../) concatenation result.

## Vedi anche

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::operator+(int) const method


Aggiunge la rappresentazione stringa del valore intero alla fine della stringa.

```cpp
String System::String::operator+(int i) const
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| i | int | Valore intero da convertire in stringa e aggiungere. |

### ReturnValue

[String](../) concatenation result.

## Vedi anche

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::operator+(int64_t) const method


Aggiunge la rappresentazione stringa del valore intero alla fine della stringa.

```cpp
String System::String::operator+(int64_t v) const
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| v | int64_t | Valore da convertire in stringa e aggiungere di nuovo. |

### ReturnValue

[String](../) concatenation result.

## Vedi anche

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::operator+(T) const method


Aggiunge la rappresentazione stringa del valore booleano alla fine della stringa.

```cpp
template<typename T,std::enable_if_t< std::is_same< T, bool >::value > *> String System::String::operator+(T arg) const
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo valore da concatenare con la stringa. Deve essere bool. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg | T | [Boolean](../../boolean/) valore da convertire in stringa e aggiungere. |

### ReturnValue

[String](../) concatenation result.

## Vedi anche

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::operator+(uint32_t) const method


Aggiunge la rappresentazione stringa del valore intero senza segno alla fine della stringa.

```cpp
String System::String::operator+(uint32_t i) const
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| i | uint32_t | Valore da convertire in stringa e aggiungere. |

### ReturnValue

[String](../) concatenation result.

## Vedi anche

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
