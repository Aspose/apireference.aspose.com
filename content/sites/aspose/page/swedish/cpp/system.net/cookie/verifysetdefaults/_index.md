---
title: "System::Net::Cookie::VerifySetDefaults metod"
linktitle: "VerifySetDefaults"
second_title: "Aspose.Page för C++"
description: "System::Net::Cookie::VerifySetDefaults metod. Verifierar och sätter standardattributets värden i C++."
type: docs
weight: 4200
url: /sv/cpp/system.net/cookie/verifysetdefaults/
---
## Cookie::VerifySetDefaults method


Verifierar och sätter standardattributens värden.

```cpp
bool System::Net::Cookie::VerifySetDefaults(CookieVariant variant, System::SharedPtr<Uri> uri, bool isLocalDomain, String localDomain, bool setDefault, bool shouldThrow)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| variant | CookieVariant | Kakans specifikation. |
| uri | System::SharedPtr\<Uri\> | Den Uri-klassinstansen som används för att initiera de interna fälten. |
| isLocalDomain | bool | Ett värde som indikerar om kakan placeras i den lokala domänen. |
| localDomain | String | Ett lokalt domännamn. |
| setDefault | bool | Ett värde som indikerar om kakans attribut måste initieras med sina standardvärden. |
| shouldThrow | bool | Ett värde som indikerar om ett undantag ska kastas när de angivna värdena är ogiltiga. |

### ReturnValue

Sant när alla värden är giltiga, annars falskt.

## Se även

* Enum [CookieVariant](../../cookievariant/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [Cookie](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
