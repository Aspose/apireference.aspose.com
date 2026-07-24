---
title: "طريقة System::Xml::XPath::XPathNavigator::Evaluate"
linktitle: "Evaluate"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Xml::XPath::XPathNavigator::Evaluate. تُقيّم XPathExpression وتُرجع النتيجة ذات النوع في C++."
type: docs
weight: 1200
url: /ar/cpp/system.xml.xpath/xpathnavigator/evaluate/
---
## XPathNavigator::Evaluate(SharedPtr\<XPathExpression\>) method


تُقيّم [XPathExpression](../../xpathexpression/) وتُرجع النتيجة ذات النوع.

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathNavigator::Evaluate(SharedPtr<XPathExpression> expr)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| expr | SharedPtr\<XPathExpression\> | [XPathExpression](../../xpathexpression/) يمكن تقييمها. |

### ReturnValue

نتيجة التعبير ([Boolean](../../../system/boolean/)، رقم، سلسلة، أو مجموعة عقد). هذا يُطابق كائنات [Boolean](../../../system/boolean/)، [Double](../../../system/double/)، [String](../../../system/string/)، أو [XPathNodeIterator](../../xpathnodeiterator/) على التوالي.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XPathExpression](../../xpathexpression/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::Evaluate(SharedPtr\<XPathExpression\>, SharedPtr\<XPathNodeIterator\>) method


يستخدم السياق المقدم لتقييم [XPathExpression](../../xpathexpression/)، ويعيد النتيجة ذات النوع.

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathNavigator::Evaluate(SharedPtr<XPathExpression> expr, SharedPtr<XPathNodeIterator> context)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| expr | SharedPtr\<XPathExpression\> | [XPathExpression](../../xpathexpression/) يمكن تقييمها. |
| context | SharedPtr\<XPathNodeIterator\> | مؤشر [XPathNodeIterator](../../xpathnodeiterator/) يشير إلى مجموعة العقد المحددة التي سيتم إجراء التقييم عليها. |

### ReturnValue

نتيجة التعبير ([Boolean](../../../system/boolean/)، رقم، سلسلة، أو مجموعة عقد). هذا يُطابق كائنات [Boolean](../../../system/boolean/)، [Double](../../../system/double/)، [String](../../../system/string/)، أو [XPathNodeIterator](../../xpathnodeiterator/) على التوالي.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XPathExpression](../../xpathexpression/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::Evaluate(String) method


يقيم التعبير [XPath](../../) المحدد ويعيد النتيجة ذات النوع.

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathNavigator::Evaluate(String xpath)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| xpath | String | سلسلة تمثل تعبيرًا [XPath](../../) يمكن تقييمه. |

### ReturnValue

نتيجة التعبير ([Boolean](../../../system/boolean/)، رقم، سلسلة، أو مجموعة عقد). هذا يُطابق كائنات [Boolean](../../../system/boolean/)، [Double](../../../system/double/)، [String](../../../system/string/)، أو [XPathNodeIterator](../../xpathnodeiterator/) على التوالي.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::Evaluate(String, SharedPtr\<IXmlNamespaceResolver\>) method


يقيم التعبير [XPath](../../) المحدد ويعيد النتيجة ذات النوع، باستخدام كائن [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) المحدد لحل بادئات النطاق في تعبير [XPath](../../).

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathNavigator::Evaluate(String xpath, SharedPtr<IXmlNamespaceResolver> resolver)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| xpath | String | سلسلة تمثل تعبيرًا [XPath](../../) يمكن تقييمه. |
| resolver | SharedPtr\<IXmlNamespaceResolver\> | كائن [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) المستخدم لحل بادئات النطاق في تعبير [XPath](../../). |

### ReturnValue

نتيجة التعبير ([Boolean](../../../system/boolean/)، رقم، سلسلة، أو مجموعة عقد). هذا يُطابق كائنات [Boolean](../../../system/boolean/)، [Double](../../../system/double/)، [String](../../../system/string/)، أو [XPathNodeIterator](../../xpathnodeiterator/) على التوالي.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
