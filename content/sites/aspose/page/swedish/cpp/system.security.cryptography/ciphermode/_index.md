---
title: "System::Security::Cryptography::CipherMode enum"
linktitle: "CipherMode"
second_title: "Aspose.Page för C++"
description: "System::Security::Cryptography::CipherMode enum. Blockkryptoläge i C++."
type: docs
weight: 5300
url: /sv/cpp/system.security.cryptography/ciphermode/
---
## CipherMode enum


Blockchifferläge.

```cpp
enum class CipherMode
```

### Värden

| Namn | Värde | Beskrivning |
| --- | --- | --- |
| CBC | 1 | Cipher block chaining som kombinerar aktuellt block med föregående block för att förbättra krypteringen. |
| ECB | 2 | Electronic codebook-läge utan interblockspåverkan; resulterar i svagare kryptering. |
| OFB | 3 | Output feedback-läge som hanterar stora inmatningsblock i små delar. |
| CFB | 4 | Cipher feedback-läge som hanterar stora inmatningsblock i små delar. Manglingsreglerna skiljer sig från dem i OFB. |
| CTS | 5 | Cipher text stealing-läge, beter sig som CBC för alla utom de två sista blocken av text. |

## Se även

* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
