---
title: "System::IComparable kelas"
linktitle: "IComparable"
second_title: "Aspose.Page untuk C++"
description: "System::IComparable kelas. Mendefinisikan sebuah metode yang membandingkan dua objek. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 3300
url: /id/cpp/system/icomparable/
---
## IComparable class


Mendefinisikan sebuah metode yang membandingkan dua objek. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../smartptr/) dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen.

```cpp
template<typename T>class IComparable : public virtual System::Object
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe objek yang dibandingkan dengan objek saat ini |
## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [CompareTo](./compareto/)(T) | Membandingkan objek saat ini dengan objek yang ditentukan. |

## Lihat Juga

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
