---
title: "kelas System::DefaultBoxedValue"
linktitle: "DefaultBoxedValue"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::DefaultBoxedValue. Implementasi kelas BoxedValue. Memungkinkan spesialisasi BoxingValue dideklarasikan tanpa menduplikasi kode umum. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 2000
url: /id/cpp/system/defaultboxedvalue/
---
## DefaultBoxedValue class


[BoxedValue](../boxedvalue/) class implementation. Allows it BoxingValue specializations to be declared without duplicating common code. Objects of this class should only be allocated using [System::MakeObject()](../makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
template<class T>class DefaultBoxedValue : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [DefaultBoxedValue](./defaultboxedvalue/)(const T\&) | Membuat instance baru dari kelas [DefaultBoxedValue](./) yang merepresentasikan nilai yang ditentukan. |
| [Equals](./equals/)(ptr) override | Menentukan kesetaraan nilai yang dibungkus yang diwakili oleh objek saat ini dan objek yang ditentukan. |
| [GetHashCode](./gethashcode/)() const override | Mengembalikan kode hash untuk objek saat ini. |
| [GetType](./gettype/)() const override | Mendapatkan tipe sebenarnya dari objek. |
| [is](./is/)() const | Menentukan apakah tipe nilai yang dibungkus yang diwakili oleh objek saat ini adalah **V**. |
| [ToString](./tostring/)() const override | Mengembalikan representasi string dari nilai yang dibungkus. |
| [unbox](./unbox/)() const | Melepaskan nilai yang dibungkus. |
## Lihat Juga

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
