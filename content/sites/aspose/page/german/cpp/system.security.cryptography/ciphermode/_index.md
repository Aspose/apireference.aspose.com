---
title: "System::Security::Cryptography::CipherMode Enum"
linktitle: "CipherMode"
second_title: "Aspose.Page für C++"
description: "System::Security::Cryptography::CipherMode Enum. Blockchiffrenmodus in C++."
type: docs
weight: 5300
url: /de/cpp/system.security.cryptography/ciphermode/
---
## CipherMode enum


Blockchiffrenmodus.

```cpp
enum class CipherMode
```

### Werte

| Name | Wert | Beschreibung |
| --- | --- | --- |
| CBC | 1 | Cipher Block Chaining, das den aktuellen Block mit dem vorherigen Block kombiniert, um die Verschlüsselung zu verbessern. |
| ECB | 2 | Electronic Codebook‑Modus ohne Inter‑Block‑Einflüsse; führt zu schwächerer Verschlüsselung. |
| OFB | 3 | Output‑Feedback‑Modus, der große Eingabeblöcke in kleinen Stücken verarbeitet. |
| CFB | 4 | Cipher‑Feedback‑Modus, der große Eingabeblöcke in kleinen Stücken verarbeitet. Die Verarbeitungsregeln unterscheiden sich von denen des OFB. |
| CTS | 5 | Cipher Text Stealing‑Modus, verhält sich wie CBC für alle bis auf die letzten beiden Textblöcke. |

## Siehe auch

* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
