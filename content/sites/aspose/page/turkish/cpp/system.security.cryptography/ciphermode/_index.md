---
title: "System::Security::Cryptography::CipherMode enum"
linktitle: "CipherMode"
second_title: "Aspose.Page için C++"
description: "System::Security::Cryptography::CipherMode enum. C++'de blok şifreleme modu."
type: docs
weight: 5300
url: /tr/cpp/system.security.cryptography/ciphermode/
---
## CipherMode enum


Blok şifreleme modu.

```cpp
enum class CipherMode
```

### Değerler

| Ad | Değer | Açıklama |
| --- | --- | --- |
| CBC | 1 | Cipher block chaining, mevcut bloğu önceki blokla birleştirerek şifrelemeyi iyileştirir. |
| ECB | 2 | Bloklar arası etkileşimi olmayan Electronic codebook modu; daha zayıf şifrelemeye yol açar. |
| OFB | 3 | Büyük giriş bloklarını küçük parçalar halinde işleyen Output feedback modu. |
| CFB | 4 | Büyük giriş bloklarını küçük parçalar halinde işleyen Cipher feedback modu. Karıştırma kuralları OFB'den farklıdır. |
| CTS | 5 | Cipher text stealing modu, son iki blok dışındaki tüm bloklarda CBC gibi davranır. |

## Ayrıca Bakınız

* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
