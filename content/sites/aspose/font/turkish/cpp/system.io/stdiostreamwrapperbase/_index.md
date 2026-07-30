---
title: "System::IO::STDIOStreamWrapperBase sınıfı"
linktitle: "STDIOStreamWrapperBase"
second_title: "Aspose.Font için C++"
description: "System::IO::STDIOStreamWrapperBase sınıfı. System.IO.Stream benzeri sarmalayıcılar için temel bir sınıfı temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak allocate edilmelidir. Bu tipin örneğini yığına (stack) veya operator new kullanarak oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirin."
type: docs
weight: 2000
url: /tr/cpp/system.io/stdiostreamwrapperbase/
---
## STDIOStreamWrapperBase class


[System.IO.Stream](../stream/)-benzeri sarmalayıcılar için temel bir sınıfı temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak allocate edilmelidir. Bu tipin örneğini yığına (stack) veya operator new kullanarak oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
template<typename T,typename>class STDIOStreamWrapperBase : public System::IO::Stream
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_CanRead](./get_canread/)() const override | Akışın okuma desteği olup olmadığını belirler. |
| [get_CanSeek](./get_canseek/)() const override | Akışın konumlandırmayı destekleyip desteklemediğini belirler. |
| [get_CanWrite](./get_canwrite/)() const override | Akışın yazma desteği olup olmadığını belirler. |
| [get_Length](./get_length/)() const override | Akışın uzunluğunu döndürür. |
| [get_Position](./get_position/)() const override | Akışın mevcut konumunu döndürür. |
| [operator=](./operator=/)(const STDIOStreamWrapperBase\&) | Kopya atama operatörü. Silindi. |
| [Seek](./seek/)(int64_t, SeekOrigin) override | Geçerli nesne tarafından temsil edilen akışın konumunu ayarlar. |
| [set_Position](./set_position/)(int64_t) override | Akışın konumunu ayarlar. |
| [STDIOStreamWrapperBase](./stdiostreamwrapperbase/)(const STDIOStreamWrapperBase\&) | Kopya yapıcı. Silindi. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static [Null](../stream/null/) | Temel depolama alanı olmayan bir akış. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [BaseType](./basetype/) |  |
| [char_type](./char_type/) | RTTI bilgisi. |
| [int_type](./int_type/) |  |
| [off_type](./off_type/) |  |
| [pos_type](./pos_type/) |  |
| [ThisType](./thistype/) |  |
| [ThisTypeBaseTypesInfo](./thistypebasetypesinfo/) |  |
| [traits_type](./traits_type/) |  |
## Ayrıca Bakınız

* Class [Stream](../stream/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
