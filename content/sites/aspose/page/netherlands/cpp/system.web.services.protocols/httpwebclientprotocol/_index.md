---
title: "System::Web::Services::Protocols::HttpWebClientProtocol class"
linktitle: "HttpWebClientProtocol"
second_title: "Aspose.Page voor C++"
description: "System::Web::Services::Protocols::HttpWebClientProtocol class. Deze basisklasse wordt gebruikt in alle XML Web service client-proxy's die HTTP gebruiken. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr-pointer en gebruik deze pointer om deze als argument door te geven aan functies in C++."
type: docs
weight: 100
url: /nl/cpp/system.web.services.protocols/httpwebclientprotocol/
---
## HttpWebClientProtocol class


Deze basisklasse wordt gebruikt in alle XML [Web](../../system.web/) serviceclient-proxy's die HTTP gebruiken. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument door te geven aan functies.

```cpp
class HttpWebClientProtocol : public System::Web::Services::Protocols::WebClientProtocol
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [CheckForCookies](./checkforcookies/)(System::SharedPtr\<Net::HttpWebResponse\>) | Voegt cookies van het opgegeven verzoek toe aan de interne cookiecontainer. |
| [get_AllowAutoRedirect](./get_allowautoredirect/)() | Haalt een waarde op die aangeeft of de client server-omleidingen volgt. |
| [get_ClientCertificates](./get_clientcertificates/)() | Retourneert de collectie van de clientcertificaten. |
| [get_CookieContainer](./get_cookiecontainer/)() | Haalt een container op die wordt gebruikt om cookies op te slaan. |
| [get_EnableDecompression](./get_enabledecompression/)() | Haalt een waarde op die aangeeft of decompressie is ingeschakeld. |
| [get_Proxy](./get_proxy/)() | Haalt proxy-informatie op. |
| [get_UnsafeAuthenticatedConnectionSharing](./get_unsafeauthenticatedconnectionsharing/)() | Haalt een waarde op die aangeeft of het delen van verbindingen is ingeschakeld wanneer de client NTLM-authenticatie gebruikt. |
| [get_UserAgent](./get_useragent/)() | Haalt een waarde op van de 'User-Agent'-header. |
| [set_AllowAutoRedirect](./set_allowautoredirect/)(bool) | Stelt een waarde in die aangeeft of de client server-omleidingen volgt. |
| [set_CookieContainer](./set_cookiecontainer/)(System::SharedPtr\<System::Net::CookieContainer\>) | Stelt een container in die wordt gebruikt om cookies op te slaan. |
| [set_EnableDecompression](./set_enabledecompression/)(bool) | Stelt een waarde in die aangeeft of decompressie is ingeschakeld. |
| [set_Proxy](./set_proxy/)(System::SharedPtr\<Net::IWebProxy\>) | Stelt proxy-informatie in. |
| [set_UnsafeAuthenticatedConnectionSharing](./set_unsafeauthenticatedconnectionsharing/)(bool) | Stelt een waarde in die aangeeft of het delen van verbindingen is ingeschakeld wanneer de client NTLM-authenticatie gebruikt. |
| [set_UserAgent](./set_useragent/)(String) | Stelt een waarde in van de 'User-Agent'-header. |
| [UnregisterMapping](./unregistermapping/)(System::SharedPtr\<Object\>) |  |
## Zie ook

* Class [WebClientProtocol](../webclientprotocol/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
