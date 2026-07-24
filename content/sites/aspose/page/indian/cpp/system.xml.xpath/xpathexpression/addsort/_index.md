---
title: "System::Xml::XPath::XPathExpression::AddSort मेथड"
linktitle: "AddSort"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XPath::XPathExpression::AddSort मेथड। जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो C++ में निर्दिष्ट IComparer ऑब्जेक्ट के अनुसार XPath अभिव्यक्ति द्वारा चयनित नोड्स को क्रमबद्ध करता है।"
type: docs
weight: 100
url: /hi/cpp/system.xml.xpath/xpathexpression/addsort/
---
## XPathExpression::AddSort(SharedPtr\<Object\>, SharedPtr\<Collections::Generic::IComparer\<SharedPtr\<Object\>\>\>) method


जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो निर्दिष्ट IComparer ऑब्जेक्ट के अनुसार [XPath](../../) अभिव्यक्ति द्वारा चयनित नोड्स को क्रमबद्ध करता है।

```cpp
virtual void System::Xml::XPath::XPathExpression::AddSort(SharedPtr<Object> expr, SharedPtr<Collections::Generic::IComparer<SharedPtr<Object>>> comparer)=0
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| expr | SharedPtr\<Object\> | एक ऑब्जेक्ट जो सॉर्ट कुंजी का प्रतिनिधित्व करता है। यह नोड का **string** मान या एक संकलित [XPath](../../) अभिव्यक्ति वाला [XPathExpression](../) ऑब्जेक्ट हो सकता है। |
| comparer | SharedPtr\<Collections::Generic::IComparer\<SharedPtr\<Object\>\>\> | एक IComparer ऑब्जेक्ट जो दो ऑब्जेक्ट्स की समानता के लिए विशिष्ट डेटा प्रकार की तुलना प्रदान करता है। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [IComparer](../../../system.collections.generic/icomparer/)
* Class [XPathExpression](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathExpression::AddSort(SharedPtr\<Object\>, XmlSortOrder, XmlCaseOrder, String, XmlDataType) method


जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो प्रदान किए गए पैरामीटरों के अनुसार [XPath](../../) अभिव्यक्ति द्वारा चयनित नोड्स को क्रमबद्ध करता है।

```cpp
virtual void System::Xml::XPath::XPathExpression::AddSort(SharedPtr<Object> expr, XmlSortOrder order, XmlCaseOrder caseOrder, String lang, XmlDataType dataType)=0
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| expr | SharedPtr\<Object\> | एक ऑब्जेक्ट जो सॉर्ट कुंजी का प्रतिनिधित्व करता है। यह नोड का **string** मान या एक संकलित [XPath](../../) अभिव्यक्ति वाला [XPathExpression](../) ऑब्जेक्ट हो सकता है। |
| order | XmlSortOrder | एक [XmlSortOrder](../../xmlsortorder/) मान जो क्रम को दर्शाता है। |
| caseOrder | XmlCaseOrder | एक [XmlCaseOrder](../../xmlcaseorder/) मान जो बड़े और छोटे अक्षरों को क्रमबद्ध करने का तरीका दर्शाता है। |
| lang | String | तुलना के लिए उपयोग की जाने वाली भाषा। यह [Globalization::CultureInfo](../../../system.globalization/cultureinfo/) क्लास का उपयोग करता है जिसे भाषा प्रकारों के लिए [String::Compare](../../../system/string/compare/) मेथड में पास किया जा सकता है, उदाहरण के लिए, \"us-en\" के लिए U.S. अंग्रेज़ी। यदि खाली स्ट्रिंग निर्दिष्ट की जाती है, तो सिस्टम पर्यावरण का उपयोग करके [Globalization::CultureInfo](../../../system.globalization/cultureinfo/) निर्धारित किया जाता है। |
| dataType | XmlDataType | एक [XmlDataType](../../xmldatatype/) मान जो डेटा प्रकार के क्रम को दर्शाता है। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Enum [XmlSortOrder](../../xmlsortorder/)
* Enum [XmlCaseOrder](../../xmlcaseorder/)
* Class [String](../../../system/string/)
* Enum [XmlDataType](../../xmldatatype/)
* Class [XPathExpression](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
