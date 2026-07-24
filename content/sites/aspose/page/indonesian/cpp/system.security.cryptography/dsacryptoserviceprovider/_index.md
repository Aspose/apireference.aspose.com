---
title: "kelas System::Security::Cryptography::DSACryptoServiceProvider"
linktitle: "DSACryptoServiceProvider"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Security::Cryptography::DSACryptoServiceProvider. Algoritma DSA dalam bentuk CSP. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 1000
url: /id/cpp/system.security.cryptography/dsacryptoserviceprovider/
---
## DSACryptoServiceProvider class


[DSA](../dsa/) algorithm in CSP form. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class DSACryptoServiceProvider : public System::Security::Cryptography::DSA,
                                 public System::Security::Cryptography::ICspAsymmetricAlgorithm
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [CreateSignature](./createsignature/)(ByteArrayPtr) override | Buat tanda tangan [DSA](../dsa/) untuk data yang ditentukan. |
| [Dispose](./dispose/)() override | Membebaskan data yang terkait dengan objek. |
| [DSACryptoServiceProvider](./dsacryptoserviceprovider/)() | Konstruktor. Menggunakan parameter default. |
| [DSACryptoServiceProvider](./dsacryptoserviceprovider/)(const DSAParameters\&) | Konstruktor. |
| [DSACryptoServiceProvider](./dsacryptoserviceprovider/)(const SharedPtr\<CspParameters\>\&) | Konstruktor. Tidak diimplementasikan. |
| [DSACryptoServiceProvider](./dsacryptoserviceprovider/)(int32_t) | Konstruktor. |
| [DSACryptoServiceProvider](./dsacryptoserviceprovider/)(int32_t, const SharedPtr\<CspParameters\>\&) | Konstruktor. Tidak diimplementasikan. |
| [ExportCspBlob](./exportcspblob/)(bool) override | Mengekspor blob dengan informasi tentang kunci. Tidak diimplementasikan. |
| [ExportParameters](./exportparameters/)(bool) override | Mengekspor parameter CSP. |
| [get_CspKeyContainerInfo](./get_cspkeycontainerinfo/)() override | Mendapatkan objek [CspKeyContainerInfo](../cspkeycontainerinfo/). |
| [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() override | Memeriksa algoritma pertukaran kunci yang terkait dengan objek. |
| [get_KeySize](./get_keysize/)() override | Mendapatkan ukuran kunci. |
| [get_PersistKeyInCsp](./get_persistkeyincsp/)() const | Memeriksa apakah kunci dipertahankan dalam objek CSP. |
| [get_PublicOnly](./get_publiconly/)() const | Memeriksa apakah hanya kunci publik yang ada dalam objek CSP. |
| [get_SignatureAlgorithm](./get_signaturealgorithm/)() override | Mendapatkan algoritma tanda tangan yang akan digunakan. |
| static [get_UseMachineKeyStore](./get_usemachinekeystore/)() | Memeriksa apakah kunci dipertahankan di penyimpanan mesin alih-alih penyimpanan pengguna. |
| [ImportCspBlob](./importcspblob/)(ByteArrayPtr) override | Mengimpor blob dengan informasi tentang kunci. Tidak diimplementasikan. |
| [ImportParameters](./importparameters/)(DSAParameters) override | Mengimpor semua parameter dari struktur data. |
| [set_PersistKeyInCsp](./set_persistkeyincsp/)(bool) | Mendefinisikan apakah kunci dipertahankan dalam objek CSP. |
| static [set_UseMachineKeyStore](./set_usemachinekeystore/)(bool) | Mendefinisikan apakah kunci dipertahankan di penyimpanan mesin alih-alih penyimpanan pengguna. |
| [SignData](./signdata/)(const ByteArrayPtr\&) | Menghitung tanda tangan dari nilai input yang ditentukan. |
| [SignData](./signdata/)(const SharedPtr\<IO::Stream\>\&) | Menghitung tanda tangan dari nilai input yang ditentukan. |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t) | Menghitung tanda tangan dari nilai input yang ditentukan. |
| [SignData](./signdata/)(const ByteArrayPtr\&, const HashAlgorithmName\&) | Informasi RTTI. |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) | Informasi RTTI. |
| [SignData](./signdata/)(const StreamPtr\&, const HashAlgorithmName\&) | Informasi RTTI. |
| [SignHash](./signhash/)(const ByteArrayPtr\&, const String\&) | Menghitung tanda tangan dari nilai input yang ditentukan. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&) | Memeriksa tanda tangan data. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | Memverifikasi bahwa tanda tangan dari data yang ditentukan valid. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) | Memverifikasi bahwa tanda tangan dari data yang ditentukan valid. |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | Memverifikasi bahwa tanda tangan dari aliran biner yang ditentukan valid. |
| [VerifyHash](./verifyhash/)(const ByteArrayPtr\&, const String\&, const ByteArrayPtr\&) | Memeriksa tanda tangan data. |
| [VerifySignature](./verifysignature/)(ByteArrayPtr, ByteArrayPtr) override | Verifikasi tanda tangan [DSA](../dsa/) untuk data yang ditentukan. |
## Lihat Juga

* Class [DSA](../dsa/)
* Class [ICspAsymmetricAlgorithm](../icspasymmetricalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
