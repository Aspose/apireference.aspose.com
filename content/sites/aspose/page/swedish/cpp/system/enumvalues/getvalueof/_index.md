---
title: "System::EnumValues::GetValueOf metod"
linktitle: "GetValueOf"
second_title: "Aspose.Page för C++"
description: "System::EnumValues::GetValueOf metod. Returnerar det inlåsta värdet av enum‑konstanten med det angivna namnet i C++."
type: docs
weight: 500
url: /sv/cpp/system/enumvalues/getvalueof/
---
## EnumValues::GetValueOf(const String\&, bool) const method


Returnerar det inlåsta värdet av enum-konstanten med det angivna namnet.

```cpp
virtual SharedPtr<Object> System::EnumValues<E, Guard>::GetValueOf(const String &str, bool ignoreCase) const override
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| str | const String\& | Namnet på enum‑konstanten |
| ignoreCase | bool | Anger om skiftläget ska ignoreras när namnet på enum‑konstanten tolkas |

### ReturnValue

Ett inbäddat värde av enum‑konstanten vars namn anges i **str**.

## Se även

* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [String](../../string/)
* Class [EnumValues](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## EnumValues::GetValueOf(long) const method


Returnerar det inlåsta värdet av enum‑konstanten med det angivna värdet.

```cpp
virtual SharedPtr<Object> System::EnumValues<E, Guard>::GetValueOf(long val) const override
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| val | long | Värdet för enum‑konstanten |

### ReturnValue

Ett inbäddat värde av enum‑konstanten vars värde anges i **str**.

## Se även

* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [EnumValues](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
