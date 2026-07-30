---
title: "System::Diagnostics::Stopwatch sınıfı"
linktitle: "Stopwatch"
second_title: "Aspose.Font için C++"
description: "System::Diagnostics::Stopwatch sınıfı. Zaman ölçümüne izin verir. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Her zaman bu sınıfı System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin."
type: docs
weight: 700
url: /tr/cpp/system.diagnostics/stopwatch/
---
## Stopwatch class


Zaman ölçümüne izin verir. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Her zaman bu sınıfı [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class Stopwatch : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Elapsed](./get_elapsed/)() const | Geçerli örnek tarafından ölçülen toplam geçen süreyi alır. |
| [get_ElapsedMilliseconds](./get_elapsedmilliseconds/)() const | Geçerli örnek tarafından ölçülen toplam geçen süreyi milisaniye cinsinden alır. |
| [get_ElapsedTicks](./get_elapsedticks/)() const | Geçerli örnek tarafından ölçülen toplam geçen süreyi zamanlayıcı tikleri cinsinden alır. |
| [get_IsRunning](./get_isrunning/)() const | Kronometrenin çalışıp çalışmadığını kontrol eder. |
| [Reset](./reset/)() | Zaman ölçümünü durdurur, ölçülen aralığı sıfıra ayarlar. |
| [Restart](./restart/)() | Ölçülen aralığı sıfıra ayarlar, ardından zaman ölçümünü başlatır. |
| [Start](./start/)() | Zaman ölçümünü başlatır. |
| static [StartNew](./startnew/)() | Yeni bir [Stopwatch](./) nesnesi oluşturur ve ölçümü başlatır. |
| [Stop](./stop/)() | Zaman ölçümünü durdurur. |
| [Stopwatch](./stopwatch/)() | RTTI bilgisi. |
| virtual [~Stopwatch](./~stopwatch/)() | Yıkıcı. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Font for C++](../../)
