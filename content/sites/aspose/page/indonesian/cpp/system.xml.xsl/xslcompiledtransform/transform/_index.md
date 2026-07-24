---
title: "System::Xml::Xsl::XslCompiledTransform::Transform method"
linktitle: "Transform"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::Xsl::XslCompiledTransform::Transform method. Menjalankan transformasi menggunakan dokumen input yang ditentukan oleh objek IXPathNavigable dan menghasilkan hasil ke XmlWriter dalam C++."
type: docs
weight: 400
url: /id/cpp/system.xml.xsl/xslcompiledtransform/transform/
---
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XmlWriter\>\&) method


Menjalankan transformasi menggunakan dokumen input yang ditentukan oleh objek IXPathNavigable dan menghasilkan hasil ke [XmlWriter](../../../system.xml/xmlwriter/).

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XmlWriter> &results)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Sebuah objek yang mengimplementasikan antarmuka IXPathNavigable. Itu dapat berupa [XmlNode](../../../system.xml/xmlnode/) (biasanya [XmlDocument](../../../system.xml/xmldocument/)), atau XPathDocument yang berisi data yang akan diubah. |
| results | const SharedPtr\<XmlWriter\>\& | [XmlWriter](../../../system.xml/xmlwriter/) yang ingin Anda outputkan. Jika lembar gaya berisi elemen **xsl:output**, Anda harus membuat [XmlWriter](../../../system.xml/xmlwriter/) menggunakan objek [XmlWriterSettings](../../../system.xml/xmlwritersettings/) yang dikembalikan dari nilai [XslCompiledTransform::get_OutputSettings](../get_outputsettings/). Ini memastikan bahwa [XmlWriter](../../../system.xml/xmlwriter/) memiliki pengaturan output yang benar. |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


Menjalankan transformasi menggunakan dokumen input yang ditentukan oleh objek IXPathNavigable dan menghasilkan hasil ke aliran. [XsltArgumentList](../../xsltargumentlist/) menyediakan argumen runtime tambahan.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::Stream> &results)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Sebuah objek yang mengimplementasikan antarmuka IXPathNavigable. Itu dapat berupa [XmlNode](../../../system.xml/xmlnode/) (biasanya [XmlDocument](../../../system.xml/xmldocument/)), atau XPathDocument yang berisi data yang akan diubah. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Sebuah [XsltArgumentList](../../xsltargumentlist/) yang berisi argumen yang memenuhi namespace yang digunakan sebagai input untuk transformasi. Nilai ini dapat berupa **nullptr**. |
| results | const SharedPtr\<IO::Stream\>\& | Aliran tempat Anda ingin menuliskan output. |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


Menjalankan transformasi menggunakan dokumen input yang ditentukan oleh objek IXPathNavigable dan menghasilkan hasil ke TextWriter. [XsltArgumentList](../../xsltargumentlist/) menyediakan argumen run-time tambahan.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::TextWriter> &results)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Sebuah objek yang mengimplementasikan antarmuka IXPathNavigable. Itu dapat berupa [XmlNode](../../../system.xml/xmlnode/) (biasanya [XmlDocument](../../../system.xml/xmldocument/)), atau XPathDocument yang berisi data yang akan diubah. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Sebuah [XsltArgumentList](../../xsltargumentlist/) yang berisi argumen yang memenuhi namespace yang digunakan sebagai input untuk transformasi. Nilai ini dapat berupa **nullptr**. |
| results | const SharedPtr\<IO::TextWriter\>\& | TextWriter tempat Anda ingin menuliskan output. |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


