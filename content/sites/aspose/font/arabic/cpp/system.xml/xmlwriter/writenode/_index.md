---
title: "طريقة System::Xml::XmlWriter::WriteNode"
linktitle: "WriteNode"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::XmlWriter::WriteNode. عند تجاوزها في فئة مشتقة، تنسخ كل شيء من القارئ إلى الكاتب وتنتقل بالقارئ إلى بداية الأخ التالي في C++."
type: docs
weight: 2600
url: /ar/cpp/system.xml/xmlwriter/writenode/
---
## XmlWriter::WriteNode(SharedPtr\<XmlReader\>, bool) method


عند تجاوزها في فئة مشتقة، تنسخ كل شيء من القارئ إلى الكاتب وتنتقل القارئ إلى بداية الأخ الأصغر التالي.

```cpp
virtual void System::Xml::XmlWriter::WriteNode(SharedPtr<XmlReader> reader, bool defattr)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| reader | SharedPtr\<XmlReader\> | الـ [XmlReader](../../xmlreader/) للقراءة منه. |
| defattr | bool | **true** لنسخ السمات الافتراضية من [XmlReader](../../xmlreader/); وإلا **false**. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../xmlreader/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlWriter::WriteNode(SharedPtr\<XPath::XPathNavigator\>, bool) method


ينسخ كل شيء من كائن XPathNavigator إلى الكاتب. يبقى موضع XPathNavigator دون تغيير.

```cpp
virtual void System::Xml::XmlWriter::WriteNode(SharedPtr<XPath::XPathNavigator> navigator, bool defattr)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| navigator | SharedPtr\<XPath::XPathNavigator\> | الـ XPathNavigator للنسخ منه. |
| defattr | bool | **true** لنسخ السمات الافتراضية؛ وإلا، **false**. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
