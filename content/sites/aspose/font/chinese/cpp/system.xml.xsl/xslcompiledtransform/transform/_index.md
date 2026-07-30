---
title: "System::Xml::Xsl::XslCompiledTransform::Transform method"
linktitle: "Transform"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Xsl::XslCompiledTransform::Transform 方法。使用 IXPathNavigable 对象指定的输入文档执行转换，并将结果输出到 C++ 中的 XmlWriter。"
type: docs
weight: 400
url: /zh/cpp/system.xml.xsl/xslcompiledtransform/transform/
---
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XmlWriter\>\&) method


使用 IXPathNavigable 对象指定的输入文档执行转换，并将结果输出到 [XmlWriter](../../../system.xml/xmlwriter/)。

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XmlWriter> &results)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | 实现 IXPathNavigable 接口的对象。它可以是 [XmlNode](../../../system.xml/xmlnode/)（通常是 [XmlDocument](../../../system.xml/xmldocument/)），或包含待转换数据的 XPathDocument。 |
| results | const SharedPtr\<XmlWriter\>\& | 您希望输出的 [XmlWriter](../../../system.xml/xmlwriter/)。如果样式表包含 **xsl:output** 元素，您应该使用从 [XslCompiledTransform::get_OutputSettings](../get_outputsettings/) 返回的 [XmlWriterSettings](../../../system.xml/xmlwritersettings/) 对象来创建 [XmlWriter](../../../system.xml/xmlwriter/)。这可确保 [XmlWriter](../../../system.xml/xmlwriter/) 具有正确的输出设置。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


使用 IXPathNavigable 对象指定的输入文档执行转换，并将结果输出到流。 [XsltArgumentList](../../xsltargumentlist/) 提供额外的运行时参数。

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::Stream> &results)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | 实现 IXPathNavigable 接口的对象。它可以是 [XmlNode](../../../system.xml/xmlnode/)（通常是 [XmlDocument](../../../system.xml/xmldocument/)），或包含待转换数据的 XPathDocument。 |
| arguments | const SharedPtr\<XsltArgumentList\>\& | 一个包含用于转换输入的命名空间限定参数的 [XsltArgumentList](../../xsltargumentlist/)。该值可以为 **nullptr**。 |
| 结果 | const SharedPtr\<IO::Stream\>\& | 您希望输出到的流。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


使用 IXPathNavigable 对象指定的输入文档执行转换，并将结果输出到 TextWriter。 [XsltArgumentList](../../xsltargumentlist/) 提供额外的运行时参数。

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::TextWriter> &results)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | 实现 IXPathNavigable 接口的对象。它可以是 [XmlNode](../../../system.xml/xmlnode/)（通常是 [XmlDocument](../../../system.xml/xmldocument/)），或包含待转换数据的 XPathDocument。 |
| arguments | const SharedPtr\<XsltArgumentList\>\& | 一个包含用于转换输入的命名空间限定参数的 [XsltArgumentList](../../xsltargumentlist/)。该值可以为 **nullptr**。 |
| 结果 | const SharedPtr\<IO::TextWriter\>\& | 您希望输出到的 TextWriter。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


使用 IXPathNavigable 对象指定的输入文档执行转换，并将结果输出到 [XmlWriter](../../../system.xml/xmlwriter/)。 [XsltArgumentList](../../xsltargumentlist/) 提供额外的运行时参数。

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | 实现 IXPathNavigable 接口的对象。它可以是 [XmlNode](../../../system.xml/xmlnode/)（通常是 [XmlDocument](../../../system.xml/xmldocument/)），或包含待转换数据的 XPathDocument。 |
| arguments | const SharedPtr\<XsltArgumentList\>\& | 一个包含用于转换输入的命名空间限定参数的 [XsltArgumentList](../../xsltargumentlist/)。该值可以为 **nullptr**。 |
| results | const SharedPtr\<XmlWriter\>\& | 您希望输出的 [XmlWriter](../../../system.xml/xmlwriter/)。如果样式表包含 **xsl:output** 元素，您应该使用从 [XslCompiledTransform::get_OutputSettings](../get_outputsettings/) 返回的 [XmlWriterSettings](../../../system.xml/xmlwritersettings/) 对象来创建 [XmlWriter](../../../system.xml/xmlwriter/)。这可确保 [XmlWriter](../../../system.xml/xmlwriter/) 具有正确的输出设置。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<XmlResolver\>\&) method


