---
title: "فئة System::Drawing::Font"
linktitle: "خط"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Drawing::Font. تمثل تنسيقًا معينًا للنص، بما في ذلك عائلة الخط، الحجم، والنمط. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 700
url: /ar/cpp/system.drawing/font/
---
## Font class


تمثل تنسيقًا معينًا للنص، بما في ذلك عائلة الخط، الحجم، والنمط. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class Font : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Clone](./clone/)() | يعيد نسخة من الخط الحالي. |
| [Dispose](./dispose/)() | يطلق جميع موارد نظام التشغيل التي حصل عليها الكائن الحالي. |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | يحدد ما إذا كان الكائنان الحالي والمحدد متطابقان. |
| [Font](./font/)(const SharedPtr\<Font\>\&, FontStyle) | ينشئ نسخة جديدة من فئة [Font](./) التي تمثل الخط الموجود المحدد مع النمط المحدد للخط. |
| [Font](./font/)(const SharedPtr\<FontFamily\>\&, float, FontStyle, GraphicsUnit, uint8_t, bool) | ينشئ نسخة جديدة من فئة [Font](./). |
| [Font](./font/)(const SharedPtr\<FontFamily\>\&, float, GraphicsUnit) | ينشئ نسخة جديدة من فئة [Font](./). |
| [Font](./font/)(const String\&, float, FontStyle, GraphicsUnit, uint8_t, bool) | ينشئ نسخة جديدة من فئة [Font](./). |
| [Font](./font/)(const String\&, float, GraphicsUnit) | ينشئ نسخة جديدة من فئة [Font](./). |
| static [FromLogFont](./fromlogfont/)(const SharedPtr\<Object\>\&) | غير مُنفّذ. |
| [get_Bold](./get_bold/)() | يحدد ما إذا كان الخط الممثل بواسطة الكائن الحالي يحتوي على النمط الغامق. |
| [get_FontFamily](./get_fontfamily/)() | يعيد عائلة الخط للخط الممثل بواسطة الكائن الحالي. |
| [get_FontStyle](./get_fontstyle/)() | يعيد نمط الخط للخط الممثل بواسطة الكائن الحالي. |
| [get_GdiCharSet](./get_gdicharset/)() | يعيد قيمة تشير إلى مجموعة الأحرف GDI المستخدمة بواسطة الخط الممثل بواسطة الكائن الحالي. |
| [get_Height](./get_height/)() | يعيد تباعد الأسطر للخط الممثل بواسطة الكائن الحالي بوحدات البكسل. |
| [get_Italic](./get_italic/)() | يحدد ما إذا كان الخط الممثل بواسطة الكائن الحالي يحتوي على النمط المائل. |
| [get_Name](./get_name/)() | يعيد اسم الوجه للخط الممثل بواسطة الكائن الحالي. |
| [get_OriginalFontName](./get_originalfontname/)() | يعيد الاسم الأصلي المحدد للخط. |
| [get_Size](./get_size/)() | يعيد حجم الـ em للخط الممثل بواسطة الكائن الحالي مقاسًا بالوحدات المحددة في خاصية Unit. |
| [get_SizeInPoints](./get_sizeinpoints/)() | يعيد حجم الـ em للخط الممثل بالكائن الحالي بوحدات النقاط. |
| [get_Strikeout](./get_strikeout/)() | يحدد ما إذا كان الخط الممثل بالكائن الحالي يحتوي على نمط الشطب المطبق. |
| [get_Style](./get_style/)() | يعيد نمط الخط للخط الممثل بالكائن الحالي. |
| [get_Underline](./get_underline/)() | يحدد ما إذا كان الخط الممثل بالكائن الحالي يحتوي على نمط التسطير المطبق. |
| [get_Unit](./get_unit/)() | يعيد وحدة القياس للخط الممثل بالكائن الحالي. |
| [GetHeight](./getheight/)(const SharedPtr\<Graphics\>\&) | يعيد تباعد الأسطر للخط الممثل بالكائن الحالي، بوحدة الكائن [Graphics](../graphics/) المحدد. |
| [GetHeight](./getheight/)(float) | يعيد ارتفاع الخط الممثل بالكائن الحالي عند رسمه على جهاز عرض بدقة عمودية محددة. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
