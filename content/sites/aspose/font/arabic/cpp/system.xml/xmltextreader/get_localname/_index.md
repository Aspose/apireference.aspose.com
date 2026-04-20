---
title: "طريقة System::Xml::XmlTextReader::get_LocalName"
linktitle: "get_LocalName"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::XmlTextReader::get_LocalName. تُرجِع الاسم المحلي للعقدة الحالية في C++."
type: docs
weight: 1800
url: /ar/cpp/system.xml/xmltextreader/get_localname/
---
## XmlTextReader::get_LocalName method


يعيد الاسم المحلي للعقدة الحالية.

```cpp
String System::Xml::XmlTextReader::get_LocalName() override
```


### ReturnValue

اسم العقدة الحالية مع إزالة البادئة. على سبيل المثال، **LocalName** هو **book** للعنصر **<bk:book>**. لأنواع العقد التي لا تملك اسمًا (مثل **[Text](../../../system.text/)**، **Comment**، وما إلى ذلك)، تُعيد هذه الطريقة [String::Empty](../../../system/string/empty/).

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
