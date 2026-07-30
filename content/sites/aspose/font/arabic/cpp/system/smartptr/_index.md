---
title: "فئة System::SmartPtr"
linktitle: "SmartPtr"
second_title: "Aspose.Font لـ C++"
description: "فئة System::SmartPtr. فئة مؤشر لتغليف الأنواع التي تُخصص على الكومة. استخدمها لإدارة الذاكرة للفئات التي ترث من Object. يتبع هذا النوع من المؤشرات دلالات المؤشر المتسلل. يُخزن عداد المرجع إما في Object نفسه أو في بنية عداد مرتبطة بكيان Object بإحكام. على أي حال، جميع مثيلات SmartPtr تشكل مجموعة ملكية واحدة بغض النظر عن طريقة إنشائها، وهذا يختلف عن سلوك فئة std::shared_ptr. تحويل المؤشر الخام إلى SmartPtr آمن طالما توجد مثيلات SmartPtr أخرى تحتفظ بمرجع مشترك إلى نفس الكائن. يمكن أن تكون مثيلة فئة SmartPtr في إحدى حالتين: مؤشر مشترك ومؤشر ضعيف. للحفاظ على بقاء الكائن حيًا، يجب أن يكون عدد المراجع المشتركة إليه إيجابيًا. يمكن استخدام كل من المؤشرات الضعيفة والمشتركة للوصول إلى الكائن المشار إليه (لإستدعاء الطرق، قراءة أو كتابة الحقول، إلخ)، لكن المؤشرات الضعيفة لا تشارك في عدّ مراجع المؤشرات المشتركة. يتم حذف Object عندما يتم تدمير آخر مؤشر ''shared'' من نوع SmartPtr له. لذا، تأكد من عدم حدوث ذلك عندما لا توجد مؤشرات SmartPtr مشتركة أخرى للكائن، مثلًا أثناء إنشاء الكائن أو تدميره. استخدم كائنات الحراسة System::Object::ThisProtector (في كود C++) أو السمة CppCTORSelfReference أو CppSelfReference (في كود C# المترجم) لإصلاح هذه المشكلة. وبالمثل، تأكد من كسر مراجع الحلقة باستخدام فئة المؤشر System::WeakPtr أو وضع المؤشر System::SmartPtrMode::Weak (في كود C++) أو السمة CppWeakPtr (في كود C# المترجم). إذا كان كائنان أو أكثر يشيران إلى بعضهما باستخدام مؤشرات ''shared''، فلن يتم حذفهما أبدًا. إذا كان يجب تبديل نوع المؤشر (ضعيف أو مشترك) أثناء التشغيل، استخدم طريقة System::SmartPtr<T>::set_Mode() أو فئة System::DynamicWeakPtr. فئة SmartPtr لا تحتوي على أي طرق افتراضية. يجب أن تورثها فقط إذا كنت تنشئ استراتيجية إدارة ذاكرة خاصة بك. هذا النوع هو مؤشر لإدارة حذف كائن آخر. يجب تخصيصه على المكدس وتمريره إلى الدوال إما بالقيمة أو بالمرجع الثابت في C++."
type: docs
weight: 5500
url: /ar/cpp/system/smartptr/
---
## SmartPtr class