通过使用 IXPathNavigable 对象指定的输入文档执行转换，并将结果输出到 [XmlWriter](../../../system.xml/xmlwriter/)。 [XsltArgumentList](../../xsltargumentlist/) 提供额外的运行时参数，且 [XmlResolver](../../../system.xml/xmlresolver/) 解析 XSLT **document()** 函数。

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results, const SharedPtr<XmlResolver> &documentResolver)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 输入 | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | 由 IXPathNavigable 对象指定的要转换的文档。 |
| arguments | const SharedPtr\<XsltArgumentList\>\& | 参数列表为 [XsltArgumentList](../../xsltargumentlist/)。 |
| results | const SharedPtr\<XmlWriter\>\& | 要输出的目标 [XmlWriter](../../../system.xml/xmlwriter/)。如果样式表包含 **xsl:output** 元素，则应使用从 [XslCompiledTransform::get_OutputSettings](../get_outputsettings/) 返回的 [XmlWriterSettings](../../../system.xml/xmlwritersettings/) 对象来创建 [XmlWriter](../../../system.xml/xmlwriter/)。这可确保 [XmlWriter](../../../system.xml/xmlwriter/) 具有正确的输出设置。 |
| documentResolver | const SharedPtr\<XmlResolver\>\& | 用于解析 XSLT **document()** 函数的 [XmlResolver](../../../system.xml/xmlresolver/)。如果它为 **nullptr**，则 **document()** 函数不会被解析。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XmlWriter\>\&) method


使用由 [XmlReader](../../../system.xml/xmlreader/) 对象指定的输入文档执行转换，并将结果输出到 [XmlWriter](../../../system.xml/xmlwriter/)。

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XmlWriter> &results)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | 包含输入文档的 [XmlReader](../../../system.xml/xmlreader/)。 |
| results | const SharedPtr\<XmlWriter\>\& | 您希望输出的 [XmlWriter](../../../system.xml/xmlwriter/)。如果样式表包含 **xsl:output** 元素，您应该使用从 [XslCompiledTransform::get_OutputSettings](../get_outputsettings/) 返回的 [XmlWriterSettings](../../../system.xml/xmlwritersettings/) 对象来创建 [XmlWriter](../../../system.xml/xmlwriter/)。这可确保 [XmlWriter](../../../system.xml/xmlwriter/) 具有正确的输出设置。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


使用由 [XmlReader](../../../system.xml/xmlreader/) 对象指定的输入文档执行转换，并将结果输出到流。[XsltArgumentList](../../xsltargumentlist/) 提供额外的运行时参数。

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::Stream> &results)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | 包含输入文档的 [XmlReader](../../../system.xml/xmlreader/)。 |
| arguments | const SharedPtr\<XsltArgumentList\>\& | 一个包含用于转换输入的命名空间限定参数的 [XsltArgumentList](../../xsltargumentlist/)。该值可以为 **nullptr**。 |
| 结果 | const SharedPtr\<IO::Stream\>\& | 您希望输出到的流。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


使用由 [XmlReader](../../../system.xml/xmlreader/) 对象指定的输入文档执行转换，并将结果输出到 TextWriter。 [XsltArgumentList](../../xsltargumentlist/) 提供额外的运行时参数。

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::TextWriter> &results)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | 包含输入文档的 [XmlReader](../../../system.xml/xmlreader/)。 |
| arguments | const SharedPtr\<XsltArgumentList\>\& | 一个包含用于转换输入的命名空间限定参数的 [XsltArgumentList](../../xsltargumentlist/)。该值可以为 **nullptr**。 |
| 结果 | const SharedPtr\<IO::TextWriter\>\& | 您希望输出到的 TextWriter。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


使用由 [XmlReader](../../../system.xml/xmlreader/) 对象指定的输入文档执行转换，并将结果输出到 [XmlWriter](../../../system.xml/xmlwriter/)。[XsltArgumentList](../../xsltargumentlist/) 提供额外的运行时参数。

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | 包含输入文档的 [XmlReader](../../../system.xml/xmlreader/)。 |
| arguments | const SharedPtr\<XsltArgumentList\>\& | 一个包含用于转换输入的命名空间限定参数的 [XsltArgumentList](../../xsltargumentlist/)。该值可以为 **nullptr**。 |
| results | const SharedPtr\<XmlWriter\>\& | 您希望输出的 [XmlWriter](../../../system.xml/xmlwriter/)。如果样式表包含 **xsl:output** 元素，您应该使用从 [XslCompiledTransform::get_OutputSettings](../get_outputsettings/) 返回的 [XmlWriterSettings](../../../system.xml/xmlwritersettings/) 对象来创建 [XmlWriter](../../../system.xml/xmlwriter/)。这可确保 [XmlWriter](../../../system.xml/xmlwriter/) 具有正确的输出设置。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<XmlResolver\>\&) method


