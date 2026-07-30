---
title: "classe System::Web::Services::Protocols::WebClientProtocol"
linktitle: "WebClientProtocol"
second_title: "Aspose.Font per C++"
description: "classe System::Web::Services::Protocols::WebClientProtocol. Questa classe base è utilizzata in tutti i proxy client dei servizi Web XML creati con ASP.NET. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 1100
url: /it/cpp/system.web.services.protocols/webclientprotocol/
---
## WebClientProtocol class


Questa classe base è utilizzata in tutti i proxy client dei servizi XML [Web](../../system.web/) creati con ASP.NET. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento.

```cpp
class WebClientProtocol : public virtual System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [Abort](./abort/)() | Annulla la richiesta. |
| [get_ConnectionGroupName](./get_connectiongroupname/)() | Ottiene il nome del gruppo di connessione. |
| [get_Credentials](./get_credentials/)() | Ottiene le informazioni di autenticazione. |
| [get_PreAuthenticate](./get_preauthenticate/)() | Ottiene un valore che indica se la pre-autenticazione è abilitata. |
| [get_RequestEncoding](./get_requestencoding/)() | Ottiene la codifica utilizzata per effettuare le richieste del client. |
| [get_Timeout](./get_timeout/)() | Ottiene l'intervallo di tempo da attendere prima che la richiesta scada. |
| [get_Uri](./get_uri/)() | Ottiene l'URI del servizio XML [Web](../../system.web/). |
| [get_Url](./get_url/)() | Ottiene l'URL del servizio XML [Web](../../system.web/). |
| [get_UseDefaultCredentials](./get_usedefaultcredentials/)() | Ottiene un valore che indica se la proprietà 'Credential' è uguale alla proprietà 'DefaultCredentials'. |
| [set_ConnectionGroupName](./set_connectiongroupname/)(String) | Imposta il nome del gruppo di connessione. |
| [set_Credentials](./set_credentials/)(System::SharedPtr\<Net::ICredentials\>) | Imposta le informazioni di autenticazione. |
| [set_PreAuthenticate](./set_preauthenticate/)(bool) | Imposta un valore che indica se la pre-autenticazione è abilitata. |
| [set_RequestEncoding](./set_requestencoding/)(System::SharedPtr\<Text::Encoding\>) | Imposta la codifica utilizzata per effettuare le richieste del client. |
| [set_Timeout](./set_timeout/)(int32_t) | Imposta l'intervallo di tempo da attendere prima che la richiesta scada. |
| [set_Uri](./set_uri/)(System::SharedPtr\<Uri\>) | Imposta l'URI del servizio XML [Web](../../system.web/). |
| [set_Url](./set_url/)(String) | Imposta l'URL del servizio XML [Web](../../system.web/). |
| [set_UseDefaultCredentials](./set_usedefaultcredentials/)(bool) | Imposta un valore che indica se la proprietà 'Credential' è uguale alla proprietà 'DefaultCredentials'. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Font for C++](../../)
