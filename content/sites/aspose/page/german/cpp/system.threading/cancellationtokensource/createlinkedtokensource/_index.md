---
title: "System::Threading::CancellationTokenSource::CreateLinkedTokenSource Methode"
linktitle: "CreateLinkedTokenSource"
second_title: "Aspose.Page für C++"
description: "System::Threading::CancellationTokenSource::CreateLinkedTokenSource Methode. Erstellt eine verknüpfte Token-Quelle, die abbricht, wenn einer der bereitgestellten Tokens in C++ abgebrochen wird."
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
| token1 | const CancellationToken\& | Erstes zu überwachendes Abbruch-Token. |
| token2 | const CancellationToken\& | Zweites zu überwachendes Abbruch-Token. |

### ReturnValue

Neue Token-Quelle, die abbricht, wenn einer der Eingabe-Tokens abbricht.
## Hinweise



Die zurückgegebene Quelle bricht sofort ab, wenn einer der Eingabe-Tokens bereits abgebrochen ist.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [CancellationTokenSource](../)
* Class [CancellationToken](../../cancellationtoken/)
* Class [CancellationTokenSource](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
