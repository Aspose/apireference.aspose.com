---
title: "فئة System::ExceptionWrapper"
linktitle: "ExceptionWrapper"
second_title: "Aspose.Font لـ C++"
description: "فئة System::ExceptionWrapper. قالب يمثل غلاف الاستثناءات المشتقة من فئة Exception في C++."
type: docs
weight: 2600
url: /ar/cpp/system/exceptionwrapper/
---
## ExceptionWrapper class


قالب يمثل غلاف الاستثناءات المشتقة من فئة [Exception](../exception/).

```cpp
template<typename T>class ExceptionWrapper
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [ExceptionWrapper](./exceptionwrapper/)(std::nullptr_t) | ينشئ نسخة فارغة من فئة [ExceptionWrapper](./) لا تمثل أي استثناء. |
| [ExceptionWrapper](./exceptionwrapper/)(const ExceptionPtr\&) | ينشئ نسخة من فئة [ExceptionWrapper](./) تحتوي على المؤشر الممرر. |
| [ExceptionWrapper](./exceptionwrapper/)(const ExceptionWrapper\&) | منشئ النسخ. |
| [ExceptionWrapper](./exceptionwrapper/)(ExceptionWrapper\&&) | منشئ نقل. |
| explicit [ExceptionWrapper](./exceptionwrapper/)(Args\&&...) | منشئ يمرر المعلمات إلى منشئي فئة [Exception](../exception/) وينشئ مؤشرًا ذكيًا يحتفظ بنسخة جديدة من فئة [Exception](../exception/). |
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
| [ExceptionType](./exceptiontype/) | يُستخدم في وظائف التحويل. |
## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
