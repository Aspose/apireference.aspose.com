---
title: "Método System::String::operator+"
linktitle: "operator+"
second_title: "Aspose.Page para C++"
description: "Método System::String::operator+. Añade un carácter al final de la cadena en C++."
type: docs
weight: 2800
url: /es/cpp/system/string/operator+/
---
## String::operator+(char_t) const method


Agrega un carácter al final de la cadena.

```cpp
String System::String::operator+(char_t x) const
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| x | char_t | Carácter a añadir. |

### ReturnValue

[String](../) concatenation result.

## Ver también

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(const String\&) const method


[String](../) concatenation operator.

```cpp
String System::String::operator+(const String &str) const
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| str | const String\& | [String](../) para añadir al final de la actual. |

### ReturnValue

Cadena concatenada.

## Ver también

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(const T\&) const method


[String](../) concatenation with string literal or character string pointer.

```cpp
template<typename T,std::enable_if_t< IsStringLiteral< T, char_t >::value > *> String System::String::operator+(const T &arg) const
```


| Parámetro | Descripción |
| --- | --- |
| T | Una de las formas de literal de cadena o puntero a cadena de caracteres. |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg | const T\& | Entidad para concatenar con la cadena actual. |

### ReturnValue

Cadena concatenada.

## Ver también

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(const T\&) const method


Agrega la representación en cadena del objeto de tipo referencia al final de la cadena.

```cpp
template<typename T,std::enable_if_t< IsSmartPtr< T >::value > *> String System::String::operator+(const T &value) const
```


| Parámetro | Descripción |
| --- | --- |
| T | tipo de puntero. |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | const T\& | [Object](../../object/) para convertir a cadena usando la llamada [ToString()](../tostring/) y añadir a la cadena actual. |

### ReturnValue

[String](../) concatenation result.

## Ver también

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(const T\&) const method


Agrega la representación de cadena del objeto de tipo valor al final de la cadena.

```cpp
template<typename T,std::enable_if_t<!IsSmartPtr< T >::value &&!std::is_scalar< T >::value &&!std::is_array< T >::value > *> String System::String::operator+(const T &value) const
```


| Parámetro | Descripción |
| --- | --- |
| T | Tipo de valor sobre el cual llamar a [ToString()](../tostring/). |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | const T\& | [Object](../../object/) para convertir a cadena usando la llamada [ToString()](../tostring/) y añadir a la cadena actual. |

### ReturnValue

[String](../) concatenation result.

## Ver también

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(double) const method


Agrega la representación en cadena del valor de punto flotante al final de la cadena.

```cpp
String System::String::operator+(double d) const
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| d | double | Valor a convertir a cadena y a agregar. |

### ReturnValue

[String](../) concatenation result.

## Ver también

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(int) const method


Agrega la representación en cadena del valor entero al final de la cadena.

```cpp
String System::String::operator+(int i) const
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| i | int | Valor entero a convertir a cadena y a agregar. |

### ReturnValue

[String](../) concatenation result.

## Ver también

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(int64_t) const method


Agrega la representación en cadena del valor entero al final de la cadena.

```cpp
String System::String::operator+(int64_t v) const
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| v | int64_t | Valor a convertir a cadena y a agregar para agregar. |

### ReturnValue

[String](../) concatenation result.

## Ver también

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(T) const method


Agrega la representación en cadena del valor booleano al final de la cadena.

```cpp
template<typename T,std::enable_if_t< std::is_same< T, bool >::value > *> String System::String::operator+(T arg) const
```


| Parámetro | Descripción |
| --- | --- |
| T | Tipo de valor para concatenar con la cadena. Debe ser bool |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg | T | Valor [Boolean](../../boolean/) a convertir a cadena y a agregar. |

### ReturnValue

[String](../) concatenation result.

## Ver también

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(uint32_t) const method


Agrega la representación en cadena del valor entero sin signo al final de la cadena.

```cpp
String System::String::operator+(uint32_t i) const
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| i | uint32_t | Valor a convertir a cadena y a agregar. |

### ReturnValue

[String](../) concatenation result.

## Ver también

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
