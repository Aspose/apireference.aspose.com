---
title: "System::Security::Cryptography::HashAlgorithm sınıfı"
linktitle: "HashAlgorithm"
second_title: "Aspose.Page için C++"
description: "System::Security::Cryptography::HashAlgorithm sınıfı. Hash algoritmaları için temel sınıf. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek yığıt üzerinde veya new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirin."
type: docs
weight: 1600
url: /tr/cpp/system.security.cryptography/hashalgorithm/
---
## HashAlgorithm class


Base class for hashing algorithms. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

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
| virtual [get_Hash](./get_hash/)() | Hesaplanan karma kodunun değerini alır. |
| virtual [get_HashSize](./get_hashsize/)() | Hesaplanan karma değerinin bayt cinsinden boyutunu alır. |
| [get_InputBlockSize](./get_inputblocksize/)() override | Girdi blok boyutu. |
| [get_OutputBlockSize](./get_outputblocksize/)() override | Çıktı blok boyutu. |
| virtual [Initialize](./initialize/)() | Hasher'ı başlangıç durumuna sıfırlar. |
| [TransformBlock](./transformblock/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<uint8_t\>, int) override | Veri bloğunu işler ve veriyi çıktı dizisine kopyalar. |
| [TransformFinalBlock](./transformfinalblock/)(ArrayPtr\<uint8_t\>, int, int) override | Verinin son bloğunu işler ve karmayı hesaplar. |
| virtual [~HashAlgorithm](./~hashalgorithm/)() | Yıkıcı. |
## Ayrıca Bakınız

* Class [ICryptoTransform](../icryptotransform/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
