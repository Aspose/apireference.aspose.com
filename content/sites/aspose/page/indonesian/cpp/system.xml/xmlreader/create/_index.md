---
title: "System::Xml::XmlReader::Create metode"
linktitle: "Buat"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlReader::Create metode. Membuat sebuah instance XmlReader baru menggunakan stream yang ditentukan dengan pengaturan default dalam C++."
type: docs
weight: 7700
url: /id/cpp/system.xml/xmlreader/create/
---
## XmlReader::Create(const SharedPtr\<IO::Stream\>\&) method


Membuat sebuah instance [XmlReader](../) baru menggunakan stream yang ditentukan dengan pengaturan default.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::Stream> &input)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| input | const SharedPtr\<IO::Stream\>\& | Stream yang berisi data XML. [XmlReader](../) memindai byte pertama dari stream untuk mencari byte order mark atau tanda lain dari pengkodean. Ketika pengkodean ditentukan, pengkodean tersebut digunakan untuk melanjutkan pembacaan stream, dan proses terus mengurai input sebagai aliran karakter (Unicode). |

### ReturnValue

Sebuah objek yang digunakan untuk membaca data XML dalam stream.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlReaderSettings\>\&) method


Membuat sebuah instance [XmlReader](../) baru dengan stream dan pengaturan yang ditentukan.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::Stream> &input, const SharedPtr<XmlReaderSettings> &settings)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| input | const SharedPtr\<IO::Stream\>\& | Stream yang berisi data XML. [XmlReader](../) memindai byte pertama dari stream untuk mencari byte order mark atau tanda lain dari pengkodean. Ketika pengkodean ditentukan, pengkodean tersebut digunakan untuk melanjutkan pembacaan stream, dan proses terus mengurai input sebagai aliran karakter (Unicode). |
| settings | const SharedPtr\<XmlReaderSettings\>\& | Pengaturan untuk instance [XmlReader](../) baru. Nilai ini dapat berupa **nullptr**. |

### ReturnValue

Sebuah objek yang digunakan untuk membaca data XML dalam stream.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) method


Membuat sebuah instance [XmlReader](../) baru menggunakan stream, pengaturan, dan informasi konteks yang ditentukan untuk penguraian.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::Stream> &input, SharedPtr<XmlReaderSettings> settings, const SharedPtr<XmlParserContext> &inputContext)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| input | const SharedPtr\<IO::Stream\>\& | Stream yang berisi data XML. [XmlReader](../) memindai byte pertama dari stream untuk mencari byte order mark atau tanda lain dari pengkodean. Ketika pengkodean ditentukan, pengkodean tersebut digunakan untuk melanjutkan pembacaan stream, dan proses terus mengurai input sebagai aliran karakter (Unicode). |
| settings | SharedPtr\<XmlReaderSettings\> | Pengaturan untuk instance [XmlReader](../) baru. Nilai ini dapat berupa **nullptr**. |
| inputContext | const SharedPtr\<XmlParserContext\>\& | Informasi konteks yang diperlukan untuk mengurai fragmen XML. Informasi konteks dapat mencakup [XmlNameTable](../../xmlnametable/) yang akan digunakan, pengkodean, ruang nama, ruang lingkup **xml:lang** dan **xml:space** saat ini, URI dasar, dan definisi tipe dokumen. Nilai ini dapat berupa **nullptr**. |

### ReturnValue

Sebuah objek yang digunakan untuk membaca data XML dalam stream.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlReaderSettings\>, const String\&) method


Membuat sebuah instance [XmlReader](../) baru menggunakan stream, URI dasar, dan pengaturan yang ditentukan.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::Stream> &input, SharedPtr<XmlReaderSettings> settings, const String &baseUri)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| input | const SharedPtr\<IO::Stream\>\& | Stream yang berisi data XML. [XmlReader](../) memindai byte pertama dari stream untuk mencari byte order mark atau tanda lain dari pengkodean. Ketika pengkodean ditentukan, pengkodean tersebut digunakan untuk melanjutkan pembacaan stream, dan proses terus mengurai input sebagai aliran karakter (Unicode). |
| settings | SharedPtr\<XmlReaderSettings\> | Pengaturan untuk instance [XmlReader](../) baru. Nilai ini dapat berupa **nullptr**. |
| baseUri | const String\& | URI dasar untuk entitas atau dokumen yang sedang dibaca. Nilai ini dapat berupa **nullptr**. **[Security](../../../system.security/) Catatan** URI dasar digunakan untuk menyelesaikan URI relatif dari dokumen XML. Jangan gunakan URI dasar dari sumber yang tidak tepercaya. |

