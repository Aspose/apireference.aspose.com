---
title: "System::Security::Cryptography::X509Certificates::X509Certificate kelas"
linktitle: "X509Certificate"
second_title: "Aspose.Page untuk C++"
description: "System::Security::Cryptography::X509Certificates::X509Certificate kelas. Sertifikat X.509 v.3. Sertifikat yang dienkripsi tidak didukung. Hanya flag X509KeyStorageFlags::DefaultKeySet yang didukung. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject() . Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 300
url: /id/cpp/system.security.cryptography.x509certificates/x509certificate/
---
## X509Certificate class


Sertifikat X.509 v.3. Sertifikat yang dienkripsi tidak didukung. Hanya flag [X509KeyStorageFlags::DefaultKeySet](../x509keystorageflags/) yang didukung. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/) . Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class X509Certificate : public virtual System::Object,
                        public System::IDisposable
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| static [CreateFromCertFile](./createfromcertfile/)(const String\&) | Membuat sertifikat dari file PKCS7 yang ditentukan. |
| static [CreateFromSignedFile](./createfromsignedfile/)(const String\&) | Membuat sertifikat dari file yang ditandatangani yang ditentukan. |
| [Dispose](./dispose/)() override | Tidak melakukan apa-apa. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Membandingkan dua sertifikat. |
| virtual [Export](./export/)(X509ContentType) const | Mengekspor objek saat ini ke array byte menggunakan format yang ditentukan. TIDAK DIIMPLEMENTASIKAN. |
| virtual [Export](./export/)(X509ContentType, const SecureStringPtr\&) const | Mengekspor objek saat ini ke array byte menggunakan format yang ditentukan. TIDAK DIIMPLEMENTASIKAN. |
| virtual [Export](./export/)(X509ContentType, const String\&) const | Mengekspor objek saat ini ke array byte menggunakan format yang ditentukan. TIDAK DIIMPLEMENTASIKAN. |
| [get_Handle](./get_handle/)() const | Mendapatkan handle ke konteks sertifikat Microsoft Cryptographic API. |
| [get_Issuer](./get_issuer/)() const | Mendapatkan nama otoritas sertifikat yang mengeluarkan sertifikat X.509v3. |
| [get_Subject](./get_subject/)() const | Mendapatkan nama terdistinguish subjek dari sertifikat. |
| virtual [GetCertHash](./getcerthash/)() const | Mendapatkan hash untuk objek saat ini sebagai array byte. |
| virtual [GetCertHash](./getcerthash/)(const HashAlgorithmName\&) const | Mendapatkan hash untuk objek saat ini sebagai array byte. |
| virtual [GetCertHashString](./getcerthashstring/)() const | Mendapatkan hash [SHA1](../../system.security.cryptography/sha1/) untuk objek saat ini sebagai string heksadesimal. |
| virtual [GetCertHashString](./getcerthashstring/)(const HashAlgorithmName\&) const | Mendapatkan hash [SHA1](../../system.security.cryptography/sha1/) untuk objek saat ini sebagai string heksadesimal. |
| virtual [GetEffectiveDateString](./geteffectivedatestring/)() const | Mendapatkan tanggal berlaku dari sertifikat saat ini. |
| virtual [GetExpirationDateString](./getexpirationdatestring/)() const | Mendapatkan tanggal kedaluwarsa dari sertifikat saat ini. |
| virtual [GetFormat](./getformat/)() const | Mendapatkan nama format sertifikat. |
| [GetHashCode](./gethashcode/)() const override | Mendapatkan kode hash sertifikat. |
| virtual [GetIssuerName](./getissuername/)() const | Mendapatkan nama otoritas sertifikasi yang mengeluarkan sertifikat saat ini. |
| virtual [GetKeyAlgorithm](./getkeyalgorithm/)() const | Mendapatkan informasi kunci untuk sertifikat saat ini sebagai string. |
| virtual [GetKeyAlgorithmParameters](./getkeyalgorithmparameters/)() const | Mendapatkan informasi kunci untuk sertifikat saat ini sebagai array byte. |
| virtual [GetKeyAlgorithmParametersString](./getkeyalgorithmparametersstring/)() const | Mendapatkan informasi kunci untuk sertifikat saat ini sebagai string heksadesimal. |
| virtual [GetName](./getname/)() const | Mendapatkan nama prinsipal yang menerima sertifikat saat ini. |
| virtual [GetPublicKey](./getpublickey/)() const | Mendapatkan kunci publik dari sertifikat sebagai array byte. |
| virtual [GetPublicKeyString](./getpublickeystring/)() const | Mendapatkan kunci publik dari sertifikat sebagai string heksadesimal. |
| virtual [GetRawCertData](./getrawcertdata/)() const | Mendapatkan data mentah dari sertifikat sebagai array byte. |
| virtual [GetRawCertDataString](./getrawcertdatastring/)() const | Mendapatkan data mentah dari sertifikat sebagai string heksadesimal. |
| virtual [GetSerialNumber](./getserialnumber/)() const | Mendapatkan nomor seri dari sertifikat sebagai array byte. |
| virtual [GetSerialNumberString](./getserialnumberstring/)() const | Mendapatkan nomor seri dari sertifikat sebagai string heksadesimal. |
| virtual [Import](./import/)(const String\&, const SecureStringPtr\&, X509KeyStorageFlags) | Mengimpor informasi dari file sertifikat yang ditentukan. TIDAK DIIMPLEMENTASIKAN. |
| virtual [Import](./import/)(const String\&, const String\&, X509KeyStorageFlags) | Mengimpor informasi dari file sertifikat yang ditentukan. TIDAK DIIMPLEMENTASIKAN. |
| virtual [Import](./import/)(const ByteArrayPtr\&, const SecureStringPtr\&, X509KeyStorageFlags) | Mengimpor informasi dari data sertifikat yang ditentukan. TIDAK DIIMPLEMENTASIKAN. |
| virtual [Import](./import/)(const ByteArrayPtr\&, const String\&, X509KeyStorageFlags) | Mengimpor informasi dari data sertifikat yang ditentukan. TIDAK DIIMPLEMENTASIKAN. |
| virtual [Import](./import/)(const String\&) | Mengimpor informasi dari file sertifikat yang ditentukan. TIDAK DIIMPLEMENTASIKAN. |
| virtual [Import](./import/)(const ByteArrayPtr\&) | Mengimpor informasi dari data sertifikat yang ditentukan. TIDAK DIIMPLEMENTASIKAN. |
| [operator=](./operator=/)(const X509Certificate\&) |  |
| virtual [Reset](./reset/)() | Mengatur ulang status sertifikat. |
| virtual [ToString](./tostring/)(bool) const | Mengembalikan informasi sertifikat dalam format teks. |
| [ToString](./tostring/)() const override | Mengembalikan informasi sertifikat dalam format teks. |
| [X509Certificate](./x509certificate/)(const X509Certificate\&) |  |
| [X509Certificate](./x509certificate/)() | Konstruktor. |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&) | Konstruktor. |
| [X509Certificate](./x509certificate/)(const String\&) | Konstruktor. |
| [X509Certificate](./x509certificate/)(const SharedPtr\<X509Certificate\>\&) | Konstruktor. |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&, const String\&) | Konstruktor. |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&, const SecureStringPtr\&) | Konstruktor. |
| [X509Certificate](./x509certificate/)(const String\&, const String\&) | Konstruktor. |
| [X509Certificate](./x509certificate/)(const String\&, const SecureStringPtr\&) | Konstruktor. |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&, const String\&, X509KeyStorageFlags) | Konstruktor. |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&, const SecureStringPtr\&, X509KeyStorageFlags) | Konstruktor. |
| [X509Certificate](./x509certificate/)(const String\&, const String\&, X509KeyStorageFlags) | Konstruktor. |
| [X509Certificate](./x509certificate/)(const String\&, const SecureStringPtr\&, X509KeyStorageFlags) | Konstruktor. |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&, const ByteArrayPtr\&, X509KeyStorageFlags) | Konstruktor. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Tipe pointer. |
## Lihat Juga

* Class [Object](../../system/object/)
* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Page for C++](../../)
