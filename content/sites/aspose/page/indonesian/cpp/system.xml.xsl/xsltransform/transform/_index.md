---
title: "System::Xml::Xsl::XslTransform::Transform metode"
linktitle: "Transform"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::Xsl::XslTransform::Transform metode. Mengubah data XML dalam IXPathNavigable menggunakan args yang ditentukan dan mengeluarkan hasilnya ke sebuah XmlReader di C++."
type: docs
weight: 400
url: /id/cpp/system.xml.xsl/xsltransform/transform/
---
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&) method


Mengubah data XML dalam IXPathNavigable menggunakan **args** yang ditentukan dan mengeluarkan hasilnya ke [XmlReader](../../../system.xml/xmlreader/).

```cpp
SharedPtr<XmlReader> System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Sebuah objek yang mengimplementasikan antarmuka IXPathNavigable. Itu dapat berupa [XmlNode](../../../system.xml/xmlnode/) (biasanya [XmlDocument](../../../system.xml/xmldocument/)), atau XPathDocument yang berisi data yang akan diubah. |
| args | const SharedPtr\<XsltArgumentList\>\& | Sebuah [XsltArgumentList](../../xsltargumentlist/) yang berisi argumen yang memenuhi kualifikasi namespace yang digunakan sebagai masukan untuk transformasi. |

### ReturnValue

Sebuah [XmlReader](../../../system.xml/xmlreader/) yang berisi hasil transformasi.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


Mengubah data XML dalam IXPathNavigable menggunakan **args** yang ditentukan dan mengeluarkan hasilnya ke Stream.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::Stream> &output)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Sebuah objek yang mengimplementasikan antarmuka IXPathNavigable. Itu dapat berupa [XmlNode](../../../system.xml/xmlnode/) (biasanya [XmlDocument](../../../system.xml/xmldocument/)), atau XPathDocument yang berisi data yang akan diubah. |
| args | const SharedPtr\<XsltArgumentList\>\& | Sebuah [XsltArgumentList](../../xsltargumentlist/) yang berisi argumen yang memenuhi kualifikasi namespace yang digunakan sebagai masukan untuk transformasi. |
| keluaran | const SharedPtr\<IO::Stream\>\& | Aliran tempat Anda ingin menuliskan output. |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Mengubah data XML dalam IXPathNavigable menggunakan **args** yang ditentukan dan mengeluarkan hasilnya ke Stream.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::Stream> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Sebuah objek yang mengimplementasikan antarmuka IXPathNavigable. Itu dapat berupa [XmlNode](../../../system.xml/xmlnode/) (biasanya [XmlDocument](../../../system.xml/xmldocument/)), atau XPathDocument yang berisi data yang akan diubah. |
| args | const SharedPtr\<XsltArgumentList\>\& | Sebuah [XsltArgumentList](../../xsltargumentlist/) yang berisi argumen yang memenuhi kualifikasi namespace yang digunakan sebagai masukan untuk transformasi. |
| keluaran | const SharedPtr\<IO::Stream\>\& | Aliran tempat Anda ingin menuliskan output. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Resolver [XmlResolver](../../../system.xml/xmlresolver/) yang digunakan untuk menyelesaikan fungsi XSLT **document()**. Jika ini **nullptr**, fungsi **document()** tidak diselesaikan. Resolver [XmlResolver](../../../system.xml/xmlresolver/) tidak di-cache setelah metode [XslTransform::Transform](./) selesai. |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


Mengubah data XML dalam IXPathNavigable menggunakan **args** yang ditentukan dan mengeluarkan hasilnya ke TextWriter.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::TextWriter> &output)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Sebuah objek yang mengimplementasikan antarmuka IXPathNavigable. Itu dapat berupa [XmlNode](../../../system.xml/xmlnode/) (biasanya [XmlDocument](../../../system.xml/xmldocument/)), atau XPathDocument yang berisi data yang akan diubah. |
| args | const SharedPtr\<XsltArgumentList\>\& | Sebuah [XsltArgumentList](../../xsltargumentlist/) yang berisi argumen yang memenuhi kualifikasi namespace yang digunakan sebagai masukan untuk transformasi. |
| keluaran | const SharedPtr\<IO::TextWriter\>\& | TextWriter tempat Anda ingin menuliskan output. |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Mengubah data XML dalam IXPathNavigable menggunakan **args** yang ditentukan dan mengeluarkan hasilnya ke TextWriter.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::TextWriter> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Sebuah objek yang mengimplementasikan antarmuka IXPathNavigable. Itu dapat berupa [XmlNode](../../../system.xml/xmlnode/) (biasanya [XmlDocument](../../../system.xml/xmldocument/)), atau XPathDocument yang berisi data yang akan diubah. |
| args | const SharedPtr\<XsltArgumentList\>\& | Sebuah [XsltArgumentList](../../xsltargumentlist/) yang berisi argumen yang memenuhi kualifikasi namespace yang digunakan sebagai masukan untuk transformasi. |
| keluaran | const SharedPtr\<IO::TextWriter\>\& | TextWriter tempat Anda ingin menuliskan output. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Resolver [XmlResolver](../../../system.xml/xmlresolver/) yang digunakan untuk menyelesaikan fungsi XSLT **document()**. Jika ini **nullptr**, fungsi **document()** tidak diselesaikan. Resolver [XmlResolver](../../../system.xml/xmlresolver/) tidak di-cache setelah metode ini selesai. |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Mengubah data XML dalam IXPathNavigable menggunakan **args** yang ditentukan dan mengeluarkan hasilnya ke [XmlReader](../../../system.xml/xmlreader/).

```cpp
SharedPtr<XmlReader> System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Sebuah objek yang mengimplementasikan antarmuka IXPathNavigable. Itu dapat berupa [XmlNode](../../../system.xml/xmlnode/) (biasanya [XmlDocument](../../../system.xml/xmldocument/)), atau XPathDocument yang berisi data yang akan diubah. |
| args | const SharedPtr\<XsltArgumentList\>\& | Sebuah [XsltArgumentList](../../xsltargumentlist/) yang berisi argumen yang memenuhi kualifikasi namespace yang digunakan sebagai masukan untuk transformasi. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Resolver [XmlResolver](../../../system.xml/xmlresolver/) yang digunakan untuk menyelesaikan fungsi XSLT **document()**. Jika ini **nullptr**, fungsi **document()** tidak diselesaikan. Resolver [XmlResolver](../../../system.xml/xmlresolver/) tidak di-cache setelah metode ini selesai. |

