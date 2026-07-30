---
title: "System::Net::Security::AuthenticatedStream class"
linktitle: "AuthenticatedStream"
second_title: "Aspose.Font per C++"
description: "System::Net::Security::AuthenticatedStream class. Contiene i metodi per passare credenziali attraverso uno stream. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 100
url: /it/cpp/system.net.security/authenticatedstream/
---
## AuthenticatedStream class


Contiene i metodi per passare credenziali attraverso uno stream. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarla alle funzioni come argomento.

```cpp
class AuthenticatedStream : public System::IO::Stream
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [get_IsAuthenticated](./get_isauthenticated/)() const | Restituisce un valore che indica se l'autenticazione è stata superata con successo. |
| virtual [get_IsEncrypted](./get_isencrypted/)() const | Restituisce un valore che indica se i dati inviati tramite questo stream sono crittografati. |
| virtual [get_IsMutuallyAuthenticated](./get_ismutuallyauthenticated/)() const | Restituisce un valore che indica se un server e un client sono autenticati. |
| virtual [get_IsServer](./get_isserver/)() const | Restituisce un valore che indica se il lato locale della connessione è il server. |
| virtual [get_IsSigned](./get_issigned/)() const | Restituisce un valore che indica se i dati inviati tramite questo stream sono firmati. |
| [get_LeaveInnerStreamOpen](./get_leaveinnerstreamopen/)() const | Informazioni RTTI. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static [Null](../../system.io/stream/null/) | Un flusso senza storage sottostante. |
## Vedi anche

* Class [Stream](../../system.io/stream/)
* Namespace [System::Net::Security](../)
* Library [Aspose.Font for C++](../../)
