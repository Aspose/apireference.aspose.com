---
title: "System::ComponentModel::ProgressChangedEventArgs sınıfı"
linktitle: "ProgressChangedEventArgs"
second_title: "Aspose.Font için C++"
description: "System::ComponentModel::ProgressChangedEventArgs sınıfı. Bu sınıfın bir örneği ProgressChangedEventHandler temsilcisine argüman olarak geçirilir. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi işlevlere argüman olarak C++'da geçirin."
type: docs
weight: 1100
url: /tr/cpp/system.componentmodel/progresschangedeventargs/
---
## ProgressChangedEventArgs class


Bu sınıfın bir örneği ProgressChangedEventHandler temsilcisine argüman olarak geçirilir. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi işlevlere argüman olarak geçirin.

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
| static [Empty](../../system/eventargs/empty/) | Boş bir [EventArgs](../../system/eventargs/) paylaşımlı işaretçiyi (null-pointer) temsil eden statik bir üye. |
## Ayrıca Bakınız

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Font for C++](../../)
