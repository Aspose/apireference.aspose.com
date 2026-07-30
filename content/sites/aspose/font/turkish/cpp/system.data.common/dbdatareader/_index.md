---
title: "System::Data::Common::DbDataReader sınıfı"
linktitle: "DbDataReader"
second_title: "Aspose.Font için C++"
description: "System::Data::Common::DbDataReader sınıfı. Veritabanından veri almak için API. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığında veya operator new kullanarak oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirin."
type: docs
weight: 400
url: /tr/cpp/system.data.common/dbdatareader/
---
## DbDataReader class


Veritabanından veri almak için API. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığında veya operator new kullanarak oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class DbDataReader : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [Close](./close/)() | Veri alma kanalını kapatır. |
| virtual [idx_get](./idx_get/)(String) | Adlandırılmış öğeyi alır. |
| virtual [idx_get](./idx_get/)(int) | Öğeyi indeksle alır. |
| virtual [Read](./read/)() | Veritabanından bir sonraki kaydı okur. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | RTTI bilgisi. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Data::Common](../)
* Library [Aspose.Font for C++](../../)
