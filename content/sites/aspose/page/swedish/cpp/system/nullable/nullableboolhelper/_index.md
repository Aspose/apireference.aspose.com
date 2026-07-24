---
title: "System::Nullable::NullableBoolHelper metod"
linktitle: "NullableBoolHelper"
second_title: "Aspose.Page för C++"
description: "System::Nullable::NullableBoolHelper metod. Hjälpfunktion för att kontrollera om **this** och **other** båda är icke‑null och anropa ett lambda‑uttryck om så är fallet. Används i implementationer i C++."
type: docs
weight: 800
url: /sv/cpp/system/nullable/nullableboolhelper/
---
## Nullable::NullableBoolHelper method


Hjälpfunktion för att kontrollera om detta och **other** båda är icke‑null och anropa ett lambda‑uttryck om så är fallet. Används i implementationer.

```cpp
template<typename T1> bool System::Nullable<T>::NullableBoolHelper(const T1 &other, const std::function<bool()> &f, bool default_if_both_are_null=false) const
```


| Parameter | Beskrivning |
| --- | --- |
| T1 | Annan nullable-typ. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| annat | const T1\& | Annan nullable‑värde att jämföra med. |
| f | const std::function\<bool()>\& | Lambda att anropa om både **this** och **other** inte är null. |
| default_if_both_are_null | bool | Returvärde om båda värdena är null. |

### ReturnValue

false om antingen **this** eller **other** är null; **default_if_both_are_null** om båda är null; resultatet av **f**‑anropet om båda inte är null.

## Se även

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
