---
title: "System::Security::Cryptography::CryptoStream فئة"
linktitle: "CryptoStream"
second_title: "Aspose.Page لـ C++"
description: "System::Security::Cryptography::CryptoStream فئة. تنفيذ تدفق يلف التدفق الموجود بدالة تشفير. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() . لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 500
url: /ar/cpp/system.security.cryptography/cryptostream/
---
## CryptoStream class


تنفيذ تدفق يلف التدفق الموجود بدالة تشفير. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) . لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class CryptoStream : public System::IO::Stream
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Close](./close/)() override | يغلق الاتصال. |
| [CryptoStream](./cryptostream/)(const SharedPtr\<System::IO::Stream\>\&, const SharedPtr\<ICryptoTransform\>\&, CryptoStreamMode) | منشئ. |
| [Flush](./flush/)() override | يفرغ المخزن المؤقت إلى التدفق المغلف. لا يفعل شيئاً لأن خوارزمية التحويل قد لا تزال تنتظر المزيد من البيانات. |
| [FlushFinalBlock](./flushfinalblock/)() | يكتب البيانات المتبقية في المخزن المؤقت إلى التدفق. |
| [get_CanRead](./get_canread/)() const override | يتحقق مما إذا كان التدفق قابلًا للقراءة. |
| [get_CanSeek](./get_canseek/)() const override | يتحقق مما إذا كان التدفق قابلًا للتمرير. |
| [get_CanWrite](./get_canwrite/)() const override | يتحقق مما إذا كان التدفق قابلًا للكتابة. |
| [get_Length](./get_length/)() const override | يحصل على طول التدفق. غير مدعوم. |
| [get_Position](./get_position/)() const override | يحصل على الموضع الحالي في التدفق. غير مدعوم. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | يقرأ البيانات من التدفق. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | يقرأ البيانات من التدفق. |
| [Seek](./seek/)(int64_t, IO::SeekOrigin) override | يبحث عن موضع في التدفق. غير مدعوم. |
| [set_Position](./set_position/)(int64_t) override | يبحث عن موضع في التدفق. غير مدعوم. |
| [SetLength](./setlength/)(int64_t) override | يبحث عن حجم التدفق. غير مدعوم. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | يكتب البيانات إلى التدفق. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | يكتب البيانات إلى التدفق. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [Null](../../system.io/stream/null/) | تدفق بدون تخزين أساسي. |
## انظر أيضًا

* Class [Stream](../../system.io/stream/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
