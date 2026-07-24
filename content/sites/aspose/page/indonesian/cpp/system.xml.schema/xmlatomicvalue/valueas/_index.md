---
title: "System::Xml::Schema::XmlAtomicValue::ValueAs method"
linktitle: "ValueAs"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::Schema::XmlAtomicValue::ValueAs method. Mengembalikan nilai elemen atau atribut XML yang divalidasi sebagai tipe yang ditentukan menggunakan objek IXmlNamespaceResolver yang ditentukan untuk menyelesaikan prefiks namespace dalam C++."
type: docs
weight: 1300
url: /id/cpp/system.xml.schema/xmlatomicvalue/valueas/
---
## XmlAtomicValue::ValueAs method


Mengembalikan nilai elemen atau atribut XML yang divalidasi sebagai tipe yang ditentukan menggunakan objek [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) yang ditentukan untuk menyelesaikan prefiks namespace.

```cpp
SharedPtr<Object> System::Xml::Schema::XmlAtomicValue::ValueAs(const TypeInfo &type, SharedPtr<IXmlNamespaceResolver> nsResolver) override
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| tipe | const TypeInfo\& | Tipe untuk mengembalikan nilai elemen atau atribut XML yang divalidasi. |
| nsResolver | SharedPtr\<IXmlNamespaceResolver\> | [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) objek yang digunakan untuk menyelesaikan prefiks namespace. |

### ReturnValue

Nilai elemen atau atribut XML yang divalidasi dalam tipe yang diminta.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XmlAtomicValue](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
