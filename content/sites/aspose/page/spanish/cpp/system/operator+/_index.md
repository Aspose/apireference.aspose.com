---
title: "System::operator+ método"
linktitle: "operator+"
second_title: "Aspose.Page para C++"
description: "System::operator+ método. Concatenación de cadenas en C++."
type: docs
weight: 27500
url: /es/cpp/system/operator+/
---
## System::operator+(const char_t, const String\&) method


[String](../string/) concatenation.

```cpp
String System::operator+(const char_t left, const String &right)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| izquierda | const char_t | Carácter para concatenar a la cadena. |
| right | const String\& | [String](../string/) para concatenar. |

### ReturnValue

Cadena concatenada.

## Ver también

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator+(const T\&, const Decimal\&) method


Devuelve una nueva instancia de la clase [Decimal](../decimal/) que representa un valor que es la suma del valor especificado y el valor representado por el objeto [Decimal](../decimal/) especificado.

```cpp
template<typename T,typename _> Decimal System::operator+(const T &x, const Decimal &d)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| x | const T\& | El primer sumando |
| d | const Decimal\& | La referencia constante al objeto [Decimal](../decimal/) que representa el segundo sumando |

### ReturnValue

Una nueva instancia de la clase [Decimal](../decimal/) que representa un valor que es la suma de **x** y el valor representado por **d**.

## Ver también

* Class [Decimal](../decimal/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator+(const T1\&, const Nullable\<T2\>\&) method


Suma valores no nulos y valores nulos.

```cpp
template<typename T1,typename T2,typename> System::Nullable<decltype(some+other.get_Value())> System::operator+(const T1 &some, const Nullable<T2> &other)
```


| Parámetro | Descripción |
| --- | --- |
| T1 | Tipo de operando izquierdo. |
| T2 | Tipo de operando derecho. |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| alguno | const T1\& | Operando izquierdo. |
| otro | const Nullable\<T2\>\& | Operando derecho. |

### ReturnValue

Resultado de la suma.

## Ver también

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator+(MulticastDelegate\<T\>, MulticastDelegate\<T\>) method


Conecta todas las devoluciones de llamada del delegado de la mano derecha al final de la lista de devoluciones de llamada del delegado de la mano izquierda.

```cpp
template<typename T> MulticastDelegate<T> System::operator+(MulticastDelegate<T> lhv, MulticastDelegate<T> rhv)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| lhv | MulticastDelegate\<T\> | El delegado al que se añaden las devoluciones de llamada. |
| rhv | MulticastDelegate\<T\> | El delegado cuyas devoluciones de llamada están siendo añadidas. |

### ReturnValue

Devuelve un delegado que contiene las devoluciones de llamada del valor de la mano izquierda y luego las de la mano derecha.

## Ver también

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator+(T\&, const String\&) method


[String](../string/) concatenation.

```cpp
template<typename T> std::enable_if<IsStringLiteral<T, char_t>::value, String>::type System::operator+(T &left, const String &right)
```


| Parámetro | Descripción |
| --- | --- |
| T | [String](../string/) tipo literal. |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| izquierda | T\& | Literal para concatenar a la cadena. |
| right | const String\& | [String](../string/) para concatenar. |

### ReturnValue

Cadena concatenada.

## Ver también

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator+(T\&, const String\&) method


[String](../string/) concatenation.

```cpp
template<typename T> std::enable_if<IsStringPointer<T, char_t>::value, String>::type System::operator+(T &left, const String &right)
```


| Parámetro | Descripción |
| --- | --- |
| T | Tipo de puntero [String](../string/). |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| left | T\& | [String](../string/) puntero para concatenar a la cadena. |
| right | const String\& | [String](../string/) para concatenar. |

### ReturnValue

Cadena concatenada.

## Ver también

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
