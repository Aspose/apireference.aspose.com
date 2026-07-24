---
title: "Konstruktor System::Xml::XmlTextReader::XmlTextReader"
linktitle: "XmlTextReader"
second_title: "Aspose.Page untuk C++"
description: "Konstruktor System::Xml::XmlTextReader::XmlTextReader. Menginisialisasi sebuah instance baru dari kelas XmlTextReader dengan aliran yang ditentukan dalam C++."
type: docs
weight: 100
url: /id/cpp/system.xml/xmltextreader/xmltextreader/
---
## XmlTextReader::XmlTextReader(const SharedPtr\<IO::Stream\>\&) constructor


Menginisialisasi sebuah instance baru dari kelas [XmlTextReader](../) dengan aliran yang ditentukan.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const SharedPtr<IO::Stream> &input)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| masukan | const SharedPtr\<IO::Stream\>\& | Aliran yang berisi data XML untuk dibaca. |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlNameTable\>\&) constructor


Menginisialisasi sebuah instance baru dari kelas [XmlTextReader](../) dengan aliran yang ditentukan dan [XmlNameTable](../../xmlnametable/).

```cpp
System::Xml::XmlTextReader::XmlTextReader(const SharedPtr<IO::Stream> &input, const SharedPtr<XmlNameTable> &nt)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| masukan | const SharedPtr\<IO::Stream\>\& | Aliran yang berisi data XML untuk dibaca. |
| nt | const SharedPtr\<XmlNameTable\>\& | [XmlNameTable](../../xmlnametable/) yang akan digunakan. |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const SharedPtr\<IO::Stream\>\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) constructor


Menginisialisasi sebuah instance baru dari kelas [XmlTextReader](../) dengan aliran yang ditentukan, [XmlNodeType](../../xmlnodetype/), dan [XmlParserContext](../../xmlparsercontext/).

```cpp
System::Xml::XmlTextReader::XmlTextReader(const SharedPtr<IO::Stream> &xmlFragment, XmlNodeType fragType, const SharedPtr<XmlParserContext> &context)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| xmlFragment | const SharedPtr\<IO::Stream\>\& | Aliran yang berisi fragmen XML untuk diparse. |
| fragType | XmlNodeType | [XmlNodeType](../../xmlnodetype/) dari fragmen XML. Ini juga menentukan apa yang dapat dimuat oleh fragmen tersebut. |
| context | const SharedPtr\<XmlParserContext\>\& | [XmlParserContext](../../xmlparsercontext/) di mana **xmlFragment** akan diparse. Ini mencakup [XmlNameTable](../../xmlnametable/) yang akan digunakan, pengkodean, ruang nama, **xml:lang** saat ini, dan ruang lingkup **xml:space**. |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const SharedPtr\<IO::TextReader\>\&) constructor


Menginisialisasi sebuah instance baru dari kelas [XmlTextReader](../) dengan TextReader yang ditentukan.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const SharedPtr<IO::TextReader> &input)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| masukan | const SharedPtr\<IO::TextReader\>\& | TextReader yang berisi data XML untuk dibaca. |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlNameTable\>\&) constructor


Menginisialisasi sebuah instance baru dari kelas [XmlTextReader](../) dengan TextReader yang ditentukan dan [XmlNameTable](../../xmlnametable/).