### ReturnValue

Sebuah objek yang digunakan untuk membaca data XML dalam stream.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::TextReader\>\&) method


Membuat sebuah instance [XmlReader](../) baru dengan menggunakan pembaca teks yang ditentukan.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::TextReader> &input)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| masukan | const SharedPtr\<IO::TextReader\>\& | Pembaca teks yang digunakan untuk membaca data XML. Pembaca teks mengembalikan aliran karakter Unicode, sehingga pengkodean yang ditentukan dalam deklarasi XML tidak digunakan oleh pembaca XML untuk mendekode aliran data. |

### ReturnValue

Sebuah objek yang digunakan untuk membaca data XML dalam stream.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlReaderSettings\>\&) method


Membuat sebuah instance [XmlReader](../) baru dengan menggunakan pembaca teks dan pengaturan yang ditentukan.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::TextReader> &input, const SharedPtr<XmlReaderSettings> &settings)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| masukan | const SharedPtr\<IO::TextReader\>\& | Pembaca teks yang digunakan untuk membaca data XML. Pembaca teks mengembalikan aliran karakter Unicode, sehingga pengkodean yang ditentukan dalam deklarasi XML tidak digunakan oleh pembaca XML untuk mendekode aliran data. |
| settings | const SharedPtr\<XmlReaderSettings\>\& | Pengaturan untuk [XmlReader](../) baru. Nilai ini dapat berupa **nullptr**. |

### ReturnValue

Sebuah objek yang digunakan untuk membaca data XML dalam stream.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::TextReader\>\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) method


Membuat sebuah instance [XmlReader](../) baru dengan menggunakan pembaca teks, pengaturan, dan informasi konteks yang ditentukan untuk parsing.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::TextReader> &input, SharedPtr<XmlReaderSettings> settings, const SharedPtr<XmlParserContext> &inputContext)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| masukan | const SharedPtr\<IO::TextReader\>\& | Pembaca teks yang digunakan untuk membaca data XML. Pembaca teks mengembalikan aliran karakter Unicode, sehingga pengkodean yang ditentukan dalam deklarasi XML tidak digunakan oleh pembaca XML untuk mendekode aliran data. |
| settings | SharedPtr\<XmlReaderSettings\> | Pengaturan untuk instance [XmlReader](../) baru. Nilai ini dapat berupa **nullptr**. |
| inputContext | const SharedPtr\<XmlParserContext\>\& | Informasi konteks yang diperlukan untuk mengurai fragmen XML. Informasi konteks dapat mencakup [XmlNameTable](../../xmlnametable/) yang akan digunakan, pengkodean, ruang nama, ruang lingkup **xml:lang** dan **xml:space** saat ini, URI dasar, dan definisi tipe dokumen. Nilai ini dapat berupa **nullptr**. |

### ReturnValue

Sebuah objek yang digunakan untuk membaca data XML dalam stream.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::TextReader\>\&, SharedPtr\<XmlReaderSettings\>, const String\&) method


Membuat sebuah instance [XmlReader](../) baru dengan menggunakan pembaca teks, pengaturan, dan URI dasar yang ditentukan.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::TextReader> &input, SharedPtr<XmlReaderSettings> settings, const String &baseUri)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| input | const SharedPtr\<IO::TextReader\>\& | Pembaca teks yang digunakan untuk membaca data XML. Pembaca teks mengembalikan aliran karakter Unicode, sehingga pengkodean yang ditentukan dalam deklarasi XML tidak digunakan oleh [XmlReader](../) untuk mendekode aliran data. |
| settings | SharedPtr\<XmlReaderSettings\> | Pengaturan untuk instance [XmlReader](../) baru. Nilai ini dapat berupa **nullptr**. |
| baseUri | const String\& | URI dasar untuk entitas atau dokumen yang sedang dibaca. Nilai ini dapat berupa **nullptr**. **[Security](../../../system.security/) Catatan** URI dasar digunakan untuk menyelesaikan URI relatif dari dokumen XML. Jangan gunakan URI dasar dari sumber yang tidak tepercaya. |

