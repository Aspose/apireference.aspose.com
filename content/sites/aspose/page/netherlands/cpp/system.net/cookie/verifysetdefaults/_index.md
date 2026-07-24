---
title: "System::Net::Cookie::VerifySetDefaults methode"
linktitle: "VerifySetDefaults"
second_title: "Aspose.Page voor C++"
description: "System::Net::Cookie::VerifySetDefaults methode. Verifieert en stelt de standaardwaarden van het attribuut in C++ in."
type: docs
weight: 4200
url: /nl/cpp/system.net/cookie/verifysetdefaults/
---
## Cookie::VerifySetDefaults method


Verifieert en stelt de standaardwaarden van het attribuut in.

```cpp
bool System::Net::Cookie::VerifySetDefaults(CookieVariant variant, System::SharedPtr<Uri> uri, bool isLocalDomain, String localDomain, bool setDefault, bool shouldThrow)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| variant | CookieVariant | De specificatie van de cookie's. |
| uri | System::SharedPtr\<Uri\> | De Uri-klasse‑instantie die wordt gebruikt om de interne velden te initialiseren. |
| isLocalDomain | bool | Een waarde die aangeeft of de cookie naar het lokale domein wordt gepusht. |
| localDomain | String | Een lokale domeinnaam. |
| setDefault | bool | Een waarde die aangeeft of de attributen van de cookie moeten worden geïnitialiseerd met hun standaardwaarden. |
| shouldThrow | bool | Een waarde die aangeeft of er een uitzondering moet worden gegooid wanneer de opgegeven waarden ongeldig zijn. |

### ReturnValue

Waar wanneer alle waarden geldig zijn, anders onwaar.

## Zie ook

* Enum [CookieVariant](../../cookievariant/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [Cookie](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
