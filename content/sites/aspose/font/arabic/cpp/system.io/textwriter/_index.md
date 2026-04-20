---
title: "System::IO::TextWriter فئة"
linktitle: "TextWriter"
second_title: "Aspose.Font لـ C++"
description: "فئة System::IO::TextWriter. فئة أساسية للفئات التي تمثل كُتابًا يكتبون سلاسل من الأحرف إلى وجهات مختلفة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2700
url: /ar/cpp/system.io/textwriter/
---
## TextWriter class


فئة أساسية للفئات التي تمثل كُتابًا يكتبون سلاسل من الأحرف إلى وجهات مختلفة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class TextWriter : public System::IDisposable
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [Close](./close/)() | يغلق الدفق ويحرر الموارد المكتسبة. |
| [Dispose](./dispose/)() override | يحرر جميع الموارد المستخدمة بواسطة الكائن الحالي ويغلق الدفق الأساسي. |
| virtual [Flush](./flush/)() | يفرغ محتوى المخزن المؤقت إلى الدفق الأساسي. |
| virtual [get_Encoding](./get_encoding/)() | يعيد الترميز المستخدم حاليًا. |
| virtual [get_FormatProvider](./get_formatprovider/)() const | يعيد الكائن [IFormatProvider](../../system/iformatprovider/) المستخدم حاليًا. |
| [get_FormatProvider](./get_formatprovider/)() | يعيد الكائن [IFormatProvider](../../system/iformatprovider/) المستخدم حاليًا. |
| virtual [get_NewLine](./get_newline/)() const | يعيد سلسلة محدد سطر. |
| [get_NewLine](./get_newline/)() | يعيد سلسلة محدد سطر. |
| virtual [set_NewLine](./set_newline/)(const System::String\&) | يضبط سلسلة محدد سطر. |
| virtual [Write](./write/)(const SharedPtr\<Object\>\&) | يكتب تمثيل السلسلة للكائن المحدد إلى الدفق. |
| virtual [Write](./write/)(bool) | يكتب تمثيل السلسلة للقيمة المنطقية المحددة إلى الدفق. |
| virtual [Write](./write/)(char_t) | يكتب الحرف المحدد إلى الدفق. |
| virtual [Write](./write/)(Decimal) | يكتب تمثيل السلسلة للكائن [Decimal](../../system/decimal/) المحدد إلى الدفق. |
| virtual [Write](./write/)(double) | يكتب تمثيل السلسلة للقيمة ذات الفاصلة العائمة ذات الدقة المزدوجة المحددة إلى الدفق. |
| virtual [Write](./write/)(int) | يكتب تمثيل السلسلة للقيمة الصحيحة ذات 32 بت المحددة إلى الدفق. |
| virtual [Write](./write/)(int64_t) | يكتب تمثيل السلسلة للقيمة الصحيحة ذات 64 بت المحددة إلى الدفق. |
| virtual [Write](./write/)(float) | يكتب تمثيل السلسلة للقيمة ذات الفاصلة العائمة ذات الدقة المفردة المحددة إلى الدفق. |
| virtual [Write](./write/)(const String\&) | يكتب السلسلة المحددة إلى الدفق. |
| virtual [Write](./write/)(uint32_t) | يكتب تمثيل السلسلة للقيمة الصحيحة غير الموقعة ذات 32 بت المحددة إلى الدفق. |
| virtual [Write](./write/)(uint64_t) | يكتب تمثيل السلسلة للقيمة الصحيحة غير الموقعة ذات 64 بت المحددة إلى الدفق. |
| virtual [Write](./write/)(const ArrayPtr\<char_t\>\&) | يكتب جميع الأحرف من المصفوفة المحددة إلى الدفق. |
| virtual [Write](./write/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) | يكتب النطاق الفرعي المحدد من أحرف UTF-16 من المصفوفة الحرفية المحددة إلى الدفق. |
| virtual [Write](./write/)(const char_t *) | يكتب السلسلة c-string المحددة إلى الدفق. |
| virtual [Write](./write/)(const TypeInfo\&) | يكتب تمثيل السلسلة للكائن [TypeInfo](../../system/typeinfo/) المحدد إلى الدفق. |
| [Write](./write/)(const String\&, const TArgs\&...) | يكتب القيم المحددة المنسقة وفقًا للتنسيق المحدد إلى الدفق. |
| virtual [WriteLine](./writeline/)() | يكتب أحرف إنهاء السطر إلى الدفق. |
| virtual [WriteLine](./writeline/)(const SharedPtr\<Object\>\&) | يكتب تمثيل السلسلة للكائن المحدد متبوعًا بأحرف إنهاء السطر إلى الدفق. |
| virtual [WriteLine](./writeline/)(bool) | يكتب تمثيل السلسلة للقيمة المنطقية المحددة متبوعًا بأحرف إنهاء السطر إلى الدفق. |
| virtual [WriteLine](./writeline/)(char_t) | يكتب الحرف المحدد متبوعًا بأحرف إنهاء السطر إلى الدفق. |
| virtual [WriteLine](./writeline/)(Decimal) | يكتب تمثيل السلسلة للكائن [Decimal](../../system/decimal/) المحدد متبوعًا بأحرف إنهاء السطر إلى الدفق. |
| virtual [WriteLine](./writeline/)(double) | يكتب تمثيل السلسلة للقيمة ذات الفاصلة العائمة ذات الدقة المزدوجة المحددة متبوعًا بأحرف إنهاء السطر إلى الدفق. |
| virtual [WriteLine](./writeline/)(int) | يكتب تمثيل السلسلة للقيمة الصحيحة ذات 32 بت المحددة متبوعًا بأحرف إنهاء السطر إلى الدفق. |
| virtual [WriteLine](./writeline/)(int64_t) | يكتب تمثيل السلسلة للقيمة الصحيحة ذات 64 بت المحددة متبوعًا بأحرف إنهاء السطر إلى الدفق. |
| virtual [WriteLine](./writeline/)(float) | يكتب تمثيل السلسلة للقيمة ذات الفاصلة العائمة ذات الدقة المفردة المحددة متبوعًا بأحرف إنهاء السطر إلى الدفق. |
| virtual [WriteLine](./writeline/)(const String\&) | يكتب السلسلة المحددة متبوعًا بأحرف إنهاء السطر إلى الدفق. |
| virtual [WriteLine](./writeline/)(uint32_t) | يكتب تمثيل السلسلة للقيمة الصحيحة غير الموقعة ذات 32 بت المحددة متبوعًا بأحرف إنهاء السطر إلى الدفق. |
| virtual [WriteLine](./writeline/)(uint64_t) | يكتب تمثيل السلسلة للقيمة الصحيحة غير الموقعة ذات 64 بت المحددة متبوعًا بأحرف إنهاء السطر إلى الدفق. |
| virtual [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&) | يكتب جميع الأحرف من المصفوفة المحددة متبوعًا بأحرف إنهاء السطر إلى الدفق. |
| virtual [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) | يكتب النطاق الفرعي المحدد من أحرف UTF-16 من مصفوفة الأحرف المحددة متبوعًا بأحرف إنهاء السطر إلى الدفق. |
| virtual [WriteLine](./writeline/)(const char_t *) | يكتب سلسلة c-string المحددة متبوعًا بأحرف إنهاء السطر إلى الدفق. |
| virtual [WriteLine](./writeline/)(const TypeInfo\&) | يكتب التمثيل النصي للكائن [TypeInfo](../../system/typeinfo/) المحدد متبوعًا بأحرف إنهاء السطر إلى الدفق. |
| [WriteLine](./writeline/)(const String\&, const TArgs\&...) | يكتب القيم المحددة منسقة وفقًا للتنسيق المحدد متبوعًا بأحرف إنهاء السطر إلى الدفق. |
| virtual [~TextWriter](./~textwriter/)() | المدمر. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى هذه الفئة. |
## انظر أيضًا

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
