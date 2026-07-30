---
title: "System::Web::Services::Protocols::HttpWebClientProtocol classe"
linktitle: "HttpWebClientProtocol"
second_title: "Aspose.Font per C++"
description: "System::Web::Services::Protocols::HttpWebClientProtocol classe. Questa classe base è utilizzata in tutti i proxy client dei servizi Web XML che usano HTTP. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 100
url: /it/cpp/system.web.services.protocols/httpwebclientprotocol/
---
## HttpWebClientProtocol class


Questa classe base è utilizzata in tutti i proxy client dei servizi XML [Web](../../system.web/) che usano HTTP. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare questo puntatore per passarlo alle funzioni come argomento.

```cpp
class HttpWebClientProtocol : public System::Web::Services::Protocols::WebClientProtocol
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [CheckForCookies](./checkforcookies/)(System::SharedPtr\<Net::HttpWebResponse\>) | Aggiunge i cookie dalla richiesta specificata al contenitore interno dei cookie. |
| [get_AllowAutoRedirect](./get_allowautoredirect/)() | Ottiene un valore che indica se il client segue i reindirizzamenti del server. |
| [get_ClientCertificates](./get_clientcertificates/)() | Restituisce la raccolta dei certificati del client. |
| [get_CookieContainer](./get_cookiecontainer/)() | Ottiene un contenitore utilizzato per memorizzare i cookie. |
| [get_EnableDecompression](./get_enabledecompression/)() | Ottiene un valore che indica se la decompressione è abilitata. |
| [get_Proxy](./get_proxy/)() | Ottiene le informazioni sul proxy. |
| [get_UnsafeAuthenticatedConnectionSharing](./get_unsafeauthenticatedconnectionsharing/)() | Ottiene un valore che indica se la condivisione della connessione è abilitata quando il client utilizza l'autenticazione NTLM. |
| [get_UserAgent](./get_useragent/)() | Ottiene un valore dell'intestazione 'User-Agent'. |
| [set_AllowAutoRedirect](./set_allowautoredirect/)(bool) | Imposta un valore che indica se il client segue i reindirizzamenti del server. |
| [set_CookieContainer](./set_cookiecontainer/)(System::SharedPtr\<System::Net::CookieContainer\>) | Imposta un contenitore utilizzato per memorizzare i cookie. |
| [set_EnableDecompression](./set_enabledecompression/)(bool) | Imposta un valore che indica se la decompressione è abilitata. |
| [set_Proxy](./set_proxy/)(System::SharedPtr\<Net::IWebProxy\>) | Imposta le informazioni sul proxy. |
| [set_UnsafeAuthenticatedConnectionSharing](./set_unsafeauthenticatedconnectionsharing/)(bool) | Imposta un valore che indica se la condivisione della connessione è abilitata quando il client utilizza l'autenticazione NTLM. |
| [set_UserAgent](./set_useragent/)(String) | Imposta un valore dell'intestazione 'User-Agent'. |
| [UnregisterMapping](./unregistermapping/)(System::SharedPtr\<Object\>) |  |
## Vedi anche

* Class [WebClientProtocol](../webclientprotocol/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Font for C++](../../)
