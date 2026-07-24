---
title: "System::Xml::Xsl::XslCompiledTransform::Load 메서드"
linktitle: "로드"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Xsl::XslCompiledTransform::Load 메서드. C++에서 IXPathNavigable 객체에 포함된 스타일 시트를 컴파일합니다."
type: docs
weight: 300
url: /ko/cpp/system.xml.xsl/xslcompiledtransform/load/
---
## XslCompiledTransform::Load(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&) method


IXPathNavigable 객체에 포함된 스타일 시트를 컴파일합니다.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const SharedPtr<System::Xml::XPath::IXPathNavigable> &stylesheet)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| stylesheet | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable 인터페이스를 구현하는 객체입니다. 이는 [XmlNode](../../../system.xml/xmlnode/) (보통 [XmlDocument](../../../system.xml/xmldocument/) )이거나 스타일 시트를 포함하는 XPathDocument일 수 있습니다. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Load(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, SharedPtr\<XsltSettings\>, SharedPtr\<XmlResolver\>) method


IXPathNavigable에 포함된 XSLT 스타일 시트를 컴파일합니다. [XmlResolver](../../../system.xml/xmlresolver/)는 모든 XSLT **import** 또는 **include** 요소를 해결하고, XSLT 설정은 스타일 시트에 대한 권한을 결정합니다.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const SharedPtr<System::Xml::XPath::IXPathNavigable> &stylesheet, SharedPtr<XsltSettings> settings, SharedPtr<XmlResolver> stylesheetResolver)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| stylesheet | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable 인터페이스를 구현하는 객체입니다. 이는 [XmlNode](../../../system.xml/xmlnode/) (보통 [XmlDocument](../../../system.xml/xmldocument/) )이거나 스타일 시트를 포함하는 XPathDocument일 수 있습니다. |
| settings | SharedPtr\<XsltSettings\> | 스타일 시트에 적용할 [XsltSettings](../../xsltsettings/)입니다. 이것이 **nullptr**인 경우, [XsltSettings::get_Default](../../xsltsettings/get_default/) 설정이 적용됩니다. |
| stylesheetResolver | SharedPtr\<XmlResolver\> | XSLT **import** 및 **include** 요소에서 참조된 모든 스타일 시트를 해결하는 데 사용되는 [XmlResolver](../../../system.xml/xmlresolver/)입니다. 이것이 **nullptr**인 경우 외부 리소스는 해결되지 않습니다. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltSettings](../../xsltsettings/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Load(const SharedPtr\<XmlReader\>\&) method


[XmlReader](../../../system.xml/xmlreader/)에 포함된 스타일 시트를 컴파일합니다.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const SharedPtr<XmlReader> &stylesheet)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| stylesheet | const SharedPtr\<XmlReader\>\& | 스타일 시트를 포함하는 [XmlReader](../../../system.xml/xmlreader/)입니다. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Load(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltSettings\>\&, const SharedPtr\<XmlResolver\>\&) method


[XmlReader](../../../system.xml/xmlreader/)에 포함된 XSLT 스타일 시트를 컴파일합니다. [XmlResolver](../../../system.xml/xmlresolver/)는 모든 XSLT **import** 또는 **include** 요소를 해결하고, XSLT 설정은 스타일 시트에 대한 권한을 결정합니다.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const SharedPtr<XmlReader> &stylesheet, const SharedPtr<XsltSettings> &settings, const SharedPtr<XmlResolver> &stylesheetResolver)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| stylesheet | const SharedPtr\<XmlReader\>\& | 스타일 시트를 포함하는 [XmlReader](../../../system.xml/xmlreader/)입니다. |
| settings | const SharedPtr\<XsltSettings\>\& | 스타일 시트에 적용할 [XsltSettings](../../xsltsettings/)입니다. 이것이 **nullptr**인 경우, [XsltSettings::get_Default](../../xsltsettings/get_default/) 설정이 적용됩니다. |
| stylesheetResolver | const SharedPtr\<XmlResolver\>\& | XSLT **import** 및 **include** 요소에서 참조된 모든 스타일 시트를 해결하는 데 사용되는 [XmlResolver](../../../system.xml/xmlresolver/)입니다. 이것이 **nullptr**인 경우 외부 리소스는 해결되지 않습니다. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltSettings](../../xsltsettings/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Load(const String\&) method


지정된 URI에 위치한 스타일 시트를 로드하고 컴파일합니다.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const String &stylesheetUri)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| stylesheetUri | const String\& | 스타일 시트의 URI입니다. |

## 또 보기

* Class [String](../../../system/string/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Load(const String\&, const SharedPtr\<XsltSettings\>\&, const SharedPtr\<XmlResolver\>\&) method


URI로 지정된 XSLT 스타일 시트를 로드하고 컴파일합니다. [XmlResolver](../../../system.xml/xmlresolver/)는 모든 XSLT **import** 또는 **include** 요소를 해결하고 XSLT 설정은 스타일 시트에 대한 권한을 결정합니다.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const String &stylesheetUri, const SharedPtr<XsltSettings> &settings, const SharedPtr<XmlResolver> &stylesheetResolver)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| stylesheetUri | const String\& | 스타일 시트의 URI입니다. |
| settings | const SharedPtr\<XsltSettings\>\& | 스타일 시트에 적용할 [XsltSettings](../../xsltsettings/)입니다. 이것이 **nullptr**인 경우, [XsltSettings::get_Default](../../xsltsettings/get_default/) 설정이 적용됩니다. |
| stylesheetResolver | const SharedPtr\<XmlResolver\>\& | [XmlResolver](../../../system.xml/xmlresolver/)는 XSLT **import** 및 **include** 요소에서 참조된 스타일 시트 URI와 모든 스타일 시트를 해결하는 데 사용됩니다. |

## 또 보기

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XsltSettings](../../xsltsettings/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