### ReturnValue

Sebuah [XmlReader](../../../system.xml/xmlreader/) yang berisi hasil transformasi.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


Mengubah data XML dalam IXPathNavigable menggunakan **args** yang ditentukan dan menghasilkan output ke [XmlWriter](../../../system.xml/xmlwriter/).

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<XmlWriter> &output)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Sebuah objek yang mengimplementasikan antarmuka IXPathNavigable. Itu dapat berupa [XmlNode](../../../system.xml/xmlnode/) (biasanya [XmlDocument](../../../system.xml/xmldocument/)), atau XPathDocument yang berisi data yang akan diubah. |
| args | const SharedPtr\<XsltArgumentList\>\& | Sebuah [XsltArgumentList](../../xsltargumentlist/) yang berisi argumen yang memenuhi kualifikasi namespace yang digunakan sebagai masukan untuk transformasi. |
| output | const SharedPtr\<XmlWriter\>\& | [XmlWriter](../../../system.xml/xmlwriter/) tempat Anda ingin menuliskan output. |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Mengubah data XML dalam IXPathNavigable menggunakan **args** yang ditentukan dan menghasilkan output ke [XmlWriter](../../../system.xml/xmlwriter/).

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<XmlWriter> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Sebuah objek yang mengimplementasikan antarmuka IXPathNavigable. Itu dapat berupa [XmlNode](../../../system.xml/xmlnode/) (biasanya [XmlDocument](../../../system.xml/xmldocument/)), atau XPathDocument yang berisi data yang akan diubah. |
| args | const SharedPtr\<XsltArgumentList\>\& | Sebuah [XsltArgumentList](../../xsltargumentlist/) yang berisi argumen yang memenuhi kualifikasi namespace yang digunakan sebagai masukan untuk transformasi. |
| output | const SharedPtr\<XmlWriter\>\& | [XmlWriter](../../../system.xml/xmlwriter/) tempat Anda ingin menuliskan output. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Resolver [XmlResolver](../../../system.xml/xmlresolver/) yang digunakan untuk menyelesaikan fungsi XSLT **document()**. Jika ini **nullptr**, fungsi **document()** tidak diselesaikan. Resolver [XmlResolver](../../../system.xml/xmlresolver/) tidak di-cache setelah metode ini selesai. |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&) method


