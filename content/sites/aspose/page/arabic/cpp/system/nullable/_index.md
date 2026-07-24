---
title: "فئة System::Nullable"
linktitle: "Nullable"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Nullable. إعلان مسبق في C++."
type: docs
weight: 4600
url: /ar/cpp/system/nullable/
---
## Nullable class


إعلان مسبق.

```cpp
template<typename T>class Nullable
```


| Parameter | الوصف |
| --- | --- |
| T | نوع القيمة الأساسي الذي يتم توسيعه بواسطة فئة [Nullable](./) |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [Equals](./equals/)(const T1\&) const | يحدد ما إذا كانت القيمة التي يمثلها الكائن الحالي مساوية للقيمة التي يمثلها الكائن [Nullable](./) المحدد. |
| [get_HasValue](./get_hasvalue/)() const | يحدد ما إذا كان الكائن الحالي يمثل أي قيمة. |
| [get_Value](./get_value/)() const | يعيد نسخة من القيمة التي يمثلها الكائن الحالي. |
| [GetHashCode](./gethashcode/)() const | يعيد رمز تجزئة للكائن الحالي. |
| [GetValueOrDefault](./getvalueordefault/)(T) | يعيد القيمة التي يمثلها الكائن الحالي أو القيمة المحددة إذا كانت القيمة التي يمثلها الكائن الحالي فارغة. |
| [GetValueOrDefault](./getvalueordefault/)() |  |
| [IsNull](./isnull/)() const | يحدد ما إذا كان الكائن الحالي يمثل قيمة فارغة. |
| [Nullable](./nullable/)() | ينشئ مثيلاً يمثل قيمة فارغة. |
| [Nullable](./nullable/)(std::nullptr_t) | ينشئ مثيلاً يمثل null. |
| [Nullable](./nullable/)(const T1\&) | ينشئ مثيلاً من فئة [Nullable](./) يمثل القيمة المحددة محوّلة (إذا لزم الأمر) إلى قيمة النوع الأساسي T. |
| [Nullable](./nullable/)(const Nullable\<T1\>\&) | ينشئ مثيلاً يمثل قيمة يتم تمثيلها بواسطة الكائن [Nullable](./) المحدد. قد يمثل الكائن المحدد قيمة من نوع مختلف عن النوع الأساسي للمثيل المُنشأ، وفي هذه الحالة تُحوَّل القيمة الممثلة إلى قيمة من النوع T. |
| [NullableBoolHelper](./nullableboolhelper/)(const T1\&, const std::function\<bool()>\&, bool) const | دالة مساعدة للتحقق مما إذا كان هذا و **other** كلاهما غير فارغين واستدعاء دالة لامبدا إذا كان الأمر كذلك. تُستخدم في implementation.s. |
| [operator const T &](./operatorconstt&/)() const | يرجع مرجعًا ثابتًا إلى القيمة الممثلة بواسطة الكائن الحالي. |
| [operator!=](./operator!=/)(std::nullptr_t) const | يحدد ما إذا كانت القيمة الممثلة بواسطة الكائن الحالي غير فارغة. |
| [operator!=](./operator!=/)(const T1\&) const | يحدد ما إذا كانت القيمة الممثلة بواسطة الكائن الحالي غير مساوية للقيمة المحددة. |
| [operator!=](./operator!=/)(const Nullable\<T1\>\&) const | يحدد ما إذا كانت القيمة الممثلة بواسطة الكائن الحالي غير مساوية للقيمة الممثلة بواسطة الكائن [Nullable](./) المحدد. |
| [operator&=](./operator&=/)(bool) | يطبق [operator&=()](./operator&=/) على القيمة الممثلة بواسطة الكائن الحالي باستخدام القيمة المحددة كمعامل على الجانب الأيمن. |
| [operator+](./operator+/)(std::nullptr_t) const | يرجع مثيلاً مُنشأً افتراضيًا لفئة Nullable<T>. |
| [operator+](./operator+/)(const T1\&) const | يجمع القيم القابلة للإنكار والقيم غير القابلة للإنكار. |
| [operator+](./operator+/)(const Nullable\<T1\>\&) const | يجمع القيم القابلة للإنكار. |
| [operator+=](./operator+=/)(std::nullptr_t) | يعيد ضبط الكائن الحالي بحيث يمثل قيمة فارغة. |
| [operator+=](./operator+=/)(const T1\&) | يطبق [operator+=()](./operator+=/) على القيمة الممثلة بواسطة الكائن الحالي باستخدام القيمة المحددة كمعامل على الجانب الأيمن. |
| [operator+=](./operator+=/)(const Nullable\<T1\>\&) | يطبق [operator+=()](./operator+=/) على القيمة الممثلة بواسطة الكائن الحالي باستخدام القيمة الممثلة بواسطة الكائن [Nullable](./) المحدد كمعامل على الجانب الأيمن. |
| [operator-](./operator-/)(T1) const | يطرح القيم القابلة للإنكار والقيم التي تشير إلى null. |
| [operator-](./operator-/)(const T1\&) const | يطرح القيم القابلة للإنكار والقيم غير القابلة للإنكار. |
| [operator-](./operator-/)(const Nullable\<T1\>\&) const | يطرح القيم القابلة للإنكار. |
| [operator-=](./operator-=/)(T1) | يرجع مثيلاً لفئة [Nullable](./) يمثل قيمة فارغة. |
| [operator-=](./operator-=/)(const T1\&) | يطبق [operator-=()](./operator-=/) على القيمة الممثلة بواسطة الكائن الحالي باستخدام القيمة المحددة كمعامل على الجانب الأيمن. |
| [operator-=](./operator-=/)(const Nullable\<T1\>\&) | يطبق [operator-=()](./operator-=/) على القيمة الممثلة بواسطة الكائن الحالي باستخدام القيمة الممثلة بواسطة الكائن [Nullable](./) المحدد كمعامل على الجانب الأيمن. |
| [operator<](./operator_/)(std::nullptr_t) const | دائمًا ما تُعيد false. |
| [operator<](./operator_/)(const T1\&) const | يحدد ما إذا كانت القيمة الممثلة بواسطة الكائن الحالي أصغر من القيمة المحددة عن طريق تطبيق [operator<()](./operator_/) على هاتين القيمتين. |
| [operator<](./operator_/)(const Nullable\<T1\>\&) const | يحدد ما إذا كانت القيمة الممثلة بواسطة الكائن الحالي أصغر من القيمة الممثلة بواسطة الكائن [Nullable](./) المحدد عن طريق تطبيق [operator<()](./operator_/) على هاتين القيمتين. |
| [operator<=](./operator_=/)(std::nullptr_t) const | دائمًا ما تُعيد false. |
| [operator<=](./operator_=/)(const T1\&) const | يحدد ما إذا كانت القيمة الممثلة بواسطة الكائن الحالي أصغر أو مساوية للقيمة المحددة عن طريق تطبيق [operator<=()](./operator_=/) على هاتين القيمتين. |
| [operator<=](./operator_=/)(const Nullable\<T1\>\&) const | يحدد ما إذا كانت القيمة الممثلة بواسطة الكائن الحالي أصغر أو مساوية للقيمة الممثلة بواسطة الكائن [Nullable](./) المحدد عن طريق تطبيق [operator<=()](./operator_=/) على هاتين القيمتين. |
| [operator=](./operator=/)(std::nullptr_t) | يعين قيمة null للكائن الحالي. |
| [operator=](./operator=/)(const T1\&) | يستبدل القيمة الممثلة حاليًا للكائن بالقيمة المحددة. |
| [operator=](./operator=/)(const Nullable\<T1\>\&) | يستبدل القيمة الممثلة حاليًا للكائن بالقيمة المحددة. |
| [operator==](./operator==/)(std::nullptr_t) const | يحدد ما إذا كانت القيمة التي يمثلها الكائن الحالي فارغة (null). |
| [operator==](./operator==/)(const T1\&) const | يحدد ما إذا كانت القيمة التي يمثلها الكائن الحالي مساوية للقيمة المحددة. |
| [operator==](./operator==/)(const Nullable\<T1\>\&) const | يحدد ما إذا كانت القيمة التي يمثلها الكائن الحالي مساوية للقيمة التي يمثلها الكائن [Nullable](./) المحدد. |
| [operator>](./operator_/)(std::nullptr_t) const | دائمًا ما تُعيد false. |
| [operator>](./operator_/)(const T1\&) const | يحدد ما إذا كانت القيمة التي يمثلها الكائن الحالي أكبر من القيمة المحددة بتطبيق [operator>()](./operator_/) على هاتين القيمتين. |
| [operator>](./operator_/)(const Nullable\<T1\>\&) const | يحدد ما إذا كانت القيمة التي يمثلها الكائن الحالي أكبر من القيمة التي يمثلها الكائن [Nullable](./) المحدد بتطبيق [operator>()](./operator_/) على هاتين القيمتين. |
| [operator>=](./operator_=/)(std::nullptr_t) const | دائمًا ما تُعيد false. |
| [operator>=](./operator_=/)(const T1\&) const | يحدد ما إذا كانت القيمة التي يمثلها الكائن الحالي أكبر أو مساوية للقيمة التي يمثلها الكائن المحدد بتطبيق [operator>=()](./operator_=/) على هاتين القيمتين. |
| [operator>=](./operator_=/)(const Nullable\<T1\>\&) const | يحدد ما إذا كانت القيمة التي يمثلها الكائن الحالي أكبر أو مساوية للقيمة التي يمثلها الكائن [Nullable](./) المحدد بتطبيق [operator>=()](./operator_=/) على هاتين القيمتين. |
| [operator | =](./operator_=/)(bool) | يطبق [operator | =()](./operator_=/) إلى القيمة التي يمثلها الكائن الحالي باستخدام القيمة المحددة كمعامل جانبي يميني. |
| [reset](./reset/)() | يضبط القيمة الممثلة حاليًا إلى null. |
| [ToString](./tostring/)() const | يحوّل القيمة التي يمثلها الكائن الحالي إلى سلسلة نصية. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [ValueType](./valuetype/) | اسم مستعار لنوع القيمة التي يمثلها هذا الصنف. |
## ملاحظات


يمثل قيمة من النوع المحدد يمكن تعيينها إلى null. يجب تخصيص هذا النوع على المكدس وتمريره إلى الدوال بالقيمة أو بالمرجع. لا تستخدم أبداً صنف [System::SmartPtr](../smartptr/) لإدارة كائنات هذا النوع.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
