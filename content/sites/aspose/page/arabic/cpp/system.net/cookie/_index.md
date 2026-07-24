---
title: "الفئة System::Net::Cookie"
linktitle: "ملف تعريف الارتباط"
second_title: "Aspose.Page لـ C++"
description: "الفئة System::Net::Cookie. تمثل ملف تعريف ارتباط HTTP. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 100
url: /ar/cpp/system.net/cookie/
---
## Cookie class


تمثل ملف تعريف ارتباط HTTP. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class Cookie : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Clone](./clone/)() | ينشئ نسخة من المثيل الحالي. |
| [Cookie](./cookie/)() | ينشئ نسخة جديدة. |
| [Cookie](./cookie/)(String, String) | ينشئ نسخة جديدة. |
| [Cookie](./cookie/)(String, String, String) | ينشئ نسخة جديدة. |
| [Cookie](./cookie/)(String, String, String, String) | ينشئ نسخة جديدة. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | يقارن الكائنات باستخدام دلالات [Object.Equals](../../system/object/equals/) في C#. |
| [get_Comment](./get_comment/)() const | يحصل على قيمة السمة 'Comment'. |
| [get_CommentUri](./get_commenturi/)() const | يحصل على قيمة السمة 'CommentURL'. |
| [get_Discard](./get_discard/)() const | يحصل على قيمة السمة 'Discard'. |
| [get_Domain](./get_domain/)() const | يحصل على قيمة السمة 'Domain'. |
| [get_DomainImplicit](./get_domainimplicit/)() | يحصل على قيمة تشير إلى ما إذا كان النطاق ضمنيًا. |
| [get_DomainKey](./get_domainkey/)() const | يعيد مفتاح النطاق. |
| [get_Expired](./get_expired/)() | يحصل على قيمة تشير إلى ما إذا انتهت صلاحية ملف تعريف الارتباط. |
| [get_Expires](./get_expires/)() | يحصل على قيمة السمة 'Expires'. |
| [get_HttpOnly](./get_httponly/)() const | يحصل على قيمة السمة 'HttpOnly'. |
| [get_Name](./get_name/)() const | يحصل على اسم ملف تعريف الارتباط. |
| [get_Path](./get_path/)() const | يحصل على قيمة السمة 'Path'. |
| [get_Plain](./get_plain/)() const | يعيد قيمة تشير إلى ما إذا كانت مواصفة ملف تعريف الارتباط هي 'Plain'. |
| [get_Port](./get_port/)() const | يحصل على قيمة السمة 'Port'. |
| [get_PortList](./get_portlist/)() const | يعيد مجموعة قيم السمة 'Port'. |
| [get_Secure](./get_secure/)() const | يحصل على قيمة السمة 'Secure'. |
| [get_TimeStamp](./get_timestamp/)() const | يعيد الوقت الذي تم فيه إنشاء ملف تعريف الارتباط. |
| [get_Value](./get_value/)() const | يحصل على قيمة ملف تعريف الارتباط. |
| [get_Variant](./get_variant/)() const | يحصل على مواصفات ملف تعريف الارتباط. |
| [get_Version](./get_version/)() const | يحصل على قيمة الخاصية '[Version](../../system/version/)' |
| [GetHashCode](./gethashcode/)() const override | نظير طريقة C# [Object.GetHashCode()](../../system/object/gethashcode/). يتيح تجزئة الكائنات المخصصة. |
| [InternalSetName](./internalsetname/)(String) | يتم استدعاء هذه الطريقة من قبل طرق أخرى لتعيين اسم طريقة. |
| [set_Comment](./set_comment/)(String) | يضبط قيمة الخاصية 'Comment'. |
| [set_CommentUri](./set_commenturi/)(System::SharedPtr\<Uri\>) | يضبط قيمة الخاصية 'CommentURL'. |
| [set_Discard](./set_discard/)(bool) | يضبط قيمة الخاصية 'Discard'. |
| [set_Domain](./set_domain/)(String) | يضبط قيمة الخاصية 'Domain'. |
| [set_DomainImplicit](./set_domainimplicit/)(bool) | يضبط قيمة تشير إلى ما إذا كان النطاق ضمنيًا. |
| [set_Expired](./set_expired/)(bool) | يضبط قيمة تشير إلى ما إذا كان ملف تعريف الارتباط قد انتهت صلاحيته. |
| [set_Expires](./set_expires/)(DateTime) | يضبط قيمة الخاصية 'Expires'. |
| [set_HttpOnly](./set_httponly/)(bool) | يضبط قيمة الخاصية 'HttpOnly'. |
| [set_Name](./set_name/)(String) | يضبط اسم ملف تعريف الارتباط. |
| [set_Path](./set_path/)(String) | يضبط قيمة الخاصية 'Path'. |
| [set_Port](./set_port/)(String) | يضبط قيمة الخاصية 'Port'. |
| [set_Secure](./set_secure/)(bool) | يضبط قيمة الخاصية 'Secure'. |
| [set_Value](./set_value/)(String) | يضبط قيمة ملف تعريف الارتباط. |
| [set_Variant](./set_variant/)(CookieVariant) | يضبط مواصفات ملف تعريف الارتباط. |
| [set_Version](./set_version/)(int32_t) | يضبط قيمة الخاصية '[Version](../../system/version/)' |
| [ToServerString](./toserverstring/)() | يسلسل المثيل الحالي إلى تمثيل نصي. |
| [ToString](./tostring/)() const override | نظير طريقة C# [Object.ToString()](../../system/object/tostring/). يتيح تحويل الكائنات المخصصة إلى سلسلة. |
| [VerifySetDefaults](./verifysetdefaults/)(CookieVariant, System::SharedPtr\<Uri\>, bool, String, bool, bool) | يتحقق ويضبط قيم الخصائص الافتراضية. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [CommentAttributeName](./commentattributename/) | اسم الخاصية 'Comment'. |
| static [CommentUrlAttributeName](./commenturlattributename/) | اسم الخاصية 'CommentURL'. |
| static [DiscardAttributeName](./discardattributename/) | اسم الخاصية 'Discard'. |
| static [DomainAttributeName](./domainattributename/) | اسم الخاصية 'Domain'. |
| static [EqualsLiteral](./equalsliteral/) | الفاصل الذي يُستخدم لفصل اسم وقيمة الخاصية. |
| static [ExpiresAttributeName](./expiresattributename/) | اسم الخاصية 'Expires'. |
| static [HttpOnlyAttributeName](./httponlyattributename/) | اسم الخاصية 'HttpOnly'. |
| static [MaxAgeAttributeName](./maxageattributename/) | اسم الخاصية 'Max-Age'. |
| static [MaxSupportedVersion](./maxsupportedversion/) | معلومات RTTI. |
| static [MaxSupportedVersionString](./maxsupportedversionstring/) | التمثيل النصي لأعلى نسخة مدعومة. |
| static [PathAttributeName](./pathattributename/) | اسم الخاصية 'Path'. |
| static [PortAttributeName](./portattributename/) | اسم الخاصية 'Port'. |
| static [PortSplitDelimiters](./portsplitdelimiters/) | المصفوفة التي تحتوي على الفواصل لقيم الخاصية 'Port'. |
| static [QuotesLiteral](./quotesliteral/) | الرمز المستخدم لتغليف أجزاء الخاصية. |
| static [ReservedToName](./reservedtoname/) | قيمة محجوزة لاسم ملف تعريف الارتباط. |
| static [ReservedToValue](./reservedtovalue/) | قيمة محجوزة لقيمة ملف تعريف الارتباط. |
| static [SecureAttributeName](./secureattributename/) | اسم الخاصية 'Secure'. |
| static [SeparatorLiteral](./separatorliteral/) | فاصل الخاصية. |
| static [SpecialAttributeLiteral](./specialattributeliteral/) | بادئة أسماء الخصائص الخاصة. |
| static [VersionAttributeName](./versionattributename/) | اسم الخاصية '[Version](../../system/version/)' |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
