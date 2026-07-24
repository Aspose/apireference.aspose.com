---
title: "System::IO::FileStream فئة"
linktitle: "FileStream"
second_title: "Aspose.Page لـ C++"
description: "فئة System::IO::FileStream. تمثل تدفق ملف يدعم عمليات القراءة والكتابة المتزامنة وغير المتزامنة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيتسبب ذلك في أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1500
url: /ar/cpp/system.io/filestream/
---
## FileStream class


تمثل تدفق ملف يدعم عمليات القراءة والكتابة المتزامنة وغير المتزامنة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيتسبب ذلك في أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class FileStream : public System::IO::Stream
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Close](./close/)() override | يغلق كائن [FileStream](./) الحالي. |
| [FileStream](./filestream/)(const String\&, FileMode) | ينشئ نسخة جديدة من فئة [FileStream](./) ويُهيئها بالمعاملات المحددة. |
| [FileStream](./filestream/)(const String\&, FileMode, FileAccess, FileShare, int32_t, FileOptions) | ينشئ نسخة جديدة من فئة [FileStream](./) ويُهيئها بالمعاملات المحددة. |
| [FileStream](./filestream/)(const String\&, FileMode, FileAccess, FileShare, int32_t, bool) | ينشئ نسخة جديدة من فئة [FileStream](./) ويُهيئها بالمعاملات المحددة. |
| [FileStream](./filestream/)(const FileStream\&) |  |
| [Flush](./flush/)() override | يمسح مخازن هذا التدفق ويكتب جميع البيانات المخزنة في الملف الأساسي. |
| [Flush](./flush/)(bool) | يمسح مخازن هذا التدفق ويكتب جميع البيانات المخزنة في الملف الأساسي. مرادف للطريقة [Flush()](./flush/). |
| [FlushAsync](./flushasync/)(const Threading::CancellationToken\&) override | يمسح بشكل غير متزامن جميع المخازن المؤقتة لهذا التدفق، مما يؤدي إلى كتابة أي بيانات مخزنة مؤقتًا إلى الجهاز الأساسي، ويراقب طلبات الإلغاء. |
| [get_CanRead](./get_canread/)() const override | يحدد ما إذا كان التدفق قابلًا للقراءة. |
| [get_CanSeek](./get_canseek/)() const override | يحدد ما إذا كان التدفق يدعم البحث. |
| [get_CanWrite](./get_canwrite/)() const override | يحدد ما إذا كان التدفق قابلًا للكتابة. |
| [get_Length](./get_length/)() const override | يعيد طول التدفق بالبايت. |
| [get_Name](./get_name/)() const | يرجع اسم الملف المغلف بواسطة كائن [FileStream](./) الحالي. |
| [get_Position](./get_position/)() const override | يعيد الموضع الحالي للتدفق. |
| [operator=](./operator=/)(const FileStream\&) |  |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | يقرأ عدد البايتات المحدد من التدفق ويكتبها إلى مصفوفة البايتات المحددة. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | يقرأ عدد البايتات المحدد من التدفق ويكتبها إلى مصفوفة البايتات المحددة. |
| [ReadAsync](./readasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) override | يقرأ بشكل غير متزامن تسلسلًا من البايتات من التدفق الحالي، ويتقدم بالموضع داخل التدفق بعدد البايتات المقروءة، ويراقب طلبات الإلغاء. |
| [ReadByte](./readbyte/)() override | يقرأ بايتًا واحدًا من التدفق ويعيد قيمة عدد صحيح 32‑بت مكافئة لقيمة البايت المقروء. |
| [Seek](./seek/)(int64_t, SeekOrigin) override | يضبط موضع التدفق الممثل بالكائن الحالي. |
| [set_Position](./set_position/)(int64_t) override | يفرغ التدفق ثم يضبط موضعه. |
| [SetLength](./setlength/)(int64_t) override | يضبط طول التدفق الممثل بالكائن الحالي. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | يكتب النطاق الفرعي المحدد من البايتات من مصفوفة البايتات المحددة إلى التدفق. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | يكتب النطاق الفرعي المحدد من البايتات من مصفوفة البايتات المحددة إلى التدفق. |
| [WriteAsync](./writeasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) override | يكتب بشكل غير متزامن تسلسلًا من البايتات إلى التدفق الحالي، ويتقدم بالموضع الحالي داخل هذا التدفق بعدد البايتات المكتوبة، ويراقب طلبات الإلغاء. |
| [WriteByte](./writebyte/)(uint8_t) override | يكتب القيمة المحددة للعدد الصحيح غير الموقع 8‑بت إلى التدفق. |
| [~FileStream](./~filestream/)() | المدمر. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static constexpr [DefaultBufferSize](./defaultbuffersize/) | القيمة الافتراضية لعدد البايتات المخزنة مؤقتاً أثناء عمليات القراءة والكتابة. |
| static [Null](../stream/null/) | تدفق بدون تخزين أساسي. |
## انظر أيضًا

* Class [Stream](../stream/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
