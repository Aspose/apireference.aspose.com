---
title: "System::Security::Cryptography::CipherMode enum"
linktitle: "CipherMode"
second_title: "Aspose.Font per C++"
description: "System::Security::Cryptography::CipherMode enum. Modalità di cifratura a blocchi in C++."
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
| CBC | 1 | Cipher block chaining che combina il blocco corrente con quello precedente per migliorare la cifratura. |
| ECB | 2 | Modalità Electronic codebook senza influenze inter-blocco; produce una cifratura più debole. |
| OFB | 3 | Modalità Output feedback che gestisce grandi blocchi di input in piccoli pezzi. |
| CFB | 4 | Modalità Cipher feedback che gestisce blocchi di input grandi in piccoli pezzi. Le regole di manipolazione differiscono da quelle di OFB. |
| CTS | 5 | Modalità Cipher text stealing, si comporta come CBC per tutti tranne gli ultimi due blocchi di testo. |

## Vedi anche

* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
