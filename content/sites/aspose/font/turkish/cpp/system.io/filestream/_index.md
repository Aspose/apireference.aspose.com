---
title: "System::IO::FileStream sınıfı"
linktitle: "FileStream"
second_title: "Aspose.Font için C++"
description: "System::IO::FileStream sınıfı. Senkron ve asenkron okuma ve yazma işlemlerini destekleyen bir dosya akışı temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 1500
url: /tr/cpp/system.io/filestream/
---
## FileStream class


Senkrone ve asenkron okuma ve yazma işlemlerini destekleyen bir dosya akışını temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class FileStream : public System::IO::Stream
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Close](./close/)() override | Mevcut [FileStream](./) nesnesini kapatır. |
| [FileStream](./filestream/)(const String\&, FileMode) | Yeni bir [FileStream](./) sınıf örneği oluşturur ve belirtilen parametrelerle başlatır. |
| [FileStream](./filestream/)(const String\&, FileMode, FileAccess, FileShare, int32_t, FileOptions) | Yeni bir [FileStream](./) sınıf örneği oluşturur ve belirtilen parametrelerle başlatır. |
| [FileStream](./filestream/)(const String\&, FileMode, FileAccess, FileShare, int32_t, bool) | Yeni bir [FileStream](./) sınıf örneği oluşturur ve belirtilen parametrelerle başlatır. |
| [FileStream](./filestream/)(const FileStream\&) |  |
| [Flush](./flush/)() override | Bu akışın tamponlarını temizler ve tüm tamponlanmış verileri alttaki dosyaya yazar. |
| [Flush](./flush/)(bool) | Bu akışın tamponlarını temizler ve tüm tamponlanmış verileri alttaki dosyaya yazar. [Flush()](./flush/) yönteminin eş anlamlısıdır. |
| [FlushAsync](./flushasync/)(const Threading::CancellationToken\&) override | Bu akış için tüm tamponları asenkron olarak temizler, tamponlanmış verilerin temel cihaza yazılmasını sağlar ve iptal isteklerini izler. |
| [get_CanRead](./get_canread/)() const override | Akışın okunabilir olup olmadığını belirler. |
| [get_CanSeek](./get_canseek/)() const override | Akışın konumlandırmayı destekleyip desteklemediğini belirler. |
| [get_CanWrite](./get_canwrite/)() const override | Akışın yazılabilir olup olmadığını belirler. |
| [get_Length](./get_length/)() const override | Akışın uzunluğunu bayt cinsinden döndürür. |
| [get_Name](./get_name/)() const | Mevcut [FileStream](./) nesnesi tarafından kapsanan dosyanın adını döndürür. |
| [get_Position](./get_position/)() const override | Akışın mevcut konumunu döndürür. |
| [operator=](./operator=/)(const FileStream\&) |  |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Akıştan belirtilen sayıda baytı okur ve bunları belirtilen bayt dizisine yazar. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Akıştan belirtilen sayıda baytı okur ve bunları belirtilen bayt dizisine yazar. |
| [ReadAsync](./readasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) override | Geçerli akıştan bir bayt dizisini asenkron olarak okur, akış içindeki konumu okunan bayt sayısı kadar ilerletir ve iptal isteklerini izler. |
| [ReadByte](./readbyte/)() override | Akıştan tek bir bayt okur ve okunan baytın değerine eşdeğer 32 bitlik bir tamsayı değeri döndürür. |
| [Seek](./seek/)(int64_t, SeekOrigin) override | Geçerli nesne tarafından temsil edilen akışın konumunu ayarlar. |
| [set_Position](./set_position/)(int64_t) override | Akışı temizler ve ardından akış konumunu ayarlar. |
| [SetLength](./setlength/)(int64_t) override | Geçerli nesne tarafından temsil edilen akışın uzunluğunu ayarlar. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Belirtilen bayt dizisinden belirtilen alt aralığı akışa yazar. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Belirtilen bayt dizisinden belirtilen alt aralığı akışa yazar. |
| [WriteAsync](./writeasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) override | Geçerli akışa bir bayt dizisini asenkron olarak yazar, bu akış içindeki konumu yazılan bayt sayısı kadar ilerletir ve iptal isteklerini izler. |
| [WriteByte](./writebyte/)(uint8_t) override | Belirtilen 8 bit işaretsiz tamsayı değerini akışa yazar. |
| [~FileStream](./~filestream/)() | Yıkıcı. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static constexpr [DefaultBufferSize](./defaultbuffersize/) | Okuma ve yazma işlemleri sırasında tamponlanan bayt sayısının varsayılan değeri. |
| static [Null](../stream/null/) | Temel depolama alanı olmayan bir akış. |
## Ayrıca Bakınız

* Class [Stream](../stream/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
