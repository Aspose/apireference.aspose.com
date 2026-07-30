---
title: "System::ComponentModel::Component class"
linktitle: "Component"
second_title: "Aspose.Font için C++"
description: "System::ComponentModel::Component sınıfı. Component sınıfını kullanan çevrilmiş kodun derlenebilir olması için sahte sınıf. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak allocate edilmelidir. Bu tipin örneğini yığına (stack) ya da operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'da fonksiyonlara argüman olarak geçirin."
type: docs
weight: 400
url: /tr/cpp/system.componentmodel/component/
---
## Component class


Çevrilen kodun [Component](./) sınıfı kullanılarak derlenebilir olmasını sağlamak için sahte sınıf. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi işlevlere argüman olarak geçirin.

```cpp
class Component : public System::MarshalByRefObject,
                  public System::ComponentModel::IComponent
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Component](./component/)() | RTTI bilgisi. |
| [Dispose](./dispose/)(bool) | Disposable desen desteği; hiçbir şey yapmaz. |
| [get_DesignMode](./get_designmode/)() | Bileşenin tasarım modunda olup olmadığını kontrol eder. |
## Ayrıca Bakınız

* Class [MarshalByRefObject](../../system/marshalbyrefobject/)
* Class [IComponent](../icomponent/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Font for C++](../../)
