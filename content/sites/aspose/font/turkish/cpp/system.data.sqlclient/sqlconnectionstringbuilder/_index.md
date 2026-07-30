---
title: "System::Data::SqlClient::SqlConnectionStringBuilder sınıfı"
linktitle: "SqlConnectionStringBuilder"
second_title: "Aspose.Font için C++"
description: "System::Data::SqlClient::SqlConnectionStringBuilder sınıfı. SQL tabanlı bağlantı oluşturucu. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığında veya operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 100
url: /tr/cpp/system.data.sqlclient/sqlconnectionstringbuilder/
---
## SqlConnectionStringBuilder class


SQL tabanlı bağlantı oluşturucu. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığında veya operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class SqlConnectionStringBuilder : public System::Data::Common::DbConnectionStringBuilder
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_DataSource](./get_datasource/)() const | Veri kaynağını alır (örn. ana bilgisayar adı ve bağlantı noktası). |
| [get_Encrypt](./get_encrypt/)() const | Satırda şifrelemenin etkin olup olmadığını denetler. |
| [get_InitialCatalog](./get_initialcatalog/)() const | Bağlantıyla ilişkili veritabanının adını alır. |
| [get_NetworkLibrary](./get_networklibrary/)() const | Kullanılan ağ kütüphanesinin adını alır. |
| [get_Password](./get_password/)() const | Veritabanına bağlanmak için kullanılan şifreyi alır. |
| [get_TrustServerCertificate](./get_trustservercertificate/)() const | Bağlantının güvenilir sunucu sertifikası kullanılarak korunup korunmadığını denetler. |
| [get_UserID](./get_userid/)() const | Bağlantı için kullanılan kullanıcı kimliğini alır. |
| [idx_get](./idx_get/)(String) override | RTTI bilgisi. |
| [idx_set](./idx_set/)(String, Object::ptr) override | Anahtarlı nesneyi ayarlar. |
| [set_DataSource](./set_datasource/)(const String\&) | Veri kaynağını alır (örn. ana bilgisayar adı ve bağlantı noktası). |
| [set_Encrypt](./set_encrypt/)(bool) | Şifrelemeyi açar veya kapatır. |
| [set_InitialCatalog](./set_initialcatalog/)(const String\&) | Bağlantıyla ilişkili veritabanının adını ayarlar. |
| [set_NetworkLibrary](./set_networklibrary/)(const String\&) | Kullanılacak ağ kitaplığını seçer. |
| [set_Password](./set_password/)(const String\&) | Veritabanına bağlanmak için kullanılacak şifreyi ayarlar. |
| [set_TrustServerCertificate](./set_trustservercertificate/)(bool) | Bağlantının güvenilir sunucu sertifikası kullanılarak korunup korunmadığını belirler. |
| [set_UserID](./set_userid/)(const String\&) | Bağlantı için kullanılacak kullanıcı kimliğini ayarlar. |
## Ayrıca Bakınız

* Class [DbConnectionStringBuilder](../../system.data.common/dbconnectionstringbuilder/)
* Namespace [System::Data::SqlClient](../)
* Library [Aspose.Font for C++](../../)
