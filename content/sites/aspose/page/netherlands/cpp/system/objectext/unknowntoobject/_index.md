---
title: "System::ObjectExt::UnknownToObject method"
linktitle: "UnknownToObject"
second_title: "Aspose.Page voor C++"
description: "System::ObjectExt::UnknownToObject method. Converteert een onbekend type naar Object, waarbij zowel smart pointer- als waardetype-situaties in C++ worden afgehandeld."
type: docs
weight: 1800
url: /nl/cpp/system/objectext/unknowntoobject/
---
## ObjectExt::UnknownToObject(const T\&) method


Converteert een onbekend type naar [Object](../../object/), waarbij zowel smart pointer- als waardetype-situaties worden afgehandeld.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value, System::SmartPtr<Object>>::type System::ObjectExt::UnknownToObject(const T &obj)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Typ om te converteren naar [Object](../../object/). |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | const T\& | [Object](../../object/) om te converteren. |

### ReturnValue

Slimme pointer naar [Object](../../object/) die of een geconverteerde pointer of een verpakte waarde is.

## Zie ook

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::UnknownToObject(T) method


Converteert een onbekend type naar [Object](../../object/), waarbij zowel smart pointer- als waardetype-situaties worden afgehandeld.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value, System::SmartPtr<Object>>::type System::ObjectExt::UnknownToObject(T obj)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Typ om te converteren naar [Object](../../object/). |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | T | [Object](../../object/) om te converteren. |

### ReturnValue

Slimme pointer naar [Object](../../object/) die of een geconverteerde pointer of een verpakte waarde is.

## Zie ook

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
