---
title: "System::Xml::Xsl::XslCompiledTransform::Load method"
linktitle: "Load"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::Xsl::XslCompiledTransform::Load method. Mengkompilasi lembar gaya yang terdapat dalam objek IXPathNavigable di C++."
type: docs
weight: 300
url: /id/cpp/system.xml.xsl/xslcompiledtransform/load/
---
## XslCompiledTransform::Load(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&) method


Mengkompilasi lembar gaya yang terdapat dalam objek IXPathNavigable.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const SharedPtr<System::Xml::XPath::IXPathNavigable> &stylesheet)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| stylesheet | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Objek yang mengimplementasikan antarmuka IXPathNavigable. Itu dapat berupa [XmlNode](../../../system.xml/xmlnode/) (biasanya sebuah [XmlDocument](../../../system.xml/xmldocument/)), atau XPathDocument yang berisi lembar gaya. |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Load(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, SharedPtr\<XsltSettings\>, SharedPtr\<XmlResolver\>) method


Mengkompilasi lembar gaya XSLT yang terdapat dalam IXPathNavigable. [XmlResolver](../../../system.xml/xmlresolver/) menyelesaikan elemen XSLT **import** atau **include** apa pun dan pengaturan XSLT menentukan izin untuk lembar gaya.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const SharedPtr<System::Xml::XPath::IXPathNavigable> &stylesheet, SharedPtr<XsltSettings> settings, SharedPtr<XmlResolver> stylesheetResolver)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| stylesheet | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Objek yang mengimplementasikan antarmuka IXPathNavigable. Itu dapat berupa [XmlNode](../../../system.xml/xmlnode/) (biasanya sebuah [XmlDocument](../../../system.xml/xmldocument/)), atau XPathDocument yang berisi lembar gaya. |
| settings | SharedPtr\<XsltSettings\> | [XsltSettings](../../xsltsettings/) yang akan diterapkan pada lembar gaya. Jika ini **nullptr**, pengaturan [XsltSettings::get_Default](../../xsltsettings/get_default/) akan diterapkan. |
| stylesheetResolver | SharedPtr\<XmlResolver\> | [XmlResolver](../../../system.xml/xmlresolver/) yang digunakan untuk menyelesaikan lembar gaya apa pun yang direferensikan dalam elemen XSLT **import** dan **include**. Jika ini **nullptr**, sumber eksternal tidak diselesaikan. |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltSettings](../../xsltsettings/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Load(const SharedPtr\<XmlReader\>\&) method


Mengkompilasi lembar gaya yang terdapat dalam [XmlReader](../../../system.xml/xmlreader/).

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const SharedPtr<XmlReader> &stylesheet)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| stylesheet | const SharedPtr\<XmlReader\>\& | [XmlReader](../../../system.xml/xmlreader/) yang berisi lembar gaya. |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Load(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltSettings\>\&, const SharedPtr\<XmlResolver\>\&) method


Mengkompilasi lembar gaya XSLT yang terdapat dalam [XmlReader](../../../system.xml/xmlreader/). [XmlResolver](../../../system.xml/xmlresolver/) menyelesaikan elemen XSLT **import** atau **include** apa pun dan pengaturan XSLT menentukan izin untuk lembar gaya.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const SharedPtr<XmlReader> &stylesheet, const SharedPtr<XsltSettings> &settings, const SharedPtr<XmlResolver> &stylesheetResolver)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| stylesheet | const SharedPtr\<XmlReader\>\& | [XmlReader](../../../system.xml/xmlreader/) yang berisi lembar gaya. |
| settings | const SharedPtr\<XsltSettings\>\& | [XsltSettings](../../xsltsettings/) yang akan diterapkan pada lembar gaya. Jika ini **nullptr**, pengaturan [XsltSettings::get_Default](../../xsltsettings/get_default/) akan diterapkan. |
| stylesheetResolver | const SharedPtr\<XmlResolver\>\& | [XmlResolver](../../../system.xml/xmlresolver/) yang digunakan untuk menyelesaikan lembar gaya apa pun yang direferensikan dalam elemen XSLT **import** dan **include**. Jika ini **nullptr**, sumber eksternal tidak diselesaikan. |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltSettings](../../xsltsettings/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Load(const String\&) method


Memuat dan mengompilasi lembar gaya yang terletak pada URI yang ditentukan.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const String &stylesheetUri)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| stylesheetUri | const String\& | URI lembar gaya. |

## Lihat Juga

* Class [String](../../../system/string/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Load(const String\&, const SharedPtr\<XsltSettings\>\&, const SharedPtr\<XmlResolver\>\&) method


Memuat dan mengompilasi lembar gaya XSLT yang ditentukan oleh URI. [XmlResolver](../../../system.xml/xmlresolver/) menyelesaikan elemen **import** atau **include** XSLT apa pun dan pengaturan XSLT menentukan izin untuk lembar gaya.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const String &stylesheetUri, const SharedPtr<XsltSettings> &settings, const SharedPtr<XmlResolver> &stylesheetResolver)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| stylesheetUri | const String\& | URI lembar gaya. |
| settings | const SharedPtr\<XsltSettings\>\& | [XsltSettings](../../xsltsettings/) yang akan diterapkan pada lembar gaya. Jika ini **nullptr**, pengaturan [XsltSettings::get_Default](../../xsltsettings/get_default/) akan diterapkan. |
| stylesheetResolver | const SharedPtr\<XmlResolver\>\& | [XmlResolver](../../../system.xml/xmlresolver/) yang digunakan untuk menyelesaikan URI lembar gaya dan lembar gaya apa pun yang direferensikan dalam elemen **import** dan **include** XSLT. |

## Lihat Juga

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XsltSettings](../../xsltsettings/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
