---
title: "System::Security::Cryptography::HashAlgorithm sınıfı"
linktitle: "HashAlgorithm"
second_title: "Aspose.Font için C++"
description: "System::Security::Cryptography::HashAlgorithm sınıfı. Karma algoritmaları için temel sınıf. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirin."
type: docs
weight: 1600
url: /tr/cpp/system.security.cryptography/hashalgorithm/
---
## HashAlgorithm class


Karma algoritmaları için temel sınıf. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class HashAlgorithm : public System::Security::Cryptography::ICryptoTransform
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [ComputeHash](./computehash/)(const ArrayPtr\<uint8_t\>\&) | Tamponu hash'ler. |
| [ComputeHash](./computehash/)(const ArrayPtr\<uint8_t\>\&, int, int) | Tampon dilimini hash'ler. |
| [ComputeHash](./computehash/)(SharedPtr\<IO::Stream\> const\&) | Akışı sonuna kadar okur ve okunan veri için hash hesaplar. |
| static [Create](./create/)(const String\&) | İsme göre hash algoritması oluşturur. |
| virtual [get_Hash](./get_hash/)() | Hesaplanan hash kodunun değerini alır. |
| virtual [get_HashSize](./get_hashsize/)() | Hesaplanan hash değerinin boyutunu bayt olarak alır. |
| [get_InputBlockSize](./get_inputblocksize/)() override | Giriş blok boyutu. |
| [get_OutputBlockSize](./get_outputblocksize/)() override | Çıkış blok boyutu. |
| virtual [Initialize](./initialize/)() | Hashleyiciyi başlangıç durumuna sıfırlar. |
| [TransformBlock](./transformblock/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<uint8_t\>, int) override | Veri bloğunu işler ve veriyi çıkış dizisine kopyalar. |
| [TransformFinalBlock](./transformfinalblock/)(ArrayPtr\<uint8_t\>, int, int) override | Verinin son bloğunu işler ve hash hesaplar. |
| virtual [~HashAlgorithm](./~hashalgorithm/)() | Yıkıcı. |
## Ayrıca Bakınız

* Class [ICryptoTransform](../icryptotransform/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