### ReturnValue

Sebuah objek yang digunakan untuk membaca data XML dalam stream.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const SharedPtr\<XmlReader\>\&, SharedPtr\<XmlReaderSettings\>) method


Membuat sebuah instance [XmlReader](../) baru dengan menggunakan pembaca XML dan pengaturan yang ditentukan.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<XmlReader> &reader, SharedPtr<XmlReaderSettings> settings)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| pembaca | const SharedPtr\<XmlReader\>\& | Objek yang ingin Anda gunakan sebagai pembaca XML yang mendasari. |
| settings | SharedPtr\<XmlReaderSettings\> | Pengaturan untuk instance [XmlReader](../) baru. Tingkat kepatuhan dari objek [XmlReaderSettings](../../xmlreadersettings/) harus cocok dengan tingkat kepatuhan pembaca yang mendasari, atau harus disetel ke [ConformanceLevel::Auto](../../conformancelevel/). |

### ReturnValue

Sebuah objek yang dibungkus di sekitar objek [XmlReader](../) yang ditentukan.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const String\&) method


Membuat sebuah instance [XmlReader](../) baru dengan URI yang ditentukan.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const String &inputUri)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| inputUri | const String\& | URI untuk file yang berisi data XML. Kelas [XmlUrlResolver](../../xmlurlresolver/) digunakan untuk mengonversi jalur menjadi representasi data kanonik. |

### ReturnValue

Sebuah objek yang digunakan untuk membaca data XML dalam stream.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const String\&, const SharedPtr\<XmlReaderSettings\>\&) method


Membuat sebuah instance [XmlReader](../) baru dengan menggunakan URI dan pengaturan yang ditentukan.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const String &inputUri, const SharedPtr<XmlReaderSettings> &settings)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| inputUri | const String\& | URI untuk file yang berisi data XML. Objek [XmlResolver](../../xmlresolver/) pada objek [XmlReaderSettings](../../xmlreadersettings/) digunakan untuk mengonversi jalur menjadi representasi data kanonik. Jika nilai XmlReaderSettings::get_XmlResolver adalah **nullptr**, objek [XmlUrlResolver](../../xmlurlresolver/) baru akan digunakan. |
| settings | const SharedPtr\<XmlReaderSettings\>\& | Pengaturan untuk instance [XmlReader](../) baru. Nilai ini dapat berupa **nullptr**. |

### ReturnValue

Sebuah objek yang digunakan untuk membaca data XML dalam stream.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [String](../../../system/string/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const String\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) method


Membuat sebuah instance [XmlReader](../) baru dengan menggunakan URI, pengaturan, dan informasi konteks yang ditentukan untuk parsing.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const String &inputUri, SharedPtr<XmlReaderSettings> settings, const SharedPtr<XmlParserContext> &inputContext)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| inputUri | const String\& | URI untuk file yang berisi data XML. Objek [XmlResolver](../../xmlresolver/) pada objek [XmlReaderSettings](../../xmlreadersettings/) digunakan untuk mengonversi jalur menjadi representasi data kanonik. Jika nilai XmlReaderSettings::get_XmlResolver adalah **nullptr**, objek [XmlUrlResolver](../../xmlurlresolver/) baru akan digunakan. |
| settings | SharedPtr\<XmlReaderSettings\> | Pengaturan untuk instance [XmlReader](../) baru. Nilai ini dapat berupa **nullptr**. |
| inputContext | const SharedPtr\<XmlParserContext\>\& | Informasi konteks yang diperlukan untuk mengurai fragmen XML. Informasi konteks dapat mencakup [XmlNameTable](../../xmlnametable/) yang akan digunakan, pengkodean, ruang nama, ruang lingkup **xml:lang** dan **xml:space** saat ini, URI dasar, dan definisi tipe dokumen. Nilai ini dapat berupa **nullptr**. |

### ReturnValue

Sebuah objek yang digunakan untuk membaca data XML dalam stream.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [String](../../../system/string/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
