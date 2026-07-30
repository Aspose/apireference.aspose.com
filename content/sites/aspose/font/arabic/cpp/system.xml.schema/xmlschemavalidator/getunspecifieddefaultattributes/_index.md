---
title: "طريقة System::Xml::Schema::XmlSchemaValidator::GetUnspecifiedDefaultAttributes"
linktitle: "GetUnspecifiedDefaultAttributes"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::Schema::XmlSchemaValidator::GetUnspecifiedDefaultAttributes. تتحقق من قيود الهوية على السمات الافتراضية وتملأ القائمة المحددة بكائنات XmlSchemaAttribute لأي سمات ذات قيم افتراضية لم يتم التحقق منها مسبقًا باستخدام طريقة XmlSchemaValidator::ValidateAttribute في سياق العنصر في C++."
type: docs
weight: 900
url: /ar/cpp/system.xml.schema/xmlschemavalidator/getunspecifieddefaultattributes/
---
## XmlSchemaValidator::GetUnspecifiedDefaultAttributes method


يتحقق من قيود الهوية على السمات الافتراضية ويملأ القائمة المحددة بكائنات [XmlSchemaAttribute](../../xmlschemaattribute/) لأي سمات ذات قيم افتراضية لم يتم التحقق منها مسبقًا باستخدام طريقة [XmlSchemaValidator::ValidateAttribute](../validateattribute/) في سياق العنصر.

```cpp
void System::Xml::Schema::XmlSchemaValidator::GetUnspecifiedDefaultAttributes(const SharedPtr<Collections::Generic::List<SharedPtr<Object>>> &defaultAttributes)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| defaultAttributes | const SharedPtr\<Collections::Generic::List\<SharedPtr\<Object\>\>\>\& | قائمة لتملأ بكائنات [XmlSchemaAttribute](../../xmlschemaattribute/) لأي سمات لم يتم مواجهتها بعد أثناء التحقق في سياق العنصر. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [List](../../../system.collections.generic/list/)
* Class [Object](../../../system/object/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
