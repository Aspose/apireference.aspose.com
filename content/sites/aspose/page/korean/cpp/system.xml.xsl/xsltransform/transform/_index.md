---
title: "System::Xml::Xsl::XslTransform::Transform 메서드"
linktitle: "Transform"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Xsl::XslTransform::Transform 메서드. C++에서 지정된 args를 사용하여 IXPathNavigable의 XML 데이터를 변환하고 결과를 XmlReader에 출력합니다."
type: docs
weight: 400
url: /ko/cpp/system.xml.xsl/xsltransform/transform/
---
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&) method


IXPathNavigable의 XML 데이터를 지정된 **args**를 사용하여 변환하고 결과를 [XmlReader](../../../system.xml/xmlreader/)에 출력합니다.

```cpp
SharedPtr<XmlReader> System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable 인터페이스를 구현하는 객체입니다. 이는 [XmlNode](../../../system.xml/xmlnode/) (보통 [XmlDocument](../../../system.xml/xmldocument/))이거나 변환될 데이터를 포함하는 XPathDocument일 수 있습니다. |
| args | const SharedPtr\<XsltArgumentList\>\& | 변환에 입력으로 사용되는 네임스페이스 한정 인수를 포함하는 [XsltArgumentList](../../xsltargumentlist/). |

### ReturnValue

변환 결과를 포함하는 [XmlReader](../../../system.xml/xmlreader/).

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


지정된 **args**를 사용하여 IXPathNavigable의 XML 데이터를 변환하고 결과를 스트림에 출력합니다.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::Stream> &output)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable 인터페이스를 구현하는 객체입니다. 이는 [XmlNode](../../../system.xml/xmlnode/) (보통 [XmlDocument](../../../system.xml/xmldocument/))이거나 변환될 데이터를 포함하는 XPathDocument일 수 있습니다. |
| args | const SharedPtr\<XsltArgumentList\>\& | 변환에 입력으로 사용되는 네임스페이스 한정 인수를 포함하는 [XsltArgumentList](../../xsltargumentlist/). |
| 출력 | const SharedPtr\<IO::Stream\>\& | 출력하려는 스트림. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


지정된 **args**를 사용하여 IXPathNavigable의 XML 데이터를 변환하고 결과를 스트림에 출력합니다.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::Stream> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable 인터페이스를 구현하는 객체입니다. 이는 [XmlNode](../../../system.xml/xmlnode/) (보통 [XmlDocument](../../../system.xml/xmldocument/))이거나 변환될 데이터를 포함하는 XPathDocument일 수 있습니다. |
| args | const SharedPtr\<XsltArgumentList\>\& | 변환에 입력으로 사용되는 네임스페이스 한정 인수를 포함하는 [XsltArgumentList](../../xsltargumentlist/). |
| 출력 | const SharedPtr\<IO::Stream\>\& | 출력하려는 스트림. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | [XmlResolver](../../../system.xml/xmlresolver/)는 XSLT **document()** 함수를 해결하는 데 사용됩니다. 이것이 **nullptr**이면 **document()** 함수가 해결되지 않습니다. [XslTransform::Transform](./) 메서드가 완료된 후 [XmlResolver](../../../system.xml/xmlresolver/)는 캐시되지 않습니다. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


지정된 **args**를 사용하여 IXPathNavigable의 XML 데이터를 변환하고 결과를 TextWriter에 출력합니다.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::TextWriter> &output)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable 인터페이스를 구현하는 객체입니다. 이는 [XmlNode](../../../system.xml/xmlnode/) (보통 [XmlDocument](../../../system.xml/xmldocument/))이거나 변환될 데이터를 포함하는 XPathDocument일 수 있습니다. |
| args | const SharedPtr\<XsltArgumentList\>\& | 변환에 입력으로 사용되는 네임스페이스 한정 인수를 포함하는 [XsltArgumentList](../../xsltargumentlist/). |
| 출력 | const SharedPtr\<IO::TextWriter\>\& | 출력하려는 TextWriter. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


지정된 **args**를 사용하여 IXPathNavigable의 XML 데이터를 변환하고 결과를 TextWriter에 출력합니다.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::TextWriter> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable 인터페이스를 구현하는 객체입니다. 이는 [XmlNode](../../../system.xml/xmlnode/) (보통 [XmlDocument](../../../system.xml/xmldocument/))이거나 변환될 데이터를 포함하는 XPathDocument일 수 있습니다. |
| args | const SharedPtr\<XsltArgumentList\>\& | 변환에 입력으로 사용되는 네임스페이스 한정 인수를 포함하는 [XsltArgumentList](../../xsltargumentlist/). |
| 출력 | const SharedPtr\<IO::TextWriter\>\& | 출력하려는 TextWriter. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | [XmlResolver](../../../system.xml/xmlresolver/)는 XSLT **document()** 함수를 해결하는 데 사용됩니다. 이것이 **nullptr**이면 **document()** 함수가 해결되지 않습니다. 이 메서드가 완료된 후 [XmlResolver](../../../system.xml/xmlresolver/)는 캐시되지 않습니다. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


IXPathNavigable의 XML 데이터를 지정된 **args**를 사용하여 변환하고 결과를 [XmlReader](../../../system.xml/xmlreader/)에 출력합니다.

```cpp
SharedPtr<XmlReader> System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable 인터페이스를 구현하는 객체입니다. 이는 [XmlNode](../../../system.xml/xmlnode/) (보통 [XmlDocument](../../../system.xml/xmldocument/))이거나 변환될 데이터를 포함하는 XPathDocument일 수 있습니다. |
| args | const SharedPtr\<XsltArgumentList\>\& | 변환에 입력으로 사용되는 네임스페이스 한정 인수를 포함하는 [XsltArgumentList](../../xsltargumentlist/). |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | [XmlResolver](../../../system.xml/xmlresolver/)는 XSLT **document()** 함수를 해결하는 데 사용됩니다. 이것이 **nullptr**이면 **document()** 함수가 해결되지 않습니다. 이 메서드가 완료된 후 [XmlResolver](../../../system.xml/xmlresolver/)는 캐시되지 않습니다. |

