---
title: "System::IO::StreamReader فئة"
linktitle: "StreamReader"
second_title: "Aspose.Page لـ C++"
description: "System::IO::StreamReader فئة. تمثل قارئًا يقرأ الأحرف من تدفق بايت. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() . لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2200
url: /ar/cpp/system.io/streamreader/
---
## StreamReader class


تمثل قارئًا يقرأ الأحرف من تدفق بايت. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) . لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class StreamReader : public System::IO::TextReader
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Close](./close/)() override | يغلق التدفقات الحالية والضمنية. |
| [Dispose](./dispose/)() override | يحرر جميع الموارد المستخدمة بواسطة الكائن الحالي ويغلق الدفق الأساسي. |
| [get_BaseStream](./get_basestream/)() const | يرجع مؤشرًا مشتركًا إلى كائن يمثل التدفق الأساسي. |
| [get_CurrentEncoding](./get_currentencoding/)() | يعيد الترميز المستخدم حاليًا. |
| [get_EndOfStream](./get_endofstream/)() | يرجع قيمة تشير إلى ما إذا تم الوصول إلى نهاية التدفق. |
| [Peek](./peek/)() override | يقرأ حرفًا واحدًا من التدفق دون تغيير مؤشر القراءة في التدفق. |
| [Read](./read/)() override | يقرأ حرفًا واحدًا من التدفق. |
| [Read](./read/)(ArrayPtr\<char_t\>, int, int) override | يقرأ العدد المحدد من الأحرف من التدفق، يحولها إلى ترميز UTF-16 ويكتب الأحرف الناتجة بترميز UTF-16 إلى مصفوفة الأحرف المحددة بدءًا من الموضع المحدد. |
| [ReadLine](./readline/)() override | يقرأ الأحرف من التدفق حتى نهاية السطر الحالي. |
| [ReadToEnd](./readtoend/)() override | يقرأ الأحرف من التدفق حتى نهاية التدفق. |
| [StreamReader](./streamreader/)(const SharedPtr\<Stream\>\&) | ينشئ نسخة من كائن [StreamReader](./) يقرأ الأحرف من التدفق الأساسي المحدد باستخدام ترميز UTF-8 ومخزن مؤقت بحجم افتراضي قدره 1024 بايت. |
| [StreamReader](./streamreader/)(const SharedPtr\<Stream\>\&, bool) | ينشئ نسخة من كائن [StreamReader](./) يقرأ الأحرف من التدفق الأساسي المحدد باستخدام ترميز UTF-8 ومخزن مؤقت بحجم افتراضي قدره 1024 بايت. يحدد معلمة ما إذا كان يجب تمكين اكتشاف علامة ترتيب البايت. |
| [StreamReader](./streamreader/)(const SharedPtr\<Stream\>\&, const EncodingPtr\&) | ينشئ نسخة من كائن [StreamReader](./) يقرأ الأحرف من التدفق الأساسي المحدد باستخدام الترميز المحدد ومخزن مؤقت بحجم افتراضي قدره 1024 بايت. |
| [StreamReader](./streamreader/)(const SharedPtr\<Stream\>\&, const EncodingPtr\&, bool) | ينشئ نسخة من كائن [StreamReader](./) يقرأ الأحرف من التدفق الأساسي المحدد باستخدام الترميز المحدد ومخزن مؤقت بحجم افتراضي قدره 1024 بايت. يحدد معلمة ما إذا كان يجب تمكين اكتشاف علامة ترتيب البايت. |
| [StreamReader](./streamreader/)(const SharedPtr\<Stream\>\&, const EncodingPtr\&, bool, int) | ينشئ نسخة من كائن [StreamReader](./) يقرأ الأحرف من التدفق الأساسي المحدد باستخدام الترميز المحدد ومخزن مؤقت بالحجم المحدد. يحدد معلمة ما إذا كان يجب تمكين اكتشاف علامة ترتيب البايت. |
| [StreamReader](./streamreader/)(const System::String\&) | ينشئ نسخة من كائن [StreamReader](./) يقرأ الأحرف من الملف المحدد باستخدام ترميز UTF-8 ومخزن مؤقت بحجم افتراضي قدره 4096 بايت. |
| [StreamReader](./streamreader/)(const System::String\&, bool) | ينشئ مثيلاً لكائن [StreamReader](./) يقرأ الأحرف من الملف المحدد باستخدام ترميز UTF-8 ومخزن مؤقت بحجم افتراضي 4096 بايت. يحدد معلمة ما إذا كان يجب تمكين اكتشاف علامة ترتيب البايت. |
| [StreamReader](./streamreader/)(const System::String\&, const EncodingPtr\&) | ينشئ مثيلاً لكائن [StreamReader](./) يقرأ الأحرف من الملف المحدد باستخدام الترميز المحدد ومخزن مؤقت بحجم افتراضي 4096 بايت. |
| [StreamReader](./streamreader/)(const System::String\&, const EncodingPtr\&, bool) | ينشئ مثيلاً لكائن [StreamReader](./) يقرأ الأحرف من الدفق الأساسي المحدد باستخدام الترميز المحدد ومخزن مؤقت بحجم افتراضي 4096 بايت. يحدد معلمة ما إذا كان يجب تمكين اكتشاف علامة ترتيب البايت. |
| [StreamReader](./streamreader/)(const System::String\&, const EncodingPtr\&, bool, int) | ينشئ مثيلاً لكائن [StreamReader](./) يقرأ الأحرف من الملف المحدد باستخدام الترميز المحدد ومخزن بحجم محدد. يحدد معلمة ما إذا كان يجب تمكين اكتشاف علامة ترتيب البايت. |
| [~StreamReader](./~streamreader/)() | المدمر. |
## انظر أيضًا

* Class [TextReader](../textreader/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
