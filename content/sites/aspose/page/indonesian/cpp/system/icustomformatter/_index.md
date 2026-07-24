---
title: "Kelas System::ICustomFormatter"
linktitle: "ICustomFormatter"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::ICustomFormatter. Mendefinisikan metode yang melakukan pemformatan khusus pada representasi string dari nilai yang diwakili oleh objek yang ditentukan. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 3500
url: /id/cpp/system/icustomformatter/
---
## ICustomFormatter class


Mendefinisikan metode yang melakukan pemformatan khusus pada representasi string dari nilai yang diwakili oleh objek yang ditentukan. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class ICustomFormatter : public virtual System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [Format](./format/)(System::String, System::SharedPtr\<System::Object\>, System::SharedPtr\<System::IFormatProvider\>) | Mengembalikan representasi string dari nilai yang diwakili oleh objek saat ini menggunakan format yang ditentukan. |
## Lihat Juga

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