Menjalankan transformasi menggunakan dokumen input yang ditentukan oleh objek IXPathNavigable dan menghasilkan hasil ke [XmlWriter](../../../system.xml/xmlwriter/). [XsltArgumentList](../../xsltargumentlist/) menyediakan argumen run-time tambahan.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Sebuah objek yang mengimplementasikan antarmuka IXPathNavigable. Itu dapat berupa [XmlNode](../../../system.xml/xmlnode/) (biasanya [XmlDocument](../../../system.xml/xmldocument/)), atau XPathDocument yang berisi data yang akan diubah. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Sebuah [XsltArgumentList](../../xsltargumentlist/) yang berisi argumen yang memenuhi namespace yang digunakan sebagai input untuk transformasi. Nilai ini dapat berupa **nullptr**. |
| results | const SharedPtr\<XmlWriter\>\& | [XmlWriter](../../../system.xml/xmlwriter/) yang ingin Anda outputkan. Jika lembar gaya berisi elemen **xsl:output**, Anda harus membuat [XmlWriter](../../../system.xml/xmlwriter/) menggunakan objek [XmlWriterSettings](../../../system.xml/xmlwritersettings/) yang dikembalikan dari nilai [XslCompiledTransform::get_OutputSettings](../get_outputsettings/). Ini memastikan bahwa [XmlWriter](../../../system.xml/xmlwriter/) memiliki pengaturan output yang benar. |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<XmlResolver\>\&) method


Menjalankan transformasi dengan menggunakan dokumen input yang ditentukan oleh objek IXPathNavigable dan menghasilkan hasil ke [XmlWriter](../../../system.xml/xmlwriter/). [XsltArgumentList](../../xsltargumentlist/) menyediakan argumen run-time tambahan dan [XmlResolver](../../../system.xml/xmlresolver/) menyelesaikan fungsi XSLT **document()**.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results, const SharedPtr<XmlResolver> &documentResolver)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| masukan | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Dokumen yang akan diubah yang ditentukan oleh objek IXPathNavigable. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Daftar argumen sebagai [XsltArgumentList](../../xsltargumentlist/). |
| results | const SharedPtr\<XmlWriter\>\& | Yang [XmlWriter](../../../system.xml/xmlwriter/) ingin Anda outputkan. Jika lembar gaya berisi elemen **xsl:output**, Anda harus membuat [XmlWriter](../../../system.xml/xmlwriter/) dengan menggunakan objek [XmlWriterSettings](../../../system.xml/xmlwritersettings/) yang dikembalikan dari nilai [XslCompiledTransform::get_OutputSettings](../get_outputsettings/). Ini memastikan bahwa [XmlWriter](../../../system.xml/xmlwriter/) memiliki pengaturan output yang benar. |
| documentResolver | const SharedPtr\<XmlResolver\>\& | Yang [XmlResolver](../../../system.xml/xmlresolver/) digunakan untuk menyelesaikan fungsi XSLT **document()**. Jika ini **nullptr**, fungsi **document()** tidak diselesaikan. |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XmlWriter\>\&) method


Menjalankan transformasi menggunakan dokumen input yang ditentukan oleh objek [XmlReader](../../../system.xml/xmlreader/) dan menghasilkan hasil ke sebuah [XmlWriter](../../../system.xml/xmlwriter/).

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XmlWriter> &results)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | [XmlReader](../../../system.xml/xmlreader/) yang berisi dokumen input. |
| results | const SharedPtr\<XmlWriter\>\& | [XmlWriter](../../../system.xml/xmlwriter/) yang ingin Anda outputkan. Jika lembar gaya berisi elemen **xsl:output**, Anda harus membuat [XmlWriter](../../../system.xml/xmlwriter/) menggunakan objek [XmlWriterSettings](../../../system.xml/xmlwritersettings/) yang dikembalikan dari nilai [XslCompiledTransform::get_OutputSettings](../get_outputsettings/). Ini memastikan bahwa [XmlWriter](../../../system.xml/xmlwriter/) memiliki pengaturan output yang benar. |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


