---
title: "System::Security::Cryptography::CipherMode Enum"
linktitle: "CipherMode"
second_title: "Aspose.Font für C++"
description: "System::Security::Cryptography::CipherMode Enum. Blockchiffermodus in C++."
type: docs
weight: 5300
url: /de/cpp/system.security.cryptography/ciphermode/
---
## CipherMode enum


Blockchiffermodus. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../system/makeobject/) zugewiesen werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
enum class CipherMode
```

### Werte

| Name | Wert | Beschreibung |
| --- | --- | --- |
| CBC | 1 | Cipher Block Chaining, das den aktuellen Block mit dem vorherigen Block kombiniert, um die Verschlüsselung zu verbessern. |
| ECB | 2 | Electronic Codebook-Modus ohne Inter-Block-Einflüsse; führt zu schwächerer Verschlüsselung. |
| OFB | 3 | Output-Feedback-Modus, der große Eingabeblöcke in kleinen Stücken verarbeitet. |
| CFB | 4 | Cipher-Feedback-Modus, der große Eingabeblöcke in kleinen Teilen verarbeitet. Die Verarbeitungsregeln unterscheiden sich von denen des OFB. |
| CTS | 5 | Cipher-Text-Stealing-Modus, verhält sich wie CBC für alle bis auf die letzten beiden Textblöcke. |

## Siehe auch

* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
