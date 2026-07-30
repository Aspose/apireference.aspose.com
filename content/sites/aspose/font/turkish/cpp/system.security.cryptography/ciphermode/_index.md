---
title: "System::Security::Cryptography::CipherMode enum"
linktitle: "CipherMode"
second_title: "Aspose.Font için C++"
description: "System::Security::Cryptography::CipherMode enum. C++'ta blok şifreleme modu."
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
| CBC | 1 | Şifre blok zincirleme (Cipher block chaining), mevcut bloğu önceki blokla birleştirerek şifrelemeyi iyileştirir. |
| ECB | 2 | Bloklar arası etkileşimsiz elektronik kod defteri (ECB) modu; daha zayıf şifrelemeye yol açar. |
| OFB | 3 | Büyük giriş bloklarını küçük parçalar halinde işleyen çıktı geri bildirim (OFB) modu. |
| CFB | 4 | Büyük giriş bloklarını küçük parçalar halinde işleyen şifre geri besleme modu. Karıştırma kuralları OFB'ye göre farklıdır. |
| CTS | 5 | Şifre metni çalma modu, son iki blok dışındaki tüm bloklar için CBC gibi davranır. |

## Ayrıca Bakınız

* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
