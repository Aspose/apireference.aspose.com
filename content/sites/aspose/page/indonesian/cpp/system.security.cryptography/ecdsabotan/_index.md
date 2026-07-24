---
title: "System::Security::Cryptography::ECDsaBotan kelas"
linktitle: "ECDsaBotan"
second_title: "Aspose.Page untuk C++"
description: "System::Security::Cryptography::ECDsaBotan kelas. Algoritma ECDsa dalam bentuk Botan. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 1400
url: /id/cpp/system.security.cryptography/ecdsabotan/
---
## ECDsaBotan class


[ECDsa](../ecdsa/) algorithm in Botan form. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class ECDsaBotan : public System::Security::Cryptography::ECDsa
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [ECDsaBotan](./ecdsabotan/)() | Konstruktor. Menggunakan parameter default. |
| [ECDsaBotan](./ecdsabotan/)(const ECParameters\&) | Konstruktor. |
| [ECDsaBotan](./ecdsabotan/)(const ECCurve\&) | Konstruktor. |
| [ECDsaBotan](./ecdsabotan/)(int32_t) | Konstruktor. |
| [ECDsaBotan](./ecdsabotan/)(const Botan::ECDSA_PublicKey\&) | Konstruktor. |
| [ECDsaBotan](./ecdsabotan/)(const Botan::ECDSA_PrivateKey\&) | Konstruktor. |
| [ExportExplicitParameters](./exportexplicitparameters/)(bool) override | Mengekspor parameter eksplisit. |
| [ExportParameters](./exportparameters/)(bool) override | Mengekspor parameter bernama atau eksplisit. |
| [FromXmlString](./fromxmlstring/)(String) override | Menginisialisasi objek menggunakan parameter yang dikodekan XML. Tidak diimplementasikan. |
| [FromXmlString](./fromxmlstring/)(const String\&, ECKeyXmlFormat) | Menginisialisasi objek menggunakan parameter yang dikodekan XML. Tidak diimplementasikan. |
| [GenerateKey](./generatekey/)(const ECCurve\&) override | Menghasilkan pasangan kunci publik/privat baru untuk kurva yang ditentukan. |
| [get_HashAlgorithm](./get_hashalgorithm/)() const | Mendapatkan algoritma hash. |
| [HashData](./hashdata/)(ByteArrayPtr, int32_t, int32_t, HashAlgorithmName) override | Menghitung nilai hash dari array data yang ditentukan menggunakan algoritma hash yang ditentukan. |
| [HashData](./hashdata/)(StreamPtr, HashAlgorithmName) override | Menghitung nilai hash dari aliran biner yang ditentukan menggunakan algoritma hash yang ditentukan. |
| [ImportParameters](./importparameters/)(const ECParameters\&) override | Mengimpor semua parameter dari struktur data. |
| [set_HashAlgorithm](./set_hashalgorithm/)(const HashAlgorithmName\&) | Mengatur algoritma hash. |
| [set_KeySize](./set_keysize/)(int32_t) override | Mengatur ukuran kunci. |
| [SignData](./signdata/)(const ByteArrayPtr\&) | Menghitung nilai hash dari array data yang ditentukan, dan menandatangani hasilnya. |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t) | Menghitung nilai hash dari array data yang ditentukan, dan menandatangani hasilnya. |
| [SignData](./signdata/)(const StreamPtr\&) | Menghitung nilai hash dari aliran biner yang ditentukan, dan menandatangani hasilnya. |
| virtual [SignData](./signdata/)(const ByteArrayPtr\&, const HashAlgorithmName\&) | Informasi RTTI. |
| virtual [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) | Informasi RTTI. |
| virtual [SignData](./signdata/)(const StreamPtr\&, const HashAlgorithmName\&) | Informasi RTTI. |
| [SignHash](./signhash/)(const ByteArrayPtr\&) override | Menghitung tanda tangan dari nilai input yang ditentukan. |
| [ToXmlString](./toxmlstring/)(bool) override | Mengekspor semua parameter dalam format XML. Tidak diimplementasikan. |
| [ToXmlString](./toxmlstring/)(ECKeyXmlFormat) | Mengekspor semua parameter dalam format XML. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&) | Memverifikasi bahwa tanda tangan dari data yang ditentukan valid. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&) | Memverifikasi bahwa tanda tangan dari data yang ditentukan valid. |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&) | Memverifikasi bahwa tanda tangan dari aliran biner yang ditentukan valid. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | Memverifikasi bahwa tanda tangan dari data yang ditentukan valid. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) | Memverifikasi bahwa tanda tangan dari data yang ditentukan valid. |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | Memverifikasi bahwa tanda tangan dari aliran biner yang ditentukan valid. |
| [VerifyHash](./verifyhash/)(ByteArrayPtr, ByteArrayPtr) override | Memeriksa tanda tangan data. |
## Lihat Juga

* Class [ECDsa](../ecdsa/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
