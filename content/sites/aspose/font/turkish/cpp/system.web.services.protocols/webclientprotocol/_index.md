---
title: "System::Web::Services::Protocols::WebClientProtocol sınıfı"
linktitle: "WebClientProtocol"
second_title: "Aspose.Font için C++"
description: "System::Web::Services::Protocols::WebClientProtocol sınıfı. Bu temel sınıf, ASP.NET kullanılarak oluşturulan tüm XML Web hizmet istemci vekillerinde kullanılır. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek hiçbir zaman yığıt üzerinde veya new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta işlevlere argüman olarak geçirmek için kullanın."
type: docs
weight: 1100
url: /tr/cpp/system.web.services.protocols/webclientprotocol/
---
## WebClientProtocol class


Bu temel sınıf, ASP.NET kullanılarak oluşturulan tüm XML [Web](../../system.web/) hizmet istemci vekillerinde kullanılır. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek hiçbir zaman yığıt üzerinde veya new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi işlevlere argüman olarak geçirmek için kullanın.

```cpp
class WebClientProtocol : public virtual System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [Abort](./abort/)() | İsteği iptal eder. |
| [get_ConnectionGroupName](./get_connectiongroupname/)() | Bağlantı grubunun adını alır. |
| [get_Credentials](./get_credentials/)() | Kimlik doğrulama bilgilerini alır. |
| [get_PreAuthenticate](./get_preauthenticate/)() | Ön kimlik doğrulamanın etkin olup olmadığını gösteren bir değeri alır. |
| [get_RequestEncoding](./get_requestencoding/)() | İstemci isteklerini oluşturmak için kullanılan kodlamayı alır. |
| [get_Timeout](./get_timeout/)() | İsteğin zaman aşımına uğramadan önce beklemesi gereken süreyi alır. |
| [get_Uri](./get_uri/)() | XML [Web](../../system.web/) hizmetinin URI'sını alır. |
| [get_Url](./get_url/)() | XML [Web](../../system.web/) hizmetinin URL'sini alır. |
| [get_UseDefaultCredentials](./get_usedefaultcredentials/)() | 'Credential' özelliğinin 'DefaultCredentials' özelliğine eşit olup olmadığını gösteren bir değeri alır. |
| [set_ConnectionGroupName](./set_connectiongroupname/)(String) | Bağlantı grubunun adını ayarlar. |
| [set_Credentials](./set_credentials/)(System::SharedPtr\<Net::ICredentials\>) | Kimlik doğrulama bilgilerini ayarlar. |
| [set_PreAuthenticate](./set_preauthenticate/)(bool) | Ön kimlik doğrulamanın etkin olup olmadığını gösteren bir değeri ayarlar. |
| [set_RequestEncoding](./set_requestencoding/)(System::SharedPtr\<Text::Encoding\>) | İstemci isteklerini oluşturmak için kullanılan kodlamayı ayarlar. |
| [set_Timeout](./set_timeout/)(int32_t) | İsteğin zaman aşımına uğramadan önce beklemesi gereken süreyi ayarlar. |
| [set_Uri](./set_uri/)(System::SharedPtr\<Uri\>) | XML [Web](../../system.web/) hizmetinin URI'sını ayarlar. |
| [set_Url](./set_url/)(String) | XML [Web](../../system.web/) hizmetinin URL'sini ayarlar. |
| [set_UseDefaultCredentials](./set_usedefaultcredentials/)(bool) | 'Credential' özelliğinin 'DefaultCredentials' özelliğine eşit olup olmadığını gösteren bir değeri ayarlar. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Font for C++](../../)