```cpp
System::Xml::XmlTextReader::XmlTextReader(const SharedPtr<IO::TextReader> &input, const SharedPtr<XmlNameTable> &nt)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| masukan | const SharedPtr\<IO::TextReader\>\& | TextReader yang berisi data XML untuk dibaca. |
| nt | const SharedPtr\<XmlNameTable\>\& | [XmlNameTable](../../xmlnametable/) yang akan digunakan. |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&) constructor


Menginisialisasi sebuah instance baru dari kelas [XmlTextReader](../) dengan file yang ditentukan.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| url | const String\& | URL untuk file yang berisi data XML. [XmlTextReader::get_BaseURI](../get_baseuri/) diatur ke nilai ini. |

## Lihat Juga

* Class [String](../../../system/string/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, const SharedPtr\<IO::Stream\>\&) constructor


Menginisialisasi sebuah instance baru dari kelas [XmlTextReader](../) dengan URL dan aliran yang ditentukan.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url, const SharedPtr<IO::Stream> &input)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| url | const String\& | URL yang digunakan untuk menyelesaikan sumber daya eksternal. [XmlTextReader::get_BaseURI](../get_baseuri/) diatur ke nilai ini. |
| masukan | const SharedPtr\<IO::Stream\>\& | Aliran yang berisi data XML untuk dibaca. |

## Lihat Juga

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlNameTable\>\&) constructor


Menginisialisasi instance baru dari kelas [XmlTextReader](../) dengan URL, aliran, dan [XmlNameTable](../../xmlnametable/) yang ditentukan.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url, const SharedPtr<IO::Stream> &input, const SharedPtr<XmlNameTable> &nt)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| url | const String\& | URL yang digunakan untuk menyelesaikan sumber daya eksternal. [XmlTextReader::get_BaseURI](../get_baseuri/) diatur ke nilai ini. Jika **url** adalah **nullptr**, **BaseURI** diatur ke [String::Empty](../../../system/string/empty/). |
| masukan | const SharedPtr\<IO::Stream\>\& | Aliran yang berisi data XML untuk dibaca. |
| nt | const SharedPtr\<XmlNameTable\>\& | [XmlNameTable](../../xmlnametable/) yang akan digunakan. |

## Lihat Juga

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, const SharedPtr\<IO::TextReader\>\&) constructor


Menginisialisasi instance baru dari kelas [XmlTextReader](../) dengan URL dan TextReader yang ditentukan.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url, const SharedPtr<IO::TextReader> &input)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| url | const String\& | URL yang digunakan untuk menyelesaikan sumber daya eksternal. [XmlTextReader::get_BaseURI](../get_baseuri/) diatur ke nilai ini. |
| masukan | const SharedPtr\<IO::TextReader\>\& | TextReader yang berisi data XML untuk dibaca. |

## Lihat Juga

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlNameTable\>\&) constructor


Menginisialisasi instance baru dari kelas [XmlTextReader](../) dengan URL, TextReader, dan [XmlNameTable](../../xmlnametable/) yang ditentukan.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url, const SharedPtr<IO::TextReader> &input, const SharedPtr<XmlNameTable> &nt)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| url | const String\& | URL yang digunakan untuk menyelesaikan sumber daya eksternal. [XmlTextReader::get_BaseURI](../get_baseuri/) diatur ke nilai ini. Jika **url** adalah **nullptr**, **BaseURI** diatur ke [String::Empty](../../../system/string/empty/). |
| masukan | const SharedPtr\<IO::TextReader\>\& | TextReader yang berisi data XML untuk dibaca. |
| nt | const SharedPtr\<XmlNameTable\>\& | [XmlNameTable](../../xmlnametable/) yang akan digunakan. |

## Lihat Juga

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, const SharedPtr\<XmlNameTable\>\&) constructor


Menginisialisasi instance baru dari kelas [XmlTextReader](../) dengan file dan [XmlNameTable](../../xmlnametable/) yang ditentukan.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url, const SharedPtr<XmlNameTable> &nt)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| url | const String\& | URL untuk file yang berisi data XML yang akan dibaca. |
| nt | const SharedPtr\<XmlNameTable\>\& | [XmlNameTable](../../xmlnametable/) yang akan digunakan. |

## Lihat Juga

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) constructor


Menginisialisasi instance baru dari kelas [XmlTextReader](../) dengan string, [XmlNodeType](../../xmlnodetype/), dan [XmlParserContext](../../xmlparsercontext/) yang ditentukan.

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &xmlFragment, XmlNodeType fragType, const SharedPtr<XmlParserContext> &context)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| xmlFragment | const String\& | String yang berisi fragmen XML untuk diparsing. |
| fragType | XmlNodeType | [XmlNodeType](../../xmlnodetype/) dari fragmen XML. Ini juga menentukan apa yang dapat dimuat dalam string fragmen. |
| context | const SharedPtr\<XmlParserContext\>\& | [XmlParserContext](../../xmlparsercontext/) di mana **xmlFragment** akan diparse. Ini mencakup [XmlNameTable](../../xmlnametable/) yang akan digunakan, pengkodean, ruang nama, **xml:lang** saat ini, dan ruang lingkup **xml:space**. |

## Lihat Juga

* Class [String](../../../system/string/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
