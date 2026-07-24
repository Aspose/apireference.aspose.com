---
title: "System::ObjectExt::UnknownToObject metodo"
linktitle: "UnknownToObject"
second_title: "Aspose.Page per C++"
description: "System::ObjectExt::UnknownToObject metodo. Converte un tipo sconosciuto in Object, gestendo sia i casi di smart pointer che di tipo valore in C++."
type: docs
weight: 1800
url: /it/cpp/system/objectext/unknowntoobject/
---
## ObjectExt::UnknownToObject(const T\&) method


Converte un tipo sconosciuto in [Object](../../object/), gestendo sia i casi di smart pointer che di tipo valore.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value, System::SmartPtr<Object>>::type System::ObjectExt::UnknownToObject(const T &obj)
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo da convertire in [Object](../../object/). |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | const T\& | [Object](../../object/) da convertire. |

### ReturnValue

Smart pointer a [Object](../../object/) che può essere sia un puntatore convertito sia un valore incapsulato.

## Vedi anche

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::UnknownToObject(T) method


Converte un tipo sconosciuto in [Object](../../object/), gestendo sia i casi di smart pointer che di tipo valore.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value, System::SmartPtr<Object>>::type System::ObjectExt::UnknownToObject(T obj)
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo da convertire in [Object](../../object/). |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | T | [Object](../../object/) da convertire. |

### ReturnValue

Smart pointer a [Object](../../object/) che può essere sia un puntatore convertito sia un valore incapsulato.

## Vedi anche

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
