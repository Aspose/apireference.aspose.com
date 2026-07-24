---
title: "System::Security::Cryptography::X509Certificates::X509Certificate2 class"
linktitle: "X509Certificate2"
second_title: "Aspose.Page untuk C++"
description: "System::Security::Cryptography::X509Certificates::X509Certificate2 class. Mewakili sertifikat X509. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject() function. Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskan ke fungsi sebagai argumen dalam C++."
type: docs
weight: 400
url: /id/cpp/system.security.cryptography.x509certificates/x509certificate2/
---
## X509Certificate2 class


Mewakili sertifikat X509. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/) function. Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskan ke fungsi sebagai argumen.

```cpp
class X509Certificate2 : public System::Security::Cryptography::X509Certificates::X509Certificate
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_Archived](./get_archived/)() const | Mendapatkan nilai yang menunjukkan bahwa sertifikat diarsipkan. |
| [get_Extensions](./get_extensions/)() const | Mendapatkan kumpulan objek ekstensi yang terkait dengan sertifikat. |
| [get_FriendlyName](./get_friendlyname/)() const | Mendapatkan nama ramah sertifikat. |
| [get_HasPrivateKey](./get_hasprivatekey/)() const | Memeriksa apakah sertifikat memiliki kunci pribadi. |
| [get_IssuerName](./get_issuername/)() const | Mendapatkan nama pihak yang mengeluarkan sertifikat. |
| [get_NotAfter](./get_notafter/)() const | Mendapatkan tanggal dan waktu lokal setelah mana sertifikat tidak lagi berlaku. |
| [get_NotBefore](./get_notbefore/)() const | Mendapatkan tanggal dan waktu lokal pada saat sertifikat menjadi berlaku. |
| [get_PrivateKey](./get_privatekey/)() const | Mendapatkan kunci pribadi yang terkait dengan sertifikat. |
| [get_PublicKey](./get_publickey/)() const | Mendapatkan objek [PublicKey](../publickey/) sertifikat. |
| [get_RawData](./get_rawdata/)() const | Mendapatkan data mentah sertifikat. |
| [get_SerialNumber](./get_serialnumber/)() const | Mendapatkan nomor seri sebuah sertifikat. |
| [get_SignatureAlgorithm](./get_signaturealgorithm/)() const | Mendapatkan algoritma yang digunakan untuk membuat tanda tangan sertifikat. |
| [get_SubjectName](./get_subjectname/)() const | Mendapatkan nama subjek dari sebuah sertifikat. |
| [get_Thumbprint](./get_thumbprint/)() const | Mendapatkan sidik jari sertifikat. |
| [get_Version](./get_version/)() const | Mendapatkan versi format sertifikat. |
| static [GetCertContentType](./getcertcontenttype/)(const ByteArrayPtr\&) | Mendapatkan tipe sertifikat yang terdapat dalam array byte yang ditentukan. |
| static [GetCertContentType](./getcertcontenttype/)(const String\&) | Mendapatkan tipe sertifikat yang terdapat dalam file yang ditentukan. |
| [GetDSAPrivateKey](./getdsaprivatekey/)() const | Mendapatkan kunci pribadi [RSA](../../system.security.cryptography/rsa/);. |
| [GetDSAPublicKey](./getdsapublickey/)() const | Mendapatkan kunci publik [RSA](../../system.security.cryptography/rsa/). |
| [GetECDsaPrivateKey](./getecdsaprivatekey/)() const | Mendapatkan kunci pribadi [RSA](../../system.security.cryptography/rsa/);. |
| [GetECDsaPublicKey](./getecdsapublickey/)() const | Mendapatkan kunci publik [RSA](../../system.security.cryptography/rsa/). |
| [GetNameInfo](./getnameinfo/)(X509NameType, bool) const | Mendapatkan nama subjek atau penerbit dari sertifikat. |
| [GetRSAPrivateKey](./getrsaprivatekey/)() const | Mendapatkan kunci pribadi [RSA](../../system.security.cryptography/rsa/);. |
| [GetRSAPublicKey](./getrsapublickey/)() const | Mendapatkan kunci publik [RSA](../../system.security.cryptography/rsa/). |
| [Import](./import/)(const String\&, const SecureStringPtr\&, X509KeyStorageFlags) override | Mengimpor informasi dari file sertifikat yang ditentukan. |
| [Import](./import/)(const String\&, const String\&, X509KeyStorageFlags) override | Mengimpor informasi dari file sertifikat yang ditentukan. |
| [Import](./import/)(const ByteArrayPtr\&, const SecureStringPtr\&, X509KeyStorageFlags) override | Mengimpor informasi dari data sertifikat yang ditentukan. |
| [Import](./import/)(const ByteArrayPtr\&, const String\&, X509KeyStorageFlags) override | Mengimpor informasi dari data sertifikat yang ditentukan. |
| [Import](./import/)(const String\&) override | Mengimpor informasi dari file sertifikat yang ditentukan. |
| [Import](./import/)(const ByteArrayPtr\&) override | Mengimpor informasi dari data sertifikat yang ditentukan. |
| [Reset](./reset/)() override | Mengatur ulang status sertifikat. |
| [set_Archived](./set_archived/)(bool) const | Mengatur nilai yang menunjukkan bahwa sertifikat diarsipkan. |
| [set_FriendlyName](./set_friendlyname/)(const String\&) | Mengatur nama ramah sertifikat. |
| [set_PrivateKey](./set_privatekey/)(const SharedPtr\<AsymmetricAlgorithm\>\&) | Mengatur atau menghapus kunci pribadi yang terkait dengan sertifikat. |
| [ToString](./tostring/)(bool) const override | Mengembalikan informasi sertifikat dalam format teks. |
| [ToString](./tostring/)() const override | Mengembalikan informasi sertifikat dalam format teks. |
| [Verify](./verify/)() const | Memverifikasi rantai sertifikat. |
| [X509Certificate2](./x509certificate2/)() | Membuat [X509Certificate2](./) kosong. |
| [X509Certificate2](./x509certificate2/)(const String\&) | Konstruktor. |
| [X509Certificate2](./x509certificate2/)(const SharedPtr\<X509Certificate\>\&) | Konstruktor. |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&) | Konstruktor. |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&, const String\&) | Konstruktor. |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&, const SecureStringPtr\&) | Konstruktor. |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&, const String\&, X509KeyStorageFlags) | Konstruktor. |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&, const SecureStringPtr\&, X509KeyStorageFlags) | Konstruktor. |
| [X509Certificate2](./x509certificate2/)(const String\&, const String\&) | Konstruktor. |
| [X509Certificate2](./x509certificate2/)(const String\&, const SecureStringPtr\&) | Konstruktor. |
| [X509Certificate2](./x509certificate2/)(const String\&, const String\&, X509KeyStorageFlags) | Konstruktor. |
| [X509Certificate2](./x509certificate2/)(const String\&, const SecureStringPtr\&, X509KeyStorageFlags) | Konstruktor. |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&, const ByteArrayPtr\&, X509KeyStorageFlags) | Konstruktor. |
## Lihat Juga

* Class [X509Certificate](../x509certificate/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Page for C++](../../)
