---
title: "System::Web::Services::Protocols::WebClientProtocol klasse"
linktitle: "WebClientProtocol"
second_title: "Aspose.Page voor C++"
description: "System::Web::Services::Protocols::WebClientProtocol klasse. Deze basisklasse wordt gebruikt in alle XML‑Web‑service‑client‑proxy’s die met ASP.NET zijn gemaakt. Objecten van deze klasse mogen alleen worden toegewezen met de System::MakeObject()-functie. Maak nooit een instantie van dit type op de stack of met de operator new, omdat dit runtime‑fouten en/of assertiefouten oplevert. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 1100
url: /nl/cpp/system.web.services.protocols/webclientprotocol/
---
## WebClientProtocol class


Deze basisklasse wordt gebruikt in alle XML [Web](../../system.web/) service‑client‑proxy’s die met ASP.NET zijn gemaakt. Objecten van deze klasse mogen alleen worden toegewezen met de [System::MakeObject()](../../system/makeobject/)‑functie. Maak nooit een instantie van dit type op de stack of met de operator new, omdat dit runtime‑fouten en/of assertiefouten oplevert. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/)‑pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class WebClientProtocol : public virtual System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [Abort](./abort/)() | Annuleert het verzoek. |
| [get_ConnectionGroupName](./get_connectiongroupname/)() | Haalt de naam van de verbindingsgroep op. |
| [get_Credentials](./get_credentials/)() | Haalt de authenticatie-informatie op. |
| [get_PreAuthenticate](./get_preauthenticate/)() | Haalt een waarde op die aangeeft of pre‑authenticatie is ingeschakeld. |
| [get_RequestEncoding](./get_requestencoding/)() | Haalt de codering op die wordt gebruikt voor de client‑verzoeken. |
| [get_Timeout](./get_timeout/)() | Haalt de tijdsduur op die moet worden gewacht voordat het verzoek time‑out. |
| [get_Uri](./get_uri/)() | Haalt de XML [Web](../../system.web/) service‑URI op. |
| [get_Url](./get_url/)() | Haalt de XML [Web](../../system.web/) service‑URL op. |
| [get_UseDefaultCredentials](./get_usedefaultcredentials/)() | Haalt een waarde op die aangeeft of de eigenschap 'Credential' gelijk is aan de eigenschap 'DefaultCredentials'. |
| [set_ConnectionGroupName](./set_connectiongroupname/)(String) | Stelt de naam van de verbindingsgroep in. |
| [set_Credentials](./set_credentials/)(System::SharedPtr\<Net::ICredentials\>) | Stelt de authenticatie-informatie in. |
| [set_PreAuthenticate](./set_preauthenticate/)(bool) | Stelt een waarde in die aangeeft of pre‑authenticatie is ingeschakeld. |
| [set_RequestEncoding](./set_requestencoding/)(System::SharedPtr\<Text::Encoding\>) | Stelt de codering in die wordt gebruikt voor de client‑verzoeken. |
| [set_Timeout](./set_timeout/)(int32_t) | Stelt de tijdsduur in die moet worden gewacht voordat het verzoek time‑out. |
| [set_Uri](./set_uri/)(System::SharedPtr\<Uri\>) | Stelt de XML [Web](../../system.web/) service‑URI in. |
| [set_Url](./set_url/)(String) | Stelt de XML [Web](../../system.web/) service‑URL in. |
| [set_UseDefaultCredentials](./set_usedefaultcredentials/)(bool) | Stelt een waarde in die aangeeft of de eigenschap 'Credential' gelijk is aan de eigenschap 'DefaultCredentials'. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
