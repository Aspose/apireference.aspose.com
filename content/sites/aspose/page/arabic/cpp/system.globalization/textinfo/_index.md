---
title: "فئة System::Globalization::TextInfo"
linktitle: "TextInfo"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Globalization::TextInfo. تُعرّف خصائص النص الخاصة بالمنطقة. عمليات الضبط مفعلة فقط على الكائنات غير القابلة للقراءة فقط. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2800
url: /ar/cpp/system.globalization/textinfo/
---
## TextInfo class


تُعرّف خصائص النص الخاصة بالمنطقة. عمليات الضبط مفعلة فقط على الكائنات غير القابلة للقراءة فقط. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) . لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class TextInfo : public System::ICloneable
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Clone](./clone/)() override | معلومات RTTI. |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| virtual [get_ANSICodePage](./get_ansicodepage/)() const | يسترجع صفحة الترميز ANSI. |
| [get_CultureName](./get_culturename/)() const | يسترجع اسم الثقافة. |
| virtual [get_EBCDICCodePage](./get_ebcdiccodepage/)() const | يسترجع صفحة الترميز EBCDIC. |
| [get_IsReadOnly](./get_isreadonly/)() const | يتحقق مما إذا كان التنسيق للقراءة فقط. |
| [get_IsRightToLeft](./get_isrighttoleft/)() const | يتحقق مما إذا كان النص مكتوبًا من اليسار إلى اليمين. |
| [get_LCID](./get_lcid/)() const | يسترجع معرف المنطقة. |
| virtual [get_ListSeparator](./get_listseparator/)() const | يسترجع فاصل القائمة. |
| virtual [get_MacCodePage](./get_maccodepage/)() const | يسترجع صفحة الترميز Macintosh. |
| virtual [get_OEMCodePage](./get_oemcodepage/)() const | يسترجع صفحة الترميز OEM. |
| [GetHashCode](./gethashcode/)() const override | نظير طريقة C# [Object.GetHashCode()](../../system/object/gethashcode/). يتيح تجزئة الكائنات المخصصة. |
| [operator=](./operator=/)(const TextInfo\&) |  |
| static [ReadOnly](./readonly/)(const TextInfoPtr\&) | يسترجع نسخة للقراءة فقط من الثقافة. |
| virtual [set_ListSeparator](./set_listseparator/)(String) | يضبط فاصل القائمة. |
| [TextInfo](./textinfo/)(const TextInfo\&) | معلومات RTTI. |
| virtual [ToLower](./tolower/)(char_t) const | يحوّل الحرف إلى حالة صغيرة. |
| virtual [ToLower](./tolower/)(String) const | يحوّل السلسلة إلى حالة صغيرة. |
| [ToString](./tostring/)() const override | نظير طريقة C# [Object.ToString()](../../system/object/tostring/). يتيح تحويل الكائنات المخصصة إلى سلسلة. |
| [ToTitleCase](./totitlecase/)(String) const | يحوّل السلسلة إلى حالة العنوان (باستثناء الاختصارات التي هي بالفعل بحروف كبيرة). |
| virtual [ToUpper](./toupper/)(char_t) const | يحوّل الحرف إلى حالة كبيرة. |
| virtual [ToUpper](./toupper/)(String) const | يحوّل السلسلة إلى حالة كبيرة. |
## انظر أيضًا

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
