---
title: "Método System::Ref"
linktitle: "Ref"
second_title: "Aspose.Page para C++"
description: "Método System::Ref. Contenedor para asegurar que Ref(std::ref(DynamicWeakPtr)) funcione en C++."
type: docs
weight: 36600
url: /es/cpp/system/ref/
---
## System::Ref(const std::reference_wrapper\<T\>\&) method


Contenedor para asegurar que Ref(std::ref(DynamicWeakPtr)) funcione.

```cpp
template<typename T> decltype(Ref(std::declval<T &>())) System::Ref(const std::reference_wrapper<T> &wrapper)
```


| Parámetro | Descripción |
| --- | --- |
| T | Tipo referenciado. |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| envoltorio | const std::reference_wrapper\<T\>\& | envoltorio std para desempaquetar. |

### ReturnValue

Tipo de referencia definido en [System](../):: en lugar de en std.

## Ver también

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Ref(DynamicWeakPtr\<T, trunkMode, weakLeafs...\>\&) method


Crea una referencia al objeto [DynamicWeakPtr](../dynamicweakptr/). Utilizado por el traductor al pasar argumentos de función por referencia.

```cpp
template<typename T,SmartPtrMode,unsigned int ...> DynamicWeakPtr<T, trunkMode, weakLeafs...>::Reference System::Ref(DynamicWeakPtr<T, trunkMode, weakLeafs...> &ptr)
```


| Parámetro | Descripción |
| --- | --- |
| T | Tipo apuntado. |
| trunkMode | Modo del puntero inteligente en sí. |
| weakLeafs | Índices de los argumentos de plantilla para los cuales se debe llamar al método SetTemplateWeakPtr. |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| ptr | DynamicWeakPtr\<T, trunkMode, weakLeafs...\>\& | Puntero inteligente para crear una referencia a. |

### ReturnValue

Referencia de puntero inteligente.

## Ver también

* Class [DynamicWeakPtr](../dynamicweakptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Ref(T\&) method


Función auxiliar para obtener referencias a objetos. Se utiliza para garantizar que [System::DynamicWeakPtr](../dynamicweakptr/) actualice el objeto referenciado después de las asignaciones.

```cpp
template<typename T> T & System::Ref(T &value)
```


| Parámetro | Descripción |
| --- | --- |
| T | Tipo para crear una referencia a. |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | T\& | Valor para crear una referencia a. |

### ReturnValue

Referencia al valor pasado a esta función.

## Ver también

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
