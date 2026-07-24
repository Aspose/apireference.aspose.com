---
title: "Kelas System::Array::Enumerator"
linktitle: "Enumerator"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Array::Enumerator. Mengimplementasikan antarmuka IEnumerator yang memungkinkan enumerasi elemen dari objek Array. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini pada stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen dalam C++."
type: docs
weight: 6800
url: /id/cpp/system/array/enumerator/
---
## Enumerator class


Mengimplementasikan antarmuka IEnumerator yang memungkinkan enumerasi elemen dari objek [Array](../). Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../makeobject/). Jangan pernah membuat instance tipe ini pada stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../smartptr/) dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen.

```cpp
class Enumerator : public virtual System::Object,
                   public System::Collections::Generic::IEnumerator<T>
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Enumerator](./enumerator/)(const SharedPtr\<Array\<T\>\>\&) | Membuat objek [Enumerator](./) baru yang mewakili array yang ditentukan. |
| [get_Current](./get_current/)() const override | Mengembalikan salinan elemen saat ini. |
| [MoveNext](./movenext/)() override | Memeriksa apakah indeks elemen saat ini tidak menunjuk ke elemen terakhir dalam array dan memajukannya jika tidak. |
| [Reset](./reset/)() override | Mengatur ulang indeks elemen saat ini. |
| virtual [~Enumerator](./~enumerator/)() | Destruktor. |
## Lihat Juga

* Class [Object](../../object/)
* Class [IEnumerator](../../../system.collections.generic/ienumerator/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
