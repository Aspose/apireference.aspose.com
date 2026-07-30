---
title: "System::Xml::Xsl::XslCompiledTransform::Transform metodu"
linktitle: "Dönüştürme"
second_title: "Aspose.Font için C++"
description: "System::Xml::Xsl::XslCompiledTransform::Transform metodu. IXPathNavigable nesnesi tarafından belirtilen girdi belgesini kullanarak dönüşümü yürütür ve sonuçları C++'da bir XmlWriter'a yazar."
type: docs
weight: 400
url: /tr/cpp/system.xml.xsl/xslcompiledtransform/transform/
---
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XmlWriter\>\&) method


IXPathNavigable nesnesi tarafından belirtilen girdi belgesini kullanarak dönüşümü yürütür ve sonuçları bir [XmlWriter](../../../system.xml/xmlwriter/)'a yazar.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XmlWriter> &results)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable arayüzünü uygulayan bir nesne. Bu, bir [XmlNode](../../../system.xml/xmlnode/) (genellikle bir [XmlDocument](../../../system.xml/xmldocument/)) ya da dönüştürülecek verileri içeren bir XPathDocument olabilir. |
| results | const SharedPtr\<XmlWriter\>\& | Çıktıyı vermek istediğiniz [XmlWriter](../../../system.xml/xmlwriter/). Stil sayfası bir **xsl:output** öğesi içeriyorsa, [XmlWriter](../../../system.xml/xmlwriter/)'ı [XmlWriterSettings](../../../system.xml/xmlwritersettings/) nesnesini kullanarak, [XslCompiledTransform::get_OutputSettings](../get_outputsettings/) değerinden dönen nesneyle oluşturmalısınız. Bu, [XmlWriter](../../../system.xml/xmlwriter/)'ın doğru çıktı ayarlarına sahip olmasını sağlar. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


IXPathNavigable nesnesi tarafından belirtilen girdi belgesini kullanarak dönüşümü yürütür ve sonuçları bir akıma (stream) yazar. [XsltArgumentList](../../xsltargumentlist/) ek çalışma zamanı argümanları sağlar.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::Stream> &results)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable arayüzünü uygulayan bir nesne. Bu, bir [XmlNode](../../../system.xml/xmlnode/) (genellikle bir [XmlDocument](../../../system.xml/xmldocument/)) ya da dönüştürülecek verileri içeren bir XPathDocument olabilir. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Dönüşüme girdi olarak kullanılan, ad alanı ile nitelendirilmiş argümanları içeren bir [XsltArgumentList](../../xsltargumentlist/). Bu değer **nullptr** olabilir. |
| sonuçlar | const SharedPtr\<IO::Stream\>\& | Çıktı vermek istediğiniz akış. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


IXPathNavigable nesnesi tarafından belirtilen girdi belgesini kullanarak dönüşümü yürütür ve sonuçları bir TextWriter'a yazar. [XsltArgumentList](../../xsltargumentlist/) ek çalışma zamanı argümanları sağlar.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::TextWriter> &results)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable arayüzünü uygulayan bir nesne. Bu, bir [XmlNode](../../../system.xml/xmlnode/) (genellikle bir [XmlDocument](../../../system.xml/xmldocument/)) ya da dönüştürülecek verileri içeren bir XPathDocument olabilir. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Dönüşüme girdi olarak kullanılan, ad alanı ile nitelendirilmiş argümanları içeren bir [XsltArgumentList](../../xsltargumentlist/). Bu değer **nullptr** olabilir. |
| sonuçlar | const SharedPtr\<IO::TextWriter\>\& | Çıktı vermek istediğiniz TextWriter. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


