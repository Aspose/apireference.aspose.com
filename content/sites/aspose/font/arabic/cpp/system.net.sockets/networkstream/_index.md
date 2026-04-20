---
title: "System::Net::Sockets::NetworkStream class"
linktitle: "NetworkStream"
second_title: "Aspose.Font لـ C++"
description: "System::Net::Sockets::NetworkStream class. يوفّر تدفق البيانات الأساسي للوصول إلى الشبكة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 300
url: /ar/cpp/system.net.sockets/networkstream/
---
## NetworkStream class


يوفّر تدفق البيانات الأساسي للوصول إلى الشبكة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class NetworkStream : public System::IO::Stream
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [BeginRead](./beginread/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, AsyncCallback, System::SharedPtr\<Object\>) override | يبدأ عملية قراءة غير متزامنة. |
| [BeginWrite](./beginwrite/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, AsyncCallback, System::SharedPtr\<Object\>) override | يبدأ عملية كتابة غير متزامنة. |
| [Close](./close/)(int) | يغلق المثيل الحالي بعد انتهاء الوقت المحدد. |
| [EndRead](./endread/)(System::SharedPtr\<IAsyncResult\>) override | ينتظر حتى يكتمل عملية القراءة غير المتزامنة المحددة. |
| [EndWrite](./endwrite/)(System::SharedPtr\<IAsyncResult\>) override | ينهي عملية كتابة غير متزامنة. ينتظر حتى يكتمل عملية الكتابة غير المتزامنة المحددة. |
| [Flush](./flush/)() override | يمسح مخازن هذا التدفق ويكتب جميع البيانات المخزنة مؤقتًا إلى التخزين الأساسي. |
| [get_CanRead](./get_canread/)() const override | معلومات RTTI. |
| [get_CanSeek](./get_canseek/)() const override | يحدد ما إذا كان التدفق يدعم البحث. |
| [get_CanTimeout](./get_cantimeout/)() const override | يحصل على قيمة تحدد ما إذا كان التدفق الحالي يمكن أن ينتهي مهله. |
| [get_CanWrite](./get_canwrite/)() const override | يحدد ما إذا كان التدفق قابلًا للكتابة. |
| [get_DataAvailable](./get_dataavailable/)() const | يعيد قيمة تشير إلى ما إذا كان هناك بيانات متاحة للقراءة. |
| [get_Length](./get_length/)() const override | يعيد طول التدفق بالبايت. |
| [get_Position](./get_position/)() const override | يعيد الموضع الحالي للتدفق. |
| [get_ReadTimeout](./get_readtimeout/)() const override | يحصل على قيمة، بالميليثانية، تحدد مدة محاولة التدفق للقراءة قبل انتهاء المهلة. |
| [get_Socket](./get_socket/)() | يحصل على الـ[Socket](../socket/) الأساسي. |
| [get_WriteTimeout](./get_writetimeout/)() const override | يحصل على قيمة، بالميليثانية، تحدد مدة محاولة التدفق للكتابة قبل انتهاء المهلة. |
| [NetworkStream](./networkstream/)(System::SharedPtr\<System::Net::Sockets::Socket\>) | ينشئ نسخة جديدة. |
| [NetworkStream](./networkstream/)(System::SharedPtr\<System::Net::Sockets::Socket\>, System::IO::FileAccess, bool) | ينشئ نسخة جديدة. |
| [NetworkStream](./networkstream/)(System::SharedPtr\<System::Net::Sockets::Socket\>, bool) | ينشئ نسخة جديدة. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | يقرأ عدد البايتات المحدد من التدفق ويكتبها إلى مصفوفة البايتات المحددة. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | يقرأ عدد البايتات المحدد من التدفق ويكتبها إلى مصفوفة البايتات المحددة. |
| [Seek](./seek/)(int64_t, IO::SeekOrigin) override | يضبط موضع التدفق الممثل بالكائن الحالي. |
| [set_Position](./set_position/)(int64_t) override | يضبط موضع التدفق. |
| [set_ReadTimeout](./set_readtimeout/)(int32_t) override | يضبط قيمة تحدد ما إذا كان التدفق الحالي يمكن أن ينتهي مهله. |
| [set_WriteTimeout](./set_writetimeout/)(int32_t) override | يضبط قيمة، بالميليثانية، تحدد مدة محاولة التدفق للقراءة قبل انتهاء المهلة. |
| [SetLength](./setlength/)(int64_t) override | يضبط طول التدفق الممثل بالكائن الحالي. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | يكتب النطاق الفرعي المحدد من البايتات من مصفوفة البايتات المحددة إلى التدفق. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | يكتب النطاق الفرعي المحدد من البايتات من مصفوفة البايتات المحددة إلى التدفق. |
| virtual [~NetworkStream](./~networkstream/)() | يدمر النسخة الحالية. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [Null](../../system.io/stream/null/) | تدفق بدون تخزين أساسي. |
## انظر أيضًا

* Class [Stream](../../system.io/stream/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Font for C++](../../)
