---
title: "System::ObjectExt::UnknownToObject metod"
linktitle: "UnknownToObject"
second_title: "Aspose.Page för C++"
description: "System::ObjectExt::UnknownToObject metod. Konverterar en okänd typ till Object och hanterar både smartpekartyp och värdetypssituationer i C++."
type: docs
weight: 1800
url: /sv/cpp/system/objectext/unknowntoobject/
---
## ObjectExt::UnknownToObject(const T\&) method


Konverterar en okänd typ till [Object](../../object/), och hanterar både smartpekartyp och värdetypssituationer.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value, System::SmartPtr<Object>>::type System::ObjectExt::UnknownToObject(const T &obj)
```


| Parameter | Beskrivning |
| --- | --- |
| T | Typ att konvertera till [Object](../../object/). |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| obj | const T\& | [Object](../../object/) att konvertera. |

### ReturnValue

Smartpekare till [Object](../../object/) som antingen är en konverterad pekare eller ett inbäddat värde.

## Se även

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::UnknownToObject(T) method


Konverterar en okänd typ till [Object](../../object/), och hanterar både smartpekartyp och värdetypssituationer.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value, System::SmartPtr<Object>>::type System::ObjectExt::UnknownToObject(T obj)
```


| Parameter | Beskrivning |
| --- | --- |
| T | Typ att konvertera till [Object](../../object/). |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| obj | T | [Object](../../object/) att konvertera. |

### ReturnValue

Smartpekare till [Object](../../object/) som antingen är en konverterad pekare eller ett inbäddat värde.

## Se även

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