IXPathNavigable nesnesi tarafından belirtilen girdi belgesini kullanarak dönüşümü yürütür ve sonuçları bir [XmlWriter](../../../system.xml/xmlwriter/)'a yazar. [XsltArgumentList](../../xsltargumentlist/) ek çalışma zamanı argümanları sağlar.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable arayüzünü uygulayan bir nesne. Bu, bir [XmlNode](../../../system.xml/xmlnode/) (genellikle bir [XmlDocument](../../../system.xml/xmldocument/)) ya da dönüştürülecek verileri içeren bir XPathDocument olabilir. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Dönüşüme girdi olarak kullanılan, ad alanı ile nitelendirilmiş argümanları içeren bir [XsltArgumentList](../../xsltargumentlist/). Bu değer **nullptr** olabilir. |
| results | const SharedPtr\<XmlWriter\>\& | Çıktıyı vermek istediğiniz [XmlWriter](../../../system.xml/xmlwriter/). Stil sayfası bir **xsl:output** öğesi içeriyorsa, [XmlWriter](../../../system.xml/xmlwriter/)'ı [XmlWriterSettings](../../../system.xml/xmlwritersettings/) nesnesini kullanarak, [XslCompiledTransform::get_OutputSettings](../get_outputsettings/) değerinden dönen nesneyle oluşturmalısınız. Bu, [XmlWriter](../../../system.xml/xmlwriter/)'ın doğru çıktı ayarlarına sahip olmasını sağlar. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<XmlResolver\>\&) method


IXPathNavigable nesnesi tarafından belirtilen giriş belgesini kullanarak dönüşümü yürütür ve sonuçları bir [XmlWriter](../../../system.xml/xmlwriter/)'a çıkarır. [XsltArgumentList](../../xsltargumentlist/) ek çalışma zamanı argümanları sağlar ve [XmlResolver](../../../system.xml/xmlresolver/) XSLT **document()** işlevini çözer.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results, const SharedPtr<XmlResolver> &documentResolver)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| girdi | const SharedPtr\\<System::Xml::XPath::IXPathNavigable\\>\\& | IXPathNavigable nesnesi tarafından belirtilen dönüştürülecek belge. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | [XsltArgumentList](../../xsltargumentlist/) olarak argüman listesi. |
| results | const SharedPtr\<XmlWriter\>\& | [XmlWriter](../../../system.xml/xmlwriter/) çıktıyı almak istediğiniz yer. Stil sayfası bir **xsl:output** öğesi içeriyorsa, [XmlWriter](../../../system.xml/xmlwriter/)'ı [XmlWriterSettings](../../../system.xml/xmlwritersettings/) nesnesini kullanarak oluşturmalısınız; bu nesne [XslCompiledTransform::get_OutputSettings](../get_outputsettings/) değerinden döndürülür. Bu, [XmlWriter](../../../system.xml/xmlwriter/)'ın doğru çıktı ayarlarına sahip olmasını sağlar. |
| documentResolver | const SharedPtr\<XmlResolver\>\& | XSLT **document()** işlevini çözmek için kullanılan [XmlResolver](../../../system.xml/xmlresolver/). Bu **nullptr** ise, **document()** işlevi çözülmez. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XmlWriter\>\&) method


[XmlReader](../../../system.xml/xmlreader/) nesnesi tarafından belirtilen giriş belgesini kullanarak dönüşümü yürütür ve sonuçları bir [XmlWriter](../../../system.xml/xmlwriter/)'a çıkarır.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XmlWriter> &results)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | Giriş belgesini içeren [XmlReader](../../../system.xml/xmlreader/). |
| results | const SharedPtr\<XmlWriter\>\& | Çıktıyı vermek istediğiniz [XmlWriter](../../../system.xml/xmlwriter/). Stil sayfası bir **xsl:output** öğesi içeriyorsa, [XmlWriter](../../../system.xml/xmlwriter/)'ı [XmlWriterSettings](../../../system.xml/xmlwritersettings/) nesnesini kullanarak, [XslCompiledTransform::get_OutputSettings](../get_outputsettings/) değerinden dönen nesneyle oluşturmalısınız. Bu, [XmlWriter](../../../system.xml/xmlwriter/)'ın doğru çıktı ayarlarına sahip olmasını sağlar. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


