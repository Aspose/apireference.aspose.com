---
title: "Metode System::Xml::XmlReader::ReadElementContentAsObject"
linktitle: "ReadElementContentAsObject"
second_title: "Aspose.Page untuk C++"
description: "Metode System::Xml::XmlReader::ReadElementContentAsObject. Membaca elemen saat ini dan mengembalikan isinya sebagai Object dalam C++."
type: docs
weight: 6200
url: /id/cpp/system.xml/xmlreader/readelementcontentasobject/
---
## XmlReader::ReadElementContentAsObject() method


Membaca elemen saat ini dan mengembalikan isinya sebagai [Object](../../../system/object/).

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadElementContentAsObject()
```


### ReturnValue

Objek yang dibungkus (boxed) dengan tipe yang paling tepat. Nilai [XmlReader::get_ValueType](../get_valuetype/) menentukan tipe yang tepat. Jika konten bertipe daftar, metode ini mengembalikan array objek yang dibungkus dengan tipe yang sesuai.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::ReadElementContentAsObject(String, String) method


Memeriksa bahwa nama lokal dan namespace URI yang ditentukan cocok dengan elemen saat ini, kemudian membaca elemen saat ini dan mengembalikan isinya sebagai [Object](../../../system/object/).

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadElementContentAsObject(String localName, String namespaceURI)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| localName | String | Nama lokal elemen. |
| namespaceURI | String | URI namespace elemen. |

### ReturnValue

Objek yang dibungkus (boxed) dengan tipe yang paling tepat. Nilai [XmlReader::get_ValueType](../get_valuetype/) menentukan tipe yang tepat. Jika konten bertipe daftar, metode ini mengembalikan array objek yang dibungkus dengan tipe yang sesuai.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
