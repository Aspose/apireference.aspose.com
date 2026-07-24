---
title: "System::Xml::XmlDocument::CreateElement method"
linktitle: "CreateElement"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlDocument::CreateElement method. Membuat elemen dengan nama yang ditentukan dalam C++."
type: docs
weight: 800
url: /id/cpp/system.xml/xmldocument/createelement/
---
## XmlDocument::CreateElement(const String\&) method


Membuat sebuah elemen dengan nama yang ditentukan.

```cpp
SharedPtr<XmlElement> System::Xml::XmlDocument::CreateElement(const String &name)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| name | const String\& | Nama yang memenuhi syarat dari elemen. Jika nama mengandung titik dua, maka nilai [XmlNode::get_Prefix](../../xmlnode/get_prefix/) mencerminkan bagian nama sebelum titik dua dan nilai [XmlDocument::get_LocalName](../get_localname/) mencerminkan bagian nama setelah titik dua. Nama yang memenuhi syarat tidak dapat menyertakan awalan **xmlns**. |

### ReturnValue

[XmlElement](../../xmlelement/) baru.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::CreateElement(const String\&, const String\&, const String\&) method


Membuat elemen dengan [XmlNode::get_Prefix](../../xmlnode/get_prefix/), [XmlDocument::get_LocalName](../get_localname/), dan [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) yang ditentukan.

```cpp
virtual SharedPtr<XmlElement> System::Xml::XmlDocument::CreateElement(const String &prefix, const String &localName, const String &namespaceURI)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| prefix | const String\& | Awalan dari elemen baru (jika ada). [String::Empty](../../../system/string/empty/) dan **nullptr** setara. |
| localName | const String\& | Nama lokal dari elemen baru. |
| namespaceURI | const String\& | URI namespace dari elemen baru (jika ada). [String::Empty](../../../system/string/empty/) dan **nullptr** adalah setara. |

### ReturnValue

[XmlElement](../../xmlelement/) baru.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::CreateElement(const String\&, const String\&) method


Membuat sebuah [XmlElement](../../xmlelement/) dengan nama yang memenuhi syarat dan [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
SharedPtr<XmlElement> System::Xml::XmlDocument::CreateElement(const String &qualifiedName, const String &namespaceURI)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| qualifiedName | const String\& | Nama yang memenuhi syarat dari elemen. Jika nama mengandung titik dua maka nilai [XmlNode::get_Prefix](../../xmlnode/get_prefix/) akan mencerminkan bagian nama sebelum titik dua dan nilai [XmlDocument::get_LocalName](../get_localname/) akan mencerminkan bagian nama setelah titik dua. Nama yang memenuhi syarat tidak boleh menyertakan awalan **xmlns**. |
| namespaceURI | const String\& | URI namespace elemen. |

### ReturnValue

[XmlElement](../../xmlelement/) baru.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