[XmlReader](../../../system.xml/xmlreader/) nesnesi tarafından belirtilen giriş belgesini kullanarak dönüşümü yürütür ve sonuçları bir akıma çıkarır. [XsltArgumentList](../../xsltargumentlist/) ek çalışma zamanı argümanları sağlar.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::Stream> &results)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | Giriş belgesini içeren bir [XmlReader](../../../system.xml/xmlreader/). |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Dönüşüme girdi olarak kullanılan, ad alanı ile nitelendirilmiş argümanları içeren bir [XsltArgumentList](../../xsltargumentlist/). Bu değer **nullptr** olabilir. |
| sonuçlar | const SharedPtr\<IO::Stream\>\& | Çıktı vermek istediğiniz akış. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


[XmlReader](../../../system.xml/xmlreader/) nesnesi tarafından belirtilen giriş belgesini kullanarak dönüşümü yürütür ve sonuçları bir TextWriter'a çıkarır. [XsltArgumentList](../../xsltargumentlist/) ek çalışma zamanı argümanları sağlar.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::TextWriter> &results)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | Giriş belgesini içeren bir [XmlReader](../../../system.xml/xmlreader/). |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Dönüşüme girdi olarak kullanılan, ad alanı ile nitelendirilmiş argümanları içeren bir [XsltArgumentList](../../xsltargumentlist/). Bu değer **nullptr** olabilir. |
| sonuçlar | const SharedPtr\<IO::TextWriter\>\& | Çıktı vermek istediğiniz TextWriter. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


[XmlReader](../../../system.xml/xmlreader/) nesnesi tarafından belirtilen giriş belgesini kullanarak dönüşümü yürütür ve sonuçları bir [XmlWriter](../../../system.xml/xmlwriter/)'a çıkarır. [XsltArgumentList](../../xsltargumentlist/) ek çalışma zamanı argümanları sağlar.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | Giriş belgesini içeren bir [XmlReader](../../../system.xml/xmlreader/). |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Dönüşüme girdi olarak kullanılan, ad alanı ile nitelendirilmiş argümanları içeren bir [XsltArgumentList](../../xsltargumentlist/). Bu değer **nullptr** olabilir. |
| results | const SharedPtr\<XmlWriter\>\& | Çıktıyı vermek istediğiniz [XmlWriter](../../../system.xml/xmlwriter/). Stil sayfası bir **xsl:output** öğesi içeriyorsa, [XmlWriter](../../../system.xml/xmlwriter/)'ı [XmlWriterSettings](../../../system.xml/xmlwritersettings/) nesnesini kullanarak, [XslCompiledTransform::get_OutputSettings](../get_outputsettings/) değerinden dönen nesneyle oluşturmalısınız. Bu, [XmlWriter](../../../system.xml/xmlwriter/)'ın doğru çıktı ayarlarına sahip olmasını sağlar. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<XmlResolver\>\&) method


[XmlReader](../../../system.xml/xmlreader/) nesnesi tarafından belirtilen giriş belgesini kullanarak dönüşümü yürütür ve sonuçları bir [XmlWriter](../../../system.xml/xmlwriter/)'a çıkarır. [XsltArgumentList](../../xsltargumentlist/) ek çalışma zamanı argümanları sağlar ve [XmlResolver](../../../system.xml/xmlresolver/) XSLT **document()** işlevini çözer.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results, const SharedPtr<XmlResolver> &documentResolver)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | Giriş belgesini içeren bir [XmlReader](../../../system.xml/xmlreader/). |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Dönüşüme girdi olarak kullanılan, ad alanı ile nitelendirilmiş argümanları içeren bir [XsltArgumentList](../../xsltargumentlist/). Bu değer **nullptr** olabilir. |
| results | const SharedPtr\<XmlWriter\>\& | Çıktıyı vermek istediğiniz [XmlWriter](../../../system.xml/xmlwriter/). Stil sayfası bir **xsl:output** öğesi içeriyorsa, [XmlWriter](../../../system.xml/xmlwriter/)'ı [XmlWriterSettings](../../../system.xml/xmlwritersettings/) nesnesini kullanarak, [XslCompiledTransform::get_OutputSettings](../get_outputsettings/) değerinden dönen nesneyle oluşturmalısınız. Bu, [XmlWriter](../../../system.xml/xmlwriter/)'ın doğru çıktı ayarlarına sahip olmasını sağlar. |
| documentResolver | const SharedPtr\<XmlResolver\>\& | XSLT **document()** işlevini çözmek için kullanılan [XmlResolver](../../../system.xml/xmlresolver/). Bu **nullptr** ise, **document()** işlevi çözülmez. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const SharedPtr\<XmlWriter\>\&) method


