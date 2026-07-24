---
title: "فئة System::Drawing::FontFamily"
linktitle: "FontFamily"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Drawing::FontFamily. تمثل مجموعة من الأنماط التي تشترك في تصميم أساسي مشابه. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 900
url: /ar/cpp/system.drawing/fontfamily/
---
## FontFamily class


تمثل مجموعة من الأنماط التي تشترك في تصميم أساسي مشابه. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبدًا بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class FontFamily : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Clone](./clone/)() | يرجع نسخة من كائن [FontFamily](./) الحالي. |
| [Dispose](./dispose/)() | يطلق جميع موارد نظام التشغيل التي تم الحصول عليها بواسطة الكائن الحالي. |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | يحدد ما إذا كان الكائنان الحالي والمحدد متطابقين. |
| [FontFamily](./fontfamily/)(const String\&) | ينشئ نسخة جديدة من فئة [FontFamily](./) التي تمثل عائلة خطوط بالاسم المحدد. |
| [FontFamily](./fontfamily/)(const String\&, const SharedPtr\<Text::FontCollection\>\&) | ينشئ نسخة جديدة من [FontFamily](./) في مجموعة الخطوط المحددة بالاسم المحدد. |
| [FontFamily](./fontfamily/)(Text::GenericFontFamilies) | ينشئ نسخة جديدة من [FontFamily](./) من عائلة الخطوط العامة المحددة. |
| static [get_Families](./get_families/)() | يعيد مصفوفة تحتوي على جميع كائنات [FontFamily](./) المرتبطة بسياق الرسومات الحالي. |
| static [get_GenericMonospace](./get_genericmonospace/)() | يعيد كائنًا من نوع [FontFamily](./) يمثل عائلة خطوط أحادية العرض عامة. |
| static [get_GenericSansSerif](./get_genericsansserif/)() | يعيد كائنًا من نوع [FontFamily](./) يمثل عائلة خطوط سانس سيريف عامة. |
| static [get_GenericSerif](./get_genericserif/)() | يعيد كائنًا من نوع [FontFamily](./) يمثل عائلة خطوط سيريف عامة. |
| [get_Name](./get_name/)() const | يعيد اسم عائلة الخطوط التي يمثلها الكائن الحالي. |
| [GetCellAscent](./getcellascent/)(FontStyle) | يعيد ارتفاع الخلية لعائلة الخطوط التي يمثلها الكائن الحالي للنمط الخط المحدد. |
| [GetCellDescent](./getcelldescent/)(FontStyle) | يعيد انخفاض الخلية لعائلة الخطوط التي يمثلها الكائن الحالي للنمط الخط المحدد. |
| [GetEmHeight](./getemheight/)(FontStyle) | يعيد ارتفاع مربع الـ em بوحدات تصميم الخط للنمط المحدد. |
| [GetLineSpacing](./getlinespacing/)(FontStyle) | يعيد تباعد السطر لعائلة الخطوط التي يمثلها الكائن الحالي للنمط الخط المحدد. |
| [GetName](./getname/)(int) const | يعيد اسم عائلة الخطوط التي يمثلها الكائن الحالي. |
| [IsStyleAvailable](./isstyleavailable/)(FontStyle) | يحدد ما إذا كان نمط الخط المحدد متاحًا. |
| virtual [~FontFamily](./~fontfamily/)() | المدمر. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
