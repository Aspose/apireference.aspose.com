---
title: "System::Nullable::NullableBoolHelper-methode"
linktitle: "NullableBoolHelper"
second_title: "Aspose.Page voor C++"
description: "System::Nullable::NullableBoolHelper-methode. Hulpfunctie om te controleren of zowel **this** als **other** geen null-waarden zijn en in dat geval een lambda aan te roepen. Gebruikt in implementaties in C++."
type: docs
weight: 800
url: /nl/cpp/system/nullable/nullableboolhelper/
---
## Nullable::NullableBoolHelper method


Helperfunctie om te controleren of dit en **other** beide niet null zijn en een lambda aan te roepen indien dat het geval is. Wordt gebruikt in implementatie.s.

```cpp
template<typename T1> bool System::Nullable<T>::NullableBoolHelper(const T1 &other, const std::function<bool()> &f, bool default_if_both_are_null=false) const
```


| Parameter | Beschrijving |
| --- | --- |
| T1 | Ander nullable-type. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| anders | const T1\& | Andere nullable-waarde om mee te vergelijken. |
| f | const std::function\<bool()>\& | Lambda om aan te roepen als zowel **this** als **other** geen null-waarden zijn. |
| default_if_both_are_null | bool | Retourwaarde als beide waarden null zijn. |

### ReturnValue

false als **this** of **other** null is; **default_if_both_are_null** als beide null zijn; resultaat van **f**-aanroep als beide niet null zijn.

## Zie ook

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
