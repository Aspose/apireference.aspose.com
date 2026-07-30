---
title: "System::IO::BufferedStream sınıfı"
linktitle: "BufferedStream"
second_title: "Aspose.Font için C++"
description: "System::IO::BufferedStream sınıfı. Başka bir akışın üzerine bir tamponlama katmanı ekler. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da new operatörüyle oluşturmaktan kaçının; bu, çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 1000
url: /tr/cpp/system.io/bufferedstream/
---
## BufferedStream class


Başka bir akışın üzerine bir tamponlama katmanı ekler. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da new operatörüyle oluşturmaktan kaçının; bu, çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class BufferedStream : public System::IO::Stream
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [BufferedStream](./bufferedstream/)(const SharedPtr\<Stream\>\&) | Belirtilen akışı saran ve 4096 bayt uzunluğunda bir tampon kullanan bir [BufferedStream](./) nesnesi oluşturur. |
| [BufferedStream](./bufferedstream/)(const SharedPtr\<Stream\>\&, int) | Belirtilen akışı saran ve belirtilen boyutta bir tampon kullanan bir [BufferedStream](./) nesnesi oluşturur. |
| [Flush](./flush/)() override | Tamponun içeriğini temel akışa yazar. |
| [get_CanRead](./get_canread/)() const override | Akışın okunabilir olup olmadığını belirler. |
| [get_CanSeek](./get_canseek/)() const override | Akışın konumlandırmayı destekleyip desteklemediğini belirler. |
| [get_CanWrite](./get_canwrite/)() const override | Akışın yazılabilir olup olmadığını belirler. |
| [get_Length](./get_length/)() const override | Akışın uzunluğunu döndürür. |
| [get_Position](./get_position/)() const override | Akışın mevcut konumunu döndürür. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Temel akıştan belirtilen sayıda baytı okur ve bunları belirtilen bayt dizisine yazar. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Temel akıştan belirtilen sayıda baytı okur ve bunları belirtilen bayt dizisine yazar. |
| [ReadByte](./readbyte/)() override | Temel akıştan tek bir bayt okur ve okunan baytın değerine eşdeğer 32 bitlik bir tamsayı değeri döndürür. |
| [Seek](./seek/)(int64_t, SeekOrigin) override | Geçerli nesne tarafından temsil edilen akışın konumunu ayarlar. |
| [set_Position](./set_position/)(int64_t) override | Tamponu temel akışa boşaltır ve ardından akışın konumunu ayarlar. |
| [SetLength](./setlength/)(int64_t) override | Geçerli nesne tarafından temsil edilen akışın uzunluğunu ayarlar. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Belirtilen bayt dizisinden belirtilen bayt alt aralığını temel akışa yazar. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Belirtilen bayt dizisinden belirtilen bayt alt aralığını temel akışa yazar. |
| [WriteByte](./writebyte/)(uint8_t) override | Belirtilen işaretsiz 8 bitlik tamsayı değerini temel akışa yazar. |
| virtual [~BufferedStream](./~bufferedstream/)() | Yıkıcı. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static [Null](../stream/null/) | Temel depolama alanı olmayan bir akış. |
## Ayrıca Bakınız

* Class [Stream](../stream/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
