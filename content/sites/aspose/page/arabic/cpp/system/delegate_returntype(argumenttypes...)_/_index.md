---
title: "System::Delegate< ReturnType(ArgumentTypes...)> فئة"
linktitle: "Delegate< ReturnType(ArgumentTypes...)>"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Delegate< ReturnType(ArgumentTypes...)>. تمثل مؤشرًا إلى دالة أو طريقة أو كائن دالة. يجب تخصيص هذا النوع على المكدس وتمريره إلى الدوال بالقيمة أو بالمرجع. لا تستخدم أبداً فئة System::SmartPtr لإدارة كائنات هذا النوع في C++."
type: docs
weight: 2100
url: /ar/cpp/system/delegate_returntype(argumenttypes...)_/
---
## Delegate< ReturnType(ArgumentTypes...)> class


تمثل مؤشرًا إلى دالة أو طريقة أو كائن دالة. يجب تخصيص هذا النوع على المكدس وتمريره إلى الدوال بالقيمة أو بالمرجع. لا تستخدم أبداً فئة [System::SmartPtr](../smartptr/) لإدارة كائنات هذا النوع.

```cpp
template<class ReturnType,class...>class Delegate< ReturnType(ArgumentTypes...)> : public System::Details::DelegateHoldingVariables
```


| Parameter | الوصف |
| --- | --- |
| ReturnType | نوع الإرجاع للدالة أو الطريقة أو كائن الدالة الذي يُمثَّل بواسطة الفئة |
| ArgumentTypes | قائمة المعاملات للدالة أو الطريقة أو كائن الدالة الذي يُمثَّل بواسطة الفئة |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [Delegate](./delegate/)() | المنشئ الافتراضي. يُنشئ كائن الـ delegate الذي لا يشير إلى أي شيء. |
| [Delegate](./delegate/)(const Delegate\&) |  |
| [Delegate](./delegate/)(Delegate\&&) | منشئ النسخ المتنقل. يأخذ ملكية الكيان الذي يشيره الـ delegate المحدد. |
| [Delegate](./delegate/)(T, typename std::enable_if<!std::is_bind_expression\<T\>::value\&&std::is_pointer\<T\>::value\&&std::is_function\<typename std::remove_pointer\<T\>::type\>::value\>::type *) | المنشئ. يُنشئ كائن delegate من المؤشر المحدد إلى دالة حرة أو طريقة ثابتة. |
| [Delegate](./delegate/)(T, typename std::enable_if\<std::is_bind_expression\<T\>::value\>::type *) | المنشئ. يُنشئ delegate من المؤشر المحدد إلى كائن الدالة الذي تم إنشاؤه بواسطة std::bind(). |
| [Delegate](./delegate/)(int, T\&) | المنشئ. يُنشئ delegate من كائن الدالة المحدد. |
| [Delegate](./delegate/)(long, T\&&) | منشئ النقل. يُنشئ delegate من كائن الدالة المحدد. |
| [Delegate](./delegate/)(MemberType ClassType::*, ClassType *) | المنشئ. يُنشئ delegate يشير إلى الطريقة غير الثابتة المحددة للكائن المحدد. |
| [Delegate](./delegate/)(MemberType MemberClass::*, const SharedPtr\<ClassType\>\&) | المنشئ. يُنشئ delegate يشير إلى الطريقة غير الثابتة المحددة للكائن المحدد. |
| [Delegate](./delegate/)(std::function\<R(Args...)>) | يُنشئ كائن delegate يشير إلى كائن دالة std::function. |
| [Empty](./empty/)() const | يحدد ما إذا كان كائن الـ delegate الحالي فارغًا، أي لا يشير إلى أي كيان. |
| [operator()](./operator()/)(ArgumentTypes...) const | ينفّذ دالة أو طريقة أو كائن دالة يشير إليه كائن الـ delegate الحالي. |
| [operator=](./operator=/)(const Delegate\&) |  |
| [operator=](./operator=/)(Delegate\&&) | عامل الإسناد المتنقل. يأخذ ملكية الكيان الذي يشيره الـ delegate المحدد. |
| [operator==](./operator==/)(const Delegate\&) const | يقارن كائنين من الـ delegate للتحقق مما إذا كانا يشيران إلى نفس الكيان. |
## ملاحظات



```cpp
#include "system/delegate.h"
#include <iostream>

// أعلن الـ delegate.
using Message = System::Delegate<void()>;

void PrintMessage()
{
  std::cout << "Hello, world!" << std::endl;
}

int main()
{
  // عيّن للمتغيّر عنوان الدالة PrintMessage.
  Message mes = Message(&PrintMessage);

  // استدعِ الدالة.
  mes();

  return 0;
}
/*
This code example produces the following output:
Hello, world!
*/
```

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
