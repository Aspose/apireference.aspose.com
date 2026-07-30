---
title: "System::Xml::Xsl::XslTransform::Transform yöntemi"
linktitle: "Dönüştürme"
second_title: "Aspose.Font için C++"
description: "System::Xml::Xsl::XslTransform::Transform yöntemi. Belirtilen **args** kullanılarak IXPathNavigable içindeki XML verisini dönüştürür ve sonucu C++'ta bir XmlReader'a yazar."
type: docs
weight: 400
url: /tr/cpp/system.xml.xsl/xsltransform/transform/
---
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&) method


Belirtilen **args** kullanılarak IXPathNavigable içindeki XML verisini dönüştürür ve sonucu bir [XmlReader](../../../system.xml/xmlreader/) aracılığıyla yazar.

```cpp
SharedPtr<XmlReader> System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable arayüzünü uygulayan bir nesne. Bu, bir [XmlNode](../../../system.xml/xmlnode/) (genellikle bir [XmlDocument](../../../system.xml/xmldocument/)) ya da dönüştürülecek verileri içeren bir XPathDocument olabilir. |
| args | const SharedPtr\<XsltArgumentList\>\& | Dönüşüm için girdi olarak kullanılan, ad alanı nitelikli argümanları içeren bir [XsltArgumentList](../../xsltargumentlist/). |

### ReturnValue

Dönüşüm sonuçlarını içeren bir [XmlReader](../../../system.xml/xmlreader/).

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


IXPathNavigable içindeki XML verilerini belirtilen **args** kullanarak dönüştürür ve sonucu bir Stream'e yazar.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::Stream> &output)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable arayüzünü uygulayan bir nesne. Bu, bir [XmlNode](../../../system.xml/xmlnode/) (genellikle bir [XmlDocument](../../../system.xml/xmldocument/)) ya da dönüştürülecek verileri içeren bir XPathDocument olabilir. |
| args | const SharedPtr\<XsltArgumentList\>\& | Dönüşüm için girdi olarak kullanılan, ad alanı nitelikli argümanları içeren bir [XsltArgumentList](../../xsltargumentlist/). |
| çıktı | const SharedPtr\<IO::Stream\>\& | Çıktı vermek istediğiniz akış. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


IXPathNavigable içindeki XML verilerini belirtilen **args** kullanarak dönüştürür ve sonucu bir Stream'e yazar.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::Stream> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable arayüzünü uygulayan bir nesne. Bu, bir [XmlNode](../../../system.xml/xmlnode/) (genellikle bir [XmlDocument](../../../system.xml/xmldocument/)) ya da dönüştürülecek verileri içeren bir XPathDocument olabilir. |
| args | const SharedPtr\<XsltArgumentList\>\& | Dönüşüm için girdi olarak kullanılan, ad alanı nitelikli argümanları içeren bir [XsltArgumentList](../../xsltargumentlist/). |
| çıktı | const SharedPtr\<IO::Stream\>\& | Çıktı vermek istediğiniz akış. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | [XmlResolver](../../../system.xml/xmlresolver/), XSLT **document()** işlevini çözmek için kullanılır. Bu **nullptr** ise, **document()** işlevi çözülmez. [XmlResolver](../../../system.xml/xmlresolver/), [XslTransform::Transform](./) yöntemi tamamlandıktan sonra önbelleğe alınmaz. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


IXPathNavigable içindeki XML verilerini belirtilen **args** kullanarak dönüştürür ve sonucu bir TextWriter'a yazar.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::TextWriter> &output)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable arayüzünü uygulayan bir nesne. Bu, bir [XmlNode](../../../system.xml/xmlnode/) (genellikle bir [XmlDocument](../../../system.xml/xmldocument/)) ya da dönüştürülecek verileri içeren bir XPathDocument olabilir. |
| args | const SharedPtr\<XsltArgumentList\>\& | Dönüşüm için girdi olarak kullanılan, ad alanı nitelikli argümanları içeren bir [XsltArgumentList](../../xsltargumentlist/). |
| çıktı | const SharedPtr\<IO::TextWriter\>\& | Çıktı vermek istediğiniz TextWriter. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


IXPathNavigable içindeki XML verilerini belirtilen **args** kullanarak dönüştürür ve sonucu bir TextWriter'a yazar.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::TextWriter> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable arayüzünü uygulayan bir nesne. Bu, bir [XmlNode](../../../system.xml/xmlnode/) (genellikle bir [XmlDocument](../../../system.xml/xmldocument/)) ya da dönüştürülecek verileri içeren bir XPathDocument olabilir. |
| args | const SharedPtr\<XsltArgumentList\>\& | Dönüşüm için girdi olarak kullanılan, ad alanı nitelikli argümanları içeren bir [XsltArgumentList](../../xsltargumentlist/). |
| çıktı | const SharedPtr\<IO::TextWriter\>\& | Çıktı vermek istediğiniz TextWriter. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | [XmlResolver](../../../system.xml/xmlresolver/), XSLT **document()** işlevini çözmek için kullanılır. Bu **nullptr** ise, **document()** işlevi çözülmez. [XmlResolver](../../../system.xml/xmlresolver/), bu yöntem tamamlandıktan sonra önbelleğe alınmaz. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Belirtilen **args** kullanılarak IXPathNavigable içindeki XML verisini dönüştürür ve sonucu bir [XmlReader](../../../system.xml/xmlreader/) aracılığıyla yazar.

```cpp
SharedPtr<XmlReader> System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable arayüzünü uygulayan bir nesne. Bu, bir [XmlNode](../../../system.xml/xmlnode/) (genellikle bir [XmlDocument](../../../system.xml/xmldocument/)) ya da dönüştürülecek verileri içeren bir XPathDocument olabilir. |
| args | const SharedPtr\<XsltArgumentList\>\& | Dönüşüm için girdi olarak kullanılan, ad alanı nitelikli argümanları içeren bir [XsltArgumentList](../../xsltargumentlist/). |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | [XmlResolver](../../../system.xml/xmlresolver/), XSLT **document()** işlevini çözmek için kullanılır. Bu **nullptr** ise, **document()** işlevi çözülmez. [XmlResolver](../../../system.xml/xmlresolver/), bu yöntem tamamlandıktan sonra önbelleğe alınmaz. |

