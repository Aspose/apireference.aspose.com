---
title: "System::Net::Security::SslStream sınıfı"
linktitle: "SslStream"
second_title: "Aspose.Page için C++"
description: "System::Net::Security::SslStream sınıfı. Sunucuyu ve isteğe bağlı olarak istemciyi kimlik doğrulamak için SSL protokolünü kullanan bir akış C++'ta."
type: docs
weight: 200
url: /tr/cpp/system.net.security/sslstream/
---
## SslStream class


Sunucuyu ve isteğe bağlı olarak istemciyi kimlik doğrulamak için SSL protokolünü kullanan bir akış.

```cpp
class SslStream : public System::Net::Security::AuthenticatedStream
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [AuthenticateAsClient](./authenticateasclient/)(String) | Bağlantının istemci tarafını kimlik doğrular. |
| virtual [AuthenticateAsClient](./authenticateasclient/)(String, System::SharedPtr\<System::Security::Cryptography::X509Certificates::X509CertificateCollection\>, System::Security::Authentication::SslProtocols, bool) | Bağlantının istemci tarafını kimlik doğrular. |
| [BeginRead](./beginread/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, AsyncCallback, System::SharedPtr\<Object\>) override | Asenkron bir okuma işlemi başlatır. |
| [BeginWrite](./beginwrite/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, AsyncCallback, System::SharedPtr\<Object\>) override | Asenkron bir yazma işlemi başlatır. |
| [Close](./close/)() override | Akışı kapatır. |
| [Dispose](./dispose/)(bool) override | Mevcut nesne tarafından kullanılan tüm kaynakları serbest bırakır ve akışı kapatır. |
| [EndRead](./endread/)(System::SharedPtr\<IAsyncResult\>) override | Belirtilen asenkron okuma işlemi tamamlanana kadar bekler. |
| [EndWrite](./endwrite/)(System::SharedPtr\<IAsyncResult\>) override | Asenkron bir yazma işlemini sonlandırır. Belirtilen asenkron yazma işlemi tamamlanana kadar bekler. |
| [Flush](./flush/)() override | Bu akışın tamponlarını temizler ve tüm tamponlanmış verileri temel depolamaya yazar. |
| [get_CanRead](./get_canread/)() const override | Akışın okunabilir olup olmadığını belirler. |
| [get_CanSeek](./get_canseek/)() const override | Akışın konum değiştirmeyi destekleyip desteklemediğini belirler. |
| [get_CanTimeout](./get_cantimeout/)() const override | Mevcut akışın zaman aşımına uğrayıp uğrayamayacağını belirleyen bir değer alır. |
| [get_CanWrite](./get_canwrite/)() const override | Akışın yazılabilir olup olmadığını belirler. |
| virtual [get_CheckCertRevocationStatus](./get_checkcertrevocationstatus/)() | Sertifika doğrulama sürecinde sertifika iptal listesi kontrol edilip edilmediğini gösteren bir değer döndürür. |
| virtual [get_CipherAlgorithm](./get_cipheralgorithm/)() | Şifreleme algoritmasını döndürür. |
| virtual [get_CipherStrength](./get_cipherstrength/)() | Kullanılan şifreleme algoritmasının gücünü döndürür. |
| virtual [get_HashAlgorithm](./get_hashalgorithm/)() | Hash algoritmasını döndürür. |
| virtual [get_HashStrength](./get_hashstrength/)() | Kullanılan hash algoritmasının gücünü döndürür. |
| [get_IsAuthenticated](./get_isauthenticated/)() const override | Kimliğin başarıyla geçilip geçilmediğini gösteren bir değer döndürür. |
| [get_IsEncrypted](./get_isencrypted/)() const override | Bu akış kullanılarak gönderilen verinin şifrelenip şifrelenmediğini gösteren bir değer döndürür. |
| [get_IsMutuallyAuthenticated](./get_ismutuallyauthenticated/)() const override | Bir sunucu ve istemcinin kimlik doğrulaması yapılıp yapılmadığını gösteren bir değer döndürür. |
| [get_IsServer](./get_isserver/)() const override | Bağlantının yerel tarafının sunucu olup olmadığını gösteren bir değer döndürür. |
| [get_IsSigned](./get_issigned/)() const override | Bu akış kullanılarak gönderilen verinin imzalanıp imzalanmadığını gösteren bir değer döndürür. |
| virtual [get_KeyExchangeStrength](./get_keyexchangestrength/)() | Kullanılan anahtar değişim algoritmasının gücünü döndürür. |
| [get_Length](./get_length/)() const override | Akışın uzunluğunu bayt cinsinden döndürür. |
| virtual [get_LocalCertificate](./get_localcertificate/)() | Yerel uç nokta kimlik doğrulaması için kullanılan sertifikayı döndürür. |
| [get_Position](./get_position/)() const override | Akışın mevcut konumunu döndürür. |
| [get_ReadTimeout](./get_readtimeout/)() const override | Akışın zaman aşımına uğramadan önce ne kadar süre okuma denemesi yapacağını milisaniye cinsinden belirleyen bir değer alır. |
| virtual [get_RemoteCertificate](./get_remotecertificate/)() | Uzak uç nokta kimlik doğrulaması için kullanılan sertifikayı döndürür. |
| virtual [get_SslProtocol](./get_sslprotocol/)() | SSL protokolünü döndürür. |
| [get_WriteTimeout](./get_writetimeout/)() const override | Akışın zaman aşımına uğramadan önce yazma denemesinin süresini milisaniye cinsinden belirleyen bir değeri alır. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Akıştan belirtilen sayıda baytı okur ve bunları belirtilen bayt dizisine yazar. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Akıştan belirtilen sayıda baytı okur ve bunları belirtilen bayt dizisine yazar. |
| [Seek](./seek/)(int64_t, IO::SeekOrigin) override | Geçerli nesne tarafından temsil edilen akışın konumunu ayarlar. |
| [set_Position](./set_position/)(int64_t) override | Akışın konumunu ayarlar. |
| [set_ReadTimeout](./set_readtimeout/)(int32_t) override | Geçerli akışın zaman aşımına uğrayıp uğramayacağını belirleyen bir değeri ayarlar. |
| [set_WriteTimeout](./set_writetimeout/)(int32_t) override | Akışın zaman aşımına uğramadan önce okuma denemesinin süresini milisaniye cinsinden belirleyen bir değeri ayarlar. |
| [SetLength](./setlength/)(int64_t) override | Geçerli nesne tarafından temsil edilen akışın uzunluğunu ayarlar. |
| [SslStream](./sslstream/)(System::SharedPtr\<IO::Stream\>) | Yeni bir örnek oluşturur. |
| [SslStream](./sslstream/)(System::SharedPtr\<IO::Stream\>, bool) | Yeni bir örnek oluşturur. |
| [SslStream](./sslstream/)(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback) | Yeni bir örnek oluşturur. |
| [SslStream](./sslstream/)(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback, LocalCertificateSelectionCallback) | Yeni bir örnek oluşturur. |
| [SslStream](./sslstream/)(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback, LocalCertificateSelectionCallback, EncryptionPolicy) | Yeni bir örnek oluşturur. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&) | Belirtilen bayt dizisini akışa yazar. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Belirtilen bayt dizisinden belirtilen alt aralığı akışa yazar. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&) | Belirtilen bayt dizisini akışa yazar. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Belirtilen bayt dizisinden belirtilen alt aralığı akışa yazar. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static [Null](../../system.io/stream/null/) | Altta yatan bir depolama alanı olmayan bir akış. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [AsyncResultType](./asyncresulttype/) | RTTI bilgisi. |
| [StreamImplementationPtr](./streamimplementationptr/) | Uygulamanın işaretçi türü. |
## Ayrıca Bakınız

* Class [AuthenticatedStream](../authenticatedstream/)
* Namespace [System::Net::Security](../)
* Library [Aspose.Page for C++](../../)
