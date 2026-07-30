---
title: "System::Xml::Xsl::XslTransform::Transform 方法"
linktitle: "Transform"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Xsl::XslTransform::Transform 方法。使用指定的 args 转换 IXPathNavigable 中的 XML 数据，并在 C++ 中将结果输出到 XmlReader。"
type: docs
weight: 400
url: /zh/cpp/system.xml.xsl/xsltransform/transform/
---
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&) method


使用指定的 **args** 转换 IXPathNavigable 中的 XML 数据，并将结果输出到 [XmlReader](../../../system.xml/xmlreader/)。

```cpp
SharedPtr<XmlReader> System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | 实现 IXPathNavigable 接口的对象。它可以是 [XmlNode](../../../system.xml/xmlnode/)（通常是 [XmlDocument](../../../system.xml/xmldocument/)），或包含待转换数据的 XPathDocument。 |
| args | const SharedPtr\<XsltArgumentList\>\& | 包含用于转换输入的具名空间限定参数的 [XsltArgumentList](../../xsltargumentlist/)。 |

### ReturnValue

包含转换结果的 [XmlReader](../../../system.xml/xmlreader/)。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


使用指定的 **args** 转换 IXPathNavigable 中的 XML 数据，并将结果输出到流。

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::Stream> &output)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | 实现 IXPathNavigable 接口的对象。它可以是 [XmlNode](../../../system.xml/xmlnode/)（通常是 [XmlDocument](../../../system.xml/xmldocument/)），或包含待转换数据的 XPathDocument。 |
| args | const SharedPtr\<XsltArgumentList\>\& | 包含用于转换输入的具名空间限定参数的 [XsltArgumentList](../../xsltargumentlist/)。 |
| 输出 | const SharedPtr\<IO::Stream\>\& | 您希望输出到的流。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


使用指定的 **args** 转换 IXPathNavigable 中的 XML 数据，并将结果输出到流。

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::Stream> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | 实现 IXPathNavigable 接口的对象。它可以是 [XmlNode](../../../system.xml/xmlnode/)（通常是 [XmlDocument](../../../system.xml/xmldocument/)），或包含待转换数据的 XPathDocument。 |
| args | const SharedPtr\<XsltArgumentList\>\& | 包含用于转换输入的具名空间限定参数的 [XsltArgumentList](../../xsltargumentlist/)。 |
| 输出 | const SharedPtr\<IO::Stream\>\& | 您希望输出到的流。 |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | 用于解析 XSLT **document()** 函数的 [XmlResolver](../../../system.xml/xmlresolver/)。如果它是 **nullptr**，则不会解析 **document()** 函数。该 [XmlResolver](../../../system.xml/xmlresolver/) 在 [XslTransform::Transform](./) 方法完成后不会被缓存。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


使用指定的 **args** 转换 IXPathNavigable 中的 XML 数据，并将结果输出到 TextWriter。

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::TextWriter> &output)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | 实现 IXPathNavigable 接口的对象。它可以是 [XmlNode](../../../system.xml/xmlnode/)（通常是 [XmlDocument](../../../system.xml/xmldocument/)），或包含待转换数据的 XPathDocument。 |
| args | const SharedPtr\<XsltArgumentList\>\& | 包含用于转换输入的具名空间限定参数的 [XsltArgumentList](../../xsltargumentlist/)。 |
| 输出 | const SharedPtr\<IO::TextWriter\>\& | 您希望输出到的 TextWriter。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


使用指定的 **args** 转换 IXPathNavigable 中的 XML 数据，并将结果输出到 TextWriter。

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::TextWriter> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | 实现 IXPathNavigable 接口的对象。它可以是 [XmlNode](../../../system.xml/xmlnode/)（通常是 [XmlDocument](../../../system.xml/xmldocument/)），或包含待转换数据的 XPathDocument。 |
| args | const SharedPtr\<XsltArgumentList\>\& | 包含用于转换输入的具名空间限定参数的 [XsltArgumentList](../../xsltargumentlist/)。 |
| 输出 | const SharedPtr\<IO::TextWriter\>\& | 您希望输出到的 TextWriter。 |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | 用于解析 XSLT **document()** 函数的 [XmlResolver](../../../system.xml/xmlresolver/)。如果它是 **nullptr**，则不会解析 **document()** 函数。该 [XmlResolver](../../../system.xml/xmlresolver/) 在此方法完成后不会被缓存。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


使用指定的 **args** 转换 IXPathNavigable 中的 XML 数据，并将结果输出到 [XmlReader](../../../system.xml/xmlreader/)。

```cpp
SharedPtr<XmlReader> System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | 实现 IXPathNavigable 接口的对象。它可以是 [XmlNode](../../../system.xml/xmlnode/)（通常是 [XmlDocument](../../../system.xml/xmldocument/)），或包含待转换数据的 XPathDocument。 |
| args | const SharedPtr\<XsltArgumentList\>\& | 包含用于转换输入的具名空间限定参数的 [XsltArgumentList](../../xsltargumentlist/)。 |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | 用于解析 XSLT **document()** 函数的 [XmlResolver](../../../system.xml/xmlresolver/)。如果它是 **nullptr**，则不会解析 **document()** 函数。该 [XmlResolver](../../../system.xml/xmlresolver/) 在此方法完成后不会被缓存。 |

