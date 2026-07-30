---
title: "System::Net::WebProxy classe"
linktitle: "WebProxy"
second_title: "Aspose.Font per C++"
description: "System::Net::WebProxy class. Rappresenta un server proxy web http. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 3700
url: /it/cpp/system.net/webproxy/
---
## WebProxy class


Rappresenta un server proxy web http. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarlo alle funzioni come argomento.

```cpp
class WebProxy : public System::Net::IWebProxy
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_Address](./get_address/)() | Ottiene l'indirizzo del server proxy corrente. |
| [get_BypassList](./get_bypasslist/)() | Ottiene l'elenco degli indirizzi che non utilizzano il server proxy. |
| [get_BypassProxyOnLocal](./get_bypassproxyonlocal/)() | Ottiene un valore che indica se il server proxy deve essere usato per gli indirizzi locali. |
| virtual [get_Credentials](./get_credentials/)() | Ottiene le credenziali inviate al server proxy per l'autenticazione. |
| [get_UseDefaultCredentials](./get_usedefaultcredentials/)() | Ottiene un valore che indica se le credenziali predefinite devono essere inviate con le richieste. |
| static [GetDefaultProxy](./getdefaultproxy/)() | Restituisce il proxy che utilizza le impostazioni non dinamiche di Internet Explorer. |
| virtual [GetProxy](./getproxy/)(System::SharedPtr\<Uri\>) | Restituisce l'URI proxy per una richiesta web. |
| virtual [IsBypassed](./isbypassed/)(System::SharedPtr\<Uri\>) | Verifica se il server proxy non è utilizzato per l'URI specificato. |
| [set_Address](./set_address/)(System::SharedPtr\<Uri\>) | Imposta l'indirizzo del server proxy corrente. |
| [set_BypassList](./set_bypasslist/)(System::ArrayPtr\<String\>) | Imposta l'elenco degli indirizzi che non utilizzano il server proxy. |
| [set_BypassProxyOnLocal](./set_bypassproxyonlocal/)(bool) | Imposta un valore che indica se il server proxy deve essere utilizzato per gli indirizzi locali. |
| virtual [set_Credentials](./set_credentials/)(System::SharedPtr\<ICredentials\>) | Imposta le credenziali inviate al server proxy per l'autenticazione. |
| [set_UseDefaultCredentials](./set_usedefaultcredentials/)(bool) | Imposta un valore che indica se le credenziali predefinite devono essere inviate con le richieste. |
| [WebProxy](./webproxy/)() | Crea una nuova istanza. |
| [WebProxy](./webproxy/)(System::SharedPtr\<Uri\>) | Crea una nuova istanza. |
| [WebProxy](./webproxy/)(System::SharedPtr\<Uri\>, bool) | Crea una nuova istanza. |
| [WebProxy](./webproxy/)(System::SharedPtr\<Uri\>, bool, System::ArrayPtr\<String\>) | Crea una nuova istanza. |
| [WebProxy](./webproxy/)(System::SharedPtr\<Uri\>, bool, System::ArrayPtr\<String\>, System::SharedPtr\<ICredentials\>) | Crea una nuova istanza. |
| [WebProxy](./webproxy/)(String, int32_t) | Crea una nuova istanza. |
| [WebProxy](./webproxy/)(String) | Crea una nuova istanza. |
| [WebProxy](./webproxy/)(String, bool) | Crea una nuova istanza. |
| [WebProxy](./webproxy/)(String, bool, System::ArrayPtr\<String\>) | Crea una nuova istanza. |
| [WebProxy](./webproxy/)(String, bool, System::ArrayPtr\<String\>, System::SharedPtr\<ICredentials\>) | Crea una nuova istanza. |
## Vedi anche

* Class [IWebProxy](../iwebproxy/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
