---
title: "System::IO::StreamReader class"
linktitle: "StreamReader"
second_title: "Aspose.Font لـ C++"
description: "System::IO::StreamReader class. يمثل قارئًا يقرأ الأحرف من تدفق بايت. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2200
url: /ar/cpp/system.io/streamreader/
---
## StreamReader class


يمثل قارئًا يقرأ الأحرف من تدفق بايت. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبدًا بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class StreamReader : public System::IO::TextReader
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Close](./close/)() override | يغلق التيارات الحالية والضمنية. |
| [Dispose](./dispose/)() override | يحرر جميع الموارد المستخدمة بواسطة الكائن الحالي ويغلق الدفق الأساسي. |
| [get_BaseStream](./get_basestream/)() const | يرجع مؤشرًا مشتركًا إلى كائن يمثل التدفق الأساسي. |
| [get_CurrentEncoding](./get_currentencoding/)() | يعيد الترميز المستخدم حاليًا. |
| [get_EndOfStream](./get_endofstream/)() | يرجع قيمة تشير إلى ما إذا تم الوصول إلى نهاية التيار. |
| [Peek](./peek/)() override | يقرأ حرفًا واحدًا من الدفق دون تغيير مؤشر القراءة الخاص بالدفق. |
| [Read](./read/)() override | يقرأ حرفًا واحدًا من الدفق. |
| [Read](./read/)(ArrayPtr\<char_t\>, int, int) override | يقرأ العدد المحدد من الأحرف من التيار، يحولها إلى ترميز UTF-16 ويكتب الأحرف الناتجة بترميز UTF-16 إلى مصفوفة الأحرف المحددة بدءًا من الموضع المحدد. |
| [ReadLine](./readline/)() override | يقرأ الأحرف من الدفق حتى نهاية السطر الحالي. |
| [ReadToEnd](./readtoend/)() override | يقرأ الأحرف من الدفق حتى نهاية الدفق. |
| [StreamReader](./streamreader/)(const SharedPtr\<Stream\>\&) | ينشئ مثالًا لكائن [StreamReader](./) يقرأ الأحرف من التيار الضمني المحدد باستخدام ترميز UTF-8 ومخزن مؤقت بحجم افتراضي 1024 بايت. |
| [StreamReader](./streamreader/)(const SharedPtr\<Stream\>\&, bool) | ينشئ مثالًا لكائن [StreamReader](./) يقرأ الأحرف من التيار الضمني المحدد باستخدام ترميز UTF-8 ومخزن مؤقت بحجم افتراضي 1024 بايت. يحدد معامل ما إذا كان يجب تمكين اكتشاف علامة ترتيب البايت. |
| [StreamReader](./streamreader/)(const SharedPtr\<Stream\>\&, const EncodingPtr\&) | ينشئ مثالًا لكائن [StreamReader](./) يقرأ الأحرف من التيار الضمني المحدد باستخدام الترميز المحدد ومخزن مؤقت بحجم افتراضي 1024 بايت. |
| [StreamReader](./streamreader/)(const SharedPtr\<Stream\>\&, const EncodingPtr\&, bool) | ينشئ مثالًا لكائن [StreamReader](./) يقرأ الأحرف من التيار الضمني المحدد باستخدام الترميز المحدد ومخزن مؤقت بحجم افتراضي 1024 بايت. يحدد معامل ما إذا كان يجب تمكين اكتشاف علامة ترتيب البايت. |
| [StreamReader](./streamreader/)(const SharedPtr\<Stream\>\&, const EncodingPtr\&, bool, int) | ينشئ مثالًا لكائن [StreamReader](./) يقرأ الأحرف من التيار الضمني المحدد باستخدام الترميز المحدد ومخزن مؤقت بالحجم المحدد. يحدد معامل ما إذا كان يجب تمكين اكتشاف علامة ترتيب البايت. |
| [StreamReader](./streamreader/)(const System::String\&) | ينشئ مثالًا لكائن [StreamReader](./) يقرأ الأحرف من الملف المحدد باستخدام ترميز UTF-8 ومخزن مؤقت بحجم افتراضي 4096 بايت. |
| [StreamReader](./streamreader/)(const System::String\&, bool) | ينشئ مثالًا لكائن [StreamReader](./) يقرأ الأحرف من الملف المحدد باستخدام ترميز UTF-8 ومخزن مؤقت بحجم افتراضي 4096 بايت. يحدد معامل ما إذا كان يجب تمكين اكتشاف علامة ترتيب البايت. |
| [StreamReader](./streamreader/)(const System::String\&, const EncodingPtr\&) | ينشئ مثالًا لكائن [StreamReader](./) يقرأ الأحرف من الملف المحدد باستخدام الترميز المحدد ومخزن مؤقت بحجم افتراضي 4096 بايت. |
| [StreamReader](./streamreader/)(const System::String\&, const EncodingPtr\&, bool) | ينشئ مثالًا لكائن [StreamReader](./) يقرأ الأحرف من التيار الضمني المحدد باستخدام الترميز المحدد ومخزن مؤقت بحجم افتراضي 4096 بايت. يحدد معامل ما إذا كان يجب تمكين اكتشاف علامة ترتيب البايت. |
| [StreamReader](./streamreader/)(const System::String\&, const EncodingPtr\&, bool, int) | ينشئ مثالًا لكائن [StreamReader](./) يقرأ الأحرف من الملف المحدد باستخدام الترميز المحدد ومخزن مؤقت بالحجم المحدد. يحدد معامل ما إذا كان يجب تمكين اكتشاف علامة ترتيب البايت. |
| [~StreamReader](./~streamreader/)() | المدمر. |
## انظر أيضًا

* Class [TextReader](../textreader/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
