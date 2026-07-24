---
title: "System::Drawing::Font فئة"
linktitle: "خط"
second_title: "Aspose.Page لـ C++"
description: "System::Drawing::Font فئة. تمثل تنسيقًا معينًا للنص، بما في ذلك نوع الخط، الحجم، والنمط. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() . لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 700
url: /ar/cpp/system.drawing/font/
---
## Font class


تمثل تنسيقًا معينًا للنص، بما في ذلك نوع الخط، الحجم، والنمط. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class Font : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Clone](./clone/)() | يرجع نسخة من الخط الحالي. |
| [Dispose](./dispose/)() | يطلق جميع موارد نظام التشغيل التي تم الحصول عليها بواسطة الكائن الحالي. |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | يحدد ما إذا كان الكائنان الحالي والمحدد متطابقين. |
| [Font](./font/)(const SharedPtr\<Font\>\&, FontStyle) | ينشئ نسخة جديدة من فئة [Font](./) التي تمثل الخط الموجود المحدد مع النمط المحدد للخط. |
| [Font](./font/)(const SharedPtr\<FontFamily\>\&, float, FontStyle, GraphicsUnit, uint8_t, bool) | ينشئ نسخة جديدة من فئة [Font](./). |
| [Font](./font/)(const SharedPtr\<FontFamily\>\&, float, GraphicsUnit) | ينشئ نسخة جديدة من فئة [Font](./). |
| [Font](./font/)(const String\&, float, FontStyle, GraphicsUnit, uint8_t, bool) | ينشئ نسخة جديدة من فئة [Font](./). |
| [Font](./font/)(const String\&, float, GraphicsUnit) | ينشئ نسخة جديدة من فئة [Font](./). |
| static [FromLogFont](./fromlogfont/)(const SharedPtr\<Object\>\&) | غير مُنفَّذ. |
| [get_Bold](./get_bold/)() | يحدد ما إذا كان الخط الممثل بواسطة الكائن الحالي يحمل النمط الغامق. |
| [get_FontFamily](./get_fontfamily/)() | يرجع عائلة الخط للخط الممثل بواسطة الكائن الحالي. |
| [get_FontStyle](./get_fontstyle/)() | يرجع نمط الخط للخط الممثل بواسطة الكائن الحالي. |
| [get_GdiCharSet](./get_gdicharset/)() | يرجع قيمة تشير إلى مجموعة أحرف GDI المستخدمة بواسطة الخط الممثل بواسطة الكائن الحالي. |
| [get_Height](./get_height/)() | يرجع تباعد الأسطر للخط الممثل بواسطة الكائن الحالي بوحدات البكسل. |
| [get_Italic](./get_italic/)() | يحدد ما إذا كان الخط الممثل بواسطة الكائن الحالي يحتوي على نمط مائل مطبق. |
| [get_Name](./get_name/)() | يعيد اسم الوجه للخط الممثل بواسطة الكائن الحالي. |
| [get_OriginalFontName](./get_originalfontname/)() | يعيد الاسم المحدد أصلاً للخط. |
| [get_Size](./get_size/)() | يعيد حجم الـ em للخط الممثل بواسطة الكائن الحالي مقاسًا بالوحدات المحددة بواسطة الخاصية Unit. |
| [get_SizeInPoints](./get_sizeinpoints/)() | يعيد حجم الـ em للخط الممثل بواسطة الكائن الحالي بالنقاط. |
| [get_Strikeout](./get_strikeout/)() | يحدد ما إذا كان الخط الممثل بواسطة الكائن الحالي يحتوي على نمط شطب مطبق. |
| [get_Style](./get_style/)() | يعيد نمط الخط للخط الممثل بواسطة الكائن الحالي. |
| [get_Underline](./get_underline/)() | يحدد ما إذا كان الخط الممثل بواسطة الكائن الحالي يحتوي على نمط تحت خط مطبق. |
| [get_Unit](./get_unit/)() | يعيد وحدة القياس للخط الممثل بواسطة الكائن الحالي. |
| [GetHeight](./getheight/)(const SharedPtr\<Graphics\>\&) | يعيد تباعد السطر للخط الممثل بواسطة الكائن الحالي، بوحدة الكائن المحدد [Graphics](../graphics/) الحالية. |
| [GetHeight](./getheight/)(float) | يعيد ارتفاع الخط الممثل بواسطة الكائن الحالي عند رسمه على جهاز عرض بدقة عمودية محددة. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
