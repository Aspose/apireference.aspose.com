---
title: "System::Reflection::MethodBase sınıfı"
linktitle: "MethodBase"
second_title: "Aspose.Page için C++"
description: "System::Reflection::MethodBase sınıfı. Yöntem hakkında temel bilgi. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek hiçbir zaman yığıt (stack) üzerinde veya new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 800
url: /tr/cpp/system.reflection/methodbase/
---
## MethodBase class


Yöntem hakkında temel bilgi. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek hiçbir zaman yığıt üzerinde veya new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class MethodBase : public System::Reflection::MemberInfo
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_MemberType](./get_membertype/)() const override | Üyenin türünü belirtme - yöntem, yapıcı, olay vb. |
| static [GetCurrentMethod](./getcurrentmethod/)(const String\&) | Bu yöntem, geçerli yöntem adını almayı sağlar. Çevirmen, ASPOSE_CURRENT_FUNCTION parametresini otomatik olarak yerleştirir. |
| [MEMBER_FUNCTION_MAKE_OBJECT](./member_function_make_object/)(MethodBase, CODEPORTING_ARGS(const String\&full_name), CODEPORTING_ARGS(full_name)) |  |
| [MethodBase](./methodbase/)() | [MethodBase](./) sınıfının yeni bir örneğini başlatır. |
## Ayrıca Bakınız

* Class [MemberInfo](../memberinfo/)
* Namespace [System::Reflection](../)
* Library [Aspose.Page for C++](../../)
