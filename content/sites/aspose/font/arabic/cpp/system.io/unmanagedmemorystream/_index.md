---
title: "فئة System::IO::UnmanagedMemoryStream"
linktitle: "UnmanagedMemoryStream"
second_title: "Aspose.Font لـ C++"
description: "فئة System::IO::UnmanagedMemoryStream. توفر الوصول إلى الذاكرة غير المدارّة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() . لا تقم أبدًا بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبّب أخطاء وقت التشغيل أو أعطال التأكيد. احْطِ دائمًا هذه الفئة في مؤشر System::SmartPtr واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2800
url: /ar/cpp/system.io/unmanagedmemorystream/
---
## UnmanagedMemoryStream class


توفر الوصول إلى الذاكرة غير المدارّة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) . لا تقم أبدًا بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبّب أخطاء وقت التشغيل أو أعطال التأكيد. احْطِ دائمًا هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class UnmanagedMemoryStream : public System::IO::Stream
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Flush](./flush/)() override | لا يفعل شيئًا. |
| [get_CanRead](./get_canread/)() const override | يحدد ما إذا كان الدفق قابلًا للقراءة. |
| [get_CanSeek](./get_canseek/)() const override | يحدد ما إذا كان التدفق يدعم البحث. |
| [get_CanWrite](./get_canwrite/)() const override | يحدد ما إذا كان التدفق قابلًا للكتابة. |
| virtual [get_Capacity](./get_capacity/)() const | يعيد السعة الحالية لمخزن الذاكرة الأساسي. |
| [get_Length](./get_length/)() const override | يعيد طول التدفق بالبايت. |
| [get_Position](./get_position/)() const override | يعيد الموضع الحالي للتدفق. |
| [get_PositionPointer](./get_positionpointer/)() | غير مُنفّذ. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | يقرأ عدد البايتات المحدد من التدفق ويكتبها إلى مصفوفة البايتات المحددة. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | يقرأ عدد البايتات المحدد من التدفق ويكتبها إلى مصفوفة البايتات المحددة. |
| [Seek](./seek/)(int64_t, SeekOrigin) override | يضبط موضع التدفق الممثل بالكائن الحالي. |
| [set_Position](./set_position/)(int64_t) override | يضبط موضع التدفق. |
| [set_PositionPointer](./set_positionpointer/)(uint8_t *) | غير مُنفّذ. |
| [SetLength](./setlength/)(int64_t) override | غير مُنفّذ. |
| [UnmanagedMemoryStream](./unmanagedmemorystream/)(uint8_t *, int64_t) | ينشئ نسخة جديدة من [UnmanagedMemoryStream](./). |
| [UnmanagedMemoryStream](./unmanagedmemorystream/)(uint8_t *, int64_t, int64_t, FileAccess) | ينشئ نسخة جديدة من [UnmanagedMemoryStream](./). |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | غير مُنفّذ. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | غير مُنفّذ. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [Null](../stream/null/) | تدفق بدون تخزين أساسي. |
## انظر أيضًا

* Class [Stream](../stream/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
