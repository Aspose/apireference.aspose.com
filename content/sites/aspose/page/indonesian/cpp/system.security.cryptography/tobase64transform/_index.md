---
title: "System::Security::Cryptography::ToBase64Transform kelas"
linktitle: "ToBase64Transform"
second_title: "Aspose.Page untuk C++"
description: "System::Security::Cryptography::ToBase64Transform kelas. Mengonversi instance kelas CryptoStream ke base 64. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 5000
url: /id/cpp/system.security.cryptography/tobase64transform/
---
## ToBase64Transform class


Mengonversi instance kelas [CryptoStream](../cryptostream/) ke base 64. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class ToBase64Transform : public System::Security::Cryptography::ICryptoTransform
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Clear](./clear/)() | Melepaskan semua sumber daya. |
| [Dispose](./dispose/)() | Melepaskan sumber daya sistem operasi yang diperoleh oleh objek saat ini. |
| virtual [get_CanReuseTransform](./get_canreusetransform/)() | Mendapatkan nilai yang menunjukkan apakah transformasi saat ini dapat digunakan kembali. |
| [get_CanTransformMultipleBlocks](./get_cantransformmultipleblocks/)() | Mendapatkan nilai yang menunjukkan apakah beberapa blok dapat ditransformasi. |
| virtual [get_InputBlockSize](./get_inputblocksize/)() | Ukuran blok masukan. |
| virtual [get_OutputBlockSize](./get_outputblocksize/)() | Ukuran blok keluaran. |
| [TransformBlock](./transformblock/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, System::ArrayPtr\<uint8_t\>, int32_t) | Memproses blok data dan menyalin data ke array keluaran. |
| [TransformFinalBlock](./transformfinalblock/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t) | Memproses blok data terakhir dan menghitung nilai output. |
| virtual [~ToBase64Transform](./~tobase64transform/)() | Destruktor. |
## Lihat Juga

* Class [ICryptoTransform](../icryptotransform/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
