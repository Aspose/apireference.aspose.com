---
title: "Ruang nama System::Reflection"
linktitle: "System::Reflection"
second_title: "Aspose.Page untuk C++"
description: "Cara menggunakan ruang nama System::Reflection dalam C++."
type: docs
weight: 4900
url: /id/cpp/system.reflection/
---



## Kelas

| Kelas | Deskripsi |
| --- | --- |
| [Assembly](./assembly/) | [Reflection](./) kelas yang menggambarkan assembly. Dukungan terbatas karena aturannya cukup berbeda antara C# dan C++. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menghasilkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer [System::SmartPtr](../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen. |
| [AssemblyName](./assemblyname/) | Menentukan nama assembly. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menghasilkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer [System::SmartPtr](../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen. |
| [AssemblyTypeRegistration](./assemblytyperegistration/) | Singleton untuk mendaftarkan tipe dalam assembly yang sedang dijalankan. |
| [AssemblyTypeRegistrationBase](./assemblytyperegistrationbase/) | Tipe dasar untuk singleton yang mendaftarkan tipe dalam assembly yang sedang dijalankan. |
| [ConstructorInfo](./constructorinfo/) | Menyediakan akses ke metadata konstruktor. |
| [FieldInfo](./fieldinfo/) | Menemukan atribut sebuah bidang dan menyediakan akses ke metadata bidang. |
| [MemberInfo](./memberinfo/) | Menyediakan informasi refleksi pada anggota. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menghasilkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer [System::SmartPtr](../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen. |
| [MethodBase](./methodbase/) | Informasi dasar tentang metode. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menghasilkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer [System::SmartPtr](../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen. |
| [MethodInfo](./methodinfo/) | Mewakili informasi tentang metode kelas. |
| [PropertyInfo](./propertyinfo/) | Mewakili informasi properti. |
## Enums

| Enum | Deskripsi |
| --- | --- |
| [BindingFlags](./bindingflags/) | Mendefinisikan anggota dan mode pencarian tipe serta pengikatan. |
| [FieldAttributes](./fieldattributes/) | Atribut bidang yang direfleksikan. |
| [MemberTypes](./membertypes/) | Menandai setiap jenis anggota. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [ReflectionTypeLoadException](./reflectiontypeloadexception/) | [ReflectionTypeLoadException](./reflectiontypeloadexception/) dilemparkan oleh metode Module.GetTypes jika ada kelas dalam modul yang gagal dimuat. Jangan pernah membungkus instance kelas [ReflectionTypeLoadException](./reflectiontypeloadexception/) ke dalam [System::SmartPtr](../system/smartptr/). |
| [TargetInvocationException](./targetinvocationexception/) | [TargetInvocationException](./targetinvocationexception/) dilemparkan oleh metode yang dipanggil melalui refleksi. Jangan pernah membungkus instance kelas [TargetInvocationException](./targetinvocationexception/) ke dalam [System::SmartPtr](../system/smartptr/). |
