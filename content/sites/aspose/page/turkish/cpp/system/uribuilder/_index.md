---
title: "System::UriBuilder sınıfı"
linktitle: "UriBuilder"
second_title: "Aspose.Page için C++"
description: "System::UriBuilder sınıfı. Evrensel kaynak tanımlayıcılarını (URI'leri) oluşturmak ve değiştirmek için yöntemler sağlar. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirin."
type: docs
weight: 6800
url: /tr/cpp/system/uribuilder/
---
## UriBuilder class


Evrensel kaynak tanımlayıcılarını (URI'leri) oluşturmak ve değiştirmek için yöntemler sağlar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class UriBuilder : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Scheme](./get_scheme/)() const | Geçerli nesne tarafından oluşturulan URI'nın şemasını döndürür. |
| [get_Uri](./get_uri/)() const | Geçerli nesne tarafından oluşturulan [Uri](../uri/) nesnesini döndürür. |
| [set_Port](./set_port/)(int) | URI'nın port numarasını ayarlar. |
| [set_Scheme](./set_scheme/)(const String\&) | Geçerli nesne tarafından oluşturulan URI'nin şemasını belirtilen değere ayarlar. |
| [ToString](./tostring/)() const override | Geçerli nesne tarafından oluşturulan URI'nin dize temsilini döndürür. |
| [UriBuilder](./uribuilder/)(const String\&) | Belirtilen URI'yi temsil eden bir [UriBuilder](./) nesnesi oluşturur. |
| [UriBuilder](./uribuilder/)(const SharedPtr\<Uri\>\&) | Belirtilen URI'yi temsil eden bir [UriBuilder](./) nesnesi oluşturur. |
## Ayrıca Bakınız

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
