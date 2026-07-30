---
title: "System::Net::Sockets::SocketError enum"
linktitle: "SocketError"
second_title: "Aspose.Font per C++"
description: "System::Net::Sockets::SocketError enum. Elenca i tipi di errore del socket in C++."
type: docs
weight: 1300
url: /it/cpp/system.net.sockets/socketerror/
---
## SocketError enum


Elenca i tipi di errore del socket.

```cpp
enum class SocketError
```

### Valori

| Nome | Valore | Descrizione |
| --- | --- | --- |
| Success | 0 | Un'operazione socket è stata completata con successo. |
| SocketError | -1 | Si è verificato un errore socket non specificato. |
| Interrupted | 10004 | Una chiamata socket bloccante è annullata. |
| AccessDenied | 10013 | L'accesso a un socket è negato. |
| Fault | 10014 | È stato rilevato un indirizzo di puntatore non valido. |
| InvalidArgument | 10022 | È stato fornito un argomento non valido. |
| TooManyOpenSockets | 10024 | Ci sono troppi socket aperti nel provider di socket sottostante. |
| WouldBlock | 10035 | Un'operazione non può essere completata immediatamente su un socket non bloccante. |
| InProgress | 10036 | Un'operazione bloccante è in corso. |
| AlreadyInProgress | 10037 | Un socket non bloccante ha già un'operazione in esecuzione. |
| NotSocket | 10038 | Un tentativo di chiamare un'operazione socket su un non-socket. |
| DestinationAddressRequired | 10039 | Un indirizzo richiesto è stato omesso da un'operazione socket. |
| MessageSize | 10040 | Un datagramma è troppo lungo. |
| ProtocolType | 10041 | Questo tipo di protocollo non è supportato da questo socket. |
| ProtocolOption | 10042 | È stata utilizzata un'opzione o livello sconosciuto, non valido o non supportato. |
| ProtocolNotSupported | 10043 | Un protocollo non è implementato o non è configurato. |
| SocketNotSupported | 10044 | Una famiglia di indirizzi non supporta il socket specificato. |
| OperationNotSupported | 10045 | Una famiglia di protocolli non supporta una famiglia di indirizzi. |
| ProtocolFamilyNotSupported | 10046 | Una famiglia di protocolli non è implementata o non è configurata. |
| AddressFamilyNotSupported | 10047 | La famiglia di indirizzi specificata non è supportata. |
| AddressAlreadyInUse | 10048 | Un indirizzo può essere usato solo una volta. |
| AddressNotAvailable | 10049 | L'indirizzo IP selezionato non è valido in questo contesto. |
| NetworkDown | 10050 | La rete non è disponibile. |
| NetworkUnreachable | 10051 | Non esiste alcun percorso verso l'host remoto. |
| NetworkReset | 10052 | Un'applicazione ha provato a impostare 'Keep-Alive' su una connessione che è già scaduta. |
| ConnectionAborted | 10053 | Una connessione è interrotta. |
| ConnectionReset | 10054 | Una connessione è ripristinata da un peer remoto. |
| NoBufferSpaceAvailable | 10055 | Nessuno spazio buffer libero è disponibile per un'operazione socket. |
| IsConnected | 10056 | Un socket è già connesso. |
| NotConnected | 10057 | Un'applicazione ha provato a inviare o ricevere dati, e un socket non è connesso. |
| Shutdown | 10058 | Una richiesta di invio o ricezione dati è vietata perché il socket è già stato chiuso. |
| TimedOut | 10060 | Un tentativo di connessione è scaduto, oppure un host connesso non ha risposto. |
| ConnectionRefused | 10061 | Un host remoto sta rifiutando attivamente una connessione. |
| HostDown | 10064 | Un'operazione è fallita perché un host remoto è inattivo. |
| HostUnreachable | 10065 | Non esiste alcun percorso di rete verso l'host specificato. |
| ProcessLimit | 10067 | Troppi processi stanno utilizzando il provider di socket sottostante. |
| SystemNotReady | 10091 | Un sottosistema di rete non è disponibile. |
| VersionNotSupported | 10092 | Una versione del provider di socket sottostante è fuori intervallo. |
| NotInitialized | 10093 | Il provider di socket sottostante non è inizializzato. |
| Disconnessione | 10101 | È in corso un arresto graduale. |
| TypeNotFound | 10109 | La classe specificata non è stata trovata. |
| HostNotFound | 11001 | L'host specificato è sconosciuto. |
| TryAgain | 11002 | Il nome di un host non può essere risolto. |
| NoRecovery | 11003 | Un errore è irrecuperabile o il database richiesto non può essere trovato. |
| NoData | 11004 | Un nome o indirizzo IP richiesto non è stato trovato sul server dei nomi. |

## Vedi anche

* Namespace [System::Net::Sockets](../)
* Library [Aspose.Font for C++](../../)
