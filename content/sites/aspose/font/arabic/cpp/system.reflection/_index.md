---
title: "مساحة الأسماء System::Reflection"
linktitle: "System::Reflection"
second_title: "Aspose.Font لـ C++"
description: "كيفية استخدام مساحة الأسماء System::Reflection في C++."
type: docs
weight: 5300
url: /ar/cpp/system.reflection/
---



## الفئات

| الفئة | الوصف |
| --- | --- |
| [Assembly](./assembly/) | فئة [Reflection](./) التي تصف التجميع. الدعم محدود لأن القواعد تختلف كثيراً بين C# و C++. يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيسبب أخطاء تشغيلية و/أو فشل في التأكيد. احرص دائماً على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [AssemblyName](./assemblyname/) | يحدد اسم التجميع. يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيسبب أخطاء تشغيلية و/أو فشل في التأكيد. احرص دائماً على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [AssemblyTypeRegistration](./assemblytyperegistration/) | كائن أحادي لتسجيل النوع في التجميع التنفيذي. |
| [AssemblyTypeRegistrationBase](./assemblytyperegistrationbase/) | النوع الأساسي للكائنات الأحادية لتسجيل النوع في التجميع التنفيذي. |
| [ConstructorInfo](./constructorinfo/) | يوفر الوصول إلى بيانات تعريف المُنشئ. |
| [FieldInfo](./fieldinfo/) | يكتشف سمات الحقل ويوفر الوصول إلى بيانات تعريف الحقل. |
| [MemberInfo](./memberinfo/) | يوفر معلومات انعكاس حول الأعضاء. يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيسبب أخطاء تشغيلية و/أو فشل في التأكيد. احرص دائماً على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [MethodBase](./methodbase/) | معلومات أساسية حول الطريقة. يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيسبب أخطاء تشغيلية و/أو فشل في التأكيد. احرص دائماً على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [MethodInfo](./methodinfo/) | يمثل معلومات حول طريقة الفئة. |
| [PropertyInfo](./propertyinfo/) | يمثل معلومات الخاصية. |
## Enums

| تعداد | الوصف |
| --- | --- |
| [BindingFlags](./bindingflags/) | يحدد أعضاء وأنماط البحث عن الأنواع والربط. |
| [FieldAttributes](./fieldattributes/) | سمات الحقل المنعكسة. |
| [MemberTypes](./membertypes/) | يحدد كل نوع من الأعضاء. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [ReflectionTypeLoadException](./reflectiontypeloadexception/) | [ReflectionTypeLoadException](./reflectiontypeloadexception/) يُرمى بواسطة طريقة Module.GetTypes إذا فشل تحميل أي من الفئات في الوحدة. لا تقم بتغليف مثيلات فئة [ReflectionTypeLoadException](./reflectiontypeloadexception/) داخل [System::SmartPtr](../system/smartptr/). |
| [TargetInvocationException](./targetinvocationexception/) | [TargetInvocationException](./targetinvocationexception/) يُرمى بواسطة الطرق المستدعاة عبر الانعكاس. لا تقم بتغليف مثيلات فئة [TargetInvocationException](./targetinvocationexception/) داخل [System::SmartPtr](../system/smartptr/). |
