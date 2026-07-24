---
title: "metode System::Xml::XPath::XPathExpression::AddSort"
linktitle: "AddSort"
second_title: "Aspose.Page untuk C++"
description: "metode System::Xml::XPath::XPathExpression::AddSort. Ketika dioverride dalam kelas turunan, mengurutkan node yang dipilih oleh ekspresi XPath menurut objek IComparer yang ditentukan dalam C++."
type: docs
weight: 100
url: /id/cpp/system.xml.xpath/xpathexpression/addsort/
---
## XPathExpression::AddSort(SharedPtr\<Object\>, SharedPtr\<Collections::Generic::IComparer\<SharedPtr\<Object\>\>\>) method


Ketika dioverride dalam kelas turunan, mengurutkan node yang dipilih oleh ekspresi [XPath](../../) menurut objek IComparer yang ditentukan.

```cpp
virtual void System::Xml::XPath::XPathExpression::AddSort(SharedPtr<Object> expr, SharedPtr<Collections::Generic::IComparer<SharedPtr<Object>>> comparer)=0
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| expr | SharedPtr\<Object\> | Sebuah objek yang mewakili kunci urutan. Ini dapat berupa nilai **string** dari node atau objek [XPathExpression](../) dengan ekspresi [XPath](../../) yang telah disusun. |
| comparer | SharedPtr\<Collections::Generic::IComparer\<SharedPtr\<Object\>\>\> | Objek IComparer yang menyediakan perbandingan tipe data spesifik untuk membandingkan dua objek untuk kesetaraan. |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [IComparer](../../../system.collections.generic/icomparer/)
* Class [XPathExpression](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathExpression::AddSort(SharedPtr\<Object\>, XmlSortOrder, XmlCaseOrder, String, XmlDataType) method


Saat dioverride dalam kelas turunan, mengurutkan node yang dipilih oleh ekspresi [XPath](../../) sesuai dengan parameter yang diberikan.

```cpp
virtual void System::Xml::XPath::XPathExpression::AddSort(SharedPtr<Object> expr, XmlSortOrder order, XmlCaseOrder caseOrder, String lang, XmlDataType dataType)=0
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| expr | SharedPtr\<Object\> | Sebuah objek yang mewakili kunci urutan. Ini dapat berupa nilai **string** dari node atau objek [XPathExpression](../) dengan ekspresi [XPath](../../) yang telah disusun. |
| order | XmlSortOrder | Nilai [XmlSortOrder](../../xmlsortorder/) yang menunjukkan urutan penyortiran. |
| caseOrder | XmlCaseOrder | Nilai [XmlCaseOrder](../../xmlcaseorder/) yang menunjukkan cara menyortir huruf kapital dan huruf kecil. |
| lang | String | Bahasa yang digunakan untuk perbandingan. Menggunakan kelas [Globalization::CultureInfo](../../../system.globalization/cultureinfo/) yang dapat diteruskan ke metode [String::Compare](../../../system/string/compare/) untuk tipe bahasa, misalnya, "us-en" untuk Bahasa Inggris AS. Jika string kosong diberikan, lingkungan sistem digunakan untuk menentukan [Globalization::CultureInfo](../../../system.globalization/cultureinfo/). |
| dataType | XmlDataType | Nilai [XmlDataType](../../xmldatatype/) yang menunjukkan urutan penyortiran untuk tipe data. |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Enum [XmlSortOrder](../../xmlsortorder/)
* Enum [XmlCaseOrder](../../xmlcaseorder/)
* Class [String](../../../system/string/)
* Enum [XmlDataType](../../xmldatatype/)
* Class [XPathExpression](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
