---
title: "Aspose::Page::XPS::XpsMetadata::Feature class"
linktitle: "ميزة"
second_title: "Aspose.Page لـ C++"
description: "Aspose::Page::XPS::XpsMetadata::Feature class. الفئة التي تغلف ميزة مخطط الطباعة العامة. الفئة الأساسية لجميع الميزات المعرفة في المخطط. عنصر Feature يحتوي على قائمة كاملة من عناصر Option و Property التي تصف بالكامل سمة الجهاز أو إعداد تنسيق الوظيفة أو أي خاصية ذات صلة أخرى.  في C++."
type: docs
weight: 2900
url: /ar/cpp/aspose.page.xps.xpsmetadata/feature/
---
## Feature class


الفئة التي تُغلف ميزة شائعة في مخطط الطباعة. الفئة الأساسية لجميع الميزات المعرفة بالمخطط. عنصر **[Feature](./)** يحتوي على قائمة كاملة من عناصر [Option](../option/) و[Property](../property/) التي تصف بالكامل سمة الجهاز أو إعداد تنسيق المهمة أو أي خاصية ذات صلة أخرى. [https://docs.microsoft.com/en-us/windows/win32/printdocs/feature](https://docs.microsoft.com/en-us/windows/win32/printdocs/feature).

```cpp
class Feature : public Aspose::Page::XPS::XpsMetadata::CompositePrintTicketElement,
                public virtual Aspose::Page::XPS::XpsMetadata::IPrintTicketItem,
                public virtual Aspose::Page::XPS::XpsMetadata::IFeatureItem
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<IFeatureItem\>\>\&) | يضيف قائمة من العناصر إلى نهاية قائمة عناصر هذه الميزة. يجب أن يكون كل عنصر إما [Feature](./) أو [Option](../option/) أو مثيل [Property](../property/). |
| [Feature](./feature/)(System::String, System::SharedPtr\<Option\>, const System::ArrayPtr\<System::SharedPtr\<IFeatureItem\>\>\&) | ينشئ مثيلًا جديدًا لميزة [PrintTicket](../printticket/). |
| [Feature](./feature/)(System::String, System::SharedPtr\<Feature\>, const System::ArrayPtr\<System::SharedPtr\<IFeatureItem\>\>\&) | ينشئ مثيلًا جديدًا لميزة [PrintTicket](../printticket/). |
## انظر أيضًا

* Class [CompositePrintTicketElement](../compositeprintticketelement/)
* Class [IPrintTicketItem](../iprintticketitem/)
* Class [IFeatureItem](../ifeatureitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