### ReturnValue

변환 결과를 포함하는 [XmlReader](../../../system.xml/xmlreader/).

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


지정된 **args**를 사용하여 IXPathNavigable의 XML 데이터를 변환하고 결과를 [XmlWriter](../../../system.xml/xmlwriter/)에 출력합니다.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<XmlWriter> &output)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable 인터페이스를 구현하는 객체입니다. 이는 [XmlNode](../../../system.xml/xmlnode/) (보통 [XmlDocument](../../../system.xml/xmldocument/))이거나 변환될 데이터를 포함하는 XPathDocument일 수 있습니다. |
| args | const SharedPtr\<XsltArgumentList\>\& | 변환에 입력으로 사용되는 네임스페이스 한정 인수를 포함하는 [XsltArgumentList](../../xsltargumentlist/). |
| output | const SharedPtr\<XmlWriter\>\& | 출력하려는 [XmlWriter](../../../system.xml/xmlwriter/). |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


지정된 **args**를 사용하여 IXPathNavigable의 XML 데이터를 변환하고 결과를 [XmlWriter](../../../system.xml/xmlwriter/)에 출력합니다.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<XmlWriter> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable 인터페이스를 구현하는 객체입니다. 이는 [XmlNode](../../../system.xml/xmlnode/) (보통 [XmlDocument](../../../system.xml/xmldocument/))이거나 변환될 데이터를 포함하는 XPathDocument일 수 있습니다. |
| args | const SharedPtr\<XsltArgumentList\>\& | 변환에 입력으로 사용되는 네임스페이스 한정 인수를 포함하는 [XsltArgumentList](../../xsltargumentlist/). |
| output | const SharedPtr\<XmlWriter\>\& | 출력하려는 [XmlWriter](../../../system.xml/xmlwriter/). |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | [XmlResolver](../../../system.xml/xmlresolver/)는 XSLT **document()** 함수를 해결하는 데 사용됩니다. 이것이 **nullptr**이면 **document()** 함수가 해결되지 않습니다. 이 메서드가 완료된 후 [XmlResolver](../../../system.xml/xmlresolver/)는 캐시되지 않습니다. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&) method


