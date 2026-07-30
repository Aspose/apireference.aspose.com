---
title: "System::Data::Common::DbConnection class"
linktitle: "DbConnection"
second_title: "Aspose.Font için C++"
description: "System::Data::Common::DbConnection sınıfı. Veritabanı bağlantısı. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek asla yığıt üzerinde veya new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 200
url: /tr/cpp/system.data.common/dbconnection/
---
## DbConnection class


Veritabanı bağlantısı. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek asla yığıt üzerinde veya new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class DbConnection : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [get_ConnectionString](./get_connectionstring/)() const | RTTI bilgisi. |
| virtual [Open](./open/)() | Veritabanına bağlantıyı açar. |
| virtual [set_ConnectionString](./set_connectionstring/)(String) const | Bağlantı bilgilerini ayarlar (örn. sunucu ve port). |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Data::Common](../)
* Library [Aspose.Font for C++](../../)
