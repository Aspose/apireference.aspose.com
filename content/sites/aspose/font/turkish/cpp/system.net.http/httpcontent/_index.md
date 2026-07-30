---
title: "System::Net::Http::HttpContent class"
linktitle: "HttpContent"
second_title: "Aspose.Font için C++"
description: "System::Net::Http::HttpContent sınıfı. Bir HTTP varlığının içeriğini temsil eder. Bu sınıfın nesnesi yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığıt üzerinde veya operator new kullanarak oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 400
url: /tr/cpp/system.net.http/httpcontent/
---
## HttpContent class


Bir HTTP varlığının içeriğini temsil eder. Bu sınıfın [Object](../../system/object/) nesnesi yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığıt üzerinde veya operator new kullanarak oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class HttpContent : public System::IDisposable
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Dispose](./dispose/)() override | Mevcut örneği serbest bırakır. Bu yöntem ayrıca 'ReadAsStream' tarafından döndürülen akışı ve oluşturulmuşsa bellek tamponunu da serbest bırakır. |
| [get_Headers](./get_headers/)() | HTTP içerik başlıklarını döndürür. |
| [LoadIntoBuffer](./loadintobuffer/)() | İçeriği bir bellek tamponuna serileştirir. |
| [LoadIntoBuffer](./loadintobuffer/)(int64_t) | İçeriği bir bellek tamponuna serileştirir. |
| [ReadAsByteArray](./readasbytearray/)() | İçeriği serileştirir ve bir bayt dizisi döndürür. |
| [ReadAsStream](./readasstream/)() | İçeriği serileştirir ve bir akış döndürür. |
| [ReadAsString](./readasstring/)() | İçeriği serileştirir ve bir dize döndürür. |
| virtual [TryComputeLength](./trycomputelength/)(int64_t\&) | İçerik boyutunu hesaplamaya çalışır. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static [DefaultStringEncoding](./defaultstringencoding/) | Varsayılan kodlama. |
| static [MaxBufferSize](./maxbuffersize/) | Maksimum bayt sayısı. |
## Ayrıca Bakınız

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Font for C++](../../)
