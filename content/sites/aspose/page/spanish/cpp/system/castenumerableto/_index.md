---
title: "System::CastEnumerableTo método."
linktitle: "CastEnumerableTo"
second_title: "Aspose.Page para C++"
description: "System::CastEnumerableTo método. Realiza la conversión explícita de los elementos del objeto enumerable especificado a un tipo diferente en C++."
type: docs
weight: 15500
url: /es/cpp/system/castenumerableto/
---
## System::CastEnumerableTo(const From\&) method


Realiza la conversión explícita de los elementos del objeto enumerable especificado a un tipo diferente.

```cpp
template<class To,class From> std::enable_if<!System::detail::has_method_get_Count<From>::value, Collections::Generic::ListPtr<To>>::type System::CastEnumerableTo(const From &enumerable)
```


| Parámetro | Descripción |
| --- | --- |
| A | El tipo al que se deben convertir estáticamente los elementos del objeto enumerable |
| From | El tipo del objeto enumerable |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| enumerable | const From\& | Objeto Enumerable que contiene los elementos a convertir |

### ReturnValue

Un puntero a una nueva colección que contiene elementos del tipo **To** equivalentes a los elementos de **enumerable**

## Ver también

* Class [ListPtr](../../system.collections.generic/listptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::CastEnumerableTo(const From\&) method


Realiza la conversión explícita de los elementos del objeto enumerable especificado a un tipo diferente.

```cpp
template<class To,class From> std::enable_if<System::detail::has_method_get_Count<From>::value, Collections::Generic::ListPtr<To>>::type System::CastEnumerableTo(const From &enumerable)
```


| Parámetro | Descripción |
| --- | --- |
| A | El tipo al que se deben convertir estáticamente los elementos del objeto enumerable |
| From | El tipo del objeto enumerable |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| enumerable | const From\& | es heredero de un objeto Enumerable con el método get_Count definido y que contiene los elementos a convertir |

### ReturnValue

Un puntero a una nueva colección que contiene elementos del tipo **To** equivalentes a los elementos de **enumerable**

## Ver también

* Class [ListPtr](../../system.collections.generic/listptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
