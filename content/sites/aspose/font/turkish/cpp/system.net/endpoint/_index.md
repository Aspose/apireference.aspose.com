---
title: "System::Net::EndPoint sınıfı"
linktitle: "EndPoint"
second_title: "Aspose.Font için C++"
description: "System::Net::EndPoint sınıfı. Soyut sınıf bir ağ adresi içerir. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin bir örneğini yığına (stack) ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 900
url: /tr/cpp/system.net/endpoint/
---
## EndPoint class


Soyut sınıf bir ağ adresi içerir. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin bir örneğini yığına (stack) ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class EndPoint : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [Create](./create/)(System::SharedPtr\<SocketAddress\>) | Belirtilen soket adresini kullanarak [EndPoint](./) sınıfının yeni bir örneğini oluştur. |
| virtual [get_AddressFamily](./get_addressfamily/)() | RTTI bilgisi. |
| virtual [GetImpl](./getimpl/)() const | Uygulamaya bir işaretçi döndürür. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [ImplPtr](./implptr/) | Uygulamaya bir işaretçi. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
