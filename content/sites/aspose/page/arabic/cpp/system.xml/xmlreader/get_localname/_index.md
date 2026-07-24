---
title: "طريقة System::Xml::XmlReader::get_LocalName"
linktitle: "get_LocalName"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Xml::XmlReader::get_LocalName. عند تجاوزها في فئة مشتقة، تحصل على الاسم المحلي للعقدة الحالية في C++."
type: docs
weight: 1400
url: /ar/cpp/system.xml/xmlreader/get_localname/
---
## XmlReader::get_LocalName method


عند تجاوزها في فئة مشتقة، تُعيد الاسم المحلي للعقدة الحالية.

```cpp
virtual String System::Xml::XmlReader::get_LocalName()=0
```


### ReturnValue

اسم العقدة الحالية مع إزالة الاختصار. على سبيل المثال، **LocalName** هو **book** للعنصر **<bk:book>**. لأنواع العقد التي لا تمتلك اسماً (مثل **[Text](../../../system.text/)**، **Comment**، وما إلى ذلك)، تُعيد هذه الطريقة [String::Empty](../../../system/string/empty/).

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
