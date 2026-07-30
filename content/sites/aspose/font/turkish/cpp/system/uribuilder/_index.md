---
title: "System::UriBuilder sınıfı"
linktitle: "UriBuilder"
second_title: "Aspose.Font için C++"
description: "System::UriBuilder sınıfı. Evrensel kaynak tanımlayıcılarını (URIs) oluşturmak ve değiştirmek için yöntemler sağlar. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak allocate (ayrılmalıdır). Bu tipin örneğini yığına (stack) ya da new operatörüyle asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirin."
type: docs
weight: 6800
url: /tr/cpp/system/uribuilder/
---
## UriBuilder class


Evrensel kaynak tanımlayıcılarını (URIs) oluşturmak ve değiştirmek için yöntemler sağlar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../makeobject/) işlevi kullanılarak allocate edilmelidir. Bu tipin örneğini yığına (stack) ya da new operatörüyle asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class UriBuilder : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Scheme](./get_scheme/)() const | Geçerli nesne tarafından oluşturulan URI'nin şemasını döndürür. |
| [get_Uri](./get_uri/)() const | Geçerli nesne tarafından oluşturulan [Uri](../uri/) nesnesini döndürür. |
| [set_Port](./set_port/)(int) | URI'nin bağlantı noktasını ayarlar. |
| [set_Scheme](./set_scheme/)(const String\&) | Geçerli nesne tarafından oluşturulan URI'nin şemasını belirtilen değere ayarlar. |
| [ToString](./tostring/)() const override | Geçerli nesne tarafından oluşturulan URI'nin dize temsilini döndürür. |
| [UriBuilder](./uribuilder/)(const String\&) | Belirtilen URI'yi temsil eden bir [UriBuilder](./) nesnesi oluşturur. |
| [UriBuilder](./uribuilder/)(const SharedPtr\<Uri\>\&) | Belirtilen URI'yi temsil eden bir [UriBuilder](./) nesnesi oluşturur. |
## Ayrıca Bakınız

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
