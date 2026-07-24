---
title: "System::ObjectExt::ObjectToUnknown metod"
linktitle: "ObjectToUnknown"
second_title: "Aspose.Page för C++"
description: "System::ObjectExt::ObjectToUnknown metod. Konverterar Object till okänd typ och hanterar både smart pekartyper och bpxed‑värdesituationer i C++."
type: docs
weight: 1200
url: /sv/cpp/system/objectext/objecttounknown/
---
## ObjectExt::ObjectToUnknown(SmartPtr\<Object\>) method


Konverterar [Object](../../object/) till okänd typ och hanterar både smart pekartyper och bpxed‑värdesituationer.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value, T>::type System::ObjectExt::ObjectToUnknown(SmartPtr<Object> obj)
```


| Parameter | Beskrivning |
| --- | --- |
| T | Typ att konvertera [Object](../../object/) till. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| obj | SmartPtr\<Object\> | [Object](../../object/) att konvertera. |

### ReturnValue

Antingen avpaketerat värde eller konverterad pekare.

## Se även

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ObjectToUnknown(SmartPtr\<Object\>) method


Konverterar [Object](../../object/) till okänd typ och hanterar både smart pekartyper och boxed‑värdesituationer.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value, T>::type System::ObjectExt::ObjectToUnknown(SmartPtr<Object> obj)
```


| Parameter | Beskrivning |
| --- | --- |
| T | Typ att konvertera [Object](../../object/) till. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| obj | SmartPtr\<Object\> | [Object](../../object/) att konvertera. |

### ReturnValue

Antingen avpaketerat värde eller konverterad pekare.

## Se även

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
