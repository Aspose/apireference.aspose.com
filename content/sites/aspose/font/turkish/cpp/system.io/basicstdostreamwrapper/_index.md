---
title: "System::IO::BasicSTDOStreamWrapper sınıfı"
linktitle: "BasicSTDOStreamWrapper"
second_title: "Aspose.Font için C++"
description: "System::IO::BasicSTDOStreamWrapper sınıfı. std::basic_ostream ve türevleri için System.IO.Stream benzeri bir sarmalayıcı temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak tahsis edilmelidir. Yığın üzerinde veya operator new kullanarak bu tipin örneğini asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 300
url: /tr/cpp/system.io/basicstdostreamwrapper/
---
## BasicSTDOStreamWrapper class


std::basic_ostream ve türevleri için [System.IO.Stream](../stream/)-benzeri bir sarmalayıcı temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak tahsis edilmelidir. Yığın üzerinde veya operator new kullanarak bu tipin örneğini asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
template<typename T,typename>class BasicSTDOStreamWrapper : public virtual System::IO::STDIOStreamWrapperBase<T>
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [BasicSTDOStreamWrapper](./basicstdostreamwrapper/)(std::basic_ostream\<char_type, traits_type\>\&, STDIOStreamWrappingMode) | Yeni bir [BasicSTDOStreamWrapper](./) örneği oluşturur. |
| [BasicSTDOStreamWrapper](./basicstdostreamwrapper/)(const BasicSTDOStreamWrapper\&) | Kopya yapıcı. Silindi. |
| [Flush](./flush/)() override | Bu akışın tamponlarını temizler ve tüm tamponlanmış verileri temel depolamaya yazar. |
| [operator=](./operator=/)(const BasicSTDOStreamWrapper\&) | Kopya atama operatörü. Silindi. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Eğer sarmalama modu ikili ise, akıştan belirtilen sayıda baytı okur, aksi takdirde belirtilen sayıda karakteri okur ve bunları uint8_t tipine dönüştürür. Okumanın sonucunu belirtilen bayt dizisine yazar. Desteklenmiyor! |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Akıştan belirtilen sayıda baytı okur ve bunları belirtilen bayt dizisine yazar. |
| [ReadByte](./readbyte/)() override | Eğer sarmalama modu ikili ise, son çözülen karakter deposundan tek bir bayt okur, aksi takdirde akıştan tek bir karakter okur ve onu uint8_t tipine dönüştürür. Desteklenmiyor! |
| [SetLength](./setlength/)(int64_t) override | Geçerli nesne tarafından temsil edilen akışın uzunluğunu ayarlar. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Eğer sarmalama modu ikili ise, belirtilen bayt dizisinden belirtilen alt aralığı akışa yazar, aksi takdirde belirtilen bayt dizisinden belirtilen alt aralığı [char_type](./char_type/) tipine dönüştürür ve ardından sonucu akışa yazar. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Belirtilen bayt dizisinden belirtilen alt aralığı akışa yazar. |
| [WriteByte](./writebyte/)(uint8_t) override | Eğer sarmalama modu ikili ise, belirtilen 8 bit işaretsiz tamsayı değerini akışa yazar, aksi takdirde onu [char_type](./char_type/) tipine dönüştürür ve ardından sonucu akışa yazar. |
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
