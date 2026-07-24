---
title: "System::Xml::XmlWriter::Create method"
linktitle: "Buat"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlWriter::Create method. Membuat instance XmlWriter baru menggunakan stream yang ditentukan dalam C++."
type: docs
weight: 3700
url: /id/cpp/system.xml/xmlwriter/create/
---
## XmlWriter::Create(const SharedPtr\<IO::Stream\>\&) method


Membuat sebuah instance [XmlWriter](../) baru menggunakan stream yang ditentukan.

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<IO::Stream> &output)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| output | const SharedPtr\<IO::Stream\>\& | Stream yang ingin Anda tulis. [XmlWriter](../) menulis sintaks teks XML 1.0 dan menambahkannya ke stream yang ditentukan. |

### ReturnValue

Objek [XmlWriter](../).

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::Create(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlWriterSettings\>) method


Membuat sebuah instance [XmlWriter](../) baru menggunakan stream dan objek [XmlWriterSettings](../../xmlwritersettings/).

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<IO::Stream> &output, SharedPtr<XmlWriterSettings> settings)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| output | const SharedPtr\<IO::Stream\>\& | Stream yang ingin Anda tulis. [XmlWriter](../) menulis sintaks teks XML 1.0 dan menambahkannya ke stream yang ditentukan. |
| settings | SharedPtr\<XmlWriterSettings\> | Objek [XmlWriterSettings](../../xmlwritersettings/) yang digunakan untuk mengonfigurasi instance [XmlWriter](../) baru. Jika ini **nullptr**, sebuah [XmlWriterSettings](../../xmlwritersettings/) dengan pengaturan default akan digunakan. Jika [XmlWriter](../) digunakan dengan metode XslCompiledTransform:Transform(String,SharedPtr<XmlWriter>), Anda harus menggunakan nilai XslCompiledTransform::get_OutputSettings untuk memperoleh objek [XmlWriterSettings](../../xmlwritersettings/) dengan pengaturan yang tepat. Ini memastikan bahwa objek [XmlWriter](../) yang dibuat memiliki pengaturan output yang benar. |

### ReturnValue

Objek [XmlWriter](../).

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlWriterSettings](../../xmlwritersettings/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::Create(const SharedPtr\<IO::TextWriter\>\&) method


Membuat sebuah instance [XmlWriter](../) baru menggunakan TextWriter yang ditentukan.

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<IO::TextWriter> &output)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| output | const SharedPtr\<IO::TextWriter\>\& | TextWriter yang ingin Anda tulis. [XmlWriter](../) menulis sintaks teks XML 1.0 dan menambahkannya ke TextWriter yang ditentukan. |

### ReturnValue

Objek [XmlWriter](../).

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::Create(const SharedPtr\<IO::TextWriter\>\&, SharedPtr\<XmlWriterSettings\>) method


Membuat sebuah instance [XmlWriter](../) baru menggunakan TextWriter dan objek [XmlWriterSettings](../../xmlwritersettings/).

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<IO::TextWriter> &output, SharedPtr<XmlWriterSettings> settings)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| output | const SharedPtr\<IO::TextWriter\>\& | TextWriter yang ingin Anda tulis. [XmlWriter](../) menulis sintaks teks XML 1.0 dan menambahkannya ke TextWriter yang ditentukan. |
| settings | SharedPtr\<XmlWriterSettings\> | Objek [XmlWriterSettings](../../xmlwritersettings/) yang digunakan untuk mengonfigurasi instance [XmlWriter](../) baru. Jika ini **nullptr**, sebuah [XmlWriterSettings](../../xmlwritersettings/) dengan pengaturan default akan digunakan. Jika [XmlWriter](../) digunakan dengan metode XslCompiledTransform:Transform(String,SharedPtr<XmlWriter>), Anda harus menggunakan nilai XslCompiledTransform::get_OutputSettings untuk memperoleh objek [XmlWriterSettings](../../xmlwritersettings/) dengan pengaturan yang tepat. Ini memastikan bahwa objek [XmlWriter](../) yang dibuat memiliki pengaturan output yang benar. |

### ReturnValue

Objek [XmlWriter](../).

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XmlWriterSettings](../../xmlwritersettings/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::Create(const SharedPtr\<Text::StringBuilder\>\&) method


Membuat sebuah instance [XmlWriter](../) baru menggunakan [Text::StringBuilder](../../../system.text/stringbuilder/) yang ditentukan.

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<Text::StringBuilder> &output)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| output | const SharedPtr\<Text::StringBuilder\>\& | [Text::StringBuilder](../../../system.text/stringbuilder/) yang akan ditulisi. Konten yang ditulis oleh [XmlWriter](../) ditambahkan ke [Text::StringBuilder](../../../system.text/stringbuilder/). |

### ReturnValue

