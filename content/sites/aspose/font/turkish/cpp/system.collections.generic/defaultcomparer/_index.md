---
title: "System::Collections::Generic::DefaultComparer sınıfı"
linktitle: "DefaultComparer"
second_title: "Aspose.Font için C++"
description: "System::Collections::Generic::DefaultComparer sınıfı. Varsayılan karşılaştırıcı sınıfı. Değerleri karşılaştırmak için < operatörünü ve == operatörünü kullanır. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına ya da operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirin."
type: docs
weight: 1000
url: /tr/cpp/system.collections.generic/defaultcomparer/
---
## DefaultComparer class


Varsayılan karşılaştırıcı sınıfı. Değerleri karşılaştırmak için < operatörünü ve == operatörünü kullanır. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına ya da operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
template<class T>class DefaultComparer : public System::Collections::Generic::IComparer<T>
```


| Parametre | Açıklama |
| --- | --- |
| T | Karşılaştırılan tür. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Compare](./compare/)(typename ThisType::args_type, typename ThisType::args_type) const override | RTTI bilgisi. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [BaseType](./basetype/) | Uygulanan arayüz. |
| [ThisType](./thistype/) | Geçerli tür. |

## Ayrıca Bakınız

* Class [IComparer](../icomparer/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
