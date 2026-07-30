---
title: "System::Security::Cryptography::CryptoStream sınıfı"
linktitle: "CryptoStream"
second_title: "Aspose.Font için C++"
description: "System::Security::Cryptography::CryptoStream sınıfı. Mevcut akışı bir kriptografik işlevle saran akış uygulaması. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığın üzerinde veya new operatörüyle oluşturulmamalıdır; aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta işlevlere argüman olarak geçirin."
type: docs
weight: 500
url: /tr/cpp/system.security.cryptography/cryptostream/
---
## CryptoStream class


Mevcut akışı bir kriptografik işlevle saran akış uygulaması. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığın üzerinde veya new operatörüyle oluşturulmamalıdır; aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi işlevlere argüman olarak geçirin.

```cpp
class CryptoStream : public System::IO::Stream
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Close](./close/)() override | Bağlantıyı kapatır. |
| [CryptoStream](./cryptostream/)(const SharedPtr\<System::IO::Stream\>\&, const SharedPtr\<ICryptoTransform\>\&, CryptoStreamMode) | Yapıcı. |
| [Flush](./flush/)() override | Arabelleği sarmalanmış akışa boşaltır. Dönüştürme algoritması hâlâ daha fazla veri bekliyor olabileceği için hiçbir şey yapmaz. |
| [FlushFinalBlock](./flushfinalblock/)() | Arabellek içinde hâlâ bulunan verileri akışa yazar. |
| [get_CanRead](./get_canread/)() const override | Akışın okunabilir olup olmadığını kontrol eder. |
| [get_CanSeek](./get_canseek/)() const override | Akışın konumlandırılabilir olup olmadığını kontrol eder. |
| [get_CanWrite](./get_canwrite/)() const override | Akışın yazılabilir olup olmadığını kontrol eder. |
| [get_Length](./get_length/)() const override | Akışın uzunluğunu alır. Desteklenmiyor. |
| [get_Position](./get_position/)() const override | Akıştaki mevcut konumu alır. Desteklenmiyor. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Akıştan veri okur. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Akıştan veri okur. |
| [Seek](./seek/)(int64_t, IO::SeekOrigin) override | Akışta konum arar. Desteklenmiyor. |
| [set_Position](./set_position/)(int64_t) override | Akışta konum arar. Desteklenmiyor. |
| [SetLength](./setlength/)(int64_t) override | Akışın boyutunu arar. Desteklenmiyor. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Verileri akışa yazar. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Verileri akışa yazar. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static [Null](../../system.io/stream/null/) | Temel depolama alanı olmayan bir akış. |
## Ayrıca Bakınız

* Class [Stream](../../system.io/stream/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
