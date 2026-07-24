---
title: "System::IO::Stream sınıfı"
linktitle: "Stream"
second_title: "Aspose.Page için C++"
description: "System::IO::Stream sınıfı. Çeşitli akış uygulamaları için temel bir sınıftır. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığıt üzerinde veya operator new kullanılarak oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 2100
url: /tr/cpp/system.io/stream/
---
## Stream class


Çeşitli akış uygulamaları için temel bir sınıftır. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığıt üzerinde veya operator new kullanılarak oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class Stream : public System::IDisposable
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [BeginRead](./beginread/)(System::ArrayPtr\<uint8_t\>, int, int, System::AsyncCallback, System::SharedPtr\<System::Object\>) | Asenkron bir okuma işlemi başlatır. |
| virtual [BeginWrite](./beginwrite/)(System::ArrayPtr\<uint8_t\>, int, int, System::AsyncCallback, System::SharedPtr\<System::Object\>) | Asenkron bir yazma işlemi başlatır. |
| virtual [Close](./close/)() | Akışı kapatır. |
| [CopyTo](./copyto/)(const SharedPtr\<Stream\>\&) | Baytları belirtilen akışa kopyalar. |
| [CopyTo](./copyto/)(const SharedPtr\<Stream\>\&, int32_t) | Belirtilen tampon boyutunu kullanarak baytları belirtilen akışa kopyalar. |
| [Dispose](./dispose/)() override | Mevcut nesne tarafından kullanılan tüm kaynakları serbest bırakır ve akışı kapatır. |
| virtual [EndRead](./endread/)(System::SharedPtr\<System::IAsyncResult\>) | Belirtilen asenkron okuma işlemi tamamlanana kadar bekler. |
| virtual [EndWrite](./endwrite/)(System::SharedPtr\<System::IAsyncResult\>) | Asenkron bir yazma işlemini sonlandırır. Belirtilen asenkron yazma işlemi tamamlanana kadar bekler. |
| virtual [Flush](./flush/)() | Bu akışın tamponlarını temizler ve tüm tamponlanmış verileri temel depolamaya yazar. |
| virtual [FlushAsync](./flushasync/)(const Threading::CancellationToken\&) | Bu akış için tüm tamponları asenkron olarak temizler, tamponlanmış verilerin temel cihaza yazılmasını sağlar ve iptal isteklerini izler. |
| [FlushAsync](./flushasync/)() | Bu akış için tüm tamponları asenkron olarak temizler, tamponlanmış verilerin temel cihaza yazılmasını sağlar ve iptal isteklerini izler. |
| virtual [get_CanRead](./get_canread/)() const | Akışın okunabilir olup olmadığını belirler. |
| virtual [get_CanSeek](./get_canseek/)() const | Akışın konum değiştirmeyi destekleyip desteklemediğini belirler. |
| virtual [get_CanTimeout](./get_cantimeout/)() const | Mevcut akışın zaman aşımına uğrayıp uğrayamayacağını belirleyen bir değer alır. |
| virtual [get_CanWrite](./get_canwrite/)() const | Akışın yazılabilir olup olmadığını belirler. |
| virtual [get_Length](./get_length/)() const | Akışın uzunluğunu bayt cinsinden döndürür. |
| virtual [get_Position](./get_position/)() const | Akışın mevcut konumunu döndürür. |
| virtual [get_ReadTimeout](./get_readtimeout/)() const | Akışın zaman aşımına uğramadan önce ne kadar süre okuma denemesi yapacağını milisaniye cinsinden belirleyen bir değer alır. |
| virtual [get_WriteTimeout](./get_writetimeout/)() const | Akışın zaman aşımına uğramadan önce yazma denemesinin süresini milisaniye cinsinden belirleyen bir değeri alır. |
| virtual [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Akıştan belirtilen sayıda baytı okur ve bunları belirtilen bayt dizisine yazar. |
| virtual [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) | Akıştan belirtilen sayıda baytı okur ve bunları belirtilen bayt dizisine yazar. |
| [Read](./read/)(const System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t) | Akıştan belirtilen sayıda baytı okur ve bunları belirtilen bayt dizisine yazar. |
| virtual [ReadAsync](./readasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) | Geçerli akıştan bir bayt dizisini asenkron olarak okur, akış içindeki konumu okunan bayt sayısı kadar ilerletir ve iptal isteklerini izler. |
| [ReadAsync](./readasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Geçerli akıştan bir bayt dizisini asenkron olarak okur, akış içindeki konumu okunan bayt sayısı kadar ilerletir ve iptal isteklerini izler. |
| virtual [ReadByte](./readbyte/)() | Akıştan tek bir bayt okur ve okunan baytın değerine eşdeğer 32-bit tamsayı değerini döndürür. |
| virtual [Seek](./seek/)(int64_t, SeekOrigin) | Geçerli nesne tarafından temsil edilen akışın konumunu ayarlar. |
| virtual [set_Position](./set_position/)(int64_t) | Akışın konumunu ayarlar. |
| virtual [set_ReadTimeout](./set_readtimeout/)(int) | Geçerli akışın zaman aşımına uğrayıp uğramayacağını belirleyen bir değeri ayarlar. |
| virtual [set_WriteTimeout](./set_writetimeout/)(int) | Akışın zaman aşımına uğramadan önce okuma denemesinin süresini milisaniye cinsinden belirleyen bir değeri ayarlar. |
| virtual [SetLength](./setlength/)(int64_t) | Geçerli nesne tarafından temsil edilen akışın uzunluğunu ayarlar. |
| virtual [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Belirtilen bayt dizisinden belirtilen alt aralığı akışa yazar. |
| virtual [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) | Belirtilen bayt dizisinden belirtilen alt aralığı akışa yazar. |
| [Write](./write/)(const System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t) | Belirtilen bayt dizisinden belirtilen alt aralığı akışa yazar. |
| virtual [WriteAsync](./writeasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) | Geçerli akışa bir bayt dizisini asenkron olarak yazar, bu akıştaki mevcut konumu yazılan bayt sayısı kadar ilerletir ve iptal isteklerini izler. |
| [WriteAsync](./writeasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Geçerli akışa bir bayt dizisini asenkron olarak yazar, bu akıştaki mevcut konumu yazılan bayt sayısı kadar ilerletir ve iptal isteklerini izler. |
| virtual [WriteByte](./writebyte/)(uint8_t) | Belirtilen işaretsiz 8-bit tamsayı değerini akışa yazar. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static [Null](./null/) | Altta yatan bir depolama alanı olmayan bir akış. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfa ait paylaşımlı işaretçi için bir takma addır. |
## Ayrıca Bakınız

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
