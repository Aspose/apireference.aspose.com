---
title: "System::Net::WebRequest class"
linktitle: "WebRequest"
second_title: "Aspose.Page voor C++"
description: "System::Net::WebRequest class. Vertegenwoordigt een webverzoek. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime-fouten en/of assertiefouten kan veroorzaken. Wikkel deze klasse altijd in een System::SmartPtr-pointer en gebruik deze pointer om deze door te geven aan functies als argument in C++."
type: docs
weight: 3800
url: /nl/cpp/system.net/webrequest/
---
## WebRequest class


Vertegenwoordigt een webverzoek. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime-fouten en/of assertiefouten kan veroorzaken. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/)-pointer en gebruik deze pointer om deze door te geven aan functies als argument.

```cpp
class WebRequest : public virtual System::Object
```

## Nested classes

* Class [HttpRequestCreator](./httprequestcreator/)
* Class [WebRequestPrefixElement](./webrequestprefixelement/)
## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [Abort](./abort/)() | Annuleert het huidige verzoek. |
| virtual [BeginGetRequestStream](./begingetrequeststream/)(AsyncCallback, System::SharedPtr\<Object\>) | Initieert een asynchrone bewerking om een stream te verkrijgen voor het schrijven van gegevens naar de bron. |
| virtual [BeginGetResponse](./begingetresponse/)(AsyncCallback, System::SharedPtr\<Object\>) | Initieert een asynchrone aanvraag voor de bron. |
| static [Create](./create/)(String) | Maakt een nieuwe instantie van de [WebRequest](./)-klasse met de opgegeven URI. |
| static [Create](./create/)(System::SharedPtr\<Uri\>) | Maakt een nieuwe instantie van de [WebRequest](./)-klasse met de opgegeven URI. |
| static [CreateDefault](./createdefault/)(System::SharedPtr\<Uri\>) | Maakt een [WebRequest](./)-afstammeling voor het opgegeven URI-schema. |
| static [CreateHttp](./createhttp/)(String) | Maakt een nieuwe instantie van de [WebRequest](./)-klasse met de opgegeven URI. |
| static [CreateHttp](./createhttp/)(System::SharedPtr\<Uri\>) | Maakt een nieuwe instantie van de [WebRequest](./)-klasse met de opgegeven URI. |
| virtual [EndGetRequestStream](./endgetrequeststream/)(System::SharedPtr\<IAsyncResult\>) | Wacht tot de opgegeven asynchrone bewerking om een stream te verkrijgen voltooid is. |
| virtual [EndGetResponse](./endgetresponse/)(System::SharedPtr\<IAsyncResult\>) | Wacht tot de opgegeven asynchrone aanvraag voor de bron voltooid is. |
| virtual [get_CachePolicy](./get_cachepolicy/)() | Haalt het cachebeleid op. |
| virtual [get_ConnectionGroupName](./get_connectiongroupname/)() | Haalt de naam van de verbindingsgroep op. |
| virtual [get_ContentLength](./get_contentlength/)() | Haalt het aantal bytes van de verzoekgegevens op dat verzonden moet worden. |
| virtual [get_ContentType](./get_contenttype/)() | Haalt het MIME-type van het verzoek op. |
| virtual [get_Credentials](./get_credentials/)() | Haalt authenticatie‑informatie op die aan het huidige verzoek is gekoppeld. |
| static [get_DefaultWebProxy](./get_defaultwebproxy/)() | Haalt de globale HTTP-proxy op. |
| virtual [get_Headers](./get_headers/)() | Haalt de verzameling van de HTTP-headers op. |
| virtual [get_Method](./get_method/)() | Haalt de HTTP-methode op. |
| virtual [get_PreAuthenticate](./get_preauthenticate/)() | Haalt een waarde op die aangeeft of het verzoek vooraf moet worden geauthenticeerd. |
| static [get_PrefixList](./get_prefixlist/)() | Haalt de prefixlijst op. |
| virtual [get_Proxy](./get_proxy/)() | Haalt de HTTP-proxy op. |
| virtual [get_RequestUri](./get_requesturi/)() | Retourneert de URI van het verzoek. |
| virtual [get_Timeout](./get_timeout/)() | Haalt een tijdsduur in milliseconden op waarna het verzoek zal verlopen. |
| virtual [get_UseDefaultCredentials](./get_usedefaultcredentials/)() | Haalt een waarde op die aangeeft of de eigenschap 'Credential' gelijk is aan de eigenschap 'DefaultCredentials'. |
| virtual [GetRequestStream](./getrequeststream/)() | Retourneert de stream voor het schrijven van gegevens naar de bron. |
| virtual [GetResponse](./getresponse/)() | Retourneert de webrespons die bij het huidige webverzoek hoort. |
| static [RegisterPrefix](./registerprefix/)(String, System::SharedPtr\<IWebRequestCreate\>) | Registreert de [WebRequest](./)-afstammeling voor de opgegeven URI. |
| virtual [set_CachePolicy](./set_cachepolicy/)(System::SharedPtr\<System::Net::Cache::RequestCachePolicy\>) | Stelt het cachebeleid in. |
| virtual [set_ConnectionGroupName](./set_connectiongroupname/)(System::String) | Stelt de naam van de verbindingsgroep in. |
| virtual [set_ContentLength](./set_contentlength/)(int64_t) | Stelt het aantal bytes van de verzoekgegevens in dat verzonden moet worden. |
| virtual [set_ContentType](./set_contenttype/)(String) | Stelt het MIME-type van het verzoek in. |
| virtual [set_Credentials](./set_credentials/)(System::SharedPtr\<ICredentials\>) | Stelt authenticatie-informatie in die aan het huidige verzoek is gekoppeld. |
| static [set_DefaultWebProxy](./set_defaultwebproxy/)(System::SharedPtr\<IWebProxy\>) | Stelt de globale HTTP-proxy in. |
| virtual [set_Headers](./set_headers/)(System::SharedPtr\<WebHeaderCollection\>) | Stelt de verzameling van de HTTP-headers in. |
| virtual [set_Method](./set_method/)(String) | Stelt de HTTP-methode in. |
| virtual [set_PreAuthenticate](./set_preauthenticate/)(bool) | Stelt een waarde in die aangeeft of het verzoek vooraf geauthenticeerd moet worden. |
| static [set_PrefixList](./set_prefixlist/)(System::SharedPtr\<Collections::Generic::List\<System::SharedPtr\<WebRequest::WebRequestPrefixElement\>\>\>) | Stelt de voorvoegsellijst in. |
| virtual [set_Proxy](./set_proxy/)(System::SharedPtr\<IWebProxy\>) | Stelt de HTTP-proxy in. |
| virtual [set_Timeout](./set_timeout/)(int32_t) | Stelt een tijdsduur in milliseconden in waarna het verzoek time-out zal gaan. |
| virtual [set_UseDefaultCredentials](./set_usedefaultcredentials/)(bool) | Stelt een waarde in die aangeeft of de eigenschap 'Credential' gelijk is aan de eigenschap 'DefaultCredentials'. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
