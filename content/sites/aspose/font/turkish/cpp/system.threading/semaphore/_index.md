---
title: "System::Threading::Semaphore sınıfı"
linktitle: "Semafor"
second_title: "Aspose.Font için C++"
description: "System::Threading::Semaphore sınıfı. Semaphore uygulaması. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu türün örneğini yığına (stack) ya da operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'da fonksiyonlara argüman olarak geçirin."
type: docs
weight: 1000
url: /tr/cpp/system.threading/semaphore/
---
## Semaphore class


[Semaphore](./) implementation. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Semaphore : public System::Threading::WaitHandle
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Release](./release/)() | Semafor üzerindeki kilidi serbest bırakır. |
| [Release](./release/)(int) | Semafor üzerindeki birden fazla kilidi serbest bırakır. |
| virtual [Reset](./reset/)() | Semaforu sinyalleri olmayan duruma ayarlar. Desteklenmez. |
| [Semaphore](./semaphore/)(int, int) | RTTI bilgisi. |
| [Semaphore](./semaphore/)(int, int, const String\&) | Adlandırılmış semafor oluşturur. |
| [Semaphore](./semaphore/)(int, int, const String\&, bool\&) | Adlandırılmış semafor oluşturur. |
| virtual [Set](./set/)() | Semaforu sinyalleri olan duruma ayarlar. Desteklenmez. |
| [WaitOne](./waitone/)() override | Semaforu kilitler. Gerekirse sınırsız bekleme yapar. |
| [WaitOne](./waitone/)(int) override | Semaforu kilitler. Gerekirse bekleme yapar. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static [WaitTimeout](../waithandle/waittimeout/) | Fonksiyon tarafından döndürülecek özel değer, aksi takdirde zaman aşımı geçerse ve hiçbir şey sinyal göndermezse, dizideki sinyalleri olan nesnenin indeksini döndürür. |
## Ayrıca Bakınız

* Class [WaitHandle](../waithandle/)
* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
