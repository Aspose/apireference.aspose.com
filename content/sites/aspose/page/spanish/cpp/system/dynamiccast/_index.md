---
title: "Método System::DynamicCast"
linktitle: "DynamicCast"
second_title: "Aspose.Page para C++"
description: "Método System::DynamicCast. Realiza un cast dinámico sobre objetos Exception en C++."
type: docs
weight: 16900
url: /es/cpp/system/dynamiccast/
---
## System::DynamicCast(const TFrom\&) method


Realiza un cast dinámico sobre objetos [Exception](../exception/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<IsExceptionWrapper<TFrom>::value &&IsExceptionWrapper<TTo>::value &&(std::is_convertible<TTo, TFrom>::value||std::is_base_of<TTo, TFrom>::value), TTo>::type System::DynamicCast(const TFrom &obj)
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
## System::DynamicCast(SmartPtr\<TFrom\> const\&) method


Realiza un casting dinámico en objetos [SmartPtr](../smartptr/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<!std::is_enum<TTo>::value &&!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::DynamicCast(SmartPtr<TFrom> const &obj)
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
## System::DynamicCast(SmartPtr\<TFrom\>) method


Desempaqueta un enum encapsulado mediante cast.

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_enum<TTo>::value, TTo>::type System::DynamicCast(SmartPtr<TFrom> obj)
```


| Parámetro | Descripción |
| --- | --- |
| TTo | Tipo de enum objetivo. |
| TFrom | Tipo de puntero de origen. |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> | Puntero al objeto del cual desempaquetar datos. |

### ReturnValue

Valor del enum desempaquetado.

## Deprecated
Left for backwards compatibility. Use ExplicitCast instead.

## Ver también

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::DynamicCast(SmartPtr\<TFrom\>) method


Realiza un casting dinámico de objetos a objetos [Exception](../exception/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_same<System::Object, TFrom>::value &&IsExceptionWrapper<TTo>::value, TTo>::type System::DynamicCast(SmartPtr<TFrom> obj)
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
## System::DynamicCast(std::nullptr_t) method


Realiza una conversión dinámica de objetos nulos.

```cpp
template<typename TTo> CastResult<TTo>::type System::DynamicCast(std::nullptr_t) noexcept
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
## System::DynamicCast(TFrom\&) method


Realiza una conversión dinámica en objetos que no son punteros.

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TFrom>::value &&!IsSmartPtr<TFrom>::value &&std::is_convertible<TTo, TFrom>::value, TTo>::type System::DynamicCast(TFrom &obj)
```


| Parámetro | Descripción |
| --- | --- |
| TTo | Tipo objetivo. |
| TFrom | Tipo de origen. |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| obj | TFrom\& | Objeto de origen. |

### ReturnValue

Resultado de la conversión.

## Deprecated
Left for backwards compatibility. Use ExplicitCast instead.

## Ver también

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::DynamicCast(TFrom) method


Realiza una conversión dinámica de IntPtr a puntero.

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_pointer<TTo>::value &&std::is_same<IntPtr, TFrom>::value, TTo>::type System::DynamicCast(TFrom value) noexcept
```


| Parámetro | Descripción |
| --- | --- |
| TTo | Tipo objetivo. |
| TFrom | Tipo de origen. |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | TFrom | Valor IntPtr de origen. |

### ReturnValue

Resultado de la conversión.

## Deprecated
Left for backwards compatibility. Use ExplicitCast instead.

## Ver también

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
