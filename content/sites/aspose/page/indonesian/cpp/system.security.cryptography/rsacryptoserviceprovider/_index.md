---
title: "System::Security::Cryptography::RSACryptoServiceProvider kelas"
linktitle: "RSACryptoServiceProvider"
second_title: "Aspose.Page untuk C++"
description: "System::Security::Cryptography::RSACryptoServiceProvider kelas. Algoritma RSA dalam bentuk CSP. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan waktu jalan dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 3500
url: /id/cpp/system.security.cryptography/rsacryptoserviceprovider/
---
## RSACryptoServiceProvider class


[RSA](../rsa/) algorithm in CSP form. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class RSACryptoServiceProvider : public System::Security::Cryptography::RSA,
                                 public System::Security::Cryptography::ICspAsymmetricAlgorithm
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Decrypt](./decrypt/)(const ByteArrayPtr\&, bool) | Mendekripsi pesan. Tidak diimplementasikan. |
| [Decrypt](./decrypt/)(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) override | Mendekripsi data masukan menggunakan mode padding yang ditentukan. |
| [Dispose](./dispose/)() override | Membebaskan data yang terkait dengan objek. |
| [Encrypt](./encrypt/)(const ByteArrayPtr\&, bool) | Mengenkripsi pesan. Tidak diimplementasikan. |
| [Encrypt](./encrypt/)(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) override | Mengenkripsi data masukan menggunakan mode padding yang ditentukan. |
| [ExportCspBlob](./exportcspblob/)(bool) override | Mengekspor blob dengan informasi tentang kunci. Tidak diimplementasikan. |
| [ExportParameters](./exportparameters/)(bool) override | Mengekspor parameter CSP. |
| [get_CspKeyContainerInfo](./get_cspkeycontainerinfo/)() override | Mendapatkan objek [CspKeyContainerInfo](../cspkeycontainerinfo/). |
| [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() override | Memeriksa algoritma pertukaran kunci yang terkait dengan objek. |
| [get_KeySize](./get_keysize/)() override | Mendapatkan ukuran kunci yang digunakan oleh algoritma. |
| [get_PersistKeyInCsp](./get_persistkeyincsp/)() const | Memeriksa apakah kunci dipertahankan dalam objek CSP. |
| [get_PublicOnly](./get_publiconly/)() const | Memeriksa apakah hanya kunci publik yang ada dalam objek CSP. |
| [get_SignatureAlgorithm](./get_signaturealgorithm/)() override | Mendapatkan algoritma tanda tangan yang terkait dengan objek CSP. |
| static [get_UseMachineKeyStore](./get_usemachinekeystore/)() | Memeriksa apakah kunci dipertahankan di penyimpanan mesin alih-alih penyimpanan pengguna. |
| [ImportCspBlob](./importcspblob/)(ByteArrayPtr) override | Mengimpor blob dengan informasi tentang kunci. Tidak diimplementasikan. |
| [ImportParameters](./importparameters/)(RSAParameters) override | Mengimpor parameter CSP. |
| [RSACryptoServiceProvider](./rsacryptoserviceprovider/)() | Informasi RTTI. |
| [RSACryptoServiceProvider](./rsacryptoserviceprovider/)(const SharedPtr\<CspParameters\>\&) | Konstruktor. Tidak diimplementasikan. |
| [RSACryptoServiceProvider](./rsacryptoserviceprovider/)(const RSAParameters\&) | Konstruktor. |
| [RSACryptoServiceProvider](./rsacryptoserviceprovider/)(int32_t) | Konstruktor. |
| [RSACryptoServiceProvider](./rsacryptoserviceprovider/)(int32_t, const SharedPtr\<CspParameters\>\&) | Konstruktor. Tidak diimplementasikan. |
| [set_PersistKeyInCsp](./set_persistkeyincsp/)(bool) | Mendefinisikan apakah kunci dipertahankan dalam objek CSP. |
| static [set_UseMachineKeyStore](./set_usemachinekeystore/)(bool) | Mendefinisikan apakah kunci dipertahankan di penyimpanan mesin alih-alih penyimpanan pengguna. |
| [SignData](./signdata/)(const ByteArrayPtr\&, const SharedPtr\<Object\>\&) | Menghitung tanda tangan dari nilai input yang ditentukan. |
| [SignData](./signdata/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<Object\>\&) | Menghitung tanda tangan dari nilai input yang ditentukan. |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const SharedPtr\<Object\>\&) | Menghitung tanda tangan dari nilai input yang ditentukan. |
| [SignHash](./signhash/)(ByteArrayPtr, HashAlgorithmName, SharedPtr\<RSASignaturePadding\>) override | Menghitung tanda tangan untuk nilai hash yang ditentukan. |
| [SignHash](./signhash/)(const ByteArrayPtr\&, const String\&) | Menghitung tanda tangan dari nilai input yang ditentukan. Tidak diimplementasikan. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const SharedPtr\<Object\>\&, const ByteArrayPtr\&) | Memeriksa tanda tangan data. |
| [VerifyHash](./verifyhash/)(const ByteArrayPtr\&, const String\&, const ByteArrayPtr\&) | Memeriksa tanda tangan data. |
| [VerifyHash](./verifyhash/)(ByteArrayPtr, ByteArrayPtr, const HashAlgorithmName\&, SharedPtr\<RSASignaturePadding\>) override | Memverifikasi bahwa tanda tangan dari hash yang ditentukan valid. |
## Lihat Juga

* Class [RSA](../rsa/)
* Class [ICspAsymmetricAlgorithm](../icspasymmetricalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
