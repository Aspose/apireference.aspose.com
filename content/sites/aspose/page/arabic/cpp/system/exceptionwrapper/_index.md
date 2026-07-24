---
title: "فئة System::ExceptionWrapper"
linktitle: "ExceptionWrapper"
second_title: "Aspose.Page لـ C++"
description: "فئة System::ExceptionWrapper. قالب يمثل غلافًا للاستثناءات المشتقة من فئة Exception في C++."
type: docs
weight: 2600
url: /ar/cpp/system/exceptionwrapper/
---
## ExceptionWrapper class


قالب يمثل غلاف الاستثناءات المشتقة من الفئة [Exception](../exception/).

```cpp
template<typename T>class ExceptionWrapper
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [ExceptionWrapper](./exceptionwrapper/)(std::nullptr_t) | ينشئ نسخة فارغة من الفئة [ExceptionWrapper](./) التي لا تمثل أي استثناء. |
| [ExceptionWrapper](./exceptionwrapper/)(const ExceptionPtr\&) | ينشئ نسخة من الفئة [ExceptionWrapper](./) التي تحتوي على المؤشر الممرَّر. |
| [ExceptionWrapper](./exceptionwrapper/)(const ExceptionWrapper\&) | منشئ النسخ. |
| [ExceptionWrapper](./exceptionwrapper/)(ExceptionWrapper\&&) | منشئ نقل. |
| explicit [ExceptionWrapper](./exceptionwrapper/)(Args\&&...) | منشئ يمرّر المعلمات إلى منشئي الفئة [Exception](../exception/) ويُنشئ مؤشرًا ذكيًا يحمل نسخة جديدة من الفئة [Exception](../exception/). |
| static [operator new](./operatornew/)(std::size_t) |  |
| static [operator new[]](./operatornew[]/)(std::size_t) |  |
| [operator SharedPtr< Object >](./operatorsharedptr_object_/)() | عامل تحويل ضمني إلى [SharedPtr<Object>](../sharedptr/) |
| [operator->](./operator-_/)() const | يسمح بالوصول إلى أعضاء كائن [Exception](../exception/). |
| [operator=](./operator=/)(const ExceptionWrapper\&) | عامل الإسناد. |
| [operator=](./operator=/)(ExceptionWrapper\&&) | عامل إسناد النقل. |
| static [Type](./type/)() | اختصار للحصول على كائن [System::TypeInfo](../typeinfo/) لنوع [Exception](../exception/). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [ExceptionType](./exceptiontype/) | يُستخدم لتقنيات التحويل. |
## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
