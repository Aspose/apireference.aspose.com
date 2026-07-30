---
title: "System::Xml::XmlValidatingReader::get_LocalName طريقة"
linktitle: "get_LocalName"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::XmlValidatingReader::get_LocalName طريقة. تُرجِع الاسم المحلي للعقدة الحالية في C++."
type: docs
weight: 1600
url: /ar/cpp/system.xml/xmlvalidatingreader/get_localname/
---
## XmlValidatingReader::get_LocalName method


يعيد الاسم المحلي للعقدة الحالية.

```cpp
String System::Xml::XmlValidatingReader::get_LocalName() override
```


### ReturnValue

اسم العقدة الحالية مع إزالة البادئة. على سبيل المثال، **LocalName** هو **book** للعنصر **<bk:book>**. لأنواع العقد التي لا تملك اسمًا (مثل **[Text](../../../system.text/)**، **Comment**، وما إلى ذلك)، تُعيد هذه الطريقة [String::Empty](../../../system/string/empty/).

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
