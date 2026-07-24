---
title: "System::Xml::XmlTextWriter::XmlTextWriter konstruktor"
linktitle: "XmlTextWriter"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlTextWriter::XmlTextWriter konstruktor. Membuat sebuah instance dari kelas XmlTextWriter menggunakan stream dan encoding yang ditentukan dalam C++."
type: docs
weight: 100
url: /id/cpp/system.xml/xmltextwriter/xmltextwriter/
---
## XmlTextWriter::XmlTextWriter(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<Text::Encoding\>\&) constructor


Membuat sebuah instance dari kelas [XmlTextWriter](../) menggunakan stream dan encoding yang ditentukan.

```cpp
System::Xml::XmlTextWriter::XmlTextWriter(const SharedPtr<IO::Stream> &w, const SharedPtr<Text::Encoding> &encoding)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| w | const SharedPtr\<IO::Stream\>\& | Stream yang ingin Anda tulis. |
| encoding | const SharedPtr\<Text::Encoding\>\& | Encoding yang akan dihasilkan. Jika encoding adalah **nullptr**, maka akan menulis stream sebagai UTF-8 dan menghilangkan atribut encoding dari **ProcessingInstruction**. |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [Encoding](../../../system.text/encoding/)
* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextWriter::XmlTextWriter(const SharedPtr\<IO::TextWriter\>\&) constructor


Membuat sebuah instance dari kelas [XmlTextWriter](../) menggunakan TextWriter yang ditentukan.

```cpp
System::Xml::XmlTextWriter::XmlTextWriter(const SharedPtr<IO::TextWriter> &w)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| w | const SharedPtr\<IO::TextWriter\>\& | TextWriter yang akan ditulis. Diasumsikan bahwa TextWriter sudah diatur ke encoding yang benar. |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextWriter::XmlTextWriter(const String\&, const SharedPtr\<Text::Encoding\>\&) constructor


Membuat sebuah instance dari kelas [XmlTextWriter](../) menggunakan file yang ditentukan.

```cpp
System::Xml::XmlTextWriter::XmlTextWriter(const String &filename, const SharedPtr<Text::Encoding> &encoding)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| filename | const String\& | Nama file yang akan ditulis. Jika file sudah ada, maka akan dipotong dan ditimpa dengan konten baru. |
| encoding | const SharedPtr\<Text::Encoding\>\& | Encoding yang akan dihasilkan. Jika encoding adalah **nullptr**, maka file akan ditulis sebagai UTF-8 dan menghilangkan atribut encoding dari **ProcessingInstruction**. |

## Lihat Juga

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Encoding](../../../system.text/encoding/)
* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
