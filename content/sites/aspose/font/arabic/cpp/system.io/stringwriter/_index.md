---
title: "الفئة System::IO::StringWriter"
linktitle: "StringWriter"
second_title: "Aspose.Font لـ C++"
description: "الفئة System::IO::StringWriter. تنفّذ TextWriter الذي يكتب المعلومات إلى سلسلة نصية. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام العامل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2500
url: /ar/cpp/system.io/stringwriter/
---
## StringWriter class


تنفّذ [TextWriter](../textwriter/) الذي يكتب المعلومات إلى سلسلة نصية. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام العامل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class StringWriter : public System::IO::TextWriter
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Encoding](./get_encoding/)() override | يعيد الترميز المستخدم حاليًا. |
| virtual [GetStringBuilder](./getstringbuilder/)() | يعيد كائن StringBuilder المستخدم حالياً. |
| [StringWriter](./stringwriter/)(const System::SharedPtr\<Text::StringBuilder\>\&, const IFormatProviderPtr\&) | ينشئ نسخة جديدة من [StringWriter](./) باستخدام كائن StringBuilder المحدد و[IFormatProvider](../../system/iformatprovider/). |
| [StringWriter](./stringwriter/)(const System::SharedPtr\<Text::StringBuilder\>\&) | ينشئ نسخة جديدة من [StringWriter](./) باستخدام كائن StringBuilder المحدد و[IFormatProvider](../../system/iformatprovider/) من الثقافة الحالية. |
| [StringWriter](./stringwriter/)(const IFormatProviderPtr\&) | ينشئ نسخة جديدة من [StringWriter](./) باستخدام [IFormatProvider](../../system/iformatprovider/) المحدد. |
| [StringWriter](./stringwriter/)() | ينشئ نسخة جديدة من [StringWriter](./) باستخدام [IFormatProvider](../../system/iformatprovider/) من الثقافة الحالية. |
| [ToString](./tostring/)() const override | يعيد السلسلة الأساسية. |
| [Write](./write/)(char_t) override | يكتب الحرف المحدد إلى الدفق. |
| [Write](./write/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) override | يكتب النطاق الفرعي المحدد من الأحرف من مصفوفة الأحرف المحددة إلى الدفق. |
| [Write](./write/)(const String\&) override | يكتب السلسلة المحددة إلى الدفق. |
## انظر أيضًا

* Class [TextWriter](../textwriter/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
