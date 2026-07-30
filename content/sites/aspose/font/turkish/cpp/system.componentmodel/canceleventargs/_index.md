---
title: "System::ComponentModel::CancelEventArgs sınıfı"
linktitle: "CancelEventArgs"
second_title: "Aspose.Font için C++"
description: "System::ComponentModel::CancelEventArgs sınıfı. İptal edilebilir olayın argümanları. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirin."
type: docs
weight: 300
url: /tr/cpp/system.componentmodel/canceleventargs/
---
## CancelEventArgs class


İptal edilebilir olayın argümanları. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class CancelEventArgs : public System::EventArgs
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [CancelEventArgs](./canceleventargs/)(bool) | RTTI bilgisi. |
| [CancelEventArgs](./canceleventargs/)() | Yapıcı; Cancel özelliğini false olarak ayarlar. |
| [get_Cancel](./get_cancel/)() | Etkinliğin iptal edilip edilmeyeceğini belirten değeri alır. |
| [set_Cancel](./set_cancel/)(bool) | Etkinliğin iptal edilip edilmeyeceğini belirten değeri ayarlar. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Boş bir [EventArgs](../../system/eventargs/) paylaşımlı işaretçiyi (null-pointer) temsil eden statik bir üye. |
## Ayrıca Bakınız

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Font for C++](../../)
