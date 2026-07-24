---
title: "System::EnumValuesBase::Parse‑metod"
linktitle: "Analysera"
second_title: "Aspose.Page för C++"
description: "System::EnumValuesBase::Parse‑metod. Returnerar ett objekt som representerar ett värde av uppräkningskonstanten för den angivna uppräkningstypen med det angivna namnet i C++."
type: docs
weight: 400
url: /sv/cpp/system/enumvaluesbase/parse/
---
## EnumValuesBase::Parse method


Returnerar ett objekt som representerar ett värde av en enum‑konstant för den angivna uppräkningstypen med det angivna namnet.

```cpp
static SharedPtr<Object> System::EnumValuesBase::Parse(const TypeInfo &type, const String &str, bool ignoreCase)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| type | const TypeInfo\& | Objektet [TypeInfo](../../typeinfo/) som representerar typen av uppräkningsvärdet att returnera |
| str | const String\& | Namnet på enum‑konstanten |
| ignoreCase | bool | Anger om skiftläget ska ignoreras när namnet på enum‑konstanten tolkas |

### ReturnValue

Ett objekt som representerar värdet av enum‑konstanten vars namn anges i **str**.

## Se även

* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [TypeInfo](../../typeinfo/)
* Class [String](../../string/)
* Class [EnumValuesBase](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
