---
title: "System::Net::HttpWebRequest klasse"
linktitle: "HttpWebRequest"
second_title: "Aspose.Page voor C++"
description: "System::Net::HttpWebRequest klasse. Vertegenwoordigt het HTTP-webverzoek. Objecten van deze klasse mogen alleen worden toegewezen met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten kan veroorzaken. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 2000
url: /nl/cpp/system.net/httpwebrequest/
---
## HttpWebRequest class


Vertegenwoordigt het HTTP-webverzoek. Objecten van deze klasse mogen alleen worden toegewezen met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten kan veroorzaken. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class HttpWebRequest : public System::Net::WebRequest
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Abort](./abort/)() override | Annuleert het huidige verzoek. |
| virtual [AddRange](./addrange/)(int32_t) | Voegt de 'Range'-header toe aan het huidige verzoek. |
| virtual [AddRange](./addrange/)(System::String, int32_t, int32_t) | Voegt de 'Range'-header toe aan het huidige verzoek. |
| [BeginGetRequestStream](./begingetrequeststream/)(AsyncCallback, System::SharedPtr\<Object\>) override | Initieert een asynchrone bewerking om een stream te verkrijgen voor het schrijven van gegevens naar de bron. |
| [BeginGetResponse](./begingetresponse/)(AsyncCallback, System::SharedPtr\<Object\>) override | Initieert een asynchrone aanvraag voor de bron. |
| [EndGetRequestStream](./endgetrequeststream/)(System::SharedPtr\<IAsyncResult\>) override | Wacht tot de opgegeven asynchrone bewerking om een stream te verkrijgen voltooid is. |
| [EndGetResponse](./endgetresponse/)(System::SharedPtr\<IAsyncResult\>) override | Wacht tot de opgegeven asynchrone aanvraag voor de bron voltooid is. |
| [get_Accept](./get_accept/)() | Haalt de 'Accept' HTTP-headerwaarde op. |
| virtual [get_AllowAutoRedirect](./get_allowautoredirect/)() | Haalt een waarde op die aangeeft of het verzoek redirects moet volgen. |
| virtual [get_AllowReadStreamBuffering](./get_allowreadstreambuffering/)() | Haalt een waarde op die aangeeft of de van de bron ontvangen gegevens gebufferd moeten worden. |
| virtual [get_AllowWriteStreamBuffering](./get_allowwritestreambuffering/)() | Haalt een waarde op die aangeeft of bufferen is ingeschakeld voor het verzenden van gegevens. |
| virtual [get_ClientCertificates](./get_clientcertificates/)() | Haalt de verzameling van de certificaten op die aan het huidige verzoek zijn gekoppeld. |
| [get_ConnectionGroupName](./get_connectiongroupname/)() override | Haalt de naam van de verbindingsgroep op. |
| [get_ContentLength](./get_contentlength/)() override | Haalt het aantal bytes van de verzoekgegevens op dat verzonden moet worden. |
| [get_ContentType](./get_contenttype/)() override | Haalt het MIME-type van het verzoek op. |
| [get_ContinueTimeout](./get_continuetimeout/)() | Haalt een time‑out op om te wachten tot de 100‑Continue statuscode is ontvangen. |
| virtual [get_CookieContainer](./get_cookiecontainer/)() | Haalt een cookiecontainer op die aan het huidige webverzoek is gekoppeld. |
| [get_Credentials](./get_credentials/)() override | Haalt authenticatie‑informatie op die aan het huidige verzoek is gekoppeld. |
| virtual [get_HaveResponse](./get_haveresponse/)() | Retourneert een waarde die aangeeft of een respons is ontvangen. |
| [get_Headers](./get_headers/)() override | Haalt de verzameling van de HTTP-headers op. |
| virtual [get_KeepAlive](./get_keepalive/)() | Haalt een waarde op die aangeeft of het huidige verzoek de 'Keep-Alive'-header moet bevatten. |
| virtual [get_MaximumAutomaticRedirections](./get_maximumautomaticredirections/)() | Haalt een maximaal aantal toegestane redirects op. |
| [get_Method](./get_method/)() override | Haalt de HTTP-methode op. |
| [get_PreAuthenticate](./get_preauthenticate/)() override | Haalt een waarde op die aangeeft of het verzoek vooraf moet worden geauthenticeerd. |
| [get_Proxy](./get_proxy/)() override | Haalt de HTTP-proxy op. |
| virtual [get_Referer](./get_referer/)() | Haalt een waarde op van de 'Referer'-header. |
| [get_RequestUri](./get_requesturi/)() override | Retourneert de URI van het verzoek. |
| virtual [get_SendChunked](./get_sendchunked/)() | Haalt een waarde op die aangeeft of gegevens in segmenten moeten worden verzonden. |
| [get_ServicePoint](./get_servicepoint/)() | Retourneert een servicepunt dat de netwerkverbinding met de bron vertegenwoordigt. |
| virtual [get_SupportsCookieContainer](./get_supportscookiecontainer/)() | Retourneert een waarde die aangeeft of het huidige verzoek een cookiecontainer kan gebruiken. |
| [get_Timeout](./get_timeout/)() override | Haalt een tijdsduur in milliseconden op waarna het verzoek zal verlopen. |
| [get_UseDefaultCredentials](./get_usedefaultcredentials/)() override | Haalt een waarde op die aangeeft of de eigenschap 'Credential' gelijk is aan de eigenschap 'DefaultCredentials'. |
| virtual [get_UserAgent](./get_useragent/)() | Haalt een waarde op van de 'User-Agent'-header. |
| [GetRequestStream](./getrequeststream/)() override | Retourneert de stream voor het schrijven van gegevens naar de bron. |
| [GetResponse](./getresponse/)() override | Retourneert de webrespons die bij het huidige webverzoek hoort. |
| [HttpWebRequest](./httpwebrequest/)(System::SharedPtr\<Uri\>) | Construeert een nieuw exemplaar. |
| [set_Accept](./set_accept/)(String) | Stelt de waarde van de 'Accept'-HTTP-header in. |
| virtual [set_AllowAutoRedirect](./set_allowautoredirect/)(bool) | Stelt een waarde in die aangeeft of het verzoek redirects moet volgen. |
| virtual [set_AllowReadStreamBuffering](./set_allowreadstreambuffering/)(bool) | Stelt een waarde in die aangeeft of de ontvangen gegevens van de bron gebufferd moeten worden. |
| virtual [set_AllowWriteStreamBuffering](./set_allowwritestreambuffering/)(bool) | Stelt een waarde in die aangeeft of buffering is ingeschakeld voor het verzenden van gegevens. |
| virtual [set_ClientCertificates](./set_clientcertificates/)(System::SharedPtr\<System::Security::Cryptography::X509Certificates::X509CertificateCollection\>) | Stelt de verzameling van certificaten in die aan het huidige verzoek zijn gekoppeld. |
| [set_ConnectionGroupName](./set_connectiongroupname/)(System::String) override | Stelt de naam van de verbindingsgroep in. |
| [set_ContentLength](./set_contentlength/)(int64_t) override | Stelt het aantal bytes van de verzoekgegevens in dat verzonden moet worden. |
| [set_ContentType](./set_contenttype/)(String) override | Stelt het MIME-type van het verzoek in. |
| [set_ContinueTimeout](./set_continuetimeout/)(int32_t) | Stelt een time-out in om te wachten totdat de 100-Continue statuscode is ontvangen. |
| virtual [set_CookieContainer](./set_cookiecontainer/)(System::SharedPtr\<System::Net::CookieContainer\>) | Stelt een cookiecontainer in die aan het huidige webverzoek is gekoppeld. |
| [set_Credentials](./set_credentials/)(System::SharedPtr\<ICredentials\>) override | Stelt authenticatie-informatie in die aan het huidige verzoek is gekoppeld. |
| [set_Headers](./set_headers/)(System::SharedPtr\<WebHeaderCollection\>) override | Stelt de verzameling van de HTTP-headers in. |
| virtual [set_KeepAlive](./set_keepalive/)(bool) | Stelt een waarde in die aangeeft of het huidige verzoek de 'Keep-Alive'-header moet bevatten. |
| virtual [set_MaximumAutomaticRedirections](./set_maximumautomaticredirections/)(int) | Stelt een maximum aantal toegestane omleidingen in. |
| [set_Method](./set_method/)(String) override | Stelt de HTTP-methode in. |
| [set_PreAuthenticate](./set_preauthenticate/)(bool) override | Stelt een waarde in die aangeeft of het verzoek vooraf geauthenticeerd moet worden. |
| [set_ProtocolVersion](./set_protocolversion/)(System::Version) | RTTI-informatie. |
| [set_Proxy](./set_proxy/)(System::SharedPtr\<IWebProxy\>) override | Stelt de HTTP-proxy in. |
| virtual [set_Referer](./set_referer/)(System::String) | Stelt een waarde in van de 'Referer'-header. |
| virtual [set_SendChunked](./set_sendchunked/)(bool) | Stelt een waarde in die aangeeft of gegevens in segmenten moeten worden verzonden. |
| [set_Timeout](./set_timeout/)(int) override | Stelt een tijdsduur in milliseconden in waarna het verzoek time-out zal gaan. |
| [set_UseDefaultCredentials](./set_usedefaultcredentials/)(bool) override | Stelt een waarde in die aangeeft of de eigenschap 'Credential' gelijk is aan de eigenschap 'DefaultCredentials'. |
| virtual [set_UserAgent](./set_useragent/)(System::String) | Stelt een waarde in van de 'User-Agent'-header. |
## Zie ook

* Class [WebRequest](../webrequest/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
