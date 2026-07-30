---
title: "System::Threading::CancellationToken::Register Methode"
linktitle: "Registrieren"
second_title: "Aspose.Font für C++"
description: "System::Threading::CancellationToken::Register-Methode. Registriert einen Rückruf, der aufgerufen wird, wenn in C++ eine Abbruchanforderung gestellt wird."
type: docs
weight: 400
url: /de/cpp/system.threading/cancellationtoken/register/
---
## CancellationToken::Register method


Registriert einen Rückruf, der aufgerufen wird, wenn ein Abbruch angefordert wird.

```cpp
CancellationTokenRegistration System::Threading::CancellationToken::Register(const Action<> &callback) const
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| callback | const Action<>\& | Die [Action<>](../../../system/action/), die ausgeführt wird, wenn eine Abbruchanforderung gestellt wird. |

### ReturnValue

Ein [CancellationTokenRegistration](../../cancellationtokenregistration/)-Objekt, das verwendet werden kann, um den Rückruf abzumelden.
## Hinweise



Wenn bereits eine Abbruchanforderung gestellt wurde, wird der Rückruf sofort aufgerufen.

## Siehe auch

* Class [CancellationTokenRegistration](../../cancellationtokenregistration/)
* Typedef [Action](../../../system/action/)
* Class [CancellationToken](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
