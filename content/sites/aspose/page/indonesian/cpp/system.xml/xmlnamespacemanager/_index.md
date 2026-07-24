---
title: "kelas System::Xml::XmlNamespaceManager"
linktitle: "XmlNamespaceManager"
second_title: "Aspose.Page untuk C++"
description: "kelas System::Xml::XmlNamespaceManager. Menyelesaikan, menambahkan, dan menghapus namespace ke dalam koleksi serta menyediakan manajemen ruang lingkup untuk namespace ini dalam C++."
type: docs
weight: 2300
url: /id/cpp/system.xml/xmlnamespacemanager/
---
## XmlNamespaceManager class


Menyelesaikan, menambah, dan menghapus ruang nama pada sebuah koleksi serta menyediakan manajemen ruang lingkup untuk ruang nama tersebut.

```cpp
class XmlNamespaceManager : public System::Xml::IXmlNamespaceResolver,
                            public System::Collections::Generic::IEnumerable<String>
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [AddNamespace](./addnamespace/)(String, String) | Menambahkan namespace yang diberikan ke dalam koleksi. |
| virtual [get_DefaultNamespace](./get_defaultnamespace/)() | Mengembalikan URI namespace untuk namespace default. |
| virtual [get_NameTable](./get_nametable/)() | Mengembalikan [XmlNameTable](../xmlnametable/) yang terkait dengan objek ini. |
| [GetEnumerator](./getenumerator/)() override | Mengembalikan enumerator untuk digunakan dalam mengiterasi namespace di dalam [XmlNamespaceManager](./). |
| [GetNamespacesInScope](./getnamespacesinscope/)(XmlNamespaceScope) override | Mengembalikan koleksi nama namespace yang diindeks oleh prefiks yang dapat digunakan untuk mengenumerasi namespace yang saat ini berada dalam ruang lingkup. |
| virtual [HasNamespace](./hasnamespace/)(String) | Mengembalikan nilai yang menunjukkan apakah prefiks yang diberikan memiliki namespace yang didefinisikan untuk ruang lingkup yang saat ini didorong. |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | Mengembalikan URI namespace untuk prefiks yang ditentukan. |
| [LookupPrefix](./lookupprefix/)(const String\&) override | Menemukan prefiks yang dideklarasikan untuk URI namespace yang diberikan. |
| virtual [PopScope](./popscope/)() | Mengeluarkan ruang lingkup namespace dari tumpukan. |
| virtual [PushScope](./pushscope/)() | Mendorong ruang lingkup namespace ke tumpukan. |
| virtual [RemoveNamespace](./removenamespace/)(String, String) | Menghapus namespace yang diberikan untuk prefiks yang diberikan. |
| [XmlNamespaceManager](./xmlnamespacemanager/)(const SharedPtr\<XmlNameTable\>\&) | Menginisialisasi instance baru dari kelas [XmlNamespaceManager](./) dengan [XmlNameTable](../xmlnametable/) yang ditentukan. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke instance kelas ini. |
## Catatan



Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

## Lihat Juga

* Class [IXmlNamespaceResolver](../ixmlnamespaceresolver/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