URI tarafından belirtilen giriş belgesini kullanarak dönüşümü yürütür ve sonuçları bir [XmlWriter](../../../system.xml/xmlwriter/)'a çıkarır.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const SharedPtr<XmlWriter> &results)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| inputUri | const String\& | Giriş belgesinin URI'si. |
| results | const SharedPtr\<XmlWriter\>\& | Çıktıyı vermek istediğiniz [XmlWriter](../../../system.xml/xmlwriter/). Stil sayfası bir **xsl:output** öğesi içeriyorsa, [XmlWriter](../../../system.xml/xmlwriter/)'ı [XmlWriterSettings](../../../system.xml/xmlwritersettings/) nesnesini kullanarak, [XslCompiledTransform::get_OutputSettings](../get_outputsettings/) değerinden dönen nesneyle oluşturmalısınız. Bu, [XmlWriter](../../../system.xml/xmlwriter/)'ın doğru çıktı ayarlarına sahip olmasını sağlar. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


URI tarafından belirtilen giriş belgesini kullanarak dönüşümü yürütür ve sonuçları bir akıma çıkarır. [XsltArgumentList](../../xsltargumentlist/) ek çalışma zamanı argümanları sağlar.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::Stream> &results)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| inputUri | const String\& | Giriş belgesinin URI'si. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Dönüşüme girdi olarak kullanılan, ad alanı ile nitelendirilmiş argümanları içeren bir [XsltArgumentList](../../xsltargumentlist/). Bu değer **nullptr** olabilir. |
| sonuçlar | const SharedPtr\<IO::Stream\>\& | Çıktı vermek istediğiniz akış. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


URI tarafından belirtilen giriş belgesini kullanarak dönüşümü yürütür ve sonuçları bir TextWriter'a yazar.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::TextWriter> &results)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| inputUri | const String\& | Giriş belgesinin URI'si. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Dönüşüme girdi olarak kullanılan, ad alanı ile nitelendirilmiş argümanları içeren bir [XsltArgumentList](../../xsltargumentlist/). Bu değer **nullptr** olabilir. |
| sonuçlar | const SharedPtr\<IO::TextWriter\>\& | Çıktı vermek istediğiniz TextWriter. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


URI tarafından belirtilen giriş belgesini kullanarak dönüşümü yürütür ve sonuçları bir [XmlWriter](../../../system.xml/xmlwriter/)'a çıkarır. [XsltArgumentList](../../xsltargumentlist/) ek çalışma zamanı argümanları sağlar.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| inputUri | const String\& | Giriş belgesinin URI'si. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Dönüşüme girdi olarak kullanılan, ad alanı ile nitelendirilmiş argümanları içeren bir [XsltArgumentList](../../xsltargumentlist/). Bu değer **nullptr** olabilir. |
| results | const SharedPtr\<XmlWriter\>\& | Çıktıyı vermek istediğiniz [XmlWriter](../../../system.xml/xmlwriter/). Stil sayfası bir **xsl:output** öğesi içeriyorsa, [XmlWriter](../../../system.xml/xmlwriter/)'ı [XmlWriterSettings](../../../system.xml/xmlwritersettings/) nesnesini kullanarak, [XslCompiledTransform::get_OutputSettings](../get_outputsettings/) değerinden dönen nesneyle oluşturmalısınız. Bu, [XmlWriter](../../../system.xml/xmlwriter/)'ın doğru çıktı ayarlarına sahip olmasını sağlar. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const String\&) method


URI tarafından belirtilen giriş belgesini kullanarak dönüşümü yürütür ve sonuçları bir dosyaya yazar.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const String &resultsFile)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| inputUri | const String\& | Giriş belgesinin URI'si. |
| resultsFile | const String\& | Çıktı dosyasının URI'si. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