### ReturnValue

Dönüşüm sonuçlarını içeren bir [XmlReader](../../../system.xml/xmlreader/).

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


Belirtilen **args** kullanılarak IXPathNavigable içindeki XML verisini dönüştürür ve sonucu bir [XmlWriter](../../../system.xml/xmlwriter/) aracılığıyla yazar.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<XmlWriter> &output)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable arayüzünü uygulayan bir nesne. Bu, bir [XmlNode](../../../system.xml/xmlnode/) (genellikle bir [XmlDocument](../../../system.xml/xmldocument/)) ya da dönüştürülecek verileri içeren bir XPathDocument olabilir. |
| args | const SharedPtr\<XsltArgumentList\>\& | Dönüşüm için girdi olarak kullanılan, ad alanı nitelikli argümanları içeren bir [XsltArgumentList](../../xsltargumentlist/). |
| output | const SharedPtr\<XmlWriter\>\& | Çıktı vermek istediğiniz [XmlWriter](../../../system.xml/xmlwriter/). |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Belirtilen **args** kullanılarak IXPathNavigable içindeki XML verisini dönüştürür ve sonucu bir [XmlWriter](../../../system.xml/xmlwriter/) aracılığıyla yazar.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<XmlWriter> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable arayüzünü uygulayan bir nesne. Bu, bir [XmlNode](../../../system.xml/xmlnode/) (genellikle bir [XmlDocument](../../../system.xml/xmldocument/)) ya da dönüştürülecek verileri içeren bir XPathDocument olabilir. |
| args | const SharedPtr\<XsltArgumentList\>\& | Dönüşüm için girdi olarak kullanılan, ad alanı nitelikli argümanları içeren bir [XsltArgumentList](../../xsltargumentlist/). |
| output | const SharedPtr\<XmlWriter\>\& | Çıktı vermek istediğiniz [XmlWriter](../../../system.xml/xmlwriter/). |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | [XmlResolver](../../../system.xml/xmlresolver/), XSLT **document()** işlevini çözmek için kullanılır. Bu **nullptr** ise, **document()** işlevi çözülmez. [XmlResolver](../../../system.xml/xmlresolver/), bu yöntem tamamlandıktan sonra önbelleğe alınmaz. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&) method


