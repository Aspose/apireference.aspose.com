---
title: "System::Data::IDataRecord sınıfı"
linktitle: "IDataRecord"
second_title: "Aspose.Font için C++"
description: "System::Data::IDataRecord sınıfı. Sütunları olan bir kayda yönelik arayüz. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Yığını (stack) üzerinde veya operator new kullanarak bu tipin örneğini oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirin."
type: docs
weight: 1300
url: /tr/cpp/system.data/idatarecord/
---
## IDataRecord class


Sütunlu kayıt arayüzü. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığıt (stack) üzerinde veya new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class IDataRecord : public virtual System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [get_FieldCount](./get_fieldcount/)() | RTTI bilgisi. |
| virtual [GetName](./getname/)(const int32_t) | Belirtilen konumdaki alanın adını alır. |
| virtual [idx_get](./idx_get/)(const int32_t) | Belirtilen dizindeki değeri alır. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Data](../)
* Library [Aspose.Font for C++](../../)
