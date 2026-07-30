---
title: "System::IO::BasicSTDIStreamWrapper sınıfı"
linktitle: "BasicSTDIStreamWrapper"
second_title: "Aspose.Font için C++"
description: "System::IO::BasicSTDIStreamWrapper sınıfı. std::basic_istream ve türetilmiş nesneler için System.IO.Stream benzeri bir sarmalayıcı temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığında veya operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'da fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 200
url: /tr/cpp/system.io/basicstdistreamwrapper/
---
## BasicSTDIStreamWrapper class


Bir [System.IO.Stream](../stream/)-benzeri sarmalayıcıyı std::basic_istream ve türetilmiş nesneler için temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığında veya operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
template<typename T,typename>class BasicSTDIStreamWrapper : public virtual System::IO::STDIOStreamWrapperBase<T>
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [BasicSTDIStreamWrapper](./basicstdistreamwrapper/)(std::basic_istream\<char_type, traits_type\>\&, STDIOStreamWrappingMode) | Yeni bir [BasicSTDIStreamWrapper](./) örneği oluşturur. |
| [BasicSTDIStreamWrapper](./basicstdistreamwrapper/)(const BasicSTDIStreamWrapper\&) | Kopya yapıcı. Silindi. |
| [Flush](./flush/)() override | Bu akışın tamponlarını temizler ve tüm tamponlanmış verileri temel depolamaya yazar. Desteklenmiyor! |
| [operator=](./operator=/)(const BasicSTDIStreamWrapper\&) | Kopya atama operatörü. Silindi. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Eğer sarmalama modu ikili ise, akıştan belirtilen sayıda baytı okur, aksi takdirde belirtilen sayıda karakteri okur ve bunları uint8_t türüne dönüştürür. Okumanın sonucunu belirtilen bayt dizisine yazar. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Akıştan belirtilen sayıda baytı okur ve bunları belirtilen bayt dizisine yazar. |
| [ReadByte](./readbyte/)() override | Eğer sarmalama modu ikili ise, son çözülen karakter deposundan tek bir bayt okur, aksi takdirde akıştan tek bir karakter okur ve onu uint8_t türüne dönüştürür. |
| [SetLength](./setlength/)(int64_t) override | Geçerli nesne tarafından temsil edilen akışın uzunluğunu ayarlar. Desteklenmiyor! |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Eğer sarmalama modu ikili ise, belirtilen bayt dizisinden belirtilen bayt alt aralığını akışa yazar, aksi takdirde belirtilen bayt dizisinden belirtilen bayt alt aralığını [char_type](./char_type/) türüne dönüştürür ve ardından sonucu akışa yazar. Desteklenmiyor! |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Belirtilen bayt dizisinden belirtilen alt aralığı akışa yazar. |
| [WriteByte](./writebyte/)(uint8_t) override | Eğer sarmalama modu ikili ise, belirtilen işaretsiz 8-bit tam sayı değerini akışa yazar, aksi takdirde onu [char_type](./char_type/) türüne dönüştürür ve ardından sonucu akışa yazar. Desteklenmiyor! |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static [Null](../stream/null/) | Temel depolama alanı olmayan bir akış. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [BaseType](./basetype/) |  |
| [char_type](./char_type/) | RTTI bilgisi. |
| [ThisType](./thistype/) |  |
| [ThisTypeBaseTypesInfo](./thistypebasetypesinfo/) |  |
| [traits_type](./traits_type/) |  |
## Ayrıca Bakınız

* Class [STDIOStreamWrapperBase](../stdiostreamwrapperbase/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