Belirtilen **args** kullanılarak XPathNavigator içindeki XML verisini dönüştürür ve sonucu bir [XmlReader](../../../system.xml/xmlreader/) aracılığıyla yazar.

```cpp
SharedPtr<XmlReader> System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| girdi | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Dönüştürülecek verileri içeren bir XPathNavigator. |
| args | const SharedPtr\<XsltArgumentList\>\& | Dönüşüm için girdi olarak kullanılan, ad alanı nitelikli argümanları içeren bir [XsltArgumentList](../../xsltargumentlist/). |

### ReturnValue

Dönüşüm sonuçlarını içeren bir [XmlReader](../../../system.xml/xmlreader/).

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


XPathNavigator içindeki XML verilerini belirtilen **args** kullanarak dönüştürür ve sonucu bir Stream'e yazar.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::Stream> &output)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| girdi | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Dönüştürülecek verileri içeren bir XPathNavigator. |
| args | const SharedPtr\<XsltArgumentList\>\& | Dönüşüm için girdi olarak kullanılan, ad alanı nitelikli argümanları içeren bir [XsltArgumentList](../../xsltargumentlist/). |
| çıktı | const SharedPtr\<IO::Stream\>\& | Çıktı vermek istediğiniz akış. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


XPathNavigator içindeki XML verilerini belirtilen **args** kullanarak dönüştürür ve sonucu bir Stream'e yazar.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::Stream> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| girdi | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Dönüştürülecek verileri içeren bir XPathNavigator. |
| args | const SharedPtr\<XsltArgumentList\>\& | Dönüşüm için girdi olarak kullanılan, ad alanı nitelikli argümanları içeren bir [XsltArgumentList](../../xsltargumentlist/). |
| çıktı | const SharedPtr\<IO::Stream\>\& | Çıktı vermek istediğiniz akış. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | [XmlResolver](../../../system.xml/xmlresolver/), XSLT **document()** işlevini çözmek için kullanılır. Bu **nullptr** ise, **document()** işlevi çözülmez. [XmlResolver](../../../system.xml/xmlresolver/), bu yöntem tamamlandıktan sonra önbelleğe alınmaz. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


XPathNavigator içindeki XML verilerini belirtilen **args** kullanarak dönüştürür ve sonucu bir TextWriter'a yazar.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::TextWriter> &output)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| girdi | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Dönüştürülecek verileri içeren bir XPathNavigator. |
| args | const SharedPtr\<XsltArgumentList\>\& | Dönüşüm için girdi olarak kullanılan, ad alanı nitelikli argümanları içeren bir [XsltArgumentList](../../xsltargumentlist/). |
| çıktı | const SharedPtr\<IO::TextWriter\>\& | Çıktı vermek istediğiniz TextWriter. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


XPathNavigator içindeki XML verilerini belirtilen **args** kullanarak dönüştürür ve sonucu bir TextWriter'a yazar.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::TextWriter> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| girdi | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Dönüştürülecek verileri içeren bir XPathNavigator. |
| args | const SharedPtr\<XsltArgumentList\>\& | Dönüşüm için girdi olarak kullanılan, ad alanı nitelikli argümanları içeren bir [XsltArgumentList](../../xsltargumentlist/). |
| çıktı | const SharedPtr\<IO::TextWriter\>\& | Çıktı vermek istediğiniz TextWriter. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | [XmlResolver](../../../system.xml/xmlresolver/), XSLT **document()** işlevini çözmek için kullanılır. Bu **nullptr** ise, **document()** işlevi çözülmez. [XmlResolver](../../../system.xml/xmlresolver/), bu yöntem tamamlandıktan sonra önbelleğe alınmaz. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Belirtilen **args** kullanılarak XPathNavigator içindeki XML verisini dönüştürür ve sonucu bir [XmlReader](../../../system.xml/xmlreader/) aracılığıyla yazar.

```cpp
SharedPtr<XmlReader> System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| girdi | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Dönüştürülecek verileri içeren bir XPathNavigator. |
| args | const SharedPtr\<XsltArgumentList\>\& | Dönüşüm için girdi olarak kullanılan, ad alanı nitelikli argümanları içeren bir [XsltArgumentList](../../xsltargumentlist/). |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | [XmlResolver](../../../system.xml/xmlresolver/), XSLT **document()** işlevini çözmek için kullanılır. Bu **nullptr** ise, **document()** işlevi çözülmez. [XmlResolver](../../../system.xml/xmlresolver/), bu yöntem tamamlandıktan sonra önbelleğe alınmaz. |

