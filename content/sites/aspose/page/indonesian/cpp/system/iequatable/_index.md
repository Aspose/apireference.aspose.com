---
title: "kelas System::IEquatable"
linktitle: "IEquatable"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::IEquatable. Mendefinisikan metode yang menentukan kesetaraan dua objek. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk melewatkannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 3700
url: /id/cpp/system/iequatable/
---
## IEquatable class


Mendefinisikan metode yang menentukan kesetaraan dua objek. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../smartptr/) dan gunakan pointer ini untuk melewatkannya ke fungsi sebagai argumen.

```cpp
template<typename T>class IEquatable : public virtual System::Object
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe objek yang dibandingkan |
## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [Equals](./equals/)(T) | Menentukan apakah objek saat ini dan objek yang ditentukan sama. |

## Lihat Juga

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
