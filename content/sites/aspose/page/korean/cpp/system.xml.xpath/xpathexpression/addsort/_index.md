---
title: "System::Xml::XPath::XPathExpression::AddSort method"
linktitle: "AddSort"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XPath::XPathExpression::AddSort 메서드. 파생 클래스에서 재정의될 경우, C++에서 지정된 IComparer 객체에 따라 XPath 식으로 선택된 노드를 정렬합니다."
type: docs
weight: 100
url: /ko/cpp/system.xml.xpath/xpathexpression/addsort/
---
## XPathExpression::AddSort(SharedPtr\<Object\>, SharedPtr\<Collections::Generic::IComparer\<SharedPtr\<Object\>\>\>) method


파생 클래스에서 재정의될 경우, 지정된 IComparer 객체에 따라 [XPath](../../) 식으로 선택된 노드를 정렬합니다.

```cpp
virtual void System::Xml::XPath::XPathExpression::AddSort(SharedPtr<Object> expr, SharedPtr<Collections::Generic::IComparer<SharedPtr<Object>>> comparer)=0
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| expr | SharedPtr\<Object\> | 정렬 키를 나타내는 객체입니다. 이는 노드의 **string** 값이거나, 컴파일된 [XPath](../../) 식을 가진 [XPathExpression](../) 객체일 수 있습니다. |
| 비교자 | SharedPtr\<Collections::Generic::IComparer\<SharedPtr\<Object\>\>\> | 두 객체의 동등성을 비교하기 위해 특정 데이터 유형 비교를 제공하는 IComparer 객체입니다. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [IComparer](../../../system.collections.generic/icomparer/)
* Class [XPathExpression](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathExpression::AddSort(SharedPtr\<Object\>, XmlSortOrder, XmlCaseOrder, String, XmlDataType) method


파생 클래스에서 재정화될 경우, 제공된 매개변수에 따라 [XPath](../../) 식으로 선택된 노드를 정렬합니다.

```cpp
virtual void System::Xml::XPath::XPathExpression::AddSort(SharedPtr<Object> expr, XmlSortOrder order, XmlCaseOrder caseOrder, String lang, XmlDataType dataType)=0
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| expr | SharedPtr\<Object\> | 정렬 키를 나타내는 객체입니다. 이는 노드의 **string** 값이거나, 컴파일된 [XPath](../../) 식을 가진 [XPathExpression](../) 객체일 수 있습니다. |
| order | XmlSortOrder | 정렬 순서를 나타내는 [XmlSortOrder](../../xmlsortorder/) 값. |
| caseOrder | XmlCaseOrder | 대문자와 소문자를 정렬하는 방법을 나타내는 [XmlCaseOrder](../../xmlcaseorder/) 값. |
| lang | String | 비교에 사용할 언어입니다. 언어 유형에 대해 [String::Compare](../../../system/string/compare/) 메서드에 전달할 수 있는 [Globalization::CultureInfo](../../../system.globalization/cultureinfo/) 클래스를 사용합니다. 예를 들어 미국 영어의 경우 \"us-en\"을 사용합니다. 빈 문자열이 지정되면 시스템 환경을 사용하여 [Globalization::CultureInfo](../../../system.globalization/cultureinfo/)를 결정합니다. |
| dataType | XmlDataType | 데이터 형식의 정렬 순서를 나타내는 [XmlDataType](../../xmldatatype/) 값. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Enum [XmlSortOrder](../../xmlsortorder/)
* Enum [XmlCaseOrder](../../xmlcaseorder/)
* Class [String](../../../system/string/)
* Enum [XmlDataType](../../xmldatatype/)
* Class [XPathExpression](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
