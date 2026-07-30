---
title: "طريقة System::Xml::XmlWriter::LookupPrefix"
linktitle: "LookupPrefix"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::XmlWriter::LookupPrefix. عند تجاوزها في فئة مشتقة، تُعيد أقرب بادئة معرفة في نطاق المساحة الاسمية الحالي لمعرفة URI في C++."
type: docs
weight: 800
url: /ar/cpp/system.xml/xmlwriter/lookupprefix/
---
## XmlWriter::LookupPrefix method


عند تجاوزها في فئة مشتقة، تُرجِع أقرب بادئة معرفة في نطاق الاسم الحالي لعنوان URI الخاص بالمساحة الاسمية.

```cpp
virtual String System::Xml::XmlWriter::LookupPrefix(String ns)=0
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| ns | String | URI مساحة الاسم التي تريد إيجاد البادئة لها. |

### ReturnValue

البادئة المطابقة أو **nullptr** إذا لم يتم العثور على URI للمساحة الاسمية المطابقة في النطاق الحالي.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
