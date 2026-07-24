---
title: "System::IO::StreamReader::StreamReader konstruktor"
linktitle: "StreamReader"
second_title: "Aspose.Page untuk C++"
description: "System::IO::StreamReader::StreamReader konstruktor. Membuat sebuah instance objek StreamReader yang membaca karakter dari aliran yang mendasari yang ditentukan menggunakan enkoding UTF-8 dan buffer dengan ukuran default 1024 byte dalam C++."
type: docs
weight: 100
url: /id/cpp/system.io/streamreader/streamreader/
---
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&) constructor


Membuat sebuah instance objek [StreamReader](../) yang membaca karakter dari aliran yang mendasari yang ditentukan menggunakan enkoding UTF-8 dan buffer dengan ukuran default 1024 byte.

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| stream | const SharedPtr\<Stream\>\& | Aliran yang mendasari untuk membaca karakter dari |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&, bool) constructor


Membuat sebuah instance objek [StreamReader](../) yang membaca karakter dari aliran yang mendasari yang ditentukan menggunakan enkoding UTF-8 dan buffer dengan ukuran default 1024 byte. Sebuah parameter menentukan apakah deteksi tanda urutan byte harus diaktifkan.

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream, bool detectEncodingFromByteOrderMarks)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| stream | const SharedPtr\<Stream\>\& | Aliran yang mendasari untuk membaca karakter dari |
| detectEncodingFromByteOrderMarks | bool | True untuk mencari tanda urutan byte di awal aliran, jika tidak - false |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&, const EncodingPtr\&) constructor


Membuat sebuah instance objek [StreamReader](../) yang membaca karakter dari aliran yang mendasari yang ditentukan menggunakan enkoding yang ditentukan dan buffer dengan ukuran default 1024 byte.

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream, const EncodingPtr &encoding)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| stream | const SharedPtr\<Stream\>\& | Aliran yang mendasari untuk membaca karakter dari |
| encoding | const EncodingPtr\& | Enkoding yang digunakan |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&, const EncodingPtr\&, bool) constructor


Membuat sebuah instance objek [StreamReader](../) yang membaca karakter dari aliran yang mendasari yang ditentukan menggunakan enkoding yang ditentukan dan buffer dengan ukuran default 1024 byte. Sebuah parameter menentukan apakah deteksi tanda urutan byte harus diaktifkan.

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream, const EncodingPtr &encoding, bool detectEncodingFromByteOrderMarks)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| stream | const SharedPtr\<Stream\>\& | Aliran yang mendasari untuk membaca karakter dari |
| encoding | const EncodingPtr\& | Enkoding yang digunakan |
| detectEncodingFromByteOrderMarks | bool | True untuk mencari tanda urutan byte di awal aliran, jika tidak - false |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&, const EncodingPtr\&, bool, int) constructor


Membuat sebuah instance objek [StreamReader](../) yang membaca karakter dari aliran yang mendasari yang ditentukan menggunakan enkoding yang ditentukan dan buffer dengan ukuran yang ditentukan. Sebuah parameter menentukan apakah deteksi tanda urutan byte harus diaktifkan.

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream, const EncodingPtr &encoding, bool detectEncodingFromByteOrderMarks, int bufferSize)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| stream | const SharedPtr\<Stream\>\& | Aliran yang mendasari untuk membaca karakter dari |
| encoding | const EncodingPtr\& | Enkoding yang digunakan |
| detectEncodingFromByteOrderMarks | bool | True untuk mencari tanda urutan byte di awal aliran, jika tidak - false |
| bufferSize | int | Ukuran minimum buffer dalam byte |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::StreamReader(const System::String\&) constructor


Membuat sebuah instance objek [StreamReader](../) yang membaca karakter dari file yang ditentukan menggunakan enkoding UTF-8 dan buffer dengan ukuran default 4096 byte.

```cpp
System::IO::StreamReader::StreamReader(const System::String &path)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| path | const System::String\& | Jalur file untuk membaca karakter dari |

## Lihat Juga

* Class [String](../../../system/string/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::StreamReader(const System::String\&, bool) constructor


Membuat sebuah instance objek [StreamReader](../) yang membaca karakter dari file yang ditentukan menggunakan enkoding UTF-8 dan buffer dengan ukuran default 4096 byte. Sebuah parameter menentukan apakah deteksi byte order mark harus diaktifkan.

```cpp
System::IO::StreamReader::StreamReader(const System::String &path, bool detectEncodingFromByteOrderMarks)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| path | const System::String\& | Jalur file untuk membaca karakter dari |
| detectEncodingFromByteOrderMarks | bool | True untuk mencari byte order mark di awal file, jika tidak - false |

## Lihat Juga

* Class [String](../../../system/string/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::StreamReader(const System::String\&, const EncodingPtr\&) constructor


Membuat sebuah instance objek [StreamReader](../) yang membaca karakter dari file yang ditentukan menggunakan enkoding yang ditentukan dan buffer dengan ukuran default 4096 byte.

```cpp
System::IO::StreamReader::StreamReader(const System::String &path, const EncodingPtr &encoding)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| path | const System::String\& | Jalur file untuk membaca karakter dari |
| encoding | const EncodingPtr\& | Enkoding yang digunakan |

## Lihat Juga

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::StreamReader(const System::String\&, const EncodingPtr\&, bool) constructor


Membuat sebuah instance objek [StreamReader](../) yang membaca karakter dari aliran dasar yang ditentukan menggunakan enkoding yang ditentukan dan buffer dengan ukuran default 4096 byte. Sebuah parameter menentukan apakah deteksi byte order mark harus diaktifkan.

```cpp
System::IO::StreamReader::StreamReader(const System::String &path, const EncodingPtr &encoding, bool detectEncodingFromByteOrderMarks)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| path | const System::String\& | Jalur file untuk membaca karakter dari |
| encoding | const EncodingPtr\& | Enkoding yang digunakan |
| detectEncodingFromByteOrderMarks | bool | True untuk mencari byte order mark di awal file, jika tidak - false |

## Lihat Juga

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::StreamReader(const System::String\&, const EncodingPtr\&, bool, int) constructor


Membuat sebuah instance objek [StreamReader](../) yang membaca karakter dari file yang ditentukan menggunakan enkoding yang ditentukan dan buffer dengan ukuran yang ditentukan. Sebuah parameter menentukan apakah deteksi byte order mark harus diaktifkan.

```cpp
System::IO::StreamReader::StreamReader(const System::String &path, const EncodingPtr &encoding, bool detectEncodingFromByteOrderMarks, int bufferSize)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| path | const System::String\& | Jalur file untuk membaca karakter dari |
| encoding | const EncodingPtr\& | Enkoding yang digunakan |
| detectEncodingFromByteOrderMarks | bool | True untuk mencari byte order mark di awal file, jika tidak - false |
| bufferSize | int | Ukuran minimum buffer dalam byte |

## Lihat Juga

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
