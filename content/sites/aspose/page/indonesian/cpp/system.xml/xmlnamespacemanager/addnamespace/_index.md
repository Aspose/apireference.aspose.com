---
title: "Metode System::Xml::XmlNamespaceManager::AddNamespace"
linktitle: "AddNamespace"
second_title: "Aspose.Page untuk C++"
description: "Metode System::Xml::XmlNamespaceManager::AddNamespace. Menambahkan namespace yang diberikan ke koleksi dalam C++."
type: docs
weight: 200
url: /id/cpp/system.xml/xmlnamespacemanager/addnamespace/
---
## XmlNamespaceManager::AddNamespace method


Menambahkan namespace yang diberikan ke dalam koleksi.

```cpp
virtual void System::Xml::XmlNamespaceManager::AddNamespace(String prefix, String uri)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| prefix | String | Prefiks yang akan dikaitkan dengan namespace yang ditambahkan. Gunakan [String::Empty](../../../system/string/empty/) untuk menambahkan namespace default. Jika [XmlNamespaceManager](../) akan digunakan untuk menyelesaikan namespace dalam ekspresi Bahasa Jalur XML ([XPath](../../../system.xml.xpath/)), sebuah prefiks harus ditentukan. Jika sebuah ekspresi [XPath](../../../system.xml.xpath/) tidak menyertakan prefiks, diasumsikan bahwa Uniform Resource Identifier (URI) namespace adalah namespace kosong. Untuk informasi lebih lanjut tentang ekspresi [XPath](../../../system.xml.xpath/) dan [XmlNamespaceManager](../), lihat metode XmlNode::SelectNodes(String) dan XPathExpression::SetContext(SharedPtr<XmlNamespaceManager>) methods. |
| uri | String | Namespace yang akan ditambahkan. |

## Lihat Juga

* Class [String](../../../system/string/)
* Class [XmlNamespaceManager](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
