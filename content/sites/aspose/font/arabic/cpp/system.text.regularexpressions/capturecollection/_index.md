---
title: "System::Text::RegularExpressions::CaptureCollection class"
linktitle: "CaptureCollection"
second_title: "Aspose.Font لـ C++"
description: "الفئة System::Text::RegularExpressions::CaptureCollection. قائمة الالتقاطات التي تم إجراؤها بواسطة مجموعة التقاط واحدة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 200
url: /ar/cpp/system.text.regularexpressions/capturecollection/
---
## CaptureCollection class


قائمة الالتقاطات التي تم إجراؤها بواسطة مجموعة التقاط واحدة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) function. لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class CaptureCollection : public System::Collections::Generic::List<CapturePtr>
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Add](./add/)(const CapturePtr\&) override | يعطل تعديل المجموعة. |
| [AddCapture](./addcapture/)(const CapturePtr\&) | طريقة خدمة لإضافة الالتقاط إلى المجموعة. |
| [Clear](./clear/)() override | يعطل تنظيف المجموعة. |
| [get_Count](./get_count/)() const override | يحصل على عدد الالتقاطات. |
| [get_IsReadOnly](./get_isreadonly/)() const override | يُعلِّم المجموعة كقراءة فقط. |
| [get_IsSynchronized](./get_issynchronized/)() const | يُعلِّم المجموعة بأنها غير متزامنة. |
| [idx_get](./idx_get/)(int) const override | مُستخرج [Capture](../capture/). |
| [operator[]](./operator[]/)(int) | مُستخرج [Capture](../capture/). |
| [operator[]](./operator[]/)(int) const | مُستخرج [Capture](../capture/). |
| [Remove](./remove/)(const CapturePtr\&) override | يعطل تعديل المجموعة. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Base](./base/) | نوع [Base](./base/). |
## انظر أيضًا

* Class [List](../../system.collections.generic/list/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Font for C++](../../)
