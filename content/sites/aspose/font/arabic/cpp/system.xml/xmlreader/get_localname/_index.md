---
title: "System::Xml::XmlReader::get_LocalName طريقة"
linktitle: "get_LocalName"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::XmlReader::get_LocalName طريقة. عند تجاوزها في فئة مشتقة، تحصل على الاسم المحلي للعقدة الحالية في C++."
type: docs
weight: 1400
url: /ar/cpp/system.xml/xmlreader/get_localname/
---
## XmlReader::get_LocalName method


عند تجاوزها في فئة مشتقة، تحصل على الاسم المحلي للعقدة الحالية.

```cpp
virtual String System::Xml::XmlReader::get_LocalName()=0
```


### ReturnValue

اسم العقدة الحالية مع إزالة البادئة. على سبيل المثال، **LocalName** هو **book** للعنصر **<bk:book>**. لأنواع العقد التي لا تملك اسمًا (مثل **[Text](../../../system.text/)**، **Comment**، وما إلى ذلك)، تُعيد هذه الطريقة [String::Empty](../../../system/string/empty/).

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
