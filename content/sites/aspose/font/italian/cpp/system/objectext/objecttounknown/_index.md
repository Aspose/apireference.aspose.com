---
title: "System::ObjectExt::ObjectToUnknown method"
linktitle: "ObjectToUnknown"
second_title: "Aspose.Font per C++"
description: "System::ObjectExt::ObjectToUnknown method. Converte Object in un tipo sconosciuto, gestendo sia il tipo smart pointer sia le situazioni di valore boxed in C++."
type: docs
weight: 1300
url: /it/cpp/system/objectext/objecttounknown/
---
## ObjectExt::ObjectToUnknown(SmartPtr\<Object\>) method


Converte [Object](../../object/) in un tipo sconosciuto, gestendo sia il tipo smart pointer sia le situazioni di valore boxed.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value, T>::type System::ObjectExt::ObjectToUnknown(SmartPtr<Object> obj)
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo in cui convertire [Object](../../object/). |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | SmartPtr\<Object\> | [Object](../../object/) da convertire. |

### ReturnValue

Valore non incapsulato o puntatore convertito.

## Vedi anche

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::ObjectToUnknown(SmartPtr\<Object\>) method


Converte [Object](../../object/) in un tipo sconosciuto, gestendo sia il tipo smart pointer sia le situazioni di valore boxed.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value, T>::type System::ObjectExt::ObjectToUnknown(SmartPtr<Object> obj)
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo in cui convertire [Object](../../object/). |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | SmartPtr\<Object\> | [Object](../../object/) da convertire. |

### ReturnValue

Valore non incapsulato o puntatore convertito.

## Vedi anche

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
