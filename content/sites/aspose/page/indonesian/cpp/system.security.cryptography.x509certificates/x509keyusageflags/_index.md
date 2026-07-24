---
title: "System::Security::Cryptography::X509Certificates::X509KeyUsageFlags enum"
linktitle: "X509KeyUsageFlags"
second_title: "Aspose.Page untuk C++"
description: "System::Security::Cryptography::X509Certificates::X509KeyUsageFlags enum. Menentukan bagaimana kunci sertifikat dapat digunakan dalam C++."
type: docs
weight: 2200
url: /id/cpp/system.security.cryptography.x509certificates/x509keyusageflags/
---
## X509KeyUsageFlags enum


Mendefinisikan bagaimana kunci sertifikat dapat digunakan.

```cpp
enum class X509KeyUsageFlags : int32_t
```

### Nilai

| Nama | Nilai | Deskripsi |
| --- | --- | --- |
| None | 0 | Tidak ada parameter penggunaan kunci. |
| EncipherOnly | 1 | Kunci dapat digunakan hanya untuk enkripsi. |
| CrlSign | 2 | Kunci dapat digunakan untuk menandatangani daftar pencabutan sertifikat. |
| KeyCertSign | 4 | Kunci dapat digunakan untuk menandatangani sertifikat. |
| KeyAgreement | 8 | Kunci dapat digunakan untuk menentukan kesepakatan kunci. |
| DataEncipherment | 16 | Kunci dapat digunakan untuk enkripsi data. |
| KeyEncipherment | 32 | Kunci dapat digunakan untuk enkripsi kunci. |
| NonRepudiation | 64 | Kunci dapat digunakan untuk autentikasi. |
| DigitalSignature | 128 | Kunci dapat digunakan sebagai tanda tangan digital. |
| DecipherOnly | 32768 | Kunci hanya dapat digunakan untuk dekripsi. |

## Lihat Juga

* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Page for C++](../../)
