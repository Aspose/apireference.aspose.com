---
title: "System::Net::NetworkCredential class"
linktitle: "NetworkCredential"
second_title: "Aspose.Font per C++"
description: "System::Net::NetworkCredential class. Fornisce credenziali per gli schemi di autenticazione basati su password. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 2900
url: /it/cpp/system.net/networkcredential/
---
## NetworkCredential class


Fornisce credenziali per gli schemi di autenticazione basati su password. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarla alle funzioni come argomento.

```cpp
class NetworkCredential : public System::Net::ICredentials,
                          public System::Net::ICredentialsByHost,
                          public virtual System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_Domain](./get_domain/)() | Ottiene il dominio che verifica le credenziali. |
| [get_Password](./get_password/)() | Ottiene la password. |
| [get_UserName](./get_username/)() | Informazioni RTTI. |
| [GetCredential](./getcredential/)(System::SharedPtr\<Uri\>, String) override | Restituisce le credenziali per l'URI specificato e il tipo di autenticazione. |
| [GetCredential](./getcredential/)(String, int32_t, String) override | Restituisce le credenziali per il nome host specificato, la porta e il tipo di autenticazione. |
| [NetworkCredential](./networkcredential/)() | Crea una nuova istanza. |
| [NetworkCredential](./networkcredential/)(String, String) | Crea una nuova istanza. |
| [NetworkCredential](./networkcredential/)(String, String, String) | Crea una nuova istanza. |
| [set_Domain](./set_domain/)(String) | Imposta il dominio che verifica le credenziali. |
| [set_Password](./set_password/)(String) | Imposta la password. |
| [set_UserName](./set_username/)(String) | Imposta il nome utente. |
## Vedi anche

* Class [ICredentials](../icredentials/)
* Class [ICredentialsByHost](../icredentialsbyhost/)
* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
