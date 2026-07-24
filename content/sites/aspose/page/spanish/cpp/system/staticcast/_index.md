---
title: "System::StaticCast método"
linktitle: "StaticCast"
second_title: "Aspose.Page para C++"
description: "System::StaticCast método. Realiza una conversión estática en objetos que no son punteros en C++."
type: docs
weight: 38500
url: /es/cpp/system/staticcast/
---
## System::StaticCast(const TFrom\&) method


Realiza una conversión estática en objetos que no son punteros.

```cpp
template<typename TTo,typename TFrom> std::enable_if<!std::is_same<TFrom, System::String>::value &&!IsExceptionWrapper<TFrom>::value &&!IsSmartPtr<TFrom>::value &&!std::is_arithmetic<TFrom>::value, TTo>::type System::StaticCast(const TFrom &obj)
```


| Parámetro | Descripción |
| --- | --- |
| TTo | Tipo objetivo. |
| TFrom | Tipo de origen. |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| obj | const TFrom\& | Objeto de origen. |

### ReturnValue

Resultado del cast si el cast está permitido.

## Deprecated
Left for backwards compatibility. Use ExplicitCast instead.

## Ver también

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(const TFrom\&) method


Realiza una conversión estática de objetos [Exception](../exception/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<IsExceptionWrapper<TFrom>::value &&IsExceptionWrapper<TTo>::value &&(std::is_convertible<TTo, TFrom>::value||std::is_base_of<TTo, TFrom>::value), TTo>::type System::StaticCast(const TFrom &obj)
```


| Parámetro | Descripción |
| --- | --- |
| TTo | Tipo de [Exception](../exception/) de destino. |
| TFrom | Tipo de [Exception](../exception/) de origen. |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| obj | const TFrom\& | Puntero de origen. |

### ReturnValue

Resultado del cast si el cast está permitido.

## Deprecated
Left for backwards compatibility. Use ExplicitCast instead.

## Ver también

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(const TFrom *) method


Specialization for arithmetic types.

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_arithmetic<TFrom>::value, TTo>::type System::StaticCast(const TFrom *value)
```

## Ver también

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(SmartPtr\<TFrom\> const\&) method


Realiza una conversión estática de objetos [SmartPtr](../smartptr/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::StaticCast(SmartPtr<TFrom> const &obj)
```


| Parámetro | Descripción |
| --- | --- |
| TTo | Tipo de puntero objetivo. |
| TFrom | Tipo de puntero de origen. |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | Puntero de origen. |

### ReturnValue

Resultado del cast si el cast está permitido.

## Deprecated
Left for backwards compatibility. Use ExplicitCast instead.

## Ver también

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(SmartPtr\<TFrom\>) method


Realiza una conversión estática de Objects a objetos [Exception](../exception/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_same<System::Object, TFrom>::value &&IsExceptionWrapper<TTo>::value, TTo>::type System::StaticCast(SmartPtr<TFrom> obj) noexcept
```


| Parámetro | Descripción |
| --- | --- |
| TTo | Tipo de [Exception](../exception/) de destino. |
| TFrom | Tipo [Object](../object/). |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> | Puntero de origen. |

### ReturnValue

Resultado del cast si el cast está permitido.

## Deprecated
Left for backwards compatibility. Use ExplicitCast instead.

## Ver también

* Class [Object](../object/)
* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(std::nullptr_t) method


Performs static cast of null objects.

```cpp
template<typename TTo> CastResult<TTo>::type System::StaticCast(std::nullptr_t)
```


| Parámetro | Descripción |
| --- | --- |
| TTo | Tipo de puntero objetivo. |

### ReturnValue

nullptr.

## Deprecated
Left for backwards compatibility. Use ExplicitCast instead.

## Ver también

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(TFrom) method


Specialization for arithmetic types.

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_arithmetic<TFrom>::value, TTo>::type System::StaticCast(TFrom value)
```

## Ver también

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(TTo) method


Proceso de conversión de [String](../string/) a [String](../string/).

```cpp
template<typename TTo> std::enable_if<std::is_same<TTo, System::String>::value, TTo>::type System::StaticCast(TTo value)
```

## Ver también

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(WeakPtr\<TFrom\> const\&) method


Realiza una conversión estática sobre objetos [WeakPtr](../weakptr/).

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::StaticCast(WeakPtr<TFrom> const &obj)
```


| Parámetro | Descripción |
| --- | --- |
| TTo | Tipo de puntero objetivo. |
| TFrom | Tipo de puntero de origen. |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| obj | WeakPtr\<TFrom\> const\& | Puntero de origen. |

### ReturnValue

Resultado del cast si el cast está permitido.

## Deprecated
Left for backwards compatibility. Use ExplicitCast instead.

## Ver también

* Class [WeakPtr](../weakptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
