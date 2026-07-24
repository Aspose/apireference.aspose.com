---
title: "الفئة Aspose::Page::EPS::Util::ThreadLocal"
linktitle: "ThreadLocal"
second_title: "Aspose.Page لـ C++"
description: "الفئة Aspose::Page::EPS::Util::ThreadLocal. فئة تُستخدم لتكرار الوظيفة التي يوفرها نوع الغلاف System.Threading.ThreadLocal في .NET Framework 4.0 و 4.5. تُنفّذ أنواعًا مثالية وثابتة تكون محلية للخلية وتُشير إلى مثيلات مختلفة عبر الخيوط، على الرغم من أن نوع المثيل الفعلي الذي تُجمع منه الفئة قد يكون نفسه في C++."
type: docs
weight: 100
url: /ar/cpp/aspose.page.eps.util/threadlocal/
---
## ThreadLocal class


فئة تُستخدم لتكرار الوظيفة التي يوفرها نوع الغلاف System.Threading.ThreadLocal في .NET Framework 4.0 و 4.5. تُنفّذ هذه الفئة أنواعًا مثالية وثابتة محلية للثريد وتُشير إلى نسخ مختلفة عبر الخيوط، حتى وإن كان نوع النسخة الفعلي الذي تُجَمّع حوله الفئة قد يكون هو نفسه.

```cpp
template<typename T>class ThreadLocal : public System::IDisposable
```


| Parameter | الوصف |
| --- | --- |
| T | نوع المتغيّر لتغليفه في منطق اختيار الخيط |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [Dispose](./dispose/)() override | لا يفعل شيئًا. |
| [get_Value](./get_value/)() |  |
| [isValueCreated](./isvaluecreated/)() |  |
| [set_Value](./set_value/)(T) |  |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | عيّن الوسيط القالب رقم n كإشارة ضعيفة (بدلاً من المشتركة). يسمح بتبديل المؤشرات في الحاويات إلى وضع الضعيفة. |
| [ThreadLocal](./threadlocal/)(Factory) |  |
| static [to_T](./to_t/)(System::SharedPtr\<ThreadLocal\<T\>\>) |  |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Factory](./factory/) |  |

## انظر أيضًا

* Class [IDisposable](../../system/idisposable/)
* Namespace [Aspose::Page::EPS::Util](../)
* Library [Aspose.Page for C++](../../)
