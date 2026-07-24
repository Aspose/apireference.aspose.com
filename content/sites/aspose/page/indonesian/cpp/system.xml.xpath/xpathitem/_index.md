---
title: "System::Xml::XPath::XPathItem class"
linktitle: "XPathItem"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XPath::XPathItem class. Mewakili sebuah item dalam Model Data XQuery 1.0 dan XPath 2.0 di C++."
type: docs
weight: 400
url: /id/cpp/system.xml.xpath/xpathitem/
---
## XPathItem class


Mewakili sebuah item dalam XQuery 1.0 dan [XPath](../) 2.0 [Data](../../system.data/) Model.

```cpp
class XPathItem : public virtual System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [get_IsNode](./get_isnode/)() | Ketika dioverride dalam kelas turunan, mendapatkan nilai yang menunjukkan apakah item mewakili node [XPath](../) atau nilai atomik. |
| virtual [get_TypedValue](./get_typedvalue/)() | Ketika dioverride dalam kelas turunan, mendapatkan item saat ini sebagai objek boxed dengan tipe paling sesuai menurut tipe skema-nya. |
| virtual [get_Value](./get_value/)() | Ketika dioverride dalam kelas turunan, mendapatkan nilai **string** dari item. |
| virtual [get_ValueAsBoolean](./get_valueasboolean/)() | Ketika dioverride dalam kelas turunan, mendapatkan nilai item sebagai [Boolean](../../system/boolean/). |
| virtual [get_ValueAsDateTime](./get_valueasdatetime/)() | Ketika dioverride dalam kelas turunan, mendapatkan nilai item sebagai [DateTime](../../system/datetime/). |
| virtual [get_ValueAsDouble](./get_valueasdouble/)() | Ketika dioverride dalam kelas turunan, mendapatkan nilai item sebagai [Double](../../system/double/). |
| virtual [get_ValueAsInt](./get_valueasint/)() | Ketika dioverride dalam kelas turunan, mendapatkan nilai item sebagai [Int32](../../system/int32/). |
| virtual [get_ValueAsLong](./get_valueaslong/)() | Ketika dioverride dalam kelas turunan, mendapatkan nilai item sebagai [Int64](../../system/int64/). |
| virtual [get_ValueType](./get_valuetype/)() | Ketika dioverride dalam kelas turunan, mendapatkan tipe dari item. |
| virtual [get_XmlType](./get_xmltype/)() | Saat ditimpa dalam kelas turunan, mendapatkan XmlSchemaType untuk item. |
| virtual [ValueAs](./valueas/)(const TypeInfo\&) | Mengembalikan nilai item sebagai tipe yang ditentukan. |
| virtual [ValueAs](./valueas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) | Saat ditimpa dalam kelas turunan, mengembalikan nilai item sebagai tipe yang ditentukan menggunakan objek [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) yang ditentukan untuk menyelesaikan prefiks namespace. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke instance kelas ini. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Page for C++](../../)
