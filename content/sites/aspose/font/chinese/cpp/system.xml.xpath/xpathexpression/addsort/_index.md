---
title: "System::Xml::XPath::XPathExpression::AddSort 方法"
linktitle: "AddSort"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XPath::XPathExpression::AddSort 方法。 在派生类中重写时，以 C++ 根据指定的 IComparer 对象对 XPath 表达式选中的节点进行排序。"
type: docs
weight: 100
url: /zh/cpp/system.xml.xpath/xpathexpression/addsort/
---
## XPathExpression::AddSort(SharedPtr\<Object\>, SharedPtr\<Collections::Generic::IComparer\<SharedPtr\<Object\>\>\>) method


在派生类中重写时，根据指定的 IComparer 对象对 [XPath](../../) 表达式选中的节点进行排序。

```cpp
virtual void System::Xml::XPath::XPathExpression::AddSort(SharedPtr<Object> expr, SharedPtr<Collections::Generic::IComparer<SharedPtr<Object>>> comparer)=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| expr | SharedPtr\<Object\> | 表示排序键的对象。它可以是节点的 **string** 值，或带有已编译的 [XPath](../../) 表达式的 [XPathExpression](../) 对象。 |
| 比较器 | SharedPtr\<Collections::Generic::IComparer\<SharedPtr\<Object\>\>\> | 提供特定数据类型比较以比较两个对象是否等价的 IComparer 对象。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [IComparer](../../../system.collections.generic/icomparer/)
* Class [XPathExpression](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathExpression::AddSort(SharedPtr\<Object\>, XmlSortOrder, XmlCaseOrder, String, XmlDataType) method


在派生类中重写时，根据提供的参数对 [XPath](../../) 表达式选中的节点进行排序。

```cpp
virtual void System::Xml::XPath::XPathExpression::AddSort(SharedPtr<Object> expr, XmlSortOrder order, XmlCaseOrder caseOrder, String lang, XmlDataType dataType)=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| expr | SharedPtr\<Object\> | 表示排序键的对象。它可以是节点的 **string** 值，或带有已编译的 [XPath](../../) 表达式的 [XPathExpression](../) 对象。 |
| order | XmlSortOrder | 指示排序顺序的 [XmlSortOrder](../../xmlsortorder/) 值。 |
| caseOrder | XmlCaseOrder | 指示如何对大小写字母进行排序的 [XmlCaseOrder](../../xmlcaseorder/) 值。 |
| lang | String | 用于比较的语言。使用可以传递给 [String::Compare](../../../system/string/compare/) 方法的 [Globalization::CultureInfo](../../../system.globalization/cultureinfo/) 类来指定语言类型，例如，"us-en" 表示美国英语。如果指定为空字符串，则使用系统环境来确定 [Globalization::CultureInfo](../../../system.globalization/cultureinfo/)。 |
| dataType | XmlDataType | 指示数据类型排序顺序的 [XmlDataType](../../xmldatatype/) 值。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Enum [XmlSortOrder](../../xmlsortorder/)
* Enum [XmlCaseOrder](../../xmlcaseorder/)
* Class [String](../../../system/string/)
* Enum [XmlDataType](../../xmldatatype/)
* Class [XPathExpression](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
