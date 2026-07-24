---
title: "System::Xml::XmlTextReader::GetNamespacesInScope metode"
linktitle: "GetNamespacesInScope"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlTextReader::GetNamespacesInScope metode. Mengembalikan koleksi yang berisi semua namespace yang saat ini dalam lingkup dalam C++."
type: docs
weight: 3400
url: /id/cpp/system.xml/xmltextreader/getnamespacesinscope/
---
## XmlTextReader::GetNamespacesInScope method


Mengembalikan koleksi yang berisi semua namespace yang saat ini dalam lingkup.

```cpp
SharedPtr<Collections::Generic::IDictionary<String, String>> System::Xml::XmlTextReader::GetNamespacesInScope(XmlNamespaceScope scope) override
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| scope | XmlNamespaceScope | Sebuah nilai [XmlNamespaceScope](../../xmlnamespacescope/) yang menentukan jenis node namespace yang akan dikembalikan. |

### ReturnValue

Sebuah objek IDictionary yang berisi semua namespace dalam lingkup saat ini. Jika pembaca tidak berada pada sebuah elemen, kamus kosong (tanpa namespace) akan dikembalikan.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IDictionary](../../../system.collections.generic/idictionary/)
* Class [String](../../../system/string/)
* Enum [XmlNamespaceScope](../../xmlnamespacescope/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
