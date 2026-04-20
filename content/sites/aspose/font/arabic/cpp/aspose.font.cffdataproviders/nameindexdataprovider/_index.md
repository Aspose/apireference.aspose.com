---
title: "فئة Aspose::Font::CffDataProviders::NameIndexDataProvider"
linktitle: "NameIndexDataProvider"
second_title: "Aspose.Font لـ C++"
description: "فئة Aspose::Font::CffDataProviders::NameIndexDataProvider. تُعلن عن الوظيفة للوصول إلى بنية CFF Name INDEX في C++."
type: docs
weight: 500
url: /ar/cpp/aspose.font.cffdataproviders/nameindexdataprovider/
---
## NameIndexDataProvider class


يعلن عن وظيفة للوصول إلى بنية CFF Name INDEX.

```cpp
class NameIndexDataProvider : public Aspose::Font::CffDataProviders::ICffIndexDataProvider
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [AddName](./addname/)(System::String) | يضيف اسم خط إلى بنية Name INDEX. استخدم هذه الطريقة بحذر لأن كل اسم خط في بنية CFF Name INDEX يجب أن يكون له بنية DICT مقابلة في فهرس Top DICT وفقًا لمواصفات CFF. |
| virtual [get_Count](./get_count/)() | عدد الكائنات في بنية CFF INDEX. |
| virtual [GetName](./getname/)(int32_t) | يحصل على اسم الخط في الفهرس المحدد. |
| virtual [GetRawBytes](./getrawbytes/)() | يحصل على جميع بايتات بنية CFF INDEX. |
| virtual [idx_get](./idx_get/)(int32_t) | يحصل/يضبط اسم الخط في الفهرس المحدد. |
| virtual [idx_set](./idx_set/)(int32_t, System::String) | يحصل/يضبط اسم الخط في الفهرس المحدد. |
| virtual [RemoveName](./removename/)(int32_t) | يزيل الاسم في الفهرس المحدد. استخدم هذه الطريقة بحذر لأن كل اسم خط في بنية CFF Name INDEX يجب أن يكون له بنية DICT مقابلة في فهرس Top DICT وفقًا لمواصفات CFF. |
| virtual [SetName](./setname/)(System::String, int32_t) | يضبط اسم الخط في الفهرس المحدد. |
## انظر أيضًا

* Class [ICffIndexDataProvider](../icffindexdataprovider/)
* Namespace [Aspose::Font::CffDataProviders](../)
* Library [Aspose.Font for C++](../../)
