---
title: "System::Net::Sockets::LingerOption sınıfı"
linktitle: "LingerOption"
second_title: "Aspose.Font için C++"
description: "System::Net::Sockets::LingerOption sınıfı. Bir soketin Close() veya Close() yöntemlerine yapılan bir çağrıdan sonra bağlı kalıp kalmayacağını belirtir. Ayrıca, veri gönderimi devam ederse soketin bağlı kalacağı süreyi belirtir. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığıt (stack) üzerinde veya new operatörü kullanılarak oluşturulmamalıdır; aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 200
url: /tr/cpp/system.net.sockets/lingeroption/
---
## LingerOption class


Bir soketin Close() veya Close() yöntemlerine yapılan bir çağrıdan sonra bağlı kalıp kalmayacağını belirtir. Ayrıca, veri gönderimi devam ederse soketin bağlı kalacağı süreyi belirtir. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığıt (stack) üzerinde veya new operatörü kullanılarak oluşturulmamalıdır; aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class LingerOption : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Enabled](./get_enabled/)() | RTTI bilgisi. |
| [get_LingerTime](./get_lingertime/)() | Saniye cinsinden gecikme zaman aşımını alır. |
| [LingerOption](./lingeroption/)(bool, int32_t) | Yeni bir örnek oluşturur. |
| [set_Enabled](./set_enabled/)(bool) | Soketin, bekleyen tüm verileri göndermeye çalışarak kapanmayı geciktirip geciktirmeyeceğini gösteren bir değeri ayarlar. |
| [set_LingerTime](./set_lingertime/)(int32_t) | Saniye cinsinden gecikme zaman aşımını ayarlar. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Font for C++](../../)
