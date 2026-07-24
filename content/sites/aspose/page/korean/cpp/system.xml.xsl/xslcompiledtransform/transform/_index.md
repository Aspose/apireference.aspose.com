---
title: "System::Xml::Xsl::XslCompiledTransform::Transform method"
linktitle: "Transform"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Xsl::XslCompiledTransform::Transform 메서드. IXPathNavigable 객체로 지정된 입력 문서를 사용하여 변환을 실행하고 결과를 C++의 XmlWriter에 출력합니다."
type: docs
weight: 400
url: /ko/cpp/system.xml.xsl/xslcompiledtransform/transform/
---
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XmlWriter\>\&) method


IXPathNavigable 객체로 지정된 입력 문서를 사용하여 변환을 실행하고 결과를 [XmlWriter](../../../system.xml/xmlwriter/)에 출력합니다.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XmlWriter> &results)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable 인터페이스를 구현하는 객체입니다. 이는 [XmlNode](../../../system.xml/xmlnode/) (보통 [XmlDocument](../../../system.xml/xmldocument/))이거나 변환될 데이터를 포함하는 XPathDocument일 수 있습니다. |
| results | const SharedPtr\<XmlWriter\>\& | [XmlWriter](../../../system.xml/xmlwriter/)에 출력하려는 대상입니다. 스타일 시트에 **xsl:output** 요소가 포함된 경우, [XslCompiledTransform::get_OutputSettings](../get_outputsettings/) 값에서 반환된 [XmlWriterSettings](../../../system.xml/xmlwritersettings/) 객체를 사용하여 [XmlWriter](../../../system.xml/xmlwriter/)를 생성해야 합니다. 이렇게 하면 [XmlWriter](../../../system.xml/xmlwriter/)에 올바른 출력 설정이 적용됩니다. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


IXPathNavigable 객체로 지정된 입력 문서를 사용하여 변환을 실행하고 결과를 스트림에 출력합니다. [XsltArgumentList](../../xsltargumentlist/)는 추가 런타임 인수를 제공합니다.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::Stream> &results)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable 인터페이스를 구현하는 객체입니다. 이는 [XmlNode](../../../system.xml/xmlnode/) (보통 [XmlDocument](../../../system.xml/xmldocument/))이거나 변환될 데이터를 포함하는 XPathDocument일 수 있습니다. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | [XsltArgumentList](../../xsltargumentlist/)는 변환에 입력으로 사용되는 네임스페이스가 지정된 인수를 포함합니다. 이 값은 **nullptr**일 수 있습니다. |
| 결과 | const SharedPtr\<IO::Stream\>\& | 출력하려는 스트림. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


IXPathNavigable 객체로 지정된 입력 문서를 사용하여 변환을 실행하고 결과를 TextWriter에 출력합니다. [XsltArgumentList](../../xsltargumentlist/)는 추가 런타임 인수를 제공합니다.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::TextWriter> &results)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable 인터페이스를 구현하는 객체입니다. 이는 [XmlNode](../../../system.xml/xmlnode/) (보통 [XmlDocument](../../../system.xml/xmldocument/))이거나 변환될 데이터를 포함하는 XPathDocument일 수 있습니다. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | [XsltArgumentList](../../xsltargumentlist/)는 변환에 입력으로 사용되는 네임스페이스가 지정된 인수를 포함합니다. 이 값은 **nullptr**일 수 있습니다. |
| 결과 | const SharedPtr\<IO::TextWriter\>\& | 출력하려는 TextWriter. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