Mengubah data XML dalam XPathNavigator menggunakan **args** yang ditentukan dan menghasilkan output ke [XmlReader](../../../system.xml/xmlreader/).

```cpp
SharedPtr<XmlReader> System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| masukan | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Sebuah XPathNavigator yang berisi data yang akan diubah. |
| args | const SharedPtr\<XsltArgumentList\>\& | Sebuah [XsltArgumentList](../../xsltargumentlist/) yang berisi argumen yang memenuhi kualifikasi namespace yang digunakan sebagai masukan untuk transformasi. |

### ReturnValue

Sebuah [XmlReader](../../../system.xml/xmlreader/) yang berisi hasil transformasi.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


Mengubah data XML dalam XPathNavigator menggunakan **args** yang ditentukan dan mengeluarkan hasilnya ke Stream.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::Stream> &output)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| masukan | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Sebuah XPathNavigator yang berisi data yang akan diubah. |
| args | const SharedPtr\<XsltArgumentList\>\& | Sebuah [XsltArgumentList](../../xsltargumentlist/) yang berisi argumen yang memenuhi kualifikasi namespace yang digunakan sebagai masukan untuk transformasi. |
| keluaran | const SharedPtr\<IO::Stream\>\& | Aliran tempat Anda ingin menuliskan output. |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Mengubah data XML dalam XPathNavigator menggunakan **args** yang ditentukan dan mengeluarkan hasilnya ke Stream.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::Stream> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| masukan | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Sebuah XPathNavigator yang berisi data yang akan diubah. |
| args | const SharedPtr\<XsltArgumentList\>\& | Sebuah [XsltArgumentList](../../xsltargumentlist/) yang berisi argumen yang memenuhi kualifikasi namespace yang digunakan sebagai masukan untuk transformasi. |
| keluaran | const SharedPtr\<IO::Stream\>\& | Aliran tempat Anda ingin menuliskan output. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Resolver [XmlResolver](../../../system.xml/xmlresolver/) yang digunakan untuk menyelesaikan fungsi XSLT **document()**. Jika ini **nullptr**, fungsi **document()** tidak diselesaikan. Resolver [XmlResolver](../../../system.xml/xmlresolver/) tidak di-cache setelah metode ini selesai. |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


Mengubah data XML dalam XPathNavigator menggunakan **args** yang ditentukan dan mengeluarkan hasilnya ke TextWriter.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::TextWriter> &output)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| masukan | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Sebuah XPathNavigator yang berisi data yang akan diubah. |
| args | const SharedPtr\<XsltArgumentList\>\& | Sebuah [XsltArgumentList](../../xsltargumentlist/) yang berisi argumen yang memenuhi kualifikasi namespace yang digunakan sebagai masukan untuk transformasi. |
| keluaran | const SharedPtr\<IO::TextWriter\>\& | TextWriter tempat Anda ingin menuliskan output. |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Mengubah data XML dalam XPathNavigator menggunakan **args** yang ditentukan dan mengeluarkan hasilnya ke TextWriter.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::TextWriter> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| masukan | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Sebuah XPathNavigator yang berisi data yang akan diubah. |
| args | const SharedPtr\<XsltArgumentList\>\& | Sebuah [XsltArgumentList](../../xsltargumentlist/) yang berisi argumen yang memenuhi kualifikasi namespace yang digunakan sebagai masukan untuk transformasi. |
| keluaran | const SharedPtr\<IO::TextWriter\>\& | TextWriter tempat Anda ingin menuliskan output. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Resolver [XmlResolver](../../../system.xml/xmlresolver/) yang digunakan untuk menyelesaikan fungsi XSLT **document()**. Jika ini **nullptr**, fungsi **document()** tidak diselesaikan. Resolver [XmlResolver](../../../system.xml/xmlresolver/) tidak di-cache setelah metode ini selesai. |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Mengubah data XML dalam XPathNavigator menggunakan **args** yang ditentukan dan menghasilkan output ke [XmlReader](../../../system.xml/xmlreader/).

```cpp
SharedPtr<XmlReader> System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| masukan | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Sebuah XPathNavigator yang berisi data yang akan diubah. |
| args | const SharedPtr\<XsltArgumentList\>\& | Sebuah [XsltArgumentList](../../xsltargumentlist/) yang berisi argumen yang memenuhi kualifikasi namespace yang digunakan sebagai masukan untuk transformasi. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Resolver [XmlResolver](../../../system.xml/xmlresolver/) yang digunakan untuk menyelesaikan fungsi XSLT **document()**. Jika ini **nullptr**, fungsi **document()** tidak diselesaikan. Resolver [XmlResolver](../../../system.xml/xmlresolver/) tidak di-cache setelah metode ini selesai. |

