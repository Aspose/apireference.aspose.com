---
title: "System::Security::Cryptography::ToBase64Transform sınıfı"
linktitle: "ToBase64Transform"
second_title: "Aspose.Font için C++"
description: "System::Security::Cryptography::ToBase64Transform sınıfı. CryptoStream sınıfı örneğini base 64'e dönüştürür. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 5000
url: /tr/cpp/system.security.cryptography/tobase64transform/
---
## ToBase64Transform class


Converts the [CryptoStream](../cryptostream/) sınıfı örneğini base 64'e dönüştürür. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class ToBase64Transform : public System::Security::Cryptography::ICryptoTransform
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Clear](./clear/)() | Tüm kaynakları serbest bırakır. |
| [Dispose](./dispose/)() | Mevcut nesne tarafından edinilen işletim sistemi kaynaklarını serbest bırakır. |
| virtual [get_CanReuseTransform](./get_canreusetransform/)() | Geçerli dönüşümün yeniden kullanılabilir olup olmadığını gösteren bir değer alır. |
| [get_CanTransformMultipleBlocks](./get_cantransformmultipleblocks/)() | Birden fazla bloğun dönüştürülebilir olup olmadığını gösteren bir değer alır. |
| virtual [get_InputBlockSize](./get_inputblocksize/)() | Giriş blok boyutu. |
| virtual [get_OutputBlockSize](./get_outputblocksize/)() | Çıkış blok boyutu. |
| [TransformBlock](./transformblock/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, System::ArrayPtr\<uint8_t\>, int32_t) | Veri bloğunu işler ve veriyi çıkış dizisine kopyalar. |
| [TransformFinalBlock](./transformfinalblock/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t) | Verinin son bloğunu işler ve çıktı değerini hesaplar. |
| virtual [~ToBase64Transform](./~tobase64transform/)() | Yıkıcı. |
## Ayrıca Bakınız

* Class [ICryptoTransform](../icryptotransform/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
