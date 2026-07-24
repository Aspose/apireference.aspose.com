---
title: "فئة System::TypeInfo"
linktitle: "TypeInfo"
second_title: "Aspose.Page لـ C++"
description: "فئة System::TypeInfo. تمثّل نوعاً معيناً وتوفر معلومات عنه في C++."
type: docs
weight: 6600
url: /ar/cpp/system/typeinfo/
---
## TypeInfo class


يمثل نوعًا معينًا ويوفر معلومات عنه.

```cpp
class TypeInfo
```

## Nested classes

## الطرق

| طريقة | الوصف |
| --- | --- |
| [AddAttribute](./addattribute/)(const ObjectPtr\&) | يضيف السمة المحددة إلى قائمة سمات النوع. |
| [AddDefaultConstructor](./adddefaultconstructor/)() | يضبط المنشئ الافتراضي للنوع T. |
| [AddDefaultConstructor](./adddefaultconstructor/)(DefaultConstructor) | يضبط المنشئ الافتراضي بواسطة الدالة الكائنية التي تنشئ مثيل الفئة. |
| [AddMember](./addmember/)(const SharedPtr\<System::Reflection::MemberInfo\>\&) | يضيف العضو المحدد إلى قائمة أعضاء النوع. |
| static [BoxedValueType](./boxedvaluetype/)() | يوفر بنية [TypeInfo](./) فريدة لنوع [BoxedValue](./boxedvalue/) لتُشاركها عدة فئات Boxed*. |
| [Equals](./equals/)(const TypeInfo\&) const |  |
| [get_Assembly](./get_assembly/)() const | غير مُنفّذ. يُعيد مؤشرًا إلى التجميع الذي تم إعلان النوع الممثَّل بالكائن الحالي فيه. |
| [get_AssemblyQualifiedName](./get_assemblyqualifiedname/)() const | غير مُنفّذ. يُعيد الاسم المؤهل بالكامل بما في ذلك اسم التجميع للنوع الممثَّل بالكائن الحالي. |
| [get_BaseType](./get_basetype/)() const | يعيد موصِّف النوع الأساسي. |
| [get_ContainsGenericParameters](./get_containsgenericparameters/)() const | يحصل على قيمة تُشير إلى ما إذا كان كائن Type الحالي يحتوي على معلمات نوع لم تُستبدل بأنواع محددة. |
| [get_DeclaredMember](./get_declaredmember/)(const String\&) const | يحصل على قائمة الأعضاء ذات الاسم المحدد. |
| [get_FullName](./get_fullname/)() const | يعيد الاسم المؤهل بالكامل (ولكن بدون اسم التجميع) للنوع الممثل بواسطة الكائن الحالي. |
| [get_GenericTypeArguments](./get_generictypearguments/)() const | يحصل على مصفوفة من معاملات النوع العام لهذا النوع. |
| [get_IsAbstract](./get_isabstract/)() const | يحصل على قيمة تشير إلى ما إذا كان النوع مجردًا ويجب تجاوزه. |
| [get_IsArray](./get_isarray/)() const | يحصل على قيمة تشير إلى ما إذا كان النوع مصفوفة. |
| [get_IsClass](./get_isclass/)() const | يحصل على قيمة تشير إلى ما إذا كان النوع فئة أو مندوبًا؛ أي ليس نوع قيمة أو واجهة. |
| [get_IsEnum](./get_isenum/)() const | يحصل على قيمة تشير إلى ما إذا كان النوع الحالي يمثل تعدادًا. |
| [get_IsGenericType](./get_isgenerictype/)() const |  |
| [get_IsGenericTypeDefinition](./get_isgenerictypedefinition/)() const | يحصل على قيمة تشير إلى ما إذا كان النوع الحالي يمثل تعريف نوع عام يمكن بناء أنواع عامة أخرى منه. |
| [get_IsInterface](./get_isinterface/)() const | يحصل على قيمة تشير إلى ما إذا كان النوع واجهة؛ أي ليس فئة أو نوع قيمة. |
| [get_IsSealed](./get_issealed/)() const | يحصل على قيمة تشير إلى ما إذا كان النوع مُعلنًا كختم. |
| [get_IsValueType](./get_isvaluetype/)() const | يحصل على قيمة تشير إلى ما إذا كان النوع نوع قيمة. |
| [get_IsVisible](./get_isvisible/)() const | يحصل على قيمة تشير إلى ما إذا كان يمكن الوصول إلى النوع بواسطة شفرة خارج التجميع. |
| [get_Name](./get_name/)() const | يعيد اسم النوع الممثل بواسطة الكائن الحالي. |
| [get_Namespace](./get_namespace/)() const | يحصل على مساحة الاسم للنوع. |
| [GetConstructor](./getconstructor/)(const ArrayPtr\<TypeInfo\>\&) const | يبحث عن مُنشئ نسخة عام تكون معلماته مطابقة للأنواع في المصفوفة المحددة. |
| [GetConstructors](./getconstructors/)(System::Reflection::BindingFlags) const | يبحث عن المُنشئات المعرفة للنوع الحالي، باستخدام BindingFlags المحددة. |
| [GetConstructors](./getconstructors/)() const | يعيد جميع المُنشئات العامة المعرفة للنوع الحالي. |
| [GetCustomAttribute](./getcustomattribute/)(const TypeInfo\&) const | يبحث عن السمة المخصصة المطبقة التي لها النوع المحدد والمطبقة على النوع الممثل بواسطة الكائن الحالي. |
| [GetCustomAttributes](./getcustomattributes/)() const | يعيد مصفوفة تحتوي على كائنات تمثل جميع السمات المخصصة المطبقة على النوع. |
| [GetCustomAttributes](./getcustomattributes/)(const TypeInfo\&, bool) const | يعيد مصفوفة تحتوي على كائنات تمثل سمات محددة مطبقة على النوع. |
| [GetElementType](./getelementtype/)() const | غير مُنفَّذ. |
| [GetField](./getfield/)(const System::String\&, System::Reflection::BindingFlags) const | يبحث عن الحقل المحدد، باستخدام قيود الربط المحددة. |
| [GetFields](./getfields/)(System::Reflection::BindingFlags) const | يبحث عن الحقول المعرفة للنوع الحالي، باستخدام قيود الربط المحددة. |
| [GetGenericArguments](./getgenericarguments/)() const | يحصل على مصفوفة من معاملات النوع العام لهذا النوع. |
| [GetHashCode](./gethashcode/)() const | يعيد رمز تجزئة مرتبط بهذه المثيلة. |
| [GetInterfaces](./getinterfaces/)() const | يحصل على جميع الواجهات التي تم تنفيذها أو وراثتها من قبل النوع الحالي. |
| [GetMember](./getmember/)(const String\&) const | يحصل على قائمة الأعضاء ذات الاسم المحدد. |
| [GetMethod](./getmethod/)(const String\&) const | يحصل على الطريقة ذات الاسم المحدد. |
| [GetProperties](./getproperties/)() const | يعيد جميع الخصائص العامة للنوع الحالي. |
| [GetProperties](./getproperties/)(System::Reflection::BindingFlags) const | يبحث عن خصائص النوع الحالي، باستخدام قيود الربط المحددة. |
| [GetTemplParamType](./gettemplparamtype/)() const | يحصل على موصّف نوع معامل القالب. |
| [Hash](./hash/)() const | يرجع قيمة تجزئة مرتبطة بالنوع الممثّل بواسطة الكائن الحالي. |
| [IsAssignableFrom](./isassignablefrom/)(const TypeInfo\&) const | يحدد ما إذا كان يمكن تعيين نسخة من نوع محدد إلى متغيّر من النوع الحالي. |
| [IsDefined](./isdefined/)(const TypeInfo\&, bool) const | غير مُنفّذ. يوضح ما إذا كان أحد أو أكثر من سمات النوع المحدد أو أنواعه المشتقة مطبّقًا على هذا العضو. |
| [IsInstanceOfType](./isinstanceoftype/)(const SharedPtr\<Object\>\&) const | يحدد ما إذا كان الكائن المحدد نسخة من النوع الحالي. |
| [IsSubclassOf](./issubclassof/)(const TypeInfo\&) const | يحدد ما إذا كان النوع الممثّل بواسطة الكائن الحالي فئة فرعية من الفئة المحددة. |
| [operator!=](./operator!=/)(const TypeInfo\&) const | يحدد ما إذا كان الكائنان [TypeInfo](./) الحاليان والمحددان غير متساويين. |
| [operator!=](./operator!=/)(std::nullptr_t) const | يحدد ما إذا كان كائن [TypeInfo](./) الحالي ليس كائنًا فارغًا، أي أنه يمثل نوعًا ما. |
| [operator==](./operator==/)(const TypeInfo\&) const | يحدد ما إذا كان الكائنان [TypeInfo](./) الحاليان والمحددان متساويين. |
| [operator==](./operator==/)(std::nullptr_t) const | يحدد ما إذا كان كائن [TypeInfo](./) الحالي كائنًا فارغًا، أي أنه لا يمثل أي نوع. |
| [reset](./reset/)() | يضبط [TypeInfo](./) إلى قيمة فارغة. |
| [set_IsValueType](./set_isvaluetype/)(bool) | يضبط قيمة تشير إلى ما إذا كان النوع نوع قيمة. |
| [SetBaseType](./setbasetype/)(GetTypeInfoFunPtr) | يضبط موصّف النوع الأساسي. |
| [SetTemplParamType](./settemplparamtype/)(const TypeInfo\&) | يضبط موصّف نوع معامل القالب. |
| static [StringHash](./stringhash/)(const char_t *) | يحسب التجزئة للسلسلة المحددة. |
| [ToString](./tostring/)() const | يرجع سلسلة تحتوي على اسم النوع الممثّل بواسطة الكائن الحالي. |
| static [Type](./type/)() | يرجع كائنًا من نوع [TypeInfo](./) يمثل فئة [TypeInfo](./). |
| [TypeInfo](./typeinfo/)() | المنشئ الافتراضي (لم يتم تعيين أي نوع). |
| [TypeInfo](./typeinfo/)(std::nullptr_t) | منشئ كائن فارغ (لم يتم تعيين أي نوع). |
| [TypeInfo](./typeinfo/)(const char_t *) | منشئ. |
| [TypeInfo](./typeinfo/)(const char_t *, uint32_t) | منشئ. |
| [TypeInfo](./typeinfo/)(const std::type_info\&) | منشئ. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [EmptyType](./emptytype/) | ثابت يمثل قائمة فارغة من [TypeInfo](./). |
| static [EmptyTypes](./emptytypes/) | ثابت يمثل قائمة فارغة من [TypeInfo](./). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [DefaultConstructor](./defaultconstructor/) | مؤشر دالة لإنشاء النوع. |
## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
