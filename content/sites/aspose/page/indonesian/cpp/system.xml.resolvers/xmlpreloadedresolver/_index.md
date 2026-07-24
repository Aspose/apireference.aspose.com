---
title: "kelas System::Xml::Resolvers::XmlPreloadedResolver"
linktitle: "XmlPreloadedResolver"
second_title: "Aspose.Page untuk C++"
description: "kelas System::Xml::Resolvers::XmlPreloadedResolver. Mewakili kelas yang digunakan untuk mengisi cache dengan DTD atau aliran XML dalam C++."
type: docs
weight: 100
url: /id/cpp/system.xml.resolvers/xmlpreloadedresolver/
---
## XmlPreloadedResolver class


Mewakili kelas yang digunakan untuk mengisi cache sebelumnya dengan DTD atau aliran XML.

```cpp
class XmlPreloadedResolver : public System::Xml::XmlResolver
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Add](./add/)(const SharedPtr\<Uri\>\&, const ArrayPtr\<uint8_t\>\&) | Menambahkan array byte ke penyimpanan [XmlPreloadedResolver](./) dan memetakannya ke sebuah URI. Jika penyimpanan sudah berisi pemetaan untuk URI yang sama, pemetaan yang ada akan ditimpa. |
| [Add](./add/)(const SharedPtr\<Uri\>\&, const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Menambahkan array byte ke penyimpanan [XmlPreloadedResolver](./) dan memetakannya ke sebuah URI. Jika penyimpanan sudah berisi pemetaan untuk URI yang sama, pemetaan yang ada akan ditimpa. |
| [Add](./add/)(const SharedPtr\<Uri\>\&, const SharedPtr\<IO::Stream\>\&) | Menambahkan Stream ke penyimpanan [XmlPreloadedResolver](./) dan memetakannya ke sebuah URI. Jika penyimpanan sudah berisi pemetaan untuk URI yang sama, pemetaan yang ada akan ditimpa. |
| [Add](./add/)(const SharedPtr\<Uri\>\&, const String\&) | Menambahkan string dengan data yang dimuat sebelumnya ke penyimpanan [XmlPreloadedResolver](./) dan memetakannya ke sebuah URI. Jika penyimpanan sudah berisi pemetaan untuk URI yang sama, pemetaan yang ada akan ditimpa. |
| [get_PreloadedUris](./get_preloadeduris/)() | Mengembalikan koleksi URI yang dimuat sebelumnya. |
| [GetEntity](./getentity/)(SharedPtr\<Uri\>, String, const TypeInfo\&) override | Memetakan URI ke objek yang berisi sumber daya sebenarnya. |
| [Remove](./remove/)(const SharedPtr\<Uri\>\&) | Menghapus data yang sesuai dengan URI dari [XmlPreloadedResolver](./). |
| [ResolveUri](./resolveuri/)(SharedPtr\<Uri\>, String) override | Menyelesaikan URI absolut dari URI dasar dan relatif. |
| [set_Credentials](./set_credentials/)(SharedPtr\<Net::ICredentials\>) override | Mengatur kredensial yang digunakan untuk mengautentikasi [Net::WebRequest](../../system.net/webrequest/) yang mendasarinya. |
| [SupportsType](./supportstype/)(SharedPtr\<Uri\>, const TypeInfo\&) override | Menentukan apakah resolver mendukung Tipe lain selain Stream saja. |
| [XmlPreloadedResolver](./xmlpreloadedresolver/)() | Menginisialisasi instance baru dari kelas [XmlPreloadedResolver](./). |
| [XmlPreloadedResolver](./xmlpreloadedresolver/)(XmlKnownDtds) | Menginisialisasi instance baru dari kelas [XmlPreloadedResolver](./) dengan DTD terkenal yang telah dimuat sebelumnya yang ditentukan. |
| [XmlPreloadedResolver](./xmlpreloadedresolver/)(const SharedPtr\<XmlResolver\>\&) | Menginisialisasi instance baru dari kelas [XmlPreloadedResolver](./) dengan resolver cadangan yang ditentukan. |
| [XmlPreloadedResolver](./xmlpreloadedresolver/)(const SharedPtr\<XmlResolver\>\&, XmlKnownDtds) | Menginisialisasi instance baru dari kelas [XmlPreloadedResolver](./) dengan resolver cadangan yang ditentukan dan DTD terkenal yang telah dimuat sebelumnya. |
| [XmlPreloadedResolver](./xmlpreloadedresolver/)(const SharedPtr\<XmlResolver\>\&, XmlKnownDtds, const SharedPtr\<Collections::Generic::IEqualityComparer\<SharedPtr\<Uri\>\>\>\&) | Menginisialisasi instance baru dari kelas [XmlPreloadedResolver](./) dengan resolver cadangan yang ditentukan, DTD terkenal yang telah dimuat sebelumnya, dan pembanding kesetaraan URI. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke instance kelas ini. |
## Catatan



Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

## Lihat Juga

* Class [XmlResolver](../../system.xml/xmlresolver/)
* Namespace [System::Xml::Resolvers](../)
* Library [Aspose.Page for C++](../../)
