---
title: "Método System::ObjectExt::Box"
linktitle: "Box"
second_title: "Aspose.Page para C++"
description: "Método System::ObjectExt::Box. Empaqueta valores de cadena en C++."
type: docs
weight: 200
url: /es/cpp/system/objectext/box/
---
## ObjectExt::Box(const String\&) method


Encapsula valores de cadena.

```cpp
SmartPtr<Object> System::ObjectExt::Box(const String &value)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | const String\& | Valor para empaquetar. |

### ReturnValue

Valor empaquetado o null, si la cadena de origen es null.

## Ver también

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Box(const T\&) method


Empaqueta tipos de valor para convertir a [Object](../../object/). Implementación para tipos enum.

```cpp
template<typename T> static std::enable_if<std::is_enum<T>::value, System::SmartPtr<System::Object>>::type System::ObjectExt::Box(const T &value)
```


| Parámetro | Descripción |
| --- | --- |
| T | Tipo [Enum](../../enum/). |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | const T\& | Valor [Enum](../../enum/) para empaquetar. |

### ReturnValue

Puntero inteligente a objeto que mantiene el valor empaquetado.

## Ver también

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Box(const T\&) method


Empaqueta tipos de valor para convertir a [Object](../../object/). Implementación para tipos no enum.

```cpp
template<typename T> static std::enable_if<!std::is_enum<T>::value &&!IsNullable<T>::value, System::SmartPtr<System::Object>>::type System::ObjectExt::Box(const T &value)
```


| Parámetro | Descripción |
| --- | --- |
| T | Tipo de valor. |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | const T\& | Valor para empaquetar. |

### ReturnValue

Puntero inteligente a objeto que mantiene el valor empaquetado.

## Ver también

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Box(const T\&) method


Empaqueta tipos [Nullable](../../nullable/) para convertir a [Object](../../object/).

```cpp
template<typename T> static std::enable_if<IsNullable<T>::value, System::SmartPtr<System::Object>>::type System::ObjectExt::Box(const T &value)
```


| Parámetro | Descripción |
| --- | --- |
| T | Tipo de valor. |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | const T\& | Valor para empaquetar. |

### ReturnValue

Puntero inteligente a objeto que mantiene el valor empaquetado.

## Ver también

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