Menjalankan transformasi menggunakan dokumen input yang ditentukan oleh objek [XmlReader](../../../system.xml/xmlreader/) dan menghasilkan hasil ke aliran. [XsltArgumentList](../../xsltargumentlist/) menyediakan argumen waktu jalan tambahan.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::Stream> &results)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | Sebuah [XmlReader](../../../system.xml/xmlreader/) yang berisi dokumen input. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Sebuah [XsltArgumentList](../../xsltargumentlist/) yang berisi argumen yang memenuhi namespace yang digunakan sebagai input untuk transformasi. Nilai ini dapat berupa **nullptr**. |
| results | const SharedPtr\<IO::Stream\>\& | Aliran tempat Anda ingin menuliskan output. |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


Menjalankan transformasi menggunakan dokumen input yang ditentukan oleh objek [XmlReader](../../../system.xml/xmlreader/) dan menghasilkan hasil ke TextWriter. [XsltArgumentList](../../xsltargumentlist/) menyediakan argumen waktu jalan tambahan.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::TextWriter> &results)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | Sebuah [XmlReader](../../../system.xml/xmlreader/) yang berisi dokumen input. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Sebuah [XsltArgumentList](../../xsltargumentlist/) yang berisi argumen yang memenuhi namespace yang digunakan sebagai input untuk transformasi. Nilai ini dapat berupa **nullptr**. |
| results | const SharedPtr\<IO::TextWriter\>\& | TextWriter tempat Anda ingin menuliskan output. |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


Menjalankan transformasi menggunakan dokumen input yang ditentukan oleh objek [XmlReader](../../../system.xml/xmlreader/) dan menghasilkan hasil ke sebuah [XmlWriter](../../../system.xml/xmlwriter/). [XsltArgumentList](../../xsltargumentlist/) menyediakan argumen waktu jalan tambahan.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | Sebuah [XmlReader](../../../system.xml/xmlreader/) yang berisi dokumen input. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Sebuah [XsltArgumentList](../../xsltargumentlist/) yang berisi argumen yang memenuhi namespace yang digunakan sebagai input untuk transformasi. Nilai ini dapat berupa **nullptr**. |
| results | const SharedPtr\<XmlWriter\>\& | [XmlWriter](../../../system.xml/xmlwriter/) yang ingin Anda outputkan. Jika lembar gaya berisi elemen **xsl:output**, Anda harus membuat [XmlWriter](../../../system.xml/xmlwriter/) menggunakan objek [XmlWriterSettings](../../../system.xml/xmlwritersettings/) yang dikembalikan dari nilai [XslCompiledTransform::get_OutputSettings](../get_outputsettings/). Ini memastikan bahwa [XmlWriter](../../../system.xml/xmlwriter/) memiliki pengaturan output yang benar. |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<XmlResolver\>\&) method


Menjalankan transformasi menggunakan dokumen input yang ditentukan oleh objek [XmlReader](../../../system.xml/xmlreader/) dan menghasilkan hasil ke sebuah [XmlWriter](../../../system.xml/xmlwriter/). [XsltArgumentList](../../xsltargumentlist/) menyediakan argumen waktu jalan tambahan dan [XmlResolver](../../../system.xml/xmlresolver/) menyelesaikan fungsi XSLT **document()**.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results, const SharedPtr<XmlResolver> &documentResolver)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | Sebuah [XmlReader](../../../system.xml/xmlreader/) yang berisi dokumen input. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Sebuah [XsltArgumentList](../../xsltargumentlist/) yang berisi argumen yang memenuhi namespace yang digunakan sebagai input untuk transformasi. Nilai ini dapat berupa **nullptr**. |
| results | const SharedPtr\<XmlWriter\>\& | [XmlWriter](../../../system.xml/xmlwriter/) yang ingin Anda outputkan. Jika lembar gaya berisi elemen **xsl:output**, Anda harus membuat [XmlWriter](../../../system.xml/xmlwriter/) menggunakan objek [XmlWriterSettings](../../../system.xml/xmlwritersettings/) yang dikembalikan dari nilai [XslCompiledTransform::get_OutputSettings](../get_outputsettings/). Ini memastikan bahwa [XmlWriter](../../../system.xml/xmlwriter/) memiliki pengaturan output yang benar. |
| documentResolver | const SharedPtr\<XmlResolver\>\& | Yang [XmlResolver](../../../system.xml/xmlresolver/) digunakan untuk menyelesaikan fungsi XSLT **document()**. Jika ini **nullptr**, fungsi **document()** tidak diselesaikan. |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const SharedPtr\<XmlWriter\>\&) method


