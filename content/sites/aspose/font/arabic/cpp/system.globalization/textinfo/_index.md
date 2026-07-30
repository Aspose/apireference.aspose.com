---
title: "System::Globalization::TextInfo class"
linktitle: "TextInfo"
second_title: "Aspose.Font لـ C++"
description: "System::Globalization::TextInfo class. يعرّف خصائص النص الخاصة بالمحلية. عمليات الضبط مفعلة فقط على الكائنات غير القابلة للقراءة فقط. يجب تخصيص كائنات هذه الفئة باستخدام الدالة System::MakeObject() فقط. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2800
url: /ar/cpp/system.globalization/textinfo/
---
## TextInfo class


يحدد خصائص النص الخاصة بالمحلية. عمليات الضبط مفعلة فقط على الكائنات غير القابلة للقراءة فقط. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class TextInfo : public System::ICloneable
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Clone](./clone/)() override | معلومات RTTI. |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| virtual [get_ANSICodePage](./get_ansicodepage/)() const | يحصل على صفحة الترميز ANSI. |
| [get_CultureName](./get_culturename/)() const | يحصل على اسم الثقافة. |
| virtual [get_EBCDICCodePage](./get_ebcdiccodepage/)() const | يحصل على صفحة الترميز EBCDIC. |
| [get_IsReadOnly](./get_isreadonly/)() const | يتحقق مما إذا كان التنسيق للقراءة فقط. |
| [get_IsRightToLeft](./get_isrighttoleft/)() const | يفحص ما إذا كان النص مكتوبًا من اليسار إلى اليمين. |
| [get_LCID](./get_lcid/)() const | يحصل على معرف المنطقة. |
| virtual [get_ListSeparator](./get_listseparator/)() const | يحصل على فاصل القوائم. |
| virtual [get_MacCodePage](./get_maccodepage/)() const | يحصل على صفحة الترميز Macintosh. |
| virtual [get_OEMCodePage](./get_oemcodepage/)() const | يحصل على صفحة الترميز OEM. |
| [GetHashCode](./gethashcode/)() const override | نظير طريقة C# [Object.GetHashCode()](../../system/object/gethashcode/). يتيح تجزئة الكائنات المخصصة. |
| [operator=](./operator=/)(const TextInfo\&) |  |
| static [ReadOnly](./readonly/)(const TextInfoPtr\&) | يحصل على نسخة للقراءة فقط من الثقافة. |
| virtual [set_ListSeparator](./set_listseparator/)(String) | يضبط فاصل القوائم. |
| [TextInfo](./textinfo/)(const TextInfo\&) | معلومات RTTI. |
| virtual [ToLower](./tolower/)(char_t) const | يحوّل الحرف إلى حالة صغيرة. |
| virtual [ToLower](./tolower/)(String) const | يحوّل السلسلة إلى حالة صغيرة. |
| [ToString](./tostring/)() const override | تماثل طريقة C# [Object.ToString()](../../system/object/tostring/). يتيح تحويل الكائنات المخصصة إلى سلسلة. |
| [ToTitleCase](./totitlecase/)(String) const | يحوّل السلسلة إلى حالة العنوان (باستثناء الاختصارات التي هي بالفعل بحروف كبيرة). |
| virtual [ToUpper](./toupper/)(char_t) const | يحوّل الحرف إلى حالة كبيرة. |
| virtual [ToUpper](./toupper/)(String) const | يحوّل السلسلة إلى حالة كبيرة. |
## انظر أيضًا

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
