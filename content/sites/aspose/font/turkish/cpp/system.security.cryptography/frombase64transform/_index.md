---
title: "System::Security::Cryptography::FromBase64Transform class"
linktitle: "FromBase64Transform"
second_title: "Aspose.Font için C++"
description: "System::Security::Cryptography::FromBase64Transform sınıfı. CryptoStream sınıfı örneğini base 64'ten dönüştürür. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da operator new kullanarak oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 1500
url: /tr/cpp/system.security.cryptography/frombase64transform/
---
## FromBase64Transform class


Base 64'ten [CryptoStream](../cryptostream/) sınıfı örneğini dönüştürür. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da operator new kullanarak oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class FromBase64Transform : public System::Security::Cryptography::ICryptoTransform
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Clear](./clear/)() | Tüm kaynakları serbest bırakır. |
| [Dispose](./dispose/)() | Mevcut nesne tarafından edinilen işletim sistemi kaynaklarını serbest bırakır. |
| [FromBase64Transform](./frombase64transform/)() | Yapıcı. |
| [FromBase64Transform](./frombase64transform/)(FromBase64TransformMode) | Yapıcı. |
| virtual [get_CanReuseTransform](./get_canreusetransform/)() | Geçerli dönüşümün yeniden kullanılabilir olup olmadığını gösteren bir değer alır. |
| [get_CanTransformMultipleBlocks](./get_cantransformmultipleblocks/)() | Birden fazla bloğun dönüştürülebilir olup olmadığını gösteren bir değer alır. |
| virtual [get_InputBlockSize](./get_inputblocksize/)() | Giriş blok boyutu. |
| virtual [get_OutputBlockSize](./get_outputblocksize/)() | Çıkış blok boyutu. |
| [TransformBlock](./transformblock/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, System::ArrayPtr\<uint8_t\>, int32_t) |  |
| [TransformFinalBlock](./transformfinalblock/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t) |  |
| virtual [~FromBase64Transform](./~frombase64transform/)() | Yıkıcı. |
## Ayrıca Bakınız

* Class [ICryptoTransform](../icryptotransform/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
