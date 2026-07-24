---
title: "System::Net::WebProxy‑klasse"
linktitle: "WebProxy"
second_title: "Aspose.Page voor C++"
description: "System::Net::WebProxy‑klasse. Vertegenwoordigt een http‑webproxy‑server. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument door te geven aan functies in C++."
type: docs
weight: 3700
url: /nl/cpp/system.net/webproxy/
---
## WebProxy class


Vertegenwoordigt een http‑webproxy‑server. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/)‑pointer en gebruik deze pointer om deze als argument door te geven aan functies.

```cpp
class WebProxy : public System::Net::IWebProxy
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_Address](./get_address/)() | Haalt het adres van de huidige proxy‑server op. |
| [get_BypassList](./get_bypasslist/)() | Haalt de lijst met adressen op die de proxy‑server niet gebruiken. |
| [get_BypassProxyOnLocal](./get_bypassproxyonlocal/)() | Haalt een waarde op die aangeeft of de proxy‑server moet worden gebruikt voor lokale adressen. |
| virtual [get_Credentials](./get_credentials/)() | Haalt de inloggegevens op die naar de proxy‑server worden gestuurd voor authenticatie. |
| [get_UseDefaultCredentials](./get_usedefaultcredentials/)() | Haalt een waarde op die aangeeft of de standaard‑inloggegevens met verzoeken moeten worden meegestuurd. |
| static [GetDefaultProxy](./getdefaultproxy/)() | Retourneert de proxy die de niet-dynamische instellingen van Internet Explorer gebruikt. |
| virtual [GetProxy](./getproxy/)(System::SharedPtr\<Uri\>) | Retourneert de geproxiede URI voor een webverzoek. |
| virtual [IsBypassed](./isbypassed/)(System::SharedPtr\<Uri\>) | Controleert of de proxyserver niet wordt gebruikt voor de opgegeven URI. |
| [set_Address](./set_address/)(System::SharedPtr\<Uri\>) | Stelt het adres van de huidige proxyserver in. |
| [set_BypassList](./set_bypasslist/)(System::ArrayPtr\<String\>) | Stelt de lijst met adressen in die de proxyserver niet gebruiken. |
| [set_BypassProxyOnLocal](./set_bypassproxyonlocal/)(bool) | Stelt een waarde in die aangeeft of de proxyserver moet worden gebruikt voor lokale adressen. |
| virtual [set_Credentials](./set_credentials/)(System::SharedPtr\<ICredentials\>) | Stelt de referenties in die naar de proxyserver worden gestuurd voor authenticatie. |
| [set_UseDefaultCredentials](./set_usedefaultcredentials/)(bool) | Stelt een waarde in die aangeeft of de standaardreferenties met verzoeken moeten worden verzonden. |
| [WebProxy](./webproxy/)() | Construeert een nieuw exemplaar. |
| [WebProxy](./webproxy/)(System::SharedPtr\<Uri\>) | Construeert een nieuw exemplaar. |
| [WebProxy](./webproxy/)(System::SharedPtr\<Uri\>, bool) | Construeert een nieuw exemplaar. |
| [WebProxy](./webproxy/)(System::SharedPtr\<Uri\>, bool, System::ArrayPtr\<String\>) | Construeert een nieuw exemplaar. |
| [WebProxy](./webproxy/)(System::SharedPtr\<Uri\>, bool, System::ArrayPtr\<String\>, System::SharedPtr\<ICredentials\>) | Construeert een nieuw exemplaar. |
| [WebProxy](./webproxy/)(String, int32_t) | Construeert een nieuw exemplaar. |
| [WebProxy](./webproxy/)(String) | Construeert een nieuw exemplaar. |
| [WebProxy](./webproxy/)(String, bool) | Construeert een nieuw exemplaar. |
| [WebProxy](./webproxy/)(String, bool, System::ArrayPtr\<String\>) | Construeert een nieuw exemplaar. |
| [WebProxy](./webproxy/)(String, bool, System::ArrayPtr\<String\>, System::SharedPtr\<ICredentials\>) | Construeert een nieuw exemplaar. |
## Zie ook

* Class [IWebProxy](../iwebproxy/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
