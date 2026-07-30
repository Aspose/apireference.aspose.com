---
title: "الفئة System::MulticastDelegate< ReturnType(ArgumentTypes...)>"
linktitle: "MulticastDelegate< ReturnType(ArgumentTypes...)>"
second_title: "Aspose.Font لـ C++"
description: "الفئة System::MulticastDelegate< ReturnType(ArgumentTypes...)>. تمثل مجموعة من المفوضين. يجب تخصيص هذا النوع على المكدس وتمريره إلى الدوال بالقيمة أو بالمرجع. لا تستخدم أبداً الفئة System::SmartPtr لإدارة كائنات هذا النوع في C++."
type: docs
weight: 4500
url: /ar/cpp/system/multicastdelegate_returntype(argumenttypes...)_/
---
## MulticastDelegate< ReturnType(ArgumentTypes...)> class


تمثل مجموعة من المفوضين. يجب تخصيص هذا النوع على المكدس وتمريره إلى الدوال بالقيمة أو بالمرجع. لا تستخدم أبداً الفئة [System::SmartPtr](../smartptr/) لإدارة كائنات هذا النوع.

```cpp
template<class ReturnType,class...>class MulticastDelegate< ReturnType(ArgumentTypes...)> : public System::Details::DelegateHoldingVariables
```


| معامل | الوصف |
| --- | --- |
| ReturnType | نوع الإرجاع للكيانات القابلة للاستدعاء التي يشير إليها كل مفوض في المجموعة |
| ArgumentTypes | قائمة الوسائط للكيانات القابلة للاستدعاء التي يشير إليها كل مفوض في المجموعة |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [BeginInvoke](./begininvoke/)(ArgumentTypes..., const AsyncCallback\&, const CallbackArgumentType\&) | غير مُنفّذ. |
| [connect](./connect/)(Callback) | يضيف المفوض المحدد إلى المجموعة. |
| [connect](./connect/)(std::function\<R(Args...)>) | يضيف كائن الدالة المحدد إلى مجموعة المفوضين. يتم تحويل كائن الدالة إلى نوع المفوض [Callback](./callback/) قبل إضافته إلى المجموعة. |
| [connect](./connect/)(MulticastDelegate\&) | يضيف كائن MulticastDelegate المحدد إلى مجموعة المفوضين. |
| [connect](./connect/)(MemberType ClassType::*, ClassType *) | يضيف الطريقة غير الثابتة المحددة للكائن المحدد إلى مجموعة المفوضين. |
| [connect](./connect/)(MemberType ClassType::*, const SharedPtr\<ClassType\>\&) | يضيف الطريقة غير الثابتة المحددة للكائن المحدد إلى مجموعة المفوضين. |
| [disconnect](./disconnect/)(Callback) | يزيل المفوض المحدد من مجموعة المفوضين. |
| [disconnect](./disconnect/)(MemberType ClassType::*, ClassType *) | يزيل الطريقة غير الثابتة المحددة للكائن المحدد من مجموعة المفوضين. |
| [disconnect](./disconnect/)(MemberType ClassType::*, const SharedPtr\<ClassType\>\&) | يزيل الطريقة غير الثابتة المحددة للكائن المحدد من مجموعة المفوضين. |
| [disconnect](./disconnect/)(MulticastDelegate\&) | يزيل كائن MulticastDelegate المحدد من مجموعة المفوضين. |
| [disconnect_all_slots](./disconnect_all_slots/)() | يزيل جميع المفوضين من مجموعة المفوضين. |
| [empty](./empty/)() const | يحدد ما إذا كانت مجموعة المفوضين فارغة. |
| [EndInvoke](./endinvoke/)(const SharedPtr\<IAsyncResult\>\&) | غير مُنفّذ. |
| [Equals](./equals/)(const MulticastDelegate\&) |  |
| [GetHashCode](./gethashcode/)() const |  |
| [GetType](./gettype/)() const |  |
| [invoke](./invoke/)(ArgumentTypes...) const | ينفّذ جميع المفوضين الموجودين حالياً في مجموعة المفوضين. يتم تنفيذ المفوضين بنفس الترتيب الذي أضيفوا به إلى المجموعة. الطريقة تحجب التنفيذ أثناء تنفيذ المفوضين. |
| [IsNull](./isnull/)() const | يحدد ما إذا كانت مجموعة المفوضين فارغة. |
| [MulticastDelegate](./multicastdelegate/)() | ينشئ مجموعة فارغة. |
| [MulticastDelegate](./multicastdelegate/)(std::nullptr_t) | ما يعادل المُنشئ الافتراضي. |
| [MulticastDelegate](./multicastdelegate/)(const MulticastDelegate\&) | ينفّذ نسخة سطحية من مجموعة المفوضين. |
| [MulticastDelegate](./multicastdelegate/)(MulticastDelegate\&&) | منشئ النقل. |
| [MulticastDelegate](./multicastdelegate/)(Callback\&&) | ينشئ كائنًا ويضع المفوض المحدد في مجموعة المفوضين. |
| [MulticastDelegate](./multicastdelegate/)(T) | ينشئ كائنًا ويضع القيمة المحددة في مجموعة المفوضين. |
| [MulticastDelegate](./multicastdelegate/)(std::function\<ReturnType(ArgumentTypes...)>) | ينشئ كائنًا ويضع القيمة المحددة في مجموعة المفوضين. |
| [operator!=](./operator!=/)(const std::nullptr_t\&) const | يحدد ما إذا كانت مجموعة المفوضين غير فارغة. |
| [operator!=](./operator!=/)(const MulticastDelegate\&) const | يحدد ما إذا كان مثالي MulticastDelegate - الكائن الحالي والكائن المحدد - غير متساويين. |
| [operator()](./operator()/)(ArgumentTypes...) const | ينفذ جميع المفوضين الموجودين حاليًا في مجموعة المفوضين. يتم تنفيذ المفوضين بنفس الترتيب الذي أضيفوا به إلى المجموعة. يمنع المشغل التنفيذ أثناء تنفيذ المفوضين. |
| [operator+=](./operator+=/)(Callback) | يضيف المفوض المحدد إلى المجموعة. |
| [operator-=](./operator-=/)(Callback) | يزيل المفوض المحدد من مجموعة المفوضين. |
| [operator=](./operator=/)(const MulticastDelegate\&) | يعين مجموعة المفوضين التي يمثلها الكائن المحدد إلى الكائن الحالي. نتيجةً لذلك، يشير كلا الكائنين إلى نفس مجموعة المفوضين. |
| [operator=](./operator=/)(MulticastDelegate\&&) | عامل الإسناد بالنقل. |
| [operator==](./operator==/)(const std::nullptr_t\&) const | يحدد ما إذا كانت مجموعة المفوضين فارغة. |
| [operator==](./operator==/)(const MulticastDelegate\&) const | يحدد ما إذا كان مثالي MulticastDelegate - الكائن الحالي والكائن المحدد - متساويين. |
| [remove_empty_callbacks](./remove_empty_callbacks/)() const | يمسح الاستدعاءات المرتجعة المحتواة التي تكون فارغة (لا تستدعي أي شيء فعليًا). |
| [ToString](./tostring/)() const |  |
| static [Type](./type/)() | يعيد مرجعًا إلى كائن [TypeInfo](../typeinfo/) الذي يمثل معلومات نوع فئة MulticastDelegate. |
| [~MulticastDelegate](./~multicastdelegate/)() | المدمر. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Callback](./callback/) | نوع المفوضين الذي تمثله فئة MulticastDelegate. |

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
