---
title: "System::Xml::Xsl::XslTransform::Load yöntemi"
linktitle: "Yükle"
second_title: "Aspose.Page için C++"
description: "System::Xml::Xsl::XslTransform::Load yöntemi. C++'ta IXPathNavigable içinde bulunan XSLT stil sayfasını yükler."
type: docs
weight: 200
url: /tr/cpp/system.xml.xsl/xsltransform/load/
---
## XslTransform::Load(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&) method


XSLT stil sayfasını IXPathNavigable içinde yükler.

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<System::Xml::XPath::IXPathNavigable> &stylesheet)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| stylesheet | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable arayüzünü uygulayan bir nesne. Bu, bir [XmlNode](../../../system.xml/xmlnode/) (genellikle bir [XmlDocument](../../../system.xml/xmldocument/)) ya da XSLT stil sayfasını içeren bir XPathDocument olabilir. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Load(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


XSLT stil sayfasını IXPathNavigable içinde yükler.

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<System::Xml::XPath::IXPathNavigable> &stylesheet, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| stylesheet | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable arayüzünü uygulayan bir nesne. Bu, bir [XmlNode](../../../system.xml/xmlnode/) (genellikle bir [XmlDocument](../../../system.xml/xmldocument/)) ya da XSLT stil sayfasını içeren bir XPathDocument olabilir. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Herhangi bir stil sayfasının **xsl:import** ve **xsl:include** öğelerinde referans verilmesi durumunda yüklemek için kullanılan [XmlResolver](../../../system.xml/xmlresolver/). Bu **nullptr** ise, dış kaynaklar çözülmez. Bu yöntem tamamlandıktan sonra [XmlResolver](../../../system.xml/xmlresolver/) önbelleğe alınmaz. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Load(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&) method


XSLT stil sayfasını XPathNavigator içinde yükler.

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<System::Xml::XPath::XPathNavigator> &stylesheet)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| stil sayfası | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | XSLT stil sayfasını içeren bir XPathNavigator nesnesi. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Load(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


XSLT stil sayfasını XPathNavigator içinde yükler.

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<System::Xml::XPath::XPathNavigator> &stylesheet, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| stil sayfası | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | XSLT stil sayfasını içeren bir XPathNavigator nesnesi. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Herhangi bir stil sayfasının **xsl:import** ve **xsl:include** öğelerinde referans verilmesi durumunda yüklemek için kullanılan [XmlResolver](../../../system.xml/xmlresolver/). Bu **nullptr** ise, dış kaynaklar çözülmez. Bu yöntem tamamlandıktan sonra [XmlResolver](../../../system.xml/xmlresolver/) önbelleğe alınmaz. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Load(const SharedPtr\<XmlReader\>\&) method


XSLT stil sayfasını [XmlReader](../../../system.xml/xmlreader/) içinde yükler.

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<XmlReader> &stylesheet)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| stylesheet | const SharedPtr\<XmlReader\>\& | [XmlReader](../../../system.xml/xmlreader/) içinde XSLT stil sayfasını içeren bir nesne. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Load(const SharedPtr\<XmlReader\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


XSLT stil sayfasını [XmlReader](../../../system.xml/xmlreader/) içinde yükler.

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<XmlReader> &stylesheet, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| stylesheet | const SharedPtr\<XmlReader\>\& | [XmlReader](../../../system.xml/xmlreader/) içinde XSLT stil sayfasını içeren bir nesne. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Herhangi bir stil sayfasının **xsl:import** ve **xsl:include** öğelerinde referans verilmesi durumunda yüklemek için kullanılan [XmlResolver](../../../system.xml/xmlresolver/). Bu **nullptr** ise, dış kaynaklar çözülmez. Bu yöntem tamamlandıktan sonra [XmlResolver](../../../system.xml/xmlresolver/) önbelleğe alınmaz. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Load(const String\&) method


Bir URL tarafından belirtilen XSLT stil sayfasını yükler.

```cpp
void System::Xml::Xsl::XslTransform::Load(const String &url)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| url | const String\& | Yüklenecek XSLT stil sayfasını belirten URL. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Load(const String\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Bir URL tarafından belirtilen XSLT stil sayfasını yükler.

```cpp
void System::Xml::Xsl::XslTransform::Load(const String &url, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| url | const String\& | Yüklenecek XSLT stil sayfasını belirten URL. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Stil sayfasını ve **xsl:import** ve **xsl:include** öğelerinde referans verilen herhangi bir stil sayfasını yüklemek için kullanılacak [XmlResolver](../../../system.xml/xmlresolver/). Bu **nullptr** ise, stil sayfasını açmak için kullanıcı kimlik bilgileri olmayan varsayılan bir [XmlUrlResolver](../../../system.xml/xmlurlresolver/) kullanılır. Varsayılan [XmlUrlResolver](../../../system.xml/xmlurlresolver/) stil sayfasındaki dış kaynakları çözmek için kullanılmaz, bu yüzden **xsl:import** ve **xsl:include** öğeleri çözülmez. Bu yöntem tamamlandıktan sonra [XmlResolver](../../../system.xml/xmlresolver/) önbelleğe alınmaz. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
