---
title: "System::TypeInfo class"
linktitle: "TypeInfo"
second_title: "Aspose.Font لـ C++"
description: "System::TypeInfo class. تمثل نوعًا معينًا وتوفر معلومات عنه في C++."
type: docs
weight: 6600
url: /ar/cpp/system/typeinfo/
---
## TypeInfo class


يمثل نوعًا معينًا ويقدم معلومات عنه.

```cpp
class TypeInfo
```

## Nested classes

## الطرق

| طريقة | الوصف |
| --- | --- |
| [AddAttribute](./addattribute/)(const ObjectPtr\&) | يضيف السمة المحددة إلى قائمة سمات النوع. |
| [AddDefaultConstructor](./adddefaultconstructor/)() | يضبط المُنشئ الافتراضي للنوع T. |
| [AddDefaultConstructor](./adddefaultconstructor/)(DefaultConstructor) | يضبط المُنشئ الافتراضي بواسطة الـ functor الذي ينشئ نسخة من الفئة. |
| [AddMember](./addmember/)(const SharedPtr\<System::Reflection::MemberInfo\>\&) | يضيف العضو المحدد إلى قائمة أعضاء النوع. |
| static [BoxedValueType](./boxedvaluetype/)() | يوفر بنية فريدة من نوعها لـ [TypeInfo](./) من أجل نوع [BoxedValue](./boxedvalue/) لتُشاركها عدة فئات Boxed*. |
| [Equals](./equals/)(const TypeInfo\&) const |  |
| [get_Assembly](./get_assembly/)() const | غير مُنفّذ. يُرجع مؤشرًا إلى التجميع الذي تم فيه إعلان النوع الممثَّل بواسطة الكائن الحالي. |
| [get_AssemblyQualifiedName](./get_assemblyqualifiedname/)() const | غير مُنفّذ. يُرجع الاسم المؤهل بالكامل بما في ذلك اسم التجميع للنّوع الممثَّل بواسطة الكائن الحالي. |
| [get_BaseType](./get_basetype/)() const | يُرجع موصِّف النوع الأساسي. |
| [get_ContainsGenericParameters](./get_containsgenericparameters/)() const | يحصل على قيمة تُشير إلى ما إذا كان كائن Type الحالي يحتوي على معلمات نوع لم يتم استبدالها بأنواع محددة. |
| [get_DeclaredMember](./get_declaredmember/)(const String\&) const | يحصل على قائمة الأعضاء الذين يحملون الاسم المحدد. |
| [get_FullName](./get_fullname/)() const | يُرجع الاسم المؤهل بالكامل (بدون اسم التجميع) للنّوع الممثَّل بواسطة الكائن الحالي. |
| [get_GenericTypeArguments](./get_generictypearguments/)() const | يحصل على مصفوفة من معاملات النوع العامة لهذا النوع. |
| [get_IsAbstract](./get_isabstract/)() const | يحصل على قيمة تُشير إلى ما إذا كان النوع Type مجردًا ويجب تجاوزُه. |
| [get_IsArray](./get_isarray/)() const | يحصل على قيمة تُشير إلى ما إذا كان النوع مصفوفة. |
| [get_IsClass](./get_isclass/)() const | يحصل على قيمة تُشير إلى ما إذا كان النوع Type فئة أو مُفوض؛ أي ليس نوع قيمة أو واجهة. |
| [get_IsEnum](./get_isenum/)() const | يحصل على قيمة تُشير إلى ما إذا كان النوع Type الحالي يمثل تعدادًا. |
| [get_IsGenericType](./get_isgenerictype/)() const |  |
| [get_IsGenericTypeDefinition](./get_isgenerictypedefinition/)() const | يحصل على قيمة تُشير إلى ما إذا كان النوع Type الحالي يمثل تعريف نوع عام يمكن من خلاله إنشاء أنواع عامة أخرى. |
| [get_IsInterface](./get_isinterface/)() const | يحصل على قيمة تشير إلى ما إذا كان Type واجهة؛ أي ليس فئة أو نوع قيمة. |
| [get_IsSealed](./get_issealed/)() const | يحصل على قيمة تشير إلى ما إذا كان Type مُحكمًا. |
| [get_IsValueType](./get_isvaluetype/)() const | يحصل على قيمة تشير إلى ما إذا كان Type نوع قيمة. |
| [get_IsVisible](./get_isvisible/)() const | يحصل على قيمة تشير إلى ما إذا كان يمكن الوصول إلى Type بواسطة شفرة خارج التجميع. |
| [get_Name](./get_name/)() const | يرجع اسم النوع الممثل بواسطة الكائن الحالي. |
| [get_Namespace](./get_namespace/)() const | يحصل على مساحة الاسم الخاصة بـ Type. |
| [GetConstructor](./getconstructor/)(const ArrayPtr\<TypeInfo\>\&) const | يبحث عن مُنشئ نسخة عام تكون معلماته مطابقة للأنواع في المصفوفة المحددة. |
| [GetConstructors](./getconstructors/)(System::Reflection::BindingFlags) const | يبحث عن المُنشئات المعرفة للـ Type الحالي، باستخدام BindingFlags المحددة. |
| [GetConstructors](./getconstructors/)() const | يرجع جميع المُنشئات العامة المعرفة للـ Type الحالي. |
| [GetCustomAttribute](./getcustomattribute/)(const TypeInfo\&) const | يبحث عن السمة المخصصة المطبقة التي لها النوع المحدد والمطبقة على النوع الممثل بواسطة الكائن الحالي. |
| [GetCustomAttributes](./getcustomattributes/)() const | يرجع مصفوفة تحتوي على كائنات تمثل جميع السمات المخصصة المطبقة على النوع. |
| [GetCustomAttributes](./getcustomattributes/)(const TypeInfo\&, bool) const | يرجع مصفوفة تحتوي على كائنات تمثل السمات المحددة المطبقة على النوع. |
| [GetElementType](./getelementtype/)() const | غير مُنفّذ. |
| [GetField](./getfield/)(const System::String\&, System::Reflection::BindingFlags) const | يبحث عن الحقل المحدد، باستخدام قيود الربط المحددة. |
| [GetFields](./getfields/)(System::Reflection::BindingFlags) const | يبحث عن الحقول المعرفة للـ Type الحالي، باستخدام قيود الربط المحددة. |
| [GetGenericArguments](./getgenericarguments/)() const | يحصل على مصفوفة من معاملات النوع العامة لهذا النوع. |
| [GetHashCode](./gethashcode/)() const | يرجع قيمة تجزئة (hash code) مرتبطة بهذه المثيلة. |
| [GetInterfaces](./getinterfaces/)() const | يحصل على جميع الواجهات التي تم تنفيذها أو وراثتها من قبل Type الحالي. |
| [GetMember](./getmember/)(const String\&) const | يحصل على قائمة الأعضاء الذين يحملون الاسم المحدد. |
| [GetMethod](./getmethod/)(const String\&) const | يحصل على الطريقة ذات الاسم المحدد. |
| [GetProperties](./getproperties/)() const | يرجع جميع الخصائص العامة للـ Type الحالي. |
| [GetProperties](./getproperties/)(System::Reflection::BindingFlags) const | يبحث عن خصائص الـ Type الحالي، باستخدام قيود الربط المحددة. |
| [GetTemplParamType](./gettemplparamtype/)() const | يحصل على وصف نوع معامل القالب. |
| [Hash](./hash/)() const | يرجع قيمة تجزئة مرتبطة بالنوع الممثل بواسطة الكائن الحالي. |
| [IsAssignableFrom](./isassignablefrom/)(const TypeInfo\&) const | يحدد ما إذا كان يمكن تعيين نسخة من نوع محدد إلى متغير من النوع الحالي. |
| [IsDefined](./isdefined/)(const TypeInfo\&, bool) const | غير مُنفَّذ. يشير إلى ما إذا كان يتم تطبيق سمة واحدة أو أكثر من النوع المحدد أو من أنواعه المشتقة على هذا العضو. |
| [IsInstanceOfType](./isinstanceoftype/)(const SharedPtr\<Object\>\&) const | يحدد ما إذا كان الكائن المحدد نسخة من النوع الحالي. |
| [IsSubclassOf](./issubclassof/)(const TypeInfo\&) const | يحدد ما إذا كان النوع الممثل بواسطة الكائن الحالي هو فئة فرعية من الفئة المحددة. |
| [operator!=](./operator!=/)(const TypeInfo\&) const | يحدد ما إذا كانت كائنات [TypeInfo](./) الحالية والمحددة غير متساوية. |
| [operator!=](./operator!=/)(std::nullptr_t) const | يحدد ما إذا كان كائن [TypeInfo](./) الحالي ليس كائنًا فارغًا، أي أنه يمثل نوعًا ما. |
| [operator==](./operator==/)(const TypeInfo\&) const | يحدد ما إذا كانت كائنات [TypeInfo](./) الحالية والمحددة متساوية. |
| [operator==](./operator==/)(std::nullptr_t) const | يحدد ما إذا كان كائن [TypeInfo](./) الحالي هو كائن فارغ، أي لا يمثل أي نوع. |
| [reset](./reset/)() | يضبط [TypeInfo](./) إلى قيمة فارغة. |
| [set_IsValueType](./set_isvaluetype/)(bool) | يضبط قيمة تشير إلى ما إذا كان النوع نوعًا قيمياً. |
| [SetBaseType](./setbasetype/)(GetTypeInfoFunPtr) | يضبط موصّف النوع الأساسي. |
| [SetTemplParamType](./settemplparamtype/)(const TypeInfo\&) | يضبط موصّف نوع معامل القالب. |
| static [StringHash](./stringhash/)(const char_t *) | يحسب التجزئة للسلسلة المحددة. |
| [ToString](./tostring/)() const | يرجع سلسلة تحتوي على اسم النوع الممثّل بواسطة الكائن الحالي. |
| static [Type](./type/)() | يرجع كائنًا من نوع [TypeInfo](./) يمثل فئة [TypeInfo](./). |
| [TypeInfo](./typeinfo/)() | منشئ افتراضي (لم يتم تعيين أي نوع). |
| [TypeInfo](./typeinfo/)(std::nullptr_t) | منشئ كائن فارغ (لم يتم تعيين أي نوع). |
| [TypeInfo](./typeinfo/)(const char_t *) | المُنشئ. |
| [TypeInfo](./typeinfo/)(const char_t *, uint32_t) | المُنشئ. |
| [TypeInfo](./typeinfo/)(const std::type_info\&) | المُنشئ. |
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
* Library [Aspose.Font for C++](../../)
