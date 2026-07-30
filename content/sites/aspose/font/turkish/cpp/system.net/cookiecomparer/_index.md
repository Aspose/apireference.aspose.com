---
title: "System::Net::CookieComparer sınıfı"
linktitle: "CookieComparer"
second_title: "Aspose.Font için C++"
description: "System::Net::CookieComparer sınıfı. Cookie sınıfı örneklerini karşılaştırmak için kullanılır. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 300
url: /tr/cpp/system.net/cookiecomparer/
---
## CookieComparer class


Bu sınıf, [Cookie](../cookie/) sınıfı örneklerini karşılaştırmak için kullanılır. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class CookieComparer : public System::Collections::Generic::IComparer<System::SharedPtr<System::Net::Cookie>>
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Compare](./compare/)(args_type, args_type) const override | Belirtilen nesneleri karşılaştırır. |
| static [get_Instance](./get_instance/)() | RTTI bilgisi. |
## Ayrıca Bakınız

* Class [IComparer](../../system.collections.generic/icomparer/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