فئة مؤشر لتغليف الأنواع التي تُخصص على الكومة. استخدمها لإدارة الذاكرة للفئات التي ترث [Object](../object/). يتبع هذا النوع من المؤشرات دلالات المؤشر المتسلل. يُخزن عداد المرجع إما في [Object](../object/) نفسه أو في بنية عداد مرتبطة بكيان [Object](../object/) بإحكام. على أي حال، جميع مثيلات [SmartPtr](./) تشكل مجموعة ملكية واحدة بغض النظر عن طريقة إنشائها، وهذا يختلف عن سلوك فئة std::shared_ptr. تحويل المؤشر الخام إلى [SmartPtr](./) آمن طالما توجد مثيلات [SmartPtr](./) أخرى تحتفظ بمرجع مشترك إلى نفس الكائن. يمكن أن تكون مثيلة فئة [SmartPtr](./) في إحدى حالتين: مؤشر مشترك ومؤشر ضعيف. للحفاظ على بقاء الكائن حيًا، يجب أن يكون عدد المراجع المشتركة إليه إيجابيًا. يمكن استخدام كل من المؤشرات الضعيفة والمشتركة للوصول إلى الكائن المشار إليه (لإستدعاء الطرق، قراءة أو كتابة الحقول، إلخ)، لكن المؤشرات الضعيفة لا تشارك في عدّ مراجع المؤشرات المشتركة. يتم حذف [Object](../object/) عندما يتم تدمير آخر مؤشر 'shared' من نوع [SmartPtr](./) له. لذا، تأكد من عدم حدوث ذلك عندما لا توجد مؤشرات [SmartPtr](./) مشتركة أخرى للكائن، مثلًا أثناء إنشاء الكائن أو تدميره. استخدم كائنات الحراسة System::Object::ThisProtector (في كود C++) أو السمة CppCTORSelfReference أو CppSelfReference (في كود C# المترجم) لإصلاح هذه المشكلة. وبالمثل، تأكد من كسر مراجع الحلقة باستخدام فئة المؤشر [System::WeakPtr](../weakptr/) أو وضع المؤشر [System::SmartPtrMode::Weak](../smartptrmode/) (في كود C++) أو السمة CppWeakPtr (في كود C# المترجم). إذا كان كائنان أو أكثر يشيران إلى بعضهما باستخدام مؤشرات 'shared'، فلن يتم حذفهما أبدًا. إذا كان يجب تبديل نوع المؤشر (ضعيف أو مشترك) أثناء التشغيل، استخدم طريقة [System::SmartPtr<T>::set_Mode()](./set_mode/) أو فئة [System::DynamicWeakPtr](../dynamicweakptr/). فئة [SmartPtr](./) لا تحتوي على أي طرق افتراضية. يجب أن تورثها فقط إذا كنت تنشئ استراتيجية إدارة ذاكرة خاصة بك. هذا النوع هو مؤشر لإدارة حذف كائن آخر. يجب تخصيصه على المكدس وتمريره إلى الدوال إما بالقيمة أو بالمرجع الثابت.

```cpp
template<class T>class SmartPtr
```


| معامل | الوصف |
| --- | --- |
| T | نوع الكائن المشار إليه. يجب أن يكون إما [System::Object](../object/) أو فئة فرعية منه. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [begin](./begin/)() | الوصول إلى طريقة [begin()](./begin/) لمجموعة أساسية. يتم التجميع فقط إذا كان [SmartPtr_](./smartptr_/) نوعًا متخصصًا يحتوي على طريقة [begin()](./begin/). |
| [begin](./begin/)() const | الوصول إلى طريقة [begin()](./begin/) لمجموعة أساسية. يتم التجميع فقط إذا كان [SmartPtr_](./smartptr_/) نوعًا متخصصًا يحتوي على طريقة [begin()](./begin/). |
| [Cast](./cast/)() const | يحوّل المؤشر إلى نوعه نفسه. |
| [Cast](./cast/)() const | يحوّل المؤشر إلى النوع الأساسي باستخدام static_cast. |
| [Cast](./cast/)() const | يحوّل المؤشر إلى النوع المشتق باستخدام dynamic_cast. |
| [Cast](./cast/)() const | يحوّل المؤشر إلى النوع المشتق باستخدام dynamic_cast. |
| [cbegin](./cbegin/)() const | الوصول إلى طريقة [cbegin()](./cbegin/) لمجموعة أساسية. يتم التجميع فقط إذا كان [SmartPtr_](./smartptr_/) نوعًا متخصصًا يحتوي على طريقة [cbegin()](./cbegin/). |
| [cend](./cend/)() const | الوصول إلى طريقة [cend()](./cend/) لمجموعة أساسية. يتم التجميع فقط إذا كان [SmartPtr_](./smartptr_/) نوعًا متخصصًا يحتوي على طريقة [cend()](./cend/). |
| [const_pointer_cast](./const_pointer_cast/)() const | يحوّل المؤشر إلى نوع مختلف باستخدام const_cast على الكائن المشار إليه. |
| [dynamic_pointer_cast](./dynamic_pointer_cast/)() const | يحوّل المؤشر إلى نوع مختلف باستخدام dynamic_cast على الكائن المشار إليه. |
| [end](./end/)() | الوصول إلى طريقة [end()](./end/) لمجموعة أساسية. يتم التجميع فقط إذا كان [SmartPtr_](./smartptr_/) نوعًا متخصصًا يحتوي على طريقة [end()](./end/). |
| [end](./end/)() const | الوصول إلى طريقة [end()](./end/) لمجموعة أساسية. يتم التجميع فقط إذا كان [SmartPtr_](./smartptr_/) نوعًا متخصصًا يحتوي على طريقة [end()](./end/). |
| [get](./get/)() const | يحصل على الكائن المشار إليه. |
| [get_Mode](./get_mode/)() const | يحصل على وضع المؤشر. |
| [get_shared](./get_shared/)() const | يحصل على الكائن المشار إليه، لكنه يؤكد أن المؤشر في وضع المشاركة. |
| [get_shared_count](./get_shared_count/)() const | يحصل على عدد المؤشرات المشتركة الموجودة للكيان المشار إليه، بما في ذلك الحالي. يؤكد أن المؤشر الحالي في وضع المشاركة. |
| [GetHashCode](./gethashcode/)() const | ينادي [GetHashCode()](./gethashcode/) على الكائن المشار إليه. |
| [GetObjectNotNull](./getobjectnotnull/)() const | يحصل على الكائن المشار إليه حاليًا (إن وجد) أو يرمي استثناء. |
| [GetObjectOrNull](./getobjectornull/)() const | يحصل على الكائن المشار إليه (إن وجد) أو nullptr. نفس [get()](./get/). |
| [GetObjectOwner](./getobjectowner/)() const | يحصل على الكائن المشار إليه. |
| [GetPointer](./getpointer/)() const | يحصل على الكائن المشار إليه (إن وجد) أو nullptr. نفس [get()](./get/). |
| [Is](./is/)(const System::TypeInfo\&) const | يتحقق مما إذا كان الكائن المشار إليه من نوع محدد أو من نوع فرعي له. يتبع دلالات 'is' في C#. |
| [IsAliasingPtr](./isaliasingptr/)() const | يتحقق مما إذا كان المؤشر يشير إلى كائن آخر غير المملوك (تم إنشاؤه بواسطة مُنشئ التسمية المستعارة). |
| [IsShared](./isshared/)() const | يتحقق مما إذا كان المؤشر في وضع المشاركة. |
| [IsWeak](./isweak/)() const | يتحقق مما إذا كان المؤشر في وضع الضعف. |
| explicit [operator bool](./operatorbool/)() const | يتحقق مما إذا كان المؤشر غير فارغ. |
| [operator!](./operator!/)() const | يتحقق مما إذا كان المؤشر فارغًا. |
| [operator*](./operator_/)() const | يحصل على مرجع للكائن المشار إليه. يؤكد أن المؤشر غير فارغ. |
| [operator->](./operator-_/)() const | يسمح بالوصول إلى أعضاء الكائن المشار إليه. |
| [operator<](./operator_/)(Y *) const | يوفر دلالات مقارنة أقل لفئة [SmartPtr](./). |
| [operator<](./operator_/)(SmartPtr\<Y\> const\&) const | يوفر دلالات مقارنة أقل لفئة [SmartPtr](./). |
| [operator=](./operator=/)(SmartPtr_\&&) | ينقل تعيين كائن [SmartPtr](./). يصبح x غير قابل للاستخدام. |
| [operator=](./operator=/)(const SmartPtr_\&) | ينسخ تعيين كائن [SmartPtr](./). |
| [operator=](./operator=/)(const SmartPtr\<Q\>\&) | ينسخ تعيين كائن [SmartPtr](./). يقوم بالتحويلات النوعية المطلوبة. |
| [operator=](./operator=/)(Pointee_ *) | يعين المؤشر الخام إلى كائن [SmartPtr](./). |
| [operator=](./operator=/)(std::nullptr_t) | يضبط قيمة المؤشر إلى nullptr. |
| [operator==](./operator==/)(std::nullptr_t) const | يتحقق مما إذا كان المؤشر يشير إلى nullptr. |
| [operator[]](./operator[]/)(IdxType) const | مُدخل للوصول إلى عناصر المصفوفة. يُترجم فقط إذا كان [SmartPtr_](./smartptr_/) تخصصًا لـ [System::Array](../array/). |
| [RemoveAliasing](./removealiasing/)() const | يزيل التسمية المستعارة (التي تم إنشاؤها بواسطة مُنشئ التسمية المستعارة) من المؤشر، ويتأكد من أنه يدير (إذا كان مشاركة) أو يتتبع (إذا كان ضعيف) نفس الكائن الذي يشير إليه. |
| [reset](./reset/)(Pointee_ *) | يضبط الكائن المشار إليه. |
| [reset](./reset/)() | يجعل المؤشر يشير إلى nullptr. |
| [set_Mode](./set_mode/)(SmartPtrMode) | يضبط وضع المؤشر. قد يغيّر عدّات المراجع للكائن المشار إليه. |
| [SetContainedTemplateWeakPtr](./setcontainedtemplateweakptr/)(uint32_t) const | ينادي طريقة SetTemplateWeakPtr() على الكائن المشار إليه (إن وجد). |
| [SmartPtr](./smartptr/)(SmartPtrMode) | ينشئ كائن [SmartPtr](./) بالوضع المطلوب. |
| [SmartPtr](./smartptr/)(std::nullptr_t, SmartPtrMode) | ينشئ كائن [SmartPtr](./) فارغ (null-pointer) بالوضع المطلوب. |
| [SmartPtr](./smartptr/)(Pointee_ *, SmartPtrMode) | ينشئ [SmartPtr](./) يشير إلى الكائن المحدد، أو يحوّل المؤشر الخام إلى [SmartPtr](./). |
| [SmartPtr](./smartptr/)(const SmartPtr_\&, SmartPtrMode) | ينشئ نسخة من كائن [SmartPtr](./). كلا المؤشرين يشيران إلى نفس الكائن بعد ذلك. |
| [SmartPtr](./smartptr/)(const SmartPtr\<Q\>\&, SmartPtrMode) | ينشئ نسخة من كائن [SmartPtr](./). كلا المؤشرين يشيران إلى نفس الكائن بعد ذلك. يُجري تحويل النوع إذا كان مسموحًا. |
| [SmartPtr](./smartptr/)(SmartPtr_\&&, SmartPtrMode) | ينشئ كائن [SmartPtr](./) بنقل. عمليًا، يبدّل المؤشرين إذا كانا في نفس الوضع. قد يصبح x غير قابل للاستخدام بعد الاستدعاء. |
| explicit [SmartPtr](./smartptr/)(const SmartPtr\<Array\<Y\>\>\&, SmartPtrMode) | يحوّل نوع المصفوفة المشار إليها بإنشاء مصفوفة جديدة من نوع مختلف. مفيد إذا كان هناك تحويل نوع مصفوفة في C# غير مدعوم في C++. |
| explicit [SmartPtr](./smartptr/)(const Y\&) | يُهيئ مصفوفة فارغة. يُستخدم لترجمة بعض تراكيب كود C#. |
| [SmartPtr](./smartptr/)(const SmartPtr\<P\>\&, Pointee_ *, SmartPtrMode) | ينشئ [SmartPtr](./) يشارك معلومات الملكية مع القيمة الأولية للمتغيّر ptr، لكنه يحمل مؤشرًا غير مرتبط وغير مُدار p. |
| [static_pointer_cast](./static_pointer_cast/)() const | يحوّل المؤشر إلى نوع مختلف باستخدام static_cast على الكائن المشار إليه. |
| [ToObjectPtr](./toobjectptr/)() const | يحوّل أي نوع مؤشر إلى مؤشر إلى [Object](../object/). لا يتطلب أن يكون نوع [Pointee_](./pointee_/) مكتملًا. |
| static [Type](./type/)() | اختصار للحصول على كائن [System::TypeInfo](../typeinfo/) لنوع [Pointee_](./pointee_/) . |
| [~SmartPtr](./~smartptr/)() | يدمر كائن [SmartPtr](./). إذا لزم الأمر، يقلل عدّاد المراجع للكائن المشار إليه ويحذف الكائن. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [ArrayType](./arraytype/) | نفس ما هو [Pointee_](./pointee_/)، إذا كان تخصيصًا لـ [System::Array](../array/)، وإلا فهو void. |
| [Pointee_](./pointee_/) | نوع المؤشر إليه. |
| [SmartPtr_](./smartptr_/) | نوع مؤشر ذكي متخصص. |
| [ValueType](./valuetype/) | نوع التخزين للمصفوفة المشار إليها. ذو معنى فقط إذا كان T تخصيصًا لـ [System::Array](../array/). |

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