### ReturnValue

Dönüşüm sonuçlarını içeren bir [XmlReader](../../../system.xml/xmlreader/).

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


Belirtilen args kullanılarak XPathNavigator içindeki XML verisini dönüştürür ve sonucu bir [XmlWriter](../../../system.xml/xmlwriter/) aracılığıyla yazar.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<XmlWriter> &output)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| girdi | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Dönüştürülecek verileri içeren bir XPathNavigator. |
| args | const SharedPtr\<XsltArgumentList\>\& | Dönüşüm için girdi olarak kullanılan, ad alanı nitelikli argümanları içeren bir [XsltArgumentList](../../xsltargumentlist/). |
| output | const SharedPtr\<XmlWriter\>\& | Çıktı vermek istediğiniz [XmlWriter](../../../system.xml/xmlwriter/). |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Belirtilen args kullanılarak XPathNavigator içindeki XML verisini dönüştürür ve sonucu bir [XmlWriter](../../../system.xml/xmlwriter/) aracılığıyla yazar.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<XmlWriter> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| girdi | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Dönüştürülecek verileri içeren bir XPathNavigator. |
| args | const SharedPtr\<XsltArgumentList\>\& | Dönüşüm için girdi olarak kullanılan, ad alanı nitelikli argümanları içeren bir [XsltArgumentList](../../xsltargumentlist/). |
| output | const SharedPtr\<XmlWriter\>\& | Çıktı vermek istediğiniz [XmlWriter](../../../system.xml/xmlwriter/). |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | [XmlResolver](../../../system.xml/xmlresolver/), XSLT **document()** işlevini çözmek için kullanılır. Bu **nullptr** ise, **document()** işlevi çözülmez. [XmlResolver](../../../system.xml/xmlresolver/), bu yöntem tamamlandıktan sonra önbelleğe alınmaz. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const String\&, const String\&) method


Girdi dosyasındaki XML verilerini dönüştürür ve sonucu bir çıktı dosyasına yazar.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const String &inputfile, const String &outputfile)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| inputfile | const String\& | Dönüştürülecek kaynak belgenin URL'si. |
| outputfile | const String\& | Çıktı dosyasının URL'si. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const String\&, const String\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Girdi dosyasındaki XML verilerini dönüştürür ve sonucu bir çıktı dosyasına yazar.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const String &inputfile, const String &outputfile, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| inputfile | const String\& | Dönüştürülecek kaynak belgenin URL'si. |
| outputfile | const String\& | Çıktı dosyasının URL'si. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | [XmlResolver](../../../system.xml/xmlresolver/), XSLT **document()** işlevini çözmek için kullanılır. Bu **nullptr** ise, **document()** işlevi çözülmez. [XmlResolver](../../../system.xml/xmlresolver/), [XslTransform::Transform](./) yöntemi tamamlandıktan sonra önbelleğe alınmaz. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
