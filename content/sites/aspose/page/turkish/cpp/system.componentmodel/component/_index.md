---
title: "System::ComponentModel::Component sınıf"
linktitle: "Component"
second_title: "Aspose.Page için C++"
description: "System::ComponentModel::Component sınıf. Çevrilen kodun Component sınıfını kullanarak derlenebilir olması için sahte sınıf. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığıt üzerinde veya new operatörüyle asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirin."
type: docs
weight: 400
url: /tr/cpp/system.componentmodel/component/
---
## Component class


Çevrilen kodun [Component](./) sınıfını kullanarak derlenebilir olması için sahte sınıf. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığıt üzerinde veya new operatörüyle asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

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
* Library [Aspose.Page for C++](../../)
