---
title: "System::TypeInfo kelas"
linktitle: "TypeInfo"
second_title: "Aspose.Page untuk C++"
description: "System::TypeInfo kelas. Mewakili tipe tertentu dan menyediakan informasi tentangnya dalam C++."
type: docs
weight: 6600
url: /id/cpp/system/typeinfo/
---
## TypeInfo class


Mewakili tipe tertentu dan menyediakan informasi tentangnya.

```cpp
class TypeInfo
```

## Nested classes

## Metode

| Metode | Deskripsi |
| --- | --- |
| [AddAttribute](./addattribute/)(const ObjectPtr\&) | Menambahkan atribut yang ditentukan ke daftar atribut tipe. |
| [AddDefaultConstructor](./adddefaultconstructor/)() | Menetapkan konstruktor default untuk tipe T. |
| [AddDefaultConstructor](./adddefaultconstructor/)(DefaultConstructor) | Menetapkan konstruktor default melalui funktor yang membuat instansi kelas. |
| [AddMember](./addmember/)(const SharedPtr\<System::Reflection::MemberInfo\>\&) | Menambahkan anggota yang ditentukan ke daftar anggota tipe. |
| static [BoxedValueType](./boxedvaluetype/)() | Menyediakan struktur [TypeInfo](./) unik untuk tipe [BoxedValue](./boxedvalue/) yang dapat dibagikan oleh beberapa kelas Boxed*. |
| [Equals](./equals/)(const TypeInfo\&) const |  |
| [get_Assembly](./get_assembly/)() const | TIDAK DIIMPLEMENTASIKAN. Mengembalikan pointer ke assembly di mana tipe yang diwakili oleh objek saat ini dideklarasikan. |
| [get_AssemblyQualifiedName](./get_assemblyqualifiedname/)() const | TIDAK DIIMPLEMENTASIKAN. Mengembalikan nama lengkap termasuk nama assembly dari tipe yang diwakili oleh objek saat ini. |
| [get_BaseType](./get_basetype/)() const | Mengembalikan deskriptor tipe dasar. |
| [get_ContainsGenericParameters](./get_containsgenericparameters/)() const | Mendapatkan nilai yang menunjukkan apakah objek Type saat ini memiliki parameter tipe yang belum diganti dengan tipe spesifik. |
| [get_DeclaredMember](./get_declaredmember/)(const String\&) const | Mendapatkan daftar anggota dengan nama yang ditentukan. |
| [get_FullName](./get_fullname/)() const | Mengembalikan nama lengkap (tetapi tanpa nama assembly) dari tipe yang diwakili oleh objek saat ini. |
| [get_GenericTypeArguments](./get_generictypearguments/)() const | Mendapatkan array argumen tipe generik untuk tipe ini. |
| [get_IsAbstract](./get_isabstract/)() const | Mendapatkan nilai yang menunjukkan apakah Type bersifat abstrak dan harus ditimpa. |
| [get_IsArray](./get_isarray/)() const | Mendapatkan nilai yang menunjukkan apakah tipe tersebut adalah array. |
| [get_IsClass](./get_isclass/)() const | Mendapatkan nilai yang menunjukkan apakah Type adalah kelas atau delegate; yaitu, bukan tipe nilai atau antarmuka. |
| [get_IsEnum](./get_isenum/)() const | Mendapatkan nilai yang menunjukkan apakah Type saat ini mewakili sebuah enumerasi. |
| [get_IsGenericType](./get_isgenerictype/)() const |  |
| [get_IsGenericTypeDefinition](./get_isgenerictypedefinition/)() const | Mendapatkan nilai yang menunjukkan apakah Type saat ini mewakili definisi tipe generik, dari mana tipe generik lain dapat dibangun. |
| [get_IsInterface](./get_isinterface/)() const | Mendapatkan nilai yang menunjukkan apakah Type adalah antarmuka; yaitu, bukan kelas atau tipe nilai. |
| [get_IsSealed](./get_issealed/)() const | Mendapatkan nilai yang menunjukkan apakah Type dideklarasikan sealed. |
| [get_IsValueType](./get_isvaluetype/)() const | Mendapatkan nilai yang menunjukkan apakah Type adalah tipe nilai. |
| [get_IsVisible](./get_isvisible/)() const | Mendapatkan nilai yang menunjukkan apakah Type dapat diakses oleh kode di luar assembly. |
| [get_Name](./get_name/)() const | Mengembalikan nama tipe yang diwakili oleh objek saat ini. |
| [get_Namespace](./get_namespace/)() const | Mendapatkan namespace dari Type. |
| [GetConstructor](./getconstructor/)(const ArrayPtr\<TypeInfo\>\&) const | Mencari konstruktor instance publik yang parameternya cocok dengan tipe dalam array yang ditentukan. |
| [GetConstructors](./getconstructors/)(System::Reflection::BindingFlags) const | mencari konstruktor yang didefinisikan untuk Type saat ini, menggunakan BindingFlags yang ditentukan. |
| [GetConstructors](./getconstructors/)() const | Mengembalikan semua konstruktor publik yang didefinisikan untuk Type saat ini. |
| [GetCustomAttribute](./getcustomattribute/)(const TypeInfo\&) const | Mencari atribut khusus yang diterapkan dengan tipe yang ditentukan dan diterapkan pada tipe yang diwakili oleh objek saat ini. |
| [GetCustomAttributes](./getcustomattributes/)() const | Mengembalikan array yang berisi objek yang mewakili semua atribut khusus yang diterapkan pada tipe. |
| [GetCustomAttributes](./getcustomattributes/)(const TypeInfo\&, bool) const | Mengembalikan array yang berisi objek yang mewakili atribut spesifik yang diterapkan pada tipe. |
| [GetElementType](./getelementtype/)() const | BELUM DIIMPLEMENTASIKAN. |
| [GetField](./getfield/)(const System::String\&, System::Reflection::BindingFlags) const | Mencari field yang ditentukan, menggunakan batasan binding yang ditentukan. |
| [GetFields](./getfields/)(System::Reflection::BindingFlags) const | Mencari field yang didefinisikan untuk Type saat ini, menggunakan batasan binding yang ditentukan. |
| [GetGenericArguments](./getgenericarguments/)() const | Mendapatkan array argumen tipe generik untuk tipe ini. |
| [GetHashCode](./gethashcode/)() const | Mengembalikan kode hash yang terkait dengan instance ini. |
| [GetInterfaces](./getinterfaces/)() const | Mendapatkan semua antarmuka yang diimplementasikan atau diwarisi oleh Type saat ini. |
| [GetMember](./getmember/)(const String\&) const | Mendapatkan daftar anggota dengan nama yang ditentukan. |
| [GetMethod](./getmethod/)(const String\&) const | Mendapatkan metode dengan nama yang ditentukan. |
| [GetProperties](./getproperties/)() const | Mengembalikan semua properti publik dari Type saat ini. |
| [GetProperties](./getproperties/)(System::Reflection::BindingFlags) const | Mencari properti dari Type saat ini, menggunakan batasan binding yang ditentukan. |
| [GetTemplParamType](./gettemplparamtype/)() const | Mendapatkan deskriptor tipe parameter templat. |
| [Hash](./hash/)() const | Mengembalikan nilai hash yang terkait dengan tipe yang diwakili oleh objek saat ini. |
| [IsAssignableFrom](./isassignablefrom/)(const TypeInfo\&) const | Menentukan apakah sebuah instance dari tipe yang ditentukan dapat ditetapkan ke variabel dengan tipe saat ini. |
| [IsDefined](./isdefined/)(const TypeInfo\&, bool) const | TIDAK DIIMPLEMENTASIKAN. Menunjukkan apakah satu atau lebih atribut dari tipe yang ditentukan atau tipe turunannya diterapkan pada anggota ini. |
| [IsInstanceOfType](./isinstanceoftype/)(const SharedPtr\<Object\>\&) const | Menentukan apakah objek yang ditentukan merupakan instance dari tipe saat ini. |
| [IsSubclassOf](./issubclassof/)(const TypeInfo\&) const | Menentukan apakah tipe yang diwakili oleh objek saat ini merupakan subclass dari kelas yang ditentukan. |
| [operator!=](./operator!=/)(const TypeInfo\&) const | Menentukan apakah objek [TypeInfo](./) saat ini dan yang ditentukan tidak sama. |
| [operator!=](./operator!=/)(std::nullptr_t) const | Menentukan apakah objek [TypeInfo](./) saat ini bukan objek null, yaitu ia mewakili suatu tipe. |
| [operator==](./operator==/)(const TypeInfo\&) const | Menentukan apakah objek [TypeInfo](./) saat ini dan yang ditentukan sama. |
| [operator==](./operator==/)(std::nullptr_t) const | Menentukan apakah objek [TypeInfo](./) saat ini adalah objek null, yaitu tidak mewakili tipe apa pun. |
| [reset](./reset/)() | Mengatur [TypeInfo](./) menjadi null. |
| [set_IsValueType](./set_isvaluetype/)(bool) | Mengatur nilai yang menunjukkan apakah Type adalah tipe nilai. |
| [SetBaseType](./setbasetype/)(GetTypeInfoFunPtr) | Mengatur deskriptor tipe dasar. |
| [SetTemplParamType](./settemplparamtype/)(const TypeInfo\&) | Mengatur deskriptor tipe parameter templat. |
| static [StringHash](./stringhash/)(const char_t *) | Menghitung hash untuk string yang ditentukan. |
| [ToString](./tostring/)() const | Mengembalikan string yang berisi nama tipe yang diwakili oleh objek saat ini. |
| static [Type](./type/)() | Mengembalikan objek [TypeInfo](./) yang mewakili kelas [TypeInfo](./). |
| [TypeInfo](./typeinfo/)() | Konstruktor default (tidak ada tipe yang diatur). |
| [TypeInfo](./typeinfo/)(std::nullptr_t) | Konstruktor objek null (tidak ada tipe yang diatur). |
| [TypeInfo](./typeinfo/)(const char_t *) | Konstruktor. |
| [TypeInfo](./typeinfo/)(const char_t *, uint32_t) | Konstruktor. |
| [TypeInfo](./typeinfo/)(const std::type_info\&) | Konstruktor. |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static [EmptyType](./emptytype/) | Konstanta yang mewakili daftar kosong dari [TypeInfo](./). |
| static [EmptyTypes](./emptytypes/) | Konstanta yang mewakili daftar kosong dari [TypeInfo](./). |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [DefaultConstructor](./defaultconstructor/) | Pointer fungsi untuk membangun tipe. |
## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
