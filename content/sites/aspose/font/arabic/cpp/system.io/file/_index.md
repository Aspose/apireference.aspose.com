---
title: "System::IO::File class"
linktitle: "ملف"
second_title: "Aspose.Font لـ C++"
description: "System::IO::File class. يوفر طرقًا للتعامل مع الملفات. هذا نوع ثابت بدون خدمات مثيل. يجب ألا تنشئ أي مثيلات له بأي وسيلة في C++."
type: docs
weight: 1300
url: /ar/cpp/system.io/file/
---
## File class


يوفر طرقًا لمعالجة الملفات. هذا نوع ثابت دون خدمات مثيل. لا يجب عليك أبدًا إنشاء مثيلات له بأي طريقة.

```cpp
class File
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| static [AppendAllLines](./appendalllines/)(const String\&, const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\&, const EncodingPtr\&) | يضيف السلاسل من مجموعة السلاسل المحددة إلى الملف المحدد باستخدام الترميز المحدد عن طريق كتابة كل سلسلة في سطر جديد. إذا لم يكن الملف المحدد موجودًا، يتم إنشاؤه. يُغلق الملف بعد كتابة جميع السلاسل. |
| static [AppendAllText](./appendalltext/)(const String\&, const String\&, const EncodingPtr\&) | يضيف السلسلة المحددة إلى الملف المحدد باستخدام الترميز المحدد. |
| static [AppendText](./appendtext/)(const String\&) | ينشئ كائنًا من نوع [StreamWriter](../streamwriter/) يضيف النص إلى الملف المحدد باستخدام ترميز UTF-8. إذا لم يكن الملف المحدد موجودًا، يتم إنشاؤه. |
| static [Copy](./copy/)(const String\&, const String\&, bool) | ينسخ الملف المحدد إلى الموقع المحدد. إذا كان ملف الوجهة موجودًا بالفعل، تحدد معلمة ما إذا كان يجب استبداله. |
| static [Create](./create/)(const String\&, int32_t, FileOptions) | ينشئ ملفًا جديدًا (أو يستبدل الموجود) ويفتحه للوصول للقراءة والكتابة باستخدام حجم المخزن المؤقت والخيارات المحددة. |
| static [CreateText](./createtext/)(const String\&) | ينشئ ملفًا جديدًا أو يفتح ملفًا موجودًا لكتابة نص بترميز UTF-8. |
| static [Decrypt](./decrypt/)(const String\&) | غير مُنفّذ. |
| static [Delete](./delete/)(const String\&) | يحذف الملف أو الدليل المحدد. |
| static [Encrypt](./encrypt/)(const String\&) | غير مُنفّذ. |
| static [Exists](./exists/)(const String\&) | يحدد ما إذا كان المسار المحدد يشير إلى ملف موجود. |
| static [GetAttributes](./getattributes/)(const String\&) | يعيد سمات الكيان المحدد. |
| static [GetCreationTime](./getcreationtime/)(const String\&) | يعيد وقت الإنشاء للكيان المحدد بالتوقيت المحلي. |
| static [GetCreationTimeUtc](./getcreationtimeutc/)(const String\&) | يعيد وقت الإنشاء للكيان المحدد بتوقيت UTC. |
| static [GetLastAccessTime](./getlastaccesstime/)(const String\&) | يعيد وقت آخر وصول للكيان المحدد بالتوقيت المحلي. |
| static [GetLastAccessTimeUtc](./getlastaccesstimeutc/)(const String\&) | يعيد وقت آخر وصول للكيان المحدد بتوقيت UTC. |
| static [GetLastWriteTime](./getlastwritetime/)(const String\&) | يعيد وقت الكتابة الأخير للكيان المحدد كوقت محلي. |
| static [GetLastWriteTimeUtc](./getlastwritetimeutc/)(const String\&) | يعيد وقت الكتابة الأخير للكيان المحدد كوقت UTC. |
| static [Move](./move/)(const String\&, const String\&) | ينقل الملف المحدد إلى الموقع الجديد. |
| static [Open](./open/)(const String\&, FileMode) | يفتح الملف المحدد في الوضع المحدد للقراءة والكتابة دون مشاركة. |
| static [Open](./open/)(const String\&, FileMode, FileAccess, FileShare) | يفتح الملف المحدد في الوضع المحدد، مع نوع الوصول المحدد وخيار المشاركة. |
| static [OpenRead](./openread/)(const String\&) | يفتح الملف المحدد للقراءة فقط، في وضع 'Open' مع وصول مشترك للقراءة. |
| static [OpenText](./opentext/)(const String\&, const EncodingPtr\&) | يفتح الملف الموجود المحدد لقراءة النص باستخدام ترميز UTF-8 دون مشاركة. |
| static [OpenWrite](./openwrite/)(const String\&) | يفتح الملف المحدد للكتابة فقط، في وضع 'OpenOrCreate' دون مشاركة. |
| static [ReadAllBytes](./readallbytes/)(const String\&) | يقرأ محتوى الملف الثنائي المحدد إلى مصفوفة بايت. |
| static [ReadAllLines](./readalllines/)(const String\&, const EncodingPtr\&) | يقرأ محتوى ملف النص المحدد سطرًا بسطر إلى مصفوفة من السلاسل باستخدام الترميز الأحرف المحدد. |
| static [ReadAllText](./readalltext/)(const String\&, const EncodingPtr\&) | يقرأ محتوى ملف النص المحدد إلى كائن [String](../../system/string/) واحد باستخدام الترميز الأحرف المحدد. |
| static [ReadLines](./readlines/)(const String\&, const EncodingPtr\&) | يقرأ محتوى ملف النص المحدد سطرًا بسطر باستخدام الترميز الأحرف المحدد ويعيد مجموعة قابلة للتعداد من السلاسل، كل منها يمثل سطرًا واحدًا من محتوى الملف. |
| static [Replace](./replace/)(const String\&, const String\&, const String\&, bool) | يستبدل محتويات ملف بآخر ويُنشئ نسخة احتياطية من الملف المستبدل. |
| static [SetAttributes](./setattributes/)(const String\&, FileAttributes) | يضبط السمات المحددة على الملف المحدد. |
| static [SetCreationTime](./setcreationtime/)(const String\&, DateTime) | غير مُنفّذ. |
| static [SetCreationTimeUtc](./setcreationtimeutc/)(const String\&, DateTime) | غير مُنفّذ. |
| static [SetLastAccessTime](./setlastaccesstime/)(const String\&, DateTime) | غير مُنفّذ. |
| static [SetLastAccessTimeUtc](./setlastaccesstimeutc/)(const String\&, DateTime) | غير مُنفّذ. |
| static [SetLastWriteTime](./setlastwritetime/)(const String\&, DateTime) | يضبط وقت الكتابة الأخير للكيان المحدد كوقت محلي. |
| static [SetLastWriteTimeUtc](./setlastwritetimeutc/)(const String\&, DateTime) | يضبط وقت الكتابة الأخير للكيان المحدد كوقت UTC. |
| static [WriteAllBytes](./writeallbytes/)(const String\&, const ArrayPtr\<uint8_t\>\&) | يكتب فوق الملف الثنائي المحدد ويكتب البايتات المحددة فيه. |
| static [WriteAllLines](./writealllines/)(const String\&, const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\&, const EncodingPtr\&) | ينشئ ملف نص جديد أو يكتب فوق الموجود ويكتب جميع السلاسل من مجموعة السلاسل القابلة للتعداد المحددة إليه، كل سلسلة في سطر جديد، باستخدام الترميز المحدد. |
| static [WriteAllLines](./writealllines/)(const String\&, const ArrayPtr\<String\>\&, const EncodingPtr\&) | ينشئ ملف نص جديد أو يكتب فوق الموجود ويكتب جميع السلاسل من المصفوفة المحددة إلى الملف، كل سلسلة في سطر جديد، باستخدام الترميز المحدد. |
| static [WriteAllText](./writealltext/)(const String\&, const String\&, const EncodingPtr\&) | ينشئ ملف نص جديد أو يكتب فوق الموجود ويكتب محتوى السلسلة المحددة إليه باستخدام الترميز المحدد. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [DefaultBufferSize](./defaultbuffersize/) | القيمة الافتراضية لعدد البايتات المخزنة مؤقتًا أثناء القراءة من الملف والكتابة إليه. |
## انظر أيضًا

* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
