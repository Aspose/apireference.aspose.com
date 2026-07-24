---
title: "Kelas System::Net::WebClient"
linktitle: "WebClient"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Net::WebClient. WebClient menyediakan metode umum untuk mengirim dan menerima data. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 3500
url: /id/cpp/system.net/webclient/
---
## WebClient class


[WebClient](./) provides common methods for sending and receiving data. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class WebClient : public System::ComponentModel::Component
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [DownloadData](./downloaddata/)(const String\&) const | Mengunduh sumber daya yang ditentukan sebagai array byte. |
| [DownloadData](./downloaddata/)(const SharedPtr\<Uri\>\&) const | Mengunduh sumber daya yang ditentukan sebagai array byte. |
| [DownloadString](./downloadstring/)(const String\&) const | Mengunduh sumber daya yang ditentukan sebagai string. |
| [DownloadString](./downloadstring/)(const SharedPtr\<Uri\>\&) const | Mengunduh sumber daya yang ditentukan sebagai string. |
| [get_Encoding](./get_encoding/)() const | Mendapatkan encoding yang digunakan untuk mengunduh atau mengunggah string. |
| [set_Encoding](./set_encoding/)(const SharedPtr\<Text::Encoding\>\&) | Mengatur encoding yang digunakan untuk mengunduh atau mengunggah string. |
| [set_UseDefaultCredentials](./set_usedefaultcredentials/)(bool) | BELUM DIIMPLEMENTASIKAN. |
| [WebClient](./webclient/)() | Informasi RTTI. |
| [~WebClient](./~webclient/)() | Menghancurkan instance saat ini. |
## Lihat Juga

* Class [Component](../../system.componentmodel/component/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