### ReturnValue

包含转换结果的 [XmlReader](../../../system.xml/xmlreader/)。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


使用指定的 **args** 转换 IXPathNavigable 中的 XML 数据，并将结果输出到 [XmlWriter](../../../system.xml/xmlwriter/)。

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<XmlWriter> &output)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | 实现 IXPathNavigable 接口的对象。它可以是 [XmlNode](../../../system.xml/xmlnode/)（通常是 [XmlDocument](../../../system.xml/xmldocument/)），或包含待转换数据的 XPathDocument。 |
| args | const SharedPtr\<XsltArgumentList\>\& | 包含用于转换输入的具名空间限定参数的 [XsltArgumentList](../../xsltargumentlist/)。 |
| output | const SharedPtr\<XmlWriter\>\& | 您希望输出到的 [XmlWriter](../../../system.xml/xmlwriter/)。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


使用指定的 **args** 转换 IXPathNavigable 中的 XML 数据，并将结果输出到 [XmlWriter](../../../system.xml/xmlwriter/)。

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<XmlWriter> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | 实现 IXPathNavigable 接口的对象。它可以是 [XmlNode](../../../system.xml/xmlnode/)（通常是 [XmlDocument](../../../system.xml/xmldocument/)），或包含待转换数据的 XPathDocument。 |
| args | const SharedPtr\<XsltArgumentList\>\& | 包含用于转换输入的具名空间限定参数的 [XsltArgumentList](../../xsltargumentlist/)。 |
| output | const SharedPtr\<XmlWriter\>\& | 您希望输出到的 [XmlWriter](../../../system.xml/xmlwriter/)。 |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | 用于解析 XSLT **document()** 函数的 [XmlResolver](../../../system.xml/xmlresolver/)。如果它是 **nullptr**，则不会解析 **document()** 函数。该 [XmlResolver](../../../system.xml/xmlresolver/) 在此方法完成后不会被缓存。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&) method


使用指定的 **args** 转换 XPathNavigator 中的 XML 数据，并将结果输出到 [XmlReader](../../../system.xml/xmlreader/)。

