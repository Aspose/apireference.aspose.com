---
title: "فئة Aspose::Page::XPS::XpsMetadata::Property"
linktitle: "خاصية"
second_title: "Aspose.Page لـ C++"
description: "فئة Aspose::Page::XPS::XpsMetadata::Property. الفئة التي تنفّذ PrintTicketProperty شائع. الفئة الأساسية لجميع الخصائص المعرفة في المخطط. عنصر Property يعلن عن جهاز أو تنسيق وظيفة أو خاصية أخرى ذات صلة يُعطى اسمها بواسطة السمة name. عنصر Value يُستخدم لتعيين قيمة للخاصية Property. يمكن أن تكون Property معقدة، وقد تحتوي على عدة خصائص فرعية. الخصائص الفرعية تُمثَّل أيضًا بعناصر Property.  في C++."
type: docs
weight: 14300
url: /ar/cpp/aspose.page.xps.xpsmetadata/property/
---
## Property class


الفئة التي تنفّذ **[Property](./)** شائعًا لـ [PrintTicket](../printticket/). الفئة الأساسية لجميع الخصائص المعرفة في المخطط. عنصر **[Property](./)** يعلن عن جهاز أو تنسيق وظيفة أو خاصية أخرى ذات صلة يُعطى اسمها بواسطة السمة name. عنصر [Value](../value/) يُستخدم لتعيين قيمة للـ **[Property](./)**. يمكن أن تكون **[Property](./)** معقدة، وقد تحتوي على عدة خصائص فرعية. الخصائص الفرعية تُمثَّل أيضًا بعناصر **[Property](./)**. [https://docs.microsoft.com/en-us/windows/win32/printdocs/property](https://docs.microsoft.com/en-us/windows/win32/printdocs/property).

```cpp
class Property : public Aspose::Page::XPS::XpsMetadata::CompositePrintTicketElement,
                 public virtual Aspose::Page::XPS::XpsMetadata::IPrintTicketItem,
                 public Aspose::Page::XPS::XpsMetadata::IFeatureItem,
                 public virtual Aspose::Page::XPS::XpsMetadata::IOptionItem,
                 public Aspose::Page::XPS::XpsMetadata::IScoredPropertyItem,
                 public Aspose::Page::XPS::XpsMetadata::IPropertyItem
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Property](./property/)(System::String, System::SharedPtr\<Property\>, const System::ArrayPtr\<System::SharedPtr\<IPropertyItem\>\>\&) | ينشئ مثيلًا جديدًا. |
| [Property](./property/)(System::String, System::SharedPtr\<Value\>, const System::ArrayPtr\<System::SharedPtr\<IPropertyItem\>\>\&) | ينشئ مثيلًا جديدًا. |
## انظر أيضًا

* Class [CompositePrintTicketElement](../compositeprintticketelement/)
* Class [IPrintTicketItem](../iprintticketitem/)
* Class [IFeatureItem](../ifeatureitem/)
* Class [IOptionItem](../ioptionitem/)
* Class [IScoredPropertyItem](../iscoredpropertyitem/)
* Class [IPropertyItem](../ipropertyitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
