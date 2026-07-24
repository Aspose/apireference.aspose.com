---
title: "System::Net::CredentialCache classe"
linktitle: "CredentialCache"
second_title: "Aspose.Page per C++"
description: "System::Net::CredentialCache classe. Fornisce l'archiviazione delle credenziali. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject() function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into System::SmartPtr pointer and use this pointer to pass it to functions as argument in C++."
type: docs
weight: 600
url: /it/cpp/system.net/credentialcache/
---
## CredentialCache class


Fornisce l'archiviazione delle credenziali. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

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
* Library [Aspose.Page for C++](../../)