IXPathNavigable 객체로 지정된 입력 문서를 사용하여 변환을 실행하고 결과를 [XmlWriter](../../../system.xml/xmlwriter/)에 출력합니다. [XsltArgumentList](../../xsltargumentlist/)는 추가 런타임 인수를 제공합니다.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable 인터페이스를 구현하는 객체입니다. 이는 [XmlNode](../../../system.xml/xmlnode/) (보통 [XmlDocument](../../../system.xml/xmldocument/))이거나 변환될 데이터를 포함하는 XPathDocument일 수 있습니다. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | [XsltArgumentList](../../xsltargumentlist/)는 변환에 입력으로 사용되는 네임스페이스가 지정된 인수를 포함합니다. 이 값은 **nullptr**일 수 있습니다. |
| results | const SharedPtr\<XmlWriter\>\& | [XmlWriter](../../../system.xml/xmlwriter/)에 출력하려는 대상입니다. 스타일 시트에 **xsl:output** 요소가 포함된 경우, [XslCompiledTransform::get_OutputSettings](../get_outputsettings/) 값에서 반환된 [XmlWriterSettings](../../../system.xml/xmlwritersettings/) 객체를 사용하여 [XmlWriter](../../../system.xml/xmlwriter/)를 생성해야 합니다. 이렇게 하면 [XmlWriter](../../../system.xml/xmlwriter/)에 올바른 출력 설정이 적용됩니다. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<XmlResolver\>\&) method


IXPathNavigable 객체로 지정된 입력 문서를 사용하여 변환을 실행하고 결과를 [XmlWriter](../../../system.xml/xmlwriter/)에 출력합니다. [XsltArgumentList](../../xsltargumentlist/)는 추가 런타임 인수를 제공하고, [XmlResolver](../../../system.xml/xmlresolver/)는 XSLT **document()** 함수를 해결합니다.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results, const SharedPtr<XmlResolver> &documentResolver)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 입력 | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable 객체로 지정된 변환할 문서입니다. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | 인수 목록은 [XsltArgumentList](../../xsltargumentlist/)입니다. |
| results | const SharedPtr\<XmlWriter\>\& | [XmlWriter](../../../system.xml/xmlwriter/)에 출력하려는 대상입니다. 스타일 시트에 **xsl:output** 요소가 포함된 경우, [XslCompiledTransform::get_OutputSettings](../get_outputsettings/) 값에서 반환된 [XmlWriterSettings](../../../system.xml/xmlwritersettings/) 객체를 사용하여 [XmlWriter](../../../system.xml/xmlwriter/)를 생성해야 합니다. 이렇게 하면 [XmlWriter](../../../system.xml/xmlwriter/)에 올바른 출력 설정이 적용됩니다. |
| documentResolver | const SharedPtr\<XmlResolver\>\& | XSLT **document()** 함수를 해결하는 데 사용되는 [XmlResolver](../../../system.xml/xmlresolver/). 이것이 **nullptr**이면 **document()** 함수가 해결되지 않습니다. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XmlWriter\>\&) method


[XmlReader](../../../system.xml/xmlreader/) 객체가 지정한 입력 문서를 사용하여 변환을 실행하고 결과를 [XmlWriter](../../../system.xml/xmlwriter/)에 출력합니다.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XmlWriter> &results)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | 입력 문서를 포함하는 [XmlReader](../../../system.xml/xmlreader/). |
| results | const SharedPtr\<XmlWriter\>\& | [XmlWriter](../../../system.xml/xmlwriter/)에 출력하려는 대상입니다. 스타일 시트에 **xsl:output** 요소가 포함된 경우, [XslCompiledTransform::get_OutputSettings](../get_outputsettings/) 값에서 반환된 [XmlWriterSettings](../../../system.xml/xmlwritersettings/) 객체를 사용하여 [XmlWriter](../../../system.xml/xmlwriter/)를 생성해야 합니다. 이렇게 하면 [XmlWriter](../../../system.xml/xmlwriter/)에 올바른 출력 설정이 적용됩니다. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


[XmlReader](../../../system.xml/xmlreader/) 객체가 지정한 입력 문서를 사용하여 변환을 실행하고 결과를 스트림에 출력합니다. [XsltArgumentList](../../xsltargumentlist/)은 추가 런타임 인수를 제공합니다.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::Stream> &results)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | 입력 문서를 포함하는 [XmlReader](../../../system.xml/xmlreader/). |
| arguments | const SharedPtr\<XsltArgumentList\>\& | [XsltArgumentList](../../xsltargumentlist/)는 변환에 입력으로 사용되는 네임스페이스가 지정된 인수를 포함합니다. 이 값은 **nullptr**일 수 있습니다. |
| 결과 | const SharedPtr\<IO::Stream\>\& | 출력하려는 스트림. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


