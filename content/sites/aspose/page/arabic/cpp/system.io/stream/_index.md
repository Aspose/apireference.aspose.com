---
title: "الفئة System::IO::Stream"
linktitle: "دفق"
second_title: "Aspose.Page لـ C++"
description: "الفئة System::IO::Stream. فئة أساسية لمجموعة متنوعة من تطبيقات التدفق. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء مثال من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2100
url: /ar/cpp/system.io/stream/
---
## Stream class


فئة أساسية لمجموعة متنوعة من تطبيقات التدفق. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبدًا بإنشاء مثال من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class Stream : public System::IDisposable
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [BeginRead](./beginread/)(System::ArrayPtr\<uint8_t\>, int, int, System::AsyncCallback, System::SharedPtr\<System::Object\>) | يبدأ عملية قراءة غير متزامنة. |
| virtual [BeginWrite](./beginwrite/)(System::ArrayPtr\<uint8_t\>, int, int, System::AsyncCallback, System::SharedPtr\<System::Object\>) | يبدأ عملية كتابة غير متزامنة. |
| virtual [Close](./close/)() | يغلق الدفق. |
| [CopyTo](./copyto/)(const SharedPtr\<Stream\>\&) | ينسخ البايتات إلى التدفق المحدد. |
| [CopyTo](./copyto/)(const SharedPtr\<Stream\>\&, int32_t) | ينسخ البايتات إلى التدفق المحدد، باستخدام حجم المخزن المؤقت المحدد. |
| [Dispose](./dispose/)() override | يطلق جميع الموارد المستخدمة من قبل الكائن الحالي ويغلق الدفق. |
| virtual [EndRead](./endread/)(System::SharedPtr\<System::IAsyncResult\>) | ينتظر حتى تكتمل عملية القراءة غير المتزامنة المحددة. |
| virtual [EndWrite](./endwrite/)(System::SharedPtr\<System::IAsyncResult\>) | ينهي عملية كتابة غير متزامنة. ينتظر حتى تكتمل عملية الكتابة غير المتزامنة المحددة. |
| virtual [Flush](./flush/)() | يمسح مخازن هذا التدفق ويكتب جميع البيانات المخزنة مؤقتاً إلى التخزين الأساسي. |
| virtual [FlushAsync](./flushasync/)(const Threading::CancellationToken\&) | يمسح بشكل غير متزامن جميع المخازن المؤقتة لهذا التدفق، مما يؤدي إلى كتابة أي بيانات مخزنة مؤقتًا إلى الجهاز الأساسي، ويراقب طلبات الإلغاء. |
| [FlushAsync](./flushasync/)() | يمسح بشكل غير متزامن جميع المخازن المؤقتة لهذا التدفق، مما يؤدي إلى كتابة أي بيانات مخزنة مؤقتًا إلى الجهاز الأساسي، ويراقب طلبات الإلغاء. |
| virtual [get_CanRead](./get_canread/)() const | يحدد ما إذا كان التدفق قابلًا للقراءة. |
| virtual [get_CanSeek](./get_canseek/)() const | يحدد ما إذا كان التدفق يدعم البحث. |
| virtual [get_CanTimeout](./get_cantimeout/)() const | يحصل على قيمة تحدد ما إذا كان يمكن أن ينتهي مهلة التدفق الحالي. |
| virtual [get_CanWrite](./get_canwrite/)() const | يحدد ما إذا كان التدفق قابلًا للكتابة. |
| virtual [get_Length](./get_length/)() const | يعيد طول التدفق بالبايت. |
| virtual [get_Position](./get_position/)() const | يعيد الموضع الحالي للتدفق. |
| virtual [get_ReadTimeout](./get_readtimeout/)() const | يحصل على قيمة، بالمللي ثانية، تحدد المدة التي سيحاول فيها التدفق القراءة قبل انتهاء المهلة. |
| virtual [get_WriteTimeout](./get_writetimeout/)() const | يحصل على قيمة، بالميلي ثانية، تحدد المدة التي سيحاول فيها التدفق الكتابة قبل انتهاء المهلة. |
| virtual [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | يقرأ عدد البايتات المحدد من التدفق ويكتبها إلى مصفوفة البايتات المحددة. |
| virtual [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) | يقرأ عدد البايتات المحدد من التدفق ويكتبها إلى مصفوفة البايتات المحددة. |
| [Read](./read/)(const System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t) | يقرأ عدد البايتات المحدد من التدفق ويكتبها إلى مصفوفة البايتات المحددة. |
| virtual [ReadAsync](./readasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) | يقرأ بشكل غير متزامن تسلسلًا من البايتات من التدفق الحالي، ويتقدم بالموضع داخل التدفق بعدد البايتات المقروءة، ويراقب طلبات الإلغاء. |
| [ReadAsync](./readasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | يقرأ بشكل غير متزامن تسلسلًا من البايتات من التدفق الحالي، ويتقدم بالموضع داخل التدفق بعدد البايتات المقروءة، ويراقب طلبات الإلغاء. |
| virtual [ReadByte](./readbyte/)() | يقرأ بايتًا واحدًا من التدفق ويعيد قيمة عدد صحيح 32‑بت مكافئة لقيمة البايت المقروء. |
| virtual [Seek](./seek/)(int64_t, SeekOrigin) | يضبط موضع التدفق الممثل بالكائن الحالي. |
| virtual [set_Position](./set_position/)(int64_t) | يضبط موضع التدفق. |
| virtual [set_ReadTimeout](./set_readtimeout/)(int) | يضبط قيمة تحدد ما إذا كان التدفق الحالي يمكن أن ينتهي مهلة. |
| virtual [set_WriteTimeout](./set_writetimeout/)(int) | يضبط قيمة، بالميلي ثانية، تحدد المدة التي سيحاول فيها التدفق القراءة قبل انتهاء المهلة. |
| virtual [SetLength](./setlength/)(int64_t) | يضبط طول التدفق الممثل بالكائن الحالي. |
| virtual [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | يكتب النطاق الفرعي المحدد من البايتات من مصفوفة البايتات المحددة إلى التدفق. |
| virtual [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) | يكتب النطاق الفرعي المحدد من البايتات من مصفوفة البايتات المحددة إلى التدفق. |
| [Write](./write/)(const System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t) | يكتب النطاق الفرعي المحدد من البايتات من مصفوفة البايتات المحددة إلى التدفق. |
| virtual [WriteAsync](./writeasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) | يكتب بشكل غير متزامن تسلسلًا من البايتات إلى التدفق الحالي، ويتقدم بالموضع الحالي داخل هذا التدفق بعدد البايتات المكتوبة، ويراقب طلبات الإلغاء. |
| [WriteAsync](./writeasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | يكتب بشكل غير متزامن تسلسلًا من البايتات إلى التدفق الحالي، ويتقدم بالموضع الحالي داخل هذا التدفق بعدد البايتات المكتوبة، ويراقب طلبات الإلغاء. |
| virtual [WriteByte](./writebyte/)(uint8_t) | يكتب القيمة المحددة للعدد الصحيح غير الموقع 8‑بت إلى التدفق. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [Null](./null/) | تدفق بدون تخزين أساسي. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى هذه الفئة. |
## انظر أيضًا

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
