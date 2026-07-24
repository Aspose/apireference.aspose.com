---
title: "Método System::Default"
linktitle: "Default"
second_title: "Aspose.Page para C++"
description: "Método System::Default. Devuelve la referencia a la única instancia construida por defecto del tipo de excepción en C++."
type: docs
weight: 16200
url: /es/cpp/system/default/
---
## System::Default() method


Devuelve la referencia a la única instancia construida por defecto del tipo de excepción.

```cpp
template<typename T> std::enable_if<IsExceptionWrapper<T>::value, constT &>::type System::Default()
```


| Parámetro | Descripción |
| --- | --- |
| T | El tipo cuya instancia se devuelve |

## Ver también

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Default() method


Devuelve la referencia a la única instancia construida por defecto del tipo no excepción.

```cpp
template<typename T> std::enable_if<!IsExceptionWrapper<T>::value, constT &>::type System::Default()
```


| Parámetro | Descripción |
| --- | --- |
| T | El tipo cuya instancia se devuelve |

## Ver también

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
