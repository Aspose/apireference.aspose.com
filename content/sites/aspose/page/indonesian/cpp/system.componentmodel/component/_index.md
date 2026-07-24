---
title: "System::ComponentModel::Component kelas"
linktitle: "Component"
second_title: "Aspose.Page untuk C++"
description: "System::ComponentModel::Component kelas. Kelas dummy untuk membuat kode terjemahan yang menggunakan kelas Component dapat dikompilasi. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance dari tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk melewatkannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 400
url: /id/cpp/system.componentmodel/component/
---
## Component class


Kelas dummy untuk membuat kode terjemahan yang menggunakan kelas [Component](./) dapat dikompilasi. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance dari tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk melewatkannya ke fungsi sebagai argumen.

```cpp
class Component : public System::MarshalByRefObject,
                  public System::ComponentModel::IComponent
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Component](./component/)() | Informasi RTTI. |
| [Dispose](./dispose/)(bool) | Dukungan pola disposable; tidak melakukan apa-apa. |
| [get_DesignMode](./get_designmode/)() | Memeriksa apakah komponen berada dalam mode desain. |
## Lihat Juga

* Class [MarshalByRefObject](../../system/marshalbyrefobject/)
* Class [IComponent](../icomponent/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
