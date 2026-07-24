---
title: "Metode System::Xml::XmlReader::GetAttribute"
linktitle: "GetAttribute"
second_title: "Aspose.Page untuk C++"
description: "Metode System::Xml::XmlReader::GetAttribute. Ketika dioverride dalam kelas turunan, mendapatkan nilai atribut dengan indeks yang ditentukan dalam C++."
type: docs
weight: 2800
url: /id/cpp/system.xml/xmlreader/getattribute/
---
## XmlReader::GetAttribute(int32_t) method


Saat ditimpa dalam kelas turunan, mengambil nilai atribut dengan indeks yang ditentukan.

```cpp
virtual String System::Xml::XmlReader::GetAttribute(int32_t i)=0
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| i | int32_t | Indeks atribut. Indeks dimulai dari nol. (Atribut pertama memiliki indeks 0.) |

### ReturnValue

Nilai atribut yang ditentukan. Metode ini tidak memindahkan pembaca.

## Lihat Juga

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::GetAttribute(String) method


Ketika dioverride dalam kelas turunan, mendapatkan nilai atribut dengan nilai [XmlReader::get_Name](../get_name/) yang ditentukan.

```cpp
virtual String System::Xml::XmlReader::GetAttribute(String name)=0
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| name | String | Nama lengkap atribut. |

### ReturnValue

Nilai atribut yang ditentukan. Jika atribut tidak ditemukan atau nilainya adalah [String::Empty](../../../system/string/empty/), **nullptr** dikembalikan.

## Lihat Juga

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::GetAttribute(String, String) method


Ketika dioverride dalam kelas turunan, mendapatkan nilai atribut dengan nilai [XmlReader::get_LocalName](../get_localname/) dan [XmlReader::get_NamespaceURI](../get_namespaceuri/) yang ditentukan.

```cpp
virtual String System::Xml::XmlReader::GetAttribute(String name, String namespaceURI)=0
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| name | String | Nama lokal atribut. |
| namespaceURI | String | Namespace URI atribut. |

### ReturnValue

Nilai atribut yang ditentukan. Jika atribut tidak ditemukan atau nilainya adalah [String::Empty](../../../system/string/empty/), **nullptr** dikembalikan. Metode ini tidak memindahkan pembaca.

## Lihat Juga

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