Objek [XmlWriter](../).

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [StringBuilder](../../../system.text/stringbuilder/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::Create(const SharedPtr\<Text::StringBuilder\>\&, SharedPtr\<XmlWriterSettings\>) method


Membuat sebuah instance [XmlWriter](../) baru menggunakan [Text::StringBuilder](../../../system.text/stringbuilder/) dan objek [XmlWriterSettings](../../xmlwritersettings/).

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<Text::StringBuilder> &output, SharedPtr<XmlWriterSettings> settings)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| output | const SharedPtr\<Text::StringBuilder\>\& | [Text::StringBuilder](../../../system.text/stringbuilder/) yang akan ditulisi. Konten yang ditulis oleh [XmlWriter](../) ditambahkan ke [Text::StringBuilder](../../../system.text/stringbuilder/). |
| settings | SharedPtr\<XmlWriterSettings\> | Objek [XmlWriterSettings](../../xmlwritersettings/) yang digunakan untuk mengonfigurasi instance [XmlWriter](../) baru. Jika ini **nullptr**, sebuah [XmlWriterSettings](../../xmlwritersettings/) dengan pengaturan default akan digunakan. Jika [XmlWriter](../) digunakan dengan metode XslCompiledTransform:Transform(String,SharedPtr<XmlWriter>), Anda harus menggunakan nilai XslCompiledTransform::get_OutputSettings untuk memperoleh objek [XmlWriterSettings](../../xmlwritersettings/) dengan pengaturan yang tepat. Ini memastikan bahwa objek [XmlWriter](../) yang dibuat memiliki pengaturan output yang benar. |

### ReturnValue

Objek [XmlWriter](../).

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [StringBuilder](../../../system.text/stringbuilder/)
* Class [XmlWriterSettings](../../xmlwritersettings/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::Create(const SharedPtr\<XmlWriter\>\&) method


Membuat sebuah instance [XmlWriter](../) baru menggunakan objek [XmlWriter](../) yang ditentukan.

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<XmlWriter> &output)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| output | const SharedPtr\<XmlWriter\>\& | Objek [XmlWriter](../) yang ingin Anda gunakan sebagai penulis dasar. |

### ReturnValue

Sebuah objek [XmlWriter](../) yang dibungkus di sekitar objek [XmlWriter](../) yang ditentukan.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::Create(const SharedPtr\<XmlWriter\>\&, SharedPtr\<XmlWriterSettings\>) method


Membuat sebuah instance [XmlWriter](../) baru menggunakan objek [XmlWriter](../) dan [XmlWriterSettings](../../xmlwritersettings/) yang ditentukan.

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<XmlWriter> &output, SharedPtr<XmlWriterSettings> settings)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| output | const SharedPtr\<XmlWriter\>\& | Objek [XmlWriter](../) yang ingin Anda gunakan sebagai penulis dasar. |
| settings | SharedPtr\<XmlWriterSettings\> | Objek [XmlWriterSettings](../../xmlwritersettings/) yang digunakan untuk mengonfigurasi instance [XmlWriter](../) baru. Jika ini **nullptr**, sebuah [XmlWriterSettings](../../xmlwritersettings/) dengan pengaturan default akan digunakan. Jika [XmlWriter](../) digunakan dengan metode XslCompiledTransform:Transform(String,SharedPtr<XmlWriter>), Anda harus menggunakan nilai XslCompiledTransform::get_OutputSettings untuk memperoleh objek [XmlWriterSettings](../../xmlwritersettings/) dengan pengaturan yang tepat. Ini memastikan bahwa objek [XmlWriter](../) yang dibuat memiliki pengaturan output yang benar. |

### ReturnValue

Sebuah objek [XmlWriter](../) yang dibungkus di sekitar objek [XmlWriter](../) yang ditentukan.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [XmlWriterSettings](../../xmlwritersettings/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::Create(const String\&) method


Membuat sebuah instance [XmlWriter](../) baru menggunakan nama file yang ditentukan.

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const String &outputFileName)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| outputFileName | const String\& | File yang ingin Anda tulis. [XmlWriter](../) membuat file pada jalur yang ditentukan dan menulisnya dalam sintaks teks XML 1.0. **outputFileName** harus berupa jalur sistem file. |

### ReturnValue

Objek [XmlWriter](../).

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [String](../../../system/string/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::Create(const String\&, SharedPtr\<XmlWriterSettings\>) method


Membuat sebuah instance [XmlWriter](../) baru menggunakan nama file dan objek [XmlWriterSettings](../../xmlwritersettings/).

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const String &outputFileName, SharedPtr<XmlWriterSettings> settings)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| outputFileName | const String\& | File yang ingin Anda tulis. [XmlWriter](../) membuat file pada jalur yang ditentukan dan menulisnya dalam sintaks teks XML 1.0. **outputFileName** harus berupa jalur sistem file. |
| settings | SharedPtr\<XmlWriterSettings\> | Objek [XmlWriterSettings](../../xmlwritersettings/) yang digunakan untuk mengonfigurasi instance [XmlWriter](../) baru. Jika ini **nullptr**, sebuah [XmlWriterSettings](../../xmlwritersettings/) dengan pengaturan default akan digunakan. Jika [XmlWriter](../) digunakan dengan metode XslCompiledTransform:Transform(String,SharedPtr<XmlWriter>), Anda harus menggunakan nilai XslCompiledTransform::get_OutputSettings untuk memperoleh objek [XmlWriterSettings](../../xmlwritersettings/) dengan pengaturan yang tepat. Ini memastikan bahwa objek [XmlWriter](../) yang dibuat memiliki pengaturan output yang benar. |

### ReturnValue

Objek [XmlWriter](../).

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [String](../../../system/string/)
* Class [XmlWriterSettings](../../xmlwritersettings/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
