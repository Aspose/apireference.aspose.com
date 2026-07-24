---
title: "System::Xml::Schema::XmlAtomicValue kelas"
linktitle: "XmlAtomicValue"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::Schema::XmlAtomicValue kelas. Mewakili nilai bertipe dari elemen atau atribut XML yang divalidasi. Kelas XmlAtomicValue tidak dapat diwariskan dalam C++."
type: docs
weight: 300
url: /id/cpp/system.xml.schema/xmlatomicvalue/
---
## XmlAtomicValue class


Mewakili nilai bertipe dari elemen atau atribut XML yang divalidasi. Kelas [XmlAtomicValue](./) tidak dapat diwariskan.

```cpp
class XmlAtomicValue : public System::Xml::XPath::XPathItem
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Clone](./clone/)() | Mengembalikan salinan objek [XmlAtomicValue](./) ini. |
| [get_IsNode](./get_isnode/)() override | Mengembalikan nilai yang menunjukkan apakah elemen atau atribut XML yang divalidasi adalah node [XPath](../../system.xml.xpath/) atau nilai atomik. |
| [get_TypedValue](./get_typedvalue/)() override | Mengembalikan elemen atau atribut XML yang divalidasi saat ini sebagai objek dibungkus dengan tipe yang paling sesuai menurut tipe skema-nya. |
| [get_Value](./get_value/)() override | Mengembalikan nilai [String](../../system/string/) dari elemen atau atribut XML yang divalidasi. |
| [get_ValueAsBoolean](./get_valueasboolean/)() override | Mengembalikan nilai elemen atau atribut XML yang divalidasi sebagai [Boolean](../../system/boolean/). |
| [get_ValueAsDateTime](./get_valueasdatetime/)() override | Mengembalikan nilai elemen atau atribut XML yang divalidasi sebagai [DateTime](../../system/datetime/). |
| [get_ValueAsDouble](./get_valueasdouble/)() override | Mengembalikan nilai elemen atau atribut XML yang divalidasi sebagai [Double](../../system/double/). |
| [get_ValueAsInt](./get_valueasint/)() override | Mengembalikan nilai elemen atau atribut XML yang divalidasi sebagai [Int32](../../system/int32/). |
| [get_ValueAsLong](./get_valueaslong/)() override | Mengembalikan nilai elemen atau atribut XML yang divalidasi sebagai [Int64](../../system/int64/). |
| [get_ValueType](./get_valuetype/)() override | Mengembalikan tipe dari elemen atau atribut XML yang divalidasi. |
| [get_XmlType](./get_xmltype/)() override | Mengembalikan [XmlSchemaType](../xmlschematype/) untuk elemen atau atribut XML yang divalidasi. |
| [ToString](./tostring/)() const override | Mengembalikan nilai [String](../../system/string/) dari elemen atau atribut XML yang divalidasi. |
| [ValueAs](./valueas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) override | Mengembalikan nilai elemen atau atribut XML yang divalidasi sebagai tipe yang ditentukan menggunakan objek [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) yang ditetapkan untuk menyelesaikan prefiks namespace. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke instance kelas ini. |
## Catatan



Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

## Lihat Juga

* Class [XPathItem](../../system.xml.xpath/xpathitem/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
