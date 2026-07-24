---
title: "Kelas System::Xml::XPath::XPathExpression"
linktitle: "XPathExpression"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Xml::XPath::XPathExpression. Menyediakan kelas bertipe yang mewakili ekspresi XPath yang dikompilasi dalam C++."
type: docs
weight: 300
url: /id/cpp/system.xml.xpath/xpathexpression/
---
## XPathExpression class


Menyediakan kelas bertipe yang mewakili ekspresi [XPath](../) yang dikompilasi.

```cpp
class XPathExpression : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [AddSort](./addsort/)(SharedPtr\<Object\>, SharedPtr\<Collections::Generic::IComparer\<SharedPtr\<Object\>\>\>) | Ketika dioverride dalam kelas turunan, mengurutkan node yang dipilih oleh ekspresi [XPath](../) sesuai dengan objek IComparer yang ditentukan. |
| virtual [AddSort](./addsort/)(SharedPtr\<Object\>, XmlSortOrder, XmlCaseOrder, String, XmlDataType) | Ketika dioverride dalam kelas turunan, mengurutkan node yang dipilih oleh ekspresi [XPath](../) sesuai dengan parameter yang diberikan. |
| virtual [Clone](./clone/)() | Ketika dioverride dalam kelas turunan, mengembalikan klon dari [XPathExpression](./) ini. |
| static [Compile](./compile/)(const String\&) | Mengompilasi ekspresi [XPath](../) yang ditentukan dan mengembalikan objek [XPathExpression](./) yang mewakili ekspresi [XPath](../). |
| static [Compile](./compile/)(const String\&, const SharedPtr\<IXmlNamespaceResolver\>\&) | Mengompilasi ekspresi [XPath](../) yang ditentukan, dengan objek [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) yang ditentukan untuk resolusi namespace, dan mengembalikan objek [XPathExpression](./) yang mewakili ekspresi [XPath](../). |
| virtual [get_Expression](./get_expression/)() | Ketika dioverride dalam kelas turunan, mendapatkan representasi **string** dari [XPathExpression](./). |
| virtual [get_ReturnType](./get_returntype/)() | Ketika dioverride dalam kelas turunan, mendapatkan tipe hasil dari ekspresi [XPath](../). |
| virtual [SetContext](./setcontext/)(SharedPtr\<XmlNamespaceManager\>) | Ketika dioverride dalam kelas turunan, menentukan objek [XmlNamespaceManager](../../system.xml/xmlnamespacemanager/) yang akan digunakan untuk resolusi namespace. |
| virtual [SetContext](./setcontext/)(SharedPtr\<IXmlNamespaceResolver\>) | Ketika dioverride dalam kelas turunan, menentukan objek [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) yang akan digunakan untuk resolusi namespace. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke instance kelas ini. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Page for C++](../../)