[XmlReader](../../../system.xml/xmlreader/) 객체가 지정한 입력 문서를 사용하여 변환을 실행하고 결과를 TextWriter에 출력합니다. [XsltArgumentList](../../xsltargumentlist/)은 추가 런타임 인수를 제공합니다.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::TextWriter> &results)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | 입력 문서를 포함하는 [XmlReader](../../../system.xml/xmlreader/). |
| arguments | const SharedPtr\<XsltArgumentList\>\& | [XsltArgumentList](../../xsltargumentlist/)는 변환에 입력으로 사용되는 네임스페이스가 지정된 인수를 포함합니다. 이 값은 **nullptr**일 수 있습니다. |
| 결과 | const SharedPtr\<IO::TextWriter\>\& | 출력하려는 TextWriter. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


[XmlReader](../../../system.xml/xmlreader/) 객체가 지정한 입력 문서를 사용하여 변환을 실행하고 결과를 [XmlWriter](../../../system.xml/xmlwriter/)에 출력합니다. [XsltArgumentList](../../xsltargumentlist/)은 추가 런타임 인수를 제공합니다.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | 입력 문서를 포함하는 [XmlReader](../../../system.xml/xmlreader/). |
| arguments | const SharedPtr\<XsltArgumentList\>\& | [XsltArgumentList](../../xsltargumentlist/)는 변환에 입력으로 사용되는 네임스페이스가 지정된 인수를 포함합니다. 이 값은 **nullptr**일 수 있습니다. |
| results | const SharedPtr\<XmlWriter\>\& | [XmlWriter](../../../system.xml/xmlwriter/)에 출력하려는 대상입니다. 스타일 시트에 **xsl:output** 요소가 포함된 경우, [XslCompiledTransform::get_OutputSettings](../get_outputsettings/) 값에서 반환된 [XmlWriterSettings](../../../system.xml/xmlwritersettings/) 객체를 사용하여 [XmlWriter](../../../system.xml/xmlwriter/)를 생성해야 합니다. 이렇게 하면 [XmlWriter](../../../system.xml/xmlwriter/)에 올바른 출력 설정이 적용됩니다. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<XmlResolver\>\&) method


[XmlReader](../../../system.xml/xmlreader/) 객체가 지정한 입력 문서를 사용하여 변환을 실행하고 결과를 [XmlWriter](../../../system.xml/xmlwriter/)에 출력합니다. [XsltArgumentList](../../xsltargumentlist/)은 추가 런타임 인수를 제공하고, [XmlResolver](../../../system.xml/xmlresolver/)는 XSLT **document()** 함수를 해결합니다.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results, const SharedPtr<XmlResolver> &documentResolver)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | 입력 문서를 포함하는 [XmlReader](../../../system.xml/xmlreader/). |
| arguments | const SharedPtr\<XsltArgumentList\>\& | [XsltArgumentList](../../xsltargumentlist/)는 변환에 입력으로 사용되는 네임스페이스가 지정된 인수를 포함합니다. 이 값은 **nullptr**일 수 있습니다. |
| results | const SharedPtr\<XmlWriter\>\& | [XmlWriter](../../../system.xml/xmlwriter/)에 출력하려는 대상입니다. 스타일 시트에 **xsl:output** 요소가 포함된 경우, [XslCompiledTransform::get_OutputSettings](../get_outputsettings/) 값에서 반환된 [XmlWriterSettings](../../../system.xml/xmlwritersettings/) 객체를 사용하여 [XmlWriter](../../../system.xml/xmlwriter/)를 생성해야 합니다. 이렇게 하면 [XmlWriter](../../../system.xml/xmlwriter/)에 올바른 출력 설정이 적용됩니다. |
| documentResolver | const SharedPtr\<XmlResolver\>\& | XSLT **document()** 함수를 해결하는 데 사용되는 [XmlResolver](../../../system.xml/xmlresolver/). 이것이 **nullptr**이면 **document()** 함수가 해결되지 않습니다. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const SharedPtr\<XmlWriter\>\&) method


