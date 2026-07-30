---
title: "System::Net::Sockets::SocketFlags enum"
linktitle: "SocketFlags"
second_title: "Aspose.Font per C++"
description: "System::Net::Sockets::SocketFlags enum. Fornisce valori costanti per i messaggi socket in C++."
type: docs
weight: 1400
url: /it/cpp/system.net.sockets/socketflags/
---
## SocketFlags enum


Fornisce valori costanti per i messaggi del socket.

```cpp
enum class SocketFlags
```

### Valori

| Nome | Valore | Descrizione |
| --- | --- | --- |
| None | 0 | Non ci sono flag utilizzati per questa chiamata. |
| OutOfBand | 1 | I dati out-of-band sono in fase di elaborazione. |
| Peek | 2 | Esegui peek su un messaggio in arrivo. |
| DontRoute | 4 | Invia un messaggio senza utilizzare le tabelle di routing. |
| Truncated | 256 | Un messaggio è troppo grande per adattarsi al buffer specificato. È stato troncato. |
| ControlDataTruncated | 512 | I dati di controllo sono superiori a 64 KB e non entrano nel buffer interno. Sono stati troncati. |
| Broadcast | 1024 | Un pacchetto broadcast. |
| Multicast | 2048 | Un pacchetto multicast. |
| Parziale | 32768 | Un messaggio inviato o ricevuto parzialmente. |

## Vedi anche

* Namespace [System::Net::Sockets](../)
* Library [Aspose.Font for C++](../../)
