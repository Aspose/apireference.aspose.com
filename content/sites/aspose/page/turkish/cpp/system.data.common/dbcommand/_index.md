---
title: "System::Data::Common::DbCommand sınıfı"
linktitle: "DbCommand"
second_title: "Aspose.Page için C++"
description: "System::Data::Common::DbCommand sınıfı. Veritabanı komutu. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak tahsis edilmelidir. Bu tipin örneğini yığına (stack) ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 100
url: /tr/cpp/system.data.common/dbcommand/
---
## DbCommand class


Veritabanı komutu. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak tahsis edilmelidir. Bu tipin örneğini yığına (stack) ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class DbCommand : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [ExecuteNonQuery](./executenonquery/)() | Sorgu olmayan komutu yürütür. |
| virtual [ExecuteReader](./executereader/)() | Sorgu komutunu yürütür. |
| virtual [get_CommandText](./get_commandtext/)() const | RTTI bilgisi. |
| virtual [get_Connection](./get_connection/)() const | Komutla ilişkili veritabanı bağlantısını alır. |
| virtual [set_CommandText](./set_commandtext/)(String) const | Veritabanı komut metnini ayarlar. |
| virtual [set_Connection](./set_connection/)(SharedPtr\<System::Data::Common::DbConnection\>) | Komutla ilişkili veritabanı bağlantısını alır. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Data::Common](../)
* Library [Aspose.Page for C++](../../)
