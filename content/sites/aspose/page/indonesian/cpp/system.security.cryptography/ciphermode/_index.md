---
title: "System::Security::Cryptography::CipherMode enum"
linktitle: "CipherMode"
second_title: "Aspose.Page untuk C++"
description: "System::Security::Cryptography::CipherMode enum. Mode cipher blok dalam C++."
type: docs
weight: 5300
url: /id/cpp/system.security.cryptography/ciphermode/
---
## CipherMode enum


Mode cipher blok.

```cpp
enum class CipherMode
```

### Nilai

| Nama | Nilai | Deskripsi |
| --- | --- | --- |
| CBC | 1 | Cipher block chaining yang menggabungkan blok saat ini dengan blok sebelumnya untuk meningkatkan enkripsi. |
| ECB | 2 | Mode electronic codebook tanpa pengaruh antar-blok; menghasilkan enkripsi yang lebih lemah. |
| OFB | 3 | Mode output feedback yang menangani blok input besar dalam potongan kecil. |
| CFB | 4 | Mode cipher feedback yang menangani blok input besar dalam potongan kecil. Aturan pengacakan berbeda dari OFB. |
| CTS | 5 | Mode cipher text stealing, berperilaku seperti CBC kecuali untuk dua blok terakhir dari teks. |

## Lihat Juga

* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