使用由 [XmlReader](../../../system.xml/xmlreader/) 对象指定的输入文档执行转换，并将结果输出到 [XmlWriter](../../../system.xml/xmlwriter/)。[XsltArgumentList](../../xsltargumentlist/) 提供额外的运行时参数，且 [XmlResolver](../../../system.xml/xmlresolver/) 解析 XSLT **document()** 函数。

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results, const SharedPtr<XmlResolver> &documentResolver)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | 包含输入文档的 [XmlReader](../../../system.xml/xmlreader/)。 |
| arguments | const SharedPtr\<XsltArgumentList\>\& | 一个包含用于转换输入的命名空间限定参数的 [XsltArgumentList](../../xsltargumentlist/)。该值可以为 **nullptr**。 |
| results | const SharedPtr\<XmlWriter\>\& | 您希望输出的 [XmlWriter](../../../system.xml/xmlwriter/)。如果样式表包含 **xsl:output** 元素，您应该使用从 [XslCompiledTransform::get_OutputSettings](../get_outputsettings/) 返回的 [XmlWriterSettings](../../../system.xml/xmlwritersettings/) 对象来创建 [XmlWriter](../../../system.xml/xmlwriter/)。这可确保 [XmlWriter](../../../system.xml/xmlwriter/) 具有正确的输出设置。 |
| documentResolver | const SharedPtr\<XmlResolver\>\& | 用于解析 XSLT **document()** 函数的 [XmlResolver](../../../system.xml/xmlresolver/)。如果它为 **nullptr**，则 **document()** 函数不会被解析。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const SharedPtr\<XmlWriter\>\&) method


使用由 URI 指定的输入文档执行转换，并将结果输出到 [XmlWriter](../../../system.xml/xmlwriter/)。

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const SharedPtr<XmlWriter> &results)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| inputUri | const String\& | 输入文档的 URI。 |
| results | const SharedPtr\<XmlWriter\>\& | 您希望输出的 [XmlWriter](../../../system.xml/xmlwriter/)。如果样式表包含 **xsl:output** 元素，您应该使用从 [XslCompiledTransform::get_OutputSettings](../get_outputsettings/) 返回的 [XmlWriterSettings](../../../system.xml/xmlwritersettings/) 对象来创建 [XmlWriter](../../../system.xml/xmlwriter/)。这可确保 [XmlWriter](../../../system.xml/xmlwriter/) 具有正确的输出设置。 |

## 另见

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


使用由 URI 指定的输入文档执行转换，并将结果输出到流。[XsltArgumentList](../../xsltargumentlist/) 提供额外的运行时参数。

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::Stream> &results)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| inputUri | const String\& | 输入文档的 URI。 |
| arguments | const SharedPtr\<XsltArgumentList\>\& | 一个包含用于转换输入的命名空间限定参数的 [XsltArgumentList](../../xsltargumentlist/)。该值可以为 **nullptr**。 |
| 结果 | const SharedPtr\<IO::Stream\>\& | 您希望输出到的流。 |

## 另见

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


使用由 URI 指定的输入文档执行转换，并将结果输出到 TextWriter。

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::TextWriter> &results)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| inputUri | const String\& | 输入文档的 URI。 |
| arguments | const SharedPtr\<XsltArgumentList\>\& | 一个包含用于转换输入的命名空间限定参数的 [XsltArgumentList](../../xsltargumentlist/)。该值可以为 **nullptr**。 |
| 结果 | const SharedPtr\<IO::TextWriter\>\& | 您希望输出到的 TextWriter。 |

## 另见

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


使用由 URI 指定的输入文档执行转换，并将结果输出到 [XmlWriter](../../../system.xml/xmlwriter/)。[XsltArgumentList](../../xsltargumentlist/) 提供额外的运行时参数。

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| inputUri | const String\& | 输入文档的 URI。 |
| arguments | const SharedPtr\<XsltArgumentList\>\& | 一个包含用于转换输入的命名空间限定参数的 [XsltArgumentList](../../xsltargumentlist/)。该值可以为 **nullptr**。 |
| results | const SharedPtr\<XmlWriter\>\& | 您希望输出的 [XmlWriter](../../../system.xml/xmlwriter/)。如果样式表包含 **xsl:output** 元素，您应该使用从 [XslCompiledTransform::get_OutputSettings](../get_outputsettings/) 返回的 [XmlWriterSettings](../../../system.xml/xmlwritersettings/) 对象来创建 [XmlWriter](../../../system.xml/xmlwriter/)。这可确保 [XmlWriter](../../../system.xml/xmlwriter/) 具有正确的输出设置。 |

## 另见

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const String\&) method


使用由 URI 指定的输入文档执行转换，并将结果输出到文件。

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const String &resultsFile)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| inputUri | const String\& | 输入文档的 URI。 |
| resultsFile | const String\& | 输出文件的 URI。 |

## 另见

* Class [String](../../../system/string/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
