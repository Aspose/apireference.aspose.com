---
title: "Método System::StaticCastArray"
linktitle: "StaticCastArray"
second_title: "Aspose.Page para C++"
description: "Método System::StaticCastArray. Realiza el casting de los elementos del arreglo especificado a un tipo diferente. Sobrescribe para casos en los que From es un objeto SmartPtr en C++."
type: docs
weight: 39800
url: /es/cpp/system/staticcastarray/
---
## System::StaticCastArray(const System::SharedPtr\<System::Array\<From\>\>\&) method


Realiza el casting de los elementos del arreglo especificado a un tipo diferente. Sobrescribe para casos en los que From es un objeto [SmartPtr](../smartptr/).

```cpp
template<typename To,typename From> std::enable_if_t<System::IsSmartPtr<From>::value, System::SharedPtr<System::Array<To>>> System::StaticCastArray(const System::SharedPtr<System::Array<From>> &from)
```


| Parámetro | Descripción |
| --- | --- |
| A | El tipo al que se convertirán los elementos del array especificado |
| From | El tipo de los elementos del array cuyos elementos se van a convertir |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| from | const System::SharedPtr\<System::Array\<From\>\>\& | Puntero compartido al array que contiene los elementos a convertir |

### ReturnValue

Un puntero a un nuevo array que contiene elementos del tipo **To** equivalentes a los elementos de **from**

## Deprecated
Añadido para compatibilidad retroactiva. Use ExplicitCast en su lugar.

## Ver también

* Typedef [SharedPtr](../sharedptr/)
* Class [Array](../array/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCastArray(const System::SharedPtr\<System::Array\<From\>\>\&) method


Realiza el casting de los elementos del arreglo especificado a un tipo diferente. Sobrescribe para casos en los que From es Boxable y To es [Object](../object/)[].

```cpp
template<typename To,typename From> std::enable_if_t<!System::IsSmartPtr<From>::value &&System::IsBoxable<From>::value &&std::is_same<To, System::SharedPtr<Object>>::value, System::SharedPtr<System::Array<To>>> System::StaticCastArray(const System::SharedPtr<System::Array<From>> &from)
```


| Parámetro | Descripción |
| --- | --- |
| A | El tipo al que se convertirán los elementos del array especificado |
| From | El tipo de los elementos del array cuyos elementos se van a convertir |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| from | const System::SharedPtr\<System::Array\<From\>\>\& | Puntero compartido al array que contiene los elementos a convertir |

### ReturnValue

Un puntero a un nuevo array que contiene elementos del tipo **To** equivalentes a los elementos de **from**

## Deprecated
Añadido para compatibilidad retroactiva. Use ExplicitCast en su lugar.

## Ver también

* Typedef [SharedPtr](../sharedptr/)
* Class [Object](../object/)
* Class [Array](../array/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
