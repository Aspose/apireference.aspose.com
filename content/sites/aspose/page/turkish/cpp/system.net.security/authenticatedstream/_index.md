---
title: "System::Net::Security::AuthenticatedStream sınıf"
linktitle: "AuthenticatedStream"
second_title: "Aspose.Page için C++"
description: "System::Net::Security::AuthenticatedStream sınıfı. Bir akış üzerinden kimlik bilgilerini iletmek için yöntemleri içerir. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta işlevlere argüman olarak geçirmek için kullanın."
type: docs
weight: 100
url: /tr/cpp/system.net.security/authenticatedstream/
---
## AuthenticatedStream class


Bir akış üzerinden kimlik bilgilerini iletmek için yöntemleri içerir. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi işlevlere argüman olarak geçirmek için kullanın.

```cpp
class AuthenticatedStream : public System::IO::Stream
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [get_IsAuthenticated](./get_isauthenticated/)() const | Kimliğin başarıyla geçilip geçilmediğini gösteren bir değer döndürür. |
| virtual [get_IsEncrypted](./get_isencrypted/)() const | Bu akış kullanılarak gönderilen verinin şifrelenip şifrelenmediğini gösteren bir değer döndürür. |
| virtual [get_IsMutuallyAuthenticated](./get_ismutuallyauthenticated/)() const | Bir sunucu ve istemcinin kimlik doğrulaması yapılıp yapılmadığını gösteren bir değer döndürür. |
| virtual [get_IsServer](./get_isserver/)() const | Bağlantının yerel tarafının sunucu olup olmadığını gösteren bir değer döndürür. |
| virtual [get_IsSigned](./get_issigned/)() const | Bu akış kullanılarak gönderilen verinin imzalanıp imzalanmadığını gösteren bir değer döndürür. |
| [get_LeaveInnerStreamOpen](./get_leaveinnerstreamopen/)() const | RTTI bilgisi. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static [Null](../../system.io/stream/null/) | Altta yatan bir depolama alanı olmayan bir akış. |
## Ayrıca Bakınız

* Class [Stream](../../system.io/stream/)
* Namespace [System::Net::Security](../)
* Library [Aspose.Page for C++](../../)
