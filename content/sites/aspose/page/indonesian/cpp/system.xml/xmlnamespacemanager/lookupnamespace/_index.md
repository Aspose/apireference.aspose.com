---
title: "System::Xml::XmlNamespaceManager::LookupNamespace metode"
linktitle: "LookupNamespace"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlNamespaceManager::LookupNamespace metode. Mengembalikan URI namespace untuk prefiks yang ditentukan dalam C++."
type: docs
weight: 800
url: /id/cpp/system.xml/xmlnamespacemanager/lookupnamespace/
---
## XmlNamespaceManager::LookupNamespace method


Mengembalikan URI namespace untuk prefiks yang ditentukan.

```cpp
String System::Xml::XmlNamespaceManager::LookupNamespace(const String &prefix) override
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| prefix | const String\& | Prefiks yang URI namespace-nya ingin Anda selesaikan. Untuk mencocokkan namespace default, berikan [String::Empty](../../../system/string/empty/). |

### ReturnValue

URI namespace untuk **prefix** atau **nullptr** jika tidak ada namespace yang dipetakan. String yang dikembalikan diatomisasi. Untuk informasi lebih lanjut tentang string yang diatomisasi, lihat kelas [XmlNameTable](../../xmlnametable/).

## Lihat Juga

* Class [String](../../../system/string/)
* Class [XmlNamespaceManager](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
