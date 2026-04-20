---
title: "System::Func class"
linktitle: "Func"
second_title: "Aspose.Font لـ C++"
description: "System::Func class. تفويض دالة. يجب تخصيص هذا النوع على المكدس وتمريره إلى الدوال بالقيمة أو بالمرجع. لا تستخدم فئة System::SmartPtr لإدارة كائنات هذا النوع في C++."
type: docs
weight: 2800
url: /ar/cpp/system/func/
---
## Func class


تفويض دالة. يجب تخصيص هذا النوع على المكدس وتمريره إلى الدوال بالقيمة أو بالمرجع. لا تستخدم فئة [System::SmartPtr](../smartptr/) لإدارة كائنات هذا النوع.

```cpp
template<typename...>class Func : public System::MulticastDelegate<::System::Detail::FuncArgsReorderer<void(), Args...>::type>
```


| معامل | الوصف |
| --- | --- |
| المعاملات | معاملات الاستدعاء، ثم نوع الإرجاع الإلزامي. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [Func](./func/)() | منشئ افتراضي ينشئ null-Func. |
| [Func](./func/)(T\&&) | منشئ يقوم بإنشاء كائن [Func](./) ويعيّن له قيمة (إما استدعاء فعلي أو nullptr). |
| [Func](./func/)(const Func\&) | منشئ النسخ. |
| [Func](./func/)(Func\&&) | منشئ نقل. |
| [operator=](./operator=/)(const Func\&) | إسناد نسخة. |
| [operator=](./operator=/)(Func\&&) | إسناد نقل. |
| [~Func](./~func/)() | المدمر. |
## ملاحظات



```cpp
#include "system/func.h"
#include <iostream>

// تقبل هذه الدالة نسخة من المفوض System::Func كمعامل.
void Print(int x, const System::Func<int, int> &func)
{
  std::cout << func(x) << std::endl;
}

int main()
{
  // أنشئ نسخة من المفوض System::Func.
  auto func = static_cast<System::Func<int, int>>([](int x) -> int
  {
    return x * x;
  });

  // مرّر النسخة التي تم إنشاؤها كمعامل للدالة.
  Print(1, func);
  Print(2, func);
  Print(3, func);

  return 0;
}
/*
This code example produces the following output:
1
4
9
*/
```

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