### ReturnValue

Sebuah [XmlReader](../../../system.xml/xmlreader/) yang berisi hasil transformasi.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


Mengubah data XML dalam XPathNavigator menggunakan args yang ditentukan dan menghasilkan output ke [XmlWriter](../../../system.xml/xmlwriter/).

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<XmlWriter> &output)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| masukan | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Sebuah XPathNavigator yang berisi data yang akan diubah. |
| args | const SharedPtr\<XsltArgumentList\>\& | Sebuah [XsltArgumentList](../../xsltargumentlist/) yang berisi argumen yang memenuhi kualifikasi namespace yang digunakan sebagai masukan untuk transformasi. |
| output | const SharedPtr\<XmlWriter\>\& | [XmlWriter](../../../system.xml/xmlwriter/) tempat Anda ingin menuliskan output. |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Mengubah data XML dalam XPathNavigator menggunakan args yang ditentukan dan menghasilkan output ke [XmlWriter](../../../system.xml/xmlwriter/).

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<XmlWriter> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| masukan | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Sebuah XPathNavigator yang berisi data yang akan diubah. |
| args | const SharedPtr\<XsltArgumentList\>\& | Sebuah [XsltArgumentList](../../xsltargumentlist/) yang berisi argumen yang memenuhi kualifikasi namespace yang digunakan sebagai masukan untuk transformasi. |
| output | const SharedPtr\<XmlWriter\>\& | [XmlWriter](../../../system.xml/xmlwriter/) tempat Anda ingin menuliskan output. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Resolver [XmlResolver](../../../system.xml/xmlresolver/) yang digunakan untuk menyelesaikan fungsi XSLT **document()**. Jika ini **nullptr**, fungsi **document()** tidak diselesaikan. Resolver [XmlResolver](../../../system.xml/xmlresolver/) tidak di-cache setelah metode ini selesai. |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const String\&, const String\&) method


Mengubah data XML dalam file masukan dan mengeluarkan hasilnya ke file keluaran.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const String &inputfile, const String &outputfile)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| inputfile | const String\& | URL dokumen sumber yang akan diubah. |
| outputfile | const String\& | URL berkas output. |

## Lihat Juga

* Class [String](../../../system/string/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const String\&, const String\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Mengubah data XML dalam file masukan dan mengeluarkan hasilnya ke file keluaran.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const String &inputfile, const String &outputfile, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| inputfile | const String\& | URL dokumen sumber yang akan diubah. |
| outputfile | const String\& | URL berkas output. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Resolver [XmlResolver](../../../system.xml/xmlresolver/) yang digunakan untuk menyelesaikan fungsi XSLT **document()**. Jika ini **nullptr**, fungsi **document()** tidak diselesaikan. Resolver [XmlResolver](../../../system.xml/xmlresolver/) tidak di-cache setelah metode [XslTransform::Transform](./) selesai. |

## Lihat Juga

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