```cpp
SharedPtr<XmlReader> System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 输入 | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | 包含待转换数据的 XPathNavigator。 |
| args | const SharedPtr\<XsltArgumentList\>\& | 包含用于转换输入的具名空间限定参数的 [XsltArgumentList](../../xsltargumentlist/)。 |

### ReturnValue

包含转换结果的 [XmlReader](../../../system.xml/xmlreader/)。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


使用指定的 **args** 转换 XPathNavigator 中的 XML 数据，并将结果输出到流。

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::Stream> &output)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 输入 | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | 包含待转换数据的 XPathNavigator。 |
| args | const SharedPtr\<XsltArgumentList\>\& | 包含用于转换输入的具名空间限定参数的 [XsltArgumentList](../../xsltargumentlist/)。 |
| 输出 | const SharedPtr\<IO::Stream\>\& | 您希望输出到的流。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


使用指定的 **args** 转换 XPathNavigator 中的 XML 数据，并将结果输出到流。

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::Stream> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 输入 | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | 包含待转换数据的 XPathNavigator。 |
| args | const SharedPtr\<XsltArgumentList\>\& | 包含用于转换输入的具名空间限定参数的 [XsltArgumentList](../../xsltargumentlist/)。 |
| 输出 | const SharedPtr\<IO::Stream\>\& | 您希望输出到的流。 |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | 用于解析 XSLT **document()** 函数的 [XmlResolver](../../../system.xml/xmlresolver/)。如果它是 **nullptr**，则不会解析 **document()** 函数。该 [XmlResolver](../../../system.xml/xmlresolver/) 在此方法完成后不会被缓存。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


使用指定的 **args** 转换 XPathNavigator 中的 XML 数据，并将结果输出到 TextWriter。

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::TextWriter> &output)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 输入 | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | 包含待转换数据的 XPathNavigator。 |
| args | const SharedPtr\<XsltArgumentList\>\& | 包含用于转换输入的具名空间限定参数的 [XsltArgumentList](../../xsltargumentlist/)。 |
| 输出 | const SharedPtr\<IO::TextWriter\>\& | 您希望输出到的 TextWriter。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


使用指定的 **args** 转换 XPathNavigator 中的 XML 数据，并将结果输出到 TextWriter。

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::TextWriter> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 输入 | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | 包含待转换数据的 XPathNavigator。 |
| args | const SharedPtr\<XsltArgumentList\>\& | 包含用于转换输入的具名空间限定参数的 [XsltArgumentList](../../xsltargumentlist/)。 |
| 输出 | const SharedPtr\<IO::TextWriter\>\& | 您希望输出到的 TextWriter。 |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | 用于解析 XSLT **document()** 函数的 [XmlResolver](../../../system.xml/xmlresolver/)。如果它是 **nullptr**，则不会解析 **document()** 函数。该 [XmlResolver](../../../system.xml/xmlresolver/) 在此方法完成后不会被缓存。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


使用指定的 **args** 转换 XPathNavigator 中的 XML 数据，并将结果输出到 [XmlReader](../../../system.xml/xmlreader/)。

```cpp
SharedPtr<XmlReader> System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 输入 | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | 包含待转换数据的 XPathNavigator。 |
| args | const SharedPtr\<XsltArgumentList\>\& | 包含用于转换输入的具名空间限定参数的 [XsltArgumentList](../../xsltargumentlist/)。 |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | 用于解析 XSLT **document()** 函数的 [XmlResolver](../../../system.xml/xmlresolver/)。如果它是 **nullptr**，则不会解析 **document()** 函数。该 [XmlResolver](../../../system.xml/xmlresolver/) 在此方法完成后不会被缓存。 |

### ReturnValue

包含转换结果的 [XmlReader](../../../system.xml/xmlreader/)。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


使用指定的 args 转换 XPathNavigator 中的 XML 数据，并将结果输出到 [XmlWriter](../../../system.xml/xmlwriter/)。

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<XmlWriter> &output)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 输入 | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | 包含待转换数据的 XPathNavigator。 |
| args | const SharedPtr\<XsltArgumentList\>\& | 包含用于转换输入的具名空间限定参数的 [XsltArgumentList](../../xsltargumentlist/)。 |
| output | const SharedPtr\<XmlWriter\>\& | 您希望输出到的 [XmlWriter](../../../system.xml/xmlwriter/)。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


使用指定的 args 转换 XPathNavigator 中的 XML 数据，并将结果输出到 [XmlWriter](../../../system.xml/xmlwriter/)。

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<XmlWriter> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 输入 | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | 包含待转换数据的 XPathNavigator。 |
| args | const SharedPtr\<XsltArgumentList\>\& | 包含用于转换输入的具名空间限定参数的 [XsltArgumentList](../../xsltargumentlist/)。 |
| output | const SharedPtr\<XmlWriter\>\& | 您希望输出到的 [XmlWriter](../../../system.xml/xmlwriter/)。 |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | 用于解析 XSLT **document()** 函数的 [XmlResolver](../../../system.xml/xmlresolver/)。如果它是 **nullptr**，则不会解析 **document()** 函数。该 [XmlResolver](../../../system.xml/xmlresolver/) 在此方法完成后不会被缓存。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const String\&, const String\&) method


转换输入文件中的 XML 数据，并将结果输出到输出文件。

```cpp
void System::Xml::Xsl::XslTransform::Transform(const String &inputfile, const String &outputfile)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| inputfile | const String\& | 待转换源文档的 URL。 |
| outputfile | const String\& | 输出文件的 URL。 |

## 另见

* Class [String](../../../system/string/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const String\&, const String\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


转换输入文件中的 XML 数据，并将结果输出到输出文件。

```cpp
void System::Xml::Xsl::XslTransform::Transform(const String &inputfile, const String &outputfile, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| inputfile | const String\& | 待转换源文档的 URL。 |
| outputfile | const String\& | 输出文件的 URL。 |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | 用于解析 XSLT **document()** 函数的 [XmlResolver](../../../system.xml/xmlresolver/)。如果它是 **nullptr**，则不会解析 **document()** 函数。该 [XmlResolver](../../../system.xml/xmlresolver/) 在 [XslTransform::Transform](./) 方法完成后不会被缓存。 |

## 另见

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
