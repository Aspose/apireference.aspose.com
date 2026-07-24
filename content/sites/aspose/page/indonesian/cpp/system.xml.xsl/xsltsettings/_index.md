---
title: "System::Xml::Xsl::XsltSettings class"
linktitle: "XsltSettings"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Xml::Xsl::XsltSettings. Menentukan fitur XSLT yang didukung selama eksekusi lembar gaya XSLT dalam C++."
type: docs
weight: 800
url: /id/cpp/system.xml.xsl/xsltsettings/
---
## XsltSettings class


Menentukan fitur XSLT yang didukung selama eksekusi lembar gaya XSLT.

```cpp
class XsltSettings : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| static [get_Default](./get_default/)() | Mengembalikan objek [XsltSettings](./) dengan pengaturan default. Dukungan untuk fungsi XSLT **document()** dan blok skrip tersemat dinonaktifkan. |
| [get_EnableDocumentFunction](./get_enabledocumentfunction/)() | Mengembalikan nilai yang menunjukkan apakah dukungan untuk fungsi XSLT **document()** diaktifkan. |
| [get_EnableScript](./get_enablescript/)() | Mengembalikan nilai yang menunjukkan apakah dukungan untuk blok skrip tersemat diaktifkan. |
| static [get_TrustedXslt](./get_trustedxslt/)() | Mengembalikan objek [XsltSettings](./) yang mengaktifkan dukungan untuk fungsi XSLT **document()** dan blok skrip tersemat. |
| [set_EnableDocumentFunction](./set_enabledocumentfunction/)(bool) | Mengatur nilai yang menunjukkan apakah dukungan untuk fungsi XSLT **document()** diaktifkan. |
| [set_EnableScript](./set_enablescript/)(bool) | Mengatur nilai yang menunjukkan apakah dukungan untuk blok skrip tersemat diaktifkan. |
| [XsltSettings](./xsltsettings/)() | Menginisialisasi instance baru dari kelas [XsltSettings](./) dengan pengaturan default. |
| [XsltSettings](./xsltsettings/)(bool, bool) | Menginisialisasi instance baru dari kelas [XsltSettings](./) dengan pengaturan yang ditentukan. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke instance kelas ini. |
## Catatan



Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Page for C++](../../)
