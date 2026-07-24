---
title: "System::SafeInvoke-methode"
linktitle: "SafeInvoke"
second_title: "Aspose.Page voor C++"
description: "System::SafeInvoke-methode. Implementatie van de ''?.''-operatorvertaling in C++."
type: docs
weight: 36900
url: /nl/cpp/system/safeinvoke/
---
## System::SafeInvoke method


Implementatie van de '?.'-operatorvertaling.

```cpp
template<typename T0,typename T1> static auto System::SafeInvoke(T0 expr, T1 func)
```


| Parameter | Beschrijving |
| --- | --- |
| T0 | expressietype. |
| T1 | Type van lambda die de 'WhenTrue'-expressie encapsuleert. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| expr | T0 | expressiewaarde. |
| func | T1 | 'WhenTrue'-expressie gebonden aan functor. |

### ReturnValue

Als de expr-waarde niet null is, wordt func aangeroepen met zijn waarde als eerste argument, anders wordt null geretourneerd.

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
