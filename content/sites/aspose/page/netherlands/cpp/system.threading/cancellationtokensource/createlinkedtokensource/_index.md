---
title: "System::Threading::CancellationTokenSource::CreateLinkedTokenSource methode"
linktitle: "CreateLinkedTokenSource"
second_title: "Aspose.Page voor C++"
description: "System::Threading::CancellationTokenSource::CreateLinkedTokenSource methode. Maakt een gekoppelde tokenbron die wordt geannuleerd wanneer een van de opgegeven tokens wordt geannuleerd in C++."
type: docs
weight: 600
url: /nl/cpp/system.threading/cancellationtokensource/createlinkedtokensource/
---
## CancellationTokenSource::CreateLinkedTokenSource method


Maakt een gekoppelde tokenbron die annuleert wanneer een van de opgegeven tokens annuleert.

```cpp
static SharedPtr<CancellationTokenSource> System::Threading::CancellationTokenSource::CreateLinkedTokenSource(const CancellationToken &token1, const CancellationToken &token2)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| token1 | const CancellationToken\& | Eerste annulerings-token om te monitoren. |
| token2 | const CancellationToken\& | Tweede annulerings-token om te monitoren. |

### ReturnValue

Nieuwe tokenbron die annuleert wanneer een van de invoertokens annuleert.
## Opmerkingen



De geretourneerde bron zal onmiddellijk annuleren als een van de invoertokens al geannuleerd is.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [CancellationTokenSource](../)
* Class [CancellationToken](../../cancellationtoken/)
* Class [CancellationTokenSource](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
