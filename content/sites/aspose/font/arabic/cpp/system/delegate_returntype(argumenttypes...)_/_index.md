---
title: "فئة System::Delegate< ReturnType(ArgumentTypes...)>"
linktitle: "Delegate< ReturnType(ArgumentTypes...)>"
second_title: "Aspose.Font لـ C++"
description: "System::Delegate< ReturnType(ArgumentTypes...)> class. يمثل مؤشرًا إلى دالة أو طريقة أو كائن دالة. يجب تخصيص هذا النوع على المكدس وتمريره إلى الدوال بالقيمة أو بالمرجع. لا تستخدم أبدًا فئة System::SmartPtr لإدارة كائنات هذا النوع في C++."
type: docs
weight: 2100
url: /ar/cpp/system/delegate_returntype(argumenttypes...)_/
---
## Delegate< ReturnType(ArgumentTypes...)> class


يمثل مؤشرًا إلى دالة أو طريقة أو كائن دالة. يجب تخصيص هذا النوع على المكدس وتمريره إلى الدوال بالقيمة أو بالمرجع. لا تستخدم أبدًا فئة [System::SmartPtr](../smartptr/) لإدارة كائنات هذا النوع.

```cpp
template<class ReturnType,class...>class Delegate< ReturnType(ArgumentTypes...)> : public System::Details::DelegateHoldingVariables
```


| معامل | الوصف |
| --- | --- |
| ReturnType | نوع الإرجاع لدالة أو طريقة أو كائن دالة يشير إليه والذي تم تمثيله بواسطة الفئة |
| ArgumentTypes | قائمة الوسائط لدالة أو طريقة أو كائن دالة يشير إليها والتي تم تمثيلها بواسطة الفئة |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [Delegate](./delegate/)() | المنشئ الافتراضي. يُنشئ كائن التفويض الذي لا يشير إلى أي شيء. |
| [Delegate](./delegate/)(const Delegate\&) |  |
| [Delegate](./delegate/)(Delegate\&&) | منشئ النسخ المتنقل. يأخذ ملكية الكيان الذي يشير إليه التفويض المحدد. |
| [Delegate](./delegate/)(T, typename std::enable_if<!std::is_bind_expression\<T\>::value\&&std::is_pointer\<T\>::value\&&std::is_function\<typename std::remove_pointer\<T\>::type\>::value\>::type *) | منشئ. يُنشئ كائن تفويض من المؤشر المحدد إلى دالة حرة أو طريقة ثابتة. |
| [Delegate](./delegate/)(T, typename std::enable_if\<std::is_bind_expression\<T\>::value\>::type *) | منشئ. يُنشئ تفويضًا من المؤشر المحدد إلى كائن الدالة الذي تم إنشاؤه بواسطة std::bind(). |
| [Delegate](./delegate/)(int, T\&) | منشئ. يُنشئ تفويضًا من كائن الدالة المحدد. |
| [Delegate](./delegate/)(long, T\&&) | منشئ متحرك. يُنشئ تفويضًا من كائن الدالة المحدد. |
| [Delegate](./delegate/)(MemberType ClassType::*, ClassType *) | منشئ. يُنشئ تفويضًا يشير إلى الطريقة غير الثابتة المحددة للكائن المحدد. |
| [Delegate](./delegate/)(MemberType MemberClass::*, const SharedPtr\<ClassType\>\&) | منشئ. يُنشئ تفويضًا يشير إلى الطريقة غير الثابتة المحددة للكائن المحدد. |
| [Delegate](./delegate/)(std::function\<R(Args...)>) | يُنشئ كائن تفويض يشير إلى كائن دالة std::function. |
| [Empty](./empty/)() const | يحدد ما إذا كان كائن التفويض الحالي فارغًا، أي لا يشير إلى أي كيان. |
| [operator()](./operator()/)(ArgumentTypes...) const | ينفّذ دالة أو طريقة أو كائن دالة يشير إليه كائن التفويض الحالي. |
| [operator=](./operator=/)(const Delegate\&) |  |
| [operator=](./operator=/)(Delegate\&&) | عامل الإسناد المتنقل. يأخذ ملكية الكيان الذي يشير إليه التفويض المحدد. |
| [operator==](./operator==/)(const Delegate\&) const | يقارن كائنين تفويض للتحقق مما إذا كانا يشيران إلى نفس الكيان. |
## ملاحظات



```cpp
#include "system/delegate.h"
#include <iostream>

// أعلن عن التفويض.
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
* Library [Aspose.Font for C++](../../)
