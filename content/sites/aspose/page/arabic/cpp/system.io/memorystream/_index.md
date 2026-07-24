---
title: "System::IO::MemoryStream class"
linktitle: "MemoryStream"
second_title: "Aspose.Page لـ C++"
description: "System::IO::MemoryStream class. يمثل تدفقًا يقرأ من الذاكرة ويكتب إليها. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيتسبب ذلك في أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1800
url: /ar/cpp/system.io/memorystream/
---
## MemoryStream class


يمثل تدفقًا يقرأ من الذاكرة ويكتب إليها. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أخطاء التأكيد. دائمًا قم بلف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class MemoryStream : public System::IO::Stream
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Close](./close/)() override | يغلق الدفق. |
| [Flush](./flush/)() override | لا يفعل شيئًا. |
| [get_CanRead](./get_canread/)() const override | يحدد ما إذا كان التدفق قابلًا للقراءة. |
| [get_CanSeek](./get_canseek/)() const override | يحدد ما إذا كان التدفق يدعم البحث. |
| [get_CanWrite](./get_canwrite/)() const override | يحدد ما إذا كان التدفق قابلًا للكتابة. |
| [get_Capacity](./get_capacity/)() | يعيد السعة الحالية لمخزن الذاكرة الأساسي. |
| [get_Length](./get_length/)() const override | يعيد طول التدفق بالبايت. |
| [get_Position](./get_position/)() const override | يعيد الموضع الحالي للتدفق. |
| virtual [GetBuffer](./getbuffer/)() | يعيد مؤشرًا إلى المخزن المؤقت الأساسي. |
| [MemoryStream](./memorystream/)() | ينشئ نسخة جديدة من فئة [MemoryStream](./) بسعة أولية تساوي 0. |
| [MemoryStream](./memorystream/)(int) | ينشئ نسخة جديدة من فئة [MemoryStream](./) تمثل تدفقًا يعتمد على مخزن ذاكرة بالحجم المحدد. |
| [MemoryStream](./memorystream/)(const ArrayPtr\<uint8_t\>\&, bool) | ينشئ نسخة جديدة من فئة [MemoryStream](./) تمثل تدفق ذاكرة متصل بالمخزن المحدد. يحدد أحد المعاملات ما إذا كان التدفق قابلًا للكتابة. |
| [MemoryStream](./memorystream/)(const ArrayPtr\<uint8_t\>\&, int, int, bool, bool) | ينشئ نسخة جديدة من فئة [MemoryStream](./) تمثل تدفق ذاكرة متصل بقطاع من المخزن المحدد يبدأ عند الفهرس المحدد ويشمل عدد العناصر المحدد. يحدد المعاملات ما إذا كان التدفق قابلًا للكتابة وما إذا كان يمكن استدعاء الطريقة GetBytes(). |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | يقرأ عدد البايتات المحدد من التدفق ويكتبها إلى مصفوفة البايتات المحددة. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | يقرأ عدد البايتات المحدد من التدفق ويكتبها إلى مصفوفة البايتات المحددة. |
| [ReadByte](./readbyte/)() override | يقرأ بايتًا واحدًا من التدفق ويعيد قيمة عدد صحيح 32‑بت مكافئة لقيمة البايت المقروء. |
| [Seek](./seek/)(int64_t, SeekOrigin) override | يضبط موضع التدفق الممثل بالكائن الحالي. |
| [set_Capacity](./set_capacity/)(int) | يضبط سعة المخزن المؤقت الأساسي. |
| [set_Position](./set_position/)(int64_t) override | يضبط موضع التدفق. |
| [SetLength](./setlength/)(int64_t) override | يضبط طول التدفق الممثل بالكائن الحالي. |
| virtual [ToArray](./toarray/)() | يعيد نسخة من المخزن المؤقت الأساسي كمصفوفة من البايتات. |
| [TryGetBuffer](./trygetbuffer/)(ArraySegment\<uint8_t\>\&) | يعيد مصفوفة البايتات غير الموقعة التي تم إنشاء هذا التدفق منها. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | يكتب النطاق الفرعي المحدد من البايتات من مصفوفة البايتات المحددة إلى التدفق. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | يكتب النطاق الفرعي المحدد من البايتات من مصفوفة البايتات المحددة إلى التدفق. |
| [WriteByte](./writebyte/)(uint8_t) override | يكتب القيمة المحددة للعدد الصحيح غير الموقع 8‑بت إلى التدفق. |
| virtual [WriteTo](./writeto/)(SharedPtr\<Stream\>) | يكتب محتوى المخزن المؤقت الأساسي إلى التدفق المحدد. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [Null](../stream/null/) | تدفق بدون تخزين أساسي. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى الذات. |
## انظر أيضًا

* Class [Stream](../stream/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
