---
title: "System::IO::StreamWriter::StreamWriter konstruktor"
linktitle: "StreamWriter"
second_title: "Aspose.Page untuk C++"
description: "System::IO::StreamWriter::StreamWriter konstruktor. Membuat sebuah instance objek StreamWriter yang menulis karakter ke aliran dasar yang ditentukan menggunakan enkoding UTF-8 dan buffer dengan ukuran default 1024 byte dalam C++."
type: docs
weight: 100
url: /id/cpp/system.io/streamwriter/streamwriter/
---
## StreamWriter::StreamWriter(const SharedPtr\<Stream\>\&) constructor


Membuat sebuah instance dari objek [StreamWriter](../) yang menulis karakter ke aliran dasar yang ditentukan menggunakan enkoding UTF-8 dan buffer dengan ukuran default 1024 byte.

```cpp
System::IO::StreamWriter::StreamWriter(const SharedPtr<Stream> &stream)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| stream | const SharedPtr\<Stream\>\& | Aliran dasar untuk menulis karakter ke |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::StreamWriter(const SharedPtr\<Stream\>\&, const EncodingPtr\&) constructor


Membuat sebuah instance dari objek [StreamWriter](../) yang menulis karakter ke aliran dasar yang ditentukan menggunakan enkoding yang ditentukan dan buffer dengan ukuran default 1024 byte.

```cpp
System::IO::StreamWriter::StreamWriter(const SharedPtr<Stream> &stream, const EncodingPtr &encoding)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| stream | const SharedPtr\<Stream\>\& | Aliran dasar untuk menulis karakter ke |
| encoding | const EncodingPtr\& | Enkoding yang digunakan |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::StreamWriter(const SharedPtr\<Stream\>\&, const EncodingPtr\&, int, bool) constructor


Membuat sebuah instance dari objek [StreamWriter](../) yang menulis karakter ke aliran dasar yang ditentukan menggunakan enkoding yang ditentukan dan buffer dengan ukuran yang ditentukan. Sebuah parameter menentukan apakah aliran dasar harus ditutup ketika objek [StreamWriter](../) dibuang.

```cpp
System::IO::StreamWriter::StreamWriter(const SharedPtr<Stream> &stream, const EncodingPtr &encoding, int buffer_size, bool leave_open=false)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| stream | const SharedPtr\<Stream\>\& | Aliran dasar untuk menulis karakter ke |
| encoding | const EncodingPtr\& | Enkoding yang digunakan |
| buffer_size | int | Ukuran minimum buffer dalam byte |
| leave_open | bool | Menentukan apakah aliran dasar harus tetap terbuka setelah objek [StreamWriter](../) saat ini dibuang |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::StreamWriter(const String\&) constructor


Membuat sebuah instance dari objek [StreamWriter](../) yang menulis karakter ke file yang ditentukan menggunakan enkoding UTF-8 dan buffer dengan ukuran default 1024 byte.

```cpp
System::IO::StreamWriter::StreamWriter(const String &path)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| path | const String\& | Jalur file untuk menulis karakter ke |

## Lihat Juga

* Class [String](../../../system/string/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::StreamWriter(const String\&, bool, const EncodingPtr\&, int) constructor


Membuat sebuah instance dari objek [StreamWriter](../) yang menulis karakter ke file yang ditentukan menggunakan enkoding yang ditentukan dan ukuran buffer. Sebuah parameter menentukan apakah data harus ditambahkan ke file atau file harus ditimpa.

```cpp
System::IO::StreamWriter::StreamWriter(const String &path, bool append, const EncodingPtr &encoding, int buffer_size)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| path | const String\& | Jalur file untuk menulis karakter ke |
| append | bool | Menentukan apakah data harus ditambahkan ke file yang ditentukan (true) atau file harus ditimpa (false) |
| encoding | const EncodingPtr\& | Enkoding yang digunakan |
| buffer_size | int | Ukuran buffer yang akan digunakan |

## Lihat Juga

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::StreamWriter(const String\&, bool, const EncodingPtr\&) constructor


Membuat sebuah instance dari objek [StreamWriter](../) yang menulis karakter ke file yang ditentukan menggunakan enkoding yang ditentukan dan buffer dengan ukuran default 1024 byte. Sebuah parameter menentukan apakah data harus ditambahkan ke file atau file harus ditimpa.

```cpp
System::IO::StreamWriter::StreamWriter(const String &path, bool append, const EncodingPtr &encoding=System::Text::Encoding::get_UTF8Unmarked())
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| path | const String\& | Jalur file untuk menulis karakter ke |
| append | bool | Menentukan apakah data harus ditambahkan ke file yang ditentukan (true) atau file harus ditimpa (false) |
| encoding | const EncodingPtr\& | Enkoding yang digunakan |

## Lihat Juga

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
