---
title: "Método System::ExplicitCast"
linktitle: "ConversiónExplícita"
second_title: "Aspose.Page para C++"
description: "Método System::ExplicitCast. Convierte el tipo de origen al tipo de resultado usando una conversión explícita. Se usa cuando el tipo de origen y el tipo de resultado son los mismos en C++."
type: docs
weight: 18500
url: /es/cpp/system/explicitcast/
---
## System::ExplicitCast(const Source\&) method


Convierte el tipo de origen al tipo de resultado usando una conversión explícita. Se usa cuando el tipo de origen y el tipo de resultado son los mismos.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::None, Result> System::ExplicitCast(const Source &value)
```


| Parámetro | Descripción |
| --- | --- |
| Origen | El tipo de origen. |
| Result | El tipo de resultado. |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) para convertir. |

### ReturnValue

El resultado del casting.

## Ver también

* Enum [Base64FormattingOptions](../base64formattingoptions/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Convierte el tipo de origen al tipo de resultado usando una conversión explícita. Se usa cuando se necesita una conversión simple similar a un constructor.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Static, Result> System::ExplicitCast(const Source &value)
```


| Parámetro | Descripción |
| --- | --- |
| Origen | El tipo de origen. |
| Result | El tipo de resultado. |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) para convertir. |

### ReturnValue

El resultado del casting.

## Ver también

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Convierte el tipo de origen al tipo de resultado usando una conversión explícita. Se usa para envoltorios de excepciones.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Exception, Result> System::ExplicitCast(const Source &value)
```


| Parámetro | Descripción |
| --- | --- |
| Origen | El tipo de origen. |
| Result | El tipo de resultado. |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) para convertir. |

### ReturnValue

El resultado del casting.

## Ver también

* Typedef [Exception](../exception/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Convierte el tipo de origen al tipo de resultado usando una conversión explícita. Se usa para convertir un objeto a excepción.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::ObjectToException, Result> System::ExplicitCast(const Source &value)
```


| Parámetro | Descripción |
| --- | --- |
| Origen | El tipo de origen. |
| Result | El tipo de resultado. |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) para convertir. |

### ReturnValue

El resultado del casting.

## Ver también

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Convierte el tipo de origen al tipo de resultado usando una conversión explícita. Se usa cuando el origen y el resultado son ambos punteros inteligentes (sin [SmartPtr<...>](../smartptr/) explícito en el tipo de resultado).

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Pointer, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Parámetro | Descripción |
| --- | --- |
| Origen | El tipo de origen. |
| Result | El tipo de resultado. |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) para convertir. |

### ReturnValue

El resultado del casting.

## Ver también

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Convierte el tipo de origen al tipo de resultado usando una conversión explícita. Se usa cuando el origen y el resultado son ambos punteros inteligentes (con [SmartPtr<...>](../smartptr/) explícito en el tipo de resultado).

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::PointerToPointer, Result> System::ExplicitCast(const Source &value)
```


| Parámetro | Descripción |
| --- | --- |
| Origen | El tipo de origen. |
| Result | El tipo de resultado. |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) para convertir. |

### ReturnValue

El resultado del casting.

## Ver también

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Convierte el tipo de origen al tipo de resultado usando una conversión explícita. Se usa para desempaquetar un objeto a nullable.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::UnboxingToNullable, Result> System::ExplicitCast(const Source &value)
```


| Parámetro | Descripción |
| --- | --- |
| Origen | El tipo de origen. |
| Result | El tipo de resultado. |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) para convertir. |

### ReturnValue

El resultado del casting.

## Ver también

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Convierte el tipo de origen al tipo de resultado usando una conversión explícita. Se usa para empaquetar nullable.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::NullableBoxing, Result> System::ExplicitCast(const Source &value)
```


| Parámetro | Descripción |
| --- | --- |
| Origen | El tipo de origen. |
| Result | El tipo de resultado. |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) para convertir. |

### ReturnValue

El resultado del casting.

## Ver también

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Convierte el tipo de origen al tipo de resultado usando una conversión explícita. Se usa para desempaquetar un objeto nullable.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::NullableUnboxing, Result> System::ExplicitCast(const Source &value)
```


