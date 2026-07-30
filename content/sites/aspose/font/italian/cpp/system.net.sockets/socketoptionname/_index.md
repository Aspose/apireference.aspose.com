---
title: "System::Net::Sockets::SocketOptionName enum"
linktitle: "SocketOptionName"
second_title: "Aspose.Font per C++"
description: "System::Net::Sockets::SocketOptionName enum. Definisce i nomi delle opzioni di socket per la classe Socket in C++."
type: docs
weight: 1600
url: /it/cpp/system.net.sockets/socketoptionname/
---
## SocketOptionName enum


Definisce i nomi delle opzioni di socket per la classe [Socket](../socket/).

```cpp
enum class SocketOptionName
```

### Valori

| Nome | Valore | Descrizione |
| --- | --- | --- |
| Debug | 1 | Registra le informazioni di debug. |
| AcceptConnection | 2 | Indica se un socket è in ascolto per una connessione in ingresso. |
| ReuseAddress | 4 | Indica se un socket può essere associato all'indirizzo già in uso. |
| KeepAlive | 8 | Abilita i pacchetti 'Keep-Alive' per una connessione socket. |
| DontRoute | 16 | Indica se un pacchetto è inviato direttamente agli indirizzi dell'interfaccia. |
| Broadcast | 32 | Indica se un socket può inviare i messaggi broadcast. |
| UseLoopback | 64 | Ignora l'hardware quando possibile. |
| Linger | 128 | Il sistema bloccherà il processo al tentativo di chiusura finché non sarà in grado di trasmettere i dati. |
| OutOfBandInline | 256 | Riceve dati out-of-band nel flusso di dati normale. |
| DontLinger | n/a | Indica se un socket verrà chiuso senza linger. |
| ExclusiveAddressUse | n/a | Un socket utilizzerà l'indirizzo associato in modo esclusivo. |
| SendBuffer | 4097 | Specifica la dimensione del buffer di invio. |
| ReceiveBuffer | 4098 | Specifica la dimensione del buffer di ricezione. |
| SendLowWater | 4099 | Specifica la quantità minima di dati per le operazioni di invio. |
| ReceiveLowWater | 4100 | Specifica la quantità minima di dati per le operazioni di ricezione. |
| SendTimeout | 4101 | Specifica il timeout per le operazioni di invio sincrone. |
| ReceiveTimeout | 4102 | Specifica il timeout per le operazioni di ricezione sincrone. |
| Error | 4103 | Restituisce lo stato di errore e lo pulisce. |
| Tipo | 4104 | Restituisce un tipo di socket. |
| ReuseUnicastPort | 12295 | Indica se il sistema deve differire l'allocazione della porta effimera per le connessioni in uscita. |
| MaxConnections | 2147483647 | Questa opzione non è supportata. Veniva usata per specificare la lunghezza massima della coda per l'ascolto. |
| IPOptions | 1 | Specifica l'opzione IP che deve essere inserita nei datagrammi in uscita. |
| HeaderIncluded | 2 | L'intestazione è inclusa nei datagrammi in uscita. |
| TypeOfService | 3 | Modifica il tipo di intestazione IP del campo servizio. |
| IpTimeToLive | 4 | Il tempo di vita (TTL) IP. |
| MulticastInterface | 9 | Imposta l'interfaccia per i pacchetti multicast in uscita. |
| MulticastTimeToLive | 10 | Il tempo di vita (TTL) multicast IP. |
| MulticastLoopback | 11 | Il loopback multicast IP. |
| AddMembership | 12 | Aggiungi un'appartenenza a un gruppo IP. |
| DropMembership | 13 | Rimuovi un'appartenenza a un gruppo IP. |
| DontFragment | 14 | Non frammentare i datagrammi IP. |
| AddSourceMembership | 15 | Unisciti al gruppo/fonte IP. |
| DropSourceMembership | 16 | Rimuovi il gruppo/fonte IP. |
| BlockSource | 17 | Blocca il gruppo/fonte IP. |
| UnblockSource | 18 | Sblocca il gruppo/source IP. |
| PacketInformation | 19 | Ricevi le informazioni sul pacchetto per IPv4. |
| HopLimit | 21 | Restituisce un intero contenente il conteggio HOP del pacchetto. |
| IPProtectionLevel | 23 | Consente la restrizione di un socket IPv6 all'ambito specificato. |
| IPv6Only | 27 | Il socket è limitato a inviare e ricevere solo pacchetti IPv6. |
| NoDelay | 1 | Disabilita l'algoritmo di Nagle per la coalescenza dei pacchetti inviati. |
| BsdUrgent | 2 | Usa i dati urgenti come definiti nella RFC-1222. |
| Expedited | 2 | Usa i dati accelerati come definiti nella RFC-1222. |
| NoChecksum | 1 | Invia i datagrammi UDP con un checksum impostato a zero. |
| ChecksumCoverage | 20 | Imposta o ottieni la copertura del checksum UDP. |
| UpdateAcceptContext | 28683 | Aggiorna un socket client con le stesse proprietà di un socket in ascolto. |
| UpdateConnectContext | 28688 | Aggiorna un socket client con le stesse proprietà di un socket in ascolto. |

## Vedi anche

* Namespace [System::Net::Sockets](../)
* Library [Aspose.Font for C++](../../)
