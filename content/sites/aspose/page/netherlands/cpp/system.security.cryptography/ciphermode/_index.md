---
title: "System::Security::Cryptography::CipherMode enum"
linktitle: "CipherMode"
second_title: "Aspose.Page voor C++"
description: "System::Security::Cryptography::CipherMode enum. Blokcijfer-modus in C++."
type: docs
weight: 5300
url: /nl/cpp/system.security.cryptography/ciphermode/
---
## CipherMode enum


Blokcijfer-modus.

```cpp
enum class CipherMode
```

### Waarden

| Naam | Waarde | Beschrijving |
| --- | --- | --- |
| CBC | 1 | Cipher block chaining die het huidige blok combineert met het vorige blok om encryptie te verbeteren. |
| ECB | 2 | Electronic codebook-modus zonder inter-blok invloeden; resulteert in zwakkere encryptie. |
| OFB | 3 | Output feedback-modus die grote invoerblokken in kleine stukjes verwerkt. |
| CFB | 4 | Cipher feedback-modus die grote invoerblokken in kleine stukjes verwerkt. Mangling-regels verschillen van die van OFB. |
| CTS | 5 | Cipher text stealing-modus, gedraagt zich als CBC voor alle behalve de laatste twee blokken tekst. |

## Zie ook

* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
