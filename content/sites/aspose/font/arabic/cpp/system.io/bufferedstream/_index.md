---
title: "فئة System::IO::BufferedStream"
linktitle: "BufferedStream"
second_title: "Aspose.Font لـ C++"
description: "فئة System::IO::BufferedStream. تضيف طبقة تخزين مؤقت فوق تدفق آخر. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1000
url: /ar/cpp/system.io/bufferedstream/
---
## BufferedStream class


يضيف طبقة تخزين مؤقت فوق تدفق آخر. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class BufferedStream : public System::IO::Stream
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [BufferedStream](./bufferedstream/)(const SharedPtr\<Stream\>\&) | ينشئ كائنًا من نوع [BufferedStream](./) يلف التدفق المحدد ويستخدم مخزنًا مؤقتًا بطول 4096 بايت. |
| [BufferedStream](./bufferedstream/)(const SharedPtr\<Stream\>\&, int) | ينشئ كائنًا من نوع [BufferedStream](./) يلف التدفق المحدد ويستخدم مخزنًا مؤقتًا بالحجم المحدد. |
| [Flush](./flush/)() override | يكتب محتوى المخزن المؤقت إلى التدفق الأساسي. |
| [get_CanRead](./get_canread/)() const override | يحدد ما إذا كان الدفق قابلًا للقراءة. |
| [get_CanSeek](./get_canseek/)() const override | يحدد ما إذا كان التدفق يدعم البحث. |
| [get_CanWrite](./get_canwrite/)() const override | يحدد ما إذا كان التدفق قابلًا للكتابة. |
| [get_Length](./get_length/)() const override | يرجع طول التدفق. |
| [get_Position](./get_position/)() const override | يعيد الموضع الحالي للتدفق. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | يقرأ عدد البايتات المحدد من التدفق الأساسي ويكتبها إلى مصفوفة البايتات المحددة. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | يقرأ عدد البايتات المحدد من التدفق الأساسي ويكتبها إلى مصفوفة البايتات المحددة. |
| [ReadByte](./readbyte/)() override | يقرأ بايتًا واحدًا من التدفق الأساسي ويرجع قيمة عدد صحيح 32 بت مكافئة لقيمة البايت المقروء. |
| [Seek](./seek/)(int64_t, SeekOrigin) override | يضبط موضع التدفق الممثل بالكائن الحالي. |
| [set_Position](./set_position/)(int64_t) override | يفرغ المخزن المؤقت إلى التدفق الأساسي ثم يضبط موضع التدفق. |
| [SetLength](./setlength/)(int64_t) override | يضبط طول التدفق الممثل بالكائن الحالي. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | يكتب النطاق الفرعي المحدد من البايتات من مصفوفة البايتات المحددة إلى التدفق الأساسي. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | يكتب النطاق الفرعي المحدد من البايتات من مصفوفة البايتات المحددة إلى التدفق الأساسي. |
| [WriteByte](./writebyte/)(uint8_t) override | يكتب القيمة العددية غير الموقعة 8-بت المحددة إلى التدفق الأساسي. |
| virtual [~BufferedStream](./~bufferedstream/)() | المدمر. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [Null](../stream/null/) | تدفق بدون تخزين أساسي. |
## انظر أيضًا

* Class [Stream](../stream/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