지정된 **args**를 사용하여 XPathNavigator의 XML 데이터를 변환하고 결과를 [XmlReader](../../../system.xml/xmlreader/)에 출력합니다.

```cpp
SharedPtr<XmlReader> System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 입력 | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | 변환될 데이터를 포함하는 XPathNavigator. |
| args | const SharedPtr\<XsltArgumentList\>\& | 변환에 입력으로 사용되는 네임스페이스 한정 인수를 포함하는 [XsltArgumentList](../../xsltargumentlist/). |

### ReturnValue

변환 결과를 포함하는 [XmlReader](../../../system.xml/xmlreader/).

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


지정된 **args**를 사용하여 XPathNavigator의 XML 데이터를 변환하고 결과를 스트림에 출력합니다.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::Stream> &output)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 입력 | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | 변환될 데이터를 포함하는 XPathNavigator. |
| args | const SharedPtr\<XsltArgumentList\>\& | 변환에 입력으로 사용되는 네임스페이스 한정 인수를 포함하는 [XsltArgumentList](../../xsltargumentlist/). |
| 출력 | const SharedPtr\<IO::Stream\>\& | 출력하려는 스트림. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


지정된 **args**를 사용하여 XPathNavigator의 XML 데이터를 변환하고 결과를 스트림에 출력합니다.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::Stream> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 입력 | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | 변환될 데이터를 포함하는 XPathNavigator. |
| args | const SharedPtr\<XsltArgumentList\>\& | 변환에 입력으로 사용되는 네임스페이스 한정 인수를 포함하는 [XsltArgumentList](../../xsltargumentlist/). |
| 출력 | const SharedPtr\<IO::Stream\>\& | 출력하려는 스트림. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | [XmlResolver](../../../system.xml/xmlresolver/)는 XSLT **document()** 함수를 해결하는 데 사용됩니다. 이것이 **nullptr**이면 **document()** 함수가 해결되지 않습니다. 이 메서드가 완료된 후 [XmlResolver](../../../system.xml/xmlresolver/)는 캐시되지 않습니다. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


지정된 **args**를 사용하여 XPathNavigator의 XML 데이터를 변환하고 결과를 TextWriter에 출력합니다.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::TextWriter> &output)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 입력 | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | 변환될 데이터를 포함하는 XPathNavigator. |
| args | const SharedPtr\<XsltArgumentList\>\& | 변환에 입력으로 사용되는 네임스페이스 한정 인수를 포함하는 [XsltArgumentList](../../xsltargumentlist/). |
| 출력 | const SharedPtr\<IO::TextWriter\>\& | 출력하려는 TextWriter. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


지정된 **args**를 사용하여 XPathNavigator의 XML 데이터를 변환하고 결과를 TextWriter에 출력합니다.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::TextWriter> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 입력 | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | 변환될 데이터를 포함하는 XPathNavigator. |
| args | const SharedPtr\<XsltArgumentList\>\& | 변환에 입력으로 사용되는 네임스페이스 한정 인수를 포함하는 [XsltArgumentList](../../xsltargumentlist/). |
| 출력 | const SharedPtr\<IO::TextWriter\>\& | 출력하려는 TextWriter. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | [XmlResolver](../../../system.xml/xmlresolver/)는 XSLT **document()** 함수를 해결하는 데 사용됩니다. 이것이 **nullptr**이면 **document()** 함수가 해결되지 않습니다. 이 메서드가 완료된 후 [XmlResolver](../../../system.xml/xmlresolver/)는 캐시되지 않습니다. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


지정된 **args**를 사용하여 XPathNavigator의 XML 데이터를 변환하고 결과를 [XmlReader](../../../system.xml/xmlreader/)에 출력합니다.

```cpp
SharedPtr<XmlReader> System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 입력 | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | 변환될 데이터를 포함하는 XPathNavigator. |
| args | const SharedPtr\<XsltArgumentList\>\& | 변환에 입력으로 사용되는 네임스페이스 한정 인수를 포함하는 [XsltArgumentList](../../xsltargumentlist/). |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | [XmlResolver](../../../system.xml/xmlresolver/)는 XSLT **document()** 함수를 해결하는 데 사용됩니다. 이것이 **nullptr**이면 **document()** 함수가 해결되지 않습니다. 이 메서드가 완료된 후 [XmlResolver](../../../system.xml/xmlresolver/)는 캐시되지 않습니다. |