| Parámetro | Descripción |
| --- | --- |
| Origen | El tipo de origen. |
| Result | El tipo de resultado. |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) para convertir. |

### ReturnValue

El resultado del casting.

## Ver también

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Convierte el tipo de origen al tipo de resultado usando una conversión explícita. Se usa para empaquetar enumeraciones.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::EnumBoxing, SmartPtr<BoxedValueBase>> System::ExplicitCast(const Source &value)
```


| Parámetro | Descripción |
| --- | --- |
| Origen | El tipo de origen. |
| Result | El tipo de resultado. |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) para convertir. |

### ReturnValue

El resultado del casting.

## Ver también

* Class [SmartPtr](../smartptr/)
* Class [BoxedValueBase](../boxedvaluebase/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Convierte el tipo de origen al tipo de resultado usando una conversión explícita. Se usa para copiar tipos de valor al montón cuando el tipo de valor debe referenciarse como puntero inteligente (en genéricos limitados con un tipo de interfaz pero especializados con una estructura que implementa esa interfaz).

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::HeapifyBoxing, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Parámetro | Descripción |
| --- | --- |
| Origen | El tipo de origen. |
| Result | El tipo de resultado. |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) para convertir. |

### ReturnValue

El resultado del casting.

## Ver también

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Convierte el tipo de origen al tipo de resultado usando una conversión explícita. Se usa para obtener interfaces de tipos de valor.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InterfaceBoxing, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Parámetro | Descripción |
| --- | --- |
| Origen | El tipo de origen. |
| Result | El tipo de resultado. |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) para convertir. |

### ReturnValue

El resultado del casting.

## Ver también

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Convierte el tipo de origen al tipo de resultado usando una conversión explícita. Se usa para empaquetado común.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Boxing, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Parámetro | Descripción |
| --- | --- |
| Origen | El tipo de origen. |
| Result | El tipo de resultado. |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) para convertir. |

### ReturnValue

El resultado del casting.

## Ver también

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Convierte el tipo de origen al tipo de resultado usando una conversión explícita. Se usa para empaquetar [System::String](../string/).

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::StringBoxing, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Parámetro | Descripción |
| --- | --- |
| Origen | El tipo de origen. |
| Result | El tipo de resultado. |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) para convertir. |

### ReturnValue

El resultado del casting.

## Ver también

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Convierte el tipo de origen al tipo de resultado usando una conversión explícita. Se usa para desempaquetar interfaces.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InterfaceUnboxing, Result> System::ExplicitCast(const Source &value)
```


| Parámetro | Descripción |
| --- | --- |
| Origen | El tipo de origen. |
| Result | El tipo de resultado. |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) para convertir. |

### ReturnValue

El resultado del casting.

## Ver también

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Convierte el tipo de origen al tipo de resultado usando una conversión explícita. Se usa para desempaquetado común.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Unboxing, Result> System::ExplicitCast(const Source &value)
```


| Parámetro | Descripción |
| --- | --- |
| Origen | El tipo de origen. |
| Result | El tipo de resultado. |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) para convertir. |

### ReturnValue

El resultado del casting.

## Ver también

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Convierte el tipo de origen al tipo de resultado usando una conversión explícita. Se usa para conversiones a nullptr.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Null, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Parámetro | Descripción |
| --- | --- |
| Origen | El tipo de origen. |
| Result | El tipo de resultado. |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) para convertir. |

### ReturnValue

El resultado del casting.

## Ver también

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Convierte el tipo de origen al tipo de resultado usando una conversión explícita. Se usa para convertir entre matrices.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Array, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Parámetro | Descripción |
| --- | --- |
| Origen | El tipo de origen. |
| Result | El tipo de resultado. |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) para convertir. |

### ReturnValue

El resultado del casting.

## Ver también

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(Source) method


Convierte el tipo de origen al tipo de resultado usando una conversión explícita. Se usa cuando se convierte un puntero crudo a puntero inteligente.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::RawPointer, typename CastResult<std::remove_pointer_t<Result>>::type> System::ExplicitCast(Source value)
```


| Parámetro | Descripción |
| --- | --- |
| Origen | El tipo de origen. |
| Result | El tipo de resultado. |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | Source | [Object](../object/) para convertir. |

### ReturnValue

El resultado del casting.

## Ver también

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
