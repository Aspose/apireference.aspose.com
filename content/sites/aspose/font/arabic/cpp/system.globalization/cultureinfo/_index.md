---
title: "System::Globalization::CultureInfo class"
linktitle: "CultureInfo"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Globalization::CultureInfo. مجموعة من القيم والخوارزميات الخاصة بالثقافة. عمليات الضبط مفعلة فقط على الكائنات غير القابلة للقراءة فقط. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() . لا تقم أبداً بإنشاء مثال من هذا النوع على المكدس أو باستخدام عامل new، حيث سيتسبب ذلك في أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 500
url: /ar/cpp/system.globalization/cultureinfo/
---
## CultureInfo class


مجموعة من القيم والخوارزميات الخاصة بالثقافة. عمليات الضبط مفعلة فقط على الكائنات غير القابلة للقراءة فقط. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثال من هذا النوع على المكدس أو باستخدام عامل new، حيث سيتسبب ذلك في أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class CultureInfo : public virtual System::Object,
                    public System::IFormatProvider,
                    public System::ICloneable
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [ClearCachedData](./clearcacheddata/)() | يقوم بتحديث معلومات الثقافة المخزنة مؤقتًا. |
| [Clone](./clone/)() override | ينسخ معلومات الثقافة. |
| static [CreateSpecificCulture](./createspecificculture/)(const String\&) | ينشئ ثقافة بناءً على الاسم. |
| explicit [CultureInfo](./cultureinfo/)(int) | معلومات RTTI. |
| [CultureInfo](./cultureinfo/)(int, bool) | المُنشئ. |
| explicit [CultureInfo](./cultureinfo/)(const String\&) | المُنشئ. |
| [CultureInfo](./cultureinfo/)(const String\&, bool) | المُنشئ. |
| [CultureInfo](./cultureinfo/)(std::nullptr_t) | دائمًا يرمي استثناء ArgumentNullException. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | يقارن الكائنات. |
| virtual [get_Calendar](./get_calendar/)() const | يحصل على التقويم المستخدم من قبل الثقافة. |
| virtual [get_CompareInfo](./get_compareinfo/)() const | يحصل على مُقارن السلاسل الذي يلتزم بقواعد الثقافة. |
| [get_CultureTypes](./get_culturetypes/)() const | يحصل على الجمع الثنائي لأنواع الثقافة التي تصف الثقافة الحالية. |
| static [get_CurrentCulture](./get_currentculture/)() | يحصل على الثقافة المحددة للخيط الحالي. |
| static [get_CurrentUICulture](./get_currentuiculture/)() | يحصل على ثقافة واجهة المستخدم للخيط الحالي. |
| virtual [get_DateTimeFormat](./get_datetimeformat/)() const | يحصل على معلومات تنسيق التاريخ. |
| static [get_DefaultThreadCurrentCulture](./get_defaultthreadcurrentculture/)() | يحصل على الثقافة الافتراضية في نطاق التطبيق الحالي. |
| static [get_DefaultThreadCurrentUICulture](./get_defaultthreadcurrentuiculture/)() | يحصل على ثقافة واجهة المستخدم الافتراضية في نطاق التطبيق الحالي. |
| virtual [get_DisplayName](./get_displayname/)() const | يحصل على اسم العرض للثقافة. |
| virtual [get_EnglishName](./get_englishname/)() const | يحصل على الاسم الإنجليزي للثقافة. |
| [get_IetfLanguageTag](./get_ietflanguagetag/)() const | يحصل على اسم RFC 4646 للغة. |
| static [get_InstalledUICulture](./get_installeduiculture/)() | يحصل على الثقافة المثبتة مع نظام التشغيل. |
| static [get_InvariantCulture](./get_invariantculture/)() | يحصل على الثقافة الثابتة. |
| virtual [get_IsNeutralCulture](./get_isneutralculture/)() const | يتحقق مما إذا كانت الثقافة محايدة. |
| [get_IsReadOnly](./get_isreadonly/)() const | يتحقق مما إذا كان كائن الثقافة للقراءة فقط. |
| virtual [get_KeyboardLayoutId](./get_keyboardlayoutid/)() const | يحصل على معرف اللغة النشطة للإدخال. |
| virtual [get_LCID](./get_lcid/)() const | يحصل على معرف الثقافة. |
| virtual [get_Name](./get_name/)() const | يحصل على اسم الثقافة. |
| virtual [get_NativeName](./get_nativename/)() const | يحصل على الاسم الأصلي للثقافة. |
| virtual [get_NumberFormat](./get_numberformat/)() const | يحصل على معلومات تنسيق الأرقام. |
| virtual [get_OptionalCalendars](./get_optionalcalendars/)() const | قائمة التقويمات التي يمكن استخدامها مع الثقافة. |
| virtual [get_Parent](./get_parent/)() const | يحصل على الثقافة الأصلية. |
| virtual [get_TextInfo](./get_textinfo/)() const | يحصل على معلمات النص المستخدمة من قبل الثقافة. |
| virtual [get_ThreeLetterISOLanguageName](./get_threeletterisolanguagename/)() const | يحصل على رمز اللغة ISO 639-2 المكوّن من ثلاثة أحرف. |
| virtual [get_ThreeLetterWindowsLanguageName](./get_threeletterwindowslanguagename/)() const | يحصل على رمز اللغة المكوّن من ثلاثة أحرف كما هو معرف في واجهة برمجة تطبيقات [Windows](../../system.windows/). |
| virtual [get_TwoLetterISOLanguageName](./get_twoletterisolanguagename/)() const | يحصل على اسم اللغة ISO المكوّن من حرفين المرتبط بالثقافة. |
| [get_UseUserOverride](./get_useuseroverride/)() const | يحصل على إشارة توضح ما إذا كان [CultureInfo](./) يستخدم إعدادات الثقافة التي يختارها المستخدم. |
| [GetConsoleFallbackUICulture](./getconsolefallbackuiculture/)() const | يحصل على ثقافة بديلة مناسبة لتطبيقات سطر الأوامر. |
| static [GetCultureInfo](./getcultureinfo/)(const String\&) | يحصل على الثقافة حسب اسمها. نفس وظيفة CreateSpecificCulture. |
| static [GetCultureInfo](./getcultureinfo/)(const String\&, const String\&) | يحصل على الثقافة حسب اسمها. |
| static [GetCultureInfo](./getcultureinfo/)(int32_t) | يحصل على الثقافة حسب المعرف. |
| static [GetCultureInfoByIetfLanguageTag](./getcultureinfobyietflanguagetag/)(const String\&) | مهمل. يحصل على كائن [CultureInfo](./) للقراءة فقط وفقًا لعلامة اللغة RFC 4646 المحددة. |
| static [GetCultures](./getcultures/)(CultureTypes) | يحصل على الثقافات التي تنتمي إلى الأنواع المحددة. |
| [GetFormat](./getformat/)(const TypeInfo\&) override | يحصل على كائن التنسيق للنوع المحدد. |
| [GetHashCode](./gethashcode/)() const override | يرجع رمز التجزئة للكائن. |
| [IsInherited](./isinherited/)() const | يحصل على إشارة الوراثة. للاستخدام الداخلي فقط. |
| [operator=](./operator=/)(const CultureInfo\&) |  |
| [operator==](./operator==/)(const CultureInfo\&) const | يقارن معلمات الثقافة. |
| static [ReadOnly](./readonly/)(const CultureInfoPtr\&) | يحصل على نسخة للقراءة فقط من الثقافة. |
| static [set_CurrentCulture](./set_currentculture/)(const CultureInfoPtr\&) | يضبط الثقافة للخيط الحالي. |
| static [set_CurrentUICulture](./set_currentuiculture/)(const CultureInfoPtr\&) | يضبط ثقافة واجهة المستخدم للخيط الحالي. |
| virtual [set_DateTimeFormat](./set_datetimeformat/)(DateTimeFormatInfoPtr) | يضبط معلومات تنسيق التاريخ. |
| static [set_DefaultThreadCurrentCulture](./set_defaultthreadcurrentculture/)(const CultureInfoPtr\&) | يضبط الثقافة الافتراضية في نطاق التطبيق الحالي. |
| static [set_DefaultThreadCurrentUICulture](./set_defaultthreadcurrentuiculture/)(const CultureInfoPtr\&) | يضبط ثقافة واجهة المستخدم الافتراضية في نطاق التطبيق الحالي. |
| virtual [set_NumberFormat](./set_numberformat/)(NumberFormatInfoPtr) | يحصل على معلومات تنسيق الأرقام. |
| [ToString](./tostring/)() const override | يحوّل الثقافة إلى سلسلة. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Class [IFormatProvider](../../system/iformatprovider/)
* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
