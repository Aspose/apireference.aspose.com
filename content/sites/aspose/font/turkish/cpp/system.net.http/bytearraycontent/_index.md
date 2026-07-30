---
title: "System::Net::Http::ByteArrayContent sınıfı"
linktitle: "ByteArrayContent"
second_title: "Aspose.Font için C++"
description: "System::Net::Http::ByteArrayContent sınıfı. HTTP içeriğini bir bayt dizisi olarak temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 100
url: /tr/cpp/system.net.http/bytearraycontent/
---
## ByteArrayContent class


HTTP içeriğini bir bayt dizisi olarak temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class ByteArrayContent : public System::Net::Http::HttpContent
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [ByteArrayContent](./bytearraycontent/)(System::ArrayPtr\<uint8_t\>) | RTTI bilgisi. |
| [ByteArrayContent](./bytearraycontent/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t) | Yeni bir örnek oluşturur. |
| [TryComputeLength](./trycomputelength/)(int64_t\&) override | Bayt dizisi uzunluğunu hesaplamaya çalışır. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static [DefaultStringEncoding](../httpcontent/defaultstringencoding/) | Varsayılan kodlama. |
| static [MaxBufferSize](../httpcontent/maxbuffersize/) | Maksimum bayt sayısı. |
## Ayrıca Bakınız

* Class [HttpContent](../httpcontent/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Font for C++](../../)
