---
title: "System::IO::Stream class"
linktitle: "تيار"
second_title: "Aspose.Font لـ C++"
description: "System::IO::Stream class. فئة أساسية لمجموعة متنوعة من تطبيقات الدفق. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into System::SmartPtr pointer and use this pointer to pass it to functions as argument in C++."
type: docs
weight: 2100
url: /ar/cpp/system.io/stream/
---
## Stream class


فئة أساسية لمجموعة متنوعة من تطبيقات الدفق. يجب تخصيص كائنات هذه الفئة فقط باستخدام [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Stream : public System::IDisposable
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [BeginRead](./beginread/)(System::ArrayPtr\<uint8_t\>, int, int, System::AsyncCallback, System::SharedPtr\<System::Object\>) | يبدأ عملية قراءة غير متزامنة. |
| virtual [BeginWrite](./beginwrite/)(System::ArrayPtr\<uint8_t\>, int, int, System::AsyncCallback, System::SharedPtr\<System::Object\>) | يبدأ عملية كتابة غير متزامنة. |
| virtual [Close](./close/)() | يغلق التدفق. |
| [CopyTo](./copyto/)(const SharedPtr\<Stream\>\&) | ينسخ البايتات إلى الدفق المحدد. |
| [CopyTo](./copyto/)(const SharedPtr\<Stream\>\&, int32_t) | ينسخ البايتات إلى الدفق المحدد، باستخدام حجم المخزن المؤقت المحدد. |
| [Dispose](./dispose/)() override | يطلق جميع الموارد المستخدمة من قبل الكائن الحالي ويغلق التدفق. |
| virtual [EndRead](./endread/)(System::SharedPtr\<System::IAsyncResult\>) | ينتظر حتى يكتمل عملية القراءة غير المتزامنة المحددة. |
| virtual [EndWrite](./endwrite/)(System::SharedPtr\<System::IAsyncResult\>) | ينهي عملية كتابة غير متزامنة. ينتظر حتى يكتمل عملية الكتابة غير المتزامنة المحددة. |
| virtual [Flush](./flush/)() | يمسح مخازن هذا التدفق ويكتب جميع البيانات المخزنة مؤقتًا إلى التخزين الأساسي. |
| virtual [FlushAsync](./flushasync/)(const Threading::CancellationToken\&) | يمسح بشكل غير متزامن جميع المخازن المؤقتة لهذا الدفق، مما يؤدي إلى كتابة أي بيانات مخزنة مؤقتًا إلى الجهاز الأساسي، ويراقب طلبات الإلغاء. |
| [FlushAsync](./flushasync/)() | يمسح بشكل غير متزامن جميع المخازن المؤقتة لهذا الدفق، مما يؤدي إلى كتابة أي بيانات مخزنة مؤقتًا إلى الجهاز الأساسي، ويراقب طلبات الإلغاء. |
| virtual [get_CanRead](./get_canread/)() const | يحدد ما إذا كان الدفق قابلًا للقراءة. |
| virtual [get_CanSeek](./get_canseek/)() const | يحدد ما إذا كان التدفق يدعم البحث. |
| virtual [get_CanTimeout](./get_cantimeout/)() const | يحصل على قيمة تحدد ما إذا كان التدفق الحالي يمكن أن ينتهي مهله. |
| virtual [get_CanWrite](./get_canwrite/)() const | يحدد ما إذا كان التدفق قابلًا للكتابة. |
| virtual [get_Length](./get_length/)() const | يعيد طول التدفق بالبايت. |
| virtual [get_Position](./get_position/)() const | يعيد الموضع الحالي للتدفق. |
| virtual [get_ReadTimeout](./get_readtimeout/)() const | يحصل على قيمة، بالميليثانية، تحدد مدة محاولة التدفق للقراءة قبل انتهاء المهلة. |
| virtual [get_WriteTimeout](./get_writetimeout/)() const | يحصل على قيمة، بالميليثانية، تحدد مدة محاولة التدفق للكتابة قبل انتهاء المهلة. |
| virtual [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | يقرأ عدد البايتات المحدد من التدفق ويكتبها إلى مصفوفة البايتات المحددة. |
| virtual [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) | يقرأ عدد البايتات المحدد من التدفق ويكتبها إلى مصفوفة البايتات المحددة. |
| [Read](./read/)(const System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t) | يقرأ عدد البايتات المحدد من التدفق ويكتبها إلى مصفوفة البايتات المحددة. |
| virtual [ReadAsync](./readasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) | يقرأ بشكل غير متزامن تسلسلًا من البايتات من الدفق الحالي، ويقدم الموضع داخل الدفق بعدد البايتات المقروءة، ويراقب طلبات الإلغاء. |
| [ReadAsync](./readasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | يقرأ بشكل غير متزامن تسلسلًا من البايتات من الدفق الحالي، ويقدم الموضع داخل الدفق بعدد البايتات المقروءة، ويراقب طلبات الإلغاء. |
| virtual [ReadByte](./readbyte/)() | يقرأ بايتًا واحدًا من الدفق ويعيد قيمة عدد صحيح 32-بت مكافئة لقيمة البايت المقروء. |
| virtual [Seek](./seek/)(int64_t, SeekOrigin) | يضبط موضع التدفق الممثل بالكائن الحالي. |
| virtual [set_Position](./set_position/)(int64_t) | يضبط موضع التدفق. |
| virtual [set_ReadTimeout](./set_readtimeout/)(int) | يضبط قيمة تحدد ما إذا كان التدفق الحالي يمكن أن ينتهي مهله. |
| virtual [set_WriteTimeout](./set_writetimeout/)(int) | يضبط قيمة، بالميليثانية، تحدد مدة محاولة التدفق للقراءة قبل انتهاء المهلة. |
| virtual [SetLength](./setlength/)(int64_t) | يضبط طول التدفق الممثل بالكائن الحالي. |
| virtual [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | يكتب النطاق الفرعي المحدد من البايتات من مصفوفة البايتات المحددة إلى التدفق. |
| virtual [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) | يكتب النطاق الفرعي المحدد من البايتات من مصفوفة البايتات المحددة إلى التدفق. |
| [Write](./write/)(const System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t) | يكتب النطاق الفرعي المحدد من البايتات من مصفوفة البايتات المحددة إلى التدفق. |
| virtual [WriteAsync](./writeasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) | يكتب بشكل غير متزامن تسلسلًا من البايتات إلى الدفق الحالي، ويقدم الموضع الحالي داخل هذا الدفق بعدد البايتات المكتوبة، ويراقب طلبات الإلغاء. |
| [WriteAsync](./writeasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | يكتب بشكل غير متزامن تسلسلًا من البايتات إلى الدفق الحالي، ويقدم الموضع الحالي داخل هذا الدفق بعدد البايتات المكتوبة، ويراقب طلبات الإلغاء. |
| virtual [WriteByte](./writebyte/)(uint8_t) | يكتب القيمة المحددة من عدد صحيح غير موقع 8-بت إلى الدفق. |
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
* Library [Aspose.Font for C++](../../)
