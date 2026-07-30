---
title: "System::Xml::XmlNodeReader::get_LocalName طريقة"
linktitle: "get_LocalName"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::XmlNodeReader::get_LocalName طريقة. تُعيد الاسم المحلي للعقدة الحالية في C++."
type: docs
weight: 1300
url: /ar/cpp/system.xml/xmlnodereader/get_localname/
---
## XmlNodeReader::get_LocalName method


يعيد الاسم المحلي للعقدة الحالية.

```cpp
String System::Xml::XmlNodeReader::get_LocalName() override
```


### ReturnValue

اسم العقدة الحالية مع إزالة البادئة. على سبيل المثال، **LocalName** هو **book** للعنصر **<bk:book>**. لأنواع العقد التي لا تملك اسمًا (مثل **[Text](../../../system.text/)**، **Comment**، وما إلى ذلك)، تُعيد هذه الطريقة [String::Empty](../../../system/string/empty/).

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
