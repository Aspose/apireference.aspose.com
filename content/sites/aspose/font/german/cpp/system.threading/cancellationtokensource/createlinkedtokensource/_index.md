---
title: "System::Threading::CancellationTokenSource::CreateLinkedTokenSource Methode"
linktitle: "CreateLinkedTokenSource"
second_title: "Aspose.Font für C++"
description: "System::Threading::CancellationTokenSource::CreateLinkedTokenSource Methode. Erstellt eine verknüpfte Tokenquelle, die abbricht, wenn einer der bereitgestellten Tokens in C++ abbricht."
type: docs
weight: 600
url: /de/cpp/system.threading/cancellationtokensource/createlinkedtokensource/
---
## CancellationTokenSource::CreateLinkedTokenSource method


Erstellt eine verknüpfte Token-Quelle, die abbricht, wenn einer der bereitgestellten Tokens abbricht.

```cpp
static SharedPtr<CancellationTokenSource> System::Threading::CancellationTokenSource::CreateLinkedTokenSource(const CancellationToken &token1, const CancellationToken &token2)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| token1 | const CancellationToken\& | Erstes Abbruch-Token zum Überwachen. |
| token2 | const CancellationToken\& | Zweites Abbruch-Token zum Überwachen. |

### ReturnValue

Neue Tokenquelle, die abbricht, wenn eines der Eingabe‑Tokens abbricht.
## Hinweise



Die zurückgegebene Quelle wird sofort abbrechen, wenn eines der Eingabe‑Tokens bereits abgebrochen ist.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [CancellationTokenSource](../)
* Class [CancellationToken](../../cancellationtoken/)
* Class [CancellationTokenSource](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
