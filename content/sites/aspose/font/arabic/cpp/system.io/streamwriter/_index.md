---
title: "الفئة System::IO::StreamWriter"
linktitle: "StreamWriter"
second_title: "Aspose.Font لـ C++"
description: "الفئة System::IO::StreamWriter. تمثل كاتبًا يكتب الأحرف إلى تدفق بايت. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2300
url: /ar/cpp/system.io/streamwriter/
---
## StreamWriter class


يمثل كاتبًا يكتب الأحرف إلى تدفق بايت. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبدًا بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class StreamWriter : public System::IO::TextWriter
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Close](./close/)() override | يغلق الدفق ويحرر الموارد المكتسبة. |
| [Dispose](./dispose/)() override | يحرر جميع الموارد المستخدمة بواسطة الكائن الحالي ويغلق الدفق الأساسي. |
| [Flush](./flush/)() override | يفرغ محتوى المخزن المؤقت إلى التدفق الأساسي ثم يفرغ التدفق الأساسي. |
| [get_AutoFlush](./get_autoflush/)() const | يرجع قيمة تشير إلى ما إذا كان [StreamWriter](./) سيفرغ البيانات إلى التدفق الأساسي في كل مرة يتم فيها استدعاء الطريقة [StreamWriter::Write](./write/). |
| [get_BaseStream](./get_basestream/)() const | يرجع مؤشرًا مشتركًا إلى كائن يمثل التدفق الأساسي. |
| [get_Encoding](./get_encoding/)() override | يعيد الترميز المستخدم حاليًا. |
| [set_AutoFlush](./set_autoflush/)(bool) | يرجع قيمة تحدد ما إذا كان يجب على [StreamWriter](./) تفريغ البيانات إلى التدفق الأساسي في كل مرة يتم فيها استدعاء الطريقة [StreamWriter::Write](./write/). |
| [StreamWriter](./streamwriter/)(const SharedPtr\<Stream\>\&) | ينشئ مثالًا لكائن [StreamWriter](./) يكتب الأحرف إلى التدفق الأساسي المحدد باستخدام ترميز UTF-8 ومخزن مؤقت بحجم افتراضي 1024 بايت. |
| [StreamWriter](./streamwriter/)(const SharedPtr\<Stream\>\&, const EncodingPtr\&) | ينشئ مثالًا لكائن [StreamWriter](./) يكتب الأحرف إلى التدفق الأساسي المحدد باستخدام الترميز المحدد ومخزن مؤقت بحجم افتراضي 1024 بايت. |
| [StreamWriter](./streamwriter/)(const SharedPtr\<Stream\>\&, const EncodingPtr\&, int, bool) | ينشئ مثالًا لكائن [StreamWriter](./) يكتب الأحرف إلى التدفق الأساسي المحدد باستخدام الترميز المحدد ومخزن مؤقت بالحجم المحدد. يحدد أحد المعاملات ما إذا كان يجب إغلاق التدفق الأساسي عند التخلص من كائن [StreamWriter](./). |
| [StreamWriter](./streamwriter/)(const String\&) | ينشئ مثالًا لكائن [StreamWriter](./) يكتب الأحرف إلى الملف المحدد باستخدام ترميز UTF-8 ومخزن مؤقت بحجم افتراضي 1024 بايت. |
| [StreamWriter](./streamwriter/)(const String\&, bool, const EncodingPtr\&) | ينشئ مثالًا لكائن [StreamWriter](./) يكتب الأحرف إلى الملف المحدد باستخدام الترميز المحدد ومخزن مؤقت بحجم افتراضي 1024 بايت. يحدد أحد المعاملات ما إذا كان يجب إلحاق البيانات بالملف أو استبدال الملف. |
| [StreamWriter](./streamwriter/)(const String\&, bool, const EncodingPtr\&, int) | ينشئ مثالًا لكائن [StreamWriter](./) يكتب الأحرف إلى الملف المحدد باستخدام الترميز المحدد وحجم المخزن المؤقت. يحدد أحد المعاملات ما إذا كان يجب إلحاق البيانات بالملف أو استبدال الملف. |
| [Write](./write/)(char_t) override | يكتب الحرف المحدد إلى الدفق. |
| [Write](./write/)(const String\&) override | يكتب السلسلة المحددة إلى الدفق. |
| [Write](./write/)(const SharedPtr\<Object\>\&) override | يكتب تمثيل السلسلة للكائن المحدد إلى الدفق. |
| [Write](./write/)(const ArrayPtr\<char_t\>\&) override | يكتب جميع الأحرف من المصفوفة المحددة إلى الدفق. |
| [Write](./write/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) override | يكتب النطاق الفرعي المحدد من أحرف UTF-16 من المصفوفة الحرفية المحددة إلى الدفق. |
| [Write](./write/)(const char_t *) override | يكتب السلسلة c-string المحددة إلى الدفق. |
| [Write](./write/)(const System::SharedPtr\<T\>\&) | يكتب تمثيل السلسلة للكائن المحدد إلى الدفق. |
| [WriteLine](./writeline/)() override | يكتب أحرف إنهاء السطر إلى الدفق. |
| [WriteLine](./writeline/)(const String\&) override | يكتب السلسلة المحددة متبوعًا بأحرف إنهاء السطر إلى الدفق. |
| [WriteLine](./writeline/)(const SharedPtr\<Object\>\&) override | يكتب تمثيل السلسلة للكائن المحدد متبوعًا بأحرف إنهاء السطر إلى الدفق. |
| [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&) override | يكتب جميع الأحرف من المصفوفة المحددة متبوعًا بأحرف إنهاء السطر إلى الدفق. |
| [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) override | يكتب النطاق الفرعي المحدد من أحرف UTF-16 من مصفوفة الأحرف المحددة متبوعًا بأحرف إنهاء السطر إلى الدفق. |
| [WriteLine](./writeline/)(const char_t *) override | يكتب سلسلة c-string المحددة متبوعًا بأحرف إنهاء السطر إلى الدفق. |
| [WriteLine](./writeline/)(const System::SharedPtr\<T\>\&) | يكتب تمثيل السلسلة للكائن المحدد متبوعًا بأحرف إنهاء السطر إلى الدفق. |
| [~StreamWriter](./~streamwriter/)() | المدمر. |
## انظر أيضًا

* Class [TextWriter](../textwriter/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
