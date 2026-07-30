---
title: "System::Xml::XPath::XPathNavigator::Evaluate طريقة"
linktitle: "Evaluate"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::XPath::XPathNavigator::Evaluate طريقة. يقيم XPathExpression ويعيد النتيجة ذات النوع في C++."
type: docs
weight: 1200
url: /ar/cpp/system.xml.xpath/xpathnavigator/evaluate/
---
## XPathNavigator::Evaluate(SharedPtr\<XPathExpression\>) method


يقيم [XPathExpression](../../xpathexpression/) ويعيد النتيجة ذات النوع.

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathNavigator::Evaluate(SharedPtr<XPathExpression> expr)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| expr | SharedPtr\<XPathExpression\> | [XPathExpression](../../xpathexpression/) يمكن تقييمه. |

### ReturnValue

نتيجة التعبير ([Boolean](../../../system/boolean/)، رقم، سلسلة، أو مجموعة عقد). هذا يتطابق مع كائنات [Boolean](../../../system/boolean/)، [Double](../../../system/double/)، [String](../../../system/string/)، أو [XPathNodeIterator](../../xpathnodeiterator/) على التوالي.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XPathExpression](../../xpathexpression/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::Evaluate(SharedPtr\<XPathExpression\>, SharedPtr\<XPathNodeIterator\>) method


يستخدم السياق المقدم لتقييم [XPathExpression](../../xpathexpression/)، ويعيد النتيجة ذات النوع.

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathNavigator::Evaluate(SharedPtr<XPathExpression> expr, SharedPtr<XPathNodeIterator> context)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| expr | SharedPtr\<XPathExpression\> | [XPathExpression](../../xpathexpression/) يمكن تقييمه. |
| context | SharedPtr\<XPathNodeIterator\> | [XPathNodeIterator](../../xpathnodeiterator/) يشير إلى مجموعة العقد المختارة التي سيُجرى عليها التقييم. |

### ReturnValue

نتيجة التعبير ([Boolean](../../../system/boolean/)، رقم، سلسلة، أو مجموعة عقد). هذا يتطابق مع كائنات [Boolean](../../../system/boolean/)، [Double](../../../system/double/)، [String](../../../system/string/)، أو [XPathNodeIterator](../../xpathnodeiterator/) على التوالي.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XPathExpression](../../xpathexpression/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::Evaluate(String) method


يقيم التعبير [XPath](../../) المحدد ويعيد النتيجة ذات النوع.

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathNavigator::Evaluate(String xpath)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| xpath | String | سلسلة تمثل تعبير [XPath](../../) يمكن تقييمه. |

### ReturnValue

نتيجة التعبير ([Boolean](../../../system/boolean/)، رقم، سلسلة، أو مجموعة عقد). هذا يتطابق مع كائنات [Boolean](../../../system/boolean/)، [Double](../../../system/double/)، [String](../../../system/string/)، أو [XPathNodeIterator](../../xpathnodeiterator/) على التوالي.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::Evaluate(String, SharedPtr\<IXmlNamespaceResolver\>) method


يقيم التعبير [XPath](../../) المحدد ويعيد النتيجة ذات النوع، باستخدام كائن [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) المحدد لحل بادئات النطاق في تعبير [XPath](../../).

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathNavigator::Evaluate(String xpath, SharedPtr<IXmlNamespaceResolver> resolver)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| xpath | String | سلسلة تمثل تعبير [XPath](../../) يمكن تقييمه. |
| resolver | SharedPtr\<IXmlNamespaceResolver\> | كائن [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) المستخدم لحل بادئات النطاق في تعبير [XPath](../../). |

### ReturnValue

نتيجة التعبير ([Boolean](../../../system/boolean/)، رقم، سلسلة، أو مجموعة عقد). هذا يتطابق مع كائنات [Boolean](../../../system/boolean/)، [Double](../../../system/double/)، [String](../../../system/string/)، أو [XPathNodeIterator](../../xpathnodeiterator/) على التوالي.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
