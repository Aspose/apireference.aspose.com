---
title: "System::Security::SecureString فئة"
linktitle: "SecureString"
second_title: "Aspose.Font لـ C++"
description: "System::Security::SecureString فئة. سلسلة آمنة، تمثل نصًا يجب الحفاظ على سريته. هذه الفئة لا تقوم بتشفير البيانات الداخلية. يجب إنشاء كائنات هذه الفئة باستخدام الدالة System::MakeObject() فقط. لا تقم بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أعطال التأكيد. احwrap دائمًا هذه الفئة في مؤشر System::SmartPtr واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 100
url: /ar/cpp/system.security/securestring/
---
## SecureString class


سلسلة آمنة، تمثل نصًا يجب الحفاظ على سريته. هذه الفئة لا تقوم بتشفير البيانات الداخلية. يجب إنشاء كائنات هذه الفئة باستخدام الدالة [System::MakeObject()](../../system/makeobject/) فقط. لا تقم بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أعطال التأكيد. احwrap دائمًا هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class SecureString : public System::IDisposable
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [AppendChar](./appendchar/)(char16_t) | يضيف حرفًا إلى نهاية السلسلة. |
| [Clear](./clear/)() | احذف جميع الأحرف من السلسلة الآمنة الحالية. |
| [Copy](./copy/)() const | ينشئ نسخة مكررة من هذه السلسلة الآمنة. |
| [Dispose](./dispose/)() override | أطلق جميع الموارد المستخدمة من قبل الكائن الحالي. |
| [get_Length](./get_length/)() const | يحصل على عدد الأحرف في هذه السلسلة الآمنة. |
| [InsertAt](./insertat/)(int32_t, char16_t) | يدرج حرفًا في الفهرس المحدد. |
| [IsReadOnly](./isreadonly/)() const | يحصل على العلامة التي تشير إلى ما إذا كان هذا الكائن معلمًا للقراءة فقط. |
| [MakeReadOnly](./makereadonly/)() | يجعل هذه السلسلة الآمنة للقراءة فقط. |
| [operator=](./operator=/)(const SecureString\&) |  |
| [RemoveAt](./removeat/)(int32_t) | يزيل الحرف في الموضع المحدد. |
| [SecureString](./securestring/)() | معلومات RTTI. |
| [SecureString](./securestring/)(const char16_t *, int32_t) | المُنشئ. |
| [SecureString](./securestring/)(const SecureString\&) |  |
| [SetAt](./setat/)(int32_t, char16_t) | يستبدل الحرف الموجود في الموضع المحدد. |
| [ToUnsecureString](./tounsecurestring/)() const | ينسخ محتويات هذه السلسلة الآمنة إلى كائن [String](../../system/string/) غير آمن. استخدمه بحذر. |
| [~SecureString](./~securestring/)() | المدمر. |
## انظر أيضًا

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Security](../)
* Library [Aspose.Font for C++](../../)
