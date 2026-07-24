---
title: "Kelas System::Security::Cryptography::ICspAsymmetricAlgorithm"
linktitle: "ICspAsymmetricAlgorithm"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Security::Cryptography::ICspAsymmetricAlgorithm. Kelas dasar algoritma asimetris. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 2100
url: /id/cpp/system.security.cryptography/icspasymmetricalgorithm/
---
## ICspAsymmetricAlgorithm class


Kelas dasar algoritma asimetris. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class ICspAsymmetricAlgorithm : public virtual System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [ExportCspBlob](./exportcspblob/)(bool) | Mengekspor blob dengan informasi kunci. |
| virtual [get_CspKeyContainerInfo](./get_cspkeycontainerinfo/)() | Informasi RTTI. |
| virtual [ImportCspBlob](./importcspblob/)(ByteArrayPtr) | Mengimpor informasi kunci dari blob data. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