### ReturnValue

변환 결과를 포함하는 [XmlReader](../../../system.xml/xmlreader/).

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


지정된 args를 사용하여 XPathNavigator의 XML 데이터를 변환하고 결과를 [XmlWriter](../../../system.xml/xmlwriter/)에 출력합니다.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<XmlWriter> &output)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 입력 | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | 변환될 데이터를 포함하는 XPathNavigator. |
| args | const SharedPtr\<XsltArgumentList\>\& | 변환에 입력으로 사용되는 네임스페이스 한정 인수를 포함하는 [XsltArgumentList](../../xsltargumentlist/). |
| output | const SharedPtr\<XmlWriter\>\& | 출력하려는 [XmlWriter](../../../system.xml/xmlwriter/). |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


지정된 args를 사용하여 XPathNavigator의 XML 데이터를 변환하고 결과를 [XmlWriter](../../../system.xml/xmlwriter/)에 출력합니다.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<XmlWriter> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 입력 | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | 변환될 데이터를 포함하는 XPathNavigator. |
| args | const SharedPtr\<XsltArgumentList\>\& | 변환에 입력으로 사용되는 네임스페이스 한정 인수를 포함하는 [XsltArgumentList](../../xsltargumentlist/). |
| output | const SharedPtr\<XmlWriter\>\& | 출력하려는 [XmlWriter](../../../system.xml/xmlwriter/). |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | [XmlResolver](../../../system.xml/xmlresolver/)는 XSLT **document()** 함수를 해결하는 데 사용됩니다. 이것이 **nullptr**이면 **document()** 함수가 해결되지 않습니다. 이 메서드가 완료된 후 [XmlResolver](../../../system.xml/xmlresolver/)는 캐시되지 않습니다. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const String\&, const String\&) method


입력 파일의 XML 데이터를 변환하고 결과를 출력 파일에 저장합니다.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const String &inputfile, const String &outputfile)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| inputfile | const String\& | 변환될 소스 문서의 URL. |
| outputfile | const String\& | 출력 파일의 URL. |

## 또 보기

* Class [String](../../../system/string/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const String\&, const String\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


입력 파일의 XML 데이터를 변환하고 결과를 출력 파일에 저장합니다.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const String &inputfile, const String &outputfile, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| inputfile | const String\& | 변환될 소스 문서의 URL. |
| outputfile | const String\& | 출력 파일의 URL. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | [XmlResolver](../../../system.xml/xmlresolver/)는 XSLT **document()** 함수를 해결하는 데 사용됩니다. 이것이 **nullptr**이면 **document()** 함수가 해결되지 않습니다. [XslTransform::Transform](./) 메서드가 완료된 후 [XmlResolver](../../../system.xml/xmlresolver/)는 캐시되지 않습니다. |

## 또 보기

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
