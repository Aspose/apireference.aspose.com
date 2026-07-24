---
title: "System::Diagnostics::Stopwatch sınıfı"
linktitle: "Stopwatch"
second_title: "Aspose.Page için C++"
description: "System::Diagnostics::Stopwatch sınıfı. Zaman ölçümüne izin verir. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin bir örneğini yığına (stack) ya da operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 700
url: /tr/cpp/system.diagnostics/stopwatch/
---
## Stopwatch class


Zaman ölçümüne izin verir. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin bir örneğini yığına (stack) ya da operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class Stopwatch : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Elapsed](./get_elapsed/)() const | Mevcut örnek tarafından ölçülen toplam geçen süreyi alır. |
| [get_ElapsedMilliseconds](./get_elapsedmilliseconds/)() const | Mevcut örnek tarafından ölçülen toplam geçen süreyi milisaniye cinsinden alır. |
| [get_ElapsedTicks](./get_elapsedticks/)() const | Mevcut örnek tarafından ölçülen toplam geçen süreyi zamanlayıcı tikleri cinsinden alır. |
| [get_IsRunning](./get_isrunning/)() const | Stopwatch'ın çalışıp çalışmadığını kontrol eder. |
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
* Library [Aspose.Page for C++](../../)
