---
title: "Kelas System::Reflection::Assembly"
linktitle: "Assembly"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Reflection::Assembly. Kelas refleksi yang menggambarkan assembly. Dukungan terbatas karena aturan berbeda antara C# dan C++. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menghasilkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk melewatkannya ke fungsi sebagai argumen di C++."
type: docs
weight: 100
url: /id/cpp/system.reflection/assembly/
---
## Assembly class


[Reflection](../) class describing assembly. Support is limited as the rules are quite different between C# and C++. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Assembly : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Assembly](./assembly/)() | Konstruktor. |
| virtual [get_CodeBase](./get_codebase/)() const | Mendapatkan direktori assembly saat ini. Dukungan terbatas. |
| virtual [get_FullName](./get_fullname/)() const | Mendapatkan nama lengkap assembly. |
| virtual [get_Location](./get_location/)() const | Mendapatkan lokasi assembly. Tidak diimplementasikan. |
| static [GetAssembly](./getassembly/)(const TypeInfo\&) | Mendapatkan assembly yang mendefinisikan tipe tertentu. |
| static [GetCallingAssembly](./getcallingassembly/)() | Mendapatkan assembly pemanggil. |
| static [GetEntryAssembly](./getentryassembly/)() | Mendapatkan assembly entri. |
| static [GetExecutingAssembly](./getexecutingassembly/)() | Mendapatkan assembly yang sedang dieksekusi. |
| virtual [GetManifestResourceNames](./getmanifestresourcenames/)() const | Mendapatkan nama-nama sumber daya manifest. |
| virtual [GetManifestResourceStream](./getmanifestresourcestream/)(String) const | Mendapatkan stream yang terhubung ke sumber daya manifest. |
| virtual [GetName](./getname/)() const | Mendapatkan nama assembly. |
| virtual [GetTypes](./gettypes/)() const | Mendapatkan tipe-tipe yang dideklarasikan oleh assembly. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Reflection](../)
* Library [Aspose.Page for C++](../../)
