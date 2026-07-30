---
title: "System::Data::Common::DbProviderFactory sınıfı"
linktitle: "DbProviderFactory"
second_title: "Aspose.Font için C++"
description: "System::Data::Common::DbProviderFactory sınıfı. Veritabanına erişim sağlayan sağlayıcı. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığında veya operator new kullanarak oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirin."
type: docs
weight: 600
url: /tr/cpp/system.data.common/dbproviderfactory/
---
## DbProviderFactory class


Veritabanına erişim sağlayan sağlayıcı. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığında veya operator new kullanarak oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class DbProviderFactory : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [CreateCommand](./createcommand/)() | RTTI bilgisi. |
| virtual [CreateConnection](./createconnection/)() | Veritabanı bağlantısı oluşturur. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Data::Common](../)
* Library [Aspose.Font for C++](../../)
