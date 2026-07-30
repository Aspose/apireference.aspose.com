---
title: "System::Net::Http::Headers::HttpHeaders فئة"
linktitle: "HttpHeaders"
second_title: "Aspose.Font لـ C++"
description: "System::Net::Http::Headers::HttpHeaders فئة. مجموعة رؤوس HTTP. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام العامل new، لأن ذلك سيسبّب أخطاءً وقت التشغيل أو أعطالاً في التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 700
url: /ar/cpp/system.net.http.headers/httpheaders/
---
## HttpHeaders class


مجموعة رؤوس HTTP. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام العامل new، لأن ذلك سيسبّب أخطاءً وقت التشغيل أو أعطالاً في التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class HttpHeaders : public System::Collections::Generic::IEnumerable<System::Collections::Generic::KeyValuePair<System::String, System::SharedPtr<System::Collections::Generic::IEnumerable<System::String>>>>
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Add](./add/)(String, System::SharedPtr\<Collections::Generic::IEnumerable\<String\>\>) | يتحقق من صحة زوج اسم-قيمة جديد ويضيفه إلى المجموعة الحالية. |
| [Add](./add/)(String, String) | يتحقق من صحة زوج اسم-قيمة جديد ويضيفه إلى المجموعة الحالية. |
| virtual [AddHeaders](./addheaders/)(System::SharedPtr\<HttpHeaders\>) | يقوم بدمج كائن فئة HttpHeaders المحدد مع الكائن الحالي. |
| [AddParsedValue](./addparsedvalue/)(String, System::SharedPtr\<Object\>) | يحصل على رأس بالاسم المحدد ويضيف قيمة مُحلَّلة إلى الرأس. |
| [Clear](./clear/)() | يزيل جميع العناصر من المجموعة. |
| [Contains](./contains/)(String) |  |
| [ContainsParsedValue](./containsparsedvalue/)(String, System::SharedPtr\<Object\>) | يتحقق مما إذا كان الرأس يحتوي على القيمة المحددة. |
| [GetEnumerator](./getenumerator/)() override | يحصل على المُعدِّد. |
| [GetHeaderString](./getheaderstring/)(String) | يعيد تمثيلًا نصيًا للقيم حسب اسم الرأس المحدد. |
| [GetHeaderString](./getheaderstring/)(String, System::SharedPtr\<Object\>) | يعيد تمثيلًا نصيًا للقيم حسب اسم الرأس المحدد. |
| [GetHeaderStrings](./getheaderstrings/)() | يعيد مجموعة تحتوي على تمثيلات نصية لقيم الرؤوس. |
| [GetParsedValues](./getparsedvalues/)(String) | يعيد القيم المُحلَّلة حسب اسم الرأس المحدد. |
| [GetValues](./getvalues/)(String) | يعيد القيم المقابلة حسب الاسم المحدد. |
| static [ParsedValuesAsList](./parsedvaluesaslist/)(const System::SharedPtr\<Object\>) | يحوّل القيم المُحلَّلة إلى قائمة. |
| [Remove](./remove/)(String) | يحاول إزالة عنصر بالاسم المحدد. |
| [RemoveParsedValue](./removeparsedvalue/)(String, System::SharedPtr\<Object\>) | يحصل على رأس بالاسم المحدد ويزيل قيمة مُحلَّلة من الرأس. |
| [SetConfiguration](./setconfiguration/)(System::SharedPtr\<Collections::Generic::Dictionary\<String, System::SharedPtr\<HttpHeaderParser\>\>\>, System::SharedPtr\<Collections::Generic::HashSet\<String\>\>) |  |
| [SetOrRemoveParsedValue](./setorremoveparsedvalue/)(String, System::SharedPtr\<Object\>) | يحصل على رأس بالاسم المحدد ويضبط أو يزيل قيمته. سيتم إزالة قيمة الرأس عندما يكون معامل 'value' يساوي nullptr، وإلا سيتم ضبط قيمة مُحلَّلة. |
| [SetParsedValue](./setparsedvalue/)(String, System::SharedPtr\<Object\>) | يحصل على رأس بالاسم المحدد ويضبط قيمة مُحلَّلة للرأس. |
| [ToString](./tostring/)() const override | تماثل طريقة C# [Object.ToString()](../../system/object/tostring/). يتيح تحويل الكائنات المخصصة إلى سلسلة. |
| [TryAddWithoutValidation](./tryaddwithoutvalidation/)(String, String) | يحاول إضافة زوج اسم-قيمة جديد إلى المجموعة الحالية. |
| [TryAddWithoutValidation](./tryaddwithoutvalidation/)(String, System::SharedPtr\<Collections::Generic::IEnumerable\<String\>\>) | يضيف مجموعة من أزواج الاسم-القيمة إلى المجموعة الحالية. |
| [TryGetValues](./trygetvalues/)(String, System::SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\&) | يحاول الحصول على القيم المقابلة حسب الاسم المحدد. |
| [TryParseAndAddValue](./tryparseandaddvalue/)(String, String) | يحاول تحليل القيمة المحددة وإضافتها إلى قيم الرأس. |
## انظر أيضًا

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
