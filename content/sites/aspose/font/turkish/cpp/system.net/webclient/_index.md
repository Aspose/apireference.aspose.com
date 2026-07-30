---
title: "System::Net::WebClient sınıfı"
linktitle: "WebClient"
second_title: "Aspose.Font için C++"
description: "System::Net::WebClient sınıfı. WebClient, veri gönderme ve alma için ortak yöntemler sağlar. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'de fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 3500
url: /tr/cpp/system.net/webclient/
---
## WebClient class


[WebClient](./) provides common methods for sending and receiving data. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class WebClient : public System::ComponentModel::Component
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [DownloadData](./downloaddata/)(const String\&) const | Belirtilen kaynağı bayt dizisi olarak indirir. |
| [DownloadData](./downloaddata/)(const SharedPtr\<Uri\>\&) const | Belirtilen kaynağı bayt dizisi olarak indirir. |
| [DownloadString](./downloadstring/)(const String\&) const | Belirtilen kaynağı dize olarak indirir. |
| [DownloadString](./downloadstring/)(const SharedPtr\<Uri\>\&) const | Belirtilen kaynağı dize olarak indirir. |
| [get_Encoding](./get_encoding/)() const | Dizeleri indirmek veya yüklemek için kullanılan kodlamayı alır. |
| [set_Encoding](./set_encoding/)(const SharedPtr\<Text::Encoding\>\&) | Dizeleri indirmek veya yüklemek için kullanılan kodlamayı ayarlar. |
| [set_UseDefaultCredentials](./set_usedefaultcredentials/)(bool) | UYGULANMADI. |
| [WebClient](./webclient/)() | RTTI bilgisi. |
| [~WebClient](./~webclient/)() | Geçerli örneği yok eder. |
## Ayrıca Bakınız

* Class [Component](../../system.componentmodel/component/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
