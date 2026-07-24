---
title: "فئة System::Globalization::SortVersion"
linktitle: "SortVersion"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Globalization::SortVersion. توفر معلومات حول إصدار Unicode المستخدم لمقارنة وترتيب السلاسل. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2300
url: /ar/cpp/system.globalization/sortversion/
---
## SortVersion class


توفر معلومات حول إصدار Unicode المستخدم لمقارنة وترتيب السلاسل. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) . لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class SortVersion : public System::IEquatable<SharedPtr<SortVersion>>
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<SortVersion\>) override | يتحقق مما إذا كانت نسخة [SortVersion](./) الحالية مساوية لكائن [SortVersion](./) محدد. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | يتحقق مما إذا كانت نسخة [SortVersion](./) الحالية مساوية لكائن [SortVersion](./) محدد. |
| [get_FullVersion](./get_fullversion/)() | يحصل على رقم الإصدار الكامل. |
| [get_SortId](./get_sortid/)() | يحصل على المعرف الفريد لهذا الكائن. |
| [GetHashCode](./gethashcode/)() const override | يحصل على رمز التجزئة للكائن الحالي. |
| [operator!=](./operator!=/)(const SortVersion\&) | يتحقق مما إذا كانت نسخة [SortVersion](./) الحالية لا تساوي كائن [SortVersion](./) المحدد. |
| [operator=](./operator=/)(const SortVersion\&) |  |
| [operator==](./operator==/)(const SortVersion\&) | يتحقق مما إذا كانت نسخة [SortVersion](./) الحالية مساوية لكائن [SortVersion](./) محدد. |
| [SortVersion](./sortversion/)(int, const Guid\&) | معلومات RTTI. |
| [SortVersion](./sortversion/)(const SortVersion\&) |  |
## انظر أيضًا

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
