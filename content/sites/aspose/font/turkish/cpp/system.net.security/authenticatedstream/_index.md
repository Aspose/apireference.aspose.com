---
title: "System::Net::Security::AuthenticatedStream class"
linktitle: "AuthenticatedStream"
second_title: "Aspose.Font için C++"
description: "System::Net::Security::AuthenticatedStream sınıfı. Bir akış üzerinden kimlik bilgilerini iletmek için yöntemleri içerir. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak allocate (ayrılmalıdır). Bu tipin örneğini yığına (stack) veya operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'da fonksiyonlara argüman olarak geçirin."
type: docs
weight: 100
url: /tr/cpp/system.net.security/authenticatedstream/
---
## AuthenticatedStream class


Bir akış üzerinden kimlik bilgilerini iletmek için yöntemleri içerir. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak allocate edilmelidir. Bu tipin örneğini yığına (stack) veya operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class AuthenticatedStream : public System::IO::Stream
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [get_IsAuthenticated](./get_isauthenticated/)() const | Kimlik doğrulamanın başarılı bir şekilde geçip geçmediğini gösteren bir değer döndürür. |
| virtual [get_IsEncrypted](./get_isencrypted/)() const | Bu akış kullanılarak gönderilen verinin şifrelenip şifrelenmediğini gösteren bir değer döndürür. |
| virtual [get_IsMutuallyAuthenticated](./get_ismutuallyauthenticated/)() const | Bir sunucu ve bir istemcinin kimlik doğrulamasının yapılıp yapılmadığını gösteren bir değer döndürür. |
| virtual [get_IsServer](./get_isserver/)() const | Bağlantının yerel tarafının sunucu olup olmadığını gösteren bir değer döndürür. |
| virtual [get_IsSigned](./get_issigned/)() const | Bu akış kullanılarak gönderilen verinin imzalı olup olmadığını gösteren bir değer döndürür. |
| [get_LeaveInnerStreamOpen](./get_leaveinnerstreamopen/)() const | RTTI bilgisi. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static [Null](../../system.io/stream/null/) | Temel depolama alanı olmayan bir akış. |
## Ayrıca Bakınız

* Class [Stream](../../system.io/stream/)
* Namespace [System::Net::Security](../)
* Library [Aspose.Font for C++](../../)
