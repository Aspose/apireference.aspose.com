---
title: "kelas System::Xml::XPath::XPathNodeIterator"
linktitle: "XPathNodeIterator"
second_title: "Aspose.Page untuk C++"
description: "kelas System::Xml::XPath::XPathNodeIterator. Menyediakan iterator atas sekumpulan node yang dipilih dalam C++."
type: docs
weight: 600
url: /id/cpp/system.xml.xpath/xpathnodeiterator/
---
## XPathNodeIterator class


Menyediakan iterator atas sekumpulan node yang dipilih.

```cpp
class XPathNodeIterator : public System::Collections::Generic::IEnumerable<SharedPtr<System::Xml::XPath::XPathNavigator>>
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [Clone](./clone/)() | Ketika dioverride dalam kelas turunan, mengembalikan klon dari objek [XPathNodeIterator](./) ini. |
| virtual [get_Count](./get_count/)() | Mengembalikan indeks node terakhir dalam sekumpulan node yang dipilih. |
| virtual [get_Current](./get_current/)() | Ketika dioverride dalam kelas turunan, mengambil objek [XPathNavigator](../xpathnavigator/) untuk [XPathNodeIterator](./) ini, yang diposisikan pada node konteks saat ini. |
| virtual [get_CurrentPosition](./get_currentposition/)() | Ketika dioverride dalam kelas turunan, mengambil indeks posisi saat ini dalam sekumpulan node yang dipilih. |
| [GetEnumerator](./getenumerator/)() override | Mengembalikan objek IEnumerator untuk mengiterasi sekumpulan node yang dipilih. |
| virtual [MoveNext](./movenext/)() | Ketika dioverride dalam kelas turunan, memindahkan objek [XPathNavigator](../xpathnavigator/) yang dikembalikan oleh metode [XPathNodeIterator::get_Current](./get_current/) ke node berikutnya dalam sekumpulan node yang dipilih. |
| [XPathNodeIterator](./xpathnodeiterator/)() | Menginisialisasi instansi baru dari kelas [XPathNodeIterator](./). |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke instance kelas ini. |
## Lihat Juga

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Page for C++](../../)
