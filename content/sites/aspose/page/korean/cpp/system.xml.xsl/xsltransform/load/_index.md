---
title: "System::Xml::Xsl::XslTransform::Load 메서드"
linktitle: "로드"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Xsl::XslTransform::Load 메서드. C++에서 IXPathNavigable에 포함된 XSLT 스타일 시트를 로드합니다."
type: docs
weight: 200
url: /ko/cpp/system.xml.xsl/xsltransform/load/
---
## XslTransform::Load(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&) method


IXPathNavigable에 포함된 XSLT 스타일 시트를 로드합니다.

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<System::Xml::XPath::IXPathNavigable> &stylesheet)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| stylesheet | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable 인터페이스를 구현하는 객체입니다. 이는 [XmlNode](../../../system.xml/xmlnode/) (보통 [XmlDocument](../../../system.xml/xmldocument/))이거나 XSLT 스타일 시트를 포함하는 XPathDocument일 수 있습니다. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Load(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


IXPathNavigable에 포함된 XSLT 스타일 시트를 로드합니다.

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<System::Xml::XPath::IXPathNavigable> &stylesheet, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| stylesheet | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable 인터페이스를 구현하는 객체입니다. 이는 [XmlNode](../../../system.xml/xmlnode/) (보통 [XmlDocument](../../../system.xml/xmldocument/))이거나 XSLT 스타일 시트를 포함하는 XPathDocument일 수 있습니다. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | 스타일 시트에 **xsl:import** 및 **xsl:include** 요소에서 참조된 모든 스타일 시트를 로드하는 데 사용되는 [XmlResolver](../../../system.xml/xmlresolver/)입니다. 이 값이 **nullptr**이면 외부 리소스가 해결되지 않습니다. 이 메서드가 완료된 후 [XmlResolver](../../../system.xml/xmlresolver/)는 캐시되지 않습니다. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Load(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&) method


XPathNavigator에 포함된 XSLT 스타일 시트를 로드합니다.

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<System::Xml::XPath::XPathNavigator> &stylesheet)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 스타일시트 | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | XSLT 스타일 시트를 포함하는 XPathNavigator 객체입니다. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Load(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


XPathNavigator에 포함된 XSLT 스타일 시트를 로드합니다.

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<System::Xml::XPath::XPathNavigator> &stylesheet, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 스타일시트 | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | XSLT 스타일 시트를 포함하는 XPathNavigator 객체입니다. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | 스타일 시트에 **xsl:import** 및 **xsl:include** 요소에서 참조된 모든 스타일 시트를 로드하는 데 사용되는 [XmlResolver](../../../system.xml/xmlresolver/)입니다. 이 값이 **nullptr**이면 외부 리소스가 해결되지 않습니다. 이 메서드가 완료된 후 [XmlResolver](../../../system.xml/xmlresolver/)는 캐시되지 않습니다. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Load(const SharedPtr\<XmlReader\>\&) method


[XmlReader](../../../system.xml/xmlreader/)에 포함된 XSLT 스타일 시트를 로드합니다.

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<XmlReader> &stylesheet)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| stylesheet | const SharedPtr\<XmlReader\>\& | XSLT 스타일 시트를 포함하는 [XmlReader](../../../system.xml/xmlreader/) 객체입니다. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Load(const SharedPtr\<XmlReader\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


[XmlReader](../../../system.xml/xmlreader/)에 포함된 XSLT 스타일 시트를 로드합니다.

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<XmlReader> &stylesheet, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| stylesheet | const SharedPtr\<XmlReader\>\& | XSLT 스타일 시트를 포함하는 [XmlReader](../../../system.xml/xmlreader/) 객체입니다. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | 스타일 시트에 **xsl:import** 및 **xsl:include** 요소에서 참조된 모든 스타일 시트를 로드하는 데 사용되는 [XmlResolver](../../../system.xml/xmlresolver/)입니다. 이 값이 **nullptr**이면 외부 리소스가 해결되지 않습니다. 이 메서드가 완료된 후 [XmlResolver](../../../system.xml/xmlresolver/)는 캐시되지 않습니다. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Load(const String\&) method


URL로 지정된 XSLT 스타일 시트를 로드합니다.

```cpp
void System::Xml::Xsl::XslTransform::Load(const String &url)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| url | const String\& | 로드할 XSLT 스타일 시트를 지정하는 URL입니다. |

## 또 보기

* Class [String](../../../system/string/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Load(const String\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


URL로 지정된 XSLT 스타일 시트를 로드합니다.

```cpp
void System::Xml::Xsl::XslTransform::Load(const String &url, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| url | const String\& | 로드할 XSLT 스타일 시트를 지정하는 URL입니다. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | [XmlResolver](../../../system.xml/xmlresolver/)는 스타일 시트와 **xsl:import** 및 **xsl:include** 요소에서 참조된 모든 스타일 시트를 로드하는 데 사용됩니다. 이 값이 **nullptr**이면 사용자 자격 증명이 없는 기본 [XmlUrlResolver](../../../system.xml/xmlurlresolver/)가 스타일 시트를 열 때 사용됩니다. 기본 [XmlUrlResolver](../../../system.xml/xmlurlresolver/)는 스타일 시트의 외부 리소스를 해결하는 데 사용되지 않으므로 **xsl:import** 및 **xsl:include** 요소는 해결되지 않습니다. 이 메서드가 완료된 후 [XmlResolver](../../../system.xml/xmlresolver/)는 캐시되지 않습니다. |

## 또 보기

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
