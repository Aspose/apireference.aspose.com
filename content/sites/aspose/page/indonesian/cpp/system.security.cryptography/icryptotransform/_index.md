---
title: "System::Security::Cryptography::ICryptoTransform class"
linktitle: "ICryptoTransform"
second_title: "Aspose.Page untuk C++"
description: "System::Security::Cryptography::ICryptoTransform class. Kelas dasar transformator kriptografi. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk melewatkannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 2000
url: /id/cpp/system.security.cryptography/icryptotransform/
---
## ICryptoTransform class


Kelas dasar transformator kriptografi. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk melewatkannya ke fungsi sebagai argumen.

```cpp
class ICryptoTransform : public virtual System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [get_InputBlockSize](./get_inputblocksize/)() | Ukuran blok masukan. |
| virtual [get_OutputBlockSize](./get_outputblocksize/)() | Ukuran blok keluaran. |
| virtual [TransformBlock](./transformblock/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<uint8_t\>, int) | Informasi RTTI. |
| virtual [TransformFinalBlock](./transformfinalblock/)(ArrayPtr\<uint8_t\>, int, int) | Memproses blok data terakhir dan menghitung nilai output. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
