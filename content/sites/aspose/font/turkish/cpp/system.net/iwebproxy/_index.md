---
title: "System::Net::IWebProxy sınıfı"
linktitle: "IWebProxy"
second_title: "Aspose.Font için C++"
description: "System::Net::IWebProxy sınıfı. Bu arayüz, proxy erişiminin WebRequest sınıfına uygulanması için kullanılır. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığıt üzerinde veya new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 2700
url: /tr/cpp/system.net/iwebproxy/
---
## IWebProxy class


Bu arayüz, proxy erişiminin [WebRequest](../webrequest/) sınıfına uygulanması için kullanılır. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığıt üzerinde veya new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class IWebProxy : public virtual System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [get_Credentials](./get_credentials/)() | RTTI bilgisi. |
| virtual [GetProxy](./getproxy/)(System::SharedPtr\<Uri\>) | Proxy URI'sini döndürür. |
| virtual [IsBypassed](./isbypassed/)(System::SharedPtr\<Uri\>) | Belirtilen ana bilgisayar için proxy'nin kullanılmaması gerektiğini gösteren bir değer döndürür. |
| virtual [set_Credentials](./set_credentials/)(System::SharedPtr\<ICredentials\>) | Proxy sunucusunda kimlik doğrulama için kimlik bilgilerini ayarlar. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
