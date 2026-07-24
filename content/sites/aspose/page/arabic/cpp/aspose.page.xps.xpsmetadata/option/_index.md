---
title: "الفئة Aspose::Page::XPS::XpsMetadata::Option"
linktitle: "Option"
second_title: "Aspose.Page لـ C++"
description: "الفئة Aspose::Page::XPS::XpsMetadata::Option. الفئة التي تنفّذ PrintTicketOption شائع. الفئة الأساسية لجميع الخيارات المعرفة في المخطط. عنصر Option يحتوي على جميع عناصر Property و ScoredProperty المرتبطة بهذا الخيار. في C++."
type: docs
weight: 7600
url: /ar/cpp/aspose.page.xps.xpsmetadata/option/
---
## Option class


الفئة التي تنفّذ [PrintTicket](../printticket/)**[Option](./)** شائع. الفئة الأساسية لجميع الخيارات المعرفة في المخطط. عنصر [Option](./) يحتوي على جميع عناصر [Property](../property/) و [ScoredProperty](../scoredproperty/) المرتبطة بهذا الخيار. [https://docs.microsoft.com/en-us/windows/win32/printdocs/option](https://docs.microsoft.com/en-us/windows/win32/printdocs/option).

```cpp
class Option : public Aspose::Page::XPS::XpsMetadata::CompositePrintTicketElement,
               public virtual Aspose::Page::XPS::XpsMetadata::IFeatureItem
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<IOptionItem\>\>\&) | يضيف قائمة من العناصر إلى نهاية قائمة عناصر هذا الخيار. يجب أن يكون كل عنصر إما مثالاً لـ [ScoredProperty](../scoredproperty/) أو [Property](../property/). |
| [Option](./option/)(System::String, const System::ArrayPtr\<System::SharedPtr\<IOptionItem\>\>\&) | ينشئ مثيل خيار [PrintTicket](../printticket/) جديد. |
| [Option](./option/)(const System::ArrayPtr\<System::SharedPtr\<IOptionItem\>\>\&) | ينشئ مثيل خيار [PrintTicket](../printticket/) جديد. |
| [Option](./option/)(System::SharedPtr\<Option\>) | ينشئ مثيل خيار مستنسخ. |
## انظر أيضًا

* Class [CompositePrintTicketElement](../compositeprintticketelement/)
* Class [IFeatureItem](../ifeatureitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
