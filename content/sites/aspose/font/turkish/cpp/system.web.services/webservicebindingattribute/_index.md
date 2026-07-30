---
title: "System::Web::Services::WebServiceBindingAttribute sınıfı"
linktitle: "WebServiceBindingAttribute"
second_title: "Aspose.Font için C++"
description: "System::Web::Services::WebServiceBindingAttribute sınıfı. XML Web hizmetinin bir veya daha fazla yöntemini tanımlayan bir bağlamayı bildirmek için kullanılır. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu türün örneğini yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 400
url: /tr/cpp/system.web.services/webservicebindingattribute/
---
## WebServiceBindingAttribute class


XML [Web](../../system.web/) hizmetinin bir veya daha fazla yöntemini tanımlayan bir bağlamayı bildirmek için kullanılır. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türün örneğini yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class WebServiceBindingAttribute : public System::Attribute
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_ConformsTo](./get_conformsto/)() | WSI spesifikasyonunu alır. |
| [get_EmitConformanceClaims](./get_emitconformanceclaims/)() | Bağlamanın uyumluluk iddiaları yayınlayıp yayınlamadığını gösteren bir değeri alır. |
| [get_Location](./get_location/)() | RTTI bilgisi. |
| [get_Name](./get_name/)() | Bağlamanın adını alır. |
| [get_Namespace](./get_namespace/)() | Bağlamayla ilişkili ad alanını alır. |
| [set_ConformsTo](./set_conformsto/)(System::SharedPtr\<WsiProfiles\>) | WSI spesifikasyonunu ayarlar. |
| [set_EmitConformanceClaims](./set_emitconformanceclaims/)(bool) | Bağlamanın uyumluluk iddiaları yayınlayıp yayınlamadığını gösteren bir değeri ayarlar. |
| [set_Location](./set_location/)(String) | Bağlamanın tanımlandığı konumu ayarlar. |
| [set_Name](./set_name/)(String) | Bağlamanın adını ayarlar. |
| [set_Namespace](./set_namespace/)(String) | Bağlamayla ilişkili ad alanını ayarlar. |
| [WebServiceBindingAttribute](./webservicebindingattribute/)() | Yeni bir örnek oluşturur. |
| [WebServiceBindingAttribute](./webservicebindingattribute/)(String) | Yeni bir örnek oluşturur. |
| [WebServiceBindingAttribute](./webservicebindingattribute/)(String, String) | Yeni bir örnek oluşturur. |
| [WebServiceBindingAttribute](./webservicebindingattribute/)(String, String, String) | Yeni bir örnek oluşturur. |
## Ayrıca Bakınız

* Class [Attribute](../../system/attribute/)
* Namespace [System::Web::Services](../)
* Library [Aspose.Font for C++](../../)
