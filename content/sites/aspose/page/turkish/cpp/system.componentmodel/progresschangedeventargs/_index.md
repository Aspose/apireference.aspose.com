---
title: "System::ComponentModel::ProgressChangedEventArgs sınıf"
linktitle: "ProgressChangedEventArgs"
second_title: "Aspose.Page için C++"
description: "System::ComponentModel::ProgressChangedEventArgs sınıf. Bu sınıfın bir örneği ProgressChangedEventHandler temsilcisine argüman olarak geçirilir. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığıt üzerinde veya new operatörüyle asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar."
type: docs
weight: 1100
url: /tr/cpp/system.componentmodel/progresschangedeventargs/
---
## ProgressChangedEventArgs class


Bu sınıfın bir örneği ProgressChangedEventHandler temsilcisine argüman olarak geçirilir. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığıt üzerinde veya new operatörüyle asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class ProgressChangedEventArgs : public System::EventArgs
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_ProgressPercentage](./get_progresspercentage/)() const | Asenkron görev ilerleme yüzdesini alır. |
| [get_UserState](./get_userstate/)() const | Benzersiz bir kullanıcı durumu alır. |
| [ProgressChangedEventArgs](./progresschangedeventargs/)(int, System::SharedPtr\<System::Object\>) | Yapıcı. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Boş bir [EventArgs](../../system/eventargs/) paylaşımlı işaretçiyi (null işaretçi) temsil eden statik üye. |
## Ayrıca Bakınız

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
