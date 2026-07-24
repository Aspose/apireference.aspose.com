---
title: "System::Xml::XmlDocument::CreateAttribute metode"
linktitle: "CreateAttribute"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlDocument::CreateAttribute metode. Membuat XmlAttribute dengan nama yang ditentukan dalam C++."
type: docs
weight: 300
url: /id/cpp/system.xml/xmldocument/createattribute/
---
## XmlDocument::CreateAttribute(const String\&) method


Membuat sebuah [XmlAttribute](../../xmlattribute/) dengan nama yang ditentukan.

```cpp
SharedPtr<XmlAttribute> System::Xml::XmlDocument::CreateAttribute(const String &name)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| name | const String\& | Nama terkualifikasi dari atribut. Jika nama mengandung titik dua, nilai [XmlNode::get_Prefix](../../xmlnode/get_prefix/) mencerminkan bagian nama yang berada sebelum titik dua pertama dan nilai [XmlDocument::get_LocalName](../get_localname/) mencerminkan bagian nama yang berada setelah titik dua pertama. [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) tetap kosong kecuali awalan adalah awalan bawaan yang dikenali seperti **xmlns**. Dalam kasus ini get_NamespaceURI memiliki nilai [http://www.w3.org/2000/xmlns/](http://www.w3.org/2000/xmlns/). |

### ReturnValue

[XmlAttribute](../../xmlattribute/) baru.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::CreateAttribute(const String\&, const String\&, const String\&) method


Membuat sebuah [XmlAttribute](../../xmlattribute/) dengan [XmlNode::get_Prefix](../../xmlnode/get_prefix/) yang ditentukan, [XmlDocument::get_LocalName](../get_localname/) yang ditentukan, dan [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) yang ditentukan.

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlDocument::CreateAttribute(const String &prefix, const String &localName, const String &namespaceURI)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| prefix | const String\& | Awalan dari atribut (jika ada). [String::Empty](../../../system/string/empty/) dan **nullptr** setara. |
| localName | const String\& | Nama lokal atribut. |
| namespaceURI | const String\& | URI ruang nama dari atribut (jika ada). [String::Empty](../../../system/string/empty/) dan **nullptr** setara. Jika **prefix** adalah **xmlns**, maka parameter ini harus [http://www.w3.org/2000/xmlns/;](http://www.w3.org/2000/xmlns/;) jika tidak, sebuah pengecualian akan dilempar. |

### ReturnValue

[XmlAttribute](../../xmlattribute/) baru.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::CreateAttribute(const String\&, const String\&) method


Membuat sebuah [XmlAttribute](../../xmlattribute/) dengan nama terkualifikasi yang ditentukan dan [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
SharedPtr<XmlAttribute> System::Xml::XmlDocument::CreateAttribute(const String &qualifiedName, const String &namespaceURI)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| qualifiedName | const String\& | Nama terkualifikasi dari atribut. Jika nama mengandung titik dua maka nilai [XmlNode::get_Prefix](../../xmlnode/get_prefix/) akan mencerminkan bagian nama sebelum titik dua dan nilai [XmlDocument::get_LocalName](../get_localname/) akan mencerminkan bagian nama setelah titik dua. |
| namespaceURI | const String\& | URI ruang nama dari atribut. Jika nama terkualifikasi menyertakan awalan **xmlns**, maka parameter ini harus [http://www.w3.org/2000/xmlns/](http://www.w3.org/2000/xmlns/). |

### ReturnValue

[XmlAttribute](../../xmlattribute/) baru.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
