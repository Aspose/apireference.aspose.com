---
title: "System::Data::Common::DbConnection sınıfı"
linktitle: "DbConnection"
second_title: "Aspose.Page için C++"
description: "System::Data::Common::DbConnection sınıfı. Veritabanı bağlantısı. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak tahsis edilmelidir. Bu tipin örneğini yığına (stack) ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 200
url: /tr/cpp/system.data.common/dbconnection/
---
## DbConnection class


Veritabanı bağlantısı. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak tahsis edilmelidir. Bu tipin örneğini yığına (stack) ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class DbConnection : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [get_ConnectionString](./get_connectionstring/)() const | RTTI bilgisi. |
| virtual [Open](./open/)() | Veritabanına bağlantı açar. |
| virtual [set_ConnectionString](./set_connectionstring/)(String) const | Bağlantı bilgilerini ayarlar (örn. sunucu ve port). |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Data::Common](../)
* Library [Aspose.Page for C++](../../)
