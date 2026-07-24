---
title: "System::Xml::Xsl::XsltArgumentList kelas"
linktitle: "XsltArgumentList"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::Xsl::XsltArgumentList kelas. Berisi sejumlah argumen variabel yang berupa parameter XSLT atau objek ekstensi dalam C++."
type: docs
weight: 400
url: /id/cpp/system.xml.xsl/xsltargumentlist/
---
## XsltArgumentList class


Berisi sejumlah argumen variabel yang berupa parameter XSLT atau objek ekstensi.

```cpp
class XsltArgumentList : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [AddExtensionObject](./addextensionobject/)(const String\&, const SharedPtr\<Object\>\&) | Menambahkan objek baru ke [XsltArgumentList](./) dan mengaitkannya dengan URI namespace. |
| [AddParam](./addparam/)(const String\&, const String\&, const SharedPtr\<Object\>\&) | Menambahkan parameter ke [XsltArgumentList](./) dan mengaitkannya dengan nama yang memenuhi syarat namespace. |
| [Clear](./clear/)() | Menghapus semua parameter dan objek ekstensi dari [XsltArgumentList](./). |
| [GetExtensionObject](./getextensionobject/)(const String\&) | Mengembalikan objek yang terkait dengan namespace yang diberikan. |
| [GetParam](./getparam/)(const String\&, const String\&) | Mengembalikan parameter yang terkait dengan nama yang memenuhi syarat namespace. |
| [RemoveExtensionObject](./removeextensionobject/)(const String\&) | Menghapus objek dengan URI namespace dari [XsltArgumentList](./). |
| [RemoveParam](./removeparam/)(const String\&, const String\&) | Menghapus parameter dari [XsltArgumentList](./). |
| [XsltArgumentList](./xsltargumentlist/)() | Membuat instance baru dari [XsltArgumentList](./). |
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
