---
title: "System::Net::CredentialCache classe"
linktitle: "CredentialCache"
second_title: "Aspose.Font per C++"
description: "System::Net::CredentialCache classe. Fornisce l'archiviazione delle credenziali. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 600
url: /it/cpp/system.net/credentialcache/
---
## CredentialCache class


Fornisce l'archiviazione delle credenziali. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare questo puntatore per passarlo alle funzioni come argomento.

```cpp
class CredentialCache : public System::Net::ICredentials,
                        public System::Net::ICredentialsByHost
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Add](./add/)(System::SharedPtr\<Uri\>, String, System::SharedPtr\<NetworkCredential\>) | Aggiunge le credenziali di rete specificate alla cache. |
| [Add](./add/)(String, int32_t, String, System::SharedPtr\<NetworkCredential\>) | Aggiunge le credenziali di rete specificate alla cache. |
| [CredentialCache](./credentialcache/)() | Crea una nuova istanza. |
| static [get_DefaultCredentials](./get_defaultcredentials/)() | Informazioni RTTI. |
| static [get_DefaultNetworkCredentials](./get_defaultnetworkcredentials/)() | Restituisce le credenziali di rete dell'utente corrente o dell'applicazione. |
| [GetCredential](./getcredential/)(System::SharedPtr\<Uri\>, String) override | Restituisce le credenziali per il prefisso URI specificato e il tipo di autenticazione. |
| [GetCredential](./getcredential/)(String, int32_t, String) override | Restituisce le credenziali per il nome host specificato, la porta e il tipo di autenticazione. |
| [Remove](./remove/)(System::SharedPtr\<Uri\>, String) | Rimuove le credenziali di rete per il prefisso URI specificato e il tipo di autenticazione. |
| [Remove](./remove/)(String, int32_t, String) | Rimuove le credenziali di rete per il nome host, la porta e il tipo di autenticazione specificati. |
## Vedi anche

* Class [ICredentials](../icredentials/)
* Class [ICredentialsByHost](../icredentialsbyhost/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
