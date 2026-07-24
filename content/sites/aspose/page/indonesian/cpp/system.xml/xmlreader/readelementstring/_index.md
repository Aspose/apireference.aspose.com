---
title: "System::Xml::XmlReader::ReadElementString metode"
linktitle: "ReadElementString"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlReader::ReadElementString metode. Membaca elemen yang hanya berisi teks. Namun, disarankan untuk menggunakan metode XmlReader::ReadElementContentAsString sebagai gantinya, karena memberikan cara yang lebih langsung untuk menangani operasi ini dalam C++."
type: docs
weight: 6400
url: /id/cpp/system.xml/xmlreader/readelementstring/
---
## XmlReader::ReadElementString() method


Membaca elemen yang hanya berisi teks. Namun, disarankan untuk menggunakan metode [XmlReader::ReadElementContentAsString](../readelementcontentasstring/) sebagai gantinya, karena memberikan cara yang lebih langsung untuk menangani operasi ini.

```cpp
virtual String System::Xml::XmlReader::ReadElementString()
```


### ReturnValue

Teks yang terdapat dalam elemen yang dibaca. String kosong jika elemen tersebut kosong.

## Lihat Juga

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::ReadElementString(String, String) method


Memeriksa bahwa nilai [XmlReader::get_LocalName](../get_localname/) dan [XmlReader::get_NamespaceURI](../get_namespaceuri/) dari elemen yang ditemukan cocok dengan string yang diberikan sebelum membaca elemen yang hanya berisi teks. Namun, disarankan untuk menggunakan metode [XmlReader::ReadElementContentAsString](../readelementcontentasstring/) sebagai gantinya, karena memberikan cara yang lebih langsung untuk menangani operasi ini.

```cpp
virtual String System::Xml::XmlReader::ReadElementString(String localname, String ns)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| localname | String | Nama lokal yang akan diperiksa. |
| ns | String | URI namespace untuk diperiksa. |

### ReturnValue

Teks yang terdapat dalam elemen yang dibaca. String kosong jika elemen tersebut kosong.

## Lihat Juga

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::ReadElementString(String) method


Memeriksa bahwa nilai [XmlReader::get_Name](../get_name/) dari elemen yang ditemukan cocok dengan string yang diberikan sebelum membaca elemen hanya teks. Namun, disarankan untuk menggunakan metode [XmlReader::ReadElementContentAsString](../readelementcontentasstring/) sebagai gantinya, karena menyediakan cara yang lebih langsung untuk menangani operasi ini.

```cpp
virtual String System::Xml::XmlReader::ReadElementString(String name)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| name | String | Nama yang akan diperiksa. |

### ReturnValue

Teks yang terdapat dalam elemen yang dibaca. String kosong jika elemen tersebut kosong.

## Lihat Juga

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
