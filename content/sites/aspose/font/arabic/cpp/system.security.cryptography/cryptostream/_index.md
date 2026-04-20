---
title: "فئة System::Security::Cryptography::CryptoStream"
linktitle: "CryptoStream"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Security::Cryptography::CryptoStream. تنفيذ تدفق يلف التدفق الحالي بوظيفة تشفيرية. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 500
url: /ar/cpp/system.security.cryptography/cryptostream/
---
## CryptoStream class


تنفيذ تدفق يلف التدفق الحالي بوظيفة تشفيرية. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class CryptoStream : public System::IO::Stream
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Close](./close/)() override | يغلق الاتصال. |
| [CryptoStream](./cryptostream/)(const SharedPtr\<System::IO::Stream\>\&, const SharedPtr\<ICryptoTransform\>\&, CryptoStreamMode) | المُنشئ. |
| [Flush](./flush/)() override | يفرغ المخزن المؤقت إلى التدفق المغلف. لا يفعل شيئًا لأن خوارزمية التحويل قد لا تزال تنتظر المزيد من البيانات. |
| [FlushFinalBlock](./flushfinalblock/)() | يكتب البيانات التي لا تزال في المخزن المؤقت إلى الدفق. |
| [get_CanRead](./get_canread/)() const override | يتحقق مما إذا كان الدفق قابلًا للقراءة. |
| [get_CanSeek](./get_canseek/)() const override | يتحقق مما إذا كان الدفق قابلًا للتمرير. |
| [get_CanWrite](./get_canwrite/)() const override | يتحقق مما إذا كان الدفق قابلًا للكتابة. |
| [get_Length](./get_length/)() const override | يحصل على طول الدفق. غير مدعوم. |
| [get_Position](./get_position/)() const override | يحصل على الموضع الحالي في الدفق. غير مدعوم. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | يقرأ البيانات من الدفق. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | يقرأ البيانات من الدفق. |
| [Seek](./seek/)(int64_t, IO::SeekOrigin) override | يتم التمرير إلى موضع في الدفق. غير مدعوم. |
| [set_Position](./set_position/)(int64_t) override | يتم التمرير إلى موضع في الدفق. غير مدعوم. |
| [SetLength](./setlength/)(int64_t) override | يتم التمرير إلى حجم الدفق. غير مدعوم. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | يكتب البيانات إلى الدفق. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | يكتب البيانات إلى الدفق. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [Null](../../system.io/stream/null/) | تدفق بدون تخزين أساسي. |
## انظر أيضًا

* Class [Stream](../../system.io/stream/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
