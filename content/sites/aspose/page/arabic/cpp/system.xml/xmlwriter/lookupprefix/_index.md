---
title: "System::Xml::XmlWriter::LookupPrefix طريقة"
linktitle: "LookupPrefix"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::XmlWriter::LookupPrefix طريقة. عند تجاوزها في فئة مشتقة، تُعيد أقرب بادئة معرفة في نطاق المساحة الاسمية الحالي لمعرفة URI في C++."
type: docs
weight: 800
url: /ar/cpp/system.xml/xmlwriter/lookupprefix/
---
## XmlWriter::LookupPrefix method


عند تجاوزها في فئة مشتقة، يعيد أقرب بادئة معرفة في نطاق مساحة الأسماء الحالي لعنوان URI الخاص بمساحة الأسماء.

```cpp
virtual String System::Xml::XmlWriter::LookupPrefix(String ns)=0
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| ns | String | معرف URI للمساحة الاسمية الذي تريد العثور على بادئه. |

### ReturnValue

البادئة المطابقة أو **nullptr** إذا لم يتم العثور على معرف URI للمساحة الاسمية المطابقة في النطاق الحالي.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
