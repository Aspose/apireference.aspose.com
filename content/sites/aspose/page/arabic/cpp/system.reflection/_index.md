---
title: "مساحة الاسم System::Reflection"
linktitle: "System::Reflection"
second_title: "Aspose.Page لـ C++"
description: "كيفية استخدام مساحة الاسم System::Reflection في C++."
type: docs
weight: 4900
url: /ar/cpp/system.reflection/
---



## الفئات

| فئة | الوصف |
| --- | --- |
| [Assembly](./assembly/) | الفئة [Reflection](./) تصف التجميع. الدعم محدود لأن القواعد تختلف كثيرًا بين C# و C++. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/). لا تقم بإنشاء مثيل لهذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [AssemblyName](./assemblyname/) | يحدد اسم التجميع. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/). لا تقم بإنشاء مثيل لهذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [AssemblyTypeRegistration](./assemblytyperegistration/) | Singleton لتسجيل النوع في التجميع الجاري. |
| [AssemblyTypeRegistrationBase](./assemblytyperegistrationbase/) | النوع الأساسي لـ singletons لتسجيل النوع في التجميع الجاري. |
| [ConstructorInfo](./constructorinfo/) | يوفر الوصول إلى بيانات تعريف المُنشئ. |
| [FieldInfo](./fieldinfo/) | يكتشف سمات الحقل ويوفر الوصول إلى بيانات تعريف الحقل. |
| [MemberInfo](./memberinfo/) | يوفر معلومات الانعكاس حول الأعضاء. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/). لا تقم بإنشاء مثيل لهذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [MethodBase](./methodbase/) | المعلومات الأساسية حول الطريقة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/). لا تقم بإنشاء مثيل لهذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [MethodInfo](./methodinfo/) | يمثل معلومات حول طريقة الفئة. |
| [PropertyInfo](./propertyinfo/) | يمثل معلومات الخاصية. |
## Enums

| تعداد | الوصف |
| --- | --- |
| [BindingFlags](./bindingflags/) | يحدد الأعضاء وأنماط البحث عن الأنواع والربط. |
| [FieldAttributes](./fieldattributes/) | سمات الحقل المنعكسة. |
| [MemberTypes](./membertypes/) | يحدد كل نوع من الأعضاء. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [ReflectionTypeLoadException](./reflectiontypeloadexception/) | [ReflectionTypeLoadException](./reflectiontypeloadexception/) يُرمى بواسطة طريقة Module.GetTypes إذا فشل تحميل أي من الفئات في الوحدة. لا تقم بتغليف مثيلات فئة [ReflectionTypeLoadException](./reflectiontypeloadexception/) في [System::SmartPtr](../system/smartptr/). |
| [TargetInvocationException](./targetinvocationexception/) | [TargetInvocationException](./targetinvocationexception/) يُرمى بواسطة الطرق المستدعاة عبر الانعكاس. لا تقم بتغليف مثيلات فئة [TargetInvocationException](./targetinvocationexception/) في [System::SmartPtr](../system/smartptr/). |
