---
title: "System::IO::MemoryStream class"
linktitle: "MemoryStream"
second_title: "Aspose.Font için C++"
description: "System::IO::MemoryStream sınıfı. Bellekten okuyan ve belleğe yazan bir akışı temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak allocate (ayrılmalıdır). Bu tür bir örneği yığıt üzerinde veya operator new kullanarak asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'da fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 1800
url: /tr/cpp/system.io/memorystream/
---
## MemoryStream class


Bellekten okuyan ve belleğe yazan bir akışı temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak allocate (ayrılmalıdır). Bu tür bir örneği yığıt üzerinde veya operator new kullanarak asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class MemoryStream : public System::IO::Stream
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Close](./close/)() override | Akışı kapatır. |
| [Flush](./flush/)() override | Hiçbir şey yapmaz. |
| [get_CanRead](./get_canread/)() const override | Akışın okunabilir olup olmadığını belirler. |
| [get_CanSeek](./get_canseek/)() const override | Akışın konumlandırmayı destekleyip desteklemediğini belirler. |
| [get_CanWrite](./get_canwrite/)() const override | Akışın yazılabilir olup olmadığını belirler. |
| [get_Capacity](./get_capacity/)() | Temel bellek tamponunun mevcut kapasitesini döndürür. |
| [get_Length](./get_length/)() const override | Akışın uzunluğunu bayt cinsinden döndürür. |
| [get_Position](./get_position/)() const override | Akışın mevcut konumunu döndürür. |
| virtual [GetBuffer](./getbuffer/)() | Temel tampon için bir işaretçi döndürür. |
| [MemoryStream](./memorystream/)() | [MemoryStream](./) sınıfının başlangıç kapasitesi 0 olan yeni bir örneğini oluşturur. |
| [MemoryStream](./memorystream/)(int) | Belirtilen boyuttaki bir bellek tamponuna dayalı bir akışı temsil eden [MemoryStream](./) sınıfının yeni bir örneğini oluşturur. |
| [MemoryStream](./memorystream/)(const ArrayPtr\<uint8_t\>\&, bool) | Belirtilen bellek tamponuna bağlı bir bellek akışı temsil eden [MemoryStream](./) sınıfının yeni bir örneğini oluşturur. Bir parametre akışın yazılabilir olup olmadığını belirtir. |
| [MemoryStream](./memorystream/)(const ArrayPtr\<uint8_t\>\&, int, int, bool, bool) | Belirtilen indeksten başlayan ve belirtilen öğe sayısını içeren belirtilen bellek tamponunun bir segmentine bağlı bir bellek akışı temsil eden [MemoryStream](./) sınıfının yeni bir örneğini oluşturur. Parametreler akışın yazılabilir olup olmadığını ve GetBytes() yönteminin çağrılıp çağrılamayacağını belirtir. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Akıştan belirtilen sayıda baytı okur ve bunları belirtilen bayt dizisine yazar. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Akıştan belirtilen sayıda baytı okur ve bunları belirtilen bayt dizisine yazar. |
| [ReadByte](./readbyte/)() override | Akıştan tek bir bayt okur ve okunan baytın değerine eşdeğer 32 bitlik bir tamsayı değeri döndürür. |
| [Seek](./seek/)(int64_t, SeekOrigin) override | Geçerli nesne tarafından temsil edilen akışın konumunu ayarlar. |
| [set_Capacity](./set_capacity/)(int) | Temel bellek tamponunun kapasitesini ayarlar. |
| [set_Position](./set_position/)(int64_t) override | Akışın konumunu ayarlar. |
| [SetLength](./setlength/)(int64_t) override | Geçerli nesne tarafından temsil edilen akışın uzunluğunu ayarlar. |
| virtual [ToArray](./toarray/)() | Temel bellek tamponunun bir kopyasını bayt dizisi olarak döndürür. |
| [TryGetBuffer](./trygetbuffer/)(ArraySegment\<uint8_t\>\&) | Bu akışın oluşturulduğu işaretsiz bayt dizisini döndürür. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Belirtilen bayt dizisinden belirtilen alt aralığı akışa yazar. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Belirtilen bayt dizisinden belirtilen alt aralığı akışa yazar. |
| [WriteByte](./writebyte/)(uint8_t) override | Belirtilen 8 bit işaretsiz tamsayı değerini akışa yazar. |
| virtual [WriteTo](./writeto/)(SharedPtr\<Stream\>) | Temel tamponun içeriğini belirtilen akışa yazar. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static [Null](../stream/null/) | Temel depolama alanı olmayan bir akış. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Kendine bir paylaşımlı işaretçi takma adıdır. |
## Ayrıca Bakınız

* Class [Stream](../stream/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
