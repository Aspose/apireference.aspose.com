---
title: "System::ObjectExt::UnknownIsNull method"
linktitle: "UnknownIsNull"
second_title: "Aspose.Page voor C++"
description: "System::ObjectExt::UnknownIsNull method. Controleert of een object van onbekend type nullptr is. Overload voor niet-schaalare types in C++."
type: docs
weight: 1700
url: /nl/cpp/system/objectext/unknownisnull/
---
## ObjectExt::UnknownIsNull(T) method


Controleert of een object van onbekend type nullptr is. Overload voor niet-schaalbare typen.

```cpp
template<typename T> static std::enable_if<!std::is_scalar<T>::value, bool>::type System::ObjectExt::UnknownIsNull(T obj)
```


| Parameter | Beschrijving |
| --- | --- |
| T | [Object](../../object/) type. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | T | [Object](../../object/) om te controleren. |

### ReturnValue

Waar als 'obj == nullptr' waar is, anders onwaar.

## Zie ook

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::UnknownIsNull(T) method


Controleert of een object van onbekend type nullptr is. Overload voor schaalbare typen.

```cpp
template<typename T> static std::enable_if<std::is_scalar<T>::value, bool>::type System::ObjectExt::UnknownIsNull(T obj)
```


| Parameter | Beschrijving |
| --- | --- |
| T | [Object](../../object/) type. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | T | [Object](../../object/) om te controleren. |

### ReturnValue

Geeft altijd false terug.

## Zie ook

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
