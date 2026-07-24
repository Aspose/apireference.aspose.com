---
title: "System::Threading::CancellationToken::Register method"
linktitle: "Register"
second_title: "Aspose.Page voor C++"
description: "System::Threading::CancellationToken::Register method. Registreert een callback die wordt aangeroepen wanneer annulering wordt aangevraagd in C++."
type: docs
weight: 400
url: /nl/cpp/system.threading/cancellationtoken/register/
---
## CancellationToken::Register method


Registreert een callback die wordt aangeroepen wanneer annulering wordt aangevraagd.

```cpp
CancellationTokenRegistration System::Threading::CancellationToken::Register(const Action<> &callback) const
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| callback | const Action<>\& | De [Action<>](../../../system/action/) die moet worden uitgevoerd wanneer annulering wordt aangevraagd. |

### ReturnValue

Een [CancellationTokenRegistration](../../cancellationtokenregistration/) object dat kan worden gebruikt om de callback af te melden.
## Opmerkingen



Als annulering al is aangevraagd, wordt de callback onmiddellijk aangeroepen.

## Zie ook

* Class [CancellationTokenRegistration](../../cancellationtokenregistration/)
* Typedef [Action](../../../system/action/)
* Class [CancellationToken](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
