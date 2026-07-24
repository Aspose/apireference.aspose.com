---
title: "System::ObjectExt::ObjectToUnknown-methode"
linktitle: "ObjectToUnknown"
second_title: "Aspose.Page voor C++"
description: "System::ObjectExt::ObjectToUnknown-methode. Converteert Object naar onbekend type, waarbij zowel smart pointer-type als geboxte waardesituaties in C++ worden afgehandeld."
type: docs
weight: 1200
url: /nl/cpp/system/objectext/objecttounknown/
---
## ObjectExt::ObjectToUnknown(SmartPtr\<Object\>) method


Converteert [Object](../../object/) naar onbekend type, waarbij zowel smart pointer-type als geboxte waardesituaties worden afgehandeld.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value, T>::type System::ObjectExt::ObjectToUnknown(SmartPtr<Object> obj)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Type om [Object](../../object/) naar te converteren. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | SmartPtr\<Object\> | [Object](../../object/) om te converteren. |

### ReturnValue

Ofwel unboxte waarde of geconverteerde pointer.

## Zie ook

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ObjectToUnknown(SmartPtr\<Object\>) method


Converteert [Object](../../object/) naar onbekend type, waarbij zowel smart pointer-type als geboxte waardesituaties worden afgehandeld.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value, T>::type System::ObjectExt::ObjectToUnknown(SmartPtr<Object> obj)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Type om [Object](../../object/) naar te converteren. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | SmartPtr\<Object\> | [Object](../../object/) om te converteren. |

### ReturnValue

Ofwel unboxte waarde of geconverteerde pointer.

## Zie ook

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
