---
title: "System::Security::Cryptography::CipherMode enum"
linktitle: "CipherMode"
second_title: "Aspose.Page per C++"
description: "System::Security::Cryptography::CipherMode enum. Modalità di cifrario a blocchi in C++."
type: docs
weight: 5300
url: /it/cpp/system.security.cryptography/ciphermode/
---
## CipherMode enum


Modalità di cifrario a blocchi.

```cpp
enum class CipherMode
```

### Valori

| Nome | Valore | Descrizione |
| --- | --- | --- |
| CBC | 1 | Catena di blocchi di cifratura che combina il blocco corrente con quello precedente per migliorare la cifratura. |
| ECB | 2 | Modalità Electronic codebook senza influenze tra blocchi; produce una cifratura più debole. |
| OFB | 3 | Modalità output feedback che gestisce grandi blocchi di input in piccoli pezzi. |
| CFB | 4 | Modalità cipher feedback che gestisce grandi blocchi di input in piccoli pezzi. Le regole di mangling differiscono da quelle di OFB. |
| CTS | 5 | Modalità cipher text stealing, si comporta come CBC per tutti tranne gli ultimi due blocchi di testo. |

## Vedi anche

* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