Menjalankan transformasi menggunakan dokumen input yang ditentukan oleh URI dan menghasilkan hasil ke sebuah [XmlWriter](../../../system.xml/xmlwriter/).

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const SharedPtr<XmlWriter> &results)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| inputUri | const String\& | URI dokumen input. |
| results | const SharedPtr\<XmlWriter\>\& | [XmlWriter](../../../system.xml/xmlwriter/) yang ingin Anda outputkan. Jika lembar gaya berisi elemen **xsl:output**, Anda harus membuat [XmlWriter](../../../system.xml/xmlwriter/) menggunakan objek [XmlWriterSettings](../../../system.xml/xmlwritersettings/) yang dikembalikan dari nilai [XslCompiledTransform::get_OutputSettings](../get_outputsettings/). Ini memastikan bahwa [XmlWriter](../../../system.xml/xmlwriter/) memiliki pengaturan output yang benar. |

## Lihat Juga

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


Menjalankan transformasi menggunakan dokumen input yang ditentukan oleh URI dan menghasilkan hasil ke aliran. [XsltArgumentList](../../xsltargumentlist/) menyediakan argumen waktu jalan tambahan.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::Stream> &results)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| inputUri | const String\& | URI dokumen input. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Sebuah [XsltArgumentList](../../xsltargumentlist/) yang berisi argumen yang memenuhi namespace yang digunakan sebagai input untuk transformasi. Nilai ini dapat berupa **nullptr**. |
| results | const SharedPtr\<IO::Stream\>\& | Aliran tempat Anda ingin menuliskan output. |

## Lihat Juga

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


Menjalankan transformasi menggunakan dokumen masukan yang ditentukan oleh URI dan menghasilkan hasil ke TextWriter.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::TextWriter> &results)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| inputUri | const String\& | URI dokumen input. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Sebuah [XsltArgumentList](../../xsltargumentlist/) yang berisi argumen yang memenuhi namespace yang digunakan sebagai input untuk transformasi. Nilai ini dapat berupa **nullptr**. |
| results | const SharedPtr\<IO::TextWriter\>\& | TextWriter tempat Anda ingin menuliskan output. |

## Lihat Juga

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


Menjalankan transformasi menggunakan dokumen input yang ditentukan oleh URI dan menghasilkan hasil ke sebuah [XmlWriter](../../../system.xml/xmlwriter/). [XsltArgumentList](../../xsltargumentlist/) menyediakan argumen waktu jalan tambahan.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| inputUri | const String\& | URI dokumen input. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Sebuah [XsltArgumentList](../../xsltargumentlist/) yang berisi argumen yang memenuhi namespace yang digunakan sebagai input untuk transformasi. Nilai ini dapat berupa **nullptr**. |
| results | const SharedPtr\<XmlWriter\>\& | [XmlWriter](../../../system.xml/xmlwriter/) yang ingin Anda outputkan. Jika lembar gaya berisi elemen **xsl:output**, Anda harus membuat [XmlWriter](../../../system.xml/xmlwriter/) menggunakan objek [XmlWriterSettings](../../../system.xml/xmlwritersettings/) yang dikembalikan dari nilai [XslCompiledTransform::get_OutputSettings](../get_outputsettings/). Ini memastikan bahwa [XmlWriter](../../../system.xml/xmlwriter/) memiliki pengaturan output yang benar. |

## Lihat Juga

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const String\&) method


Menjalankan transformasi menggunakan dokumen masukan yang ditentukan oleh URI dan menghasilkan hasil ke berkas.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const String &resultsFile)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| inputUri | const String\& | URI dokumen input. |
| resultsFile | const String\& | URI berkas output. |

## Lihat Juga

* Class [String](../../../system/string/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
