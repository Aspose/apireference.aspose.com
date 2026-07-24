---
title: "Kelas System::Xml::XPath::XPathDocument"
linktitle: "XPathDocument"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Xml::XPath::XPathDocument. Menyediakan representasi memori cepat, hanya-baca, dari dokumen XML dengan menggunakan model data XPath dalam C++."
type: docs
weight: 200
url: /id/cpp/system.xml.xpath/xpathdocument/
---
## XPathDocument class


Menyediakan representasi memori cepat, hanya-baca, dari dokumen XML dengan menggunakan model data [XPath](../).

```cpp
class XPathDocument : public System::Xml::XPath::IXPathNavigable
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [CreateNavigator](./createnavigator/)() override | Menginisialisasi objek [XPathNavigator](../xpathnavigator/) hanya-baca untuk menavigasi node dalam [XPathDocument](./) ini. |
| [XPathDocument](./xpathdocument/)(const SharedPtr\<XmlReader\>\&) | Menginisialisasi instance baru dari kelas [XPathDocument](./) dari data XML yang terdapat dalam objek [XmlReader](../../system.xml/xmlreader/) yang ditentukan. |
| [XPathDocument](./xpathdocument/)(const SharedPtr\<XmlReader\>\&, XmlSpace) | Menginisialisasi instance baru dari kelas [XPathDocument](./) dari data XML yang terdapat dalam objek [XmlReader](../../system.xml/xmlreader/) yang ditentukan dengan penanganan spasi putih yang ditentukan. |
| [XPathDocument](./xpathdocument/)(const SharedPtr\<IO::TextReader\>\&) | Menginisialisasi instance baru dari kelas [XPathDocument](./) dari data XML yang terdapat dalam objek TextReader yang ditentukan. |
| [XPathDocument](./xpathdocument/)(const SharedPtr\<IO::Stream\>\&) | Menginisialisasi instance baru dari kelas [XPathDocument](./) dari data XML dalam objek Stream yang ditentukan. |
| [XPathDocument](./xpathdocument/)(const String\&) | Menginisialisasi instance baru dari kelas [XPathDocument](./) dari data XML dalam file yang ditentukan. |
| [XPathDocument](./xpathdocument/)(const String\&, XmlSpace) | Menginisialisasi instance baru dari kelas [XPathDocument](./) dari data XML dalam file yang ditentukan dengan penanganan spasi putih yang ditentukan. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke instance kelas ini. |
## Catatan



Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

## Lihat Juga

* Class [IXPathNavigable](../ixpathnavigable/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Page for C++](../../)