URI로 지정된 입력 문서를 사용하여 변환을 실행하고 결과를 [XmlWriter](../../../system.xml/xmlwriter/)에 출력합니다.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const SharedPtr<XmlWriter> &results)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| inputUri | const String\& | 입력 문서의 URI. |
| results | const SharedPtr\<XmlWriter\>\& | [XmlWriter](../../../system.xml/xmlwriter/)에 출력하려는 대상입니다. 스타일 시트에 **xsl:output** 요소가 포함된 경우, [XslCompiledTransform::get_OutputSettings](../get_outputsettings/) 값에서 반환된 [XmlWriterSettings](../../../system.xml/xmlwritersettings/) 객체를 사용하여 [XmlWriter](../../../system.xml/xmlwriter/)를 생성해야 합니다. 이렇게 하면 [XmlWriter](../../../system.xml/xmlwriter/)에 올바른 출력 설정이 적용됩니다. |

## 또 보기

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


URI로 지정된 입력 문서를 사용하여 변환을 실행하고 결과를 스트림에 출력합니다. [XsltArgumentList](../../xsltargumentlist/)은 추가 런타임 인수를 제공합니다.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::Stream> &results)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| inputUri | const String\& | 입력 문서의 URI. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | [XsltArgumentList](../../xsltargumentlist/)는 변환에 입력으로 사용되는 네임스페이스가 지정된 인수를 포함합니다. 이 값은 **nullptr**일 수 있습니다. |
| 결과 | const SharedPtr\<IO::Stream\>\& | 출력하려는 스트림. |

## 또 보기

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


URI가 지정한 입력 문서를 사용하여 변환을 실행하고 결과를 TextWriter에 출력합니다.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::TextWriter> &results)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| inputUri | const String\& | 입력 문서의 URI. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | [XsltArgumentList](../../xsltargumentlist/)는 변환에 입력으로 사용되는 네임스페이스가 지정된 인수를 포함합니다. 이 값은 **nullptr**일 수 있습니다. |
| 결과 | const SharedPtr\<IO::TextWriter\>\& | 출력하려는 TextWriter. |

## 또 보기

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


URI로 지정된 입력 문서를 사용하여 변환을 실행하고 결과를 [XmlWriter](../../../system.xml/xmlwriter/)에 출력합니다. [XsltArgumentList](../../xsltargumentlist/)은 추가 런타임 인수를 제공합니다.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| inputUri | const String\& | 입력 문서의 URI. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | [XsltArgumentList](../../xsltargumentlist/)는 변환에 입력으로 사용되는 네임스페이스가 지정된 인수를 포함합니다. 이 값은 **nullptr**일 수 있습니다. |
| results | const SharedPtr\<XmlWriter\>\& | [XmlWriter](../../../system.xml/xmlwriter/)에 출력하려는 대상입니다. 스타일 시트에 **xsl:output** 요소가 포함된 경우, [XslCompiledTransform::get_OutputSettings](../get_outputsettings/) 값에서 반환된 [XmlWriterSettings](../../../system.xml/xmlwritersettings/) 객체를 사용하여 [XmlWriter](../../../system.xml/xmlwriter/)를 생성해야 합니다. 이렇게 하면 [XmlWriter](../../../system.xml/xmlwriter/)에 올바른 출력 설정이 적용됩니다. |

## 또 보기

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const String\&) method


URI가 지정한 입력 문서를 사용하여 변환을 실행하고 결과를 파일에 출력합니다.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const String &resultsFile)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| inputUri | const String\& | 입력 문서의 URI. |
| resultsFile | const String\& | 출력 파일의 URI. |

## 또 보기

* Class [String](../../../system/string/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
